package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

/* renamed from: X.7cU  reason: invalid class name and case insensitive filesystem */
public class C154047cU {
    public static void A00(View view, AnonymousClass4M1 r3) {
        Rect A0N = AnonymousClass001.A0N();
        view.getDrawingRect(A0N);
        r3.setBounds(A0N);
        r3.A08(view, (FrameLayout) null);
        WeakReference weakReference = r3.A07;
        if (weakReference == null || weakReference.get() == null) {
            view.getOverlay().add(r3);
        } else {
            ((FrameLayout) weakReference.get()).setForeground(r3);
        }
    }

    public static void A01(View view, AnonymousClass4M1 r3) {
        if (r3 != null) {
            WeakReference weakReference = r3.A07;
            if (weakReference == null || weakReference.get() == null) {
                view.getOverlay().remove(r3);
            } else {
                ((FrameLayout) weakReference.get()).setForeground((Drawable) null);
            }
        }
    }
}
