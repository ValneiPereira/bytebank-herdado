package com.bytebankherdado.app;

import com.bytebankherdado.service.ContaCorrente;
import com.bytebankherdado.service.SeguroDeVida;
import com.bytebankherdado.util.CalculadorDeImposto;

public class TesteTributaveis {
  public static void main(String[] args) {
    ContaCorrente contaCorrente= new ContaCorrente(222, 763146);
    contaCorrente.deposita(100.0);
    
    SeguroDeVida seguroDeVida = new SeguroDeVida();
    
    CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
    
    calculadorDeImposto.registra(contaCorrente);
    calculadorDeImposto.registra(seguroDeVida);
    
    System.out.println(calculadorDeImposto.getTotalImposto());
  }

}
