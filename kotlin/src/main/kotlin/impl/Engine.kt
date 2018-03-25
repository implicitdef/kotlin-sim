package impl


object Engine {

    fun runAndSubscribe(onChanges: (World) -> Unit) {
        var world = World("Ici", 0)
        kotlin.browser.window.setInterval({
            world = eventLoop(world)
            onChanges(world)
        }, 1000)
    }

    private fun eventLoop(world: World): World =
        world.copy(age = world.age + 1)


}
