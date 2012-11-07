/**
 * Copyright (c) 2012 Michael Kutschke.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Michael Kutschke - initial API and implementation.
 */
package org.eclipse.recommenders.tests.jayes.testgeneration;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.recommenders.jayes.BayesNode;

public class TestCase {
	
	public Map<BayesNode,String> evidence = new HashMap<BayesNode,String>();
	public Map<BayesNode,double[]> beliefs = new HashMap<BayesNode,double[]>();

}