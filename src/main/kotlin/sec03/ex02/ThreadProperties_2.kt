package sec03.ex02

class MyThread : Thread() {
    override fun run() {
        for(i in 0..100_000_000) { } //시간지연
        println("$name 우선순위:$priority")
    }
}

fun main() {

    //#참고. cpu core
    println("코어수: ${Runtime.getRuntime().availableProcessors()}")

    //#1. 디폴트 우선순위
    for (i in 0..2) {
        val thread = MyThread()
        thread.start()
    }

    //#1. 우선순위를 직접 지정
    for (i in 0..9) {
        val thread = MyThread()
        thread.name = "$i 번째 스레드"
        if (i==9) { thread.priority = 10 }

        thread.start()
    }

}