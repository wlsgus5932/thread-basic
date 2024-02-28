package sec01

//TODO: 싱글쓰레드
fun main() {
    val intArray = arrayOf(1, 2, 3, 4, 5)
    val strArray = arrayOf("하나", "둘", "셋", "넷", "다섯")

    intArray.forEach {
        println("비디오 프레임: $it")
        try {
            Thread.sleep(200)
        } catch (e: InterruptedException) {
            println("error: $e")
        }
    }

    strArray.forEach {
        println("자막출력: $it")
        try {
            Thread.sleep(200)
        } catch (e: InterruptedException) {
            println("error: $e")
        }
    }

}