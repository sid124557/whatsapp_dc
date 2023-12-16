package X;

import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.3WQ  reason: invalid class name */
public class AnonymousClass3WQ implements AnonymousClass66I {
    public final C65203Gp A00;
    public final C64673El A01;
    public final AnonymousClass3FH A02;
    public final C55392qH A03;

    public void BMb() {
        C22501Oh r1;
        Log.i("SyncdAsyncAppUpdatedObserver/onAsyncAppUpdated");
        C65203Gp r3 = this.A00;
        if (r3.A0Q()) {
            this.A01.A00();
            C55392qH r6 = this.A03;
            synchronized (r6) {
                Iterator it = r6.A02.A08(new AnonymousClass4JH(2), "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE are_dependencies_missing = 1 ORDER BY _id ASC", "SyncdMutationsTable.SELECT_ALL_MUTATIONS_WITH_SUPPORTED_VERSIONS_AND_MISSING_DEPENDENCIES", (String[]) null).iterator();
                while (it.hasNext()) {
                    r6.A02(C18320x8.A0K(it));
                }
            }
            r3.A0D();
            AnonymousClass3FH r12 = this.A02;
            C65203Gp r2 = r12.A01;
            if (r2.A0Q() && !r12.A00.A0Y() && (r1 = (C22501Oh) r12.A02.A00("primary_version")) != null) {
                r2.A0K(Collections.singleton(r1.A0D("current")));
            }
            r3.A0F();
        }
    }

    public AnonymousClass3WQ(C65203Gp r1, C64673El r2, AnonymousClass3FH r3, C55392qH r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public /* synthetic */ void BMc() {
    }
}
