package marketplace

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import react.dom.h2

class Marketplace: RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("container") {
            div("row") {
                h2("m-5") {
                    +"Marketplace"
                }
            }
        }
    }
}