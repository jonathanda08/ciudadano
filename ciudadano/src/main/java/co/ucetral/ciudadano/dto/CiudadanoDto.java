package co.ucetral.ciudadano.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.*;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class CiudadanoDto implements Serializable{
    private long id;

    private long Genero;

    private String Nombre;

    private String Apellido;

    private String Raza;
}
