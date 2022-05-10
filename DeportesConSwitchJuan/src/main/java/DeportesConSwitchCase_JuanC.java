
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */


public class DeportesConSwitchCase_JuanC {
public static void main(String args []){
   
    
    
    Scanner sc = new Scanner (System.in);
      try{      
        System.out.println("¿Qué temperatura hace?");
        int temp=sc.nextInt();
        

        String deporte = "";
        
    switch(temp){
case -20: 
    deporte= "DAMAS";
    System.out.println("Hoy practicarás " + deporte);
case -19:
case -18:
case -17: 
case -16: 
case -15: 
case -14:
case -13:
case -12:
case -11:
case -10: deporte= "DAMAS";
    System.out.println("Hoy practicarás " + deporte);
        break;
case -9:
    deporte= "ESQUÍ";
    System.out.println("Hoy practicarás " + deporte);
case -8:
case -7: 
case -6: 
case -5: 
case -4:
case -3:
case -2:
case -1:
case 0:
case 1:
case 2:
case 3:
case 4:
case 5:
    deporte= "ESQUÍ";
    System.out.println("Hoy practicarás " + deporte);
        break;
case 6:     
    deporte= "TENIS";
    System.out.println("Hoy practicarás " + deporte);
case 7:
case 8:
case 9:
case 10:
case 11:
case 12:
case 13:
case 14:
case 15: 
    deporte= "TENIS";
    System.out.println("Hoy practicarás " + deporte);
    break;
case 16:     
    deporte= "GOLF";
    System.out.println("Hoy practicarás " + deporte);
case 17:
case 18:
case 19:
case 20:
case 21:
case 22:
case 23:
case 24:
case 25:
case 26:
case 27:
case 28:
case 29:
case 30:
    deporte= "GOLF";
    System.out.println("Hoy practicarás " + deporte);
    break;
case 31:     
    deporte= "NATACION";
    System.out.println("Hoy practicarás " + deporte);
case 32:
case 33:
case 34:
case 35:
case 36:
case 37:
case 38:
case 39:
case 40:
case 41:
case 42:
case 43:
case 44:
case 45:
case 46:
case 47:
case 48:
case 49:
    deporte= "NATACION";
    System.out.println("Hoy practicarás " + deporte);
    break;
case 50: System.out.println("Hoy no hay clase debido al calor");
case 51: 
case 52: 
case 53:
case 54: 
case 55: System.out.println("Hoy no hay clase debido al calor");
    break;
}
}catch(InputMismatchException e){
    System.out.println("Revisa tu respuesta. No has puesto un numero");
}
}
}
