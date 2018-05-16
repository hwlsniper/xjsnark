package xjsnark;

/*Generated by MPS */

import jetbrains.mps.smodel.language.LanguageRuntime;
import jetbrains.mps.smodel.adapter.ids.SLanguageId;
import java.util.UUID;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateModule;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.smodel.runtime.ILanguageAspect;
import jetbrains.mps.openapi.editor.descriptor.EditorAspectDescriptor;
import xjsnark.editor.EditorAspectDescriptorImpl;
import jetbrains.mps.smodel.runtime.StructureAspectDescriptor;

public class Language extends LanguageRuntime {
  public static String MODULE_REF = "0688d542-e2a3-492c-a31f-0e921fd6a8fb(xjsnark)";
  public Language() {
  }
  @Override
  public String getNamespace() {
    return "xjsnark";
  }

  @Override
  public int getVersion() {
    return 0;
  }

  public SLanguageId getId() {
    return new SLanguageId(UUID.fromString("0688d542-e2a3-492c-a31f-0e921fd6a8fb"));
  }
  @Override
  protected String[] getExtendedLanguageIDs() {
    return new String[]{"jetbrains.mps.baseLanguage"};
  }
  @Override
  public Collection<TemplateModule> getGenerators() {
    return TemplateUtil.<TemplateModule>asCollection(TemplateUtil.createInterpretedGenerator(this, "85721891-b740-461e-8f23-b508b4c309b4(xjsnark#7495353643815736419)"));
  }
  @Override
  protected <T extends ILanguageAspect> T createAspect(Class<T> aspectClass) {
    if (aspectClass == EditorAspectDescriptor.class) {
      return (T) new EditorAspectDescriptorImpl();
    }
    if (aspectClass == StructureAspectDescriptor.class) {
      return (T) new xjsnark.structure.StructureAspectDescriptor();
    }
    return super.createAspect(aspectClass);
  }
}
