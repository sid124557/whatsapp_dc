package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4s5  reason: invalid class name */
public final class AnonymousClass4s5 extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Long A05;

    public AnonymousClass4s5() {
        super(3138, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A05);
        r3.Blb(3, this.A00);
        r3.Blb(4, this.A01);
        r3.Blb(5, this.A02);
        r3.Blb(1, this.A04);
        r3.Blb(6, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0I(C18270x1.A0D(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18280x3.A0S(), this.A05, A0r), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A04, A0r), this.A03);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamConversationsNuxUiAction {");
        C57292tP.A00(A0o, "contactPosition", this.A05);
        C57292tP.A00(A0o, "favorited", this.A00);
        C57292tP.A00(A0o, "frequentlyContacted", this.A01);
        C57292tP.A00(A0o, "presence", this.A02);
        C57292tP.A00(A0o, "uiActionSource", C18270x1.A0T(this.A04));
        return AnonymousClass3ZG.A0G(this.A03, "withProfilePic", A0o);
    }
}
