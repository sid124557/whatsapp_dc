package X;

import java.util.Arrays;

/* renamed from: X.7gj  reason: invalid class name and case insensitive filesystem */
public final class C156497gj {
    public static final C156497gj A03 = new C156497gj(new long[0]);
    public final int A00;
    public final long[] A01;
    public final AnonymousClass7A5[] A02;

    public C156497gj(long... jArr) {
        int length = jArr.length;
        this.A00 = length;
        this.A01 = Arrays.copyOf(jArr, length);
        AnonymousClass7A5[] r2 = new AnonymousClass7A5[length];
        this.A02 = r2;
        for (int i = 0; i < length; i++) {
            r2[i] = new AnonymousClass7A5();
        }
    }
}
