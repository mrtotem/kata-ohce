import org.junit.jupiter.api.Test
import java.time.LocalTime
import kotlin.test.assertEquals

class ClockShould {

    @Test
    fun `return morning daytime in the morning`() {
        val clock = Clock()
        val daytime = clock.dayTime(LocalTime.of(10, 0))

        assertEquals(Clock.Daytime.GOOD_DAY, daytime)
    }

    @Test
    fun `return noon daytime in the night`() {
        val clock = Clock()
        val daytime = clock.dayTime(LocalTime.of(23, 0))

        assertEquals(Clock.Daytime.GOOD_NIGHT, daytime)
    }

    @Test
    fun `return afternoon daytime in the afternoon`() {
        val clock = Clock()
        val daytime = clock.dayTime(LocalTime.of(16, 0))

        assertEquals(Clock.Daytime.GOOD_AFTERNOON, daytime)
    }
}