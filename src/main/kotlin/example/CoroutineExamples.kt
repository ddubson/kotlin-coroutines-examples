package example

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

suspend fun main(args: Array<String>) = coroutineScope {
    launch {
        Thread.sleep(1000)
        println("Hello")
    }

    Thread.sleep(3000)
    println("Done")
}
