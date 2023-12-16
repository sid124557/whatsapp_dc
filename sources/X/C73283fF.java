package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: X.3fF  reason: invalid class name and case insensitive filesystem */
public class C73283fF extends WeakReference {
    public Object A00;
    public final long A01;
    public final String A02;
    public final WeakReference A03 = AnonymousClass0x9.A14(AnonymousClass002.A0D());

    public C73283fF(Object obj, String str, ReferenceQueue referenceQueue, long j) {
        super(obj, referenceQueue);
        this.A02 = str;
        this.A01 = j;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("KeyedWeakReference{key='");
        C18320x8.A1M(A0o, this.A02);
        A0o.append(", timestamp=");
        A0o.append(this.A01);
        A0o.append(", canary=");
        A0o.append(this.A03);
        A0o.append(", confirmMarker=");
        return AnonymousClass000.A0Q(this.A00, A0o);
    }
}
