// MINIFICATION_THRESHOLD: 567
package foo

enum class E {
    OK
}

fun box(): String {
    return E.OK.name
}