package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.3pU  reason: invalid class name and case insensitive filesystem */
public abstract class C75013pU extends AnonymousClass8P9 {
    public transient C84814Du A00;
    public final C85494Gl _context;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C75013pU(X.C84814Du r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x000a
            X.4Gl r0 = r2.B5w()
        L_0x0006:
            r1.<init>(r2, r0)
            return
        L_0x000a:
            r0 = 0
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75013pU.<init>(X.4Du):void");
    }

    public void A08() {
        AnonymousClass46G r1;
        C84814Du r3 = this.A00;
        if (!(r3 == null || r3 == this)) {
            C162457s7.A0H(B5w().get(AnonymousClass4GY.A00));
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AnonymousClass46F.A04;
            do {
            } while (atomicReferenceFieldUpdater.get(r3) == C58082ug.A00);
            Object obj = atomicReferenceFieldUpdater.get(r3);
            if ((obj instanceof AnonymousClass46G) && (r1 = (AnonymousClass46G) obj) != null) {
                r1.A0B();
            }
        }
        this.A00 = C72443dj.A00;
    }

    public C85494Gl B5w() {
        if (this instanceof C74713hZ) {
            C85494Gl r0 = ((C74713hZ) this).lastEmissionContext;
            if (r0 == null) {
                return C72553du.A00;
            }
            return r0;
        }
        C85494Gl r02 = this._context;
        C162457s7.A0H(r02);
        return r02;
    }

    public C75013pU(C84814Du r1, C85494Gl r2) {
        super(r1);
        this._context = r2;
    }
}
