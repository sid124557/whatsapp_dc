package X;

import com.whatsapp.backup.google.GoogleBackupService;
import com.whatsapp.util.Log;

/* renamed from: X.0Dw  reason: invalid class name */
public class AnonymousClass0Dw extends AnonymousClass0Dx {
    public final /* synthetic */ GoogleBackupService A00;
    public final /* synthetic */ C05580Ub A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public AnonymousClass0Dw(GoogleBackupService googleBackupService, C05580Ub r2, String str, String str2) {
        this.A00 = googleBackupService;
        this.A01 = r2;
        this.A02 = str;
        this.A03 = str2;
    }

    public Boolean A02() {
        C05580Ub r0 = this.A01;
        String str = this.A02;
        if (r0.A07(str)) {
            return Boolean.TRUE;
        }
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A03;
        A0M[1] = str;
        Log.e(String.format("gdrive-service/change-number-v2 failed to rename backup old name: %s, new name: %s", A0M));
        return null;
    }

    public /* bridge */ /* synthetic */ Object A01(int i) {
        return A02();
    }
}
