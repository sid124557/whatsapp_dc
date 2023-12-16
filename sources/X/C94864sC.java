package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sC  reason: invalid class name and case insensitive filesystem */
public final class C94864sC extends AnonymousClass3ZG {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public String A04;
    public String A05;
    public String A06;

    public C94864sC() {
        super(4696, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A01);
        r3.Blb(4, this.A00);
        r3.Blb(5, this.A04);
        r3.Blb(6, this.A03);
        r3.Blb(7, this.A05);
        r3.Blb(2, this.A06);
        r3.Blb(3, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0F(C18270x1.A0E(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(AnonymousClass001.A0f(), this.A01, A0r), this.A00, A0r), this.A04, A0r), this.A03, A0r), this.A05, A0r), this.A06, A0r), this.A02);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamPasskeyEvent {");
        C57292tP.A00(A0o, "passkeyAction", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "passkeyEligibilityDeviceSecured", this.A00);
        C57292tP.A00(A0o, "passkeyEligibilityGmsAvailable", this.A04);
        C57292tP.A00(A0o, "passkeyEligibilityGmsVersion", this.A03);
        C57292tP.A00(A0o, "passkeyErrorClass", this.A05);
        C57292tP.A00(A0o, "passkeyErrorReason", this.A06);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A02), "passkeySource", A0o);
    }
}
