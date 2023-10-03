fun main(){
    print("Introduce el valor de x1 (solo numeros):")
    val x1: Int = readln().toInt()
    print("Introduce el valor de y1 (solo numeros):")
    val y1: Int = readln().toInt()
    print("Introduce el valor de x2 (solo numeros):")
    val x2: Int = readln().toInt()
    print("Introduce el valor de y2 (solo numeros):")
    val y2: Int = readln().toInt()
    val num = y2.minus(y1)
    val dem = x2.minus(x1)
    val d1 = num/dem
    val d2 = num.toFloat()/dem.toFloat()
    println("valor de la pendiente erronea: $d1")
    println("valor de la pendiente con correccion: $d2")
}
