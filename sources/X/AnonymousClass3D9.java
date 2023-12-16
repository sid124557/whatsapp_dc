package X;

import com.whatsapp.util.Log;
import com.whatsapp.wds.metrics.logging.network.HierarchyUploadScheduler$HierarchyUploadWorker;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3D9  reason: invalid class name */
public final class AnonymousClass3D9 implements AnonymousClass66U {
    public final C102865Ko A00;
    public final C34171uL A01;

    public void BMd() {
        if (C18270x1.A1V(this.A00.A07)) {
            C01450Ax r3 = new C01450Ax(HierarchyUploadScheduler$HierarchyUploadWorker.class, TimeUnit.HOURS);
            AnonymousClass0Pq r1 = new AnonymousClass0Pq();
            r1.A02(C02380Fy.UNMETERED);
            r1.A03 = true;
            r3.A04(r1.A00());
            r3.A02(5, TimeUnit.MINUTES);
            AnonymousClass0NS A002 = r3.A00();
            C17140ud A02 = new AnonymousClass0XO(C02320Fs.KEEP, C72333dY.A01(this.A01), "name.whatsapp.wds.metrics.logging", Collections.singletonList(A002), (List) null).A02();
            C162457s7.A0D(A02);
            try {
                ((C08960fQ) A02).A01.get();
            } catch (Exception e) {
                Log.d((Throwable) e);
            }
        }
    }

    public AnonymousClass3D9(C102865Ko r1, C34171uL r2) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public String BDW() {
        return "HierarchyUploadScheduler";
    }

    public /* synthetic */ void BMe() {
    }
}
