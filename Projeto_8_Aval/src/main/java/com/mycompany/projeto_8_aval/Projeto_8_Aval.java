/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_8_aval;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author h.moreira
 */
public class Projeto_8_Aval {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
            System.out.print("Digite o numero: ");
           int numero = scan.nextInt();

            FileWriter arquivo = new FileWriter ("C:\\Users\\Public\\TABUADA.txt") ;
            PrintWriter writer = new PrintWriter(arquivo);
            for (int j = 1; j <= 10; j++) {
                writer.println(numero + " x " + j + " = " + (numero * j));
            }
            writer.close();

        System.out.println("Arquivos enviados!");
    }
}