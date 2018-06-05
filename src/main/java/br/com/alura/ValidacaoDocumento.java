/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.TituloEleitoralValidator;

/**
 *
 * @author fabioalvaro
 */
public class ValidacaoDocumento {

    public static void main(String[] args) {

        //String cpf = "26721993880";
        String cpf = "26721993899";
        String tituloEleitor = "757888710124";
        
        CPFValidator validador = new CPFValidator();
        try {
            validador.assertValid(cpf);
             System.out.println("CPF Válido: ");
        } catch (InvalidStateException e) {
            System.out.println("CPF Invalido: " + e);
        }
        
        //Titulo
        TituloEleitoralValidator validadorTitulo = new TituloEleitoralValidator();
        try {
            validadorTitulo.assertValid(tituloEleitor);
             System.out.println("Titulo Eleitor Válido: ");
        } catch (InvalidStateException e) {
            System.out.println("Titulo Invalido: " + e);
        }
        
        

        System.out.println("Entrou");
    }
}
