package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.0D4  reason: invalid class name */
public class AnonymousClass0D4 extends AnonymousClass6NB {
    public static C125076Fb A00(Context context) {
        return new C125076Fb(context);
    }

    public static void A01(C153427bI r6, AnonymousClass84O r7, C125076Fb r8) {
        AnonymousClass84O A0J = r7.A0K(35);
        int i = 24;
        int i2 = -16777216;
        if (A0J != null) {
            try {
                i = (int) C162407s0.A03(A0J.A0O(36), 24.0f);
            } catch (AnonymousClass6u2 unused) {
            }
            AnonymousClass84O A0J2 = A0J.A0K(35);
            if (A0J2 != null) {
                i2 = C154127ce.A00(r6, A0J2);
            }
        }
        r8.A02(new AnonymousClass01E(r6.A00(), i2, i));
        r8.A00();
    }

    public /* bridge */ /* synthetic */ Object A0M(View view, C153427bI r3, AnonymousClass84O r4, Object obj) {
        A01(r3, r4, (C125076Fb) view);
        return null;
    }

    public /* bridge */ /* synthetic */ void A0O(View view, C153427bI r2, AnonymousClass84O r3, Object obj, Object obj2) {
        A02((C125076Fb) view);
    }

    public AnonymousClass0D4(C153427bI r1, AnonymousClass84O r2) {
        super(r1, r2);
    }

    public /* bridge */ /* synthetic */ Object B0R(Context context) {
        return A00(context);
    }

    public static void A02(C125076Fb r0) {
        r0.A01();
    }
}
