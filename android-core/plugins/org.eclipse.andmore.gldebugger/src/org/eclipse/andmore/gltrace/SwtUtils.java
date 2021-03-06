/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.eclipse.andmore.gltrace;

import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Control;

public class SwtUtils {
	/** Minimum Character width in pixels. */
	private static final int MIN_CHAR_WIDTH = 10;

	/** Returns the font width if it is greater than {@link #MIN_CHAR_WIDTH}. */
	public static int getApproximateFontWidth(Control c) {
		GC gc = new GC(c);
		int avgCharWidth = gc.getFontMetrics().getAverageCharWidth();
		gc.dispose();
		return Math.max(avgCharWidth, MIN_CHAR_WIDTH);
	}
}
