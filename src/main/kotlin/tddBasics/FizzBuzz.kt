package tddBasics
class FizzBuzz {

    var gameService:GameService

    constructor(gameService: GameService){
        this.gameService=gameService
    }

    fun isFizzorBuzz(number: Int):String? {
       return gameService.getResult(number)
    }

}

