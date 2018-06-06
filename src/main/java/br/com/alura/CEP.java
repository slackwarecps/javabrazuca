/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabioalvaro
 */
public class CEP {

    public static void main(String[] args) {
        ViaCEPClient client = new ViaCEPClient();
       
        try {
            ViaCEPEndereco endereco = client.getEndereco("82010340");
            System.out.println(endereco.getLogradouro());
        } catch (IOException ex) {
            Logger.getLogger(CEP.class.getName()).log(Level.SEVERE, null, ex);
        }
       

      
    }
}
