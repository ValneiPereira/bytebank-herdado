package com.bytebankherdado.app;

import com.bytebankherdado.entidade.Gerente;
import com.bytebankherdado.util.SistemaInterno;

public class TesteSistema {
  public static void main(String[] args) {
    Gerente g = new Gerente();
    g.setSenha(2222);

    SistemaInterno si = new SistemaInterno();

    si.autentica(g);
  }

}
