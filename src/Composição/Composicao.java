/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composição;

/**
 *
 * @author IFSC
 */
public class Composicao {
    public static void main(String[] args) {
        //1
        Automovel uno = new Automovel();
        Automovel gol = new Automovel(2000);
        
        //2
        Automovel carro = new Automovel();
        carro.ligarPelaPrimeiraVez();
        carro.ligarPelaPrimeiraVez(1600);
        
        //3
        Automovel moto = new Automovel();
        Motor motor = new Motor();
        Motor motor2 = new Motor(1000);
        moto.setMotor
               
    }
}
