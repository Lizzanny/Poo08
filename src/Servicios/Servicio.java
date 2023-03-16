/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Cadenas.Cadena;
import java.util.Scanner;

/**
 *
 * @author LizzW
 * 
 * Realizar una clase llamada Cadena que tenga como atributos una frase (de
     * tipo de String) y su longitud. En el main se creará el objeto y se le
     * pedirá al usuario que ingrese una frase que puede ser una palabra o
     * varias palabras separadas por un espacio en blanco y a través de los
     * métodos set, se guardará la frase y la longitud de manera automática
     * según la longitud de la frase ingresada. Deberá además implementar los
     * siguientes métodos: 
     * a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales 
     * que tiene la frase ingresada. 
     * b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por
     * pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac". 
     * c)Método vecesRepetido(String letra), recibirá un carácter ingresado por el
     * usuario y contabilizar cuántas veces se repite el carácter en la frase,
     * por ejemplo: 
     * d) Entrada: frase = "casa blanca". Salida: El carácter 'a'
     * se repite 4 veces. 
     * e) Método compararLongitud(String frase), deberá
     * comparar la longitud de la frase que compone la clase con otra nueva
     * frase ingresada por el usuario. 
     * f) Método unirFrases(String frase),
     * deberá unir la frase contenida en la clase Cadena con una nueva frase
     * ingresada por el usuario y mostrar la frase resultante. 
     * g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
     * encuentren en la frase, por algún otro carácter seleccionado por el
     * usuario y mostrar la frase resultante. 
     * h) Método contiene(String letra),
     * deberá comprobar si la frase contiene una letra que ingresa el usuario y
     * devuelve verdadero si la contiene y falso si no.
 */
public class Servicio {
    private Scanner sc = new Scanner(System.in);
    
    public Cadena crearCadena(){
        Cadena cad = new Cadena();
        System.out.println("Ingrese una frase o palabra");
        cad.setFrase(sc.nextLine());
        cad.setLongitud(cad.getFrase().length());
        return cad;
    }
    
    public void mostrarVocales(Cadena cad){
        int cont=0;
        for (int i = 0; i < cad.getLongitud(); i++) {
            if(cad.getFrase().substring(i, i+1).equalsIgnoreCase("a")||cad.getFrase().substring(i, i+1).equalsIgnoreCase("e")||cad.getFrase().substring(i, i+1).equalsIgnoreCase("i")||cad.getFrase().substring(i, i+1).equalsIgnoreCase("o")||cad.getFrase().substring(i, i+1).equalsIgnoreCase("u")){
                cont++;
            }
        }
        
        if(cont>0){
            System.out.println("Numero total de vocales en la frase: "+cont);
        }else{
            System.out.println("La frase no contiene vocales");
        }
    }
    
    public void invertirFrase(Cadena cad){
        System.out.println("Frase original:"+cad.getFrase());
        System.out.println("La frase invertida es:");
        for (int i = (cad.getLongitud()-1); i >= 0; i--) {
            System.out.print(cad.getFrase().substring(i, i+1));
        }
        System.out.println(" ");
    }
    
    public void vecesRepetido(Cadena cad){
        String vocal;
        System.out.println("Vocal a encontrar:");
        vocal = sc.next();
        int cont=0;
        for (int i = 0; i < cad.getLongitud(); i++) {
            if(cad.getFrase().substring(i, i+1).equalsIgnoreCase(vocal)){
                cont++;
            }
        }
        if(cont>0){
            System.out.println("Numero de veces que aparece "+vocal+" en la frase: "+cont);
        }else{
            System.out.println("La frase no contiene vocales");
        }
    }
    
    public void compararLongitud(Cadena cad){
        String nFrase;
        int nLongitud;
        System.out.println("Ingrese frase a comparar:");
        nFrase = sc.nextLine();
        nLongitud = nFrase.length();
        if(cad.getLongitud()>nLongitud){
            System.out.println("La frase: "+ cad.getFrase() + " más larga que la frase: " +nFrase);
            System.out.println("La longitud mas grande es:" + cad.getLongitud());
        }else{
            System.out.println("La frase: "+nFrase+  " más larga que la frase: " + cad.getFrase()  );
            System.out.println("La longitud mas grande es:" + nLongitud);
        }
    }
    
    public void unirFrases(Cadena cad){
        String nFrase;
        System.out.println("Ingrese frase a concatenar:");
        nFrase = sc.next();
        System.out.println("Frases unidas: "+ cad.getFrase().concat(" "+nFrase));
    }
    
    public void reemplazar(Cadena cad){
        String caracter, aux;
        System.out.println("Caracter por el que va a reemplazar:");
        caracter = sc.next();
        aux = "";
        for (int i = 0; i < cad.getLongitud(); i++) {
            if(cad.getFrase().substring(i, i+1).equalsIgnoreCase("a")){
                aux = aux + cad.getFrase().substring(i, i)+ caracter;
            }else{
                aux = aux + cad.getFrase().substring(i, i+1);
            }
        }
        System.out.println("La nueva frase es: "+ aux);
       
    }
    
    public boolean contiene(Cadena cad){
        String vocal;
        System.out.println("Vocal a encontrar:");
        vocal = sc.next();
        boolean cont=false;
        for (int i = 0; i < cad.getLongitud(); i++) {
            if(cad.getFrase().substring(i, i+1).equalsIgnoreCase(vocal)){
                cont = true;
            }
        }
        return cont;
    }
}
