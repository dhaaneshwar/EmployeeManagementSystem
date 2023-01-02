package tech.getarrays.employeemanager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {    //serializable is used to convert the class into different types of stream

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable=false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageUrl;
    private String employeeCode;


}
