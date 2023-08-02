
val upercase_1:(String)-> String ={str:String ->str.uppercase()}

val upercase_2={str:String-> str.uppercase()}

val upercase_3:(String)-> String={it.uppercase()}



fun main(){
    println(upercase_1("hello"))
    println(upercase_2("hello"))
    println(upercase_3("hello"))
}