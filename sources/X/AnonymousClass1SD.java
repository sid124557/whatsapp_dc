package X;

/* renamed from: X.1SD  reason: invalid class name */
public class AnonymousClass1SD extends AnonymousClass33W {
    public AnonymousClass1SD(AnonymousClass33J r10, String str, long j, boolean z) {
        super(C60642yt.A03, r10, str, "regular_low", 4, j, z);
    }

    public AnonymousClass18L A06() {
        AnonymousClass18L A06 = super.A06();
        C626936e.A06(A06);
        C130546c9 A0K = C18300x5.A0K(C20991Ac.DEFAULT_INSTANCE);
        C20991Ac r2 = (C20991Ac) A0K.A00;
        r2.bitField0_ |= 1;
        r2.allowed_ = true;
        AnonymousClass1EO r22 = (AnonymousClass1EO) C18320x8.A0C(A06);
        C20991Ac r0 = (C20991Ac) A0K.A06();
        r0.getClass();
        r22.androidUnsupportedActions_ = r0;
        r22.bitField0_ |= 1048576;
        return A06;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass33W.A02(this, "AndroidUnsupportedMutation{rowId=", A0o);
        AnonymousClass33W.A03(this, A0o);
        AnonymousClass33W.A04(this, A0o);
        return AnonymousClass000.A0Q(this.A00, A0o);
    }
}
