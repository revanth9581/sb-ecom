package com.ecommerce.project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "addresses")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;
    @NotBlank
    @Size(min = 5,message = "street must be 5 chars")
    private String street;
    @NotBlank
    @Size(min = 5,message = "buildingName must be 5 chars")
    private String buildingName;
    @NotBlank
    @Size(min = 5,message = "city must be 5 chars")
    private String city;
    @NotBlank
    @Size(min = 2,message = "state must be 5 chars")
    private String state;
    @NotBlank
    @Size(min = 2,message = "country must be 5 chars")
    private String country;
    @NotBlank
    @Size(min = 6,message = "pincode must be 5 chars")
    private String pinCode;

    @ToString.Exclude
    @ManyToMany(mappedBy = "addresses")
    private List<User> users = new ArrayList<>();

}
