// MINIFICATION_THRESHOLD: 547
// See KT-11823
package foo

class Outer(val x: Int) {
    inner class Inner() {
        fun foo() = { x }
    }
}

fun box(): String {
    assertEquals(23, Outer(23).Inner().foo()())
    return "OK"
}