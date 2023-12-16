package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.9gt  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C199629gt implements Runnable {
    public final /* synthetic */ C191689Fx A00;

    public final void run() {
        FileOutputStream fileOutputStream;
        C191689Fx r0 = this.A00;
        AnonymousClass9VV r3 = r0.A07;
        String A0Y = C18280x3.A0Y();
        C193069Na r2 = new C193069Na(r0);
        String str = r0.A09;
        synchronized (r3) {
            C64393Dh r5 = r3.A02;
            C627536m.A0E(r5.A0Q(str), 0);
            File A0P = r5.A0P(str);
            File A0U = r5.A0U(A0Y, str);
            try {
                FileInputStream fileInputStream = new FileInputStream(A0P);
                try {
                    fileOutputStream = new FileOutputStream(A0U);
                    C627536m.A0I(fileInputStream, fileOutputStream);
                    fileOutputStream.close();
                    fileInputStream.close();
                    if (!A0U.setLastModified(r3.A05.A0H())) {
                        Log.e("dyiReportManager/prepare-report-for-export/failed to update report file");
                        Log.i("DyiViewModel/export-report/on-error");
                        C1899593h.A0p(r2.A00.A03, 2, C1899693i.A0M());
                    } else {
                        C18260x0.A0s("DyiViewModel/export-report/on-ready-to-export :: ", A0Y, AnonymousClass001.A0o());
                        r2.A00.A00.A0G(A0Y);
                    }
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            } catch (IOException e) {
                Log.e("dyiReportManager/prepare-report-for-export/can't prepare report file", e);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        return;
        throw th;
    }

    public /* synthetic */ C199629gt(C191689Fx r1) {
        this.A00 = r1;
    }
}
