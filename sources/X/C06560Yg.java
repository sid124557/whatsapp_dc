package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import com.whatsapp.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0Yg  reason: invalid class name and case insensitive filesystem */
public class C06560Yg {
    public static ThreadLocal A00;
    public static Field A01;
    public static Method A02;
    public static Method A03;
    public static WeakHashMap A04;
    public static boolean A05;
    public static boolean A06;
    public static final C15840s2 A07 = new C08140dO();
    public static final C07240aY A08 = new C07240aY();
    public static final AtomicInteger A09 = new AtomicInteger(1);
    public static final int[] A0A = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    public static AnonymousClass0Tq A04(View view, AnonymousClass0Tq r4) {
        C15840s2 r3;
        if (Log.isLoggable("ViewCompat", 3)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("performReceiveContent: ");
            A0o.append(r4);
            A0o.append(", view=");
            AnonymousClass000.A1A(view, A0o);
            A0o.append("[");
            A0o.append(view.getId());
            Log.d("ViewCompat", AnonymousClass000.A0f(A0o));
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C04960Ri.A00(view, r4);
        }
        AnonymousClass0s1 r0 = (AnonymousClass0s1) view.getTag(R.id.tag_on_receive_content_listener);
        if (r0 != null && (r4 = r0.BZV(view, r4)) == null) {
            return null;
        }
        if (view instanceof C15840s2) {
            r3 = (C15840s2) view;
        } else {
            r3 = A07;
        }
        return r3.BZW(r4);
    }

    public static CharSequence A09(View view) {
        return (CharSequence) new C17560vm(1).A02(view);
    }

