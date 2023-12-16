package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1a4  reason: invalid class name and case insensitive filesystem */
public final class C25161a4 extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public String A05;
    public String A06;

    public C25161a4() {
        super(2952, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A05);
        r3.Blb(5, this.A02);
        r3.Blb(6, this.A03);
        r3.Blb(10, this.A04);
        r3.Blb(9, this.A00);
        r3.Blb(8, this.A01);
        r3.Blb(3, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0F(C18270x1.A0K(C18270x1.A0L(C18270x1.A0M(C18270x1.A0J(C18270x1.A0G(C18270x1.A0I(C18270x1.A0H(AnonymousClass001.A0f(), this.A05, A0r), this.A02, A0r), this.A03, A0r), (Object) null, A0r), (Object) null, A0r), this.A04, A0r), this.A00, A0r), this.A01, A0r), this.A06);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamBusinessMessageLevelCsat {");
        C57292tP.A00(A0o, "businessJid", this.A05);
        C57292tP.A00(A0o, "csatActionType", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "csatEntryPoint", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "csatUserRating", this.A04);
        C57292tP.A00(A0o, "hasCsatRating", this.A00);
        C57292tP.A00(A0o, "isCsatRatingChanged", this.A01);
        return AnonymousClass3ZG.A0G(this.A06, "messageTemplateId", A0o);
    }
}
