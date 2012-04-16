package org.techdebt.annotations;

/**
 * An annotation used to mark an item of tech debt within a project.
 * <p>
 * Developers can use this annotation as follows:
 * <p>
 * <code>
 * @TechDebt(1, "remove main method")
 * <br>
 * public static void main(String[] args)
 * </code>
 * <p>
 * This would signify that the author wishes to comment 1 line of tech debt.
 * Alternatively, you can specify a severity with this as well:
 * <p>
 * <code>
 * @TechDebt(1, "remove main method", Severity.TRIVIAL)
 * <br>
 * public static void main(String[] args)
 * </code>
 * <p>
 * See the <code>Severity</code> annotation.
 * 
 * @author jsvede
 *
 */
public @interface TechDebt {

	int numberOfLines() ;
	String comment() ;
	Severity severity() ;
}
