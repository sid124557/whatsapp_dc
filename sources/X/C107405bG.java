package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.Window;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.R;

/* renamed from: X.5bG  reason: invalid class name and case insensitive filesystem */
public class C107405bG {
    public static C000500m A01(Context context) {
        C000500m r3;
        Configuration configuration = new Configuration();
        configuration.uiMode = (new Configuration().uiMode & -49) | 16;
        if (context instanceof C000500m) {
            r3 = (C000500m) context;
        } else {
            r3 = new C000500m(context, (Resources.Theme) null);
        }
        r3.A01(configuration);
        return r3;
    }

    public static void A0A(Context context, Window window, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            C86634Kw.A1G(window);
            C86634Kw.A13(context, window, i);
            A0C(window, !A0D(context));
        }
    }

    public static void A0B(Window window, int i, int i2) {
        if (window != null) {
            boolean z = true;
            if (i2 != 1 || A0D(window.getContext())) {
                z = false;
            } else if (!C107385bE.A05()) {
                return;
            }
            window.setNavigationBarColor(AnonymousClass0Y8.A04(window.getContext(), i));
            if (Build.VERSION.SDK_INT >= 27) {
                int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
                int i3 = systemUiVisibility & -17;
                if (z) {
                    i3 = systemUiVisibility | 16;
                }
                window.getDecorView().setSystemUiVisibility(i3);
            }
        }
    }

    public static void A0C(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            int i = systemUiVisibility & -8193;
            if (z) {
                i = systemUiVisibility | DefaultCrypto.BUFFER_SIZE;
            }
            window.getDecorView().setSystemUiVisibility(i);
        }
    }

    public static int A00(Context context, int i, int i2) {
        TypedValue A0B = AnonymousClass4L0.A0B();
        context.getTheme().resolveAttribute(i, A0B, true);
        try {
            return AnonymousClass0Y8.A04(context, A0B.resourceId);
        } catch (Resources.NotFoundException unused) {
            return AnonymousClass0Y8.A04(context, i2);
        }
    }

    public static void A02(int i, Dialog dialog) {
        A0A(dialog.getContext(), dialog.getWindow(), i);
    }

    public static void A03(Activity activity) {
        A0C(activity.getWindow(), false);
    }

    public static void A04(Activity activity) {
        A07(activity, AnonymousClass34K.A00(activity));
    }

    public static void A05(Activity activity) {
        A08(activity, AnonymousClass34K.A01(activity, R.attr.f3nameremoved));
    }

    public static void A06(Activity activity) {
        Window window = activity.getWindow();
        if (window != null) {
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 256 | EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        }
    }

    public static void A07(Activity activity, int i) {
        Window window = activity.getWindow();
        if (window != null) {
            C86634Kw.A1G(window);
            C86634Kw.A13(activity, window, i);
        }
    }

    public static void A08(Activity activity, int i) {
        A0A(activity.getBaseContext(), activity.getWindow(), i);
    }

    public static void A09(Activity activity, int i, int i2) {
        A0B(activity.getWindow(), i, i2);
    }

    public static boolean A0D(Context context) {
        return AnonymousClass000.A1U(AnonymousClass001.A0M(context).uiMode & 48, 32);
    }
}
