// PowpowNetworkingModule.java

package com.powpow.networking;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

class PowpowNetworkingModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {
    val reactContext: ReactApplicationContext

    init {
        this.reactContext = reactContext
    }

    override fun getName(): String {
        return "RNPowpowNetworking"
    }

    @ReactMethod
    fun greet() {

    }
}
