/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad6;
import java.util.*;

/**
 *
 * @author jajimenez
 */
public class Actividad6 {

    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.nombre = "Adrian";
        Double promedio = promedio(alumno.calificacion);
        String calificacion = calificacion(promedio);
        imprimirCalificacion(alumno, promedio, calificacion);

    }

    public static Double promedio(Double[] calificacion) {
        Double promedio = 100d;
        Scanner Scan = new Scanner(System.in);
        int i;
        int[] numeros = new int[5];
        int total;
        int suma;
        System.out.println("Cal Materias: ");
        for (i = 0; i < 5; i++) {
            System.out.print("Materia[" + (i + 1) + "]= ");
            numeros[i]=Scan.nextInt();
        }


        for (int z = 0; z < 5; z++) {
            total = suma + numeros[z];
        }

        Double conver = Double.valueOf(total);
        
        promedio = conver/5;
        /*código para calcular el promedio*/
        return promedio;
    }

    public static String calificacion(Double promedio) {
        String calificacion = "";
        if (promedio <= 50) {
            calificacion = "F";
        }
        if (promedio >= 51 && promedio <= 60) {
            calificacion = "E";
        }
        if (promedio >= 61 && promedio <= 70) {
            calificacion = "D";
        }
        if (promedio >= 71 && promedio <= 80) {
            calificacion = "C";
        }
        if (promedio >= 81 && promedio <= 90) {
            calificacion = "B";
        }
        if (promedio >= 91 && promedio <= 100) {
            calificacion = "A";
        }
        return calificacion;
    }

    public static void imprimirCalificacion(Alumno alumno, Double promedio, String calificacion) {
        System.out.println("Nombre del estudiante: " + alumno.nombre);

               /* for (int x = 0; x < 5; x++) {
            System.out.println("Calificacion:[" + (x + 1) + "]" + numeros[x]);
        }*/

        /*aqui debe de ir un for para imprimir las calificaciones*/
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }
}
