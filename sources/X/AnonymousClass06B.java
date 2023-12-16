package X;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* renamed from: X.06B  reason: invalid class name */
public class AnonymousClass06B extends AnonymousClass0UT {
    public static Constructor A02;
    public static Field A03;
    public static boolean A04;
    public static boolean A05;
    public WindowInsets A00;
    public AnonymousClass0XU A01;

    public void A06(AnonymousClass0XU r6) {
        WindowInsets windowInsets = this.A00;
        if (windowInsets != null) {
            this.A00 = windowInsets.replaceSystemWindowInsets(r6.A01, r6.A03, r6.A02, r6.A00);
        }
    }

    public AnonymousClass06B(AnonymousClass0XY r2) {
        super(r2);
        this.A00 = r2.A06();
    }

    public AnonymousClass0XY A00() {
        A01();
        AnonymousClass0XY A0X = AnonymousClass001.A0X(this.A00);
        AnonymousClass0XU[] r0 = this.A00;
        C05640Uh r1 = A0X.A00;
        r1.A0H(r0);
        r1.A09(this.A01);
        return A0X;
    }

    public void A05(AnonymousClass0XU r1) {
        this.A01 = r1;
    }

    public AnonymousClass06B() {
        WindowInsets windowInsets;
        if (!A05) {
            try {
                A03 = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            A05 = true;
        }
        Field field = A03;
        if (field != null) {
            try {
                WindowInsets windowInsets2 = (WindowInsets) field.get((Object) null);
                if (windowInsets2 != null) {
                    windowInsets = new WindowInsets(windowInsets2);
                    this.A00 = windowInsets;
                }
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
            }
        }
        if (!A04) {
            try {
                A02 = WindowInsets.class.getConstructor(new Class[]{Rect.class});
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            A04 = true;
        }
        Constructor constructor = A02;
        if (constructor != null) {
            try {
                windowInsets = (WindowInsets) constructor.newInstance(new Object[]{AnonymousClass001.A0N()});
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
            this.A00 = windowInsets;
        }
        windowInsets = null;
        this.A00 = windowInsets;
    }
}
