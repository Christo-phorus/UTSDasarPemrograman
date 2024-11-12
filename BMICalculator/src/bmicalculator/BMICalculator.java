/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmicalculator;

/**
 *
 * @author acer
 */
public class BMICalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BodyMassIndexCalculator BMI = new BodyMassIndexCalculator(80,170);
        
            System.out.println("Berat: " + BMI.getBerat() + "kg");
            System.out.println("Tinggi " + BMI.getTinggi() + "m");
            
            System.out.println("Hasil: " + BMI.hitung());
            System.out.println("Kategori: Anda termasuk " + BMI.getKategori());
    }
    
}
