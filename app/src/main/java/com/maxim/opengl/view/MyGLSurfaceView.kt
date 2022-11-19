package com.maxim.opengl.view

import android.content.Context
import android.opengl.GLSurfaceView

class MyGLSurfaceView(context: Context) : GLSurfaceView(context) {

    private val renderer: MyGLRenderer

    init {
        // Create an OpenGL ES 2.0 context
        setEGLContextClientVersion(2)

        renderer = MyGLRenderer(context)
        // Render the view only when there is a change in the drawing data
        // Have not initialized yet.
//        renderMode = GLSurfaceView.RENDERMODE_WHEN_DIRTY
        // Set the Renderer for drawing on the GLSurfaceView
        setRenderer(renderer)
    }

}