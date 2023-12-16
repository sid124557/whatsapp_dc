package X;

/* renamed from: X.1mu  reason: invalid class name and case insensitive filesystem */
public class C30721mu extends C30811nC implements AnonymousClass4B9 {
    public /* bridge */ /* synthetic */ C624134x Az3(AnonymousClass2z0 r8) {
        AnonymousClass2z0 r2 = r8;
        if (this instanceof C30711mt) {
            C30711mt r3 = (C30711mt) this;
            return new C30711mt(r3.A01, r2, r3, r3.A0K);
        }
        return new C30721mu(this.A01, r2, this, this.A0K, true);
    }

    public C30721mu(AnonymousClass2z0 r2, byte b, long j) {
        super(r2, (byte) 82, j);
    }

    public boolean A24() {
        if (this.A09 == 1 || !"audio/ogg; codecs=opus".equals(this.A05) || !C627636p.A0s(this)) {
            return false;
        }
        return true;
    }

    public boolean A25() {
        int i = this.A09;
        if (i == 1 || ((i != 1 && "audio/ogg; codecs=opus".equals(this.A05) && !C627636p.A0s(this)) || A24())) {
            return true;
        }
        return false;
    }

    public C30721mu(AnonymousClass33C r1, AnonymousClass2z0 r2, C30721mu r3, long j, boolean z) {
        super(r1, r2, r3, j, z);
    }

    public C30721mu(AnonymousClass2z0 r2, long j) {
        super(r2, (byte) 2, j);
    }
}
