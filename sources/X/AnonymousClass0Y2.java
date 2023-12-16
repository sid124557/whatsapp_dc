package X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Set;

/* renamed from: X.0Y2  reason: invalid class name */
public final class AnonymousClass0Y2 {
    public static AnonymousClass0T5 A00 = AnonymousClass0T5.A02;
    public static final AnonymousClass0Y2 A01 = new AnonymousClass0Y2();

    public static final void A03(C13840np r2) {
        if (C08270df.A05(3)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("StrictMode violation in ");
            Log.d("FragmentManager", AnonymousClass000.A0X(AnonymousClass000.A0O(r2.fragment), A0o), r2);
        }
    }

    public static final AnonymousClass0T5 A00(C08310eF r1) {
        while (r1 != null) {
            if (r1.A16()) {
                r1.A0U();
            }
            r1 = r1.A0E;
        }
        return A00;
    }

    public static final void A02(C08310eF r5, String str) {
        AnonymousClass083 r4 = new AnonymousClass083(r5, str);
        AnonymousClass0Y2 r3 = A01;
        A03(r4);
        AnonymousClass0T5 A002 = A00(r5);
        if (A002.A01.contains(AnonymousClass0G2.DETECT_FRAGMENT_REUSE)) {
            AnonymousClass000.A0y(A002, r3, r4, r5);
        }
    }

    public final void A05(AnonymousClass0T5 r6, C13840np r7) {
        C08310eF r4 = r7.fragment;
        String A0O = AnonymousClass000.A0O(r4);
        Set set = r6.A01;
        if (set.contains(AnonymousClass0G2.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", AnonymousClass000.A0V("Policy violation in ", A0O, AnonymousClass001.A0o()), r7);
        }
        if (set.contains(AnonymousClass0G2.PENALTY_DEATH)) {
            A01(r4, new C11880kc(r7, A0O));
        }
    }

    public static final void A01(C08310eF r2, Runnable runnable) {
        if (r2.A16()) {
            Handler handler = r2.A0U().A07.A02;
            if (!C162457s7.A0P(handler.getLooper(), Looper.myLooper())) {
                handler.post(runnable);
                return;
            }
        }
        runnable.run();
    }

    public static final boolean A04(AnonymousClass0T5 r2, Class cls, Class cls2) {
        Set set = (Set) r2.A00.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (C162457s7.A0P(cls2.getSuperclass(), C13840np.class) || !C73723fy.A0U(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
