package xjsnark.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;

public class MultiLineCommentClassMember_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_8zdjs6_a(editorContext, node);
  }
  private EditorCell createCollection_8zdjs6_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_8zdjs6_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createConstant_8zdjs6_a0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_8zdjs6_b0(editorContext, node));
    return editorCell;
  }
  private EditorCell createConstant_8zdjs6_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "/**");
    editorCell.setCellId("Constant_8zdjs6_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_8zdjs6_b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "**/");
    editorCell.setCellId("Constant_8zdjs6_b0");
    editorCell.setDefaultText("");
    return editorCell;
  }
}
