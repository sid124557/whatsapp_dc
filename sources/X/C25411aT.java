package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1aT  reason: invalid class name and case insensitive filesystem */
public final class C25411aT extends AnonymousClass3ZG {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;

    public C25411aT() {
        super(3508, AnonymousClass0x9.A0T(1, 1000, 2000), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(7, this.A00);
        r3.Blb(1, this.A01);
        r3.Blb(2, this.A02);
        r3.Blb(9, this.A03);
        r3.Blb(4, this.A04);
        r3.Blb(5, this.A05);
        r3.Blb(6, this.A06);
        r3.Blb(8, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0L(C18270x1.A0E(C18270x1.A0D(AnonymousClass0x7.A0g(), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A03);
        AnonymousClass3ZG.A0I(A0r, 3);
        A0r.put(C18270x1.A0K(C18270x1.A0I(C18270x1.A0H(C18290x4.A0b(), this.A04, A0r), this.A05, A0r), this.A06, A0r), this.A07);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamIqSend {");
        C57292tP.A00(A0o, "iqSendResult", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "iqTimeToGetResponse", this.A01);
        C57292tP.A00(A0o, "iqTimeToProcess", this.A02);
        C57292tP.A00(A0o, "iqTimeToProcessTotal", this.A03);
        C57292tP.A00(A0o, "iqTimeToSend", this.A04);
        C57292tP.A00(A0o, "iqTotalTime", this.A05);
        C57292tP.A00(A0o, "iqType", this.A06);
        return AnonymousClass3ZG.A0G(this.A07, "serverErrorCode", A0o);
    }
}
