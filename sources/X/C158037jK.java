package X;

/* renamed from: X.7jK  reason: invalid class name and case insensitive filesystem */
public final class C158037jK {
    public static final C158037jK A02 = new C158037jK(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final C158037jK A03;
    public static final C158037jK A04;
    public static final C158037jK A05 = new C158037jK(0, Long.MAX_VALUE);
    public static final C158037jK A06 = new C158037jK(Long.MAX_VALUE, 0);
    public final long A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C158037jK.class != obj.getClass()) {
                return false;
            }
            C158037jK r7 = (C158037jK) obj;
            if (!(this.A01 == r7.A01 && this.A00 == r7.A00)) {
                return false;
            }
        }
        return true;
    }

    static {
        C158037jK r5 = new C158037jK(0, 0);
        A04 = r5;
        A03 = r5;
    }

    public int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public C158037jK(long j, long j2) {
        boolean z = true;
        C159197lM.A01(AnonymousClass001.A1U((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        C159197lM.A01(j2 < 0 ? false : z);
        this.A01 = j;
        this.A00 = j2;
    }
}
