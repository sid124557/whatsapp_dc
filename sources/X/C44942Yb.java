package X;

import android.content.SharedPreferences;
import java.util.Iterator;

/* renamed from: X.2Yb  reason: invalid class name and case insensitive filesystem */
public class C44942Yb {
    public SharedPreferences A00;
    public final C60152y5 A01;

    public void A00(AnonymousClass2LZ r4, String str) {
        SharedPreferences sharedPreferences;
        synchronized (this) {
            sharedPreferences = this.A00;
            if (sharedPreferences == null) {
                sharedPreferences = this.A01.A03("com.whatsapp_payment_sync_preferences");
                this.A00 = sharedPreferences;
            }
        }
        C18270x1.A0j(sharedPreferences.edit(), r4.A01.A00(), str);
        Iterator A0x = AnonymousClass0x7.A0x(r4.A00);
        while (A0x.hasNext()) {
            A00((AnonymousClass2LZ) A0x.next(), str);
        }
    }

    public C44942Yb(C60152y5 r1) {
        this.A01 = r1;
    }
}
