package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sc  reason: invalid class name and case insensitive filesystem */
public final class C95094sc extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Double A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(12, this.A08);
        r3.Blb(15, this.A09);
        r3.Blb(16, this.A00);
        r3.Blb(17, this.A0A);
        r3.Blb(8, this.A01);
        r3.Blb(10, this.A04);
        r3.Blb(11, this.A0B);
        r3.Blb(18, this.A02);
        r3.Blb(14, this.A03);
        r3.Blb(9, this.A05);
        r3.Blb(13, this.A0C);
        r3.Blb(5, this.A06);
        r3.Blb(6, this.A07);
    }

    public C95094sc() {
        super(2044, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(12, this.A08);
        AnonymousClass3ZG.A0I(A0r, 7);
        A0r.put(AnonymousClass0x2.A0P(AnonymousClass0x2.A0O(AnonymousClass0x9.A0j(), this.A09, A0r), this.A00, A0r), this.A0A);
        AnonymousClass3ZG.A0I(A0r, 1);
        A0r.put(C18310x6.A0e(), this.A01);
        AnonymousClass3ZG.A0I(A0r, 4);
        A0r.put(C18270x1.A0I(C18270x1.A0H(C18270x1.A0P(C18270x1.A0F(C18270x1.A0E(C18270x1.A0L(C18270x1.A0Q(AnonymousClass0x2.A0Q(C18270x1.A0N(AnonymousClass0x7.A0h(), this.A04, A0r), this.A0B, A0r), this.A02, A0r), this.A03, A0r), this.A05, A0r), (Object) null, A0r), (Object) null, A0r), this.A0C, A0r), this.A06, A0r), this.A07);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamPttPlayback {");
        C57292tP.A00(A0o, "pttDuration", this.A08);
        C57292tP.A00(A0o, "pttMiniPlayerClick", this.A09);
        C57292tP.A00(A0o, "pttMiniPlayerClose", this.A00);
        C57292tP.A00(A0o, "pttMiniPlayerPauseCnt", this.A0A);
        C57292tP.A00(A0o, "pttPlaybackFailed", this.A01);
        C57292tP.A00(A0o, "pttPlaybackSpeed", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "pttPlaybackSpeedCnt", this.A0B);
        C57292tP.A00(A0o, "pttPlayedOutOfChat", this.A02);
        C57292tP.A00(A0o, "pttPlayedPct", this.A03);
        C57292tP.A00(A0o, "pttPlayer", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "pttSeekCnt", this.A0C);
        C57292tP.A00(A0o, "pttTrigger", C18270x1.A0T(this.A06));
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A07), "pttType", A0o);
    }
}
