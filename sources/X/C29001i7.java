package X;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.SystemClock;

/* renamed from: X.1i7  reason: invalid class name and case insensitive filesystem */
public class C29001i7 extends C61102zi implements ComponentCallbacks2 {
    public long A00;
    public long A01;
    public final C44062Un A02;
    public final C380625j A03;
    public final AnonymousClass4FS A04;

    public void onConfigurationChanged(Configuration configuration) {
    }

    public C29001i7(C44062Un r2, C380625j r3, C54292oU r4, AnonymousClass4FS r5) {
        this.A04 = r5;
        this.A03 = r3;
        this.A02 = r2;
        r4.A00.registerComponentCallbacks(this);
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i) {
        boolean z;
        C18260x0.A0w("OnTrimMemory/level: ", AnonymousClass001.A0o(), i);
        if (i >= 60) {
            if (SystemClock.uptimeMillis() > this.A00 + 60000) {
                this.A00 = SystemClock.uptimeMillis();
                C18260x0.A1L(C18270x1.A0W(i, "OnTrimMemory/level: "), ", trimming memory, app in background");
                z = false;
            } else {
                return;
            }
        } else if (i >= 15 && i < 20 && SystemClock.uptimeMillis() > this.A01 + C625635p.A0L) {
            this.A01 = SystemClock.uptimeMillis();
            C18260x0.A1L(C18270x1.A0W(i, "OnTrimMemory/level: "), ", trimming memory, app in foreground");
            z = true;
        } else {
            return;
        }
        this.A04.BkM(new C71703cX(43, (Object) this, z));
    }
}
