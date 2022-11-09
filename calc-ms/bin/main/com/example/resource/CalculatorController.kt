@Controller(value: "/hello")
class CalculatorController {
    @Get
    fun hello(): String {
        return "hello word"
    }
}