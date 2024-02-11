package me.jellysquid.mods.sodium.client.gl.shader;

import org.lwjgl.opengl.ARBShaderObjects;

/**
 * Uma enumeração dos tipos de shaders OpenGL suportados.
 */
public enum ShaderType {
    VERTEX(ARBShaderObjects.ARB_VERTEX_SHADER),
    FRAGMENT(ARBShaderObjects.ARB_FRAGMENT_SHADER);

    public final int id;

    ShaderType(int id) {
        this.id = id;
    }
}
