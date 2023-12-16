package X;

import com.whatsapp.util.Log;
import java.util.Objects;

/* renamed from: X.3FJ  reason: invalid class name */
public class AnonymousClass3FJ implements AnonymousClass65A {
    public final C56972sr A00;
    public final C47102ci A01;
    public final C64223Cq A02;
    public final C51072jE A03;
    public final AnonymousClass4FS A04;

    public void BUN() {
        Log.d("contactsynchourlycron/onHourlyCron");
        if (C56972sr.A00(this.A00) != null && this.A03.A02()) {
            AnonymousClass4FS r3 = this.A04;
            r3.BkN(new C69973Zj(this, 28), "ContactSyncHourlyCron/contactSyncMethods::fullSyncAndInitialize");
            C47102ci r2 = this.A01;
            Objects.requireNonNull(r2);
            r3.BkN(new C69973Zj(r2, 29), "ContactSyncHourlyCron/contactDiscoverySyncHelper::syncOutContactIfNoSyncInLastDay");
        }
    }

    public AnonymousClass3FJ(C56972sr r1, C47102ci r2, C64223Cq r3, C51072jE r4, AnonymousClass4FS r5) {
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
    }
}
