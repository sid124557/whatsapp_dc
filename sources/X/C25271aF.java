package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1aF  reason: invalid class name and case insensitive filesystem */
public final class C25271aF extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public String A04;
    public String A05;
    public String A06;

    public C25271aF() {
        super(3052, AnonymousClass0x9.A0U(1, false), 2, 0);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(7, this.A04);
        r3.Blb(3, this.A01);
        r3.Blb(5, this.A05);
        r3.Blb(4, this.A02);
        r3.Blb(2, this.A03);
        r3.Blb(8, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0K(C18270x1.A0E(C18270x1.A0G(C18270x1.A0H(C18270x1.A0F(C18270x1.A0J(AnonymousClass001.A0f(), this.A00, A0r), this.A04, A0r), this.A01, A0r), this.A05, A0r), this.A02, A0r), this.A03, A0r), this.A06);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamPsStructuredMessageInteraction {");
        C57292tP.A00(A0o, "bizPlatform", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "businessOwnerJid", this.A04);
        C57292tP.A00(A0o, "messageClass", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "messageClassAttributes", this.A05);
        C57292tP.A00(A0o, "messageInteraction", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "messageMediaType", C18270x1.A0T(this.A03));
        return AnonymousClass3ZG.A0G(this.A06, "templateId", A0o);
    }
}
