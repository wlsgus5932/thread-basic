package sec04.ex02

class MyData {
    var data = 3

    @Synchronized
    fun pulsData() {
        synchronized(this) {
            val mydata = data
            Thread.sleep(2000)
            data = mydata+1
        }
    }
}

//#공유객체를 사용하는 쓰레드
class PlusThread(var myData: MyData) : Thread() {
    override fun run() {
        myData.pulsData()
        println("$name 실행결과: ${myData.data}")
    }
}

fun main() {
    //#공유객체 생성
    val myData = MyData()
    //thread1
    val plusThread1: Thread = PlusThread(myData)
    plusThread1.name = "plusThread1"
    plusThread1.start()

    try {
        Thread.sleep(1000)
    } catch (e: InterruptedException) {}

    //thread2
    val plusThread2: Thread = PlusThread(myData)
    plusThread2.name = "plusThread2"
    plusThread2.start()
}