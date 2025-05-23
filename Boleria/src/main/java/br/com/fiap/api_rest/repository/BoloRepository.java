package br.com.fiap.api_rest.repository;

import br.com.fiap.api_rest.model.Bolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoloRepository extends JpaRepository<Bolo, Long> {
}
