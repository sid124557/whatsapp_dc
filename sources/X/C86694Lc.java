package X;

import android.database.ContentObserver;
import android.os.Handler;
import com.whatsapp.util.Log;

/* renamed from: X.4Lc  reason: invalid class name and case insensitive filesystem */
public class C86694Lc extends ContentObserver {
    public final /* synthetic */ C56972sr A00;
    public final /* synthetic */ C103535Ni A01;
    public final /* synthetic */ C64223Cq A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86694Lc(C56972sr r2, C103535Ni r3, C64223Cq r4) {
        super((Handler) null);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public void onChange(boolean z) {
        Log.i("AndroidContactsContentObserver/onChange");
        C56972sr r1 = this.A00;
        r1.A0P();
        if (r1.A00 != null && !r1.A0Y()) {
            this.A02.A07();
        }
    }
}
