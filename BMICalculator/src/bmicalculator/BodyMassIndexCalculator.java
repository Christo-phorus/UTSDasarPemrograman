/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmicalculator;

/**
 *
 * @author acer
 */
public class BodyMassIndexCalculator {
    private double berat;
    private double tinggi;
    
    public BodyMassIndexCalculator (double berat, double tinggiM){
    this.tinggi = tinggiM / 100;
    this.berat = berat;
            }

    
    
    public void setBerat(double berat) {
        if (berat > 0) {
            this.berat = berat;
        } else {
            System.out.println("Berat harus lebih dari 0.");
        }
    }
    
    public void setTinggi(double tinggi) {
        if (tinggi > 0) {
            this.tinggi = tinggi;
        } else {
            System.out.println("Tinggi harus lebih dari 0.");
        }
    }
    
    public double getBerat(){
        return berat;
    }
    
    public double getTinggi(){
        return tinggi;
    }
    
    public double hitung(){
        return berat / (tinggi * tinggi) ;
    }
    
    public String getKategori(){
    double bmi = hitung();
    if (bmi <= -1) {
            return "Tidak dapat menghitung kategori BMI.";
        }
        if (bmi < 18.5) {
            return "Kurus";
        } else if (bmi < 24.9) {
            return "Normal";
        } else if (bmi < 29.9) {
            return "Berat badan berlebih";
        } else {
            return "Obesitas";
        }
    }
}
