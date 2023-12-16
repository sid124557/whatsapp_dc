package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4s0  reason: invalid class name */
public final class AnonymousClass4s0 extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public String A05;

    public AnonymousClass4s0() {
        super(4410, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A01);
        r3.Blb(3, this.A02);
        r3.Blb(4, this.A04);
        r3.Blb(5, this.A03);
        r3.Blb(6, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        AnonymousClass3ZG.A0I(A0r, 7);
        A0r.put(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A04, A0r), this.A03, A0r), this.A05);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamCallSearchQuality {");
        C57292tP.A00(A0o, "callTypeFromSearch", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "entryPiont", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "resultCategory", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "resultPosition", this.A04);
        C57292tP.A00(A0o, "searchInteraction", C18270x1.A0T(this.A03));
        return AnonymousClass3ZG.A0G(this.A05, "searchQualitySessionId", A0o);
    }
}
