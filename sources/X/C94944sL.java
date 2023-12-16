package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sL  reason: invalid class name and case insensitive filesystem */
public final class C94944sL extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public Long A08;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(6, this.A02);
        r3.Blb(2, this.A03);
        r3.Blb(7, this.A04);
        r3.Blb(5, this.A07);
        r3.Blb(8, this.A00);
        r3.Blb(9, this.A01);
        r3.Blb(4, this.A05);
        r3.Blb(3, this.A06);
        r3.Blb(1, this.A08);
    }

    public C94944sL() {
        super(1176, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0D(C18270x1.A0F(C18270x1.A0G(C18270x1.A0L(C18270x1.A0K(C18270x1.A0H(C18270x1.A0J(C18270x1.A0E(C18290x4.A0d(), this.A02, A0r), this.A03, A0r), this.A04, A0r), this.A07, A0r), this.A00, A0r), this.A01, A0r), this.A05, A0r), this.A06, A0r), this.A08);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamStatusPost {");
        C57292tP.A00(A0o, "defaultStatusPrivacySetting", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "mediaType", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "perPostStatusPrivacySetting", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "retryCount", this.A07);
        C57292tP.A00(A0o, "statusAudienceSelectorClicked", this.A00);
        C57292tP.A00(A0o, "statusAudienceSelectorUpdated", this.A01);
        C57292tP.A00(A0o, "statusPostOrigin", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "statusPostResult", C18270x1.A0T(this.A06));
        return AnonymousClass3ZG.A0G(this.A08, "statusSessionId", A0o);
    }
}
