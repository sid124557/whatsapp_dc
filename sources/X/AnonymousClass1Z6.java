package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Z6  reason: invalid class name */
public final class AnonymousClass1Z6 extends AnonymousClass3ZG {
    public Boolean A00;
    public Double A01;
    public Integer A02;
    public Long A03;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(9, this.A00);
        r3.Blb(4, this.A01);
        r3.Blb(1, this.A02);
        r3.Blb(3, this.A03);
    }

    public AnonymousClass1Z6() {
        super(468, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        AnonymousClass3ZG.A0I(A0r, 7);
        A0r.put(C18270x1.A0G(C18300x5.A0Y(), this.A00, A0r), this.A01);
        AnonymousClass3ZG.A0I(A0r, 6);
        A0r.put(C18270x1.A0E(C18270x1.A0H(C18270x1.A0F(AnonymousClass001.A0f(), this.A02, A0r), this.A03, A0r), (Object) null, A0r), (Object) null);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamProfilePicUpload {");
        C57292tP.A00(A0o, "profilePicIsAvatar", this.A00);
        C57292tP.A00(A0o, "profilePicSize", this.A01);
        C57292tP.A00(A0o, "profilePicUploadResult", C18270x1.A0T(this.A02));
        return AnonymousClass3ZG.A0G(this.A03, "profilePicUploadT", A0o);
    }
}
