
import org.deckfour.xes.model.XLog;
import org.processmining.contexts.uitopia.UIPluginContext;
import org.processmining.contexts.uitopia.annotations.UITopiaVariant;
import org.processmining.framework.plugin.PluginContext;
import org.processmining.framework.plugin.annotations.Plugin;
import org.processmining.framework.plugin.annotations.PluginVariant;
 
@Plugin(name = "Person",
        parameterLabels = { "Log" },
        returnLabels = { "Child" },
        returnTypes = { Person.class })
public class PersonPlugin {
  @UITopiaVariant(affiliation = "University of Life",
                  author = "Britney J. Spears",
                  email = "britney@westergaard.eu",
                  uiLabel = UITopiaVariant.USEPLUGIN)
  @PluginVariant(requiredParameterLabels = { 0})
  public static Person procreate(final PluginContext context,
                                 final XLog Log,
                                 final PersonConfiguration config) {
    Person child = new Person(Log);
    child.ShowEjecutoresLog();
  
    return child;
  }
 
  @UITopiaVariant(affiliation = "University of Life",
                  author = "Britney J. Spears",
                  email = "britney@westergaard.eu",
                  uiLabel = UITopiaVariant.USEPLUGIN)
  @PluginVariant(requiredParameterLabels = { 0 })
  public static Person procreate(final UIPluginContext context,
                                 XLog log) {
    PersonConfiguration config = new PersonConfiguration("hola");
   // populate(context, config);
    return procreate(context, log, config);
  }
}
