package X;

/* renamed from: X.9IH  reason: invalid class name */
public final class AnonymousClass9IH extends C41032Ir {
    public AnonymousClass9IH(String str, String str2, String str3) {
        C56052rL A04 = C56052rL.A04("elo");
        if (C626836d.A0M(str, 1, 10000, false)) {
            C56052rL.A0D(A04, "device_signature", str);
        }
        String str4 = str2;
        if (C626836d.A0M(str4, 1, 10000, false)) {
            C56052rL.A0D(A04, "wallet_signature", str4);
        }
        String str5 = str3;
        if (C626836d.A0M(str5, 1, 10000, false)) {
            C56052rL.A0D(A04, "challenge_id", str5);
        }
        C41032Ir.A0A(A04, this);
    }
}
