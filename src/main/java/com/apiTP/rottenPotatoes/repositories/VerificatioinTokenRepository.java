package com.apiTP.rottenPotatoes.repositories;

import com.apiTP.rottenPotatoes.dtos.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerificatioinTokenRepository extends JpaRepository<VerificationToken, Long> {

    VerificationToken findByToken(String token);
}
