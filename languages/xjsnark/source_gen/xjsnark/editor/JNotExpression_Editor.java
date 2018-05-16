package xjsnark.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class JNotExpression_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_i1oiyd_a(editorContext, node);
  }
  private EditorCell createCollection_i1oiyd_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_i1oiyd_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createConstant_i1oiyd_a0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_i1oiyd_b0(editorContext, node));
    return editorCell;
  }
  private EditorCell createConstant_i1oiyd_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "not");
    editorCell.setCellId("Constant_i1oiyd_a0");
    Style style = new StyleImpl();
    BaseLanguageStyle_StyleSheet.apply_Operator(style, editorCell);
    style.set(StyleAttributes.TEXT_COLOR, 0, StyleRegistry.getInstance().getSimpleColor(MPSColors.blue));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_i1oiyd_b0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new JNotExpression_Editor.expressionSingleRoleHandler_i1oiyd_b0(node, MetaAdapterFactory.getContainmentLink(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c182aa15L, 0xfbcf6c30a4L, "expression"), editorContext);
    return provider.createCell();
  }
  private class expressionSingleRoleHandler_i1oiyd_b0 extends SingleRoleCellProvider {
    public expressionSingleRoleHandler_i1oiyd_b0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
        editorCell.setRole("expression");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = super.createEmptyCell();
      editorCell.setCellId("empty_expression");
      installCellInfo(null, editorCell);
      return editorCell;
    }
    protected String getNoTargetText() {
      return "<no expression>";
    }
  }
}
