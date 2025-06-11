package med.voll.api.medicos.Model;

import jakarta.persistence.*;
import lombok.*;
import med.voll.api.endereco.Model.EnderecoModel;
import med.voll.api.medicos.DTO.DadosCadastroMedico;

@Table(name = "medicos")
@Entity(name = "Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class MedicoModel {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private EnderecoModel endereco;

    public MedicoModel(DadosCadastroMedico dadosMedico) {
        this.nome = dadosMedico.nome();
        this.email = dadosMedico.email();
        this.crm = dadosMedico.crm();
        this.especialidade = dadosMedico.especialidade();
        this.endereco = new EnderecoModel(dadosMedico.endereco());
    }
}
