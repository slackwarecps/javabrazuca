/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura;

import br.com.caelum.stella.validation.CNPJValidator;

import br.com.caelum.stella.validation.InvalidStateException;

/**
 *
 * @author fabioalvaro
 */
public class ValidaCnpj {
    public static void main(String[] args) {
        
        // String cpf = "26721993880";
        
        String cnpj = "54138516000126";
        
        CNPJValidator validador = new CNPJValidator();

        try {
            validador.assertValid(cnpj);
             System.out.println("CNPJ Válido: ");
        } catch (InvalidStateException e) {
            System.out.println("CNPJ Invalido: " + e);
        }

        System.out.println("Entrou");
    }
    
}
