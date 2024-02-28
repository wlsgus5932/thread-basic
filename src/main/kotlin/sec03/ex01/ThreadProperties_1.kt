package sec03.ex01


fun main() {
    //#1. 객체 가져오기 (currentThread)
    val curThread = Thread.currentThread()
    println("thread name = ${curThread.name}")
    println("thread count = ${Thread.activeCount()}")

    //#2. 쓰레드 이름 지정(자동지정)
    for(i in 0..2) {
        val thread = Thread()
        println(thread.name)
        thread.start()
    }

    //#3. 쓰레드 이름 직접 지정
    for(i in 0..2) {
        val thread = Thread()
        thread.name = "$i 번째 쓰레드"
        println(thread.name)
        thread.start()
    }

    //#4. 쓰레드 이름 자동 지정
    for(i in 0..2) {
        val thread = Thread()
        println(thread.name)
        thread.start()
    }

    println(Thread.activeCount())

}