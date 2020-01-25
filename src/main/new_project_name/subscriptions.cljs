(ns new-project-name.subscriptions
  (:require [re-frame.core :refer [reg-sub]]
            [com.rpl.specter :as sp :refer-macros [select
                                                   select-one
                                                   select-one!]]))

(defn version [db _]
  (->> db
       (select-one! [:version])))


(defn theme [db _]
  (->> db
       (select-one! [:settings :theme])))

(reg-sub :version version)
(reg-sub :theme theme)
