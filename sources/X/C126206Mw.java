package X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.provider.atrace.Atrace;

/* renamed from: X.6Mw  reason: invalid class name and case insensitive filesystem */
public final class C126206Mw extends C159137lB {
    public static final int A00 = ProvidersRegistry.A00.A02("atrace");

    public C126206Mw() {
        super("profilo_atrace");
    }

    public int getSupportedProviders() {
        return A00;
    }

    public void disable() {
        Atrace.restoreSystrace(A00());
    }

    public void enable() {
        Atrace.enableSystrace(A00());
    }

    public int getTracingProviders() {
        if (Atrace.isEnabled()) {
            return A00;
        }
        return 0;
    }
}
