package co.ucetral.ciudadano.controlador;


import co.ucetral.ciudadano.Entidad.ciudadano;
import co.ucetral.ciudadano.Servicio.ServicioCiudadano;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class controladorCiudadano {

    @Autowired
    ServicioCiudadano serviciosCiudadano;


    @GetMapping({"/ciudadano/lista"})
    public String listarCiudadanos(Model model) {
        model.addAttribute("listaciudadanosT", serviciosCiudadano.consultarT());

        for (ciudadano elciudadano : serviciosCiudadano.consultarT()) {
            System.out.println(elciudadano);
        }
        System.out.println("Paso por aca");
        return "listar";
    }
    @GetMapping({  "/ciudadano/nuevo"})
    public String cargarCarroModal(Model model) {
        ciudadano crearciudadano = new ciudadano();
        return "listar";
    }

}
