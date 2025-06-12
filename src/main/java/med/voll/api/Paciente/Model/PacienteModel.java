package med.voll.api.Paciente.Model;

import med.voll.api.Paciente.DTO.DadosCadastroPaciente;
import med.voll.api.endereco.Model.EnderecoModel;

public class PacienteModel {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private EnderecoModel endereco;

    public PacienteModel(DadosCadastroPaciente dadosCadastroPacientePaciente) {
        this.nome = dadosCadastroPacientePaciente.nome();
        this.email = dadosCadastroPacientePaciente.email();
        this.telefone = dadosCadastroPacientePaciente.telefone();
        this.cpf = dadosCadastroPacientePaciente.cpf();
        this.endereco = new EnderecoModel(dadosCadastroPacientePaciente.dadosEndereco());
    }
}
