fun main() {
    campus()
    var w =one("stephanie",20)
    println(w)
    var b = two("Iam hardworking",23)
    println(b)
    massage("Emmily")
}
fun campus(){
    var campus = "akirachix"
    println(campus[0])
    println(campus[2])
    println(campus[3])
}

fun one(name: String, age: Int): String{
    var sentence = "Hi, my name is $name I am $age years old"
    return sentence
}
fun two(text: String, lenth: Int): String{
    var text = ("I am hardworking $lenth" )
    return text
}
fun massage(name: String){
    var iAm = "Steph"
    if (name.equals (iAm)){
        println("That's me!")
    }else{
        println("I don't know who that is")
    }


}








