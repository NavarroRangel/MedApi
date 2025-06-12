package med.voll.api.Paciente.Repository;

import med.voll.api.Paciente.Model.PacienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<PacienteModel, Long> {
}
