package X;

import android.database.ContentObserver;
import android.net.Uri;
import android.provider.ContactsContract;
import com.whatsapp.util.Log;

/* renamed from: X.5Ni  reason: invalid class name and case insensitive filesystem */
public class C103535Ni {
    public final ContentObserver A00;
    public final C56972sr A01;
    public final C44772Xk A02;
    public volatile boolean A03;

    public void A00(C620633i r5) {
        if (!this.A03) {
            synchronized (this) {
                if (!this.A03 && this.A02.A00() && !this.A01.A0Y()) {
                    Log.i("androidcontactscontentobserver/registered");
                    this.A03 = true;
                    AnonymousClass5UR A0R = r5.A0R();
                    Uri uri = ContactsContract.Contacts.CONTENT_URI;
                    ContentObserver contentObserver = this.A00;
                    C18260x0.A0P(uri, contentObserver);
                    A0R.A02().registerContentObserver(uri, true, contentObserver);
                }
            }
        }
    }

    public C103535Ni(C56972sr r2, C44772Xk r3, C64223Cq r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = new C86694Lc(r2, this, r4);
    }
}
