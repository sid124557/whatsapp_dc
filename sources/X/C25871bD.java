package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1bD  reason: invalid class name and case insensitive filesystem */
public final class C25871bD extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public String A0C;
    public String A0D;
    public String A0E;

    public C25871bD() {
        super(4334, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(19, this.A0C);
        r3.Blb(23, this.A04);
        r3.Blb(24, this.A0D);
        r3.Blb(25, this.A0E);
        r3.Blb(1, this.A09);
        r3.Blb(29, this.A00);
        r3.Blb(26, this.A01);
        r3.Blb(27, this.A02);
        r3.Blb(28, this.A03);
        r3.Blb(2, this.A05);
        r3.Blb(3, this.A06);
        r3.Blb(4, this.A0A);
        r3.Blb(7, this.A07);
        r3.Blb(5, this.A0B);
        r3.Blb(6, this.A08);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(AnonymousClass3ZG.A06(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass3ZG.A0D(AnonymousClass3ZG.A0C(AnonymousClass3ZG.A0B(AnonymousClass3ZG.A0E(C18270x1.A0D(C18290x4.A0f(AnonymousClass3ZG.A0A(AnonymousClass3ZG.A09(19, this.A0C, A0r), this.A04, A0r), this.A0D, A0r), this.A0E, A0r), this.A09, A0r), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A05, A0r), this.A06, A0r), this.A0A, A0r), (Object) null);
        AnonymousClass0x2.A1H((Object) null, A0r, 21);
        A0r.put(C18270x1.A0I(C18270x1.A0H(C18270x1.A0J(22, (Object) null, A0r), this.A07, A0r), this.A0B, A0r), this.A08);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamTsNavigation {");
        C57292tP.A00(A0o, "cid", this.A0C);
        C57292tP.A00(A0o, "entryPointConversationInitiated", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "entryPointConversionApp", this.A0D);
        C57292tP.A00(A0o, "entryPointConversionSource", this.A0E);
        C57292tP.A00(A0o, "groupSize", this.A09);
        C57292tP.A00(A0o, "isCatalogVisible", this.A00);
        C57292tP.A00(A0o, "isCloudapi", this.A01);
        C57292tP.A00(A0o, "isOnpremises", this.A02);
        C57292tP.A00(A0o, "isSmb", this.A03);
        C57292tP.A00(A0o, "navigationDestination", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "navigationSource", C18270x1.A0T(this.A06));
        C57292tP.A00(A0o, "relativeTimestampMs", this.A0A);
        C57292tP.A00(A0o, "threadType", C18270x1.A0T(this.A07));
        C57292tP.A00(A0o, "tsSessionId", this.A0B);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A08), "typeOfGroup", A0o);
    }
}
