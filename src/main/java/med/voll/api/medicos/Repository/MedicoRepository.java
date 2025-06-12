package med.voll.api.medicos.Repository;

import med.voll.api.medicos.Model.MedicoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<MedicoModel, Long> {

}
