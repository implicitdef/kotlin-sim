import impl.Engine
import impl.World

@JsName("runAndSubscribe")
fun runAndSubscribe(onChanges: (World) -> Unit) {
    Engine.runAndSubscribe(onChanges)
}

@JsName("triggerUserEvent")
fun triggerUserEvent(e: dynamic): Boolean {
    val event = Event(
        e.name,
        e.number
    )
    println("Kotlin received the event")
    println(event)
    println("Calling copy...")
    println(event.copy(name = "funk"))
    return true
}

data class Event(
    val name: String,
    val number: Int
)