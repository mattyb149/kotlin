// MINIFICATION_THRESHOLD: 535
package foo

class A() {
    fun doSomething() {
    }
}

fun box(): String {
    var a: A? = null;
    a?.doSomething()
    return "OK"
}