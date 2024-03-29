import kotlin.math.pow

const val PI=3.1416f
const val PHI=1.1618f
fun circleArea(radius:Float):Float{
    return PI*radius.pow(2)
}
fun printPhi(){
    println("El numero aureo vale $PHI")
}
fun getPI():Float{
    return PI
}

//funciones locales
fun login(user: String,password: String) : Boolean{
    fun validate(input: String): Boolean {
        if(input.isEmpty()){
            return false
        }
        return true
    }
    val userValidated = validate(user)
    val passValidated = validate(password)

    return userValidated && passValidated
}
fun rectangleArea (base:Double =20.0, height:Double= 30.0): Double{
    return base*height
}
fun prismaVolumen (area:Double, fondo:Double){
    val volumen=area*fondo
    println("EL volumen del prisma es $volumen")

}
fun imprimir(
    valor: String ="Este es el primer valor por defecto",
    valor2: String = "Este es el segundo valor por defecto"){
    println(valor)
    println(valor2)
}

fun promedio(
    valor: Float =10.0f,
    valor2: Float = 8.0f,
    valor3:Float):Float{
    return ((valor+valor2+valor3)/3f)
}