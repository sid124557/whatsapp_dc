package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Y8  reason: invalid class name */
public final class AnonymousClass1Y8 extends AnonymousClass3ZG {
    public Integer A00;
    public Long A01;
    public String A02;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(5, this.A00);
        r3.Blb(1, this.A01);
        r3.Blb(7, this.A02);
    }

    public AnonymousClass1Y8() {
        super(1536, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0J(C18270x1.A0D(C18270x1.A0H(C18270x1.A0I(C18270x1.A0F(C18270x1.A0G(C18280x3.A0S(), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), this.A00, A0r), this.A01, A0r), this.A02);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamCamera {");
        C57292tP.A00(A0o, "cameraOrigin", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "cameraPresentationT", this.A01);
        return AnonymousClass3ZG.A0G(this.A02, "cameraViewType", A0o);
    }
}
