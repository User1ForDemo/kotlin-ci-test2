import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class DemoClassTest {
    @Test
    fun `everything is fine`() {
        println("okok_gu")
        val cmdList = listOf("sudo", "-S", "ls")

        try {
            val result = runBlocking {
                CmdTools.execCommand(cmd = cmdList, omitRedirect = false,
                    timeout = 3)
            }
            println(result)
            assertTrue(result.exitCode == 0)

        } catch (e: Exception) {
        }

        for (i in 0..15) {
            try {
                Thread.sleep(60 * 1000L)
                println("sleep: $i")
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
        }

        assertTrue(false)
    }
}