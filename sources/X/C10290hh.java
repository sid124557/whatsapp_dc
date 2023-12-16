package X;

import com.whatsapp.backup.google.workers.GoogleEncryptedReUploadWorker;
import java.util.Random;

/* renamed from: X.0hh  reason: invalid class name and case insensitive filesystem */
public class C10290hh implements AnonymousClass4E8 {
    public final AnonymousClass0WN A00;
    public final AnonymousClass33p A01;
    public final C34171uL A02;

    public String BDW() {
        return "GoogleBackupDailyCron";
    }

    public /* synthetic */ void BQW() {
    }

    public void BQX() {
        if (this.A00.A0H()) {
            C34171uL r4 = this.A02;
            Random random = new Random();
            GoogleEncryptedReUploadWorker.A02(C02320Fs.KEEP, this.A01, r4, random, false);
        }
    }

    public C10290hh(AnonymousClass0WN r1, AnonymousClass33p r2, C34171uL r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
