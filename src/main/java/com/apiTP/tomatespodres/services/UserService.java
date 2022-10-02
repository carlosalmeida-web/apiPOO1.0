package com.apiTP.tomatespodres.services;

import com.apiTP.tomatespodres.entity.User;
import com.apiTP.tomatespodres.entity.VerificationToken;
import com.apiTP.tomatespodres.models.UserModel;

import java.util.Optional;

public interface UserService {
    User registerUser(UserModel userModel);

    void salvarTokenDeVerificacao(String token, User user);

    String validandoTokenDeVerificacao(String token);

    VerificationToken gerandoNovoTokenDeVerificacao(String oldtoken);

    User findUserByEmail(String email);

    void criandoSenhaResetTokenParaUsuario(User user, String token);

    String validandoNovaSenhaToken(String token);

    Optional<User> getUserByPasswordToken(String token);

    void changePassword(User user, String novaSenha);
}
