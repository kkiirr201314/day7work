const val  TAVERN_NAME = "Taerny's Folly"
fun main(args: Array<String>) {
    placeOrder("shandy , Dragon's Breath, 5.91")
}

private  fun placeOrder(menuData: String){
    val indexOfAppstrophe = TAVERN_NAME.indexOf('\'')
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfAppstrophe)
    println("Madrigal對 $tavernMaster 說了他們訂的酒水。 ")
    println(menuData)
}