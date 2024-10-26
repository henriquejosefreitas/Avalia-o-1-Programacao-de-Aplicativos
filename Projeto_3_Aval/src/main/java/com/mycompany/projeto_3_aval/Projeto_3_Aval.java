/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_3_aval;

import java.util.Scanner;

/**
 *
 * @author h.moreira
 */
public class Projeto_3_Aval {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Faça seu pedido, digite o numero de uma das opcoes:");
        System.out.println("1 - café expresso");
        System.out.println("2 - café capuccino");
        System.out.println("3 - leite com café");
        System.out.println("Ao terminar digite 4");
        int pedido = scan.nextInt();
        double total1;
        double total2;
        double total3;
        double total = total1+total2+total3;
        int Qunt1;
        int Qunt2;
        int Qunt3;
        int Qunt = Qunt1+Qunt2+Qunt3;
        
        while(pedido!= 4){
        System.out.println("Mais alguma coisa?");
        pedido = scan.nextInt();   
        if(pedido==1){
            
        total1 = total1 + 0.75;
        Qunt1 = Qunt1 + 1;
        
        }else if(pedido==2){
            
        total2 = total2 + 1.00;
        Qunt2 = Qunt2 + 1;
        
        }else if(pedido==3){
        
        total3 = total3 + 1.25;
        Qunt3 = Qunt3 + 1;
        
        }
        }
        
        System.out.println("Quantidade e valor de café expresso vendido:");
        System.out.println("quant: "+Qunt+" "+"valor: R$"+total1+"\n"); 
        System.out.println("quantidade e valor de café capuccino vendido");
        System.out.println("quant: "+Qunt+" "+"valor: R$"+total2+"\n"); 
        System.out.println("quantidade e valor de leite com café vendido");
        System.out.println("quant: "+Qunt+" "+"valor: R$"+total3+"\n"); 
        System.out.println("quantidade e valor de todos cafés vendidos");
        System.out.println("quant: "+Qunt+" "+"valor: R$"+total+"\n");      

    }
}