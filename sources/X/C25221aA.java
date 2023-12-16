package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1aA  reason: invalid class name and case insensitive filesystem */
public final class C25221aA extends AnonymousClass3ZG {
    public Double A00;
    public Double A01;
    public Double A02;
    public Double A03;
    public Double A04;
    public Double A05;
    public Long A06;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(13, this.A00);
        r3.Blb(12, this.A01);
        r3.Blb(11, this.A06);
        r3.Blb(3, this.A02);
        r3.Blb(4, this.A03);
        r3.Blb(6, this.A04);
        r3.Blb(1, this.A05);
    }

    public C25221aA() {
        super(1336, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0F(C18270x1.A0K(C18270x1.A0J(C18270x1.A0N(C18270x1.A0O(13, this.A00, A0r), this.A01, A0r), this.A06, A0r), (Object) null, A0r), (Object) null, A0r), this.A02);
        AnonymousClass3ZG.A0I(A0r, 5);
        A0r.put(C18270x1.A0I(C18290x4.A0b(), this.A03, A0r), this.A04);
        AnonymousClass3ZG.A0I(A0r, 2);
        A0r.put(AnonymousClass001.A0f(), this.A05);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamMemoryStat {");
        C57292tP.A00(A0o, "androidDalvikPrivateDirty", this.A00);
        C57292tP.A00(A0o, "androidNativePrivateDirty", this.A01);
        C57292tP.A00(A0o, "androidThreadCount", this.A06);
        C57292tP.A00(A0o, "privateBytes", this.A02);
        C57292tP.A00(A0o, "sharedBytes", this.A03);
        C57292tP.A00(A0o, "uptime", this.A04);
        return AnonymousClass3ZG.A0G(this.A05, "workingSetSize", A0o);
    }
}
