package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.0fM  reason: invalid class name and case insensitive filesystem */
public final class C08940fM implements C17160uf {
    public static final C08940fM A00 = new C08940fM();
    public static final String A01;

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Rect A02(android.app.Activity r11) {
        /*
            r10 = this;
            r5 = 0
            android.graphics.Rect r2 = X.AnonymousClass001.A0N()
            android.content.res.Resources r0 = r11.getResources()
            android.content.res.Configuration r3 = r0.getConfiguration()
            java.lang.Class<android.content.res.Configuration> r1 = android.content.res.Configuration.class
            java.lang.String r0 = "windowConfiguration"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            r0 = 1
            r1.setAccessible(r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            java.lang.Object r6 = r1.get(r3)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            boolean r0 = X.C03040Ip.A00(r11)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            java.lang.String r4 = "null cannot be cast to non-null type android.graphics.Rect"
            if (r0 == 0) goto L_0x0040
            java.lang.Class r3 = r6.getClass()     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            java.lang.String r1 = "getBounds"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            java.lang.reflect.Method r1 = r3.getDeclaredMethod(r1, r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            java.lang.Object r0 = r1.invoke(r6, r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            X.C162457s7.A0K(r0, r4)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            android.graphics.Rect r0 = (android.graphics.Rect) r0     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            r2.set(r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            goto L_0x006c
        L_0x0040:
            java.lang.Class r3 = r6.getClass()     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            java.lang.String r1 = "getAppBounds"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            java.lang.reflect.Method r1 = r3.getDeclaredMethod(r1, r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            java.lang.Object r0 = r1.invoke(r6, r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            X.C162457s7.A0K(r0, r4)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            android.graphics.Rect r0 = (android.graphics.Rect) r0     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            r2.set(r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005b }
            goto L_0x006c
        L_0x005b:
            r1 = move-exception
            java.lang.String r0 = A01
            android.util.Log.w(r0, r1)
            android.view.WindowManager r0 = r11.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getRectSize(r2)
        L_0x006c:
            android.view.WindowManager r0 = r11.getWindowManager()
            android.view.Display r9 = r0.getDefaultDisplay()
            android.graphics.Point r4 = new android.graphics.Point
            r4.<init>()
            X.C162457s7.A0D(r9)
            r9.getRealSize(r4)
            boolean r0 = X.C03040Ip.A00(r11)
            if (r0 != 0) goto L_0x00a2
            android.content.res.Resources r6 = r11.getResources()
            java.lang.String r3 = "dimen"
            java.lang.String r1 = "android"
            java.lang.String r0 = "navigation_bar_height"
            int r0 = r6.getIdentifier(r0, r3, r1)
            if (r0 <= 0) goto L_0x00ca
            int r3 = r6.getDimensionPixelSize(r0)
        L_0x0099:
            int r1 = r2.bottom
            int r1 = r1 + r3
            int r0 = r4.y
            if (r1 != r0) goto L_0x00b9
            r2.bottom = r1
        L_0x00a2:
            int r1 = r2.width()
            int r0 = r4.x
            if (r1 < r0) goto L_0x00b2
            int r1 = r2.height()
            int r0 = r4.y
            if (r1 >= r0) goto L_0x0155
        L_0x00b2:
            boolean r0 = X.C03040Ip.A00(r11)
            if (r0 != 0) goto L_0x0155
            goto L_0x00cc
        L_0x00b9:
            int r1 = r2.right
            int r1 = r1 + r3
            int r0 = r4.x
            if (r1 != r0) goto L_0x00c3
            r2.right = r1
            goto L_0x00a2
        L_0x00c3:
            int r0 = r2.left
            if (r0 != r3) goto L_0x00a2
            r2.left = r5
            goto L_0x00a2
        L_0x00ca:
            r3 = 0
            goto L_0x0099
        L_0x00cc:
            java.lang.String r0 = "android.view.DisplayInfo"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0110 }
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0110 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0110 }
            r8 = 1
            r1.setAccessible(r8)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0110 }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0110 }
            java.lang.Object r7 = r1.newInstance(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0110 }
            java.lang.Class r6 = r9.getClass()     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0110 }
            java.lang.String r1 = "getDisplayInfo"
            java.lang.Class[] r0 = new java.lang.Class[r8]     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0110 }
            java.lang.Class r3 = r7.getClass()     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0110 }
            java.lang.reflect.Method r1 = X.AnonymousClass002.A0H(r6, r3, r1, r0, r5)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0110 }
            r1.setAccessible(r8)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0110 }
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0110 }
            r0[r5] = r7     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0110 }
            r1.invoke(r9, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0110 }
            java.lang.String r0 = "displayCutout"
            java.lang.reflect.Field r0 = r3.getDeclaredField(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0110 }
            r0.setAccessible(r8)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0110 }
            java.lang.Object r3 = r0.get(r7)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0110 }
            boolean r0 = r3 instanceof android.view.DisplayCutout     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0110 }
            if (r0 == 0) goto L_0x0116
            android.view.DisplayCutout r3 = (android.view.DisplayCutout) r3     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0110 }
            goto L_0x0117
        L_0x0110:
            r1 = move-exception
            java.lang.String r0 = A01
            android.util.Log.w(r0, r1)
        L_0x0116:
            r3 = 0
        L_0x0117:
            if (r3 == 0) goto L_0x0155
            int r1 = r2.left
            int r0 = X.C06080We.A01(r3)
            if (r1 != r0) goto L_0x0123
            r2.left = r5
        L_0x0123:
            int r1 = r4.x
            int r0 = r2.right
            int r1 = r1 - r0
            int r0 = X.C06080We.A02(r3)
            if (r1 != r0) goto L_0x0137
            int r1 = r2.right
            int r0 = X.C06080We.A02(r3)
            int r1 = r1 + r0
            r2.right = r1
        L_0x0137:
            int r1 = r2.top
            int r0 = X.C06080We.A03(r3)
            if (r1 != r0) goto L_0x0141
            r2.top = r5
        L_0x0141:
            int r1 = r4.y
            int r0 = r2.bottom
            int r1 = r1 - r0
            int r0 = X.C06080We.A00(r3)
            if (r1 != r0) goto L_0x0155
            int r1 = r2.bottom
            int r0 = X.C06080We.A00(r3)
            int r1 = r1 + r0
            r2.bottom = r1
        L_0x0155:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08940fM.A02(android.app.Activity):android.graphics.Rect");
    }

    public final Rect A03(Activity activity) {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            C162457s7.A0K(invoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) invoke);
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
            Log.w(A01, e);
            return A02(activity);
        }
    }

    static {
        String simpleName = C08940fM.class.getSimpleName();
        C162457s7.A0D(simpleName);
        A01 = simpleName;
    }

    public AnonymousClass0Q8 AzJ(Activity activity) {
        Rect A002;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            A002 = C03050Iq.A00(activity);
        } else if (i >= 29) {
            A002 = A03(activity);
        } else if (i >= 28) {
            A002 = A02(activity);
        } else if (i >= 24) {
            A002 = A01(activity);
        } else {
            A002 = A00(activity);
        }
        return new AnonymousClass0Q8(A002);
    }

    public final Rect A00(Activity activity) {
        int i;
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        C162457s7.A0D(defaultDisplay);
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        Rect A0N = AnonymousClass001.A0N();
        int i2 = point.x;
        if (i2 == 0 || (i = point.y) == 0) {
            defaultDisplay.getRectSize(A0N);
            return A0N;
        }
        A0N.right = i2;
        A0N.bottom = i;
        return A0N;
    }

    public final Rect A01(Activity activity) {
        int i;
        Rect A0N = AnonymousClass001.A0N();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(A0N);
        if (!C03040Ip.A00(activity)) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = resources.getDimensionPixelSize(identifier);
            } else {
                i = 0;
            }
            int i2 = A0N.bottom + i;
            if (i2 == point.y) {
                A0N.bottom = i2;
            } else {
                int i3 = A0N.right + i;
                if (i3 == point.x) {
                    A0N.right = i3;
                    return A0N;
                }
            }
        }
        return A0N;
    }
}
