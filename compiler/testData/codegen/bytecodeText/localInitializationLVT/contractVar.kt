// IGNORE_BACKEND: JVM_IR
// TODO KT-36812 Generate proper lifetime intervals for local variables in JVM_IR
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

@ExperimentalContracts
fun test(): Char {
    var c: Char
    doIt {
        c = ' '
    }
    return c
}

@ExperimentalContracts
fun doIt(block: () -> Unit) {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }
    block()
}

// 0 ISTORE 0
// 1 LOCALVARIABLE c Lkotlin/jvm/internal/Ref\$CharRef; L1 L3 0

// JVM_IR_TEMPLATES
// 0 ISTORE 0
// 1 LOCALVARIABLE c Lkotlin/jvm/internal/Ref\$CharRef; L1 L4 0