package animations

import animations.show.ShowAnimation
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.*
import react.router.dom.browserRouter
import react.router.dom.route


@JsModule("src/logo/kotlin.svg")
external val simpleImage: dynamic

class Animations: RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        browserRouter {
            route("/animation/:id", ShowAnimation::class)
        }
        animations()
    }
}

private fun RBuilder.animations() {
    div("container") {
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
        a(classes = "card text-center zoom shadow m-3") {
            attrs.href = "/animation/$id"
            img(src = simpleImage) { }
        }
    }
}