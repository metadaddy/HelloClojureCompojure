(ns sample.app
  (:use (ring.adapter jetty)
        (compojure core)))

(defroutes handler
  (GET "/" []
  {:headers {"Content-type" "text/html; charset=UTF-8"}
   :body "Hello world!"}))

(defn -main []
  (run-jetty 
    handler
    {:port (Integer/parseInt (get (System/getenv) "PORT" "8080"))}))
