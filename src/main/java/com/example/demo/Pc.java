package com.example.demo;

public class Pc extends Computer {
    private String ram;
    private String HDD;
    private String cpu;
   
    public Pc(String ram, String hDD, String cpu) {
        this.ram = ram;
        HDD = hDD;
        this.cpu = cpu;
    }
    @Override
    public String getRam() {
        return this.ram;
    }
    @Override
    public String getHdd() {
       
        return this.HDD;
    }
    @Override
    public String getCpu() {
        
        return this.cpu;
    }

    
}
