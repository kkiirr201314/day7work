const val  TAVERN_NAME = "Taerny's Folly"
fun main(args: Array<String>) {
    placeOrder("shandy , Dragon's Breath, 5.91")
}

private  fun placeOrder(menuData: String){
    val indexOfAppstrophe = TAVERN_NAME.indexOf('\'')
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfAppstrophe)
    println("Madrigal對 $tavernMaster 說了他們訂的酒水。 ")
    println(menuData)
    val data = menuData.split(',')
    val type = data[0]
    val name = data[1]
    val price = data[2]
    val message = "Madrigal 買了一杯 $name ($type) 花了 $price."
    println(message)
}