package examen.ayala;

import java.util.ArrayList;
import java.util.Scanner;

public class Utileria {

    public Scanner entrada = new Scanner(System.in);

    public void menu(String matriz[][]) {
        int opcion;
        System.out.println("Menu Utileria");
        do {
            System.out.println("Opciones");
            opcion = entrada.nextInt();
            String condicion;
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la carrera a buscar");
                    condicion = entrada.nextLine();
                    System.out.println("Resultados de la busqueda por carrera");
                    buscarPorCondicion(condicion, matriz, 5);
                    break;
                case 2:
                    System.out.println("Ingrese la municipio a buscar");
                    condicion = entrada.nextLine();
                    System.out.println("Resultados de la busqueda por municipio");
                    buscarPorCondicion(condicion, matriz, 3);
                    break;
                case 3:
                    System.out.println("Construccion");
                    break;
                default:

            }
        } while (opcion >= 1 && opcion <= 3);
    }

    private void buscarPorCondicion(String condicion, String matriz[][], int condicion2) {
        System.out.println("#\tNombre\tApellido\tDepartamento\tMunicipio\tDireccion\tCarrera\tCorreo e\tDui");
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][condicion2].equals(condicion)) {
                System.out.print((i + 1) + ".\t");
                for (int o = 0; o < 8; o++) {
                    System.out.print(matriz[i][o] + "\t");
                }
                System.out.print("\n");
            }
        }
    }

    public String[][] convertirMatriz(ArrayList<String> nombre, ArrayList<String> apellido, ArrayList<String> departamento,
            ArrayList<String> municipio, ArrayList<String> direccion, ArrayList<String> carrera, ArrayList<String> correo, ArrayList<Integer> dui) {
        String matrizReturn[][] = new String[nombre.size()][8];
        for (int i = 0; i < nombre.size(); i++) {
            matrizReturn[i][0] = nombre.get(i);
            matrizReturn[i][1] = apellido.get(i);
            matrizReturn[i][2] = departamento.get(i);
            matrizReturn[i][3] = municipio.get(i);
            matrizReturn[i][4] = direccion.get(i);
            matrizReturn[i][5] = carrera.get(i);
            matrizReturn[i][6] = correo.get(i);
            matrizReturn[i][7] = String.valueOf(dui.get(i));
        }
        return matrizReturn;
    }
}
