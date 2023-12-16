package X;

/* renamed from: X.2fi  reason: invalid class name and case insensitive filesystem */
public class C48932fi {
    public final AnonymousClass2S3 A00;
    public final C47932e4 A01;
    public final AnonymousClass33G A02;

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C48932fi r4 = (C48932fi) obj;
        return r4.A00.equals(this.A00) && r4.A02.equals(this.A02) && r4.A01.equals(this.A01);
    }

    public C48932fi(AnonymousClass2S3 r1, C47932e4 r2, AnonymousClass33G r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = this.A00;
        A1X[1] = this.A02;
        return C18310x6.A08(this.A01, A1X, 2);
    }
}
