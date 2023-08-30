package com.BloodStream.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BloodStream.pojos.EmailActivationCodes;

@Repository
public interface EmailActivationRepository extends JpaRepository<EmailActivationCodes, Long> {
  Optional<EmailActivationCodes> findByCode(String code);
  Optional<EmailActivationCodes> findByEmail(String email);
}
