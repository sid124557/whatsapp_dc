package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4si  reason: invalid class name and case insensitive filesystem */
public final class C95154si extends AnonymousClass3ZG {
    public Integer A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;

    public C95154si() {
        super(4470, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A01);
        r3.Blb(2, this.A02);
        r3.Blb(3, this.A03);
        r3.Blb(4, this.A04);
        r3.Blb(5, this.A05);
        r3.Blb(15, this.A06);
        r3.Blb(6, this.A07);
        r3.Blb(7, this.A08);
        r3.Blb(8, this.A00);
        r3.Blb(9, this.A09);
        r3.Blb(10, this.A0A);
        r3.Blb(11, this.A0B);
        r3.Blb(12, this.A0C);
        r3.Blb(13, this.A0D);
        r3.Blb(14, this.A0E);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0Q(C18270x1.A0P(C18270x1.A0O(C18270x1.A0N(C18270x1.A0M(C18270x1.A0L(C18270x1.A0K(C18270x1.A0J(C18270x1.A0I(AnonymousClass0x2.A0N(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A04, A0r), this.A05, A0r), this.A06, A0r), this.A07, A0r), this.A08, A0r), this.A00, A0r), this.A09, A0r), this.A0A, A0r), this.A0B, A0r), this.A0C, A0r), this.A0D, A0r), this.A0E);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamWaBloksSupportVideo {");
        C57292tP.A00(A0o, "appUniqueId", this.A01);
        C57292tP.A00(A0o, "approxWatchTime", this.A02);
        C57292tP.A00(A0o, "captionState", this.A03);
        C57292tP.A00(A0o, "deviceCategory", this.A04);
        C57292tP.A00(A0o, "deviceOs", this.A05);
        C57292tP.A00(A0o, "playbackSessionId", this.A06);
        C57292tP.A00(A0o, "supportVideoDuration", this.A07);
        C57292tP.A00(A0o, "timeMs", this.A08);
        C57292tP.A00(A0o, "videoEventType", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "videoId", this.A09);
        C57292tP.A00(A0o, "videoLocale", this.A0A);
        C57292tP.A00(A0o, "videoMediaGroupId", this.A0B);
        C57292tP.A00(A0o, "videoName", this.A0C);
        C57292tP.A00(A0o, "videoTimePosition", this.A0D);
        return AnonymousClass3ZG.A0G(this.A0E, "watchTimeInMs", A0o);
    }
}
