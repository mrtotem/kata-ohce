import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class OhceAcceptance {

    @Test
    fun testOhceAcceptance() {
        val clock = Clock()
        val console = OhceConsole(clock, "Octaculus")

        // test greeting
        val greeting = console.greeting()
        assertEquals("Buenas noches Octaculus!", greeting)

        // test empty palindrome
        var output = console.input("")
        assertNotEquals("Bonita Palabra!", output)

        // test palindrome
        output = console.input("word")
        assertEquals("drow, Bonita Palabra!", output)

        // test stop
        output = console.input("Stop!")
        assertEquals("Adios Octaculus", output)
    }
}