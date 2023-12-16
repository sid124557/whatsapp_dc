package X;

/* renamed from: X.9ZI  reason: invalid class name */
public class AnonymousClass9ZI implements C185288tO, C202019lF {
    public int A00;
    public int A01;
    public C185558ts A02;
    public C185808uH A03;
    public boolean A04;
    public final C157607ia A05 = new C157607ia();
    public final AnonymousClass9O2 A06 = new AnonymousClass9O2();
    public final C1904796x A07 = new C1904796x(true);

    public void AxN(C185558ts r3) {
        this.A02 = r3;
        C185808uH r1 = this.A03;
        if (r1 != null) {
            r1.Bdk(((AnonymousClass9ZC) r3).A04);
        }
        this.A07.A01 = ((AnonymousClass9ZC) r3).A04;
    }

    public void B1c() {
        C185808uH r0 = this.A03;
        if (r0 != null) {
            r0.Bdl();
        }
        this.A07.Bdl();
        this.A02 = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C185808uH r1 = this.A03;
        C185808uH r0 = ((AnonymousClass9ZI) obj).A03;
        if (r1 == r0) {
            return true;
        }
        if (r1 == null || !r1.equals(r0)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        C185808uH r0 = this.A03;
        if (r0 != null) {
            return r0.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GlLegacyRenderer(");
        A0o.append(this.A03);
        return AnonymousClass000.A0X(")", A0o);
    }

    public void release() {
    }

    public void BFr(C185568tt r1) {
    }
}
