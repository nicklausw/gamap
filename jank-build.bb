(require '[jank.build.util :as util])

; this is what does it for me on CachyOS
; qt was already installed
; sudo pacman -S qgis

(util/link-dir "/usr/lib")

(mapv util/include-dir
      ["/usr/include/qgis"
       "/usr/include/qt6"
       "/usr/include/qt6/QtCore"
       "/usr/include/qt6/QtGui"
       "/usr/include/qt6/QtWidgets"
       "/usr/include/qt6/QtXml"])

(mapv util/link-library
      ["Qt6Core"
       "Qt6Gui"
       "Qt6Widgets"
       "Qt6Xml"
       "qgis_core"
       "qgis_gui"])