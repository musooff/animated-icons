package auth

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import react.dom.h4
import react.dom.h5

class SignIn: RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("container") {
            div("row") {
                h5("m-5") {
                    +"Sign In"
                }
            }
        }
    }
}