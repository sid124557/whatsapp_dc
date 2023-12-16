package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: X.4IN  reason: invalid class name */
public class AnonymousClass4IN implements C16430tO {
    public Object A00;
    public final int A01;

    public AnonymousClass4IN(WeakReference weakReference, int i) {
        this.A01 = i;
        this.A00 = weakReference;
    }

    public void BPR(AnonymousClass0JP r4) {
        C89654ea r2;
        C009707r r22 = (C009707r) ((Reference) this.A00).get();
        if (r22 == null || r22.isDestroyed() || r22.isFinishing()) {
            r22 = null;
        }
        if ((r22 instanceof C89654ea) && (r2 = (C89654ea) r22) != null) {
            r2.BjL();
        }
    }
}
