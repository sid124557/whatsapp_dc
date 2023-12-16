package X;

/* renamed from: X.1wv  reason: invalid class name and case insensitive filesystem */
public class C35471wv extends C35561x4 implements C833548b {
    public C35471wv(boolean z) {
        C56052rL A04 = C56052rL.A04("chatstate");
        C56052rL A042 = C56052rL.A04("composing");
        if (z) {
            C56052rL.A0D(A042, "media", "audio");
        }
        C41032Ir.A06(A042, A04, this);
    }

    public C35471wv() {
        C41032Ir.A06(C56052rL.A04("paused"), C56052rL.A04("chatstate"), this);
    }
}
