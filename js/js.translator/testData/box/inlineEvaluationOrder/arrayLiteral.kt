// MINIFICATION_THRESHOLD: 550
package foo

fun box(): String {
    assertArrayEquals(arrayOf(1, 2), arrayOf(fizz(1), buzz(2)))
    assertEquals("fizz(1);buzz(2);", pullLog())

    return "OK"
}