package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1aG  reason: invalid class name and case insensitive filesystem */
public final class C25281aG extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(5, this.A00);
        r3.Blb(6, this.A02);
        r3.Blb(4, this.A03);
        r3.Blb(3, this.A04);
        r3.Blb(2, this.A05);
        r3.Blb(1, this.A01);
        r3.Blb(7, this.A06);
    }

    public C25281aG() {
        super(2034, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0J(C18270x1.A0D(C18270x1.A0E(C18270x1.A0F(C18270x1.A0G(C18270x1.A0I(C18290x4.A0c(), this.A00, A0r), this.A02, A0r), this.A03, A0r), this.A04, A0r), this.A05, A0r), this.A01, A0r), this.A06);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamQrCodeScan {");
        C57292tP.A00(A0o, "isContact", this.A00);
        C57292tP.A00(A0o, "linkOwnerType", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "qrCodeCameraSource", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "qrCodeErrorReason", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "qrCodeType", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "scannedCodeSuccessfully", this.A01);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A06), "srcLinkParam", A0o);
    }
}
