package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sm  reason: invalid class name and case insensitive filesystem */
public final class C95194sm extends AnonymousClass3ZG {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(21, this.A07);
        r3.Blb(1, this.A0H);
        r3.Blb(18, this.A00);
        r3.Blb(22, this.A0I);
        r3.Blb(2, this.A08);
        r3.Blb(3, this.A09);
        r3.Blb(4, this.A0A);
        r3.Blb(5, this.A0B);
        r3.Blb(6, this.A01);
        r3.Blb(7, this.A0C);
        r3.Blb(19, this.A0D);
        r3.Blb(8, this.A0E);
        r3.Blb(9, this.A0J);
        r3.Blb(10, this.A0K);
        r3.Blb(11, this.A02);
        r3.Blb(12, this.A03);
        r3.Blb(23, this.A0L);
        r3.Blb(13, this.A04);
        r3.Blb(14, this.A0F);
        r3.Blb(15, this.A0M);
        r3.Blb(20, this.A0G);
        r3.Blb(16, this.A05);
        r3.Blb(24, this.A06);
        r3.Blb(17, this.A0N);
    }

    public C95194sm() {
        super(4032, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass3ZG.A08(AnonymousClass0x2.A0Q(C18270x1.A0D(21, this.A07, A0r), this.A0H, A0r), this.A00, A0r), this.A0I, A0r), this.A08, A0r), this.A09, A0r), this.A0A, A0r), this.A0B, A0r), this.A01, A0r), this.A0C);
        A0r.put(AnonymousClass0x2.A0O(C86634Kw.A0t(AnonymousClass0x2.A0N(C18270x1.A0Q(C18270x1.A0P(AnonymousClass3ZG.A09(C18270x1.A0O(C18270x1.A0N(C18270x1.A0M(C18270x1.A0L(C18270x1.A0K(19, this.A0D, A0r), this.A0E, A0r), this.A0J, A0r), this.A0K, A0r), this.A02, A0r), this.A03, A0r), this.A0L, A0r), this.A04, A0r), this.A0F, A0r), this.A0M, A0r), this.A0G, A0r), this.A05);
        A0r.put(AnonymousClass0x2.A0P(24, this.A06, A0r), this.A0N);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamCallArEffectSession {");
        C57292tP.A00(A0o, "arClassV2", this.A07);
        C57292tP.A00(A0o, "callRandomId", this.A0H);
        C57292tP.A00(A0o, "consentRequested", this.A00);
        C57292tP.A00(A0o, "deliveryOperationId", this.A0I);
        C57292tP.A00(A0o, "effectDurationT", this.A08);
        C57292tP.A00(A0o, "effectEftT", this.A09);
        C57292tP.A00(A0o, "effectEitT", this.A0A);
        C57292tP.A00(A0o, "effectEmtT", this.A0B);
        C57292tP.A00(A0o, "effectEndReason", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "effectEndT", this.A0C);
        C57292tP.A00(A0o, "effectEsdkT", this.A0D);
        C57292tP.A00(A0o, "effectEttiT", this.A0E);
        C57292tP.A00(A0o, "effectId", this.A0J);
        C57292tP.A00(A0o, "effectInstanceId", this.A0K);
        C57292tP.A00(A0o, "effectLoadingFailedReason", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "effectLoadingResultType", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "effectSessionId", this.A0L);
        C57292tP.A00(A0o, "effectStartReason", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "effectStartT", this.A0F);
        C57292tP.A00(A0o, "effectTier", this.A0M);
        C57292tP.A00(A0o, "effectTotalLoadingT", this.A0G);
        C57292tP.A00(A0o, "effectType", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "flmConsentType", C18270x1.A0T(this.A06));
        return AnonymousClass3ZG.A0G(this.A0N, "productSessionId", A0o);
    }
}
