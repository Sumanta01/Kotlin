fun main(){
    val lst=listOf("Sumanta","Johny","Harry",656)
    print("$lst ")
    
    // lst[0]="Swain" //Gives Compilation error because List is Immutable in Kotlin
    // println(lst[0])
    val lst2=mutableListOf<String>("SAT","C++","Kotlin","Java","C")//create Mutable list
    lst2[0]="Python"
    for (names in lst2){
        print("$names ")
    }
}