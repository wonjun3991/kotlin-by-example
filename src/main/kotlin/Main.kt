open class Dog {
    open fun sayHello() {
        println("wow wow!")
    }
}

class Yorkshire : Dog() {
    override fun sayHello() {
        println("wif wif!")
    }
}

//class YorkshireInheritance: Yorkshire(){ //Kotlin Class Default set final
//
//}

open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia")

fun main() {
    val dog: Dog = Dog()
    val dogYorkshire: Dog = Yorkshire()
    dog.sayHello()
    dogYorkshire.sayHello()

    val siberianTiger: Tiger = SiberianTiger()
    siberianTiger.sayHello()

    val tiger: Tiger = Tiger("Origin Tiger")
    tiger.sayHello()
}