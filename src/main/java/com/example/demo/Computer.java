package com.example.demo;
import java.lang.Override;
public abstract class Computer {
    public abstract String getRam();
    public abstract String getHdd();
    public abstract String getCpu();

    @Override
    public String toString(){
        return "Ram="+this.getRam()+", HDD="+this.getHdd()+", CPU="+this.getCpu();
    }
    

}
