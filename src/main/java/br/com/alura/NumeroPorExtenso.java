/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.InteiroSemFormato;
import br.com.caelum.stella.inwords.NumericToWordsConverter;
import java.math.BigDecimal;

/**
 *
 * @author fabioalvaro
 */
public class NumeroPorExtenso {
    public static void main(String[] args) {
        NumericToWordsConverter conversor = new NumericToWordsConverter(new InteiroSemFormato());
        
        BigDecimal valor =  new BigDecimal("75.00");
        
        String valorporExtenso = conversor.toWords(valor.doubleValue());
        
        System.out.println("Valor por extenso: "+valorporExtenso);
        
        
         NumericToWordsConverter conversor2 = new NumericToWordsConverter(new FormatoDeReal());
        
        BigDecimal valor2 =  new BigDecimal("75.99");
        
        String valorporExtenso2 = conversor2.toWords(valor2.doubleValue());
        
        System.out.println("Valor por extenso: "+valorporExtenso2); 
    }
   
}
