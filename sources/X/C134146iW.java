package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6iW  reason: invalid class name and case insensitive filesystem */
public final class C134146iW extends AnonymousClass3ZG {
    public Boolean A00;
    public Double A01;
    public Double A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;

    public C134146iW() {
        super(1766, new AnonymousClass5ZC(1, 1, 1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A01);
        r3.Blb(1, this.A02);
        r3.Blb(13, this.A06);
        r3.Blb(14, this.A07);
        r3.Blb(11, this.A08);
        r3.Blb(10, this.A09);
        r3.Blb(15, this.A0A);
        r3.Blb(12, this.A0B);
        r3.Blb(16, this.A0C);
        r3.Blb(7, this.A00);
        r3.Blb(6, this.A03);
        r3.Blb(4, this.A04);
        r3.Blb(3, this.A0D);
        r3.Blb(5, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0M(C18270x1.A0N(C18270x1.A0Q(C18270x1.A0P(C18270x1.A0D(C18280x3.A0S(), this.A01, A0r), this.A02, A0r), this.A06, A0r), this.A07, A0r), this.A08, A0r), this.A09);
        AnonymousClass3ZG.A0I(A0r, 18);
        A0r.put(C18270x1.A0H(C18270x1.A0F(C18270x1.A0G(C18270x1.A0I(C18270x1.A0J(AnonymousClass0x2.A0O(C18270x1.A0O(15, this.A0A, A0r), this.A0B, A0r), this.A0C, A0r), this.A00, A0r), this.A03, A0r), this.A04, A0r), this.A0D, A0r), this.A05);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamMediaDailyDataUsage {");
        C57292tP.A00(A0o, "bytesReceived", this.A01);
        C57292tP.A00(A0o, "bytesSent", this.A02);
        C57292tP.A00(A0o, "countDownloaded", this.A06);
        C57292tP.A00(A0o, "countForward", this.A07);
        C57292tP.A00(A0o, "countMessageReceived", this.A08);
        C57292tP.A00(A0o, "countMessageSent", this.A09);
        C57292tP.A00(A0o, "countShared", this.A0A);
        C57292tP.A00(A0o, "countUploaded", this.A0B);
        C57292tP.A00(A0o, "countViewed", this.A0C);
        C57292tP.A00(A0o, "isAutoDownload", this.A00);
        C57292tP.A00(A0o, "mediaTransferOrigin", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "mediaType", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "transferDate", this.A0D);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A05), "transferRadio", A0o);
    }
}
