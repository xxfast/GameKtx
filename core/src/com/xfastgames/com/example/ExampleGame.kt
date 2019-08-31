package com.xfastgames.com.example

import com.badlogic.gdx.Screen
import ktx.app.KtxGame

class ExampleGame : KtxGame<Screen>() {
  override fun create() {
    addScreen(ExampleScreen())
    setScreen<ExampleScreen>()
  }
}
