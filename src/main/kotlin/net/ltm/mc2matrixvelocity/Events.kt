package net.ltm.mc2matrixvelocity

import com.velocitypowered.api.event.*

class MatrixMessageEvent(val user: String, val message: String) : Event()

class MinecraftMessageEvent(val message: String) : Event()
