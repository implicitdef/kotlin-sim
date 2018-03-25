package impl

object TwelveDaysOfChristmas {

    data class Day(val word: String, val gift: String)

    private val days = listOf(
        Day("First", "a Partridge in a Pear Tree"),
        Day("Second", "two Turtle Doves"),
        Day("Third", "three French Hens"),
        Day("Fourth", "four Calling Birds"),
        Day("Fifth", "five Gold Rings"),
        Day("Sixth", "six Geese a-Laying"),
        Day("Seventh", "seven Swans a-Swimming"),
        Day("Eighth", "eight Maids a-Milking"),
        Day("Ninth", "nine Ladies Dancing"),
        Day("Tenth", "ten Lords a-Leaping"),
        Day("Eleventh", "eleven Pipers Piping"),
        Day("Twelfth", "twelve Drummers Drumming")
    )

    fun getText(): String {
        return days.joinToString("\n\n") { couplet(it) }
    }

    private fun couplet(day: Day): String {
        val firstLine = "On the ${day.word} day of Christmas my true love sent to me"
        val gifts = (days.takeWhile { it != day } + day).reversed().map { it.gift }
        val middleLines = gifts.dropLast(1)
        val lastLine = if (middleLines.isNotEmpty()) "And ${gifts.last()}" else gifts.last()
        val allLines = listOf(firstLine) + middleLines + lastLine
        return (allLines).joinToString("\n") { it.capitalize() }
    }
}