package xjsnark.behavior;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.behavior.ClassifierMember_BehaviorDescriptor;
import jetbrains.mps.lang.core.behavior.ImplementationPart_BehaviorDescriptor;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.smodel.behaviour.DefaultValuesHolder;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.baseLanguage.scopes.MembersPopulatingContext;

/**
 * Will be removed after 3.3
 * Need to support compilation of the legacy behavior descriptors before the language is rebuilt
 * This class is not involved in the actual method invocation
 */
@Deprecated
public class VerifiedWitnessBlock_BehaviorDescriptor extends LabelBlock_BehaviorDescriptor implements ClassifierMember_BehaviorDescriptor, ImplementationPart_BehaviorDescriptor {
  public boolean virtual_canBeInterfaceMember_2949815620938109095(SConcept __thisConcept__) {
    return DefaultValuesHolder.defaultValue(Boolean.TYPE);
  }
  public boolean virtual_isStatic_7405920559687241224(SNode __thisNode__) {
    return DefaultValuesHolder.defaultValue(Boolean.TYPE);
  }
  public boolean virtual_isStatic_8986964027630462944(SNode __thisNode__) {
    return DefaultValuesHolder.defaultValue(Boolean.TYPE);
  }
  public boolean virtual_isVisible_6145907390641297352(SNode __thisNode__, SNode contextClassifierType, SNode contextNode) {
    return DefaultValuesHolder.defaultValue(Boolean.TYPE);
  }
  public boolean virtual_isVisible_8083692786967482069(SNode __thisNode__, SNode contextClassifier, SNode contextNode) {
    return DefaultValuesHolder.defaultValue(Boolean.TYPE);
  }
  public boolean virtual_needsEmptyLineAfter_641490355014298838(SNode __thisNode__) {
    return DefaultValuesHolder.defaultValue(Boolean.TYPE);
  }
  public boolean virtual_needsEmptyLineBefore_641490355014296733(SNode __thisNode__) {
    return DefaultValuesHolder.defaultValue(Boolean.TYPE);
  }
  public void virtual_populateMember_7405920559687254644(SNode __thisNode__, MembersPopulatingContext context, SNode classifier) {
  }

  @Override
  public String getConceptFqName() {
    return "xjsnark.structure.VerifiedWitnessBlock";
  }

}
