package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.46F  reason: invalid class name */
public final class AnonymousClass46F extends AnonymousClass47B implements C84814Du, AnonymousClass4C3 {
    public static final AtomicReferenceFieldUpdater A04 = AtomicReferenceFieldUpdater.newUpdater(AnonymousClass46F.class, Object.class, "_reusableCancellableContinuation");
    public Object A00 = C58082ug.A01;
    public final Object A01;
    public final C84814Du A02;
    public final C73853gB A03;
    public volatile Object _reusableCancellableContinuation;

    public AnonymousClass46F(C84814Du r4, C73853gB r5) {
        super(-1);
        this.A03 = r5;
        this.A02 = r4;
        Object fold = r4.B5w().fold(C18290x4.A0Z(), AnonymousClass34N.A00);
        C162457s7.A0H(fold);
        this.A01 = fold;
    }

    public AnonymousClass4C3 B5B() {
        C84814Du r1 = this.A02;
        if (r1 instanceof AnonymousClass4C3) {
            return (AnonymousClass4C3) r1;
        }
        return null;
    }

    public C85494Gl B5w() {
        return this.A02.B5w();
    }

    public void BkD(Object obj) {
        C85494Gl B5w;
        Object A002;
        C84814Du r9 = this.A02;
        C85494Gl B5w2 = r9.B5w();
        Object obj2 = obj;
        Throwable A003 = AnonymousClass3Z9.A00(obj);
        if (A003 != null) {
            obj2 = new AnonymousClass333(A003);
        }
        C73853gB r1 = this.A03;
        if (r1.A03(B5w2)) {
            this.A00 = obj2;
            this.A00 = 0;
            r1.A01(this, B5w2);
            return;
        }
        AnonymousClass46B A004 = C57992uX.A00();
        long j = A004.A00;
        if (j >= 4294967296L) {
            this.A00 = obj2;
            this.A00 = 0;
            A004.A06(this);
            return;
        }
        A004.A00 = j + 4294967296L;
        try {
            B5w = r9.B5w();
            A002 = AnonymousClass34N.A00(this.A01, B5w);
            r9.BkD(obj);
            AnonymousClass34N.A01(A002, B5w);
            do {
            } while (A004.A08());
        } catch (Throwable th) {
            try {
                A04(th, (Throwable) null);
            } catch (Throwable th2) {
                A004.A07(true);
                throw th2;
            }
        }
        A004.A07(true);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DispatchedContinuation[");
        A0o.append(this.A03);
        AnonymousClass001.A1M(A0o);
        A0o.append(AnonymousClass2AG.A00(this.A02));
        return AnonymousClass0x2.A0f(A0o);
    }
}
