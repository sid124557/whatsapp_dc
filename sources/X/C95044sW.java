package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sW  reason: invalid class name and case insensitive filesystem */
public final class C95044sW extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public String A09;
    public String A0A;

    public C95044sW() {
        super(3546, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A05);
        r3.Blb(2, this.A06);
        r3.Blb(3, this.A00);
        r3.Blb(4, this.A01);
        r3.Blb(5, this.A02);
        r3.Blb(13, this.A07);
        r3.Blb(7, this.A03);
        r3.Blb(12, this.A09);
        r3.Blb(8, this.A0A);
        r3.Blb(10, this.A04);
        r3.Blb(11, this.A08);
    }

    public static void A00(C95044sW r1, AnonymousClass5Z9 r2, int i) {
        r1.A03 = Integer.valueOf(i);
        r1.A01 = 6;
        r2.A02.BhB(r1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0N(C18270x1.A0M(C18270x1.A0K(C18270x1.A0O(C18270x1.A0J(C18270x1.A0P(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A05, A0r), this.A06, A0r), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A07, A0r), this.A03, A0r), this.A09, A0r), this.A0A, A0r), this.A04, A0r), this.A08);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamStatusPosterActions {");
        C57292tP.A00(A0o, "retryCount", this.A05);
        C57292tP.A00(A0o, "statusAudienceSize", this.A06);
        C57292tP.A00(A0o, "statusContentSource", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "statusContentType", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "statusCreationEntryPoint", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "statusDuration", this.A07);
        C57292tP.A00(A0o, "statusEventType", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "statusId", this.A09);
        C57292tP.A00(A0o, "statusPostFailureReason", this.A0A);
        C57292tP.A00(A0o, "statusPrivacyType", C18270x1.A0T(this.A04));
        return AnonymousClass3ZG.A0G(this.A08, "statusSessionId", A0o);
    }
}
