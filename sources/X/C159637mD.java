package X;

/* renamed from: X.7mD  reason: invalid class name and case insensitive filesystem */
public class C159637mD implements AnonymousClass4D8 {
    public Object A00;
    public final int A01;

    public C159637mD(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BcE(C95814uZ r4) {
        if (this.A01 != 0) {
            ((C89654ea) this.A00).A05.A0S(new C71533cG((Object) this, 15));
            return;
        }
        C111445i6 r1 = (C111445i6) this.A00;
        if (r4.equals(r1.A0c)) {
            r1.A0I();
            r1.A0E.invalidateOptionsMenu();
        }
    }

    public void Bcr(C95814uZ r4) {
        if (this.A01 != 0) {
            ((C89654ea) this.A00).A05.A0S(new C71533cG((Object) this, 14));
            return;
        }
        C111445i6 r2 = (C111445i6) this.A00;
        if (r4.equals(r2.A0c)) {
            C54942pX r0 = r2.A0o;
            if (r0 != null && r2.A0z.A0a(r0.A06)) {
                r2.A0o = null;
            }
            r2.A0I();
            r2.A0E.invalidateOptionsMenu();
        }
    }
}
