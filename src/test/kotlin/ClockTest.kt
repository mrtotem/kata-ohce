import org.junit.jupiter.api.Test
import java.time.LocalTime
import kotlin.test.assertEquals

class ClockTest {

    @Test
    fun testMorningDaytime() {
        val clock = Clock()
        assertEquals(getDaytime(), clock.daytime())
    }

    private fun getDaytime(): Clock.Daytime {
        val currentDate = LocalTime.now()

        return when (currentDate.hour) {
            in 21 downTo 5 -> Clock.Daytime.GOOD_NIGHT
            in 6..12 -> Clock.Daytime.GOOD_DAY
            else -> Clock.Daytime.GOOD_AFTERNOON
        }
    }
}