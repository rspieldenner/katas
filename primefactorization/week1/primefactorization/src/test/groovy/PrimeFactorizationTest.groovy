import org.junit.Test

class PrimeFactorizationTest{

    @Test
    void doesFactorizationWork() {
        def factorizer = new PrimeFactorization(7)
        assert factorizer.factorization() == [7]
    }

    @Test
    void doesFactorizationWorkWithMultipleNumbers() {
        def factorizer = new PrimeFactorization(4)
        assert factorizer.factorization() == [2,2]
    }

    @Test
    void doesFactorizationWorkWithComplex() {
        def factorizer = new PrimeFactorization(24)
        assert factorizer.factorization() == [2,2,2,3]
    }

    @Test
    void doesFactorizationWorkWithLargePrime() {
        def factorizer = new PrimeFactorization(31)
        assert factorizer.factorization() == [31]
    }

    @Test
    void doesFactorizationWorkWithOne() {
        def factorizer = new PrimeFactorization(1)
        assert factorizer.factorization() == []
    }

    @Test
    void doesFactorizationRootWorkSix() {
        def factorizer = new PrimeFactorization(6)
        assert factorizer.factorization() == [2,3]
    }

    @Test
    void doesFactorizationWorkLargePrime() {
        def factorizer = new PrimeFactorization(104729)
        assert factorizer.factorization() == [104729]
    }

}

