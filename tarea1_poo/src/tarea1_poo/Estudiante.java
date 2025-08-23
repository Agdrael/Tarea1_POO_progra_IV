/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1_poo;

/**
 *
 * @author 1720972023
 */
public class Estudiante {

 String nombre;
 String carrera;
 String id; // se usara el tipo de identificador de la universidad? xx-xxxx-xxxx? //
    
  /*
  //Aquí estaría como se implemente la validación cuando de ingresa un dato
        boolean validacion;
        do {
            System.out.println("Ingrese el nombre: ");
            nombre=sc.nextLine();

            if (validarNombre(nombre)){
                validacion=false;
            }else{
                System.out.println("Dato ingresado incorrectamente. Intente nuevamente.");
                validacion=true;
            }
        } while (validacion);

  //Y este sería el Try & Catch de las variables numéricas
        try{
            System.out.println("Ingrese un número: ");
            num=sc.nextInt();
        }catch(Exception e){
            System.out.println("Tipo de dato incorrecto: " + e);
        }
  */
    public Estudiante(String id, String nombre, String carrera) {
        this.id = id;
        this.nombre = nombre;
        this.carrera = carrera;
    }

}
/*
-> MÉTODO PARA LAS VARIABLES COMO EL NOMBRE QUE SÓLO DEBE INCLUIR LETRAS <-

    public static boolean validarLetras(String nombre){
        
        int contador=0;
        for (int i = 0; i < nombre.length() ; i++) {
            char caracter = nombre.charAt(i);
            
            if(!Character.isLetter(caracter)&& caracter !=' ' &&
                caracter !='á' && caracter !='é' && caracter !='í' && 
                caracter !='ó' && caracter !='ú' && caracter !='ñ' &&
                caracter !='Á' && caracter !='É' && caracter !='Í' && 
                caracter !='Ó' && caracter !='Ú' && caracter !='Ñ'){
                contador++; //El contador aumenta si encuentra un caracter que no sea una letra.
            }
            
        }
        
        if (contador == 0) {
            return true;
        } else {
            return false;
        }
        
    }
    
    -> MÉTODO PARA VARIABLES QUE SÓLO DEBEN INCLUIR NÚMEROS Y GUIONES <-
        
    public static boolean validarNumGuion(String nombre){
        
        int contador=0;

        for (int i = 0; i < nombre.length() ; i++) {
            char caracter = nombre.charAt(i);
            
            if(!Character.isDigit(caracter)&& caracter !='-'){
                contador++;
            }
            
        }
        if (contador == 0) {
            return true;
        } else {
            return false;
        }
        
    }
*/
