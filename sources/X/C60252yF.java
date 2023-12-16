package X;

import java.io.File;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2yF  reason: invalid class name and case insensitive filesystem */
public class C60252yF {
    public static final long A07 = TimeUnit.DAYS.toMillis(5);
    public final C56612sH A00;
    public final C54292oU A01;
    public final AnonymousClass337 A02;
    public final AnonymousClass2SW A03;
    public final AnonymousClass4FX A04;
    public final Semaphore A05 = new Semaphore(1);
    public volatile File A06 = null;

    public final File[] A01(String str) {
        File[] listFiles;
        File A0A = AnonymousClass002.A0A(C54292oU.A02(this.A01), "qpl");
        if (!A0A.exists() || (listFiles = A0A.listFiles(new C69863Yr(str))) == null) {
            return new File[0];
        }
        return listFiles;
    }

    public C60252yF(C56612sH r3, C54292oU r4, AnonymousClass337 r5, AnonymousClass2SW r6, AnonymousClass4FX r7) {
        this.A01 = r4;
        this.A00 = r3;
        this.A04 = r7;
        this.A02 = r5;
        this.A03 = r6;
    }

    public void A00(File file) {
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception e) {
                this.A04.B2e(e.getMessage());
            }
        }
    }
}
