package nav

import kotlinx.css.height
import kotlinx.css.px
import kotlinx.css.width
import kotlinx.html.ButtonType
import kotlinx.html.InputType
import kotlinx.html.button
import kotlinx.html.id
import react.*
import react.dom.*
import react.router.dom.navLink
import styled.css
import styled.styledButton
import styled.styledImg

@JsModule("src/logo/kotlin.svg")
external val simpleImage: dynamic

class NavBar: RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        navBar()
    }
}

private fun RBuilder.navBar() {
    div {
        nav("navbar navbar-expand-lg navbar-dark bg-dark") {
            navLink("/") {
                a("navbar-brand") {
                    styledImg(src = simpleImage, alt = "") {
                        css {
                            height = 30.px
                            width = 30.px
                        }
                    }
                    +"Animated Icons"
                }
            }
            button(classes = "navbar-toggler", type = ButtonType.button) {
                attrs["data-toggle"] = "collapse"
                attrs["data-target"] = "#navbarSupportedContent"
                attrs["aria-controls"] = "navbarSupportedContent"
                attrs["aria-expanded"] = false
                attrs["aria-label"] = "Toggle Navigation"
                span("navbar-toggler-icon") {}
            }
            div("collapse navbar-collapse") {
                attrs.id = "navbarSupportedContent"
                ul("navbar-nav ml-auto") {
                    li("nav-item active") {
                        navLink("/animations", exact = true) {
                            a(classes = "nav-link") {
                                +"Animations"
                            }
                        }
                    }

                    li("nav-item") {
                        navLink("/marketplace") {
                            a(classes = "nav-link") {
                                +"Marketplace"
                            }
                        }
                    }

                    li("nav-item") {
                        navLink("/signin") {
                            a(classes = "nav-link") {
                                +"Sign In"
                            }
                        }
                    }
                }

                form(classes = "form-inline m-2 my-lg-0") {
                    input(classes = "form-control mr-sm-2", type = InputType.search) {
                        attrs.placeholder = "Search"
                        attrs["aria-label"] = "Aria Search"
                    }
                    button(classes = "btn btn-outline-success my-2 my-sm-0", type = ButtonType.submit) {
                        +"Search"
                    }
                }
            }
        }
    }
}