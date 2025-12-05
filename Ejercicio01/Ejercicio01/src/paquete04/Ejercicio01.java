/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author Usuario iTC
 */
public class Ejercicio01 {
    
    public static void main(String[] args) {
        // Una sola cadena acumuladora
        String cadenaAcumuladora = "";

        int totalN = 0;
        int total2N = 0;
        int total3N = 0;
        int total4N = 0;

        for (int i = 30; i >= 10; i--) {
            int m2 = i * 2;
            int m3 = i * 3;
            int m4 = i * 4;

            // Línea de números.
            String linea = String.format("%d-%d-%d-%d\n", i, m2, m3, m4);

            // Acumular la línea en la cadena
            cadenaAcumuladora = cadenaAcumuladora + linea;

            // Acumular los totales
            totalN = totalN + i;
            total2N = total2N + m2;
            total3N = total3N + m3;
            total4N = total4N + m4;
        }

     
        String totales = String.format("Totales = %d-%d-%d-%d", totalN, total2N, total3N, total4N);

        // Añadir la línea de totales a la cadena acumuladora
        cadenaAcumuladora = cadenaAcumuladora + totales;

        // Imprimir la salida final
        System.out.println(cadenaAcumuladora);
    }
}

