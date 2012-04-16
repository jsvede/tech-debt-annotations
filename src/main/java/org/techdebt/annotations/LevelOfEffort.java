package org.techdebt.annotations;

/**
 * Used to captured the estimated level of effort
 * required to fix this item of tech debt. The levels
 * of effort are modeled into the <code>Effort</code> enum.
 * 
 * @author jsvede
 *
 */
public @interface LevelOfEffort {
	Effort effort() ;
}
