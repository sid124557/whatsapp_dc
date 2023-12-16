package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.99X  reason: invalid class name */
public final class AnonymousClass99X extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public String A05;
    public String A06;

    public AnonymousClass99X() {
        super(1780, new AnonymousClass5ZC(1, 1, 1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A02);
        r3.Blb(4, this.A03);
        r3.Blb(3, this.A00);
        r3.Blb(5, this.A04);
        r3.Blb(6, this.A05);
        r3.Blb(1, this.A01);
        r3.Blb(7, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(C18270x1.A0I(C18270x1.A0H(C18270x1.A0F(C18270x1.A0G(2, this.A02, linkedHashMap), this.A03, linkedHashMap), this.A00, linkedHashMap), this.A04, linkedHashMap), this.A05);
        linkedHashMap.put(C18270x1.A0J(AnonymousClass001.A0f(), this.A01, linkedHashMap), this.A06);
        return linkedHashMap;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAndroidFetchBloksRequest {");
        C57292tP.A00(A0o, "bloksCategory", this.A02);
        C57292tP.A00(A0o, "bloksFetchRetryCount", this.A03);
        C57292tP.A00(A0o, "bloksFetchSuccess", this.A00);
        C57292tP.A00(A0o, "bloksFetchTimeT", this.A04);
        C57292tP.A00(A0o, "bloksVersion", this.A05);
        C57292tP.A00(A0o, "isTriggeredOnBackground", this.A01);
        return AnonymousClass3ZG.A0G(this.A06, "triggeringSource", A0o);
    }
}
