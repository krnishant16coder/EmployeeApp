package com.nishant.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int lid;
    private String brandName;
    private String ram;

    public Laptop(String brandName, String ram) {
        this.brandName = brandName;
        this.ram = ram;
    }

    public Laptop() {
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getRam() {
        return ram;
    }
}
