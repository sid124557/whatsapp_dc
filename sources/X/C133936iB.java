package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6iB  reason: invalid class name and case insensitive filesystem */
public final class C133936iB extends AnonymousClass3ZG {
    public Double A00;
    public Double A01;
    public Integer A02;
    public Long A03;

    public C133936iB() {
        super(1638, new AnonymousClass5ZC(1, 50, 1000, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A01);
        r3.Blb(3, this.A03);
        r3.Blb(12, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0O(C18270x1.A0F(C18270x1.A0G(C18270x1.A0I(C18270x1.A0E(C18270x1.A0H(C18270x1.A0J(C18270x1.A0K(C18270x1.A0D(C18270x1.A0M(11, (Object) null, A0r), (Object) null, A0r), this.A00, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), this.A01, A0r), (Object) null, A0r), (Object) null, A0r), this.A03, A0r), this.A02);
        AnonymousClass3ZG.A0I(A0r, 9);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAndroidScrollPerfEvent {");
        C57292tP.A00(A0o, "frameDropsPerMin", this.A00);
        C57292tP.A00(A0o, "largeFrameDropsPerMin", this.A01);
        C57292tP.A00(A0o, "scrollDurationT", this.A03);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A02), "surface", A0o);
    }
}
