package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6iM  reason: invalid class name and case insensitive filesystem */
public final class C134046iM extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public String A08;
    public String A09;

    public C134046iM() {
        super(3690, new AnonymousClass5ZC(1, 1, 1, false), 2, 0);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A01);
        r3.Blb(3, this.A02);
        r3.Blb(4, this.A03);
        r3.Blb(5, this.A08);
        r3.Blb(6, this.A09);
        r3.Blb(7, this.A04);
        r3.Blb(8, this.A05);
        r3.Blb(9, this.A07);
        r3.Blb(10, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0M(C18270x1.A0L(C18270x1.A0K(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A08, A0r), this.A09, A0r), this.A04, A0r), this.A05, A0r), this.A07, A0r), this.A06);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamStatusViewerTrafficActions {");
        C57292tP.A00(A0o, "fullStatusViewed", this.A00);
        C57292tP.A00(A0o, "isFirstViewOfStatus", this.A01);
        C57292tP.A00(A0o, "isPosterBiz", this.A02);
        C57292tP.A00(A0o, "isPosterInAddressBook", this.A03);
        C57292tP.A00(A0o, "statusId", this.A08);
        C57292tP.A00(A0o, "statusPosterJid", this.A09);
        C57292tP.A00(A0o, "statusReplyMessageType", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "statusViewEntryPoint", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "statusViewerSessionId", this.A07);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A06), "statusViewerTrafficActionType", A0o);
    }
}
