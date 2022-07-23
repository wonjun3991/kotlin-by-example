fun main(){
    var a: String = "initial"
    println(a)

    val b: Int = 1
    println(b)
    val c = 3
    println(c)

    a = "testing"
    println(a)
//    b = 3
//    println(b) Val cannot be reassigned

    val d: Int

    if (someCondition()) {
        d = 1
    } else {
        d = 2
    }

    println(d)
}

fun someCondition(): Boolean {
//    return true
    return false
}