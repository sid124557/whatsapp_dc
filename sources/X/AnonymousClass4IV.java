package X;

import android.os.Handler;

/* renamed from: X.4IV  reason: invalid class name */
public class AnonymousClass4IV implements C15790rw {
    public Object A00;
    public final int A01;

    public AnonymousClass4IV(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void AwB(Object obj) {
        switch (this.A01) {
            case 0:
                ((AnonymousClass11H) this.A00).A00 = AnonymousClass001.A0K(obj);
                return;
            case 1:
                ((C61262zy) this.A00).A01((Handler) obj);
                return;
            default:
                ((C32151pe) this.A00).A01.A0H((AnonymousClass39T) obj);
                return;
        }
    }
}
