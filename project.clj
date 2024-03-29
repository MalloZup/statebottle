(defproject statebottle "0.1.0-SNAPSHOT"
  :description "statebottle: manage state in distributed systems"
  :url "https://github.com/MalloZup/statebottle"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [com.novemberain/langohr "5.1.0"]]
  :repl-options {:init-ns statebottle.core})
