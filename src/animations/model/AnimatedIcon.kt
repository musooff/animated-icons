package animation

import kotlinx.css.*
import kotlinx.css.properties.Timing
import kotlinx.css.properties.ms
import react.RBuilder
import styled.animation
import styled.css
import styled.styledDiv


class AnimatedIcon {

    var width: Int = 0
    var height: Int = 0
    var imageUrl: String? = null
    var animationDuration: Long = 0
    var starPosition: Pair<Int, Int> = Pair(0, 0)
    var endPosition: Pair<Int, Int> = Pair(0, 0)
    var animationTimingStep: Int = 0

}

fun RBuilder.showAnimation(animatedIcon: AnimatedIcon) {
    styledDiv {
        css {
            width = animatedIcon.width.px
            height = animatedIcon.height.px
            backgroundRepeat = BackgroundRepeat.noRepeat
            backgroundImage = Image("url(${animatedIcon.imageUrl})")
            animation(
                    duration = animatedIcon.animationDuration.ms,
                    handler = {
                        from { backgroundPosition = "${animatedIcon.starPosition.first}px ${animatedIcon.starPosition.second}px" }
                        to { backgroundPosition = "${animatedIcon.endPosition.first}px ${animatedIcon.endPosition.second}px" }
                    },
                    timing = Timing("steps(${animatedIcon.animationTimingStep})"))

        }
    }
}

