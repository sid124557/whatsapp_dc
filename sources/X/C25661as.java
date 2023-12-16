package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1as  reason: invalid class name and case insensitive filesystem */
public final class C25661as extends AnonymousClass3ZG {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public String A09;

    public C25661as() {
        super(472, AnonymousClass0x9.A0T(1, 100, 5000), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(9, this.A01);
        r3.Blb(11, this.A02);
        r3.Blb(5, this.A06);
        r3.Blb(8, this.A00);
        r3.Blb(6, this.A07);
        r3.Blb(4, this.A03);
        r3.Blb(7, this.A04);
        r3.Blb(3, this.A08);
        r3.Blb(12, this.A09);
        r3.Blb(1, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0K(C18270x1.A0H(C18270x1.A0N(C18300x5.A0Y(), this.A01, A0r), this.A02, A0r), this.A06, A0r), this.A00);
        AnonymousClass3ZG.A0I(A0r, 10);
        A0r.put(C18270x1.A0J(C18270x1.A0G(C18290x4.A0d(), this.A07, A0r), this.A03, A0r), this.A04);
        AnonymousClass3ZG.A0I(A0r, 2);
        A0r.put(C18270x1.A0D(C18270x1.A0O(C18290x4.A0a(), this.A08, A0r), this.A09, A0r), this.A05);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamUiAction {");
        C57292tP.A00(A0o, "agentEngagementType", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "botType", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "deviceCount", this.A06);
        C57292tP.A00(A0o, "isLid", this.A00);
        C57292tP.A00(A0o, "participantCount", this.A07);
        C57292tP.A00(A0o, "sizeBucket", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "uiActionChatType", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "uiActionT", this.A08);
        C57292tP.A00(A0o, "uiActionTtrcSurfaceName", this.A09);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A05), "uiActionType", A0o);
    }
}
