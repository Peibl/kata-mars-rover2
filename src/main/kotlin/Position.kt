class Position(private val x: Int = 0, private val y: Int = 0) {

    fun forward(direction: Direction): Position {
        return if (direction is East || direction is West) {
            Position(x, y + 1)
        } else {
            Position(x + 1, y)
        }
    }

    fun back(direction: Direction): Position {
        return if (direction is East || direction is West) {
            Position(x, y - 1)
        } else {
            Position(x - 1, y)
        }
    }

    override fun toString() = "$x:$y"
}
