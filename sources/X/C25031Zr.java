package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Zr  reason: invalid class name and case insensitive filesystem */
public final class C25031Zr extends AnonymousClass3ZG {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;

    public C25031Zr() {
        super(4438, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A01);
        r3.Blb(2, this.A02);
        r3.Blb(3, this.A00);
        r3.Blb(4, this.A03);
        r3.Blb(5, this.A05);
        r3.Blb(6, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0K(C18270x1.A0J(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A01, A0r), this.A02, A0r), this.A00, A0r), (Object) null, A0r), (Object) null, A0r), this.A03, A0r), this.A05, A0r), this.A04);
        AnonymousClass3ZG.A0I(A0r, 9);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamPinInChatMessageSend {");
        C57292tP.A00(A0o, "groupRole", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "groupTypeClient", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "isAGroup", this.A00);
        C57292tP.A00(A0o, "mediaType", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "pinInChatExpirySecs", this.A05);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A04), "pinInChatType", A0o);
    }
}
