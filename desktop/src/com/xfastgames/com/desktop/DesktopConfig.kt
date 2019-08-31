package com.xfastgames.com.desktop

import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration

object DesktopConfig : LwjglApplicationConfiguration() {
  init {
    title = "Hello world"
    width = 550
    height = 400
  }
}
