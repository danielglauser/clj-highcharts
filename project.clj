(defproject clj-highcharts "0.1.2a"
  :description "A clojure wrapper for highcharts."
  :url "https://github.com/marshallbrekka/clj-highcharts"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [cheshire "4.0.3"]
                 [org.mozilla/rhino "1.7R4"]
                 [batik/batik "1.5"]
                 [org.apache.xmlgraphics/batik-anim "1.7"]
                 [org.apache.xmlgraphics/batik-awt-util "1.7"]
                 [org.apache.xmlgraphics/batik-bridge "1.7"]
                 [org.apache.xmlgraphics/batik-codec "1.7"]
                 [org.apache.xmlgraphics/batik-css "1.7"]
                 [org.apache.xmlgraphics/batik-dom "1.7"]
                 [org.apache.xmlgraphics/batik-ext "1.7"]
                 [org.apache.xmlgraphics/batik-extension "1.7"]
                 [org.apache.xmlgraphics/batik-gui-util "1.7"]
                 [org.apache.xmlgraphics/batik-gvt "1.7"]
                 [org.apache.xmlgraphics/batik-parser "1.7"]
                 [org.apache.xmlgraphics/batik-rasterizer "1.7"]
                 ; was causing problems when run with lein 1.7
                 ;[org.apache.xmlgraphics/batik-script "1.7"]
                 [org.apache.xmlgraphics/batik-squiggle "1.7"]
                 [org.apache.xmlgraphics/batik-svg-dom "1.7"]
                 [org.apache.xmlgraphics/batik-svggen "1.7"]
                 [org.apache.xmlgraphics/batik-svgpp "1.7"]
                 [org.apache.xmlgraphics/batik-transcoder "1.7"]
                 [org.apache.xmlgraphics/batik-util "1.7"]
                 [org.apache.xmlgraphics/batik-xml "1.7"]
                 [commons-io "1.4"]
                 [com.google.code.gson/gson "1.4"]
                 [log4j "1.2.16"]
                 [org.slf4j/slf4j-api "1.6.0"]
                 [org.slf4j/slf4j-log4j12 "1.6.0"]
                 [xml-apis/xml-apis-ext "1.3.04"]]
  :java-source-paths ["src/java"])
