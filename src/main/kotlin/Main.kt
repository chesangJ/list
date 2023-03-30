fun main() {
val x=names(listOf("Zero","One","Two","Three","Four"))
    println(x)
    val man= listOf(30.5,40.5,50.0,60.0,70.0,80.0)
    val (avg,total)=height(man)
    println(avg)
    println(total)

}
fun names(x:List<String>):List<String>{
    var z = mutableListOf<String>()
    for (word in x.indices step 2 ){
        z.add(x[word])
        }
    return z
}
fun height(m:List<Double>):Pair<Double,Double>{
    var avg= m.average()
    var total=m.sum()
    return Pair(avg,total)
}
data class person(var name:String,var age:Int,var height:Int,var weight:Int){
    fun people(){
        val prod1 =person("Joy",)
        val switch = person()
        val persons = listOf<person>(prod1, switch)
        println(persons)
        val sorted = persons.sortedBy { person -> person.name}
        println(sorted)





    }
}
