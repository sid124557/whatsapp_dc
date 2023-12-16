package X;

/* renamed from: X.3ZJ  reason: invalid class name */
public class AnonymousClass3ZJ implements Comparable {
    public int A00;
    public long A01;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AnonymousClass3ZJ r8 = (AnonymousClass3ZJ) obj;
        if (r8 == this) {
            return 0;
        }
        long j = (long) (this.A00 - r8.A00);
        if (j == 0) {
            j = this.A01 - r8.A01;
        }
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        return 0;
    }

    public AnonymousClass3ZJ(long j) {
        this.A01 = j;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A00);
        AnonymousClass001.A1L(A0o);
        return AnonymousClass001.A0k(A0o, this.A01);
    }
}
