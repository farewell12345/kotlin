// !USE_EXPERIMENTAL: kotlin.ExperimentalStdlibApi
// TODO change to target all backends and fix failing mechanic
// TARGET_BACKEND: JS
// WITH_REFLECT
// KJS_WITH_FULL_RUNTIME

import kotlin.reflect.typeOf

fun <T : Comparable<T>> foo() {
    typeOf<List<T>>()
}

fun box(): String {
    foo<Int>()
    return "OK"
}