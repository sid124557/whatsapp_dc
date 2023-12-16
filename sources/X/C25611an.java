package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1an  reason: invalid class name and case insensitive filesystem */
public final class C25611an extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;

    public C25611an() {
        super(4114, AnonymousClass0x9.A0U(1, false), 2, 0);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A06);
        r3.Blb(7, this.A01);
        r3.Blb(8, this.A07);
        r3.Blb(9, this.A08);
        r3.Blb(11, this.A02);
        r3.Blb(3, this.A03);
        r3.Blb(4, this.A09);
        r3.Blb(5, this.A04);
        r3.Blb(6, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        AnonymousClass3ZG.A0I(A0r, 10);
        A0r.put(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0N(C18270x1.A0L(C18270x1.A0K(C18270x1.A0J(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, A0r), this.A06, A0r), this.A01, A0r), this.A07, A0r), this.A08, A0r), this.A02, A0r), this.A03, A0r), this.A09, A0r), this.A04, A0r), this.A05);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamExtensionsStructuredMessageInteraction {");
        C57292tP.A00(A0o, "bizPlatform", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "businessOwnerJid", this.A06);
        C57292tP.A00(A0o, "entryPointConversationInitiated", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "entryPointConversionApp", this.A07);
        C57292tP.A00(A0o, "entryPointConversionSource", this.A08);
        C57292tP.A00(A0o, "flowEntryPoint", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "messageClass", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "messageClassAttributes", this.A09);
        C57292tP.A00(A0o, "messageInteraction", C18270x1.A0T(this.A04));
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A05), "messageMediaType", A0o);
    }
}
