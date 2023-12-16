package X;

import com.facebook.profilo.core.ProvidersRegistry;

/* renamed from: X.6Mx  reason: invalid class name and case insensitive filesystem */
public final class C126216Mx extends C159137lB {
    public static final int A00 = ProvidersRegistry.A00.A02("qpl");

    public C126216Mx() {
        super((String) null);
    }

    public void disable() {
    }

    public void enable() {
    }

    public int getSupportedProviders() {
        return A00;
    }

    public int getTracingProviders() {
        C166567yu r0 = this.A01;
        if (r0 == null) {
            return 0;
        }
        return r0.A02 & A00;
    }
}
