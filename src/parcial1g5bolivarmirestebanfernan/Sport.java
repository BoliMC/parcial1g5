/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1g5bolivarmirestebanfernan;

/**
 *
 * @author LKSTZ
 */
public class Sport extends Moto {
    
    private String motor;
    private String potencia;
    private String tanque;

    public Sport(String motor, String potencia, String tanque, String placa,int modelo, int cilindraje) {
        super (placa, modelo, cilindraje);
        this.motor = motor;
        this.potencia = potencia;
        this.tanque = tanque;
        
    }

    public String getMotor() {
        return motor;
    }

    public String getPotencia() {
        return potencia;
    }

    public String getTanque() {
        return tanque;
    }
    
    public void motorgarantia(){
        if(motor.equals("4T")){
            System.out.println("La garantia de la moto es 2 años");   
        }
        else if (motor.equals("Monocilindraje")){
            System.out.println("La garantia de la moto es 1 año");
        }
    
    }
    
}
