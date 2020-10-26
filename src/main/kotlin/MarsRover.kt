class MarsRover(private var direction: Direction = North(), private var position: Position = Position()) {
    fun execute(command: String): String {
        val commands = command.toList()
        commands.forEach {
            when (it) {
                'R' -> direction = direction.right()
                'L' -> direction = direction.left()
                'F' -> position = position.forward(direction)
                'B' -> position = position.back(direction)
            }
        }
        return "$position:$direction"
    }
}
