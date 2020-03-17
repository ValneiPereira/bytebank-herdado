package com.bytebankherdado.app;

import com.bytebankherdado.entidade.Administrador;
import com.bytebankherdado.entidade.Gerente;
import com.bytebankherdado.util.SistemaInterno;

public class TesteSistema {
  public static void main(String[] args) {
    Gerente gerente = new Gerente();
    gerente.setSenha(2222);
    
    Administrador administrador = new Administrador();
    administrador.setSenha(222);
    
    SistemaInterno sistemaInterno = new SistemaInterno();
    sistemaInterno.autentica(administrador);
    sistemaInterno.autentica(gerente);
  }

}
