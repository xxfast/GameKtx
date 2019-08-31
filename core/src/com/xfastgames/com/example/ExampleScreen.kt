package com.xfastgames.com.example

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.utils.viewport.StretchViewport
import com.badlogic.gdx.utils.viewport.Viewport
import ktx.app.KtxScreen
import ktx.graphics.use

class ExampleScreen : KtxScreen {
  private val font = BitmapFont()
  private val camera: OrthographicCamera = OrthographicCamera()
  private val viewport: Viewport = StretchViewport(800f, 400f, camera)

  private val batch: SpriteBatch = SpriteBatch().apply {
    color = Color.WHITE
  }

  override fun resize(width: Int, height: Int) {
    viewport.update(width, height)
  }

  override fun render(delta: Float) {
    batch.projectionMatrix = camera.combined
    camera.position.x += 10
    batch.use {
      font.draw(it, "Hello World!", 10f, 10f)
    }
  }

  override fun dispose() {
    // Will be automatically disposed of by the game instance.
    font.dispose()
    batch.dispose()
  }
}

