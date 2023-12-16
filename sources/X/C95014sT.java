package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sT  reason: invalid class name and case insensitive filesystem */
public final class C95014sT extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public String A0A;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(7, this.A04);
        r3.Blb(8, this.A00);
        r3.Blb(9, this.A05);
        r3.Blb(10, this.A02);
        r3.Blb(2, this.A06);
        r3.Blb(11, this.A0A);
        r3.Blb(6, this.A07);
        r3.Blb(3, this.A01);
        r3.Blb(4, this.A08);
        r3.Blb(1, this.A03);
        r3.Blb(5, this.A09);
    }

    public C95014sT() {
        super(2032, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0H(C18270x1.A0D(C18270x1.A0G(C18270x1.A0F(C18270x1.A0I(C18270x1.A0N(C18270x1.A0E(C18270x1.A0M(C18270x1.A0L(C18270x1.A0K(AnonymousClass0x7.A0g(), this.A04, A0r), this.A00, A0r), this.A05, A0r), this.A02, A0r), this.A06, A0r), this.A0A, A0r), this.A07, A0r), this.A01, A0r), this.A08, A0r), this.A03, A0r), this.A09);
        AnonymousClass3ZG.A0I(A0r, 12);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamInlineVideoPlaybackClosed {");
        C57292tP.A00(A0o, "inlineVideoCancelBeforePlayStateT", this.A04);
        C57292tP.A00(A0o, "inlineVideoComplete", this.A00);
        C57292tP.A00(A0o, "inlineVideoCompletionRate", this.A05);
        C57292tP.A00(A0o, "inlineVideoCtaClick", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "inlineVideoDurationT", this.A06);
        C57292tP.A00(A0o, "inlineVideoError", this.A0A);
        C57292tP.A00(A0o, "inlineVideoPlayStartT", this.A07);
        C57292tP.A00(A0o, "inlineVideoPlayed", this.A01);
        C57292tP.A00(A0o, "inlineVideoStallT", this.A08);
        C57292tP.A00(A0o, "inlineVideoType", C18270x1.A0T(this.A03));
        return AnonymousClass3ZG.A0G(this.A09, "inlineVideoWatchT", A0o);
    }
}
