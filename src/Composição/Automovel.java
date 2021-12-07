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
public class Automovel {
    Motor motor;
    private Direcao direcao;
    
    public void ligarPelaPrimeiraVez(){
        motor = new Motor();
    }
    
    public void ligarPelaPrimeiraVez(){
        motor = new Motor(int potencia);
    }
    
    public Automovel(){
        motor = new Motor();
    }
    
    public Automovel(int potencia){
        motor = new Motor(potencia);
    }

    Automovel(int 1000) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void ligarPelaPrimeiraVez(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
