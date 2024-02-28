package sec02.ex04

fun main() {
    Thread(SMIFileRunnable()).start()
    Thread(VideoFileRunnable()).start()

}

private class SMIFileRunnable : Runnable {
    override fun run() {
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
    }
}

private class VideoFileRunnable : Runnable {
    override fun run() {
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

    }

}