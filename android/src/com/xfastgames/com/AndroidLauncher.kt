package com.xfastgames.com

import android.os.Bundle

import com.badlogic.gdx.backends.android.AndroidApplication
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration
import com.xfastgames.com.GameKt

class AndroidLauncher : AndroidApplication() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val config = AndroidApplicationConfiguration()
    initialize(GameKt(), config)
  }
}
