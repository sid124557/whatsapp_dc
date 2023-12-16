package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6ie  reason: invalid class name and case insensitive filesystem */
public final class C134226ie extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
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
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public Long A0M;
    public Long A0N;
    public Long A0O;
    public Long A0P;
    public String A0Q;
    public String A0R;

    public C134226ie() {
        super(1138, new AnonymousClass5ZC(1, 20, 200, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(9, this.A05);
        r3.Blb(10, this.A06);
        r3.Blb(8, this.A07);
        r3.Blb(11, this.A08);
        r3.Blb(7, this.A09);
        r3.Blb(17, this.A0A);
        r3.Blb(14, this.A0Q);
        r3.Blb(1, this.A00);
        r3.Blb(20, this.A0B);
        r3.Blb(26, this.A01);
        r3.Blb(15, this.A02);
        r3.Blb(24, this.A0C);
        r3.Blb(23, this.A0D);
        r3.Blb(27, this.A0E);
        r3.Blb(25, this.A0F);
        r3.Blb(13, this.A0R);
        r3.Blb(22, this.A0G);
        r3.Blb(19, this.A03);
        r3.Blb(4, this.A0H);
        r3.Blb(5, this.A0I);
        r3.Blb(3, this.A0J);
        r3.Blb(6, this.A0K);
        r3.Blb(2, this.A0L);
        r3.Blb(28, this.A0M);
        r3.Blb(21, this.A0N);
        r3.Blb(18, this.A0O);
        r3.Blb(16, this.A0P);
        r3.Blb(12, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C86634Kw.A0t(C18270x1.A0D(C18270x1.A0Q(AnonymousClass0x2.A0P(C18270x1.A0J(C18270x1.A0N(C18270x1.A0K(C18270x1.A0M(9, this.A05, A0r), this.A06, A0r), this.A07, A0r), this.A08, A0r), this.A09, A0r), this.A0A, A0r), this.A0Q, A0r), this.A00, A0r), this.A0B);
        A0r.put(AnonymousClass0x2.A0N(26, this.A01, A0r), this.A02);
        A0r.put(24, this.A0C);
        A0r.put(23, this.A0D);
        A0r.put(C18270x1.A0P(C18290x4.A0f(27, this.A0E, A0r), this.A0F, A0r), this.A0R);
        A0r.put(C18270x1.A0E(C18270x1.A0I(C18270x1.A0F(C18270x1.A0H(C18270x1.A0G(AnonymousClass6C8.A0a(22, this.A0G, A0r), this.A03, A0r), this.A0H, A0r), this.A0I, A0r), this.A0J, A0r), this.A0K, A0r), this.A0L);
        A0r.put(C18270x1.A0O(AnonymousClass0x2.A0O(AnonymousClass0x2.A0Q(C86634Kw.A0u(28, this.A0M, A0r), this.A0N, A0r), this.A0O, A0r), this.A0P, A0r), this.A04);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAndroidMediaTranscodeEvent {");
        C57292tP.A00(A0o, "dstBitrate", this.A05);
        C57292tP.A00(A0o, "dstDurationSec", this.A06);
        C57292tP.A00(A0o, "dstHeight", this.A07);
        C57292tP.A00(A0o, "dstSize", this.A08);
        C57292tP.A00(A0o, "dstWidth", this.A09);
        C57292tP.A00(A0o, "durationMs", this.A0A);
        C57292tP.A00(A0o, "errorType", this.A0Q);
        C57292tP.A00(A0o, "fileIsDoodle", this.A00);
        C57292tP.A00(A0o, "firstScanSize", this.A0B);
        C57292tP.A00(A0o, "hasStatusMessage", this.A01);
        C57292tP.A00(A0o, "isSuccess", this.A02);
        C57292tP.A00(A0o, "lowQualitySize", this.A0C);
        C57292tP.A00(A0o, "maxEdge", this.A0D);
        C57292tP.A00(A0o, "mediaId", this.A0E);
        C57292tP.A00(A0o, "midQualitySize", this.A0F);
        C57292tP.A00(A0o, "operation", this.A0R);
        C57292tP.A00(A0o, "photoCompressionQuality", this.A0G);
        C57292tP.A00(A0o, "progressiveJpeg", this.A03);
        C57292tP.A00(A0o, "srcBitrate", this.A0H);
        C57292tP.A00(A0o, "srcDurationSec", this.A0I);
        C57292tP.A00(A0o, "srcHeight", this.A0J);
        C57292tP.A00(A0o, "srcSize", this.A0K);
        C57292tP.A00(A0o, "srcWidth", this.A0L);
        C57292tP.A00(A0o, "targetBitrate", this.A0M);
        C57292tP.A00(A0o, "thumbnailSize", this.A0N);
        C57292tP.A00(A0o, "totalQueueMs", this.A0O);
        C57292tP.A00(A0o, "transcodeMediaType", this.A0P);
        return AnonymousClass3ZG.A0G(this.A04, "transcoderSupported", A0o);
    }
}
