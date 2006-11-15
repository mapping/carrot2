
/*
 * Carrot2 project.
 *
 * Copyright (C) 2002-2006, Dawid Weiss, Stanisław Osiński.
 * Portions (C) Contributors listed in "carrot2.CONTRIBUTORS" file.
 * All rights reserved.
 *
 * Refer to the full license file "carrot2.LICENSE"
 * in the root folder of the repository checkout or at:
 * http://www.carrot2.org/carrot2.LICENSE
 */

package org.carrot2.util.tokenizer.languages;

import org.carrot2.core.linguistic.Language;
import org.carrot2.util.tokenizer.languages.danish.Danish;

/**
 * Test of the Danish language.
 *  
 * @author Dawid Weiss
 * @version $Revision$
 */
public class DanishTest extends LanguageImplTestBase {

	public DanishTest() {
		super();
	}

	public DanishTest(String arg0) {
		super(arg0);
	}

	protected Language getLanguageInstance() {
        return new Danish();
	}

    protected String [][] getWordsToCompare() {
        return new String [][] {
                /* TODO: Add words here. */
        };
    }
}