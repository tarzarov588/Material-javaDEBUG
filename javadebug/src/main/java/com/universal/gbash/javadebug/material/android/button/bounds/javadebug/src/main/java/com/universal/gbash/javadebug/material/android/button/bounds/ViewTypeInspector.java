package com.universal.gbash.javadebug.material.android.button.bounds;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.Objects;

/**

* Identifica classes e categorias comuns de componentes Android.
  */
  public final class ViewTypeInspector {
  
  private ViewTypeInspector() {
  // Impede a instanciação.
  }
  
  /**
  
  * Retorna o nome completo da classe do componente.
    */
    public static String getClassName(View view) {
    Objects.requireNonNull(view, "O componente não pode ser nulo.");
    
    return view.getClass().getName();
    }
  
  /**
  
  * Retorna uma categoria para componentes Android comuns.
    */
    public static String getComponentType(View view) {
    Objects.requireNonNull(view, "O componente não pode ser nulo.");
    
    if (view instanceof ImageButton) {
    return "ImageButton";
    }
    
    if (view instanceof ToggleButton) {
    return "ToggleButton";
    }
    
    if (view instanceof CheckBox) {
    return "CheckBox";
    }
    
    if (view instanceof RadioButton) {
    return "RadioButton";
    }
    
    if (view instanceof EditText) {
    return "EditText";
    }
    
    if (view instanceof Button) {
    return "Button";
    }
    
    if (view instanceof TextView) {
    return "TextView";
    }
    
    if (view instanceof ImageView) {
    return "ImageView";
    }
    
    if (view instanceof ProgressBar) {
    return "ProgressBar";
    }
    
    return "View";
    }
  
  /**
  
  * Retorna o identificador numérico do componente.
    */
    public static int getComponentId(View view) {
    Objects.requireNonNull(view, "O componente não pode ser nulo.");
    
    return view.getId();
    }
  
  /**
  
  * Retorna o nome da entrada de recurso associada ao ID,
  
  * ou null se o componente não tiver um ID nomeado.
    */
    public static String getResourceEntryName(View view) {
    Objects.requireNonNull(view, "O componente não pode ser nulo.");
    
    int id = view.getId();
    
    if (id == View.NO_ID) {
    return null;
    }
    
    try {
    return view.getResources().getResourceEntryName(id);
    } catch (android.content.res.Resources.NotFoundException exception) {
    return null;
    }
    }
    }