package X;

/* renamed from: X.9T1  reason: invalid class name */
public class AnonymousClass9T1 {
    public boolean A00;
    public final C194959Vh A01;

    public final void A01(String str) {
        if (!this.A01.A09()) {
            StringBuilder A0l = AnonymousClass000.A0l(str);
            A0l.append(" Current thread: ");
            A0l.append(Thread.currentThread().getName());
            throw AnonymousClass6C7.A0e(A0l);
        }
    }

    public AnonymousClass9T1(C194959Vh r1) {
        this.A01 = r1;
    }

    public final void A00(String str) {
        A01(AnonymousClass000.A0V("Can only check if prepared on the Optic thread. ", str, AnonymousClass001.A0o()));
        if (!this.A00) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Not prepared: ");
            A0o.append(str);
            A0o.append(" Current thread: ");
            throw AnonymousClass000.A0I(Thread.currentThread().getName(), A0o);
        }
    }

    public final void A02(boolean z, String str) {
        A01(AnonymousClass000.A0V("Can only set the prepared state on the Optic thread. ", str, AnonymousClass001.A0o()));
        this.A00 = z;
    }
}
