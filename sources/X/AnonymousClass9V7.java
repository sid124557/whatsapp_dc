package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.9V7  reason: invalid class name */
public class AnonymousClass9V7 {
    public final C56972sr A00;
    public final C54292oU A01;
    public final C620733j A02;
    public final AnonymousClass9U4 A03;
    public final C195219Wq A04;

    public static boolean A00(C624034w r2) {
        int i = r2.A03;
        if (i == 100 || i == 200) {
            return true;
        }
        return false;
    }

    public final CharSequence A01(C56612sH r8, long j) {
        if (j <= 0) {
            return null;
        }
        Context context = this.A01.A00;
        Object[] A0L = AnonymousClass002.A0L();
        C620733j r3 = this.A02;
        return C86614Ku.A0s(context, C107175ap.A04(r3, C107505bQ.A03(r3, r8.A0I(j)), C107145am.A00(r3, r8.A0I(j))), A0L, R.string.f11nameremoved);
    }

    public AnonymousClass9V7(C56972sr r1, C54292oU r2, C620733j r3, AnonymousClass9U4 r4, C195219Wq r5) {
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
    }
}
