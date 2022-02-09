import java.time.LocalTime

class Clock {

    fun daytime(): Daytime {
        val currentDate = LocalTime.now()

        return when (currentDate.hour) {
            in 21 downTo 5 -> Daytime.GOOD_NIGHT
            in 6..12 -> Daytime.GOOD_DAY
            else -> Daytime.GOOD_AFTERNOON
        }
    }

    enum class Daytime {
        GOOD_DAY,
        GOOD_AFTERNOON,
        GOOD_NIGHT
    }
}