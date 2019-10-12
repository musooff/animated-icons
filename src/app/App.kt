package app

import animations.Animations
import animations.show.ShowAnimation
import react.*
import react.dom.*
import logo.*
import nav.navBar
import react.router.dom.browserRouter
import react.router.dom.hashRouter
import react.router.dom.route
import react.router.dom.switch
import ticker.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        browserRouter {
            switch {
                route("/", Animations::class)
            }
        }
    }
}

fun RBuilder.app() = child(App::class) {}
