package X;

import java.util.ArrayList;

/* renamed from: X.7Sq  reason: invalid class name and case insensitive filesystem */
public abstract class C150897Sq {
    public Object A00;
    public boolean A01 = false;
    public final /* synthetic */ C160847oP A02;

    public final void A00() {
        synchronized (this) {
            this.A00 = null;
        }
        ArrayList arrayList = this.A02.A0P;
        synchronized (arrayList) {
            arrayList.remove(this);
        }
    }

    public C150897Sq(C160847oP r2, Object obj) {
        this.A02 = r2;
        this.A00 = obj;
    }
}
