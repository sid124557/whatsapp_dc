package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1YH  reason: invalid class name */
public final class AnonymousClass1YH extends AnonymousClass3ZG {
    public Integer A00;
    public Long A01;
    public String A02;

    public AnonymousClass1YH() {
        super(4796, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A02);
        r3.Blb(3, this.A01);
        r3.Blb(1, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0D(C18270x1.A0F(C18280x3.A0S(), this.A02, A0r), this.A01, A0r), this.A00);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamDeviceBackupSetting {");
        C57292tP.A00(A0o, "deviceBackupSettingError", this.A02);
        C57292tP.A00(A0o, "deviceBackupSettingGoogleAccountCount", this.A01);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A00), "deviceBackupSettingStatus", A0o);
    }
}
