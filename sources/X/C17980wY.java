package X;

import com.whatsapp.backup.google.GoogleBackupService;
import com.whatsapp.backup.google.workers.GoogleBackupWorker;

/* renamed from: X.0wY  reason: invalid class name and case insensitive filesystem */
public class C17980wY implements C16420tN {
    public Object A00;
    public final int A01;

    public C17980wY(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onError(int i) {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            ((GoogleBackupWorker) obj).A0J(i);
        } else {
            ((GoogleBackupService) obj).A09.A0C(i);
        }
    }
}
