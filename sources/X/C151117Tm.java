package X;

/* renamed from: X.7Tm  reason: invalid class name and case insensitive filesystem */
public class C151117Tm {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C142496xI A04;

    public String toString() {
        StringBuilder sb;
        long j;
        C142496xI r2 = this.A04;
        int ordinal = r2.ordinal();
        if (ordinal == 4) {
            sb = C18330xA.A0A(C142496xI.TARGET_BUFFER_SIZE_REACHED.value);
            sb.append(". Target:");
            sb.append(this.A02);
            sb.append(". Allocation:");
            j = this.A03;
        } else if (ordinal == 2) {
            sb = C18330xA.A0A(C142496xI.BUFFER_DRAINING_ABOVE_LOW_WATERMARK.value);
            sb.append(". Low watermark:");
            j = this.A01;
        } else if (ordinal != 3) {
            return r2.value;
        } else {
            sb = C18330xA.A0A(C142496xI.ABOVE_HIGH_WATERMARK.value);
            sb.append(". High watermark:");
            j = this.A00;
        }
        return AnonymousClass001.A0k(sb, j);
    }

    public C151117Tm(C142496xI r1, long j, long j2, long j3, long j4) {
        this.A04 = r1;
        this.A02 = j;
        this.A03 = j2;
        this.A01 = j3;
        this.A00 = j4;
    }
}
