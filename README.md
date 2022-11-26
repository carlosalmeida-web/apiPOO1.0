# Sobre a API

**TomatesPodres** tem como objetivo acessar informações sobre diversos filmes.

Link para a documentação: [https://app.swaggerhub.com/apis-docs/RODRIGOFEITOSARODRIG/apiPOO1.0/1.0.0](https://app.swaggerhub.com/apis-docs/RODRIGOFEITOSARODRIG/apiPOO1.0/1.0.0)

## Pacote entity

- ### **User.java**

 -   Cria a tabela tb_user

- ### **PassWordResetToken.java**
 - Cria tabela password_reset_token
 - Calcula o tempo para a expiração do token com o método calculoDataExpiracao(int tempoExpiração)

- ### **VerificationToken.class**
 - Cria tabela tb_verification

## Pacote repositories

- ### **Interface: UserRepository.java**

 -   -User findByEmail(String email)

- ### **Interface: PasswordResetTokenRepository.java**
 - PasswordResetToken findByToken(String token)

- ### **Interface : VerificatioinTokenRepository.java**
 - VerificationToken findByToken(String token) 

  ## Pacote event

- ### **RegistrationCompleteEvent.java**

 -   Evento para o registro

## Pacote listener

- ### **RegistrationCompleteEventListener.java**

 -  No método onApplicationEvent(RegistrationCompleteEvent event) é criado o token de verificação para o usuário com o link
 - Manda o email para o usuário


## Pacote services

- ### **Interface: UserService.java**

 -   User registerUser(UserModel userModel);

 - void salvarTokenDeVerificacao(String token, User user);

 - String validandoTokenDeVerificacao(String token);

 - VerificationToken gerandoNovoTokenDeVerificacao(String oldtoken);

 - User findUserByEmail(String email);

 - void criandoSenhaResetTokenParaUsuario(User user, String token);

 - String validandoNovaSenhaToken(String token);

 - Optional<User> getUserByPasswordToken(String token);

 - void changePassword(User user, String novaSenha);

 - boolean verificandoSenhaAntiga(User user, String senhaAntiga);

- ### **Interface: EmailService.java**
 - void send(String to, String email);

- ### **UserServiceImpl.java**
 - Implementa a interface UserService
- ### **EmailService.java**
 - Implementa a interface EmailSender
