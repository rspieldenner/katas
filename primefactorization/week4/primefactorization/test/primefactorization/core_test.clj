(ns primefactorization.core-test
  (:require [clojure.test :refer :all]
            [primefactorization.core :refer :all]))

(deftest simple-case
  (testing "1 will return []"
    (is (= (factorsOf 1) []))))

(deftest return-low-prime
  (testing "verify low primes return themselves"
    (is (= (factorsOf 2) [2]))
    (is (= (factorsOf 3) [3]))
    (is (= (factorsOf 13) [13]))))

(deftest higher-primes
  (testing "check for stackoverflows on larger primes"
    (is (= (factorsOf 63097) [63097]))))

(deftest return-factors
  (testing "simple factors"
    (is (= (factorsOf 4) [2,2]))
    (is (= (factorsOf 6) [2,3]))
    (is (= (factorsOf 2550) [2,3,5,5,17]))))

(deftest determin-possible-factors
  (testing "return 2 and all odds less than half of the number"
    (is (= (potentialFactors 3) '()))
    (is (= (potentialFactors 4) '(2)))
    (is (= (potentialFactors 21) '(2,3,5,7,9)))))