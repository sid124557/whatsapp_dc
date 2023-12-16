package X;

import android.content.Context;
import com.google.android.gms.tasks.Task;

/* renamed from: X.5Bg  reason: invalid class name and case insensitive filesystem */
public class C100525Bg {
    public static void A00(C54292oU r1, AnonymousClass33p r2, C184578sA r3, boolean z) {
        Context context = r1.A00;
        if (AnonymousClass000.A1T(C159787mS.A00(context))) {
            Task A04 = new C127006Qg(context).A04();
            A04.addOnSuccessListener(new C111055hT(r2, r3, z));
            A04.addOnFailureListener(new C111035hR(r2, r3, z));
            return;
        }
        r3.BhU();
    }
}
