// MINIFICATION_THRESHOLD: 542
// MODULE_KIND: AMD
package foo

@JsModule("lib")
external fun foo(y: Int): Int = definedExternally

fun box(): String {
    assertEquals(65, foo(42))
    return "OK"
}