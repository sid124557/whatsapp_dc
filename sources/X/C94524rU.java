package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4rU  reason: invalid class name and case insensitive filesystem */
public final class C94524rU extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;

    public C94524rU() {
        super(2064, new AnonymousClass5ZC(1, 20, 20, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(4, this.A00);
        r3.Blb(1, this.A03);
        r3.Blb(3, this.A01);
        r3.Blb(2, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0E(C18270x1.A0F(C18270x1.A0D(C18290x4.A0b(), this.A00, A0r), this.A03, A0r), this.A01, A0r), this.A02);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamCameraTti {");
        C57292tP.A00(A0o, "cameraApi", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "cameraTtiDuration", this.A03);
        C57292tP.A00(A0o, "cameraType", C18270x1.A0T(this.A01));
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A02), "launchType", A0o);
    }
}
