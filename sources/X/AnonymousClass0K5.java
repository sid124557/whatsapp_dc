package X;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: X.0K5  reason: invalid class name */
public class AnonymousClass0K5 {
    public static Field A00;
    public static Field A01;
    public static Field A02;
    public static boolean A03 = true;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            A02 = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            A01 = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            A00 = declaredField3;
            declaredField3.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.w("WindowInsetsCompat", AnonymousClass000.A0a("Failed to get visible insets from AttachInfo ", AnonymousClass001.A0o(), e), e);
        }
    }
}
