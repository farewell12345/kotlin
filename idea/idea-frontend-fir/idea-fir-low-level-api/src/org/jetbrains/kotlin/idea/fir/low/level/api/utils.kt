/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.fir.low.level.api

import org.jetbrains.kotlin.fir.FirElement
import org.jetbrains.kotlin.fir.diagnostics.FirDiagnosticHolder

internal val FirElement.isErrorElement
    get() = this is FirDiagnosticHolder