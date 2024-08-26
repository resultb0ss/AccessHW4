fun main() {

    var array = arrayOf(1,2,3,4,5,6,7,8,9,10,-2,-23,-43,-35,-453,-345)
    checkNum(array)
}

fun checkNum (array: Array<Int>){

    fun findNum (num: Int):Boolean = num > 0

    for (num in array){
        if (findNum(num))
            println(num)
    }

}