    public static void A0B(Context context, TypedArray typedArray, AttributeSet attributeSet, View view, int[] iArr, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C04940Rg.A01(context, typedArray, attributeSet, view, iArr, i, 0);
        }
    }

    public static void A0N(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            C04920Re.A01(view, i, 3);
        }
    }

    public static void A0R(View view, C06220Ws r7, C15860s4 r8, CharSequence charSequence) {
        C15860s4 r1 = r8;
        CharSequence charSequence2 = charSequence;
        if (r8 == null && charSequence == null) {
            A0K(view, ((AccessibilityNodeInfo.AccessibilityAction) r7.A03).getId());
            return;
        }
        A0Q(view, new C06220Ws(r1, charSequence2, r7.A02, (Object) null, r7.A00));
    }

    public static void A0S(View view, CharSequence charSequence) {
        new C17560vm(2).A03(view, charSequence);
    }

    public static void A0T(View view, boolean z) {
        new C17560vm(3).A03(view, Boolean.valueOf(z));
    }

    public static int A00(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C04930Rf.A00(view);
        }
        return 0;
    }

    public static View.AccessibilityDelegate A01(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C04940Rg.A00(view);
        }
        if (A05) {
            return null;
        }
        if (A01 == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                A01 = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                A05 = true;
                return null;
            }
        }
        Object obj = A01.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    public static View A02(View view, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) C06480Xw.A01(view, i);
        }
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw AnonymousClass001.A0c("ID does not reference a View inside this View");
    }

    public static C04830Qv A05(View view) {
        WeakHashMap weakHashMap = A04;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            A04 = weakHashMap;
        }
        C04830Qv r1 = (C04830Qv) weakHashMap.get(view);
        if (r1 != null) {
            return r1;
        }
        C04830Qv r12 = new C04830Qv(view);
        A04.put(view, r12);
        return r12;
    }

    public static AnonymousClass0XY A06(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C04920Re.A00(view);
        }
        return AnonymousClass0YZ.A05(view);
    }

    public static void A0A() {
        Class<View> cls = View.class;
        try {
            A03 = cls.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            A02 = cls.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        } catch (NoSuchMethodException e) {
            Log.e("ViewCompat", "Couldn't find method", e);
        }
        A06 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (X.AnonymousClass0YZ.A04(r3) != null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0C(android.content.res.ColorStateList r2, android.view.View r3) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            X.AnonymousClass0YZ.A07(r2, r3)
            r0 = 21
            if (r1 != r0) goto L_0x0025
            android.graphics.drawable.Drawable r2 = r3.getBackground()
            android.content.res.ColorStateList r0 = X.AnonymousClass0YZ.A03(r3)
            if (r0 != 0) goto L_0x001a
            android.graphics.PorterDuff$Mode r1 = X.AnonymousClass0YZ.A04(r3)
            r0 = 0
            if (r1 == 0) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            if (r2 == 0) goto L_0x0025
            if (r0 == 0) goto L_0x0025
            X.AnonymousClass000.A0t(r2, r3)
            X.AnonymousClass0YY.A04(r2, r3)
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06560Yg.A0C(android.content.res.ColorStateList, android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (X.AnonymousClass0YZ.A04(r3) != null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0D(android.graphics.PorterDuff.Mode r2, android.view.View r3) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            X.AnonymousClass0YZ.A08(r2, r3)
            r0 = 21
            if (r1 != r0) goto L_0x0025
            android.graphics.drawable.Drawable r2 = r3.getBackground()
            android.content.res.ColorStateList r0 = X.AnonymousClass0YZ.A03(r3)
            if (r0 != 0) goto L_0x001a
            android.graphics.PorterDuff$Mode r1 = X.AnonymousClass0YZ.A04(r3)
            r0 = 0
            if (r1 == 0) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            if (r2 == 0) goto L_0x0025
            if (r0 == 0) goto L_0x0025
            X.AnonymousClass000.A0t(r2, r3)
            X.AnonymousClass0YY.A04(r2, r3)
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06560Yg.A0D(android.graphics.PorterDuff$Mode, android.view.View):void");
    }

    public static void A0E(View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            AnonymousClass0V1.A01(view);
            return;
        }
        if (!A06) {
            A0A();
        }
        Method method = A02;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception e) {
                Log.d("ViewCompat", "Error calling dispatchFinishTemporaryDetach", e);
            }
        } else {
            view.onFinishTemporaryDetach();
        }
    }

    public static void A0F(View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            AnonymousClass0V1.A02(view);
            return;
        }
        if (!A06) {
            A0A();
        }
        Method method = A03;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception e) {
                Log.d("ViewCompat", "Error calling dispatchStartTemporaryDetach", e);
            }
        } else {
            view.onStartTemporaryDetach();
        }
    }

    public static void A0I(View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        ThreadLocal threadLocal = A00;
        if (threadLocal == null) {
            threadLocal = new ThreadLocal();
            A00 = threadLocal;
        }
        Rect rect = (Rect) threadLocal.get();
        if (rect == null) {
            rect = AnonymousClass001.A0N();
            A00.set(rect);
        }
        rect.setEmpty();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            AnonymousClass000.A0x((View) parent, rect);
            z = !rect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            A0G(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                A0G((View) parent2);
            }
        }
        if (z && rect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rect);
        }
    }

    public static void A0J(View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        ThreadLocal threadLocal = A00;
        if (threadLocal == null) {
            threadLocal = new ThreadLocal();
            A00 = threadLocal;
        }
        Rect rect = (Rect) threadLocal.get();
        if (rect == null) {
            rect = AnonymousClass001.A0N();
            A00.set(rect);
        }
        rect.setEmpty();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            AnonymousClass000.A0x((View) parent, rect);
            z = !rect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            A0G(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                A0G((View) parent2);
            }
        }
        if (z && rect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rect);
        }
    }

    public static void A0M(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            C04930Rf.A01(view, i);
        }
    }

    public static void A0O(View view, AnonymousClass0WH r2) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (r2 == null) {
            if (A01(view) instanceof AnonymousClass02Q) {
                r2 = new AnonymousClass0WH();
            } else {
                accessibilityDelegate = null;
                view.setAccessibilityDelegate(accessibilityDelegate);
            }
        }
        accessibilityDelegate = r2.A00;
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    public static void A0P(View view, AnonymousClass0TU r3) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 24) {
            if (r3 != null) {
                obj = r3.A01();
            } else {
                obj = null;
            }
            AnonymousClass0V1.A00((PointerIcon) obj, view);
        }
    }

    public static boolean A0U(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        C05380Tc r6 = (C05380Tc) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (r6 == null) {
            r6 = new C05380Tc();
            view.setTag(R.id.tag_unhandled_key_event_manager, r6);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = r6.A02;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = C05380Tc.A03;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (r6.A02 == null) {
                        r6.A02 = new WeakHashMap();
                    }
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        View view2 = (View) ((WeakReference) arrayList.get(size)).get();
                        if (view2 == null) {
                            arrayList.remove(size);
                        } else {
                            r6.A02.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                r6.A02.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View A002 = r6.A00(keyEvent, view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (A002 == null) {
                return false;
            }
            if (KeyEvent.isModifierKey(keyCode)) {
                return true;
            }
            SparseArray sparseArray = r6.A00;
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                r6.A00 = sparseArray;
            }
            sparseArray.put(keyCode, new WeakReference(A002));
            return true;
        } else if (A002 != null) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        if (r0 == null) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0V(android.view.View r3, android.view.KeyEvent r4) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 >= r0) goto L_0x0023
            r0 = 2131434175(0x7f0b1abf, float:1.8490157E38)
            java.lang.Object r1 = r3.getTag(r0)
            X.0Tc r1 = (X.C05380Tc) r1
            if (r1 != 0) goto L_0x0019
            X.0Tc r1 = new X.0Tc
            r1.<init>()
            r3.setTag(r0, r1)
        L_0x0019:
            java.lang.ref.WeakReference r0 = r1.A01
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r0.get()
            if (r0 != r4) goto L_0x0025
        L_0x0023:
            r0 = 0
            return r0
        L_0x0025:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r1.A01 = r0
            android.util.SparseArray r3 = r1.A00
            if (r3 != 0) goto L_0x0037
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r1.A00 = r3
        L_0x0037:
            int r0 = r4.getAction()
            r2 = 1
            if (r0 != r2) goto L_0x0053
            int r0 = r4.getKeyCode()
            int r1 = r3.indexOfKey(r0)
            if (r1 < 0) goto L_0x0053
            java.lang.Object r0 = r3.valueAt(r1)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            r3.removeAt(r1)
            if (r0 != 0) goto L_0x005f
        L_0x0053:
            int r0 = r4.getKeyCode()
            java.lang.Object r0 = r3.get(r0)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x0023
        L_0x005f:
            java.lang.Object r1 = r0.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x0089
            boolean r0 = X.C06360Xi.A04(r1)
            if (r0 == 0) goto L_0x0089
            r0 = 2131434176(0x7f0b1ac0, float:1.8490159E38)
            java.lang.Object r1 = r1.getTag(r0)
            java.util.AbstractList r1 = (java.util.AbstractList) r1
            if (r1 == 0) goto L_0x0089
            int r0 = r1.size()
            int r0 = r0 - r2
            if (r0 < 0) goto L_0x0089
            r1.get(r0)
            java.lang.String r0 = "onUnhandledKeyEvent"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0089:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06560Yg.A0V(android.view.View, android.view.KeyEvent):boolean");
    }

    public static String[] A0W(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C04960Ri.A01(view);
        }
        return (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static AnonymousClass0WH A03(View view) {
        View.AccessibilityDelegate A012 = A01(view);
        if (A012 == null) {
            return null;
        }
        if (A012 instanceof AnonymousClass02Q) {
            return ((AnonymousClass02Q) A012).A00;
        }
        return new AnonymousClass0WH(A012);
    }

    public static AnonymousClass0XY A07(View view, AnonymousClass0XY r3) {
        WindowInsets A062 = r3.A06();
        if (A062 != null) {
            WindowInsets A002 = AnonymousClass0V0.A00(view, A062);
            if (!A002.equals(A062)) {
                return AnonymousClass0XY.A01(view, A002);
            }
        }
        return r3;
    }

    public static AnonymousClass0XY A08(View view, AnonymousClass0XY r3) {
        WindowInsets A062 = r3.A06();
        if (A062 != null) {
            WindowInsets A012 = AnonymousClass0V0.A01(view, A062);
            if (!A012.equals(A062)) {
                return AnonymousClass0XY.A01(view, A012);
            }
        }
        return r3;
    }

    public static void A0G(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r4.getWindowVisibility() != 0) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0H(android.view.View r4, int r5) {
        /*
            android.content.Context r1 = r4.getContext()
            java.lang.String r0 = "accessibility"
            java.lang.Object r3 = r1.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r3 = (android.view.accessibility.AccessibilityManager) r3
            boolean r0 = r3.isEnabled()
            if (r0 == 0) goto L_0x0053
            java.lang.CharSequence r0 = A09(r4)
            if (r0 == 0) goto L_0x0025
            boolean r0 = r4.isShown()
            if (r0 == 0) goto L_0x0025
            int r0 = r4.getWindowVisibility()
            r2 = 1
            if (r0 == 0) goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            int r1 = X.C06360Xi.A00(r4)
            r0 = 32
            if (r1 != 0) goto L_0x007b
            if (r2 != 0) goto L_0x007b
            if (r5 != r0) goto L_0x0054
            android.view.accessibility.AccessibilityEvent r2 = android.view.accessibility.AccessibilityEvent.obtain()
            r4.onInitializeAccessibilityEvent(r2)
            r2.setEventType(r0)
            X.C06360Xi.A03(r2, r5)
            r2.setSource(r4)
            r4.onPopulateAccessibilityEvent(r2)
            java.util.List r1 = r2.getText()
            java.lang.CharSequence r0 = A09(r4)
            r1.add(r0)
            r3.sendAccessibilityEvent(r2)
        L_0x0053:
            return
        L_0x0054:
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L_0x0053
            android.view.ViewParent r0 = r4.getParent()
            X.C06360Xi.A02(r4, r4, r0, r5)     // Catch:{ AbstractMethodError -> 0x0062 }
            goto L_0x007a
        L_0x0062:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            android.view.ViewParent r0 = r4.getParent()
            X.AnonymousClass000.A1A(r0, r1)
            java.lang.String r0 = " does not fully implement ViewParent"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r0 = "ViewCompat"
            android.util.Log.e(r0, r1, r2)
            return
        L_0x007a:
            return
        L_0x007b:
            android.view.accessibility.AccessibilityEvent r3 = android.view.accessibility.AccessibilityEvent.obtain()
            if (r2 != 0) goto L_0x0083
            r0 = 2048(0x800, float:2.87E-42)
        L_0x0083:
            r3.setEventType(r0)
            X.C06360Xi.A03(r3, r5)
            if (r2 == 0) goto L_0x00b6
            java.util.List r1 = r3.getText()
            java.lang.CharSequence r0 = A09(r4)
            r1.add(r0)
            int r0 = X.AnonymousClass0YY.A00(r4)
            if (r0 != 0) goto L_0x00a0
            r0 = 1
            X.AnonymousClass0YY.A06(r4, r0)
        L_0x00a0:
            android.view.ViewParent r2 = r4.getParent()
        L_0x00a4:
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto L_0x00b6
            r0 = r2
            android.view.View r0 = (android.view.View) r0
            int r1 = X.AnonymousClass0YY.A00(r0)
            r0 = 4
            if (r1 != r0) goto L_0x00ba
            r0 = 2
            X.AnonymousClass0YY.A06(r4, r0)
        L_0x00b6:
            r4.sendAccessibilityEventUnchecked(r3)
            return
        L_0x00ba:
            android.view.ViewParent r2 = r2.getParent()
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06560Yg.A0H(android.view.View, int):void");
    }

    public static void A0K(View view, int i) {
        A0L(view, i);
        A0H(view, 0);
    }

    public static void A0L(View view, int i) {
        AbstractList abstractList = (AbstractList) view.getTag(R.id.tag_accessibility_actions);
        if (abstractList == null) {
            abstractList = AnonymousClass001.A0s();
            view.setTag(R.id.tag_accessibility_actions, abstractList);
        }
        for (int i2 = 0; i2 < abstractList.size(); i2++) {
            if (((AccessibilityNodeInfo.AccessibilityAction) ((C06220Ws) abstractList.get(i2)).A03).getId() == i) {
                abstractList.remove(i2);
                return;
            }
        }
    }

    public static void A0Q(View view, C06220Ws r3) {
        AnonymousClass0WH A032 = A03(view);
        if (A032 == null) {
            A032 = new AnonymousClass0WH();
        }
        A0O(view, A032);
        A0L(view, ((AccessibilityNodeInfo.AccessibilityAction) r3.A03).getId());
        AbstractCollection abstractCollection = (AbstractCollection) view.getTag(R.id.tag_accessibility_actions);
        if (abstractCollection == null) {
            abstractCollection = AnonymousClass001.A0s();
            view.setTag(R.id.tag_accessibility_actions, abstractCollection);
        }
        abstractCollection.add(r3);
        A0H(view, 0);
    }
}
