package com.diana;

import java.io.File;
import java.util.Scanner;

public class Main {
    /*El archivo ‘alumnos_notas.txt’ contiene una lista de 10 alumnos y las notas que han obtenido en
    cada asignatura. El número de asignaturas de cada alumno es variable. Implementa un programa
    que muestre por pantalla la nota media de cada alumno junto a su nombre y apellido, ordenado
    por nota media de mayor a menor.
    */
    public static void main(String[] args) {
        String nombre, apellido, linea;
        double media, suma;

        try {
            // Intentamos abrir el fichero
            File f = new File("C:\\Users\\diana\\OneDrive\\Desktop\\EjercicioB1\\Documentos\\alumnos_notas.txt");
            Scanner lector = new Scanner(f);

            do {
                suma = 0;
                linea = lector.nextLine();
                String parte[] = linea.split(" ");
                nombre = parte[0];
                apellido = parte[1];


                for (int i = 2; i < parte.length; i++) {
                    int numero = Integer.valueOf(parte[i]);
                    suma = suma + numero;
                }

                media = suma / (parte.length - 2);

                System.out.println("Nombre: " + nombre + "\nApellido: " + apellido + "\nNota media: " + media + "\n");

            }
            while (lector.hasNextLine());
            lector.close();


        } catch (
                Exception e) {
            // En caso de excepción mostramos el error
            System.out.println("Error: " + e);
            e.printStackTrace();
        }
    }
}
