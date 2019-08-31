package com.xfastgames.com.desktop

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.xfastgames.com.example.ExampleGame

object DesktopLauncher {
  @JvmStatic fun main(arg: Array<String>) {
    LwjglApplication(ExampleGame(), DesktopConfig)
  }
}
