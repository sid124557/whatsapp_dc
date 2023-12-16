package X;

import android.app.Dialog;
import com.whatsapp.R;

/* renamed from: X.59s  reason: invalid class name */
public class AnonymousClass59s {
    public static Dialog A00(C111095hX r10, C89654ea r11, AnonymousClass64H r12, C53602nM r13, C95814uZ r14, C66433Lk r15, boolean z) {
        C89654ea r7 = r11;
        C19340zH A00 = AnonymousClass5V0.A00(r11);
        boolean z2 = r14 instanceof C95804uY;
        C1235268t A002 = C1235268t.A00(r12, 2);
        C108015cH r5 = new C108015cH(r10, r7, r12, r13, r15, z2);
        C1235568w r2 = new C1235568w(r12, 2);
        int i = R.string.f11nameremoved;
        if (z) {
            i = R.string.f11nameremoved;
        }
        if (z2) {
            i = R.string.f11nameremoved;
            if (z) {
                i = R.string.f11nameremoved;
            }
        }
        A00.A0Q(r7.getResources().getString(i));
        A00.setPositiveButton(R.string.f11nameremoved, A002);
        A00.setNegativeButton(R.string.f11nameremoved, r5);
        A00.A0R(true);
        A00.A0D(r2);
        return A00.create();
    }
}
