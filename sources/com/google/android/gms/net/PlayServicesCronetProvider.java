package com.google.android.gms.net;

import X.AnonymousClass6QB;
import X.C143476yw;
import X.C161637q9;
import X.C162177rO;
import X.C162227rU;
import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

public class PlayServicesCronetProvider extends CronetProvider {
    public static final String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    public static final String TAG = "PlayServicesCronet";

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof PlayServicesCronetProvider) && this.mContext.equals(((PlayServicesCronetProvider) obj).mContext);
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{PlayServicesCronetProvider.class, this.mContext});
    }

    private void tryToInstallCronetProvider() {
        String str;
        try {
            C161637q9.A01(this.mContext);
        } catch (AnonymousClass6QB unused) {
            if (Log.isLoggable(TAG, 4)) {
                str = "Google-Play-Services-Cronet-Provider is not installed yet.";
                Log.i(TAG, str);
            }
        } catch (C143476yw unused2) {
            if (Log.isLoggable(TAG, 4)) {
                str = "Google-Play-Services-Cronet-Provider is unavailable.";
                Log.i(TAG, str);
            }
        }
    }

    public CronetEngine.Builder createBuilder() {
        C162227rU r0;
        try {
            C161637q9.A01(this.mContext);
            try {
                synchronized (C161637q9.A03) {
                    r0 = C161637q9.A01;
                }
                C162177rO.A02(r0);
                ClassLoader classLoader = r0.A00.getClassLoader();
                C162177rO.A02(classLoader);
                return new ExperimentalCronetEngine.Builder((ICronetEngineBuilder) classLoader.loadClass(NATIVE_CRONET_ENGINE_BUILDER_IMPL).asSubclass(ICronetEngineBuilder.class).getConstructor(new Class[]{Context.class}).newInstance(new Object[]{this.mContext}));
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                throw new RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", e);
            }
        } catch (AnonymousClass6QB e2) {
            throw new IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e2);
        } catch (C143476yw e3) {
            throw new IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", e3);
        }
    }

    public String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }

    public String getVersion() {
        String str;
        tryToInstallCronetProvider();
        synchronized (C161637q9.A03) {
            str = C161637q9.A00;
        }
        return str;
    }

    public boolean isEnabled() {
        tryToInstallCronetProvider();
        return C161637q9.A02();
    }

    public PlayServicesCronetProvider(Context context) {
        super(context);
    }
}
