package com.universal.gbash.javadebug.material.android.button.bounds;

import android.graphics.Rect;
import android.view.View;

import java.util.Objects;

/**

* Inspeciona a área de toque e a capacidade de clique de componentes.
  */
  public final class ClickAreaInspector {
  
  private ClickAreaInspector() {
  // Impede a instanciação.
  }
  
  /**
  
  * Verifica se o componente está habilitado e aceita cliques.
    */
    public static boolean isClickable(View view) {
    Objects.requireNonNull(view, "O componente não pode ser nulo.");
    
    return view.isClickable() && view.isEnabled();
    }
  
  /**
  
  * Verifica se o componente está habilitado e aceita eventos de toque.
    */
    public static boolean isTouchable(View view) {
    Objects.requireNonNull(view, "O componente não pode ser nulo.");
    
    return view.isEnabled()
    && view.getVisibility() == View.VISIBLE;
    }
  
  /**
  
  * Retorna os limites locais do componente.
    */
    public static Rect getClickAreaBounds(View view) {
    Objects.requireNonNull(view, "O componente não pode ser nulo.");
    
    return new Rect(
    0,
    0,
    view.getWidth(),
    view.getHeight()
    );
    }
  
  /**
  
  * Retorna a largura da área local do componente, em pixels.
    */
    public static int getClickAreaWidth(View view) {
    Objects.requireNonNull(view, "O componente não pode ser nulo.");
    
    return view.getWidth();
    }
  
  /**
  
  * Retorna a altura da área local do componente, em pixels.
    */
    public static int getClickAreaHeight(View view) {
    Objects.requireNonNull(view, "O componente não pode ser nulo.");
    
    return view.getHeight();
    }
    }