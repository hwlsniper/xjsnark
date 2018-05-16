package xjsnark.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.descriptor.ConceptEditorComponent;
import java.util.Collection;
import java.util.Collections;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;

public class Component_Visibility implements ConceptEditorComponent {
  public Collection<String> getContextHints() {
    return Collections.emptyList();
  }
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_g2sicq_a(editorContext, node);
  }
  private EditorCell createCollection_g2sicq_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_g2sicq_a");
    editorCell.addEditorCell(this.createRefNode_g2sicq_a0(editorContext, node));
    return editorCell;
  }
  private EditorCell createRefNode_g2sicq_a0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Component_Visibility.visibilitySingleRoleHandler_g2sicq_a0(node, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x112670d273fL, 0x112670d886aL, "visibility"), editorContext);
    return provider.createCell();
  }
  private class visibilitySingleRoleHandler_g2sicq_a0 extends SingleRoleCellProvider {
    public visibilitySingleRoleHandler_g2sicq_a0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      editorCell.setSubstituteInfo(new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext));
      if (editorCell.getRole() == null) {
        editorCell.setRole("visibility");
      }
      Style style = new StyleImpl();
      BaseLanguageStyle_StyleSheet.apply_CompactKeyWord(style, editorCell);
      editorCell.getStyle().putAll(style);
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = super.createEmptyCell();
      editorCell.setCellId("empty_visibility");
      installCellInfo(null, editorCell);
      return editorCell;
    }
    protected String getNoTargetText() {
      return "/*hello*/";
    }
  }
}
