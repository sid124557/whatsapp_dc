package X;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Iterator;

/* renamed from: X.6Ck  reason: invalid class name and case insensitive filesystem */
public final class C124476Ck extends ContentObserver {
    public final /* synthetic */ AnonymousClass8A5 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C124476Ck(AnonymousClass8A5 r2) {
        super((Handler) null);
        this.A00 = r2;
    }

    public final void onChange(boolean z) {
        AnonymousClass8A5 r2 = this.A00;
        synchronized (r2.A03) {
            r2.A06 = null;
            C160447ne.A07.incrementAndGet();
        }
        synchronized (r2) {
            Iterator it = r2.A05.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0g("zza");
            }
        }
    }
}
