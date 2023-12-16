package X;

import com.whatsapp.backup.google.GoogleBackupService;
import com.whatsapp.backup.google.GoogleBackupService_GeneratedInjector;

/* renamed from: X.0F2  reason: invalid class name */
public abstract class AnonymousClass0F2 extends C32461qT {
    public boolean A00 = false;

    public void A04() {
        if (!this.A00) {
            this.A00 = true;
            ((GoogleBackupService_GeneratedInjector) generatedComponent()).BGQ((GoogleBackupService) this);
        }
    }

    public AnonymousClass0F2(String str) {
        super(str);
    }

    public void onCreate() {
        A04();
        super.onCreate();
    }
}
