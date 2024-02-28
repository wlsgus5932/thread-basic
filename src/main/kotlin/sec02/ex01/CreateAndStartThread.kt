package sec02.ex01

//TODO: 방법 1 - Thread 클래스 상속하여 클래스 생성
//      case1 - 2개의 쓰레드 생성
fun main() {
    val smiFileThread = SMIFileThread()
    smiFileThread.start()

    val intArray = arrayOf(1, 2, 3, 4, 5)

    intArray.forEach {
        print("비디오 프레임: $it")
        try {
            Thread.sleep(200)
        } catch (e: InterruptedException) {
            println("error: $e")
        }
    }


}

class SMIFileThread : Thread() {
    override fun run() {
        val strArray = arrayOf("하나", "둘", "셋", "넷", "다섯")

        try {
            sleep(10)
        } catch (e: InterruptedException) {
            println(e)
        }

        strArray.forEach {
            println("자막출력: $it")
            try {
                sleep(200)
            } catch (e: InterruptedException) {
                println("error: $e")
            }
        }
    }
}