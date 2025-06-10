package med.voll.api.medicos.DTO;

import med.voll.api.endereco.Model.DadosEndereco;
import med.voll.api.medicos.Model.Especialidade;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
