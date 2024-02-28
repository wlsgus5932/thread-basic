package sec03.ex03

class MyThread: Thread() {
    override fun run() {
        println("$name :" + if(isDaemon) "데몬쓰레드" else "일반쓰레드")
        for(i in 0..5) {
            println("$name : $i 초")
            try {
                sleep(1000)
            } catch (e: InterruptedException) {
                println(e)
            }
        }
    }
}

fun main() {
    //일반 쓰레드
    val thread1 = MyThread()
    thread1.isDaemon = false//디폴트
    thread1.name = "thread1"
    thread1.start()

    // 데몬 쓰레드
    val thread2 = MyThread()
    thread2.isDaemon = true //디폴트
    thread2.name = "thread2"
    thread2.start()
    
    // 3초 후 main thread 종료
    try {
        Thread.sleep(3100)
    } catch (e: InterruptedException) {
        e.printStackTrace()
    }

    println("main Thread 종료")
}

