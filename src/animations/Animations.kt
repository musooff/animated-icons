package animations

import animations.show.ShowAnimation
import react.*
import react.dom.*
import react.router.dom.browserRouter
import react.router.dom.navLink
import react.router.dom.route
import react.router.dom.switch


@JsModule("src/logo/kotlin.svg")
external val simpleImage: dynamic

class Animations: RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        browserRouter {
            route("/animations", exact = true, render = {
                animations()
            })
            route("/animations/:id", ShowAnimation::class)
        }
    }
}

private fun RBuilder.animations(): ReactElement {
    return div("container") {
        div("row") {
            h2("m-5") {
                +"Animations"
            }
        }

        div("row") {
            for (i in 1..20) {
                singleAnimation(i.toString())
            }
        }
    }
}

fun RBuilder.singleAnimation(id: String) {
    div("col-3") {
        navLink("/animations/$id") {
            a(classes = "card text-center zoom shadow m-3") {
                img(src = simpleImage) {}
            }
        }
    }
}