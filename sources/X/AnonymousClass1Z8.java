package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Z8  reason: invalid class name */
public final class AnonymousClass1Z8 extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Long A03;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A02);
        r3.Blb(3, this.A01);
        r3.Blb(4, this.A03);
    }

    public AnonymousClass1Z8() {
        super(3266, AnonymousClass3ZG.A04(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, A0r), this.A02, A0r), this.A01, A0r), this.A03);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamPsPhoneNumberHyperlink {");
        C57292tP.A00(A0o, "isPhoneNumHyperlinkOwner", this.A00);
        C57292tP.A00(A0o, "phoneNumHyperlinkAction", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "phoneNumberStatusOnWa", this.A01);
        return AnonymousClass3ZG.A0G(this.A03, "sequenceNumber", A0o);
    }
}
