package X;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.whatsapp.WaTextView;

/* renamed from: X.5b4  reason: invalid class name and case insensitive filesystem */
public class C107295b4 {
    public static void A02(View view) {
        C06560Yg.A0O(view, new C1230767a(view, 2));
    }

    public static void A03(View view, int i) {
        C86614Ku.A1H(view, new C148007Go[]{new C148007Go(16, i)}, 1);
    }

    public static void A04(View view, int i) {
        C86614Ku.A1H(view, new C148007Go[]{new C148007Go(1, i)}, 1);
    }

    public static void A05(View view, int i) {
        C86614Ku.A1H(view, new C148007Go[]{new C148007Go(32, i)}, 1);
    }

    public static void A01(View view) {
        C06560Yg.A0O(view, new AnonymousClass0WH());
    }

    public static void A06(View view, boolean z) {
        C06560Yg.A0O(view, new AnonymousClass6GQ(z));
    }

    public static boolean A08(AccessibilityManager accessibilityManager) {
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        return true;
    }

    public static void A00(Context context, C620633i r4, CharSequence charSequence) {
        AccessibilityManager A0P = r4.A0P();
        if (A0P != null && A0P.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(16384);
            obtain.setClassName("android.widget.Button");
            obtain.setPackageName(context.getPackageName());
            obtain.getText().add(charSequence);
            A0P.sendAccessibilityEvent(obtain);
        }
    }

    public static void A07(WaTextView waTextView, C620633i r2, AnonymousClass1VX r3) {
        C18270x1.A0q(waTextView, r3);
        C06560Yg.A0O(waTextView, new AnonymousClass4TJ(waTextView, r2));
    }

    public static boolean A09(C620633i r0) {
        return A08(r0.A0P());
    }
}
