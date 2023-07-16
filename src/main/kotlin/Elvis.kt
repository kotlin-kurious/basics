class Elvis {
    private val starshipCaptains = mutableMapOf("USS Enterprise" to "Jean-Luc Picard")
            open fun getCaptain(starshipName: String): String {
               return starshipCaptains[starshipName] ?: "Unknown"
                // The Elvis operator ?: here  is like saying “if starshipCaptains[starshipName] call is not null,
                // return the value, otherwise Unknown”
            }



}