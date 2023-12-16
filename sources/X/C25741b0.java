package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1b0  reason: invalid class name and case insensitive filesystem */
public final class C25741b0 extends AnonymousClass3ZG {
    public Double A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;

    public C25741b0() {
        super(1012, AnonymousClass0x9.A0T(1, SearchActionVerificationClientService.NOTIFICATION_ID, 1000000), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(10, this.A05);
        r3.Blb(11, this.A06);
        r3.Blb(4, this.A07);
        r3.Blb(1, this.A08);
        r3.Blb(6, this.A09);
        r3.Blb(9, this.A01);
        r3.Blb(7, this.A02);
        r3.Blb(8, this.A03);
        r3.Blb(3, this.A0A);
        r3.Blb(5, this.A04);
        r3.Blb(2, this.A00);
        r3.Blb(12, this.A0B);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0I(C18270x1.A0D(C18270x1.A0G(C18270x1.A0N(AnonymousClass0x7.A0h(), this.A05, A0r), this.A06, A0r), this.A07, A0r), this.A08, A0r), this.A09);
        AnonymousClass3ZG.A0I(A0r, 13);
        A0r.put(C18270x1.A0O(C18270x1.A0E(C18270x1.A0H(C18270x1.A0F(C18270x1.A0K(C18270x1.A0J(C18300x5.A0Y(), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A0A, A0r), this.A04, A0r), this.A00, A0r), this.A0B);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamVideoPlay {");
        C57292tP.A00(A0o, "bitrate", this.A05);
        C57292tP.A00(A0o, "height", this.A06);
        C57292tP.A00(A0o, "videoAge", this.A07);
        C57292tP.A00(A0o, "videoDuration", this.A08);
        C57292tP.A00(A0o, "videoInitialBufferingT", this.A09);
        C57292tP.A00(A0o, "videoPlayOrigin", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "videoPlayResult", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "videoPlaySurface", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "videoPlayT", this.A0A);
        C57292tP.A00(A0o, "videoPlayType", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "videoSize", this.A00);
        return AnonymousClass3ZG.A0G(this.A0B, "width", A0o);
    }
}
