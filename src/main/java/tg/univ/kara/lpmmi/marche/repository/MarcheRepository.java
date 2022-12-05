package tg.univ.kara.lpmmi.marche.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tg.univ.kara.lpmmi.marche.model.Marche;

@Repository

public interface MarcheRepository extends JpaRepository<Marche,Long> {

}
