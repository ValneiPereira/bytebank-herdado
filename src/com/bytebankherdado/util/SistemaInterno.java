package com.bytebankherdado.util;

import com.bytebankherdado.entidade.Funcionario;

public class SistemaInterno {

  private int senha = 222;

  public void autentica(Funcionario g) {
    boolean autentucou = g.autentica(this.senha);
    if (autentucou) {
      System.out.println("Pode entrar no sistema!!");
    } else {
      System.out.println("Não autorizado!!!");
    }

  }

}
