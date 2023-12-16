package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ZW  reason: invalid class name */
public final class AnonymousClass1ZW extends AnonymousClass3ZG {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public String A04;

    public AnonymousClass1ZW() {
        super(2576, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(8, this.A01);
        r3.Blb(6, this.A02);
        r3.Blb(4, this.A00);
        r3.Blb(1, this.A04);
        r3.Blb(7, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0G(C18270x1.A0I(C18310x6.A0e(), this.A01, A0r), this.A02, A0r), this.A00);
        AnonymousClass3ZG.A0I(A0r, 9);
        A0r.put(C18270x1.A0J(AnonymousClass001.A0f(), this.A04, A0r), this.A03);
        AnonymousClass3ZG.A0I(A0r, 5);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamMdLinkDeviceCompanion {");
        C57292tP.A00(A0o, "mdDurationS", this.A01);
        C57292tP.A00(A0o, "mdLinkDeviceCompanionErrorCode", this.A02);
        C57292tP.A00(A0o, "mdLinkDeviceCompanionStage", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "mdSessionId", this.A04);
        return AnonymousClass3ZG.A0G(this.A03, "mdTimestampS", A0o);
    }
}
