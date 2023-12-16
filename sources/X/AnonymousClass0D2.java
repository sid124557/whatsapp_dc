package X;

import android.content.Context;
import android.view.View;
import com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText;

/* renamed from: X.0D2  reason: invalid class name */
public class AnonymousClass0D2 extends AnonymousClass6NB {
    /* renamed from: A0P */
    public Void A0M(BloksEditText bloksEditText, C153427bI r7, AnonymousClass84O r8, Object obj) {
        C04080Ms A02 = AnonymousClass0YO.A02(bloksEditText, (AnonymousClass7S1) null, r7, r8, obj);
        if (r8.A0W(63, false)) {
            float textSize = bloksEditText.getTextSize();
            if (A02.A01 != textSize) {
                A02.A01 = textSize;
                C162377rs.A02(r7).A09(r8, new AnonymousClass0D7(this, A02, A02.A0E.toString()));
            }
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0N(View view, C153427bI r2, AnonymousClass84O r3, Object obj, Object obj2) {
        A00((BloksEditText) view, r2, r3);
    }

    public /* bridge */ /* synthetic */ void A0O(View view, C153427bI r2, AnonymousClass84O r3, Object obj, Object obj2) {
        A01((BloksEditText) view, r2, r3);
    }

    public AnonymousClass0D2(C153427bI r1, AnonymousClass84O r2) {
        super(r1, r2);
    }

    public /* bridge */ /* synthetic */ Object B0R(Context context) {
        return BloksEditText.A00(context);
    }

    public static void A00(BloksEditText bloksEditText, C153427bI r1, AnonymousClass84O r2) {
        AnonymousClass0YO.A07(bloksEditText, r1, r2);
    }

    public static void A01(BloksEditText bloksEditText, C153427bI r1, AnonymousClass84O r2) {
        AnonymousClass0YO.A08(bloksEditText, r1, r2);
    }
}
