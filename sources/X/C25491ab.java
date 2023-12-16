package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ab  reason: invalid class name and case insensitive filesystem */
public final class C25491ab extends AnonymousClass3ZG {
    public Double A00;
    public Double A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;

    public C25491ab() {
        super(2900, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(10, this.A03);
        r3.Blb(2, this.A04);
        r3.Blb(5, this.A00);
        r3.Blb(7, this.A05);
        r3.Blb(1, this.A06);
        r3.Blb(8, this.A07);
        r3.Blb(4, this.A01);
        r3.Blb(6, this.A08);
        r3.Blb(9, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0L(C18270x1.A0I(C18270x1.A0G(C18270x1.A0K(C18270x1.A0D(C18270x1.A0J(C18270x1.A0H(C18270x1.A0E(AnonymousClass0x7.A0h(), this.A03, A0r), this.A04, A0r), this.A00, A0r), this.A05, A0r), this.A06, A0r), this.A07, A0r), this.A01, A0r), this.A08, A0r), this.A02);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamEncryptedBackupsInitial {");
        C57292tP.A00(A0o, "backupRestoreInSessionRetryCount", this.A03);
        C57292tP.A00(A0o, "reencryptionMediaFilesEncrypted", this.A04);
        C57292tP.A00(A0o, "reencryptionMediaProgress", this.A00);
        C57292tP.A00(A0o, "reencryptionMediaTime", this.A05);
        C57292tP.A00(A0o, "reencryptionOverallFilesEncrypted", this.A06);
        C57292tP.A00(A0o, "reencryptionOverallMibytes", this.A07);
        C57292tP.A00(A0o, "reencryptionOverallProgress", this.A01);
        C57292tP.A00(A0o, "reencryptionOverallTime", this.A08);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A02), "reencryptionResult", A0o);
    }
}
