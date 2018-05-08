/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

/**
 *
 * @author student
 */
public class Samochód<t> {
    private String marka;
    private String nazwa;
    private double max_prędkość;
    private double cena;

    public Samochód(String marka, String nazwa, double max_prędkość, double cena) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.max_prędkość = max_prędkość;
        this.cena = cena;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getMax_prędkość() {
        return max_prędkość;
    }

    public void setMax_prędkość(double max_prędkość) {
        this.max_prędkość = max_prędkość;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
       public void showInfo() {
        System.out.println("Marka: "+getMarka()+" nazwa samochodu: "+ getNazwa()+" Max prędkość "+getMax_prędkość()+" Cena "+getCena());
    }
    
    
}
