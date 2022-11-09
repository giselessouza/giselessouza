@Singleton
@Transactional
open class CalculatorService {
      open fun soma(n1: Int, n2: Int) {
        log.info("Operacao de soma")
        return segundoMicroservice(n1, n2);
    }
}