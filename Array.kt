fun main(){
    val countryNames=arrayOf("India","Usa","Russia","France")
    
    for (cn in countryNames){
        print(cn+" ")
    }
    
    println()
    val arr=arrayOf(423,534,55.99,987.3,55,32)
    arr.forEach{
        print("$it ")
    }
}