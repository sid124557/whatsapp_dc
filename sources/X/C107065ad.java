package X;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.HashSet;

/* renamed from: X.5ad  reason: invalid class name and case insensitive filesystem */
public final class C107065ad {
    public static void A03(Context context) {
        Activity A00 = C621633u.A00(context);
        if (A00 != null && !A00.isFinishing()) {
            int requestedOrientation = A00.getRequestedOrientation();
            HashSet A0K = AnonymousClass002.A0K();
            int i = 1;
            C18270x1.A1K(A0K, 1);
            C18270x1.A1K(A0K, 9);
            C18270x1.A1K(A0K, 7);
            C18270x1.A1K(A0K, 12);
            boolean A05 = A05(context, 600, 600);
            if (A05 == C86624Kv.A1a(A0K, requestedOrientation)) {
                if (A05) {
                    i = 2;
                }
                A00.setRequestedOrientation(i);
            }
        }
    }

    public static float A00(Context context) {
        Activity A00 = C621633u.A00(context);
        if (A00 == null || A00.isFinishing()) {
            return 0.0f;
        }
        return (float) C08940fM.A00.AzJ(A00).A00().height();
    }

    public static float A01(Context context) {
        Activity A00 = C621633u.A00(context);
        if (A00 == null || A00.isFinishing()) {
            return 0.0f;
        }
        return (float) C08940fM.A00.AzJ(A00).A00().width();
    }

    public static int A02(Context context, float f) {
        Activity A00 = C621633u.A00(context);
        if (A00 == null || A00.isFinishing()) {
            A00 = null;
        }
        int i = 0;
        if (A00 == null || Float.compare(f, 0.0f) == 0) {
            return 0;
        }
        float A002 = f / C86604Kt.A00(context);
        int[] iArr = {0, 360, 480, 600, 720, 840, 960, 1280, 1440, 1920, 1600, 2240};
        do {
            int i2 = iArr[i];
            if (Float.compare(A002, (float) i2) < 0) {
                return i2;
            }
            i++;
        } while (i < 12);
        return 2240;
    }

    public static void A04(ViewGroup viewGroup, C15790rw r3) {
        viewGroup.addView(new C124896Eh(viewGroup.getContext(), viewGroup, r3));
    }

    public static boolean A05(Context context, int i, int i2) {
        int i3;
        int i4;
        Activity A00 = C621633u.A00(context);
        if (A00 == null || A00.isFinishing()) {
            i3 = 0;
        } else {
            i3 = A02(context, A01(A00));
        }
        Activity A002 = C621633u.A00(context);
        if (A002 == null || A002.isFinishing()) {
            i4 = 0;
        } else {
            i4 = A02(context, A00(A002));
        }
        if (i3 < i || i4 < i2) {
            return false;
        }
        return true;
    }
}
