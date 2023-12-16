package X;

/* renamed from: X.9IM  reason: invalid class name */
public final class AnonymousClass9IM extends C35561x4 {
    public AnonymousClass9IM(Long l, String str, String str2, byte[] bArr) {
        C56052rL A04 = C56052rL.A04("pin");
        if (C1899593h.A1b(str, false)) {
            C56052rL.A0D(A04, "provider", str);
        }
        if (C1899593h.A1Y(str2, 1, false)) {
            C56052rL.A0D(A04, "key-type", str2);
        }
        if (C626836d.A0J(l, 0, 9007199254740991L, false)) {
            C56052rL.A0A(A04, l, "key-version");
        }
        C626836d.A0H(bArr, 0, 9007199254740991L);
        A04.A01 = bArr;
        C41032Ir.A0A(A04, this);
    }
}
