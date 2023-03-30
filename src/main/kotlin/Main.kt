fun main() {

val x=names(listOf("Zero","One","Two","Three","Four"))
    println(x)
    val man= listOf(30.5,40.5,50.0,60.0,70.0,80.0)
    val (avg,total)=height(man)
    println(avg)
    println(total)
  val vehicles= listOf(
      Car("KAG996Y",1345.67),
      Car("KDD768Z",1000.0),
      Car("KBZ2348B",6589.09)

  )
    val mileage=average(vehicles)
    println("My mileage $mileage")
val z= mutableListOf(
    Person("Great",24,4.6,75),
            Person("Linda",10,3.6,45),
    Person("Peter",44,5.6,85),
    Person("Anna",14,1.6,25),


)
    println(z)


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
data class Person(var name:String,var age:Int,var height:Double,var weight:Int)
fun age(person:List<Person>):List<Person>{
    return person.sortedByDescending { it.age }

}












data class Car(val registration:String,val mileage:Double)
 fun average(vehicles:List<Car>):Double{
     var count=0.0
     for (vehicle in vehicles){
         count+=vehicle.mileage
     }
     return count /vehicles.size
 }



