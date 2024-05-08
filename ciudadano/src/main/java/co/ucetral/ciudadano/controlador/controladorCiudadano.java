package co.ucetral.ciudadano.controlador;


import co.ucetral.ciudadano.Servicio.ServicioCiudadano;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class controladorCiudadano {
    @Autowired
    ServicioCiudadano servCiudadano;

    @GetMapping("/")
    public String inicio(){
        return "redirect:/Ciudadano/lista";
    }

    @GetMapping("/Ciudadano/lista")
    public String mostrar(Model model){
        model.addAttribute("Ciudadano",servCiudadano.listar());
        return "listar";
    }
    @GetMapping("/ciudadano/nuevo")
    public String nuevo (Model model) {
        model.addAttribute("Ciudadano", servCiudadano.listar());
        return "crear";
    }

}
