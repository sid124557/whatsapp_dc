package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6iX  reason: invalid class name and case insensitive filesystem */
public final class C134156iX extends AnonymousClass3ZG {
    public Boolean A00;
    public Double A01;
    public Double A02;
    public Double A03;
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

    public C134156iX() {
        super(1584, new AnonymousClass5ZC(1, 1, 100, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(4, this.A01);
        r3.Blb(5, this.A02);
        r3.Blb(15, this.A00);
        r3.Blb(7, this.A07);
        r3.Blb(2, this.A03);
        r3.Blb(3, this.A04);
        r3.Blb(10, this.A08);
        r3.Blb(1, this.A09);
        r3.Blb(14, this.A0A);
        r3.Blb(16, this.A05);
        r3.Blb(11, this.A06);
        r3.Blb(13, this.A0B);
        r3.Blb(9, this.A0C);
        r3.Blb(8, this.A0D);
        r3.Blb(6, this.A0E);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(AnonymousClass0x2.A0N(C18270x1.A0H(C18290x4.A0b(), this.A01, A0r), this.A02, A0r), this.A00);
        AnonymousClass3ZG.A0I(A0r, 12);
        A0r.put(C18270x1.A0Q(C18270x1.A0D(C18270x1.A0M(C18270x1.A0F(C18270x1.A0E(AnonymousClass0x7.A0g(), this.A07, A0r), this.A03, A0r), this.A04, A0r), this.A08, A0r), this.A09, A0r), this.A0A);
        AnonymousClass3ZG.A0I(A0r, 17);
        A0r.put(C18270x1.A0I(C18270x1.A0K(C18270x1.A0L(C18270x1.A0P(C18270x1.A0N(16, this.A05, A0r), this.A06, A0r), this.A0B, A0r), this.A0C, A0r), this.A0D, A0r), this.A0E);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamMediaStreamPlayback {");
        C57292tP.A00(A0o, "bytesDownloadedStart", this.A01);
        C57292tP.A00(A0o, "bytesTransferred", this.A02);
        C57292tP.A00(A0o, "didPlay", this.A00);
        C57292tP.A00(A0o, "initialBufferingT", this.A07);
        C57292tP.A00(A0o, "mediaSize", this.A03);
        C57292tP.A00(A0o, "mediaType", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "overallPlayT", this.A08);
        C57292tP.A00(A0o, "overallT", this.A09);
        C57292tP.A00(A0o, "playbackCount", this.A0A);
        C57292tP.A00(A0o, "playbackOrigin", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "playbackState", C18270x1.A0T(this.A06));
        C57292tP.A00(A0o, "seekCount", this.A0B);
        C57292tP.A00(A0o, "totalRebufferingCount", this.A0C);
        C57292tP.A00(A0o, "totalRebufferingT", this.A0D);
        return AnonymousClass3ZG.A0G(this.A0E, "videoDuration", A0o);
    }
}
