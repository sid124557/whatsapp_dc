package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Zl  reason: invalid class name and case insensitive filesystem */
public final class C24971Zl extends AnonymousClass3ZG {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;

    public C24971Zl() {
        super(3534, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A01);
        r3.Blb(6, this.A02);
        r3.Blb(2, this.A00);
        r3.Blb(3, this.A03);
        r3.Blb(4, this.A05);
        r3.Blb(5, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(C18270x1.A0I(AnonymousClass001.A0f(), this.A01, A0r), this.A02, A0r), this.A00, A0r), this.A03, A0r), this.A05, A0r), this.A04);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamLocalBackup {");
        C57292tP.A00(A0o, "backupSchedule", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "backupType", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "localBackupGoogleBackupScheduled", this.A00);
        C57292tP.A00(A0o, "localBackupResult", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "localBackupStartTimestamp", this.A05);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A04), "localBackupTriggerType", A0o);
    }
}
