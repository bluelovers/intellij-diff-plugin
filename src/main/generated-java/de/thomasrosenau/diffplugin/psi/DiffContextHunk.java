// This is a generated file. Not intended for manual editing.
package de.thomasrosenau.diffplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DiffContextHunk extends PsiElement {

  @NotNull
  DiffContextHunkFrom getContextHunkFrom();

  @NotNull
  DiffContextHunkTo getContextHunkTo();

}