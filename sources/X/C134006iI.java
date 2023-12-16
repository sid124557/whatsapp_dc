package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6iI  reason: invalid class name and case insensitive filesystem */
public final class C134006iI extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Double A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(7, this.A05);
        r3.Blb(8, this.A06);
        r3.Blb(5, this.A07);
        r3.Blb(4, this.A00);
        r3.Blb(9, this.A08);
        r3.Blb(1, this.A03);
        r3.Blb(3, this.A02);
        r3.Blb(2, this.A04);
        r3.Blb(6, this.A01);
    }

    public C134006iI() {
        super(458, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0I(C18270x1.A0E(C18270x1.A0F(C18270x1.A0D(C18270x1.A0L(C18270x1.A0G(C18270x1.A0H(C18270x1.A0K(AnonymousClass0x7.A0g(), this.A05, A0r), this.A06, A0r), this.A07, A0r), this.A00, A0r), this.A08, A0r), this.A03, A0r), this.A02, A0r), this.A04, A0r), this.A01);
        AnonymousClass3ZG.A0I(A0r, 10);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamPtt {");
        C57292tP.A00(A0o, "pttDraftPlayCnt", this.A05);
        C57292tP.A00(A0o, "pttDraftSeekCnt", this.A06);
        C57292tP.A00(A0o, "pttDuration", this.A07);
        C57292tP.A00(A0o, "pttLock", this.A00);
        C57292tP.A00(A0o, "pttPauseCnt", this.A08);
        C57292tP.A00(A0o, "pttResult", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "pttSize", this.A02);
        C57292tP.A00(A0o, "pttSource", C18270x1.A0T(this.A04));
        return AnonymousClass3ZG.A0G(this.A01, "pttStop", A0o);
    }
}
