package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1aY  reason: invalid class name and case insensitive filesystem */
public final class C25461aY extends AnonymousClass3ZG {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A04);
        r3.Blb(3, this.A05);
        r3.Blb(4, this.A01);
        r3.Blb(5, this.A06);
        r3.Blb(6, this.A07);
        r3.Blb(7, this.A02);
        r3.Blb(8, this.A03);
    }

    public C25461aY() {
        super(4472, AnonymousClass0x9.A0T(1, 20, 1000), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0K(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, A0r), this.A04, A0r), this.A05, A0r), this.A01, A0r), this.A06, A0r), this.A07, A0r), this.A02, A0r), this.A03);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamXplatAttachmentFormatCheckEvent {");
        C57292tP.A00(A0o, "formatCheckContentLength", this.A00);
        C57292tP.A00(A0o, "formatCheckExtensionDetected", this.A04);
        C57292tP.A00(A0o, "formatCheckExtensionHint", this.A05);
        C57292tP.A00(A0o, "formatCheckFileSize", this.A01);
        C57292tP.A00(A0o, "formatCheckMimetypeDetected", this.A06);
        C57292tP.A00(A0o, "formatCheckMimetypeHint", this.A07);
        C57292tP.A00(A0o, "formatCheckReturnCode", this.A02);
        return AnonymousClass3ZG.A0G(this.A03, "formatCheckTimeElapsedNs", A0o);
    }
}
