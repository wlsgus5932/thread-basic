package sec05

fun main() {
    //#쓰레드 상태 저장 클래스
    var state: Thread.State

    //객체 생성
    val thread = Thread(Runnable {
        for(i in 0..100000000L) {} //시간지연
    })

    println("state = ${thread.state}") //New
}