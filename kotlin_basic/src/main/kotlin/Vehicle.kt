// every the class in kotlin are closed. Open is required To make the class open

open class Animal(val name: String, val age: Int) {
    fun eat() {
        println("eating...")
    }

    fun sleep() {
        println("sleeping.")
    }
}
