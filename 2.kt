import kotlin.math.absoluteValue
import kotlin.math.sign

fun main() {
    val valueA = 65
    val valueB = 52
    val valueC = 78

    val resultA = calculate(valueA, valueB, valueC)
    val resultB = calculate(valueA, valueB, null)

    println("""
        ResultA is $resultA
        ResultB is $resultB
    """.trimIndent())
}

fun calculate(valueA: Int, valueB: Int, valueC: Int?): String {
    // TODO 1
    var A = valueA
    var B = valueB
    var C = valueC ?: 100
    val result = (A + ( B - C ))
    return generateResult(result = result)
}

// TODO 2
fun generateResult(result: Int) : String {
    return("$result")
}