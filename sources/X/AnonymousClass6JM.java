package X;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.whatsapp.workmanager.FrequentWorkersAnomalyDetector$LogExceptionsWorker;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.6JM  reason: invalid class name */
public final class AnonymousClass6JM extends C05500Tp {
    public final C55682qk A00;
    public final AnonymousClass4FS A01;
    public final ConcurrentHashMap A02 = AnonymousClass0x9.A1D();
    public final AnonymousClass66R A03 = AnonymousClass8P7.A00(new C174998Wr(this));

    public AnonymousClass0QH A01(Context context, WorkerParameters workerParameters, String str) {
        StringBuilder sb;
        String str2;
        C162457s7.A0J(context, 0);
        ConcurrentHashMap concurrentHashMap = this.A02;
        Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            obj = AnonymousClass0x2.A0T();
        }
        concurrentHashMap.put(str, AnonymousClass0x9.A0n(C18310x6.A0B(obj), 1));
        try {
            Class<? extends U> asSubclass = Class.forName(str).asSubclass(AnonymousClass0QH.class);
            if (asSubclass == null) {
                return null;
            }
            try {
                AnonymousClass0QH r2 = (AnonymousClass0QH) asSubclass.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(AnonymousClass4L0.A0V(context, workerParameters, 2));
                if (r2 != null) {
                    return new FrequentWorkersAnomalyDetector$LogExceptionsWorker(r2, this.A00, workerParameters);
                }
                return null;
            } catch (Throwable th) {
                th = th;
                sb = AnonymousClass001.A0o();
                str2 = "FrequentWorkersAnomalyDetector/Could not instantiate ";
                C18260x0.A0u(str2, str, sb, th);
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            sb = AnonymousClass001.A0o();
            str2 = "FrequentWorkersAnomalyDetector/Invalid class: ";
            C18260x0.A0u(str2, str, sb, th);
            return null;
        }
    }

    public AnonymousClass6JM(C55682qk r2, AnonymousClass4FS r3) {
        C18260x0.A0Q(r2, r3);
        this.A00 = r2;
        this.A01 = r3;
    }
}
