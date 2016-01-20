(ns chapter01.core)

(defrecord Book [name])

(deftype Bookshelf [books]
  clojure.lang.Seqable
  (seq [this]
    (seq books)))

(defn -main [& args]
  (let [bookshelf (->Bookshelf [(->Book "Around the World in 80 Days")
                                (->Book "Bible")
                                (->Book "Cinderella")
                                (->Book "Daddy-Long-Legs")])]
    (doseq [book bookshelf]
      (println (:name book)))))
