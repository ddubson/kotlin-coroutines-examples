package boot

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ExampleRestController {
    @GetMapping("/")
    fun index(): String {
        return runBlocking {
            val first = async {
                delay(500)
                "Hello, "
            }

            val second = async {
                delay(1000)
                "World!"
            }

            first.await() + second.await()
        }
    }
}