package X;

import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: X.6dy  reason: invalid class name and case insensitive filesystem */
public class C131676dy extends AnonymousClass6JG {
    public HashMap A00 = AnonymousClass001.A0t();
    public AnonymousClass8s6[] A01;
    public final C620733j A02;
    public final HashMap A03 = AnonymousClass001.A0t();
    public final HashMap A04 = AnonymousClass001.A0t();
    public final HashSet A05 = AnonymousClass002.A0K();

    public int A0C() {
        return this.A01.length;
    }

    public final int A0L(int i) {
        int length;
        C620733j r1 = this.A02;
        if (r1.A0T()) {
            length = i;
        } else {
            length = (this.A01.length - 1) - i;
        }
        if (length < 0) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[3];
            AnonymousClass001.A1R(objArr, r1.A0T());
            AnonymousClass000.A1P(objArr, this.A01.length, 1);
            AnonymousClass000.A1P(objArr, i, 2);
            Log.i(C86654Ky.A0n(locale, "ContentPagerAdapter/getAbsolutePosition/absolutePosition < 0, isLtr: %s, pages.length: %d, position: %d", Arrays.copyOf(objArr, 3)));
        }
        return length;
    }

    public final void A0M(AnonymousClass8s6[] r6) {
        this.A01 = r6;
        HashMap hashMap = this.A04;
        hashMap.clear();
        int length = r6.length;
        for (int i = 0; i < length; i++) {
            AnonymousClass0x2.A1I(r6[i].getId(), hashMap, A0L(i));
        }
    }

    public C131676dy(C620733j r2, AnonymousClass8s6[] r3) {
        C18260x0.A0Q(r2, r3);
        this.A02 = r2;
        this.A01 = r3;
        A0M(r3);
    }
}
