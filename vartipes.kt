const val num3 = 24f
const val pi = 3.1416
fun main(){
    val num1 = 12
    var num2 = 34
    num2 = 20
    println("numero 1: $num1")
    println("numero 2: $num2")
    println("numero 3: $num3")
    println("tipo de dato asignado por defecto: ${num1::class.simpleName}")
    println("")
    val dec = 30
    var per = pi*(dec*2)
    println("el perimetro cuando el radio es $dec vale: $per")
}