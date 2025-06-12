package med.voll.api.medicos.Controllers;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.medicos.DTO.DadosCadastroMedico;
import med.voll.api.medicos.Repository.MedicoRepository;
import med.voll.api.medicos.Model.MedicoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @PostMapping("/cadastrar")
    @Transactional
    public void cadastrarMedico(@RequestBody @Valid  DadosCadastroMedico dadosMedico){
        medicoRepository.save(new MedicoModel(dadosMedico));
    }

}
