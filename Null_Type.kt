fun main(){
    var name :String?=null  //It gives compilation error because you did not assign a string is null so we use an operator is ?
    println(name)//?
    
    if(name!=null){
        println("Not Null")
    }
}