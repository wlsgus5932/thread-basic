package sec04.ex05

class MyData {
    @Synchronized
    fun abc() {
        for (i in 0..2) {
            println("$i sec")
            try {
                Thread.sleep(1000)
            } catch (e: InterruptedException) {
            }
        }
    }

    @Synchronized
    fun bcd() {
        for (i in 0..2) {
            println("$i 초")
            try {
                Thread.sleep(1000)
            } catch (e: InterruptedException) {
            }
        }
    }

    fun cde() {
        synchronized(this) {
            for (i in 0..2) {
                println("$i 번째")
                try {
                    Thread.sleep(1000)
                } catch (e: InterruptedException) {
                }
            }
        }
    }


}

fun main() {
    //공유객체
    val myData = MyData()

    //#세개의 쓰레드가 각각의 메서드 호출
    Thread(Runnable {
        myData.abc()
    }).start()

    Thread(Runnable {
        myData.bcd()
    }).start()

    Thread(Runnable {
        myData.cde()
    }).start()

}