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
public class Direcao {
    private String cor;

    public Direcao(){
        cor="amarelo";
    }

    public Direcao(String cor){
        this.cor = cor;
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
