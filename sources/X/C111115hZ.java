package X;

import android.hardware.SensorManager;
import java.lang.ref.WeakReference;

/* renamed from: X.5hZ  reason: invalid class name and case insensitive filesystem */
public class C111115hZ implements AnonymousClass4CD {
    public C162837sq A00;
    public final C620633i A01;
    public volatile WeakReference A02;

    public void BMV() {
        synchronized (this) {
            SensorManager A0D = this.A01.A0D();
            if (A0D != null) {
                C162837sq r2 = this.A00;
                if (r2 == null) {
                    r2 = new C162837sq(this);
                    this.A00 = r2;
                }
                A0D.registerListener(r2, A0D.getDefaultSensor(1), 2);
            }
        }
    }

    public void onAppBackgrounded() {
        synchronized (this) {
            SensorManager A0D = this.A01.A0D();
            if (A0D != null) {
                C162837sq r0 = this.A00;
                if (r0 == null) {
                    r0 = new C162837sq(this);
                    this.A00 = r0;
                }
                A0D.unregisterListener(r0);
            }
        }
    }

    public C111115hZ(C620633i r1) {
        this.A01 = r1;
    }
}
