// MINIFICATION_THRESHOLD: 578
package foo

enum class A {
    X,
    Y
}

fun box(): String {
    val a : Any = A.X
    assertEquals(0, (a as Comparable<A>).compareTo(A.X))
    assertTrue((a as Comparable<A>).compareTo(A.Y) < 0)

    return "OK"
}