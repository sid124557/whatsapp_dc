package X;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* renamed from: X.0BO  reason: invalid class name */
public class AnonymousClass0BO extends C13220mp {
    public final /* synthetic */ C06310Xb A00;
    public final /* synthetic */ UUID A01;

    public AnonymousClass0BO(C06310Xb r1, UUID uuid) {
        this.A00 = r1;
        this.A01 = uuid;
    }

    /* JADX INFO: finally extract failed */
    public void A00() {
        C06310Xb r3 = this.A00;
        WorkDatabase workDatabase = r3.A04;
        workDatabase.A0A();
        try {
            A01(r3, this.A01.toString());
            workDatabase.A0B();
            workDatabase.A0C();
            AnonymousClass0VJ.A01(r3.A02, workDatabase, r3.A07);
        } catch (Throwable th) {
            workDatabase.A0C();
            throw th;
        }
    }
}
