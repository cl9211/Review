package coroutines

import kotlinx.coroutines.*

/**
 * Created by CHULEI on 2020/10/27.
 */
fun main() = runBlocking<Unit> {


}

suspend fun suspendingGetImage(id: String) = withContext(Dispatchers.IO) {

}


suspend fun suspendUntilDone() {
    while (!done) {
        delay(5)
    }
}

suspend fun failedConcurrentSum(): Int = coroutineScope {
    val one = async<Int> {
        try {
            delay(Long.MAX_VALUE) // Emulates very long computation
            42
        } finally {
            println("First child was cancelled")
        }
    }
    val two = async<Int> {
        println("Second child throws an exception")
        throw ArithmeticException()
    }
    one.await() + two.await()
}