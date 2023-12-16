package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ZT  reason: invalid class name */
public final class AnonymousClass1ZT extends AnonymousClass3ZG {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public String A04;

    public AnonymousClass1ZT() {
        super(2136, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A01);
        r3.Blb(6, this.A04);
        r3.Blb(3, this.A02);
        r3.Blb(4, this.A00);
        r3.Blb(5, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0I(C18280x3.A0S(), this.A01, A0r), this.A04, A0r), this.A02, A0r), this.A00, A0r), this.A03);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamDeepLinkOpen {");
        C57292tP.A00(A0o, "deepLinkOpenFrom", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "deepLinkSessionId", this.A04);
        C57292tP.A00(A0o, "deepLinkType", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "isContact", this.A00);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A03), "linkOwnerType", A0o);
    }
}
