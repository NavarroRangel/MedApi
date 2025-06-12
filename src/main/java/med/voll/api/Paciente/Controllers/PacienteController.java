package med.voll.api.Paciente.Controllers;

import med.voll.api.Paciente.DTO.DadosCadastroPaciente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @GetMapping
    public String pacientes(){
        return "paciente";
    }

    @PostMapping("/cadastrar")
    public void cadastrar(@RequestBody DadosCadastroPaciente dadosPaciente){

    }

}
