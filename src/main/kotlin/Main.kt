class Customer

class Contact(private val id: Int,private var email: String){
    fun getId(): Int {
        return this.id
    }

    fun setEmail(email: String){
        this.email = email
    }

    fun getEmail(): String{
        return this.email
    }
}

fun main() {

    val customer = Customer()

    val contact = Contact(1, "mary@gmail.com")

//    println(contact.id)

    println(contact.getId())
    println(contact.getEmail())
    println(contact.setEmail("test@gmail.com"))
    println(contact.getEmail())
}