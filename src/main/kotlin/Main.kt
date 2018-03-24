import utils.TwelveDaysOfChristmas

fun main(args: Array<String>) {
    println(TwelveDaysOfChristmas.getText())
}

fun getAnEvent(): Event {
    return Event(
        "something_happened",
        555
    )
}

@JsName("triggerCallback")
fun triggerCallback(callback: (World) -> Unit) {
    kotlin.browser.window.setInterval({
        callback(World("Inactive", 0));
    }, 1000)
}


val Meta = "FKKFKFKK"

@JsName("triggerUserEvent")
fun triggerUserEvent(e: dynamic): Boolean {
    val event = Event(
        e.name,
        e.number
    );
    println("Kotlin received the event")
    println(event)
    println("Calling copy...")
    println(event.copy(name = "funk"))
    return true
}



data class World(
    val state: String,
    val age: Int
)



data class Event(
    val name: String,
    val number: Int
)