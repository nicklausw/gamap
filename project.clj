(defproject gamap "0.1-SNAPSHOT"
  :license {:name "MPL 2.0"
            :url "https://www.mozilla.org/en-US/MPL/2.0/"}
  :dependencies []
  :plugins [[org.jank-lang/lein-jank "2026.10-3"]]
  :middleware [leiningen.jank/middleware]
  :main gamap.main
  :build-dependencies [[org.jank-lang.commons/jank-build "2026.10-1"]]
  :profiles {:base {:jank {:target-dir "target/debug"
                           :optimization-level 0}}
             :release {:jank {:target-dir "target/release"
                              :optimization-level 3}}})
