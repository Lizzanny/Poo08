/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo08;

import Cadenas.Cadena;
import Servicios.Servicio;
import java.util.Scanner;

/**
 *
 * @author LizzW
 */
public class GuiaPoo08 {

    /**
     * @param args the command line arguments
     *
     * Realizar una clase llamada Cadena que tenga como atributos una frase (de
     * tipo de String) y su longitud. En el main se creará el objeto y se le
     * pedirá al usuario que ingrese una frase que puede ser una palabra o
     * varias palabras separadas por un espacio en blanco y a través de los
     * métodos set, se guardará la frase y la longitud de manera automática
     * según la longitud de la frase ingresada. Deberá además implementar los
     * siguientes métodos: a) Método mostrarVocales(), deberá contabilizar la
     * cantidad de vocales que tiene la frase ingresada. b) Método
     * invertirFrase(), deberá invertir la frase ingresada y mostrarla por
     * pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac". c)
     * Método vecesRepetido(String letra), recibirá un carácter ingresado por el
     * usuario y contabilizar cuántas veces se repite el carácter en la frase,
     * por ejemplo: d) Entrada: frase = "casa blanca". Salida: El carácter 'a'
     * se repite 4 veces. e) Método compararLongitud(String frase), deberá
     * comparar la longitud de la frase que compone la clase con otra nueva
     * frase ingresada por el usuario. f) Método unirFrases(String frase),
     * deberá unir la frase contenida en la clase Cadena con una nueva frase
     * ingresada por el usuario y mostrar la frase resultante. g) Método
     * reemplazar(String letra), deberá reemplazar todas las letras “a” que se
     * encuentren en la frase, por algún otro carácter seleccionado por el
     * usuario y mostrar la frase resultante. h) Método contiene(String letra),
     * deberá comprobar si la frase contiene una letra que ingresa el usuario y
     * devuelve verdadero si la contiene y falso si no.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        boolean exit=false;
        Servicio ser = new Servicio();
        Cadena cad = ser.crearCadena();
        
        
        do {
            System.out.println("==========MENU===========");
            System.out.println("1. Mostrar Vocales");
            System.out.println("2. Invertir Frase");
            System.out.println("3. Veces Repetido");
            System.out.println("4. Comparar Longitud");
            System.out.println("5. Unir Frases");
            System.out.println("6. Reemplazar Caracter");
            System.out.println("7. Contiene Caracter");
            System.out.println("8. Salir");
            
            System.out.println("Elija una opcion");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    ser.mostrarVocales(cad);
                break;
                case 2:
                    ser.invertirFrase(cad);
                break;
                case 3:
                    ser.vecesRepetido(cad);
                break;
                case 4:
                    ser.compararLongitud(cad);
                break;
                case 5:
                    ser.unirFrases(cad);
                break;
                case 6:
                    ser.reemplazar(cad);
                break;
                case 7:
                    if(ser.contiene(cad)){
                        System.out.println("Si contiene la letra");
                    }else{
                        System.out.println("=( La letra no esta en la frase");
                    }
                break;
                case 8:
                    exit = true;
                break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (!exit);
        
        
       
    }

}
