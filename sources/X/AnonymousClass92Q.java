package X;

import android.net.Uri;
import com.whatsapp.R;

/* renamed from: X.92Q  reason: invalid class name */
public class AnonymousClass92Q implements C185388tZ {
    public Object A00;
    public final int A01;

    public AnonymousClass92Q(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public boolean AyS() {
        if (this.A01 != 0) {
            return true;
        }
        return false;
    }

    public void BSk() {
        if (this.A01 == 0) {
            C111485iA r3 = (C111485iA) this.A00;
            r3.A03.A0H(R.string.f11nameremoved, 0);
            C94694rl r1 = r3.A00;
            r1.A00 = Boolean.FALSE;
            r1.A02 = "send_media_failure";
            r3.A09.BhD(r1);
        }
    }

    public void Bf3(Uri uri) {
    }

    public void Bf4(Uri uri) {
    }
}
