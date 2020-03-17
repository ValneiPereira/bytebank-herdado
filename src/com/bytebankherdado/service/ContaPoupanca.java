package com.bytebankherdado.service;

import com.bytebankherdado.entidade.Conta;

public class ContaPoupanca  extends Conta{

  public ContaPoupanca(int agencia, int numero) {
    super(agencia, numero);
    
  }

  @Override
  public void deposita(double valor) {
    super.saldo += valor;
    
  }
  
}
