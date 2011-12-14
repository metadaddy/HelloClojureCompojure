(ns sample.app
  (:use [compojure.core :only [defroutes GET]])
  (:require [ring.adapter.jetty :as jetty]))

(defroutes handler
  (GET "/" []
       {:headers {"Content-type" "text/html; charset=UTF-8"}
        :body "Hello world!"}))

(defn -main []
  (jetty/run-jetty handler
                   {:port (Integer/parseInt
                           (or (System/getenv "PORT") "8080"))}))
