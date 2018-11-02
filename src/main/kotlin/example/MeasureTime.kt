package example

import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    val timeTaken = measureTimeMillis {
        // Do stuff
    }

    println("Completed in $timeTaken milliseconds.")
}