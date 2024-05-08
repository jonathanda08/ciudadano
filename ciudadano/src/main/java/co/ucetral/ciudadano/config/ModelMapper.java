package co.ucetral.ciudadano.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapper {


    public org.modelmapper.ModelMapper modelMapper(){
        return new org.modelmapper.ModelMapper();

    }

}