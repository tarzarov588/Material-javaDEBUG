package com.universal.gbash.javadebug.material.android.button.bounds;

import android.view.View;
import android.view.ViewGroup;

import java.util.Objects;

/**

* Inspeciona margens e espaçamentos internos de componentes Android.
  */
  public final class ViewSpacingInspector {
  
  private ViewSpacingInspector() {
  // Impede a instanciação.
  }
  
  /**
  
  * Retorna as margens na ordem:
  
  * esquerda, topo, direita e base.
  
  * 
  
  * Os valores são expressos em pixels.
    */
    public static int[] getMargins(View view) {
    Objects.requireNonNull(view, "O componente não pode ser nulo.");
    
    ViewGroup.LayoutParams params = view.getLayoutParams();
    
    if (!(params instanceof ViewGroup.MarginLayoutParams)) {
    return new int[] {0, 0, 0, 0};
    }
    
    ViewGroup.MarginLayoutParams margins =
    (ViewGroup.MarginLayoutParams) params;
    
    return new int[] {
    margins.leftMargin,
    margins.topMargin,
    margins.rightMargin,
    margins.bottomMargin
    };
    }
  
  /**
  
  * Retorna os espaçamentos internos na ordem:
  
  * esquerda, topo, direita e base.
  
  * 
  
  * Os valores são expressos em pixels.
    */
    public static int[] getPadding(View view) {
    Objects.requireNonNull(view, "O componente não pode ser nulo.");
    
    return new int[] {
    view.getPaddingLeft(),
    view.getPaddingTop(),
    view.getPaddingRight(),
    view.getPaddingBottom()
    };
    }
    }