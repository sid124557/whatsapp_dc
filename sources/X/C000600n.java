package X;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* renamed from: X.00n  reason: invalid class name and case insensitive filesystem */
public class C000600n extends ContentObserver {
    public final /* synthetic */ AnonymousClass034 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C000600n(AnonymousClass034 r2) {
        super(new Handler());
        this.A00 = r2;
    }

    public boolean deliverSelfNotifications() {
        return true;
    }

    public void onChange(boolean z) {
        Cursor cursor;
        AnonymousClass034 r1 = this.A00;
        if (r1.A06 && (cursor = r1.A02) != null && !cursor.isClosed()) {
            r1.A07 = r1.A02.requery();
        }
    }
}
