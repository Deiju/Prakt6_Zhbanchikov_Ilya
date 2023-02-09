fun main(){
    println("Введите сторону а")
    var a = readLine()!!.toInt()
    println("Введите сторону b")
    var b = readLine()!!.toInt()
    println("Введите ребро x")
    var x = readLine()!!.toInt()
    println("Введите ребро y")
    var y = readLine()!!.toInt()
    println("Введите ребро z")
    var z = readLine()!!.toInt()
    when{
        (a>=y&&a>=z&&b>=x) -> println("Кирпич влезет в отверстие")
        else -> println("кирпич не влезет")
    }
}