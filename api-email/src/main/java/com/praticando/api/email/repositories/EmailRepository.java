package com.praticando.api.email.repositories;

import com.praticando.api.email.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<EmailModel,Long> {
}
