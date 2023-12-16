package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.03t  reason: invalid class name */
public class AnonymousClass03t extends AnonymousClass0O1 {
    public final /* synthetic */ C04520Op A00;
    public final /* synthetic */ C08310eF A01;
    public final /* synthetic */ AtomicReference A02;

    public AnonymousClass03t(C04520Op r1, C08310eF r2, AtomicReference atomicReference) {
        this.A01 = r2;
        this.A02 = atomicReference;
        this.A00 = r1;
    }

    public void A00(C05880Vi r2, Object obj) {
        AnonymousClass0O1 r0 = (AnonymousClass0O1) this.A02.get();
        if (r0 != null) {
            r0.A00(r2, obj);
            return;
        }
        throw AnonymousClass001.A0e("Operation cannot be started before fragment is in created state");
    }
}
