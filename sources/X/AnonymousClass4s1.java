package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4s1  reason: invalid class name */
public final class AnonymousClass4s1 extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public String A05;

    public AnonymousClass4s1() {
        super(2070, new AnonymousClass5ZC(1, 20, 20, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(9, this.A00);
        r3.Blb(4, this.A01);
        r3.Blb(1, this.A03);
        r3.Blb(2, this.A04);
        r3.Blb(8, this.A02);
        r3.Blb(3, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        AnonymousClass3ZG.A0I(A0r, 7);
        A0r.put(C18270x1.A0H(C18270x1.A0I(C18270x1.A0F(C18270x1.A0K(C18270x1.A0E(C18270x1.A0D(C18270x1.A0G(C18300x5.A0Y(), this.A00, A0r), this.A01, A0r), this.A03, A0r), this.A04, A0r), this.A02, A0r), this.A05, A0r), (Object) null, A0r), (Object) null);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamCameraTtRecordVideo {");
        C57292tP.A00(A0o, "cameraApi", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "cameraFacing", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "cameraTtStartVideo", this.A03);
        C57292tP.A00(A0o, "cameraTtStopVideo", this.A04);
        C57292tP.A00(A0o, "cameraType", C18270x1.A0T(this.A02));
        return AnonymousClass3ZG.A0G(this.A05, "requestedVideoResolution", A0o);
    }
}
