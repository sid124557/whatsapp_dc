package X;

/* renamed from: X.7jJ  reason: invalid class name and case insensitive filesystem */
public final class C158027jJ {
    public static final C158027jJ A02;
    public static final C158027jJ A03;
    public final long A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C158027jJ.class != obj.getClass()) {
                return false;
            }
            C158027jJ r7 = (C158027jJ) obj;
            if (!(this.A01 == r7.A01 && this.A00 == r7.A00)) {
                return false;
            }
        }
        return true;
    }

    static {
        C158027jJ r5 = new C158027jJ(0, 0);
        A03 = r5;
        new C158027jJ(Long.MAX_VALUE, Long.MAX_VALUE);
        new C158027jJ(Long.MAX_VALUE, 0);
        new C158027jJ(0, Long.MAX_VALUE);
        A02 = r5;
    }

    public int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public C158027jJ(long j, long j2) {
        boolean z = true;
        C161487pm.A03(AnonymousClass001.A1U((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        C161487pm.A03(j2 < 0 ? false : z);
        this.A01 = j;
        this.A00 = j2;
    }
}
