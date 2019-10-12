package nav

import kotlinx.html.ButtonType
import kotlinx.html.InputType
import react.*
import react.dom.*

class NavBar: RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        navBar()
    }
}

fun RBuilder.navBar() {
    div {
        nav("navbar narbar-expend-lg navbar-lg bg-light") {
            a {
                attrs.href = "#"
                +"Animated Icons"
            }
            button(classes = "navbar-toggler", type = ButtonType.button) {
                span("navbar-toggler-icon") {}
            }

            div {
                ul("navbar-nav mr-auto") {
                    li("nav-item") {
                        a {
                            attrs.href = "#"
                            +"Animations"
                        }
                    }

                    li("nav-item") {
                        a {
                            attrs.href = "#"
                            span {
                                i("fa fa-camera-retro") {  }
                                +"Marketplace"
                            }

                        }
                    }
                }

                form(classes = "form-inline my-2 my-lg-0") {
                    input(classes = "form-control mr-sm-2", type = InputType.search) {  }
                    button(classes = "btn btn-outline-success my-2 my-sm-0", type = ButtonType.submit) {
                        +"Search"
                    }
                }
            }
        }
    }
}