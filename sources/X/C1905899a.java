package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.99a  reason: invalid class name and case insensitive filesystem */
public final class C1905899a extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;

    public C1905899a() {
        super(3558, new AnonymousClass5ZC(1, 1, 1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A01);
        r3.Blb(3, this.A02);
        r3.Blb(4, this.A04);
        r3.Blb(5, this.A05);
        r3.Blb(6, this.A06);
        r3.Blb(7, this.A03);
        r3.Blb(8, this.A07);
        r3.Blb(9, this.A08);
    }

    public Map getFieldsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, linkedHashMap), this.A01, linkedHashMap), this.A02, linkedHashMap), this.A04, linkedHashMap), this.A05, linkedHashMap), this.A06, linkedHashMap), this.A03);
        linkedHashMap.put(8, this.A07);
        linkedHashMap.put(C18300x5.A0Y(), this.A08);
        return linkedHashMap;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAlertsUserAction {");
        C57292tP.A00(A0o, "alertActionTarget", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "alertActionType", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "alertCategory", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "alertDescription", this.A04);
        C57292tP.A00(A0o, "alertId", this.A05);
        C57292tP.A00(A0o, "alertReferral", this.A06);
        C57292tP.A00(A0o, "alertRenderingCategory", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "alertTitle", this.A07);
        return AnonymousClass3ZG.A0G(this.A08, "contextScreen", A0o);
    }
}
