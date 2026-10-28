package com.universal.gbash.javadebug.material.android.button.bounds;

import android.graphics.Rect;
import android.view.View;

import java.util.Objects;

/**

* Inspeciona a posição de componentes na interface Android.
  */
  public final class ViewPositionInspector {
  
  private ViewPositionInspector() {
  // Impede a instanciação.
  }
  
  /**
  
  * Retorna as coordenadas locais do componente.
  
  * Ordem: esquerda, topo, direita e base.
    */
    public static int[] getLocalPosition(View view) {
    Objects.requireNonNull(view, "O componente não pode ser nulo.");
    
    return new int[] {
    view.getLeft(),
    view.getTop(),
    view.getRight(),
    view.getBottom()
    };
    }
  
  /**
  
  * Retorna a posição do componente na tela, em pixels inteiros.
  
  * Ordem: X e Y.
    */
    public static int[] getScreenPosition(View view) {
    Objects.requireNonNull(view, "O componente não pode ser nulo.");
    
    int[] position = new int[2];
    view.getLocationOnScreen(position);
    
    return position;
    }
  
  /**
  
  * Retorna a posição do componente na janela, em pixels inteiros.
  
  * Ordem: X e Y.
    */
    public static int[] getWindowPosition(View view) {
    Objects.requireNonNull(view, "O componente não pode ser nulo.");
    
    int[] position = new int[2];
    view.getLocationInWindow(position);
    
    return position;
    }
  
  /**
  
  * Retorna os limites visíveis do componente na tela.
    */
    public static Rect getVisibleScreenBounds(View view) {
    Objects.requireNonNull(view, "O componente não pode ser nulo.");
    
    Rect bounds = new Rect();
    view.getGlobalVisibleRect(bounds);
    
    return bounds;
    }
    }