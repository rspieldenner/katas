(ns primefactorization.core)

(defn potentialFactors [number]
  (let [bound (/ number 2)]
    (if (> 2 bound) '()
      (conj (range 3 bound 2) 2))))

(defn factorsOf
  "Return the prime factorization of the given number"
  ([number] (factorsOf number (potentialFactors number) []))
  ([number potentials results]
    (if (= 1 number) results
      (if (empty? potentials) (conj results number)
        (let [potential (first potentials)]
          (if (= 0 (mod number potential)) (recur (/ number potential) potentials (conj results potential))
            (recur number (rest potentials) results)))))))

