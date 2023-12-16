package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.99Z  reason: invalid class name */
public final class AnonymousClass99Z extends AnonymousClass3ZG {
    public Long A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    public AnonymousClass99Z() {
        super(4434, new AnonymousClass5ZC(1, 1, 1, false), 2, 0);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(7, this.A01);
        r3.Blb(1, this.A02);
        r3.Blb(2, this.A03);
        r3.Blb(3, this.A00);
        r3.Blb(4, this.A04);
        r3.Blb(5, this.A05);
        r3.Blb(6, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(7, this.A01);
        linkedHashMap.put(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A02, linkedHashMap), this.A03, linkedHashMap), this.A00, linkedHashMap), this.A04, linkedHashMap), this.A05, linkedHashMap), this.A06);
        return linkedHashMap;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamBloksScriptCrashes {");
        C57292tP.A00(A0o, "bloksErrorAppId", this.A01);
        C57292tP.A00(A0o, "bloksErrorFeature", this.A02);
        C57292tP.A00(A0o, "bloksErrorFileName", this.A03);
        C57292tP.A00(A0o, "bloksErrorLineNumber", this.A00);
        C57292tP.A00(A0o, "bloksErrorMessage", this.A04);
        C57292tP.A00(A0o, "bloksErrorOncall", this.A05);
        return AnonymousClass3ZG.A0G(this.A06, "bloksErrorProduct", A0o);
    }
}
