class OhceConsole(private val clock: Clock, private val username: String) {

    fun greeting(): String {
        return when (clock.daytime()) {
            Clock.Daytime.GOOD_NIGHT -> "Buenas noches $username!"
            Clock.Daytime.GOOD_DAY -> "Buenos dias $username!"
            Clock.Daytime.GOOD_AFTERNOON -> "Buenas tardes $username!"
        }
    }

    fun input(input: String): String {
        if (input == "Stop!") {
            return "Adios $username"
        }

        val reversed = input.reversed()
        return "$reversed, Bonita Palabra!"
    }
}