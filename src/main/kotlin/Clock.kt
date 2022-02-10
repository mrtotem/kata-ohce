import java.time.LocalTime

class Clock {

    fun dayTime(now: LocalTime) : Daytime {
        return when (now.hour) {
            in 0..5, in 20..23 -> Daytime.GOOD_NIGHT
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