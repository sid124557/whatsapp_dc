package X;

import com.whatsapp.net.tls13.WtCachedPsk;
import com.whatsapp.watls13.WtPersistentSession;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.5lh  reason: invalid class name and case insensitive filesystem */
public final class C113605lh implements AnonymousClass4E8 {
    public final C152887aK A00;

    public C113605lh(C152887aK r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public String BDW() {
        return "WatlsDailyCron";
    }

    public void BQW() {
        File[] listFiles;
        LinkedHashSet linkedHashSet;
        long j;
        C152887aK r8 = this.A00;
        synchronized (r8) {
            File A01 = r8.A01();
            if (!(A01 == null || (listFiles = A01.listFiles()) == null)) {
                for (File file : listFiles) {
                    WtPersistentSession A002 = r8.A00(file);
                    if (A002 != null && (linkedHashSet = A002.A03) != null) {
                        Iterator it = linkedHashSet.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            WtCachedPsk wtCachedPsk = (WtCachedPsk) it.next();
                            if (wtCachedPsk.useTestTime) {
                                j = 3600000;
                            } else {
                                j = System.currentTimeMillis();
                            }
                            if (j - wtCachedPsk.ticketIssuedTime <= wtCachedPsk.ticketLifetime) {
                                break;
                            }
                        }
                    }
                    boolean delete = file.delete();
                    StringBuilder A0o = AnonymousClass001.A0o();
                    AnonymousClass000.A10(file, "WtPersistentSessionCacheImpl/Delete session file ", A0o);
                    C18260x0.A1D(" ", A0o, delete);
                }
            }
        }
    }

    public /* synthetic */ void BQX() {
    }
}
