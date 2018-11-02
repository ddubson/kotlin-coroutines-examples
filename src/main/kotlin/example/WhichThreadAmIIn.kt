package example

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    GlobalScope.launch {

    }

    runBlocking {
        launch { println("[1] I'm in thread ${Thread.currentThread()}") }
        launch { println("[2] I'm in thread ${Thread.currentThread()}") }
        launch { println("[3] I'm in thread ${Thread.currentThread()}") }
        launch { println("[4] I'm in thread ${Thread.currentThread()}") }
    }

    runBlocking {
        launch { println("[1] I'm in thread ${Thread.currentThread()}") }
        launch { println("[2] I'm in thread ${Thread.currentThread()}") }
        launch { println("[3] I'm in thread ${Thread.currentThread()}") }
        launch { println("[4] I'm in thread ${Thread.currentThread()}") }
    }
}