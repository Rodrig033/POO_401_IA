package com.mx.curso.Unidad3.practica_02;

import java.util.Scanner;

public class ReportePacientes {
    public static void main(String[] args) {
        String area;
        int codigoPaciente;
        Scanner scanner = new Scanner(System.in);
        String[] areas = {"Cardiología", "Pediatría", "Neurología", "Geriatría", "Ginecología",
                          "Neumología", "Ortopedia", "Oftalmología", "Dermatología", "Urología"};

        System.out.println("---- Áreas ");
        for (int i = 0; i < areas.length; i++){
            System.out.println(areas[i]);
        }
        System.out.println("------------------");

        System.out.print("Ingrese su código de paciente: ");
        codigoPaciente = scanner.nextInt();
        System.out.print("Ingrese el área de su interés: ");
        area = scanner.next();
        switch (area){
            case "C":
                System.out.println(area +": " + "Cardiología");
                break;
            case "P":
                System.out.println(area +": " + "Pediatría");
                break;
            case "N":
                System.out.println(area +": " + "Neurología");
                break;
            case "G":
                System.out.println(area +": " + "Geriatría");
                break;
            case "GI":
                System.out.println(area +": " + "Ginecología");
                break;
            case "NU":
                System.out.println(area +": " + "Neumología");
                break;
            case "OR":
                System.out.println(area +": " + "Ortopedia");
                break;
            case "OF":
                System.out.println(area +": " + "Oftalmología");
                break;
            case "D":
                System.out.println(area +": " + "Dermatología");
                break;
            case "U":
                System.out.println(area +": " + "Urología");
                break;
            default:
                System.out.println(area +": " + "General");
                break;
        }
        scanner.close();
    }
}
