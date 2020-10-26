import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MarsRoverTest {
    @Test
    fun `rover change direction from North to West on "L" command`() {
        val rover = MarsRover()

        val currentPosition = rover.execute("L")

        assertThat(currentPosition).isEqualTo("0:0:W")
    }

    @Test
    fun `rover change direction from North to East on "R" command`() {
        val rover = MarsRover()

        val currentPosition = rover.execute("R")

        assertThat(currentPosition).isEqualTo("0:0:E")
    }

    @Test
    fun `rover change direction from West to South on "L" command`() {
        val rover = MarsRover(West())

        val currentPosition = rover.execute("L")

        assertThat(currentPosition).isEqualTo("0:0:S")
    }

    @Test
    fun `rover change direction from West to North on "R" command`() {
        val rover = MarsRover(West())

        val currentPosition = rover.execute("R")

        assertThat(currentPosition).isEqualTo("0:0:N")
    }

    @Test
    fun `rover change direction from North to South on "LL" command`() {
        val rover = MarsRover()

        val currentPosition = rover.execute("LL")

        assertThat(currentPosition).isEqualTo("0:0:S")
    }

    @Test
    fun `rover change direction from North to South on "RR" command`() {
        val rover = MarsRover()

        val currentPosition = rover.execute("RR")

        assertThat(currentPosition).isEqualTo("0:0:S")
    }

    @Test
    fun `rover keep direction North on "RRLL" command`() {
        val rover = MarsRover()

        val currentPosition = rover.execute("RRLL")

        assertThat(currentPosition).isEqualTo("0:0:N")
    }

    @Test
    fun `move the rover forward in his current direction when receives "F" as command`() {
        val rover = MarsRover()

        val currentPosition = rover.execute("F")

        assertThat(currentPosition).isEqualTo("1:0:N")
    }

    @Test
    fun `move the rover forward in his current direction when receives "FF" as command`() {
        val rover = MarsRover()

        val currentPosition = rover.execute("FF")

        assertThat(currentPosition).isEqualTo("2:0:N")
    }

    @Test
    fun `move the rover back in his current direction when receives "B" as command`() {
        val rover = MarsRover(position = Position(2,0))

        val currentPosition = rover.execute("B")

        assertThat(currentPosition).isEqualTo("1:0:N")
    }

    @Test
    fun `move the rover forward direction when receives "F" as command with East direction`() {
        val rover = MarsRover(East())

        val currentPosition = rover.execute("F")

        assertThat(currentPosition).isEqualTo("0:1:E")
    }
    @Test
    fun `move the rover back direction when receives "B" as command with East direction`() {
        val rover = MarsRover(East(), Position(y = 5))

        val currentPosition = rover.execute("B")

        assertThat(currentPosition).isEqualTo("0:4:E")
    }
}

/*
* TODO
* * Test direction simple
* * Test direction multi
* Test posicion
* Test borde de plateu
* Test con obstaculo
* Test comando invalido
* Test comando vacio
* Test case sentive
* */
