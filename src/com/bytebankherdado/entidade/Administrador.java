package com.bytebankherdado.entidade;

import com.bytebankherdado.util.AutenticacaoUtil;
import com.bytebankherdado.util.Autenticavel;

public class Administrador extends Funcionario implements Autenticavel {

  private AutenticacaoUtil autenticador;

  public Administrador() {
    this.autenticador = new AutenticacaoUtil();
  }

  public void setSenha(int senha) {
    this.autenticador.setSenha(senha);
  }

  public boolean autentica(int senha) {
    return this.autenticador.autentica(senha);
  }

  @Override
  public double getBonificacao() {

    return 0;
  }

}
