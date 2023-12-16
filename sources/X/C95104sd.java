package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sd  reason: invalid class name and case insensitive filesystem */
public final class C95104sd extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;

    public C95104sd() {
        super(3124, new AnonymousClass5ZC(1, 1, 20, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A00);
        r3.Blb(3, this.A01);
        r3.Blb(5, this.A02);
        r3.Blb(1, this.A03);
        r3.Blb(6, this.A04);
        r3.Blb(7, this.A05);
        r3.Blb(11, this.A06);
        r3.Blb(12, this.A07);
        r3.Blb(13, this.A08);
        r3.Blb(14, this.A09);
        r3.Blb(15, this.A0A);
        r3.Blb(16, this.A0B);
        r3.Blb(17, this.A0C);
        r3.Blb(18, this.A0D);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0F(C18280x3.A0S(), this.A00, A0r), this.A01);
        AnonymousClass3ZG.A0I(A0r, 4);
        A0r.put(AnonymousClass0x2.A0Q(AnonymousClass0x2.A0P(AnonymousClass0x2.A0O(AnonymousClass0x2.A0N(C18270x1.A0Q(C18270x1.A0P(C18270x1.A0O(C18270x1.A0N(C18270x1.A0M(C18270x1.A0L(C18270x1.A0K(C18270x1.A0J(C18270x1.A0I(C18270x1.A0D(C18290x4.A0c(), this.A02, A0r), this.A03, A0r), this.A04, A0r), this.A05, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), this.A06, A0r), this.A07, A0r), this.A08, A0r), this.A09, A0r), this.A0A, A0r), this.A0B, A0r), this.A0C, A0r), this.A0D);
        AnonymousClass3ZG.A0I(A0r, 19);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamContactInfo {");
        C57292tP.A00(A0o, "avatar", this.A00);
        C57292tP.A00(A0o, "blockContact", this.A01);
        C57292tP.A00(A0o, "contactDetails", this.A02);
        C57292tP.A00(A0o, "contactInfoVisit", this.A03);
        C57292tP.A00(A0o, "disappearingMessages", this.A04);
        C57292tP.A00(A0o, "encryption", this.A05);
        C57292tP.A00(A0o, "mute", this.A06);
        C57292tP.A00(A0o, "payments", this.A07);
        C57292tP.A00(A0o, "reportContact", this.A08);
        C57292tP.A00(A0o, "search", this.A09);
        C57292tP.A00(A0o, "shareContact", this.A0A);
        C57292tP.A00(A0o, "starredMessages", this.A0B);
        C57292tP.A00(A0o, "videoCall", this.A0C);
        return AnonymousClass3ZG.A0G(this.A0D, "voiceCall", A0o);
    }
}
