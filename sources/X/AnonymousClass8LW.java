package X;

import java.lang.ref.WeakReference;

/* renamed from: X.8LW  reason: invalid class name */
public class AnonymousClass8LW implements Comparable {
    public final int A00;
    public final long A01;
    public final AnonymousClass7XJ A02;
    public final WeakReference A03;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AnonymousClass8LW r6 = (AnonymousClass8LW) obj;
        if (r6 == null) {
            return -1;
        }
        long j = this.A01;
        long j2 = r6.A01;
        if (j >= j2) {
            return AnonymousClass6C9.A1L((j > j2 ? 1 : (j == j2 ? 0 : -1))) ? 1 : 0;
        }
        return -1;
    }

    public AnonymousClass8LW(AnonymousClass7XJ r2, AnonymousClass7XO r3, int i, long j) {
        this.A02 = r2;
        this.A01 = j;
        this.A00 = i;
        this.A03 = AnonymousClass0x9.A14(r3);
    }
}
