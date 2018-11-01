package example

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking { // Waits until all coroutines are finished inside of it
    serviceFunction()
}

suspend fun serviceFunction() {
    coroutineScope {
        val first = launch {
            (1..1000).forEach {
                delay(10)
                print("All Work and No Play ")
                if (it % 4 == 0) println()
            }
        }

        val second = launch {
            (1..1000).forEach {
                delay(10)
                print("Makes Jack a Dull Boy! ")
                if (it % 4 == 0) println()
            }
        }

        first.join() // Wait until first coroutine is finished
        second.join() // Wait until second coroutine is finished
    }
}