package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sg  reason: invalid class name and case insensitive filesystem */
public final class C95134sg extends AnonymousClass3ZG {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;

    public C95134sg() {
        super(4504, AnonymousClass0x9.A0U(1, false), 2, 113760892);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A01);
        r3.Blb(3, this.A02);
        r3.Blb(4, this.A03);
        r3.Blb(5, this.A04);
        r3.Blb(6, this.A05);
        r3.Blb(7, this.A06);
        r3.Blb(8, this.A07);
        r3.Blb(9, this.A08);
        r3.Blb(10, this.A09);
        r3.Blb(11, this.A0A);
        r3.Blb(12, this.A0B);
        r3.Blb(13, this.A0C);
        r3.Blb(14, this.A0D);
        r3.Blb(15, this.A0E);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(AnonymousClass0x2.A0N(C18270x1.A0Q(C18270x1.A0P(C18270x1.A0O(C18270x1.A0N(C18270x1.A0M(C18270x1.A0L(C18270x1.A0K(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A04, A0r), this.A05, A0r), this.A06, A0r), this.A07, A0r), this.A08, A0r), this.A09, A0r), this.A0A, A0r), this.A0B, A0r), this.A0C, A0r), this.A0D, A0r), this.A0E);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamIncomingCallPrivacyImpact {");
        C57292tP.A00(A0o, "acceptedWouldSilence180d", this.A00);
        C57292tP.A00(A0o, "acceptedWouldSilence30d", this.A01);
        C57292tP.A00(A0o, "acceptedWouldSilence360d", this.A02);
        C57292tP.A00(A0o, "acceptedWouldSilence60d", this.A03);
        C57292tP.A00(A0o, "acceptedWouldSilence90d", this.A04);
        C57292tP.A00(A0o, "allWouldSilence180d", this.A05);
        C57292tP.A00(A0o, "allWouldSilence30d", this.A06);
        C57292tP.A00(A0o, "allWouldSilence360d", this.A07);
        C57292tP.A00(A0o, "allWouldSilence60d", this.A08);
        C57292tP.A00(A0o, "allWouldSilence90d", this.A09);
        C57292tP.A00(A0o, "total180d", this.A0A);
        C57292tP.A00(A0o, "total30d", this.A0B);
        C57292tP.A00(A0o, "total360d", this.A0C);
        C57292tP.A00(A0o, "total60d", this.A0D);
        return AnonymousClass3ZG.A0G(this.A0E, "total90d", A0o);
    }
}
