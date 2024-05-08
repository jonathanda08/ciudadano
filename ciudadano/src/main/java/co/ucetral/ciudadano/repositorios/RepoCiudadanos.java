package co.ucetral.ciudadano.repositorios;

import co.ucetral.ciudadano.Entidad.ciudadano;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoCiudadanos extends JpaRepository<ciudadano,Long> {
}
