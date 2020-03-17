package com.bytebankherdado.service;

import com.bytebankherdado.interfaces.Tributavel;

public class SeguroDeVida implements Tributavel{

  @Override
  public double getValorImposto() {
    
    return 42;
  }

}
