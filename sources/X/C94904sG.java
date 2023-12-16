package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sG  reason: invalid class name and case insensitive filesystem */
public final class C94904sG extends AnonymousClass3ZG {
    public Boolean A00;
    public Double A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public String A07;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(6, this.A00);
        r3.Blb(4, this.A07);
        r3.Blb(8, this.A01);
        r3.Blb(5, this.A05);
        r3.Blb(3, this.A02);
        r3.Blb(9, this.A06);
        r3.Blb(1, this.A03);
        r3.Blb(2, this.A04);
    }

    public C94904sG() {
        super(834, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0E(C18270x1.A0D(C18270x1.A0L(C18270x1.A0F(C18270x1.A0H(C18270x1.A0K(C18270x1.A0G(C18290x4.A0d(), this.A00, A0r), this.A07, A0r), this.A01, A0r), this.A05, A0r), this.A02, A0r), this.A06, A0r), this.A03, A0r), this.A04);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamPlacesApiQuery {");
        C57292tP.A00(A0o, "placesApiCached", this.A00);
        C57292tP.A00(A0o, "placesApiFailureDescription", this.A07);
        C57292tP.A00(A0o, "placesApiPlacesCount", this.A01);
        C57292tP.A00(A0o, "placesApiRequestIndex", this.A05);
        C57292tP.A00(A0o, "placesApiResponse", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "placesApiResponseT", this.A06);
        C57292tP.A00(A0o, "placesApiSource", C18270x1.A0T(this.A03));
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A04), "placesApiSourceDefault", A0o);
    }
}
