package X;

/* renamed from: X.75h  reason: invalid class name and case insensitive filesystem */
public final class C1453875h {
    public static final void A00(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("size=");
            A0o.append(j);
            A0o.append(" offset=");
            A0o.append(j2);
            throw new ArrayIndexOutOfBoundsException(AnonymousClass000.A0Z(" byteCount=", A0o, j3));
        }
    }
}
