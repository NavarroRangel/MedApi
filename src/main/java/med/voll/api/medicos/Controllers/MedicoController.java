package med.voll.api.medicos.Controllers;

import med.voll.api.medicos.DTO.DadosCadastroMedico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @PostMapping("/criar")
    public void cadastrar(@RequestBody DadosCadastroMedico dadosMedico){

    }

}
