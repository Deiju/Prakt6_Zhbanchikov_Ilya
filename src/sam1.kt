fun main(){
    println("x")
    var x=readLine()!!.toDouble()
    var f:Double
    when{
        (x<=7) -> f=3*x-9
        else -> f=1/Math.pow(x,2.0)-4
    }
    println(f)
}