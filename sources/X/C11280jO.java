package X;

import android.util.Log;

/* renamed from: X.0jO  reason: invalid class name and case insensitive filesystem */
public class C11280jO implements Runnable {
    public final /* synthetic */ AnonymousClass0Xd A00;

    public C11280jO(AnonymousClass0Xd r1) {
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass0Xd r3 = this.A00;
        if (r3.A0D.cache.cacheManagerWaitForCacheInitialization) {
            C126346Nm A02 = r3.A07;
            if (!A02.A09()) {
                try {
                    A02.A04();
                } catch (InterruptedException unused) {
                    Log.w(AnonymousClass0Xd.A0G, String.format("mCache.waitForInit() has been interrupted", new Object[0]));
                }
            }
        }
        r3.A0A();
    }
}
