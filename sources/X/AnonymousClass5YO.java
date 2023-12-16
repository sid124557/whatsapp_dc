package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.View;
import com.whatsapp.util.Log;

/* renamed from: X.5YO  reason: invalid class name */
public final class AnonymousClass5YO {
    public static int A00(Context context) {
        int i;
        int i2;
        Point B5y;
        try {
            if (context instanceof C86674La) {
                context = A03((C86674La) context);
            }
            if ((context instanceof C182178nz) && (B5y = ((C182178nz) context).B5y()) != null) {
                i = B5y.x;
                i2 = B5y.y;
                return Math.min(i, i2);
            }
        } catch (NullPointerException e) {
            Log.e("ConversationRowWidths/getMaxRowWidth/null view while getting row width", e);
        }
        DisplayMetrics A0B = AnonymousClass000.A0B(context);
        i = A0B.widthPixels;
        i2 = A0B.heightPixels;
        return Math.min(i, i2);
    }

    public static int A01(Context context, int i) {
        C626936e.A0B(AnonymousClass000.A1S(i));
        int A00 = A00(context);
        C626936e.A0B(AnonymousClass000.A1S(i));
        return Math.round((((float) A00) * ((float) i)) / 100.0f);
    }

    public static int A02(View view) {
        return A01(view.getContext(), 72);
    }

    public static Context A03(C86674La r1) {
        Context baseContext = r1.getBaseContext();
        if (baseContext instanceof Activity) {
            return baseContext;
        }
        if (baseContext instanceof C86674La) {
            return A03((C86674La) baseContext);
        }
        return null;
    }
}
