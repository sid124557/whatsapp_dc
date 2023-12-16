package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1am  reason: invalid class name and case insensitive filesystem */
public final class C25601am extends AnonymousClass3ZG {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public String A08;
    public String A09;

    public C25601am() {
        super(3524, AnonymousClass0x9.A0U(1, false), 2, 0);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A08);
        r3.Blb(2, this.A01);
        r3.Blb(9, this.A02);
        r3.Blb(3, this.A03);
        r3.Blb(4, this.A09);
        r3.Blb(5, this.A04);
        r3.Blb(6, this.A05);
        r3.Blb(7, this.A00);
        r3.Blb(8, this.A07);
        r3.Blb(10, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0M(C18270x1.A0K(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0L(C18270x1.A0E(AnonymousClass001.A0f(), this.A08, A0r), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A09, A0r), this.A04, A0r), this.A05, A0r), this.A00, A0r), this.A07, A0r), this.A06);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamE2eMessageDecryptFailSender {");
        C57292tP.A00(A0o, "clientMessageId", this.A08);
        C57292tP.A00(A0o, "e2eCiphertextType", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "e2eDestination", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "e2eFailureReason", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "e2eSenderJid", this.A09);
        C57292tP.A00(A0o, "e2eSenderType", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "messageMediaType", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "offline", this.A00);
        C57292tP.A00(A0o, "retryCount", this.A07);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A06), "revokeType", A0o);
    }
}
