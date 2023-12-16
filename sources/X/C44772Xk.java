package X;

/* renamed from: X.2Xk  reason: invalid class name and case insensitive filesystem */
public final class C44772Xk {
    public final C56972sr A00;
    public final AnonymousClass5ZR A01;

    public final boolean A00() {
        AnonymousClass5ZR r1 = this.A01;
        if ((r1.A02("android.permission.READ_CONTACTS") != 0 || r1.A02("android.permission.WRITE_CONTACTS") != 0) && !this.A00.A0Y()) {
            return false;
        }
        return true;
    }

    public C44772Xk(C56972sr r1, AnonymousClass5ZR r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
