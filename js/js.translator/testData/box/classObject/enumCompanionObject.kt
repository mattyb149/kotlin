// MINIFICATION_THRESHOLD: 576
// See KT-6326, KT-6777
package foo

enum class Foo {
    A;

    companion object {
        val a = A
    }
}

fun box(): String {
    assertEquals("A", Foo.a.name)
    return "OK"
}