package X;

import android.content.res.Resources;
import com.whatsapp.R;

/* renamed from: X.9bY  reason: invalid class name and case insensitive filesystem */
public class C196669bY implements C203319nV {
    public final AnonymousClass9O8 A00;

    public String BDv(Resources resources, C624034w r5, String str) {
        if (r5.A02 == 420) {
            return resources.getString(R.string.f11nameremoved, AnonymousClass000.A1b(str));
        }
        AnonymousClass9O8 r2 = this.A00;
        int A01 = C615531h.A01(r5.A0J, -1);
        String A002 = r2.A01.A00(A01);
        if (A002 != null) {
            return A002;
        }
        if (A01 != 20727) {
            return null;
        }
        return C54292oU.A00(r2.A00).getString(R.string.f11nameremoved);
    }

    public C196669bY(AnonymousClass9O8 r1) {
        this.A00 = r1;
    }

    public boolean BJ6() {
        return false;
    }

    public AnonymousClass39V B3k(String str) {
        return null;
    }
}
