// MINIFICATION_THRESHOLD: 541
package foo

object A {
    object B {
        val lambda = { "OK" }
    }
}

fun box() = A.B.lambda()

