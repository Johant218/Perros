/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz;

import javax.swing.JOptionPane;

/**
 *
 * @author johan
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    //Desarrollar un sofware para paceadores de perros, con el numero de horas de paseo y numero de perros 
    //Calcular el costo que debe pagar la persona
    // Perro grande: 10.000, perro mediano 5000, perro pequeño 3000
    // si contrata mas de un perro se le hace el descuento del 10%
    public static void main(String[] args) {
       int cant =  Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de perros "));
       int cantH =  Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de horas que require el servicio"));
       int perroGrande= 10000, perroMediano= 5000, perroPequeño= 3000;
       int tamaño= 0;
        int totalCosto = 0, costo=0;
        
        for (int i = 1; i <=cant ; i++) {
             tamaño = Integer.parseInt(JOptionPane.showInputDialog("Seleccione 1. si es perro grande 2. si es perro mediano y 3. si es perro pequeño"));
            if (tamaño ==1) {
                costo= perroGrande * cantH;
            } else if (tamaño==2){
                costo= perroMediano * cantH;
            }else if (tamaño==3){
                costo= perroPequeño * cantH;
            }
        totalCosto= totalCosto + costo;
        }
        if (cant >=2){
        double descuento= totalCosto - totalCosto * 0.10; 
        JOptionPane.showMessageDialog(null, descuento);
        }else{
        JOptionPane.showMessageDialog(null,   totalCosto);
        }
        }
    
}
