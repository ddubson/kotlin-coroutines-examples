package example

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main(args: Array<String>) {
    GlobalScope.launch {
        println("Hey")
    }

}