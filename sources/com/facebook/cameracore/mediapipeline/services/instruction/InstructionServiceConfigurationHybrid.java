package com.facebook.cameracore.mediapipeline.services.instruction;

import X.AnonymousClass96F;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public class InstructionServiceConfigurationHybrid extends ServiceConfiguration {
    public final AnonymousClass96F mConfiguration;

    public static native HybridData initHybrid(InstructionServiceListenerWrapper instructionServiceListenerWrapper);

    public InstructionServiceConfigurationHybrid(AnonymousClass96F r2) {
        super(initHybrid(r2.A00));
        this.mConfiguration = r2;
    }
}
