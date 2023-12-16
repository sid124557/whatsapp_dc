package X;

/* renamed from: X.7R6  reason: invalid class name */
public final class AnonymousClass7R6 {
    public long[] A00 = new long[20];

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("<LongStack vector:[");
        long[] jArr = this.A00;
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                AnonymousClass001.A1L(A0o);
            }
            if (i == -1) {
                A0o.append(">>");
            }
            A0o.append(jArr[i]);
            if (i == -1) {
                A0o.append("<<");
            }
        }
        String A0X = AnonymousClass000.A0X("]>", A0o);
        C162457s7.A0D(A0X);
        return A0X;
    }
}
