package net.ltm.mc2matrixvelocity

import com.google.inject.Inject
import com.velocitypowered.api.event.Subscribe
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent
import com.velocitypowered.api.plugin.Plugin
import com.velocitypowered.api.proxy.ProxyServer
import org.slf4j.Logger


@Plugin(
    id = "MC2Matrix-Velocity",
    name = "MC2Matrix Velocity",
    version = BuildConstants.VERSION,
    description = "用于MC与Matrix互联",
    authors = ["Longtianmu"]
)
class MC2MatrixVelocity {
    private var server: ProxyServer? = null
    private var logger: Logger? = null

    @Inject
    fun velocityStarted(server: ProxyServer, logger: Logger) {
        this.server=server
        this.logger=logger
        logger.info("Hello there! I made my first plugin with Velocity.")
    }

    @Subscribe
    fun onProxyInitialization(event: ProxyInitializeEvent?) {

    }
}