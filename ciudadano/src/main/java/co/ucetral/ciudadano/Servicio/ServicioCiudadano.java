package co.ucetral.ciudadano.Servicio;

import co.ucetral.ciudadano.dto.CiudadanoDto;
import co.ucetral.ciudadano.Entidad.ciudadano;
import co.ucetral.ciudadano.operaciones.OperacionesCiudadano;
import co.ucetral.ciudadano.repositorios.RepoCiudadanos;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioCiudadano implements OperacionesCiudadano {

    @Autowired
    RepoCiudadanos repoCiudadano;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<CiudadanoDto> listar() {
        TypeToken<List<CiudadanoDto>> typeToken = new TypeToken<>(){};
        return modelMapper.map(repoCiudadano.findAll(),typeToken.getType());
    }

    @Override
    public void ingresar(CiudadanoDto ciudadano) {
        ciudadano ciudadanos = modelMapper.map(ciudadano,ciudadano.class);
        repoCiudadano.save(ciudadanos);
    }
}
