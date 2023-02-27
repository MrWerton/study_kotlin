class Dog(name: String, age: Int, private val myOwner: Person) : Animal(name, age) {
   fun makeSound(){
      return println("au au")
   }

    fun walking(){
        return println("Walking with ${myOwner.name}")
    }
}