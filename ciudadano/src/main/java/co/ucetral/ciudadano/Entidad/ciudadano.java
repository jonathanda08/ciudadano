package co.ucetral.ciudadano.Entidad;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "Ciudadano")
@Table(name = "CIUDADANOS")
public class ciudadano {
    @Id
    @Column(name = "CiuID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,  generator = "SEQ_CIUDADANOS")
    private long id;

    @Column(name = "CiuGenero")
    private String genero;

    @Column(name = "CiuNombre")
    private String nombre;

    @Column(name = "CiuApellido")
    private String apellido;

    @Column(name = "CiuRaza")
    private String raza;
}
