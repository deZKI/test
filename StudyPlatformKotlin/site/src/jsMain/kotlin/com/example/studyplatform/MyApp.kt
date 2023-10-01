package com.example.studyplatform

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.modifiers.minHeight
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.init.InitSilk
import org.jetbrains.compose.web.css.vh

@InitSilk

/*fun  updateTheme(ctx: InitSilkContext) {
    ctx.theme.palettes = MutableSilkPalettes(
        light = MutableSilkPalette(
            background = Colors.Beige,
            color = Colors.Black,
            link = MutableSilkPalette.Link(
                default = Colors.Black,
                visited = Colors.Blue
            ),
            button = MutableSilkPalette.Button(
                default = Colors.DarkGray,
                hover = Colors.LightGray,
                focus = Colors.LightGray,
                pressed = Colors.Gray
            )
        ),
        dark = MutableSilkPalette(
            background = Colors.Black,
            color = Colors.Beige,
            link = MutableSilkPalette.Link(
                default = Colors.Beige,
                visited = Colors.Blue
            ),
            button = MutableSilkPalette.Button(
                default = Colors.Blue,
                hover = Colors.MediumBlue,
                focus = Colors.MediumBlue,
                pressed = Colors.DarkBlue
            )
        )
    )
}*/

@App
@Composable
fun MyApp(content: @Composable () -> Unit) {
    SilkApp {
        Surface(SmoothColorStyle.toModifier().minHeight(100.vh)) {
            content()
        }
    }
}
