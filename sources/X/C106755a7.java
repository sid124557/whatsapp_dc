package X;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import com.whatsapp.util.Log;

/* renamed from: X.5a7  reason: invalid class name and case insensitive filesystem */
public class C106755a7 {
    public static void A00(Vibrator vibrator, int i) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(VibrationEffect.createOneShot(30, i));
            } else {
                vibrator.vibrate(30);
            }
        } catch (Exception e) {
            Log.w("vibrationutils/vibrate-failed", e);
        }
    }

    public static void A01(View view, C620633i r2) {
        if (C107385bE.A08()) {
            view.performHapticFeedback(16);
        } else {
            A03(r2);
        }
    }

    public static void A02(View view, C620633i r2) {
        if (C107385bE.A08()) {
            view.performHapticFeedback(17);
        } else {
            A03(r2);
        }
    }

    public static void A03(C620633i r1) {
        Vibrator A0K = r1.A0K();
        if (A0K != null) {
            A00(A0K, 48);
        }
    }

    public static void A04(C620633i r1) {
        Vibrator A0K = r1.A0K();
        if (A0K != null) {
            A00(A0K, 80);
        }
    }
}
