package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6iF  reason: invalid class name and case insensitive filesystem */
public final class C133976iF extends AnonymousClass3ZG {
    public Boolean A00;
    public Double A01;
    public Double A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public String A07;

    public C133976iF() {
        super(4712, new AnonymousClass5ZC(1, 1, 1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A01);
        r3.Blb(2, this.A04);
        r3.Blb(3, this.A00);
        r3.Blb(4, this.A03);
        r3.Blb(5, this.A02);
        r3.Blb(6, this.A05);
        r3.Blb(7, this.A06);
        r3.Blb(8, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0K(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A01, A0r), this.A04, A0r), this.A00, A0r), this.A03, A0r), this.A02, A0r), this.A05, A0r), this.A06, A0r), this.A07);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamBotVideoDownload {");
        C57292tP.A00(A0o, "bytesTransferred", this.A01);
        C57292tP.A00(A0o, "httpResponseCode", this.A04);
        C57292tP.A00(A0o, "isPrefetch", this.A00);
        C57292tP.A00(A0o, "mediaDownloadResult", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "mediaSize", this.A02);
        C57292tP.A00(A0o, "overallT", this.A05);
        C57292tP.A00(A0o, "retryCount", this.A06);
        return AnonymousClass3ZG.A0G(this.A07, "videoId", A0o);
    }
}
