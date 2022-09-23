package br.pucbr.exemplo.usuario.repository;

import br.pucbr.exemplo.usuario.entity.Visit;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Profile("repository")
public interface VisitRepository extends JpaRepository<Visit,Integer> {


    public List<Visit> findByPetId(Integer petId);
}