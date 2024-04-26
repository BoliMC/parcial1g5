/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1g5bolivarmirestebanfernan;

/**
 *
 * @author LKSTZ
 */
public class Sedan extends Automovil {
    
    private double motor;
    private boolean frenos;
    
    

    public double getMotor() {
        return motor;
    }

    public boolean isFrenos() {
        return frenos;
    }

    
    
    public Sedan(double motor, boolean frenos, String placa,int modelo, double precio){
    super (placa, modelo, precio);
    this.motor=motor;
    this.frenos=frenos; 
    
   }
    public String frenosABS() {
        if (frenos) {
            return "El automóvil tiene frenos ABS";
        } else {
            return "El automóvil no tiene frenos ABS";
        }
    
    }
    
    
}
