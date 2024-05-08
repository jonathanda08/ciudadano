package co.ucetral.ciudadano.operaciones;

import co.ucetral.ciudadano.dto.CiudadanoDto;

import java.util.List;

public interface OperacionesCiudadano {
    public List<CiudadanoDto> listar();

    public void ingresar(CiudadanoDto estudiante);

}
