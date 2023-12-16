package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.99Y  reason: invalid class name */
public final class AnonymousClass99Y extends AnonymousClass3ZG {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A01);
        r3.Blb(3, this.A02);
        r3.Blb(4, this.A03);
        r3.Blb(5, this.A04);
        r3.Blb(6, this.A05);
        r3.Blb(7, this.A06);
    }

    public AnonymousClass99Y() {
        super(4030, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, linkedHashMap), this.A01, linkedHashMap), this.A02, linkedHashMap), this.A03, linkedHashMap), this.A04, linkedHashMap), this.A05, linkedHashMap), this.A06);
        return linkedHashMap;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamArfxWaterfallEvent {");
        C57292tP.A00(A0o, "cameraProductName", this.A00);
        C57292tP.A00(A0o, "deliveryOperationId", this.A01);
        C57292tP.A00(A0o, "effectInstanceId", this.A02);
        C57292tP.A00(A0o, "effectSessionId", this.A03);
        C57292tP.A00(A0o, "productSessionId", this.A04);
        C57292tP.A00(A0o, "sessionStartIntent", this.A05);
        return AnonymousClass3ZG.A0G(this.A06, "waterfallEvent", A0o);
    }
}
