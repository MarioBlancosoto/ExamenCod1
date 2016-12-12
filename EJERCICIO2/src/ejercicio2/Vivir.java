/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author mblancosoto
 */
public class Vivir {
    int m,d,h,a;

    String n;
    String e;
//se declaran las variables de clase para poder usarlas en los metodos   

public void nombreYedad(){
    n = JOptionPane.showInputDialog ("Escriba su nombre: ");
    e = JOptionPane.showInputDialog ("Escriba su edad: ");
 
    //metodo para pedir nombre y edad
}

public void Tiempo(){
    m = (a*12);
    d = (a*365);
    h = (d*24);
 
    
    
    
     JOptionPane.showMessageDialog(null,  "Meses: "  +m,"Numero de meses vividos de " +n,JOptionPane.INFORMATION_MESSAGE);


 JOptionPane.showMessageDialog(null, "Días: " +d,"Numero de días vividos de "+n,JOptionPane.INFORMATION_MESSAGE);


 JOptionPane.showMessageDialog(null, "Horas: " +h,"Numero de horas vividos de "+n,JOptionPane.INFORMATION_MESSAGE);

   System.exit (0);
    
}

public void pedirDato(){
    
    a = Integer.parseInt (e);
}
}
