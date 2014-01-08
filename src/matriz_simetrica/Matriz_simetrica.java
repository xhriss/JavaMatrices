package matriz_simetrica;

import java.util.*;
public class Matriz_simetrica {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el número de filas");
        int filas= sc.nextInt();
        System.out.println("Introduce el número de columnas");
        int columnas= sc.nextInt();
        
        
        boolean cuadrada = escuadrada(filas, columnas);
        
        if (cuadrada==true){
            System.out.println("La matriz es cuadrada\n");
            int [][] m= new int [filas][columnas];
            rellenarandom(m);
            mostrar(m);
            boolean simetrica=essimetrica(m);
                if (simetrica==true){
                    System.out.println("\nLa matriz es simétrica");
                }
                else{
                    System.out.println("\nLa matriz no es simétrica");
                }
         }
         else{
            System.out.println("La matriz no es cuadrada");
        }
    
    }    
    // Rellenar matriz
    public static void rellenar (int [][] m){    
    Scanner sc=new Scanner(System.in);
        for (int i=0; i<m.length; i++){
           for (int j=0; j<m[i].length; j++){
             System.out.println("Introduce un número (Rellenar la matriz)");
             m[i][j]=sc.nextInt();
           } 
        }
    }
    
    // Rellenar matriz a lo random
    public static void rellenarandom (int [][] m){    
        Random r=new Random(); // la variable es r; random es la clase
            for (int i=0; i<m.length; i++){
                for (int j=0; j<m[i].length; j++){
                    m[i][j]=r.nextInt(9); // El 9 indica que vaya de 0 a 9
           } 
        }
           } 
           
     
    // Mostrar matriz
    public static void mostrar (int [][] m){
     for (int i=0; i<m.length; i++){
                for (int j=0; j<m[i].length; j++){
                    System.out.print(m[i][j] + " ");
                }
     System.out.print("\n");
    }
    }
                    
    // Comprobar si es cuadrada    
    public static boolean escuadrada (int f, int c){
        if (f==c){return true;}
        else{return false;}
    }
    
    // Comprobar si es simétrica
    public static boolean essimetrica (int [][] m){
        boolean sim=true;
            for (int i=0; i<m.length && sim; i++){
                for (int j=0; j<m[i].length && sim; j++){
                 if (m[i][j]== m[j][i]){
                     sim=true;
                 }
                 else {
                     sim=false;
                 }
                }
            }
        return sim;
         }
  
    }
        
