package com.bytebankherdado.entidade;

import com.bytebankherdado.interfaces.Autenticavel;
import com.bytebankherdado.util.AutenticacaoUtil;

public class Cliente implements Autenticavel {

  private AutenticacaoUtil autenticador;

  public Cliente() {
    this.autenticador = new AutenticacaoUtil();
  }

  public void setSenha(int senha) {
    this.autenticador.setSenha(senha);
  }

  public boolean autentica(int senha) {
    return this.autenticador.autentica(senha);
  }
}
