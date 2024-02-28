package sec02.ex05

fun main() {
    Thread(Runnable {
        // 비디오 프레임
        val intArray = arrayOf(1, 2, 3, 4, 5)

        intArray.forEach {
            print("비디오 프레임:$it - ")
            try {
                Thread.sleep(200)
            } catch (e: InterruptedException) {
                println("error: $e")
            }
        }
    }).start()


    Thread(Runnable {
        //자막 프레임
        val strArray = arrayOf("하나", "둘", "셋", "넷", "다섯")

        try {
            Thread.sleep(10)
        } catch (e: InterruptedException) {
            println(e)
        }

        strArray.forEach {
            println("자막출력:$it ")
            try {
                Thread.sleep(200)
            } catch (e: InterruptedException) {
                println("error: $e")
            }
        }
    }).start()
}
