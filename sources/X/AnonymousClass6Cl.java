package X;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Iterator;

/* renamed from: X.6Cl  reason: invalid class name */
public final class AnonymousClass6Cl extends ContentObserver {
    public final /* synthetic */ C157667ig A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6Cl(C157667ig r2) {
        super((Handler) null);
        this.A00 = r2;
    }

    public final void onChange(boolean z) {
        C157667ig r3 = this.A00;
        synchronized (r3.A03) {
            r3.A06 = null;
        }
        synchronized (r3.A04) {
            Iterator it = r3.A05.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0g("zzk");
            }
        }
    }
}
