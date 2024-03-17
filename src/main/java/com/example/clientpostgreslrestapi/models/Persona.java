package com.example.clientpostgreslrestapi.models;

 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data // Genera getters y setters automáticamente
@Entity // Indica que es una entidad de la base de datos
@Table(name = "personas") // Indica el nombre de la tabla en la base de datos
public class Persona {
    
    @Id // Indica que es la clave primaria de la entidad
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera la clave primaria automáticamente
    @Column(name = "id") // Indica el nombre de la columna en la base de datos
    private Long id;
    
    private String nombreApellido;
}
