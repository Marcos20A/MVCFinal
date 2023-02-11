package net.codejava.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    private Long id;
    private String name;
    private String brand;
    private String sexo;
    private int edad;
    private float estatura;
    private float peso;
    private float imc;
    

    public Product() {
    }

    protected Product(Long id, String name, String brand, String sexo, int edad, float estatura, float peso, float imc) {
        super();
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.sexo = sexo;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.imc = imc;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        if(edad < 15){
            throw new IllegalArgumentException();
        }
        this.edad = edad;
    }

    public void setEstatura(float estatura) {
          if(estatura > 2.5 || estatura < 1){
            throw new IllegalArgumentException();
        }
        this.estatura = estatura;
    }

    public float getPeso() {
        return peso;
    }

    public float getImc() {
        
        return imc = peso/(estatura*estatura);
    }

    public void setPeso(float peso) {
            if(peso <= 0){
            throw new IllegalArgumentException();
        }
        this.peso = peso;
    }

    public void setImc(float imc) {
         if(imc <= 0){
            throw new IllegalArgumentException();
        }
        this.imc = imc;
    }



    
        

}
