package com.universal.gbash.javadebug.material.android.button.bounds;

import android.graphics.Rect;
import android.view.View;

import java.util.Objects;

/**

* Inspeciona os limites e as dimensões de componentes Android.

* 

* Esta classe pertence à biblioteca Material javaDEBUG.
  */
  public final class ButtonBoundsInspector {
  
  private ButtonBoundsInspector() {
  // Impede a instanciação desta classe utilitária.
  }
  
  /**
  
  * Obtém os limites de um componente em relação à sua janela.
  
  * 
  
  * @param view componente que será inspecionado
  
  * @return retângulo com os limites do componente
    */
    public static Rect getBoundsInWindow(View view) {
    Objects.requireNonNull(view, "O componente não pode ser nulo.");
    
    Rect bounds = new Rect();
    view.getGlobalVisibleRect(bounds);
    return bounds;
    }
  
  /**
  
  * Obtém a largura medida do componente, em pixels.
    */
    public static int getWidth(View view) {
    Objects.requireNonNull(view, "O componente não pode ser nulo.");
    return view.getWidth();
    }
  
  /**
  
  * Obtém a altura medida do componente, em pixels.
    */
    public static int getHeight(View view) {
    Objects.requireNonNull(view, "O componente não pode ser nulo.");
    return view.getHeight();
    }
  
  /**
  
  * Obtém os limites locais do componente.
    */
    public static Rect getLocalBounds(View view) {
    Objects.requireNonNull(view, "O componente não pode ser nulo.");
    
    return new Rect(
    0,
    0,
    view.getWidth(),
    view.getHeight()
    );
    }
    }