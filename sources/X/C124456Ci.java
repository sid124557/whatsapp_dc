package X;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: X.6Ci  reason: invalid class name and case insensitive filesystem */
public final class C124456Ci extends ContentObserver {
    public C124456Ci() {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        C160447ne.A07.incrementAndGet();
    }
}
