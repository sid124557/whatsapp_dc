package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Zs  reason: invalid class name and case insensitive filesystem */
public final class C25041Zs extends AnonymousClass3ZG {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public String A05;

    public C25041Zs() {
        super(3806, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A05);
        r3.Blb(2, this.A01);
        r3.Blb(3, this.A02);
        r3.Blb(4, this.A03);
        r3.Blb(5, this.A04);
        r3.Blb(6, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(AnonymousClass001.A0f(), this.A05);
        AnonymousClass3ZG.A0I(A0r, 7);
        A0r.put(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18280x3.A0S(), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A04);
        AnonymousClass3ZG.A0I(A0r, 8);
        A0r.put(C18290x4.A0d(), this.A00);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamPnhDaily {");
        C57292tP.A00(A0o, "communityId", this.A05);
        C57292tP.A00(A0o, "pnhIndicatorClicksChat", this.A01);
        C57292tP.A00(A0o, "pnhIndicatorClicksInfoScreen", this.A02);
        C57292tP.A00(A0o, "reactionDeleteCount", this.A03);
        C57292tP.A00(A0o, "reactionOpenTrayCount", this.A04);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A00), "typeOfGroup", A0o);
    }
}
