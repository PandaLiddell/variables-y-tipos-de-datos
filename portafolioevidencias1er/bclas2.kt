fun main() {
    var x = 20
    val nombres = listOf(
        "kirby",
        "ness",
        "fox",
        "luigi",
        "mario",
        "link",
        "capitan falcon",
        "samus",
        "pikaxhu",
        "jigglypuf",
        "donkey kong",
        "yoshi"
    )
    for (nombre in nombres){
        println(nombre)
        if(nombre=="link"){
            println("personaje encontrado!")
            break
        }
    }
    nombres.forEach{println(it)}
    while(x > 0){
        println(x)
        x--
    }
}


fun main() {
    val nombres = listOf(
        "pedro luis",
        "juan manuel",
        "juan luis",
        "maria ines",
        "romeo",
        "romeo",
        "ernesto",
        "juan pedro",
        "ariadna",
        "mireya maria",
        "ana sofia",
        "jose juan",
        "romeo"
    )
    val list= mutableListOf(1, 2, 3, 4, 5)
    list.add(5)
    list.removeAt(1)
    list[0] = 0
    println(list)

    val numset: Set<Int> = setOf(0, 1,2,3,4,5,5,4)
    val reversenumset: Set<Int> = setOf(5,4,3,2,1,0)

    var names: Set<String> = mutableSetOf("nombre 1", "nombre 2")
    val namesToAges: Map<String, Int> = mapOf("unser_one" to 20, "user_two" to 23)

    for((key, value) in namesToAges){
        println("$key tiene $value años")
    }

    println(numset)
    println(reversenumset)
    println(names)

    println(" ${nombres.size}")
    println(" ${nombres.get(1)}")
    println(" ${nombres[3]}")
    println(" ${nombres.get(nombres.size - 1)}")
    println(" ${nombres.indexOf("romeo")}")

}