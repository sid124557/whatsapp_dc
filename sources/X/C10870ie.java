package X;

import java.lang.ref.WeakReference;

/* renamed from: X.0ie  reason: invalid class name and case insensitive filesystem */
public class C10870ie implements Runnable {
    public final WeakReference A00;

    public void run() {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            ((AnonymousClass08S) weakReference.get()).A0K = false;
        }
    }

    public C10870ie(AnonymousClass08S r2) {
        this.A00 = new WeakReference(r2);
    }
}
