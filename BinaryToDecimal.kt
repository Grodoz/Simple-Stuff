import kotlin.jvm.JvmStatic

object BinaryToDecimal {
    private fun getDecimal(binary: Int): Int {
        var binary = binary
        var decimal = 0
        var n = 0
        while (true) {
            if (binary == 0) {
                break
            } else {
                val temp = binary % 10
                decimal += (temp * Math.pow(2.0, n.toDouble())).toInt()
                binary /= 10
                n++
            }
        }
        return decimal
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println("Decimal of 1010 is: " + getDecimal(1010))
        println("Decimal of 10101 is: " + getDecimal(10101))
        println("Decimal of 111111 is: " + getDecimal(111111))
    }
}