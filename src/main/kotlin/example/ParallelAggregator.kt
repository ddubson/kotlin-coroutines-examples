package example

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    val timeTaken = measureTimeMillis {
        runBlocking {
            val person: Person = coroutineScope {
                val lastName = async {
                    delay(1000)
                    "Doe"
                }

                val mobilePhoneNumber = async {
                    delay(1000)
                    "111-222-3344"
                }

                val firstName = async {
                    delay(500)
                    "John"
                }

                Person(firstName.await(), lastName.await(), mobilePhoneNumber.await())
            }

            println(person)
        }
    }
    println("Completed in $timeTaken milliseconds.")
}

data class Person(val firstName: String,
                  val lastName: String,
                  val mobilePhoneNumber: String)


