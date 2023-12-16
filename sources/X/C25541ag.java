package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ag  reason: invalid class name and case insensitive filesystem */
public final class C25541ag extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public String A08;

    public C25541ag() {
        super(3902, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A02);
        r3.Blb(2, this.A03);
        r3.Blb(3, this.A04);
        r3.Blb(4, this.A05);
        r3.Blb(5, this.A08);
        r3.Blb(6, this.A00);
        r3.Blb(8, this.A01);
        r3.Blb(9, this.A06);
        r3.Blb(7, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0J(C18270x1.A0L(C18270x1.A0K(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A02, A0r), this.A03, A0r), this.A04, A0r), this.A05, A0r), this.A08, A0r), this.A00, A0r), this.A01, A0r), this.A06, A0r), this.A07);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamNonMessagePeerDataMediaUpload {");
        C57292tP.A00(A0o, "peerDataErrorCount", this.A02);
        C57292tP.A00(A0o, "peerDataExistingDataNoUploadCount", this.A03);
        C57292tP.A00(A0o, "peerDataNotFoundCount", this.A04);
        C57292tP.A00(A0o, "peerDataRequestCount", this.A05);
        C57292tP.A00(A0o, "peerDataRequestSessionId", this.A08);
        C57292tP.A00(A0o, "peerDataRequestType", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "peerDataResponseResult", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "peerDataSuccessInlineNoUploadCount", this.A06);
        return AnonymousClass3ZG.A0G(this.A07, "peerDataSuccessUploadCount", A0o);
    }
}
