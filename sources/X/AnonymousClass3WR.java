package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.3WR  reason: invalid class name */
public class AnonymousClass3WR implements AnonymousClass66I, C1226865i {
    public final C50382i5 A00;

    public void BMb() {
        C50382i5 r2 = this.A00;
        AnonymousClass310 r3 = r2.A02;
        File A0A = AnonymousClass002.A0A(AnonymousClass310.A00(r3), "WhatsApp.download");
        if (A0A.exists()) {
            Log.a(A0A.delete());
        }
        if (!AnonymousClass002.A0A(AnonymousClass310.A00(r3), "WhatsApp.upgrade").exists()) {
            File A0A2 = AnonymousClass002.A0A(AnonymousClass310.A00(r3), "WhatsApp.apk");
            if (A0A2.exists()) {
                Log.a(A0A2.delete());
            }
            C18270x1.A0g(C18270x1.A03(r2.A05), "last_upgrade_remote_sha256");
        }
    }

    public AnonymousClass3WR(C50382i5 r1) {
        this.A00 = r1;
    }

    public /* synthetic */ void BMW() {
    }

    public /* synthetic */ void BMc() {
    }
}
