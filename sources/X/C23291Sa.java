package X;

/* renamed from: X.1Sa  reason: invalid class name and case insensitive filesystem */
public class C23291Sa extends AnonymousClass33W implements C85294Fr, C837849t {
    public final C95814uZ A00;
    public final AnonymousClass2z0 A01;
    public final boolean A02;

    public C23291Sa(AnonymousClass33J r11, C95814uZ r12, AnonymousClass2z0 r13, String str, long j, boolean z, boolean z2) {
        super(C60642yt.A03, r11, str, "regular_high", 2, j, z2);
        this.A01 = r13;
        this.A00 = r12;
        this.A02 = z;
    }

    public boolean BJD() {
        return !this.A02;
    }

    public /* synthetic */ C95814uZ getChatJid() {
        return AnonymousClass2z0.A01(this.A01);
    }

    public AnonymousClass18L A06() {
        AnonymousClass18L A06 = super.A06();
        C626936e.A06(A06);
        C130546c9 A0G = C21141Ar.DEFAULT_INSTANCE.A0G();
        boolean z = this.A02;
        C21141Ar r1 = (C21141Ar) C18320x8.A0C(A0G);
        r1.bitField0_ |= 1;
        r1.starred_ = z;
        AnonymousClass1EO r12 = (AnonymousClass1EO) C18320x8.A0C(A06);
        C21141Ar r0 = (C21141Ar) A0G.A06();
        r0.getClass();
        r12.starAction_ = r0;
        r12.bitField0_ |= 2;
        return A06;
    }

    public AnonymousClass2z0 B9a() {
        return this.A01;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass33W.A02(this, "StarMessageMutation{rowId=", A0o);
        A0o.append(", key=");
        A0o.append(this.A01);
        A0o.append(", participant=");
        A0o.append(this.A00);
        A0o.append(", starred=");
        A0o.append(this.A02);
        A0o.append(", timestamp=");
        AnonymousClass33W.A05(this, A0o, this.A04);
        return A0o.toString();
    }
}
