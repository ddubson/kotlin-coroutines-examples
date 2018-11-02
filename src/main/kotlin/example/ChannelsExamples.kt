package example

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    runBlocking {
        val channel = Channel<String>()
        launch {
            for(x in 1..5) {
                delay(500)
                channel.send("Me!")
            }
        }

        repeat(5) {
            println(channel.receive())
        }

        println("Done")
    }
}