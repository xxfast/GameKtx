package com.xfastgames.com.desktop

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.xfastgames.com.example.ExampleGame

object DesktopLauncher {
  @JvmStatic fun main(arg: Array<String>) {
    val config = LwjglApplicationConfiguration()
    LwjglApplication(ExampleGame(), config)
  }
}
