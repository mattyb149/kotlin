// MINIFICATION_THRESHOLD: 544
package foo

class Foo {
    fun bar(param: String): String {
        val local = "K"
        var a = object {
            val b = object {
                val bar = param + local
            }
        }
        return a.b.bar
    }
}

fun box(): String {
    return Foo().bar("O")
}

