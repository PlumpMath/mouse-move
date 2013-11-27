(ns com.jittakal.core
  (:gen-class))

(defn mouse-move
  "Move Mouse"
  ([] (mouse-move 1))
  ([count]
   (let [x (rand-int 1280)
         y (rand-int 800)
         robot (java.awt.Robot.)]
     (println (format "Count %s >> X: %s >> Y: %s" count x y))
     (.mouseMove robot x y)
     (Thread/sleep 120000)
     (recur (inc count)))))


(defn -main
  "Main Method"
  [& args]
  (mouse-move))






