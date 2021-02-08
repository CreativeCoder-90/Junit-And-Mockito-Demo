package testGame

import com.nhaarman.mockito_kotlin.whenever
import junit.framework.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.*
import tddBasics.FizzBuzz
import tddBasics.GameService

class FizzBuzzTest {

     private var fizzBuzz: FizzBuzz?=null
     var gameService: GameService=mock(GameService::class.java)

    @Before
    fun setUp(){
         fizzBuzz= FizzBuzz(gameService)
    }

    @Test
    fun isFizz(){
        var number:Int=6
        whenever(gameService.getResult(number)).thenReturn("fizz")
        var testedNumber:String? = fizzBuzz!!.isFizzorBuzz(number)
        assertEquals("fizz", testedNumber)
    }

    @Test
    fun isBuzz(){
        var num:Int = 5
        whenever(gameService.getResult(num)).thenReturn("buzz")
        var testedNumber:String? = fizzBuzz!!.isFizzorBuzz(num)
        assertEquals("buzz", testedNumber)
    }

}