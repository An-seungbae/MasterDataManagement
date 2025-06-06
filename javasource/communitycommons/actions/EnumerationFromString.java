// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import communitycommons.Misc;
import communitycommons.proxies.LogLevel;
import java.util.Optional;
import com.mendix.systemwideinterfaces.core.UserAction;

/**
 * Use this Java action as a template for your own String-to-Enumeration conversions.
 * Studio Pro requires specifying the exact Enumeration to return in the definition of a Java action so we cannot provide a generic implementation.
 * This implementation will throw a NoSuchElementException if an invalid toConvert parameter is given, so remember to handle this error gracefully.
 */
public class EnumerationFromString extends UserAction<java.lang.String>
{
	private final java.lang.String toConvert;

	public EnumerationFromString(
		IContext context,
		java.lang.String _toConvert
	)
	{
		super(context);
		this.toConvert = _toConvert;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
            
                // Replace LogLevel.class by the proxy class for your Enumeration
		Optional<LogLevel> result = Misc.enumFromString(LogLevel.class, toConvert);
                return result.orElseThrow().name();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "EnumerationFromString";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
