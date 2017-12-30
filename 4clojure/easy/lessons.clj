;; 2. Last Element
(defn my-last
  [seq]
  (first (reverse seq)))

;; 3. Penultimate Element
(defn second-last
  [seq]
  (nth (reverse seq) 1))

;; 4. Nth Element
(defn my-nth
  [seq index]
  (last (take (inc index) seq)))

;; 5. Count Sequence
(defn count-seq
  [seq]
  (reduce
    (fn [initial next] (inc initial))
    0
    seq))

;; 6. Sum It All Up
(defn sum
  [seq]
  (reduce + seq))

;; 7. Find the odd numbers
(defn just-odds
  [seq]
  (filter
    (fn [item] (= (mod item 2) 1))
    seq))

;; 8. Reverse a Sequence
;; I stumbled upon this solution, why does it work?
;; into uses conj to add items
;; conj works differentely depending on the collection: list vs. vector
;; list: elements added at the start (bc list is linked list?)
;; vector: elements added at the end
(defn reverse-seq
  [seq]
  (into () => seq))

;; 9. Palindrome Detector
;; (reverse <>) turns strings into collections, i.e.: (\r \a \c \e \c \a \r)
;; so we have to convert the input to a sequence for comparison
(defn palindrome
  [sequ]
  (= (reverse sequ) (seq sequ)))

;; 10. Fibonacci Sequence
(defn nth-fib
  [n]
  (loop [a 1
         b 1
         seq [1 1]]
    (if (= n (count seq))
      seq
      (recur (+ a b) a (conj seq (+ a b))))))
