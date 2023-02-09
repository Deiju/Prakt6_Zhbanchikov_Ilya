fun main(){
    println("a=")
    var a = readLine()!!.toInt()
    when{
        (a/100==a%10 && a%10==a%100/10) -> println("Одинаковы")
        else -> println("Не одинаковы")
    }
}