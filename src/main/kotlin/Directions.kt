interface Direction{
    fun left(): Direction
    fun right(): Direction
    override fun toString(): String
}
class North : Direction{
    override fun toString() = "N"
    override fun left() = West()
    override fun right() = East()
}
class West : Direction{
    override fun toString() = "W"
    override fun left() = South()
    override fun right() = North()
}
class South : Direction{
    override fun toString() = "S"
    override fun left() = East()
    override fun right() = East()
}
class East : Direction{
    override fun toString() = "E"
    override fun left() = North()
    override fun right() = South()
}
