// MINIFICATION_THRESHOLD: 542
package foo

inline fun block(p: () -> Int) = p()

fun createFunction(x: Int): () -> Int = { x }

fun box(): String {
    assertEquals(23, block(createFunction(23)))
    return "OK"
}