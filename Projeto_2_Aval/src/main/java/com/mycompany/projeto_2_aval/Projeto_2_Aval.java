/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_2_aval;

import java.util.Scanner;

/**
 *
 * @author h.moreira
 */
public class Projeto_2_Aval {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite Quantos anos tem em anos, meses e dias");
        System.out.println("Digite anos:");
        int ano = scan.nextInt();
        System.out.println("Digite meses:");
        int mes = scan.nextInt();
        System.out.println("Digite dias:");
        int dia = scan.nextInt();
        
        int anos = 365;
        int meses = 30;
        int soma = (ano*anos)+(mes*meses)+dia;
        
        System.out.println(ano+" anos, "+mes+" meses e "+dia+" dias = "+soma);

                
    }
}