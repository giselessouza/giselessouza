@Controller(value: "/calculator")
class CalculatorController {

    @Inject
    lateinit var calculatorService: CalculatorService

    @Get("/soma/{n1}/{n2}")
    fun soma(n1: Int, n2: Int) {
        return calculatorService.soma(n1, n2)
    }

    @Get("/sub/{n1}/{n2}")
    fun sub(n1: Int, n2: Int) {
        return calculatorService.sub(n1, n2)
    }

        @Get("/div/{n1}/{n2}")
    fun div(n1: Int, n2: Int) {
        return calculatorService.div(n1, n2)
    }

        @Get("/mult/{n1}/{n2}")
    fun mult(n1: Int, n2: Int) {
        return calculatorService.mult(n1, n2)
    }


    companion object {
        val log: Logger = LoggerFactory.getLogger(CalculatorController::class.java)
    }
}