package animations.show

import animations.singleAnimation
import kotlinx.css.*
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.*
import styled.css
import styled.styledImg


@JsModule("src/logo/kotlin.svg")
external val simpleImage: dynamic

class ShowAnimation: RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        showAnimation()
    }

}

private fun RBuilder.showAnimation() {
    div("container") {

        div("row") {
            h2("m-5") {
                +"Animation Title"
            }
        }
        div("row") {
            h6 { +"Credentials section" }
        }
        div("row") {

            div("col-6") {
                styledImg(src = simpleImage) {
                    css {
                        height = 300.px
                        width = 300.px
                    }
                }

                audio {
                    attrs.controls = true
                }
            }

            div("col-6") {
                button(classes = "btn btn-success m-1") {
                    +"Download"
                }

                button(classes = "btn btn-secondary m-1") {
                    +"Favorite"
                }
            }

        }

        div("row mt-5") {
            h6 { +"Usage rights section" }
        }

        div("row mt-5") {
            h4 { +"Similar icons" }
        }

        div("row") {

            for (i in 1..10) {
                singleAnimation(i.toString())
            }
        }

        div("row") {
            h6 {
              +"Footer"
            }
        }

    }
}