package med.voll.api.Paciente.DTO;

import med.voll.api.endereco.DTO.DadosEndereco;

public record DadosCadastroPaciente(String nome,
                                    String email,
                                    String telefone,
                                    String cpf,
                                    DadosEndereco dadosEndereco
) {
}
