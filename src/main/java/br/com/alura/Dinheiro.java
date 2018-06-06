/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.NumericToWordsConverter;
import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.NumberValue;
import org.javamoney.moneta.Money;
import org.javamoney.moneta.function.MonetaryOperators;

/**
 *
 * @author fabioalvaro
 */
public class Dinheiro {
    public static void main(String[] args) {
        
        //primeira coisa é criar a moeda
        CurrencyUnit moeda = Monetary.getCurrency("BRL");
        MonetaryAmount valorDaParcela = Money.of(75,moeda);
        System.out.println("Valor: "+valorDaParcela);
        MonetaryAmount valorTotal = valorDaParcela.multiply(12);
        System.out.println("Valor Total: "+valorTotal);
        MonetaryAmount desconto = valorTotal.with(MonetaryOperators.percent(10));
        System.out.println("Desconto "+desconto);
               
        NumberValue descontoSemMoeda = desconto.getNumber();
        
        NumericToWordsConverter conversor = new NumericToWordsConverter(new FormatoDeReal());
        String valorPorExtenso = conversor.toWords(descontoSemMoeda.doubleValue());
        System.out.println("Ola Aluno. ganhe "+valorPorExtenso+" ouvindo nosso podcast. LINK");
        
        
        
    }
}
