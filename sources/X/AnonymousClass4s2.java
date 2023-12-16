package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4s2  reason: invalid class name */
public final class AnonymousClass4s2 extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public String A05;

    public AnonymousClass4s2() {
        super(2066, new AnonymousClass5ZC(1, 20, 20, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(8, this.A00);
        r3.Blb(2, this.A01);
        r3.Blb(1, this.A04);
        r3.Blb(7, this.A02);
        r3.Blb(3, this.A03);
        r3.Blb(5, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0F(C18270x1.A0J(C18270x1.A0D(C18270x1.A0E(C18310x6.A0e(), this.A00, A0r), this.A01, A0r), this.A04, A0r), this.A02, A0r), this.A03);
        AnonymousClass3ZG.A0I(A0r, 6);
        A0r.put(C18290x4.A0c(), this.A05);
        AnonymousClass3ZG.A0I(A0r, 4);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamCameraTtc {");
        C57292tP.A00(A0o, "cameraApi", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "cameraFacing", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "cameraTtcDuration", this.A04);
        C57292tP.A00(A0o, "cameraType", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "flashMode", C18270x1.A0T(this.A03));
        return AnonymousClass3ZG.A0G(this.A05, "requestedPhotoResolution", A0o);
    }
}
