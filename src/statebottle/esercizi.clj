(ns statebottle.esercizi
 (:gen-class))


;; sparse exercise from Strucure an interpretation of computer programs

;; define a procedure last-pair that returns the list that contains only the last element of a given (nonempty) list
;; exercise 2.17
 (defn last-pair [x]
   (if (= 1 (count x)) 
     (first x) 
     (last-pair (rest x))))
