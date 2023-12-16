package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6iH  reason: invalid class name and case insensitive filesystem */
public final class C133996iH extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;

    public C133996iH() {
        super(4336, new AnonymousClass5ZC(1, 1000, 2000, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A02);
        r3.Blb(2, this.A03);
        r3.Blb(3, this.A05);
        r3.Blb(4, this.A06);
        r3.Blb(5, this.A00);
        r3.Blb(6, this.A01);
        r3.Blb(7, this.A07);
        r3.Blb(8, this.A08);
        r3.Blb(9, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0L(C18270x1.A0K(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A02, A0r), this.A03, A0r), this.A05, A0r), this.A06, A0r), this.A00, A0r), this.A01, A0r), this.A07, A0r), this.A08, A0r), this.A04);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamMexEventV2 {");
        C57292tP.A00(A0o, "mexEventV2DurationMs", this.A02);
        C57292tP.A00(A0o, "mexEventV2EndTime", this.A03);
        C57292tP.A00(A0o, "mexEventV2ErrorCodes", this.A05);
        C57292tP.A00(A0o, "mexEventV2Errors", this.A06);
        C57292tP.A00(A0o, "mexEventV2HasData", this.A00);
        C57292tP.A00(A0o, "mexEventV2IsMex", this.A01);
        C57292tP.A00(A0o, "mexEventV2OperationName", this.A07);
        C57292tP.A00(A0o, "mexEventV2QueryId", this.A08);
        return AnonymousClass3ZG.A0G(this.A04, "mexEventV2StartTime", A0o);
    }
}
