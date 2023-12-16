package X;

import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.DialogFragment;

/* renamed from: X.0VD  reason: invalid class name */
public final class AnonymousClass0VD {
    public static void A01(C08240dc r4, DialogFragment dialogFragment, C003203q r6, C08270df r7) {
        try {
            dialogFragment.A0C = false;
            dialogFragment.A0D = true;
            r4.A0C(dialogFragment, (String) null);
            dialogFragment.A0F = false;
            dialogFragment.A00 = r4.A00(false);
        } catch (IllegalStateException e) {
            if (r6.isFinishing() || r6.isDestroyed() || r7.A0K) {
                C159737mN.A00((C153427bI) null, "CDSBloksBottomSheetController", "Error attempting to show CDS fragment when activity is closing", e);
                return;
            }
            try {
                r7.A0z((String) null);
                C08240dc r1 = new C08240dc(r7);
                r1.A0I((String) null);
                r1.A0C(dialogFragment, (String) null);
                r1.A00(true);
            } catch (Exception e2) {
                C159737mN.A00((C153427bI) null, "CDSBloksBottomSheetController", "Error attempting to show CDS fragment while allowing state loss during commit", e2);
            }
        }
    }

    public static C04670Qe A00(Context context, DialogFragment dialogFragment, C17130uc r2, AnonymousClass7r0 r3, C156397gY r4, String str) {
        return AnonymousClass0J9.A00(context, (C17370vQ) dialogFragment, r2, r3, r4, str);
    }

    public static void A02(DialogFragment dialogFragment, C003203q r4, C17130uc r5, AnonymousClass7r0 r6, C181528mu r7, C156397gY r8, String str, int i) {
        C08270df A01 = AnonymousClass00M.A01(r4);
        C08240dc r1 = new C08240dc(A01);
        r1.A0I((String) null);
        A01(r1, dialogFragment, r4, A01);
        C13310my r2 = new C13310my(dialogFragment, r4, r5, r6, r7, r8, str, i);
        Handler A0A = AnonymousClass000.A0A();
        A0A.post(new C13290mw(A0A, dialogFragment, r2));
    }
}
