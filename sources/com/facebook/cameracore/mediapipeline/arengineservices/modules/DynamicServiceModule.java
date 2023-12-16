package com.facebook.cameracore.mediapipeline.arengineservices.modules;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;

public class DynamicServiceModule extends ServiceModule {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000d, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule getBaseInstance() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "getModuleClassName"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)     // Catch:{ Exception -> 0x000b, all -> 0x0008 }
            throw r0     // Catch:{ Exception -> 0x000b, all -> 0x0008 }
        L_0x0008:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x000b:
            r0 = 0
            monitor-exit(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.arengineservices.modules.DynamicServiceModule.getBaseInstance():com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule");
    }

    private native HybridData initHybrid(int i);
}
