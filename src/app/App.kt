package app

import animations.Animations
import auth.SignIn
import react.*
import react.dom.*
import marketplace.Marketplace
import nav.NavBar
import react.router.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        browserRouter {
            div("container") {

                route("/", NavBar::class)

                div("row") {
                    route("/animations", Animations::class)
                    route("/marketplace", Marketplace::class)
                    route("/signin", SignIn::class)
                }
            }
        }
    }
}

fun RBuilder.app() = child(App::class) {}
