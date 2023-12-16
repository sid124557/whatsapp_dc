package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.0D3  reason: invalid class name */
public class AnonymousClass0D3 extends AnonymousClass6NB {
    public static C125076Fb A00(Context context) {
        return new C125076Fb(context);
    }

    public static void A01(C153427bI r13, AnonymousClass84O r14, C125076Fb r15) {
        int i;
        float f;
        AnonymousClass0LN r7;
        AnonymousClass0LN r8;
        AnonymousClass0FT r9;
        int A0E = r14.A0E(40, 0);
        AnonymousClass84O A0J = r14.A0K(35);
        String A0P = r14.A0P(36, "4.0dp");
        AnonymousClass84O A0J2 = r14.A0K(41);
        AnonymousClass84O A0J3 = r14.A0K(38);
        String A0P2 = r14.A0P(42, "rectangle");
        C153427bI r10 = r13;
        if (A0J != null) {
            i = C154127ce.A00(r13, A0J);
        } else {
            i = -1;
        }
        try {
            f = C162407s0.A01(A0P);
        } catch (AnonymousClass6u2 e) {
            C159737mN.A02("CDSGlimmerViewUtils", e);
            f = AnonymousClass0J7.A00(r10.A00(), 4.0f);
        }
        if (A0J2 != null) {
            r7 = new AnonymousClass0LN(A0J2.A0B(36, 0.3f), A0J2.A0B(35, 0.5f));
        } else {
            r7 = new AnonymousClass0LN(0.3f, 0.5f);
        }
        if (A0J3 != null) {
            r8 = new AnonymousClass0LN(A0J3.A0B(36, 0.066f), A0J3.A0B(35, 0.11f));
        } else {
            r8 = new AnonymousClass0LN(0.066f, 0.11f);
        }
        if ("circle".equalsIgnoreCase(A0P2)) {
            r9 = AnonymousClass0FT.CIRCLE;
        } else {
            r9 = AnonymousClass0FT.RECTANGLE;
        }
        r15.A02(new AnonymousClass01F(r15.getContext(), r7, r8, r9, r10, f, A0E, i));
        r15.A00();
    }

    public /* bridge */ /* synthetic */ Object A0M(View view, C153427bI r3, AnonymousClass84O r4, Object obj) {
        A01(r3, r4, (C125076Fb) view);
        return null;
    }

    public /* bridge */ /* synthetic */ void A0O(View view, C153427bI r2, AnonymousClass84O r3, Object obj, Object obj2) {
        A02((C125076Fb) view);
    }

    public AnonymousClass0D3(C153427bI r1, AnonymousClass84O r2) {
        super(r1, r2);
    }

    public /* bridge */ /* synthetic */ Object B0R(Context context) {
        return A00(context);
    }

    public static void A02(C125076Fb r0) {
        r0.A01();
    }
}
