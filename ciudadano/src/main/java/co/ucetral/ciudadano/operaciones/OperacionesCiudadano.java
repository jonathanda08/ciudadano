package co.ucetral.ciudadano.operaciones;

import co.ucetral.ciudadano.Entidad.ciudadano;
import co.ucetral.ciudadano.dto.CiudadanoDto;

import java.util.List;

public interface OperacionesCiudadano {
    List<CiudadanoDto> listar();

    public ciudadano crear(ciudadano ciudadano);
    public ciudadano actualizar(ciudadano ciudadano);
    public List<ciudadano> consultarT();
    public void borrar(ciudadano ciudadano);
    public ciudadano consultarPK(int pk);
}

