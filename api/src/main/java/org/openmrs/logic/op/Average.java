/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.logic.op;

/**
 * The Average operator will calculate the average result from a collection of result returned by
 * the logic expression<br />
 * <br />
 * Example: <br />
 * - <code>logicService.parse("'CD4 COUNT'").average();</code><br />
 * The above will give us a criteria to get the average result of the "CD4 COUNT" observations
 */
public class Average implements TransformOperator {
	
	public String toString() {
		return "Average";
	}
	
}
