package androidx.recyclerview.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass063;
import X.AnonymousClass09K;
import X.AnonymousClass0GX;
import X.AnonymousClass0NE;
import X.AnonymousClass0O5;
import X.AnonymousClass0ON;
import X.AnonymousClass0Pd;
import X.AnonymousClass0Q1;
import X.AnonymousClass0R0;
import X.AnonymousClass0R6;
import X.AnonymousClass0RZ;
import X.AnonymousClass0TA;
import X.AnonymousClass0UY;
import X.AnonymousClass0YY;
import X.AnonymousClass0YZ;
import X.AnonymousClass0u9;
import X.C002102g;
import X.C008807b;
import X.C02900Ia;
import X.C04110Mv;
import X.C04580Ov;
import X.C04660Qd;
import X.C04680Qf;
import X.C04690Qg;
import X.C04870Qz;
import X.C05000Rm;
import X.C05570Ua;
import X.C06290Wz;
import X.C06440Xs;
import X.C06560Yg;
import X.C08480eY;
import X.C08520ec;
import X.C08540ee;
import X.C10550i7;
import X.C13230mq;
import X.C13320mz;
import X.C14990qb;
import X.C15200qw;
import X.C15210qx;
import X.C15220qy;
import X.C16030sM;
import X.C16670tm;
import X.C17240vC;
import X.C17250vD;
import X.C18250wz;
import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class RecyclerView extends ViewGroup implements C17250vD, C17240vC, C14990qb {
    public static final Interpolator A1A = new C18250wz(3);
    public static final boolean A1B;
    public static final int[] A1C = {16843830};
    public static final Class[] A1D;
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public VelocityTracker A0D;
    public EdgeEffect A0E;
    public EdgeEffect A0F;
    public EdgeEffect A0G;
    public EdgeEffect A0H;
    public C04680Qf A0I;
    public C08520ec A0J;
    public AnonymousClass0R0 A0K;
    public C08540ee A0L;
    public C13320mz A0M;
    public AnonymousClass0R6 A0N;
    public C15200qw A0O;
    public C02900Ia A0P;
    public C15210qx A0Q;
    public AnonymousClass0UY A0R;
    public C06440Xs A0S;
    public C04110Mv A0T;
    public AnonymousClass0u9 A0U;
    public AnonymousClass0O5 A0V;
    public C16030sM A0W;
    public C008807b A0X;
    public AnonymousClass063 A0Y;
    public Runnable A0Z;
    public List A0a;
    public List A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public final int A0q;
    public final int A0r;
    public final Rect A0s;
    public final Rect A0t;
    public final RectF A0u;
    public final AccessibilityManager A0v;
    public final C04870Qz A0w;
    public final AnonymousClass09K A0x;
    public final AnonymousClass0Q1 A0y;
    public final C13230mq A0z;
    public final C15220qy A10;
    public final C04660Qd A11;
    public final Runnable A12;
    public final ArrayList A13;
    public final ArrayList A14;
    public final List A15;
    public final int[] A16;
    public final int[] A17;
    public final int[] A18;
    public final int[] A19;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 23) {
            z = true;
        }
        A1B = z;
        Class cls = Integer.TYPE;
        A1D = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public void A0T() {
        C04690Qg r0;
        setScrollState(0);
        C13230mq r1 = this.A0z;
        r1.A06.removeCallbacks(r1);
        r1.A03.abortAnimation();
        C06440Xs r02 = this.A0S;
        if (r02 != null && (r0 = r02.A06) != null) {
            r0.A01();
        }
    }

    public void A0f(int i, int i2) {
        A0h(i, i2, false);
    }

    public void A0h(int i, int i2, boolean z) {
        C06440Xs r1 = this.A0S;
        if (r1 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.A0m) {
            int i3 = 0;
            if (!r1.A17()) {
                i = 0;
            }
            if (!r1.A18()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (z) {
                    if (i != 0) {
                        i3 = 1;
                    }
                    if (i2 != 0) {
                        i3 |= 2;
                    }
                    getScrollingChildHelper().A05(i3, 1);
                }
                this.A0z.A01((Interpolator) null, i, i2, Integer.MIN_VALUE);
            }
        }
    }

    public final void A0l(View view, View view2) {
        View view3 = view;
        View view4 = view;
        if (view2 != null) {
            view4 = view2;
        }
        Rect rect = this.A0s;
        rect.set(0, 0, view4.getWidth(), view4.getHeight());
        ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
        if (layoutParams instanceof C002102g) {
            C002102g r1 = (C002102g) layoutParams;
            if (!r1.A01) {
                Rect rect2 = r1.A03;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.A0S.A1C(rect, view3, this, !this.A0g, AnonymousClass000.A1X(view2));
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.A0S.A1C(rect, view, this, z, false);
    }

    public void setAdapter(AnonymousClass0R6 r3) {
        suppressLayout(false);
        A0m(r3, false, true);
        A0v(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C15200qw r2) {
        if (r2 != null) {
            this.A0O = r2;
            setChildrenDrawingOrderEnabled(true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: java.lang.NoSuchMethodException} */
    /* JADX WARNING: type inference failed for: r1v16, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r1v26 */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x01f8 A[Catch:{ NoSuchMethodException -> 0x0239, ClassNotFoundException -> 0x0295, InvocationTargetException -> 0x0282, InstantiationException -> 0x026f, IllegalAccessException -> 0x025e, ClassCastException -> 0x024d }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x020b A[Catch:{ NoSuchMethodException -> 0x0239, ClassNotFoundException -> 0x0295, InvocationTargetException -> 0x0282, InstantiationException -> 0x026f, IllegalAccessException -> 0x025e, ClassCastException -> 0x024d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecyclerView(android.content.Context r24, android.util.AttributeSet r25, int r26) {
        /*
            r23 = this;
            r6 = r23
            r9 = r24
            r8 = r25
            r7 = r26
            r6.<init>(r9, r8, r7)
            X.09K r0 = new X.09K
            r0.<init>(r6)
            r6.A0x = r0
            X.0Qz r0 = new X.0Qz
            r0.<init>(r6)
            r6.A0w = r0
            X.0Qd r0 = new X.0Qd
            r0.<init>()
            r6.A11 = r0
            X.0j2 r0 = new X.0j2
            r0.<init>(r6)
            r6.A12 = r0
            android.graphics.Rect r0 = X.AnonymousClass001.A0N()
            r6.A0s = r0
            android.graphics.Rect r0 = X.AnonymousClass001.A0N()
            r6.A0t = r0
            android.graphics.RectF r0 = X.AnonymousClass002.A07()
            r6.A0u = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r6.A13 = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r6.A14 = r0
            r5 = 0
            r6.A06 = r5
            r6.A0e = r5
            r6.A0f = r5
            r6.A09 = r5
            r6.A02 = r5
            X.0Ia r0 = new X.0Ia
            r0.<init>()
            r6.A0P = r0
            X.09l r0 = new X.09l
            r0.<init>()
            r6.A0R = r0
            r6.A0B = r5
            r1 = -1
            r6.A0A = r1
            r0 = 1
            r6.A00 = r0
            r6.A01 = r0
            r4 = 1
            r6.A0p = r4
            X.0mq r0 = new X.0mq
            r0.<init>(r6)
            r6.A0z = r0
            X.0ee r0 = new X.0ee
            r0.<init>()
            r6.A0L = r0
            X.0Q1 r0 = new X.0Q1
            r0.<init>()
            r6.A0y = r0
            r6.A0k = r5
            r6.A0l = r5
            X.0ed r0 = new X.0ed
            r0.<init>(r6)
            r6.A0Q = r0
            r6.A0o = r5
            r3 = 2
            int[] r0 = new int[r3]
            r6.A16 = r0
            int[] r0 = new int[r3]
            r6.A19 = r0
            int[] r0 = new int[r3]
            r6.A17 = r0
            int[] r0 = new int[r3]
            r6.A18 = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r6.A15 = r0
            X.0j3 r0 = new X.0j3
            r0.<init>(r6)
            r6.A0Z = r0
            X.0ei r0 = new X.0ei
            r0.<init>(r6)
            r6.A10 = r0
            r6.setScrollContainer(r4)
            r6.setFocusableInTouchMode(r4)
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r9)
            int r0 = r2.getScaledTouchSlop()
            r6.A0C = r0
            float r0 = X.C06500Xy.A01(r9, r2)
            r6.A00 = r0
            float r0 = X.C06500Xy.A02(r9, r2)
            r6.A01 = r0
            int r0 = r2.getScaledMinimumFlingVelocity()
            r6.A0r = r0
            int r0 = r2.getScaledMaximumFlingVelocity()
            r6.A0q = r0
            int r0 = r6.getOverScrollMode()
            boolean r0 = X.AnonymousClass000.A1U(r0, r3)
            r6.setWillNotDraw(r0)
            X.0UY r2 = r6.A0R
            X.0qx r0 = r6.A0Q
            r2.A04 = r0
            X.0eW r2 = new X.0eW
            r2.<init>(r6)
            X.0ec r0 = new X.0ec
            r0.<init>(r2)
            r6.A0J = r0
            X.0eY r2 = new X.0eY
            r2.<init>(r6)
            X.0R0 r0 = new X.0R0
            r0.<init>(r2)
            r6.A0K = r0
            int r0 = X.C06560Yg.A00(r6)
            if (r0 != 0) goto L_0x010e
            r0 = 8
            X.C06560Yg.A0M(r6, r0)
        L_0x010e:
            int r0 = X.AnonymousClass0YY.A00(r6)
            if (r0 != 0) goto L_0x0117
            X.AnonymousClass0YY.A06(r6, r4)
        L_0x0117:
            android.content.Context r2 = r6.getContext()
            java.lang.String r0 = "accessibility"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r6.A0v = r0
            X.063 r0 = new X.063
            r0.<init>(r6)
            r6.setAccessibilityDelegateCompat(r0)
            int[] r0 = X.AnonymousClass0JZ.A00
            android.content.res.TypedArray r3 = r9.obtainStyledAttributes(r8, r0, r7, r5)
            int r10 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r10 < r2) goto L_0x0145
            r11 = r6
            r12 = r9
            r13 = r0
            r14 = r8
            r15 = r3
            r16 = r7
            r17 = r5
            r11.saveAttributeDataForStyleable(r12, r13, r14, r15, r16, r17)
        L_0x0145:
            r0 = 8
            java.lang.String r13 = r3.getString(r0)
            r0 = 2
            int r0 = r3.getInt(r0, r1)
            if (r0 != r1) goto L_0x0157
            r0 = 262144(0x40000, float:3.67342E-40)
            r6.setDescendantFocusability(r0)
        L_0x0157:
            boolean r0 = r3.getBoolean(r4, r4)
            r6.A0d = r0
            r0 = 3
            boolean r0 = r3.getBoolean(r0, r5)
            if (r0 == 0) goto L_0x01ac
            r0 = 6
            android.graphics.drawable.Drawable r1 = r3.getDrawable(r0)
            android.graphics.drawable.StateListDrawable r1 = (android.graphics.drawable.StateListDrawable) r1
            r0 = 7
            android.graphics.drawable.Drawable r15 = r3.getDrawable(r0)
            r0 = 4
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            android.graphics.drawable.StateListDrawable r0 = (android.graphics.drawable.StateListDrawable) r0
            r11 = 5
            android.graphics.drawable.Drawable r16 = r3.getDrawable(r11)
            if (r1 == 0) goto L_0x02c4
            if (r15 == 0) goto L_0x02c4
            if (r0 == 0) goto L_0x02c4
            if (r16 == 0) goto L_0x02c4
            android.content.Context r11 = r6.getContext()
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2131166535(0x7f070547, float:1.7947318E38)
            int r20 = r11.getDimensionPixelSize(r12)
            r12 = 2131166537(0x7f070549, float:1.7947322E38)
            int r21 = r11.getDimensionPixelSize(r12)
            r12 = 2131166536(0x7f070548, float:1.794732E38)
            int r22 = r11.getDimensionPixelOffset(r12)
            X.09U r14 = new X.09U
            r19 = r6
            r18 = r0
            r17 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x01ac:
            r3.recycle()
            java.lang.String r11 = ": Could not instantiate the LayoutManager: "
            if (r13 == 0) goto L_0x02a6
            java.lang.String r3 = r13.trim()
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x02a6
            char r0 = r3.charAt(r5)
            r1 = 46
            if (r0 != r1) goto L_0x01d5
            java.lang.StringBuilder r12 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r9.getPackageName()
            r12.append(r0)
        L_0x01d0:
            java.lang.String r3 = X.AnonymousClass000.A0X(r3, r12)
            goto L_0x01f2
        L_0x01d5:
            java.lang.String r0 = "."
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x01f2
            java.lang.StringBuilder r12 = X.AnonymousClass001.A0o()
            java.lang.Class<androidx.recyclerview.widget.RecyclerView> r0 = androidx.recyclerview.widget.RecyclerView.class
            java.lang.Package r0 = r0.getPackage()
            java.lang.String r0 = r0.getName()
            r12.append(r0)
            r12.append(r1)
            goto L_0x01d0
        L_0x01f2:
            boolean r0 = r6.isInEditMode()     // Catch:{ ClassNotFoundException -> 0x0295, InvocationTargetException -> 0x0282, InstantiationException -> 0x026f, IllegalAccessException -> 0x025e, ClassCastException -> 0x024d }
            if (r0 == 0) goto L_0x020b
            java.lang.Class r0 = r6.getClass()     // Catch:{ ClassNotFoundException -> 0x0295, InvocationTargetException -> 0x0282, InstantiationException -> 0x026f, IllegalAccessException -> 0x025e, ClassCastException -> 0x024d }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0295, InvocationTargetException -> 0x0282, InstantiationException -> 0x026f, IllegalAccessException -> 0x025e, ClassCastException -> 0x024d }
        L_0x0200:
            java.lang.Class r1 = java.lang.Class.forName(r3, r5, r0)     // Catch:{ ClassNotFoundException -> 0x0295, InvocationTargetException -> 0x0282, InstantiationException -> 0x026f, IllegalAccessException -> 0x025e, ClassCastException -> 0x024d }
            java.lang.Class<X.0Xs> r0 = X.C06440Xs.class
            java.lang.Class r12 = r1.asSubclass(r0)     // Catch:{ ClassNotFoundException -> 0x0295, InvocationTargetException -> 0x0282, InstantiationException -> 0x026f, IllegalAccessException -> 0x025e, ClassCastException -> 0x024d }
            goto L_0x0210
        L_0x020b:
            java.lang.ClassLoader r0 = r9.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0295, InvocationTargetException -> 0x0282, InstantiationException -> 0x026f, IllegalAccessException -> 0x025e, ClassCastException -> 0x024d }
            goto L_0x0200
        L_0x0210:
            java.lang.Class[] r0 = A1D     // Catch:{ NoSuchMethodException -> 0x0224 }
            java.lang.reflect.Constructor r1 = r12.getConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x0224 }
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ NoSuchMethodException -> 0x0224 }
            r0[r5] = r24     // Catch:{ NoSuchMethodException -> 0x0224 }
            r0[r4] = r25     // Catch:{ NoSuchMethodException -> 0x0224 }
            X.AnonymousClass000.A1N(r0, r7)     // Catch:{ NoSuchMethodException -> 0x0224 }
            X.AnonymousClass000.A1O(r0, r5)     // Catch:{ NoSuchMethodException -> 0x0224 }
            goto L_0x022c
        L_0x0224:
            r1 = move-exception
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x0239 }
            java.lang.reflect.Constructor r1 = r12.getConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x0239 }
            r0 = 0
        L_0x022c:
            r1.setAccessible(r4)     // Catch:{ ClassNotFoundException -> 0x0295, InvocationTargetException -> 0x0282, InstantiationException -> 0x026f, IllegalAccessException -> 0x025e, ClassCastException -> 0x024d }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x0295, InvocationTargetException -> 0x0282, InstantiationException -> 0x026f, IllegalAccessException -> 0x025e, ClassCastException -> 0x024d }
            X.0Xs r0 = (X.C06440Xs) r0     // Catch:{ ClassNotFoundException -> 0x0295, InvocationTargetException -> 0x0282, InstantiationException -> 0x026f, IllegalAccessException -> 0x025e, ClassCastException -> 0x024d }
            r6.setLayoutManager(r0)     // Catch:{ ClassNotFoundException -> 0x0295, InvocationTargetException -> 0x0282, InstantiationException -> 0x026f, IllegalAccessException -> 0x025e, ClassCastException -> 0x024d }
            goto L_0x02a6
        L_0x0239:
            r2 = move-exception
            r2.initCause(r1)     // Catch:{ ClassNotFoundException -> 0x0295, InvocationTargetException -> 0x0282, InstantiationException -> 0x026f, IllegalAccessException -> 0x025e, ClassCastException -> 0x024d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0i(r8)     // Catch:{ ClassNotFoundException -> 0x0295, InvocationTargetException -> 0x0282, InstantiationException -> 0x026f, IllegalAccessException -> 0x025e, ClassCastException -> 0x024d }
            java.lang.String r0 = ": Error creating LayoutManager "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r3, r1)     // Catch:{ ClassNotFoundException -> 0x0295, InvocationTargetException -> 0x0282, InstantiationException -> 0x026f, IllegalAccessException -> 0x025e, ClassCastException -> 0x024d }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x0295, InvocationTargetException -> 0x0282, InstantiationException -> 0x026f, IllegalAccessException -> 0x025e, ClassCastException -> 0x024d }
            r0.<init>(r1, r2)     // Catch:{ ClassNotFoundException -> 0x0295, InvocationTargetException -> 0x0282, InstantiationException -> 0x026f, IllegalAccessException -> 0x025e, ClassCastException -> 0x024d }
            throw r0     // Catch:{ ClassNotFoundException -> 0x0295, InvocationTargetException -> 0x0282, InstantiationException -> 0x026f, IllegalAccessException -> 0x025e, ClassCastException -> 0x024d }
        L_0x024d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0i(r8)
            java.lang.String r0 = ": Class is not a LayoutManager "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r3, r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x025e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0i(r8)
            java.lang.String r0 = ": Cannot access non-public constructor "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r3, r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x026f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r8.getPositionDescription()
            java.lang.String r1 = X.AnonymousClass000.A0U(r0, r11, r3, r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x0282:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r8.getPositionDescription()
            java.lang.String r1 = X.AnonymousClass000.A0U(r0, r11, r3, r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x0295:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0i(r8)
            java.lang.String r0 = ": Unable to find LayoutManager "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r3, r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x02a6:
            int[] r0 = A1C
            android.content.res.TypedArray r1 = r9.obtainStyledAttributes(r8, r0, r7, r5)
            if (r10 < r2) goto L_0x02b9
            r10 = r6
            r11 = r9
            r12 = r0
            r13 = r8
            r14 = r1
            r15 = r7
            r16 = r5
            r10.saveAttributeDataForStyleable(r11, r12, r13, r14, r15, r16)
        L_0x02b9:
            boolean r0 = r1.getBoolean(r5, r4)
            r1.recycle()
            r6.setNestedScrollingEnabled(r0)
            return
        L_0x02c4:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Trying to set fast scroller without both required drawables."
            r1.append(r0)
            java.lang.String r0 = r6.A0I()
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static C05570Ua A02(View view) {
        if (view == null) {
            return null;
        }
        return AnonymousClass001.A0Y(view).A00;
    }

    public static RecyclerView A03(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView A032 = A03(viewGroup.getChildAt(i));
                if (A032 != null) {
                    return A032;
                }
            }
        }
        return null;
    }

    private void A04() {
        boolean z;
        VelocityTracker velocityTracker = this.A0D;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        A0b(0);
        EdgeEffect edgeEffect = this.A0F;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.A0F.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.A0H;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.A0H.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A0G;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.A0G.isFinished();
        }
        EdgeEffect edgeEffect4 = this.A0E;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.A0E.isFinished();
        }
        if (z) {
            AnonymousClass0YY.A05(this);
        }
    }

    public static void A07(C05570Ua r3) {
        WeakReference weakReference = r3.A0D;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                View view = (View) obj;
                while (true) {
                    if (view == null) {
                        r3.A0D = null;
                        return;
                    } else if (view != r3.A0H) {
                        obj = view.getParent();
                        if (!(obj instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private C04680Qf getScrollingChildHelper() {
        C04680Qf r0 = this.A0I;
        if (r0 != null) {
            return r0;
        }
        C04680Qf r02 = new C04680Qf(this);
        this.A0I = r02;
        return r02;
    }

    public int A0B(C05570Ua r9) {
        if ((524 & r9.A00) == 0 && r9.A06()) {
            C08520ec r0 = this.A0J;
            int i = r9.A05;
            ArrayList arrayList = r0.A04;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                AnonymousClass0Pd r7 = (AnonymousClass0Pd) arrayList.get(i2);
                int i3 = r7.A00;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = r7.A02;
                        if (i4 <= i) {
                            int i5 = r7.A01;
                            int i6 = i;
                            i -= i5;
                            if (i4 + i5 > i6) {
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i7 = r7.A02;
                        if (i7 == i) {
                            i = r7.A01;
                        } else {
                            if (i7 < i) {
                                i--;
                            }
                            if (r7.A01 <= i) {
                                i++;
                            }
                        }
                    }
                } else if (r7.A02 <= i) {
                    i += r7.A01;
                }
            }
            return i;
        }
        return -1;
    }

    public View A0D(float f, float f2) {
        AnonymousClass0R0 r2 = this.A0K;
        int A012 = r2.A01();
        while (true) {
            A012--;
            if (A012 < 0) {
                return null;
            }
            View A052 = r2.A05(A012);
            float translationX = A052.getTranslationX();
            float translationY = A052.getTranslationY();
            if (f >= ((float) A052.getLeft()) + translationX && f <= ((float) A052.getRight()) + translationX && f2 >= ((float) A052.getTop()) + translationY && f2 <= ((float) A052.getBottom()) + translationY) {
                return A052;
            }
        }
    }

    public C05570Ua A0F(int i) {
        C05570Ua r1 = null;
        if (!this.A0e) {
            AnonymousClass0R0 r5 = this.A0K;
            int A022 = r5.A02();
            for (int i2 = 0; i2 < A022; i2++) {
                C05570Ua A002 = AnonymousClass0R0.A00(r5, i2);
                if (A002 != null && !AnonymousClass000.A1S(A002.A00 & 8) && A0B(A002) == i) {
                    if (!r5.A02.contains(A002.A0H)) {
                        return A002;
                    }
                    r1 = A002;
                }
            }
        }
        return r1;
    }

    public C05570Ua A0G(int i, boolean z) {
        int i2;
        AnonymousClass0R0 r6 = this.A0K;
        int A022 = r6.A02();
        C05570Ua r4 = null;
        for (int i3 = 0; i3 < A022; i3++) {
            C05570Ua A002 = AnonymousClass0R0.A00(r6, i3);
            if (A002 != null && !AnonymousClass000.A1S(A002.A00 & 8)) {
                if (z || (i2 = A002.A06) == -1) {
                    i2 = A002.A05;
                }
                if (i2 == i) {
                    if (!r6.A02.contains(A002.A0H)) {
                        return A002;
                    }
                    r4 = A002;
                } else {
                    continue;
                }
            }
        }
        return r4;
    }

    public void A0J() {
        if (this.A0g && !this.A0e) {
            C08520ec r5 = this.A0J;
            ArrayList arrayList = r5.A04;
            if (arrayList.size() > 0) {
                int i = r5.A00;
                if ((4 & i) != 0 && (11 & i) == 0) {
                    AnonymousClass0RZ.A01("RV PartialInvalidate");
                    A0S();
                    this.A09++;
                    r5.A04();
                    if (!this.A0n) {
                        AnonymousClass0R0 r4 = this.A0K;
                        int A012 = r4.A01();
                        int i2 = 0;
                        while (true) {
                            if (i2 < A012) {
                                C05570Ua A022 = A02(r4.A05(i2));
                                if (A022 != null && !AnonymousClass000.A1S(A022.A00 & 128) && (A022.A00 & 2) != 0) {
                                    A0K();
                                    break;
                                }
                                i2++;
                            } else {
                                r5.A02();
                                break;
                            }
                        }
                    }
                    A0w(true);
                    A0u(true);
                    AnonymousClass0RZ.A00();
                } else if (arrayList.size() <= 0) {
                    return;
                }
            } else {
                return;
            }
        }
        AnonymousClass0RZ.A01("RV FullInvalidate");
        A0K();
        AnonymousClass0RZ.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03f1, code lost:
        if (r5.A0K.A02.contains(getFocusedChild()) == false) goto L_0x03d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0430, code lost:
        if (r1 != null) goto L_0x0432;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0440, code lost:
        if (r6.hasFocusable() != false) goto L_0x047e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x047e, code lost:
        r3 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0483, code lost:
        if (((long) r3) == -1) goto L_0x0492;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0485, code lost:
        r1 = r6.findViewById(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0489, code lost:
        if (r1 == null) goto L_0x0492;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x048f, code lost:
        if (r1.isFocusable() == false) goto L_0x0492;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0491, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0492, code lost:
        r6.requestFocus();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a1, code lost:
        if ((r2.A00 & 1) != 0) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b0, code lost:
        if ((r2.A00 & 1) != 0) goto L_0x00b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x040c  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x043c  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0430 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0K() {
        /*
            r22 = this;
            r5 = r22
            X.0R6 r0 = r5.A0N
            java.lang.String r7 = "RecyclerView"
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "No adapter attached; skipping layout"
        L_0x000a:
            android.util.Log.e(r7, r0)
            return
        L_0x000e:
            X.0Xs r2 = r5.A0S
            if (r2 != 0) goto L_0x0015
            java.lang.String r0 = "No layout manager attached; skipping layout"
            goto L_0x000a
        L_0x0015:
            X.0Q1 r4 = r5.A0y
            r0 = 0
            r4.A09 = r0
            int r1 = r4.A04
            r0 = 1
            if (r1 != r0) goto L_0x01b4
            r5.A0U()
        L_0x0022:
            X.0Xs r3 = r5.A0S
            int r0 = r5.getWidth()
            r2 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r0 = r5.getHeight()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            r3.A0a(r1, r0)
            r5.A0V()
        L_0x003c:
            r0 = 4
            r4.A01(r0)
            r5.A0S()
            int r0 = r5.A09
            int r0 = r0 + 1
            r5.A09 = r0
            r6 = 1
            r4.A04 = r6
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x035c
            X.0R0 r9 = r5.A0K
            int r8 = r9.A01()
            int r8 = r8 - r6
        L_0x0057:
            if (r8 < 0) goto L_0x0204
            android.view.View r0 = r9.A05(r8)
            X.0Ua r10 = A02(r0)
            int r0 = r10.A00
            r0 = r0 & 128(0x80, float:1.794E-43)
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 != 0) goto L_0x00cf
            X.0R6 r0 = r5.A0N
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x01af
            long r0 = r10.A08
        L_0x0073:
            X.0NE r3 = new X.0NE
            r3.<init>()
            r3.A00(r10)
            X.0Qd r13 = r5.A11
            X.0i7 r2 = r13.A00
            java.lang.Object r11 = X.C10550i7.A00(r2, r0)
            X.0Ua r11 = (X.C05570Ua) r11
            if (r11 == 0) goto L_0x00b6
            int r2 = r11.A00
            r2 = r2 & 128(0x80, float:1.794E-43)
            boolean r2 = X.AnonymousClass000.A1S(r2)
            if (r2 != 0) goto L_0x00b6
            X.0Wz r14 = r13.A01
            java.lang.Object r2 = r14.get(r11)
            X.0TA r2 = (X.AnonymousClass0TA) r2
            if (r2 == 0) goto L_0x01ab
            int r2 = r2.A00
            r16 = 1
            r2 = r2 & 1
            if (r2 == 0) goto L_0x01ab
        L_0x00a3:
            java.lang.Object r2 = r14.get(r10)
            X.0TA r2 = (X.AnonymousClass0TA) r2
            if (r2 == 0) goto L_0x01a8
            int r2 = r2.A00
            r15 = 1
            r2 = r2 & 1
            if (r2 == 0) goto L_0x01a8
        L_0x00b2:
            if (r16 == 0) goto L_0x00d2
            if (r11 != r10) goto L_0x00d2
        L_0x00b6:
            X.0Wz r0 = r13.A01
            java.lang.Object r1 = r0.get(r10)
            X.0TA r1 = (X.AnonymousClass0TA) r1
            if (r1 != 0) goto L_0x00c7
            X.0TA r1 = X.AnonymousClass0TA.A00()
            r0.put(r10, r1)
        L_0x00c7:
            r1.A01 = r3
            int r0 = r1.A00
            r0 = r0 | 8
            r1.A00 = r0
        L_0x00cf:
            int r8 = r8 + -1
            goto L_0x0057
        L_0x00d2:
            r2 = 4
            X.0NE r2 = r13.A00(r11, r2)
            java.lang.Object r12 = r14.get(r10)
            X.0TA r12 = (X.AnonymousClass0TA) r12
            if (r12 != 0) goto L_0x00e6
            X.0TA r12 = X.AnonymousClass0TA.A00()
            r14.put(r10, r12)
        L_0x00e6:
            r12.A01 = r3
            int r3 = r12.A00
            r3 = r3 | 8
            r12.A00 = r3
            r3 = 8
            X.0NE r3 = r13.A00(r10, r3)
            if (r2 != 0) goto L_0x014f
            int r15 = r9.A01()
            r14 = 0
        L_0x00fb:
            if (r14 >= r15) goto L_0x0133
            android.view.View r2 = r9.A05(r14)
            X.0Ua r13 = A02(r2)
            if (r13 == r10) goto L_0x0130
            X.0R6 r2 = r5.A0N
            boolean r12 = r2.A00
            if (r12 == 0) goto L_0x012c
            long r2 = r13.A08
        L_0x010f:
            int r16 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r16 != 0) goto L_0x0130
            java.lang.String r2 = " \n View Holder 2:"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            if (r12 == 0) goto L_0x01f3
            java.lang.String r0 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            X.AnonymousClass000.A17(r13, r0, r2, r1)
            r1.append(r10)
            java.lang.String r0 = r5.A0I()
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0I(r0, r1)
            throw r0
        L_0x012c:
            int r2 = r13.A05
            long r2 = (long) r2
            goto L_0x010f
        L_0x0130:
            int r14 = r14 + 1
            goto L_0x00fb
        L_0x0133:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = " cannot be found but it is necessary for "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r5.A0I()
            X.AnonymousClass000.A1D(r0, r7, r1)
            goto L_0x00cf
        L_0x014f:
            r1 = 0
            r11.A05(r1)
            if (r16 == 0) goto L_0x0158
            r5.A0s(r11)
        L_0x0158:
            if (r11 == r10) goto L_0x016e
            if (r15 == 0) goto L_0x015f
            r5.A0s(r10)
        L_0x015f:
            r11.A0A = r10
            r5.A0s(r11)
            X.0Qz r0 = r5.A0w
            r0.A09(r11)
            r10.A05(r1)
            r10.A0B = r11
        L_0x016e:
            X.0UY r13 = r5.A0R
            X.09N r13 = (X.AnonymousClass09N) r13
            int r12 = r2.A00
            int r2 = r2.A01
            int r0 = r10.A00
            r0 = r0 & 128(0x80, float:1.794E-43)
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 == 0) goto L_0x01a3
            r1 = r2
            r0 = r12
        L_0x0182:
            r14 = r11
            r15 = r10
            r16 = r12
            r17 = r2
            r18 = r0
            r19 = r1
            boolean r0 = r13.A0F(r14, r15, r16, r17, r18, r19)
            if (r0 == 0) goto L_0x00cf
            boolean r0 = r5.A0o
            if (r0 != 0) goto L_0x00cf
            boolean r0 = r5.A0j
            if (r0 == 0) goto L_0x00cf
            java.lang.Runnable r0 = r5.A0Z
            X.AnonymousClass0YY.A07(r5, r0)
            r5.A0o = r6
            goto L_0x00cf
        L_0x01a3:
            int r0 = r3.A00
            int r1 = r3.A01
            goto L_0x0182
        L_0x01a8:
            r15 = 0
            goto L_0x00b2
        L_0x01ab:
            r16 = 0
            goto L_0x00a3
        L_0x01af:
            int r0 = r10.A05
            long r0 = (long) r0
            goto L_0x0073
        L_0x01b4:
            X.0ec r1 = r5.A0J
            java.util.ArrayList r0 = r1.A05
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01c8
            java.util.ArrayList r0 = r1.A04
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01c8
            goto L_0x0022
        L_0x01c8:
            int r1 = r2.A03
            int r0 = r5.getWidth()
            if (r1 != r0) goto L_0x0022
            X.0Xs r0 = r5.A0S
            int r1 = r0.A00
            int r0 = r5.getHeight()
            if (r1 != r0) goto L_0x0022
            X.0Xs r3 = r5.A0S
            int r0 = r5.getWidth()
            r2 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r0 = r5.getHeight()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            r3.A0a(r1, r0)
            goto L_0x003c
        L_0x01f3:
            java.lang.String r0 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            X.AnonymousClass000.A17(r13, r0, r2, r1)
            r1.append(r10)
            java.lang.String r0 = r5.A0I()
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0I(r0, r1)
            throw r0
        L_0x0204:
            X.0Qd r0 = r5.A11
            X.0qy r9 = r5.A10
            X.0Wz r8 = r0.A01
            int r7 = r8.size()
        L_0x020e:
            int r7 = r7 + -1
            if (r7 < 0) goto L_0x035c
            java.lang.Object[] r1 = r8.A02
            int r0 = r7 << 1
            r12 = r1[r0]
            X.0Ua r12 = (X.C05570Ua) r12
            java.lang.Object r3 = r8.A07(r7)
            X.0TA r3 = (X.AnonymousClass0TA) r3
            int r2 = r3.A00
            r1 = r2 & 3
            r0 = 3
            if (r1 == r0) goto L_0x0349
            r0 = r2 & 1
            if (r0 == 0) goto L_0x02ac
            X.0NE r10 = r3.A02
            if (r10 == 0) goto L_0x0349
            X.0NE r1 = r3.A01
        L_0x0231:
            r0 = r9
            X.0ei r0 = (X.C08580ei) r0
            androidx.recyclerview.widget.RecyclerView r2 = r0.A00
            X.0Qz r0 = r2.A0w
            r0.A09(r12)
            r2.A0s(r12)
            r0 = 0
            r12.A05(r0)
            X.0UY r13 = r2.A0R
            X.09N r13 = (X.AnonymousClass09N) r13
            int r0 = r10.A00
            r19 = r0
            int r14 = r10.A01
            android.view.View r11 = r12.A0H
            if (r1 != 0) goto L_0x02a7
            int r10 = r11.getLeft()
            int r1 = r11.getTop()
        L_0x0258:
            int r0 = r12.A00
            r0 = r0 & 8
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 != 0) goto L_0x02a2
            r0 = r19
            if (r0 != r10) goto L_0x0268
            if (r14 == r1) goto L_0x02a2
        L_0x0268:
            int r15 = r11.getWidth()
            int r15 = r15 + r10
            int r0 = r11.getHeight()
            int r0 = r0 + r1
            r11.layout(r10, r1, r15, r0)
            r16 = r14
            r17 = r10
            r18 = r1
            r15 = r19
            r14 = r12
            boolean r0 = r13.A0E(r14, r15, r16, r17, r18)
        L_0x0282:
            if (r0 == 0) goto L_0x0293
            boolean r0 = r2.A0o
            if (r0 != 0) goto L_0x0293
            boolean r0 = r2.A0j
            if (r0 == 0) goto L_0x0293
            java.lang.Runnable r0 = r2.A0Z
            X.AnonymousClass0YY.A07(r2, r0)
            r2.A0o = r6
        L_0x0293:
            r0 = 0
            r3.A00 = r0
            r0 = 0
            r3.A02 = r0
            r3.A01 = r0
            X.0tf r0 = X.AnonymousClass0TA.A03
            r0.Bio(r3)
            goto L_0x020e
        L_0x02a2:
            boolean r0 = r13.A0D(r12)
            goto L_0x0282
        L_0x02a7:
            int r10 = r1.A00
            int r1 = r1.A01
            goto L_0x0258
        L_0x02ac:
            r1 = r2 & 14
            r0 = 14
            if (r1 == r0) goto L_0x0310
            r1 = r2 & 12
            r0 = 12
            if (r1 != r0) goto L_0x0303
            X.0NE r10 = r3.A02
            X.0NE r11 = r3.A01
            r1 = r9
            X.0ei r1 = (X.C08580ei) r1
            r0 = 0
            r12.A05(r0)
            androidx.recyclerview.widget.RecyclerView r2 = r1.A00
            boolean r0 = r2.A0e
            X.0UY r15 = r2.A0R
            X.09N r15 = (X.AnonymousClass09N) r15
            if (r0 == 0) goto L_0x02f3
            int r13 = r10.A00
            int r10 = r10.A01
            int r0 = r12.A00
            r0 = r0 & 128(0x80, float:1.794E-43)
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 == 0) goto L_0x02ee
            r1 = r10
            r0 = r13
        L_0x02dd:
            r16 = r12
            r19 = r10
            r20 = r0
            r21 = r1
            r17 = r12
            r18 = r13
            boolean r0 = r15.A0F(r16, r17, r18, r19, r20, r21)
            goto L_0x0282
        L_0x02ee:
            int r0 = r11.A00
            int r1 = r11.A01
            goto L_0x02dd
        L_0x02f3:
            int r14 = r10.A00
            int r13 = r11.A00
            if (r14 != r13) goto L_0x032f
            int r1 = r10.A01
            int r0 = r11.A01
            if (r1 != r0) goto L_0x032f
            r15.A02(r12)
            goto L_0x0293
        L_0x0303:
            r0 = r2 & 4
            if (r0 == 0) goto L_0x030c
            X.0NE r10 = r3.A02
            r1 = 0
            goto L_0x0231
        L_0x030c:
            r0 = r2 & 8
            if (r0 == 0) goto L_0x0293
        L_0x0310:
            X.0NE r10 = r3.A02
            X.0NE r11 = r3.A01
            r0 = r9
            X.0ei r0 = (X.C08580ei) r0
            androidx.recyclerview.widget.RecyclerView r2 = r0.A00
            r0 = 0
            r12.A05(r0)
            X.0UY r15 = r2.A0R
            X.09N r15 = (X.AnonymousClass09N) r15
            if (r10 == 0) goto L_0x0343
            int r14 = r10.A00
            int r13 = r11.A00
            if (r14 != r13) goto L_0x032f
            int r1 = r10.A01
            int r0 = r11.A01
            if (r1 == r0) goto L_0x0343
        L_0x032f:
            int r1 = r10.A01
            int r0 = r11.A01
            r16 = r12
            r17 = r14
            r18 = r1
            r19 = r13
            r20 = r0
            boolean r0 = r15.A0E(r16, r17, r18, r19, r20)
            goto L_0x0282
        L_0x0343:
            boolean r0 = r15.A0C(r12)
            goto L_0x0282
        L_0x0349:
            r0 = r9
            X.0ei r0 = (X.C08580ei) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A00
            X.0Xs r2 = r0.A0S
            android.view.View r1 = r12.A0H
            X.0Qz r0 = r0.A0w
            r2.A0g(r1)
            r0.A06(r1)
            goto L_0x0293
        L_0x035c:
            X.0Xs r0 = r5.A0S
            X.0Qz r2 = r5.A0w
            r0.A0t(r2)
            int r0 = r4.A03
            r4.A05 = r0
            r7 = 0
            r5.A0e = r7
            r5.A0f = r7
            r4.A0B = r7
            r4.A0A = r7
            X.0Xs r1 = r5.A0S
            r1.A0D = r7
            java.util.ArrayList r0 = r2.A04
            if (r0 == 0) goto L_0x037b
            r0.clear()
        L_0x037b:
            boolean r0 = r1.A0C
            if (r0 == 0) goto L_0x0386
            r1.A02 = r7
            r1.A0C = r7
            r2.A04()
        L_0x0386:
            X.0Xs r0 = r5.A0S
            r0.A0y(r4)
            r5.A0u(r6)
            r5.A0w(r7)
            X.0Qd r1 = r5.A11
            X.0Wz r0 = r1.A01
            r0.clear()
            X.0i7 r0 = r1.A00
            r0.A06()
            int[] r3 = r5.A16
            r2 = r3[r7]
            r1 = r3[r6]
            r5.A0x(r3)
            r0 = r3[r7]
            if (r0 != r2) goto L_0x03ae
            r0 = r3[r6]
            if (r0 == r1) goto L_0x03b1
        L_0x03ae:
            r5.A0e(r7, r7)
        L_0x03b1:
            boolean r0 = r5.A0p
            if (r0 == 0) goto L_0x03d5
            X.0R6 r0 = r5.A0N
            if (r0 == 0) goto L_0x03d5
            boolean r0 = r5.hasFocus()
            if (r0 == 0) goto L_0x03d5
            int r1 = r5.getDescendantFocusability()
            r0 = 393216(0x60000, float:5.51013E-40)
            if (r1 == r0) goto L_0x03d5
            int r1 = r5.getDescendantFocusability()
            r0 = 131072(0x20000, float:1.83671E-40)
            if (r1 != r0) goto L_0x03df
            boolean r0 = r5.isFocused()
            if (r0 == 0) goto L_0x03df
        L_0x03d5:
            r0 = -1
            r4.A07 = r0
            r0 = -1
            r4.A01 = r0
            r4.A02 = r0
            return
        L_0x03df:
            boolean r0 = r5.isFocused()
            if (r0 != 0) goto L_0x03f4
            android.view.View r1 = r5.getFocusedChild()
            X.0R0 r0 = r5.A0K
            java.util.List r0 = r0.A02
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x03f4
            goto L_0x03d5
        L_0x03f4:
            long r2 = r4.A07
            r12 = -1
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0442
            X.0R6 r0 = r5.A0N
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0442
            r1 = 0
            X.0R0 r10 = r5.A0K
            int r11 = r10.A02()
            r9 = 0
        L_0x040a:
            if (r9 >= r11) goto L_0x0430
            X.0Ua r8 = X.AnonymousClass0R0.A00(r10, r9)
            if (r8 == 0) goto L_0x042d
            int r0 = r8.A00
            r0 = r0 & 8
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 != 0) goto L_0x042d
            long r6 = r8.A08
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x042d
            android.view.View r1 = r8.A0H
            java.util.List r0 = r10.A02
            boolean r0 = r0.contains(r1)
            r1 = r8
            if (r0 == 0) goto L_0x0432
        L_0x042d:
            int r9 = r9 + 1
            goto L_0x040a
        L_0x0430:
            if (r1 == 0) goto L_0x0442
        L_0x0432:
            android.view.View r6 = r1.A0H
            java.util.List r0 = r10.A02
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L_0x0442
            boolean r0 = r6.hasFocusable()
            if (r0 != 0) goto L_0x047e
        L_0x0442:
            X.0R0 r0 = r5.A0K
            int r0 = r0.A01()
            if (r0 <= 0) goto L_0x03d5
            int r3 = r4.A01
            r0 = -1
            if (r3 != r0) goto L_0x0450
            r3 = 0
        L_0x0450:
            int r2 = r4.A00()
            r1 = r3
        L_0x0455:
            if (r1 >= r2) goto L_0x0468
            X.0Ua r0 = r5.A0F(r1)
            if (r0 == 0) goto L_0x0468
            android.view.View r6 = r0.A0H
            boolean r0 = r6.hasFocusable()
            if (r0 != 0) goto L_0x047e
            int r1 = r1 + 1
            goto L_0x0455
        L_0x0468:
            int r1 = java.lang.Math.min(r2, r3)
        L_0x046c:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x03d5
            X.0Ua r0 = r5.A0F(r1)
            if (r0 == 0) goto L_0x03d5
            android.view.View r6 = r0.A0H
            boolean r0 = r6.hasFocusable()
            if (r0 == 0) goto L_0x046c
        L_0x047e:
            int r3 = r4.A02
            long r1 = (long) r3
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0492
            android.view.View r1 = r6.findViewById(r3)
            if (r1 == 0) goto L_0x0492
            boolean r0 = r1.isFocusable()
            if (r0 == 0) goto L_0x0492
            r6 = r1
        L_0x0492:
            r6.requestFocus()
            goto L_0x03d5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0K():void");
    }

    public void A0L() {
        int measuredHeight;
        if (this.A0E == null) {
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.A0E = edgeEffect;
            boolean z = this.A0d;
            int measuredWidth = getMeasuredWidth();
            if (z) {
                measuredWidth = AnonymousClass000.A06(this, measuredWidth);
                measuredHeight = AnonymousClass000.A05(this, getMeasuredHeight());
            } else {
                measuredHeight = getMeasuredHeight();
            }
            edgeEffect.setSize(measuredWidth, measuredHeight);
        }
    }

    public void A0M() {
        int measuredWidth;
        if (this.A0F == null) {
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.A0F = edgeEffect;
            boolean z = this.A0d;
            int measuredHeight = getMeasuredHeight();
            if (z) {
                measuredHeight = AnonymousClass000.A05(this, measuredHeight);
                measuredWidth = AnonymousClass000.A06(this, getMeasuredWidth());
            } else {
                measuredWidth = getMeasuredWidth();
            }
            edgeEffect.setSize(measuredHeight, measuredWidth);
        }
    }

    public void A0N() {
        int measuredWidth;
        if (this.A0G == null) {
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.A0G = edgeEffect;
            boolean z = this.A0d;
            int measuredHeight = getMeasuredHeight();
            if (z) {
                measuredHeight = AnonymousClass000.A05(this, measuredHeight);
                measuredWidth = AnonymousClass000.A06(this, getMeasuredWidth());
            } else {
                measuredWidth = getMeasuredWidth();
            }
            edgeEffect.setSize(measuredHeight, measuredWidth);
        }
    }

    public void A0O() {
        int measuredHeight;
        if (this.A0H == null) {
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.A0H = edgeEffect;
            boolean z = this.A0d;
            int measuredWidth = getMeasuredWidth();
            if (z) {
                measuredWidth = AnonymousClass000.A06(this, measuredWidth);
                measuredHeight = AnonymousClass000.A05(this, getMeasuredHeight());
            } else {
                measuredHeight = getMeasuredHeight();
            }
            edgeEffect.setSize(measuredWidth, measuredHeight);
        }
    }

    public void A0P() {
        if (this.A13.size() != 0) {
            C06440Xs r1 = this.A0S;
            if (r1 != null) {
                r1.A16("Cannot invalidate item decorations during a scroll or layout");
            }
            A0Q();
            requestLayout();
        }
    }

    public void A0Q() {
        AnonymousClass0R0 r4 = this.A0K;
        int A022 = r4.A02();
        for (int i = 0; i < A022; i++) {
            AnonymousClass001.A0Y(((C08480eY) r4.A01).A00.getChildAt(i)).A01 = true;
        }
        ArrayList arrayList = this.A0w.A06;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C002102g A0Y2 = AnonymousClass001.A0Y(AnonymousClass001.A0Z(arrayList, i2).A0H);
            if (A0Y2 != null) {
                A0Y2.A01 = true;
            }
        }
    }

    public void A0R() {
        AnonymousClass0UY r0 = this.A0R;
        if (r0 != null) {
            r0.A07();
        }
        C06440Xs r02 = this.A0S;
        if (r02 != null) {
            C04870Qz r1 = this.A0w;
            r02.A0s(r1);
            this.A0S.A0t(r1);
        }
        C04870Qz r12 = this.A0w;
        r12.A05.clear();
        r12.A03();
    }

    public void A0S() {
        int i = this.A06 + 1;
        this.A06 = i;
        if (i == 1 && !this.A0m) {
            this.A0n = false;
        }
    }

    public final void A0U() {
        AnonymousClass0TA r0;
        long j;
        View focusedChild;
        View A0E2;
        C05570Ua A0H2;
        long j2;
        int A012;
        int id;
        AnonymousClass0Q1 r5 = this.A0y;
        boolean z = true;
        r5.A01(1);
        if (getScrollState() == 2) {
            OverScroller overScroller = this.A0z.A03;
            overScroller.getFinalX();
            overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
        }
        r5.A09 = false;
        A0S();
        C04660Qd r02 = this.A11;
        C06290Wz r7 = r02.A01;
        r7.clear();
        C10550i7 r2 = r02.A00;
        r2.A06();
        this.A09++;
        A0W();
        if (!this.A0p || !hasFocus() || this.A0N == null || (focusedChild = getFocusedChild()) == null || (A0E2 = A0E(focusedChild)) == null || (A0H2 = A0H(A0E2)) == null) {
            r5.A07 = -1;
            r5.A01 = -1;
            r5.A02 = -1;
        } else {
            if (this.A0N.A00) {
                j2 = A0H2.A08;
            } else {
                j2 = -1;
            }
            r5.A07 = j2;
            if (this.A0e) {
                A012 = -1;
            } else if (AnonymousClass000.A1S(A0H2.A00 & 8)) {
                A012 = A0H2.A03;
            } else {
                A012 = A0H2.A01();
            }
            r5.A01 = A012;
            View view = A0H2.A0H;
            loop0:
            while (true) {
                id = view.getId();
                while (true) {
                    if (view.isFocused() || !(view instanceof ViewGroup) || !view.hasFocus()) {
                        r5.A02 = id;
                    } else {
                        view = ((ViewGroup) view).getFocusedChild();
                        if (view.getId() != -1) {
                        }
                    }
                }
            }
            r5.A02 = id;
        }
        if (!r5.A0B || !this.A0l) {
            z = false;
        }
        r5.A0D = z;
        this.A0l = false;
        this.A0k = false;
        r5.A08 = r5.A0A;
        r5.A03 = this.A0N.A0G();
        A0x(this.A16);
        if (r5.A0B) {
            AnonymousClass0R0 r9 = this.A0K;
            int A013 = r9.A01();
            for (int i = 0; i < A013; i++) {
                C05570Ua A022 = A02(r9.A05(i));
                if (!AnonymousClass000.A1S(A022.A00 & 128) && ((A022.A00 & 4) == 0 || this.A0N.A00)) {
                    int i2 = A022.A00;
                    int i3 = i2 & 14;
                    if ((i2 & 4) == 0 && (i3 & 4) == 0) {
                        A022.A01();
                    }
                    A022.A02();
                    AnonymousClass0NE r03 = new AnonymousClass0NE();
                    r03.A00(A022);
                    AnonymousClass0TA r1 = (AnonymousClass0TA) r7.get(A022);
                    if (r1 == null) {
                        r1 = AnonymousClass0TA.A00();
                        r7.put(A022, r1);
                    }
                    r1.A02 = r03;
                    r1.A00 |= 4;
                    if (r5.A0D && (A022.A00 & 2) != 0 && !AnonymousClass000.A1S(A022.A00 & 8) && !AnonymousClass000.A1S(A022.A00 & 128) && (A022.A00 & 4) == 0) {
                        if (this.A0N.A00) {
                            j = A022.A08;
                        } else {
                            j = (long) A022.A05;
                        }
                        r2.A0A(j, A022);
                    }
                }
            }
        }
        if (r5.A0A) {
            AnonymousClass0R0 r4 = this.A0K;
            int A023 = r4.A02();
            for (int i4 = 0; i4 < A023; i4++) {
                C05570Ua A002 = AnonymousClass0R0.A00(r4, i4);
                if (!AnonymousClass000.A1S(A002.A00 & 128) && A002.A03 == -1) {
                    A002.A03 = A002.A05;
                }
            }
            boolean z2 = r5.A0C;
            r5.A0C = false;
            this.A0S.A0v(this.A0w, r5);
            r5.A0C = z2;
            for (int i5 = 0; i5 < r4.A01(); i5++) {
                C05570Ua A024 = A02(r4.A05(i5));
                if (!AnonymousClass000.A1S(A024.A00 & 128) && ((r0 = (AnonymousClass0TA) r7.get(A024)) == null || (r0.A00 & 4) == 0)) {
                    int i6 = A024.A00;
                    int i7 = i6 & 14;
                    if ((i6 & 4) == 0 && (i7 & 4) == 0) {
                        A024.A01();
                    }
                    boolean A1S = AnonymousClass000.A1S(8192 & A024.A00);
                    A024.A02();
                    AnonymousClass0NE r22 = new AnonymousClass0NE();
                    r22.A00(A024);
                    if (A1S) {
                        A0n(r22, A024);
                    } else {
                        AnonymousClass0TA r12 = (AnonymousClass0TA) r7.get(A024);
                        if (r12 == null) {
                            r12 = AnonymousClass0TA.A00();
                            r7.put(A024, r12);
                        }
                        r12.A00 |= 2;
                        r12.A02 = r22;
                    }
                }
            }
        }
        AnonymousClass0R0 r42 = this.A0K;
        int A025 = r42.A02();
        for (int i8 = 0; i8 < A025; i8++) {
            C05570Ua A003 = AnonymousClass0R0.A00(r42, i8);
            if (!AnonymousClass000.A1S(A003.A00 & 128)) {
                A003.A03 = -1;
                A003.A06 = -1;
            }
        }
        C04870Qz r8 = this.A0w;
        ArrayList arrayList = r8.A06;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            C05570Ua A0Z2 = AnonymousClass001.A0Z(arrayList, i9);
            A0Z2.A03 = -1;
            A0Z2.A06 = -1;
        }
        ArrayList arrayList2 = r8.A05;
        int size2 = arrayList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            C05570Ua A0Z3 = AnonymousClass001.A0Z(arrayList2, i10);
            A0Z3.A03 = -1;
            A0Z3.A06 = -1;
        }
        ArrayList arrayList3 = r8.A04;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i11 = 0; i11 < size3; i11++) {
                C05570Ua A0Z4 = AnonymousClass001.A0Z(arrayList3, i11);
                A0Z4.A03 = -1;
                A0Z4.A06 = -1;
            }
        }
        A0u(true);
        A0w(false);
        r5.A04 = 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r4.A0l != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (r0 != false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r4.A0S.A1B() == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0W() {
        /*
            r4 = this;
            boolean r0 = r4.A0e
            if (r0 == 0) goto L_0x001c
            X.0ec r1 = r4.A0J
            java.util.ArrayList r0 = r1.A04
            r1.A08(r0)
            java.util.ArrayList r0 = r1.A05
            r1.A08(r0)
            r0 = 0
            r1.A00 = r0
            boolean r0 = r4.A0f
            if (r0 == 0) goto L_0x001c
            X.0Xs r0 = r4.A0S
            r0.A11(r4)
        L_0x001c:
            X.0UY r0 = r4.A0R
            if (r0 == 0) goto L_0x0029
            X.0Xs r0 = r4.A0S
            boolean r0 = r0.A1B()
            r1 = 1
            if (r0 != 0) goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            X.0ec r0 = r4.A0J
            if (r1 == 0) goto L_0x0074
            r0.A04()
        L_0x0031:
            boolean r0 = r4.A0k
            r3 = 0
            if (r0 != 0) goto L_0x003b
            boolean r0 = r4.A0l
            r2 = 0
            if (r0 == 0) goto L_0x003c
        L_0x003b:
            r2 = 1
        L_0x003c:
            X.0Q1 r1 = r4.A0y
            boolean r0 = r4.A0g
            if (r0 == 0) goto L_0x0072
            X.0UY r0 = r4.A0R
            if (r0 == 0) goto L_0x0072
            boolean r0 = r4.A0e
            if (r0 != 0) goto L_0x006d
            if (r2 != 0) goto L_0x0052
            X.0Xs r0 = r4.A0S
            boolean r0 = r0.A0D
        L_0x0050:
            if (r0 == 0) goto L_0x0072
        L_0x0052:
            r0 = 1
        L_0x0053:
            r1.A0B = r0
            if (r0 == 0) goto L_0x006a
            if (r2 == 0) goto L_0x006a
            boolean r0 = r4.A0e
            if (r0 != 0) goto L_0x006a
            X.0UY r0 = r4.A0R
            if (r0 == 0) goto L_0x006a
            X.0Xs r0 = r4.A0S
            boolean r0 = r0.A1B()
            if (r0 == 0) goto L_0x006a
            r3 = 1
        L_0x006a:
            r1.A0A = r3
            return
        L_0x006d:
            X.0R6 r0 = r4.A0N
            boolean r0 = r0.A00
            goto L_0x0050
        L_0x0072:
            r0 = 0
            goto L_0x0053
        L_0x0074:
            r0.A03()
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0W():void");
    }

    public void A0X(int i) {
        if (this.A0S != null) {
            setScrollState(2);
            this.A0S.A0Z(i);
            awakenScrollBars();
        }
    }

    public void A0Z(int i) {
        if (!this.A0m) {
            A0T();
            C06440Xs r0 = this.A0S;
            if (r0 == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            r0.A0Z(i);
            awakenScrollBars();
        }
    }

    public void A0a(int i) {
        if (!this.A0m) {
            C06440Xs r1 = this.A0S;
            if (r1 == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                r1.A0z(this.A0y, this, i);
            }
        }
    }

    public void A0c(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.A0F;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.A0F.onRelease();
            z = this.A0F.isFinished();
        }
        EdgeEffect edgeEffect2 = this.A0G;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.A0G.onRelease();
            z |= this.A0G.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A0H;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.A0H.onRelease();
            z |= this.A0H.isFinished();
        }
        EdgeEffect edgeEffect4 = this.A0E;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.A0E.onRelease();
            z |= this.A0E.isFinished();
        }
        if (z) {
            AnonymousClass0YY.A05(this);
        }
    }

    public void A0e(int i, int i2) {
        this.A02++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        AnonymousClass0O5 r0 = this.A0V;
        if (r0 != null) {
            r0.A04(this, i, i2);
        }
        List list = this.A0b;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((AnonymousClass0O5) this.A0b.get(size)).A04(this, i, i2);
            }
        }
        this.A02--;
    }

    public void A0g(int i, int i2, boolean z) {
        int i3 = i + i2;
        AnonymousClass0R0 r8 = this.A0K;
        int A022 = r8.A02();
        for (int i4 = 0; i4 < A022; i4++) {
            C05570Ua A002 = AnonymousClass0R0.A00(r8, i4);
            if (A002 != null && !AnonymousClass000.A1S(A002.A00 & 128)) {
                int i5 = A002.A05;
                if (i5 >= i3) {
                    A002.A04(-i2, z);
                } else if (i5 >= i) {
                    A002.A00 = 8 | A002.A00;
                    A002.A04(-i2, z);
                    A002.A05 = i - 1;
                }
                this.A0y.A0C = true;
            }
        }
        C04870Qz r5 = this.A0w;
        ArrayList arrayList = r5.A06;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                C05570Ua A0Z2 = AnonymousClass001.A0Z(arrayList, size);
                if (A0Z2 != null) {
                    int i6 = A0Z2.A05;
                    if (i6 >= i3) {
                        A0Z2.A04(-i2, z);
                    } else if (i6 >= i) {
                        A0Z2.A00 = 8 | A0Z2.A00;
                        r5.A05(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public final void A0m(AnonymousClass0R6 r6, boolean z, boolean z2) {
        AnonymousClass0R6 r0 = this.A0N;
        if (r0 != null) {
            r0.A01.unregisterObserver(this.A0x);
            this.A0N.A0D(this);
        }
        if (!z || z2) {
            A0R();
        }
        C08520ec r1 = this.A0J;
        r1.A08(r1.A04);
        r1.A08(r1.A05);
        r1.A00 = 0;
        AnonymousClass0R6 r4 = this.A0N;
        this.A0N = r6;
        if (r6 != null) {
            r6.BiZ(this.A0x);
            r6.A0C(this);
        }
        C06440Xs r12 = this.A0S;
        if (r12 != null) {
            r12.A0o(r4, this.A0N);
        }
        C04870Qz r3 = this.A0w;
        AnonymousClass0R6 r2 = this.A0N;
        r3.A05.clear();
        r3.A03();
        AnonymousClass0ON r13 = r3.A02;
        if (r13 == null) {
            r13 = new AnonymousClass0ON();
            r3.A02 = r13;
        }
        if (r4 != null) {
            r13.A00--;
        }
        if (!z && r13.A00 == 0) {
            r13.A01();
        }
        if (r2 != null) {
            r13.A00++;
        }
        this.A0y.A0C = true;
    }

    public void A0n(AnonymousClass0NE r4, C05570Ua r5) {
        long j;
        int i = 0 | (r5.A00 & (~DefaultCrypto.BUFFER_SIZE));
        r5.A00 = i;
        if (this.A0y.A0D && (i & 2) != 0 && !AnonymousClass000.A1S(i & 8) && !AnonymousClass000.A1S(r5.A00 & 128)) {
            if (this.A0N.A00) {
                j = r5.A08;
            } else {
                j = (long) r5.A05;
            }
            this.A11.A00.A0A(j, r5);
        }
        C06290Wz r0 = this.A11.A01;
        AnonymousClass0TA r1 = (AnonymousClass0TA) r0.get(r5);
        if (r1 == null) {
            r1 = AnonymousClass0TA.A00();
            r0.put(r5, r1);
        }
        r1.A02 = r4;
        r1.A00 |= 4;
    }

    public void A0o(C04580Ov r3) {
        C06440Xs r1 = this.A0S;
        if (r1 != null) {
            r1.A16("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.A13;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(r3);
        A0Q();
        requestLayout();
    }

    public void A0p(C04580Ov r3) {
        C06440Xs r1 = this.A0S;
        if (r1 != null) {
            r1.A16("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.A13;
        arrayList.remove(r3);
        if (arrayList.isEmpty()) {
            setWillNotDraw(AnonymousClass000.A1U(getOverScrollMode(), 2));
        }
        A0Q();
        requestLayout();
    }

    public void A0q(AnonymousClass0O5 r2) {
        List list = this.A0b;
        if (list == null) {
            list = AnonymousClass001.A0s();
            this.A0b = list;
        }
        list.add(r2);
    }

    public void A0r(AnonymousClass0O5 r2) {
        List list = this.A0b;
        if (list != null) {
            list.remove(r2);
        }
    }

    public final void A0s(C05570Ua r7) {
        View view = r7.A0H;
        boolean A1Y = AnonymousClass000.A1Y(view.getParent(), this);
        this.A0w.A09(A0H(view));
        boolean A1S = AnonymousClass000.A1S(r7.A00 & 256);
        AnonymousClass0R0 r2 = this.A0K;
        if (A1S) {
            r2.A0B(view, view.getLayoutParams(), -1, true);
        } else if (!A1Y) {
            r2.A0A(view, -1, true);
        } else {
            int indexOfChild = ((C08480eY) r2.A01).A00.indexOfChild(view);
            if (indexOfChild >= 0) {
                r2.A00.A04(indexOfChild);
                r2.A08(view);
                return;
            }
            throw AnonymousClass000.A0E(view, "view is not a child, cannot hide ", AnonymousClass001.A0o());
        }
    }

    public void A0t(String str) {
        if (this.A09 > 0) {
            if (str == null) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("Cannot call this method while RecyclerView is computing a layout or scrolling");
                throw AnonymousClass000.A0I(A0I(), A0o2);
            }
            throw AnonymousClass001.A0e(str);
        } else if (this.A02 > 0) {
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A0o3.append("");
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", AnonymousClass000.A0I(A0I(), A0o3));
        }
    }

    public void A0u(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.A09 - 1;
        this.A09 = i2;
        if (i2 < 1) {
            this.A09 = 0;
            if (z) {
                int i3 = this.A03;
                this.A03 = 0;
                if (!(i3 == 0 || (accessibilityManager = this.A0v) == null || !accessibilityManager.isEnabled())) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
                    C05000Rm.A01(obtain, i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                List list = this.A15;
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        C05570Ua r3 = (C05570Ua) list.get(size);
                        if (r3.A0H.getParent() == this && !AnonymousClass000.A1S(r3.A00 & 128) && (i = r3.A04) != -1) {
                            AnonymousClass0YY.A06(r3.A0H, i);
                            r3.A04 = -1;
                        }
                    } else {
                        list.clear();
                        return;
                    }
                }
            }
        }
    }

    public void A0v(boolean z) {
        this.A0f = z | this.A0f;
        this.A0e = true;
        AnonymousClass0R0 r5 = this.A0K;
        int A022 = r5.A02();
        for (int i = 0; i < A022; i++) {
            C05570Ua A002 = AnonymousClass0R0.A00(r5, i);
            if (A002 != null && !AnonymousClass000.A1S(A002.A00 & 128)) {
                A002.A00 = 6 | A002.A00;
            }
        }
        A0Q();
        C04870Qz r6 = this.A0w;
        ArrayList arrayList = r6.A06;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C05570Ua A0Z2 = AnonymousClass001.A0Z(arrayList, i2);
            if (A0Z2 != null) {
                int i3 = 6 | A0Z2.A00;
                A0Z2.A00 = i3;
                A0Z2.A00 = 1024 | i3;
            }
        }
        AnonymousClass0R6 r0 = r6.A08.A0N;
        if (r0 == null || !r0.A00) {
            r6.A03();
        }
    }

    public void A0w(boolean z) {
        int i = this.A06;
        if (i < 1) {
            this.A06 = 1;
            i = 1;
        }
        if (!z && !this.A0m) {
            this.A0n = false;
        }
        if (i == 1) {
            if (z && this.A0n && !this.A0m && this.A0S != null && this.A0N != null) {
                A0K();
            }
            if (!this.A0m) {
                this.A0n = false;
            }
        }
        this.A06--;
    }

    public final void A0x(int[] iArr) {
        AnonymousClass0R0 r8 = this.A0K;
        int A012 = r8.A01();
        if (A012 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < A012; i3++) {
            C05570Ua A022 = A02(r8.A05(i3));
            if (!AnonymousClass000.A1S(A022.A00 & 128)) {
                int A0J2 = AnonymousClass001.A0J(A022);
                if (A0J2 < i) {
                    i = A0J2;
                }
                if (A0J2 > i2) {
                    i2 = A0J2;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public boolean A0z() {
        if (!this.A0g || this.A0e || this.A0J.A04.size() > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        if (r9 != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A10(int r19, int r20) {
        /*
            r18 = this;
            r7 = r19
            r6 = r20
            r5 = r18
            X.0Xs r1 = r5.A0S
            r10 = 0
            if (r1 != 0) goto L_0x0013
            java.lang.String r1 = "RecyclerView"
            java.lang.String r0 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r1, r0)
        L_0x0012:
            return r10
        L_0x0013:
            boolean r0 = r5.A0m
            if (r0 != 0) goto L_0x0012
            boolean r8 = r1.A17()
            boolean r9 = r1.A18()
            if (r8 == 0) goto L_0x0029
            int r1 = java.lang.Math.abs(r7)
            int r0 = r5.A0r
            if (r1 >= r0) goto L_0x002a
        L_0x0029:
            r7 = 0
        L_0x002a:
            if (r9 == 0) goto L_0x0034
            int r1 = java.lang.Math.abs(r6)
            int r0 = r5.A0r
            if (r1 >= r0) goto L_0x0035
        L_0x0034:
            r6 = 0
        L_0x0035:
            if (r7 != 0) goto L_0x003a
            if (r6 != 0) goto L_0x003a
            return r10
        L_0x003a:
            float r3 = (float) r7
            float r2 = (float) r6
            X.0Qf r0 = r5.getScrollingChildHelper()
            boolean r0 = r0.A03(r3, r2)
            if (r0 != 0) goto L_0x0012
            r4 = 1
            if (r8 != 0) goto L_0x004c
            r1 = 0
            if (r9 == 0) goto L_0x004d
        L_0x004c:
            r1 = 1
        L_0x004d:
            r5.dispatchNestedFling(r3, r2, r1)
            X.0Mv r0 = r5.A0T
            if (r0 == 0) goto L_0x005b
            boolean r0 = r0.A01(r7, r6)
            if (r0 == 0) goto L_0x005b
            return r4
        L_0x005b:
            if (r1 == 0) goto L_0x0012
            if (r9 == 0) goto L_0x0061
            r8 = r8 | 2
        L_0x0061:
            X.0Qf r0 = r5.getScrollingChildHelper()
            r0.A05(r8, r4)
            int r1 = r5.A0q
            int r0 = -r1
            int r12 = X.AnonymousClass001.A0D(r7, r1, r0)
            int r13 = X.AnonymousClass001.A0D(r6, r1, r0)
            X.0mq r3 = r5.A0z
            androidx.recyclerview.widget.RecyclerView r1 = r3.A06
            r0 = 2
            r1.setScrollState(r0)
            r3.A01 = r10
            r3.A00 = r10
            android.view.animation.Interpolator r0 = r3.A02
            android.view.animation.Interpolator r2 = A1A
            if (r0 == r2) goto L_0x0092
            r3.A02 = r2
            android.content.Context r1 = r1.getContext()
            android.widget.OverScroller r0 = new android.widget.OverScroller
            r0.<init>(r1, r2)
            r3.A03 = r0
        L_0x0092:
            android.widget.OverScroller r9 = r3.A03
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = 2147483647(0x7fffffff, float:NaN)
            r11 = r10
            r16 = r14
            r17 = r15
            r9.fling(r10, r11, r12, r13, r14, r15, r16, r17)
            r3.A00()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A10(int, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f7, code lost:
        if (r7 == 0.0f) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004c, code lost:
        if (r0 != 0) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A12(android.view.MotionEvent r24, int r25, int r26) {
        /*
            r23 = this;
            r15 = r23
            r15.A0J()
            X.0R6 r0 = r15.A0N
            r14 = 1
            r22 = 0
            r5 = r25
            r4 = r26
            if (r0 == 0) goto L_0x0110
            int[] r0 = r15.A18
            r0[r22] = r22
            r0[r14] = r22
            r15.A0i(r5, r0, r4)
            r3 = r0[r22]
            r2 = r0[r14]
            int r8 = r25 - r3
            int r7 = r26 - r2
        L_0x0021:
            java.util.ArrayList r0 = r15.A13
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x002c
            r15.invalidate()
        L_0x002c:
            int[] r0 = r15.A18
            r0[r22] = r22
            r0[r14] = r22
            int[] r6 = r15.A19
            r20 = r8
            r21 = r7
            r18 = r3
            r19 = r2
            r16 = r6
            r17 = r0
            r15.A0y(r16, r17, r18, r19, r20, r21, r22)
            r1 = r0[r22]
            int r8 = r8 - r1
            r0 = r0[r14]
            int r7 = r7 - r0
            if (r1 != 0) goto L_0x004e
            r13 = 0
            if (r0 == 0) goto L_0x004f
        L_0x004e:
            r13 = 1
        L_0x004f:
            int r0 = r15.A07
            r9 = r6[r22]
            int r0 = r0 - r9
            r15.A07 = r0
            int r0 = r15.A08
            r6 = r6[r14]
            int r0 = r0 - r6
            r15.A08 = r0
            int[] r1 = r15.A17
            r0 = r1[r22]
            int r0 = r0 + r9
            r1[r22] = r0
            r0 = r1[r14]
            int r0 = r0 + r6
            r1[r14] = r0
            int r1 = r15.getOverScrollMode()
            r0 = 2
            if (r1 == r0) goto L_0x00bf
            if (r24 == 0) goto L_0x00bc
            r1 = 8194(0x2002, float:1.1482E-41)
            int r0 = r24.getSource()
            r0 = r0 & r1
            if (r0 == r1) goto L_0x00bc
            float r6 = r24.getX()
            float r9 = (float) r8
            float r10 = r24.getY()
            float r7 = (float) r7
            r8 = 1065353216(0x3f800000, float:1.0)
            r12 = 0
            int r0 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x00fa
            r15.A0M()
            android.widget.EdgeEffect r11 = r15.A0F
            float r0 = -r9
            float r1 = X.AnonymousClass001.A04(r15, r0)
            int r0 = r15.getHeight()
            float r0 = (float) r0
            float r10 = r10 / r0
            float r10 = r8 - r10
        L_0x009e:
            X.AnonymousClass0II.A00(r11, r1, r10)
            r1 = 1
        L_0x00a2:
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d7
            r15.A0O()
            android.widget.EdgeEffect r8 = r15.A0H
            float r1 = -r7
            int r0 = r15.getHeight()
            float r0 = (float) r0
            float r1 = r1 / r0
            float r0 = X.AnonymousClass001.A04(r15, r6)
            X.AnonymousClass0II.A00(r8, r1, r0)
        L_0x00b9:
            X.AnonymousClass0YY.A05(r15)
        L_0x00bc:
            r15.A0c(r5, r4)
        L_0x00bf:
            if (r3 != 0) goto L_0x00c3
            if (r2 == 0) goto L_0x00c6
        L_0x00c3:
            r15.A0e(r3, r2)
        L_0x00c6:
            boolean r0 = r15.awakenScrollBars()
            if (r0 != 0) goto L_0x00cf
            r15.invalidate()
        L_0x00cf:
            if (r13 != 0) goto L_0x00d6
            if (r3 != 0) goto L_0x00d6
            if (r2 != 0) goto L_0x00d6
            r14 = 0
        L_0x00d6:
            return r14
        L_0x00d7:
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ef
            r15.A0L()
            android.widget.EdgeEffect r1 = r15.A0E
            int r0 = r15.getHeight()
            float r0 = (float) r0
            float r7 = r7 / r0
            float r0 = X.AnonymousClass001.A04(r15, r6)
            float r8 = r8 - r0
            X.AnonymousClass0II.A00(r1, r7, r8)
            goto L_0x00b9
        L_0x00ef:
            if (r1 != 0) goto L_0x00b9
            int r0 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x00b9
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x00bc
            goto L_0x00b9
        L_0x00fa:
            int r0 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x010e
            r15.A0N()
            android.widget.EdgeEffect r11 = r15.A0G
            float r1 = X.AnonymousClass001.A04(r15, r9)
            int r0 = r15.getHeight()
            float r0 = (float) r0
            float r10 = r10 / r0
            goto L_0x009e
        L_0x010e:
            r1 = 0
            goto L_0x00a2
        L_0x0110:
            r2 = 0
            r3 = 0
            r8 = 0
            r7 = 0
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A12(android.view.MotionEvent, int, int):boolean");
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C002102g) || !this.A0S.A1F((C002102g) layoutParams)) {
            return false;
        }
        return true;
    }

    public int computeHorizontalScrollExtent() {
        C06440Xs r2 = this.A0S;
        if (r2 == null || !r2.A17()) {
            return 0;
        }
        return r2.A0I(this.A0y);
    }

    public int computeHorizontalScrollOffset() {
        C06440Xs r2 = this.A0S;
        if (r2 == null || !r2.A17()) {
            return 0;
        }
        return r2.A0J(this.A0y);
    }

    public int computeHorizontalScrollRange() {
        C06440Xs r2 = this.A0S;
        if (r2 == null || !r2.A17()) {
            return 0;
        }
        return r2.A0K(this.A0y);
    }

    public int computeVerticalScrollExtent() {
        C06440Xs r2 = this.A0S;
        if (r2 == null || !r2.A18()) {
            return 0;
        }
        return r2.A0L(this.A0y);
    }

    public int computeVerticalScrollOffset() {
        C06440Xs r2 = this.A0S;
        if (r2 == null || !r2.A18()) {
            return 0;
        }
        return r2.A0M(this.A0y);
    }

    public int computeVerticalScrollRange() {
        C06440Xs r2 = this.A0S;
        if (r2 == null || !r2.A18()) {
            return 0;
        }
        return r2.A0N(this.A0y);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0146, code lost:
        if (r3 <= r2) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        if (r5.findNextFocus(r11, r12, r0) == null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        A0J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        if (A0E(r12) == null) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
        A0S();
        r11.A0S.A0R(r12, r11.A0w, r11.A0y, r13);
        A0w(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        if (r5 != null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0084, code lost:
        if (r5.findNextFocus(r11, r12, r0) == null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r11.A0m != false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0121, code lost:
        if (r10 > 0) goto L_0x0123;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View focusSearch(android.view.View r12, int r13) {
        /*
            r11 = this;
            X.0R6 r0 = r11.A0N
            r6 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0013
            X.0Xs r0 = r11.A0S
            if (r0 == 0) goto L_0x0013
            int r0 = r11.A09
            if (r0 > 0) goto L_0x0013
            boolean r0 = r11.A0m
            r1 = 1
            if (r0 == 0) goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            android.view.FocusFinder r5 = android.view.FocusFinder.getInstance()
            r4 = 0
            if (r1 == 0) goto L_0x0087
            r3 = 2
            if (r13 == r3) goto L_0x0020
            if (r13 != r6) goto L_0x0087
        L_0x0020:
            X.0Xs r0 = r11.A0S
            boolean r0 = r0.A18()
            if (r0 == 0) goto L_0x0063
            r0 = 33
            if (r13 != r3) goto L_0x002e
            r0 = 130(0x82, float:1.82E-43)
        L_0x002e:
            android.view.View r0 = r5.findNextFocus(r11, r12, r0)
            if (r0 != 0) goto L_0x0063
        L_0x0034:
            r11.A0J()
            android.view.View r0 = r11.A0E(r12)
            if (r0 == 0) goto L_0x0168
            r11.A0S()
            X.0Xs r3 = r11.A0S
            X.0Qz r1 = r11.A0w
            X.0Q1 r0 = r11.A0y
            r3.A0R(r12, r1, r0, r13)
            r11.A0w(r2)
        L_0x004c:
            android.view.View r5 = r5.findNextFocus(r11, r12, r13)
        L_0x0050:
            if (r5 == 0) goto L_0x0169
        L_0x0052:
            boolean r0 = r5.hasFocusable()
            if (r0 != 0) goto L_0x00ad
            android.view.View r0 = r11.getFocusedChild()
            if (r0 != 0) goto L_0x00a9
            android.view.View r12 = super.focusSearch(r12, r13)
            return r12
        L_0x0063:
            X.0Xs r1 = r11.A0S
            boolean r0 = r1.A17()
            if (r0 == 0) goto L_0x004c
            androidx.recyclerview.widget.RecyclerView r0 = r1.A07
            int r0 = X.AnonymousClass0YH.A01(r0)
            boolean r1 = X.AnonymousClass000.A1U(r0, r6)
            boolean r0 = X.AnonymousClass000.A1U(r13, r3)
            r1 = r1 ^ r0
            r0 = 17
            if (r1 == 0) goto L_0x0080
            r0 = 66
        L_0x0080:
            android.view.View r0 = r5.findNextFocus(r11, r12, r0)
            if (r0 != 0) goto L_0x004c
            goto L_0x0034
        L_0x0087:
            android.view.View r5 = r5.findNextFocus(r11, r12, r13)
            if (r5 != 0) goto L_0x0052
            if (r1 == 0) goto L_0x0169
            r11.A0J()
            android.view.View r0 = r11.A0E(r12)
            if (r0 == 0) goto L_0x0168
            r11.A0S()
            X.0Xs r3 = r11.A0S
            X.0Qz r1 = r11.A0w
            X.0Q1 r0 = r11.A0y
            android.view.View r5 = r3.A0R(r12, r1, r0, r13)
            r11.A0w(r2)
            goto L_0x0050
        L_0x00a9:
            r11.A0l(r5, r4)
            return r12
        L_0x00ad:
            if (r5 == r11) goto L_0x0169
            android.view.View r0 = r11.A0E(r5)
            if (r0 == 0) goto L_0x0169
            if (r12 == 0) goto L_0x0123
            android.view.View r0 = r11.A0E(r12)
            if (r0 == 0) goto L_0x0123
            android.graphics.Rect r8 = r11.A0s
            int r1 = r12.getWidth()
            int r0 = r12.getHeight()
            r8.set(r2, r2, r1, r0)
            android.graphics.Rect r7 = r11.A0t
            int r1 = r5.getWidth()
            int r0 = r5.getHeight()
            r7.set(r2, r2, r1, r0)
            r11.offsetDescendantRectToMyCoords(r12, r8)
            r11.offsetDescendantRectToMyCoords(r5, r7)
            X.0Xs r0 = r11.A0S
            androidx.recyclerview.widget.RecyclerView r0 = r0.A07
            int r0 = X.AnonymousClass0YH.A01(r0)
            r10 = -1
            r9 = 1
            if (r0 != r6) goto L_0x00ea
            r9 = -1
        L_0x00ea:
            int r3 = r8.left
            int r2 = r7.left
            if (r3 < r2) goto L_0x00f4
            int r1 = r8.right
            if (r1 > r2) goto L_0x013f
        L_0x00f4:
            int r1 = r8.right
            int r0 = r7.right
            if (r1 >= r0) goto L_0x013f
            r4 = 1
        L_0x00fb:
            int r3 = r8.top
            int r2 = r7.top
            if (r3 < r2) goto L_0x0105
            int r1 = r8.bottom
            if (r1 > r2) goto L_0x0134
        L_0x0105:
            int r1 = r8.bottom
            int r0 = r7.bottom
            if (r1 >= r0) goto L_0x0134
            r10 = 1
        L_0x010c:
            if (r13 == r6) goto L_0x012c
            r0 = 2
            if (r13 == r0) goto L_0x0124
            r0 = 17
            if (r13 == r0) goto L_0x0165
            r0 = 33
            if (r13 == r0) goto L_0x0162
            r0 = 66
            if (r13 == r0) goto L_0x015f
            r0 = 130(0x82, float:1.82E-43)
            if (r13 != r0) goto L_0x014a
            if (r10 <= 0) goto L_0x0169
        L_0x0123:
            return r5
        L_0x0124:
            if (r10 > 0) goto L_0x0123
            if (r10 != 0) goto L_0x0169
            int r4 = r4 * r9
            if (r4 < 0) goto L_0x0169
            return r5
        L_0x012c:
            if (r10 < 0) goto L_0x0123
            if (r10 != 0) goto L_0x0169
            int r4 = r4 * r9
            if (r4 > 0) goto L_0x0169
            return r5
        L_0x0134:
            int r0 = r7.bottom
            if (r1 > r0) goto L_0x013a
            if (r3 < r0) goto L_0x013d
        L_0x013a:
            if (r3 <= r2) goto L_0x013d
            goto L_0x010c
        L_0x013d:
            r10 = 0
            goto L_0x010c
        L_0x013f:
            int r0 = r7.right
            if (r1 > r0) goto L_0x0145
            if (r3 < r0) goto L_0x0148
        L_0x0145:
            r4 = -1
            if (r3 > r2) goto L_0x00fb
        L_0x0148:
            r4 = 0
            goto L_0x00fb
        L_0x014a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid direction: "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r11.A0I()
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r0, r1)
            throw r0
        L_0x015f:
            if (r4 <= 0) goto L_0x0169
            return r5
        L_0x0162:
            if (r10 >= 0) goto L_0x0169
            return r5
        L_0x0165:
            if (r4 >= 0) goto L_0x0169
            return r5
        L_0x0168:
            return r4
        L_0x0169:
            android.view.View r5 = super.focusSearch(r12, r13)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C06440Xs r0 = this.A0S;
        if (r0 != null) {
            return r0.A0S();
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("RecyclerView has no LayoutManager");
        throw AnonymousClass000.A0I(A0I(), A0o2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C06440Xs r1 = this.A0S;
        if (r1 != null) {
            return r1.A0T(getContext(), attributeSet);
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("RecyclerView has no LayoutManager");
        throw AnonymousClass000.A0I(A0I(), A0o2);
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AnonymousClass0R6 getAdapter() {
        return this.A0N;
    }

    public int getBaseline() {
        if (this.A0S != null) {
            return -1;
        }
        return super.getBaseline();
    }

    public boolean getClipToPadding() {
        return this.A0d;
    }

    public AnonymousClass063 getCompatAccessibilityDelegate() {
        return this.A0Y;
    }

    public C02900Ia getEdgeEffectFactory() {
        return this.A0P;
    }

    public AnonymousClass0UY getItemAnimator() {
        return this.A0R;
    }

    public int getItemDecorationCount() {
        return this.A13.size();
    }

    public C06440Xs getLayoutManager() {
        return this.A0S;
    }

    public int getMaxFlingVelocity() {
        return this.A0q;
    }

    public int getMinFlingVelocity() {
        return this.A0r;
    }

    public C04110Mv getOnFlingListener() {
        return this.A0T;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.A0p;
    }

    public AnonymousClass0ON getRecycledViewPool() {
        C04870Qz r1 = this.A0w;
        AnonymousClass0ON r0 = r1.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0ON r02 = new AnonymousClass0ON();
        r1.A02 = r02;
        return r02;
    }

    public int getScrollState() {
        return this.A0B;
    }

    public boolean isAttachedToWindow() {
        return this.A0j;
    }

    public final boolean isLayoutSuppressed() {
        return this.A0m;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r3 == 0.0f) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r2 != 0.0f) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        A12(r7, (int) (r2 * r6.A00), (int) (r3 * r6.A01));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onGenericMotionEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            X.0Xs r0 = r6.A0S
            r5 = 0
            if (r0 == 0) goto L_0x004a
            boolean r0 = r6.A0m
            if (r0 != 0) goto L_0x004a
            int r1 = r7.getAction()
            r0 = 8
            if (r1 != r0) goto L_0x004a
            int r0 = r7.getSource()
            r0 = r0 & 2
            r4 = 0
            if (r0 == 0) goto L_0x004d
            X.0Xs r0 = r6.A0S
            boolean r0 = r0.A18()
            if (r0 == 0) goto L_0x004b
            r0 = 9
            float r0 = r7.getAxisValue(r0)
            float r3 = -r0
        L_0x0029:
            X.0Xs r0 = r6.A0S
            boolean r0 = r0.A17()
            if (r0 == 0) goto L_0x0065
            r0 = 10
            float r2 = r7.getAxisValue(r0)
        L_0x0037:
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x003f
        L_0x003b:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x004a
        L_0x003f:
            float r0 = r6.A00
            float r2 = r2 * r0
            int r1 = (int) r2
            float r0 = r6.A01
            float r3 = r3 * r0
            int r0 = (int) r3
            r6.A12(r7, r1, r0)
        L_0x004a:
            return r5
        L_0x004b:
            r3 = 0
            goto L_0x0029
        L_0x004d:
            int r1 = r7.getSource()
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x004a
            r0 = 26
            float r2 = r7.getAxisValue(r0)
            X.0Xs r1 = r6.A0S
            boolean r0 = r1.A18()
            if (r0 == 0) goto L_0x0067
            float r3 = -r2
        L_0x0065:
            r2 = 0
            goto L_0x0037
        L_0x0067:
            boolean r0 = r1.A17()
            if (r0 == 0) goto L_0x004a
            r3 = 0
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00aa, code lost:
        if (r4 != false) goto L_0x00a6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.A0m
            r2 = 0
            if (r0 != 0) goto L_0x00fc
            r0 = 0
            r9.A0U = r0
            boolean r0 = r9.A11(r10)
            r1 = 1
            if (r0 == 0) goto L_0x0016
            r9.A04()
            r9.setScrollState(r2)
            return r1
        L_0x0016:
            X.0Xs r0 = r9.A0S
            if (r0 == 0) goto L_0x00fc
            boolean r3 = r0.A17()
            boolean r8 = r0.A18()
            android.view.VelocityTracker r0 = r9.A0D
            if (r0 != 0) goto L_0x002c
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r9.A0D = r0
        L_0x002c:
            r0.addMovement(r10)
            int r7 = r10.getActionMasked()
            int r6 = r10.getActionIndex()
            r4 = 2
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r7 == 0) goto L_0x00b8
            if (r7 == r1) goto L_0x00af
            if (r7 == r4) goto L_0x0053
            r0 = 3
            if (r7 == r0) goto L_0x004c
            X.AnonymousClass001.A16(r10, r9, r7, r6)
        L_0x0046:
            int r0 = r9.A0B
            if (r0 != r1) goto L_0x00fc
            r2 = 1
            return r2
        L_0x004c:
            r9.A04()
            r9.setScrollState(r2)
            goto L_0x0046
        L_0x0053:
            int r0 = r9.A0A
            int r4 = r10.findPointerIndex(r0)
            if (r4 >= 0) goto L_0x0075
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            r1.append(r0)
            int r0 = r9.A0A
            r1.append(r0)
            java.lang.String r0 = " not found. Did any MotionEvents get skipped?"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r0 = "RecyclerView"
            android.util.Log.e(r0, r1)
            return r2
        L_0x0075:
            float r0 = r10.getX(r4)
            float r0 = r0 + r5
            int r7 = (int) r0
            float r0 = r10.getY(r4)
            float r0 = r0 + r5
            int r6 = (int) r0
            int r0 = r9.A0B
            if (r0 == r1) goto L_0x0046
            int r0 = r9.A04
            int r4 = r7 - r0
            int r0 = r9.A05
            int r5 = r6 - r0
            if (r3 == 0) goto L_0x00ad
            int r3 = java.lang.Math.abs(r4)
            int r0 = r9.A0C
            if (r3 <= r0) goto L_0x00ad
            r9.A07 = r7
            r4 = 1
        L_0x009a:
            if (r8 == 0) goto L_0x00aa
            int r3 = java.lang.Math.abs(r5)
            int r0 = r9.A0C
            if (r3 <= r0) goto L_0x00aa
            r9.A08 = r6
        L_0x00a6:
            r9.setScrollState(r1)
            goto L_0x0046
        L_0x00aa:
            if (r4 == 0) goto L_0x0046
            goto L_0x00a6
        L_0x00ad:
            r4 = 0
            goto L_0x009a
        L_0x00af:
            android.view.VelocityTracker r0 = r9.A0D
            r0.clear()
            r9.A0b(r2)
            goto L_0x0046
        L_0x00b8:
            boolean r0 = r9.A0i
            if (r0 == 0) goto L_0x00be
            r9.A0i = r2
        L_0x00be:
            int r0 = r10.getPointerId(r2)
            r9.A0A = r0
            float r0 = r10.getX()
            float r0 = r0 + r5
            int r0 = (int) r0
            r9.A07 = r0
            r9.A04 = r0
            float r0 = r10.getY()
            float r0 = r0 + r5
            int r0 = (int) r0
            r9.A08 = r0
            r9.A05 = r0
            int r0 = r9.A0B
            if (r0 != r4) goto L_0x00e9
            android.view.ViewParent r0 = r9.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            r9.setScrollState(r1)
            r9.A0b(r1)
        L_0x00e9:
            int[] r0 = r9.A17
            r0[r1] = r2
            r0[r2] = r2
            if (r8 == 0) goto L_0x00f3
            r3 = r3 | 2
        L_0x00f3:
            X.0Qf r0 = r9.getScrollingChildHelper()
            r0.A05(r3, r2)
            goto L_0x0046
        L_0x00fc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AnonymousClass0RZ.A01("RV OnLayout");
        A0K();
        AnonymousClass0RZ.A00();
        this.A0g = true;
    }

    public void onMeasure(int i, int i2) {
        AnonymousClass0Q1 r1;
        C06440Xs r12 = this.A0S;
        if (r12 == null) {
            A0d(i, i2);
        } else if (r12.A19()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            C06440Xs r0 = this.A0S;
            AnonymousClass0Q1 r4 = this.A0y;
            r0.A07.A0d(i, i2);
            if ((mode != 1073741824 || mode2 != 1073741824) && this.A0N != null) {
                if (r4.A04 == 1) {
                    A0U();
                }
                this.A0S.A0a(i, i2);
                r4.A09 = true;
                A0V();
                this.A0S.A0b(i, i2);
                if (this.A0S.A1A()) {
                    this.A0S.A0a(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    r4.A09 = true;
                    A0V();
                    this.A0S.A0b(i, i2);
                }
            }
        } else if (this.A0h) {
            r12.A07.A0d(i, i2);
        } else {
            if (this.A0c) {
                A0S();
                this.A09++;
                A0W();
                A0u(true);
                r1 = this.A0y;
                if (r1.A0A) {
                    r1.A08 = true;
                } else {
                    this.A0J.A03();
                    r1.A08 = false;
                }
                this.A0c = false;
                A0w(false);
            } else {
                r1 = this.A0y;
                if (r1.A0A) {
                    setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                    return;
                }
            }
            AnonymousClass0R6 r02 = this.A0N;
            if (r02 != null) {
                r1.A03 = r02.A0G();
            } else {
                r1.A03 = 0;
            }
            A0S();
            this.A0S.A07.A0d(i, i2);
            A0w(false);
            r1.A08 = false;
        }
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (this.A09 > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C008807b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C008807b r3 = (C008807b) parcelable;
        this.A0X = r3;
        super.onRestoreInstanceState(r3.A00);
        C06440Xs r1 = this.A0S;
        if (r1 != null && (parcelable2 = this.A0X.A00) != null) {
            r1.A0e(parcelable2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d0, code lost:
        if (r7 == 0) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00dd, code lost:
        if (r6 != 0) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00df, code lost:
        setScrollState(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0167, code lost:
        if (r11 != false) goto L_0x00df;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            r19 = this;
            r13 = r19
            boolean r0 = r13.A0m
            r3 = 0
            if (r0 != 0) goto L_0x01db
            boolean r0 = r13.A0i
            if (r0 != 0) goto L_0x01db
            X.0u9 r0 = r13.A0U
            r4 = r20
            if (r0 != 0) goto L_0x0027
            int r0 = r4.getAction()
            if (r0 != 0) goto L_0x0022
            r0 = 0
        L_0x0018:
            r2 = 1
            if (r0 == 0) goto L_0x0039
            r13.A04()
            r13.setScrollState(r3)
            return r2
        L_0x0022:
            boolean r0 = r13.A11(r4)
            goto L_0x0018
        L_0x0027:
            r0.BeG(r4, r13)
            int r2 = r4.getAction()
            r1 = 3
            r0 = 1
            if (r2 == r1) goto L_0x0034
            if (r2 != r0) goto L_0x0037
        L_0x0034:
            r0 = 0
            r13.A0U = r0
        L_0x0037:
            r0 = 1
            goto L_0x0018
        L_0x0039:
            X.0Xs r0 = r13.A0S
            if (r0 == 0) goto L_0x01db
            boolean r5 = r0.A17()
            boolean r12 = r0.A18()
            android.view.VelocityTracker r0 = r13.A0D
            if (r0 != 0) goto L_0x004f
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r13.A0D = r0
        L_0x004f:
            int r9 = r4.getActionMasked()
            int r8 = r4.getActionIndex()
            if (r9 != 0) goto L_0x005f
            int[] r0 = r13.A17
            r0[r2] = r3
            r0[r3] = r3
        L_0x005f:
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r4)
            int[] r10 = r13.A17
            r0 = r10[r3]
            float r6 = (float) r0
            r0 = r10[r2]
            float r0 = (float) r0
            r1.offsetLocation(r6, r0)
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r9 == 0) goto L_0x01b4
            if (r9 == r2) goto L_0x0172
            r0 = 2
            if (r9 == r0) goto L_0x008d
            r0 = 3
            if (r9 == r0) goto L_0x0086
            X.AnonymousClass001.A16(r4, r13, r9, r8)
        L_0x007d:
            android.view.VelocityTracker r0 = r13.A0D
            r0.addMovement(r1)
        L_0x0082:
            r1.recycle()
            return r2
        L_0x0086:
            r13.A04()
            r13.setScrollState(r3)
            goto L_0x007d
        L_0x008d:
            int r0 = r13.A0A
            int r6 = r4.findPointerIndex(r0)
            if (r6 >= 0) goto L_0x00af
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            r1.append(r0)
            int r0 = r13.A0A
            r1.append(r0)
            java.lang.String r0 = " not found. Did any MotionEvents get skipped?"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r0 = "RecyclerView"
            android.util.Log.e(r0, r1)
            return r3
        L_0x00af:
            float r0 = r4.getX(r6)
            float r0 = r0 + r7
            int r9 = (int) r0
            float r0 = r4.getY(r6)
            float r0 = r0 + r7
            int r8 = (int) r0
            int r7 = r13.A07
            int r7 = r7 - r9
            int r6 = r13.A08
            int r6 = r6 - r8
            int r0 = r13.A0B
            if (r0 == r2) goto L_0x00e2
            if (r5 == 0) goto L_0x00d2
            int r0 = r13.A0C
            if (r7 <= 0) goto L_0x016b
            int r7 = X.AnonymousClass001.A0C(r7, r0, r3)
        L_0x00cf:
            r11 = 1
            if (r7 != 0) goto L_0x00d3
        L_0x00d2:
            r11 = 0
        L_0x00d3:
            if (r12 == 0) goto L_0x0167
            int r0 = r13.A0C
            if (r6 <= 0) goto L_0x0160
            int r6 = X.AnonymousClass001.A0C(r6, r0, r3)
        L_0x00dd:
            if (r6 == 0) goto L_0x0167
        L_0x00df:
            r13.setScrollState(r2)
        L_0x00e2:
            int r0 = r13.A0B
            if (r0 != r2) goto L_0x007d
            int[] r14 = r13.A18
            r14[r3] = r3
            r14[r2] = r3
            r16 = 0
            if (r5 == 0) goto L_0x00f2
            r16 = r7
        L_0x00f2:
            r17 = 0
            if (r12 == 0) goto L_0x00f8
            r17 = r6
        L_0x00f8:
            int[] r15 = r13.A19
            r18 = r3
            boolean r0 = r13.A13(r14, r15, r16, r17, r18)
            if (r0 == 0) goto L_0x011d
            r0 = r14[r3]
            int r7 = r7 - r0
            r0 = r14[r2]
            int r6 = r6 - r0
            r11 = r10[r3]
            r0 = r15[r3]
            int r11 = r11 + r0
            r10[r3] = r11
            r11 = r10[r2]
            r0 = r15[r2]
            int r11 = r11 + r0
            r10[r2] = r11
            android.view.ViewParent r0 = r13.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
        L_0x011d:
            r0 = r15[r3]
            int r9 = r9 - r0
            r13.A07 = r9
            r0 = r15[r2]
            int r8 = r8 - r0
            r13.A08 = r8
            if (r5 == 0) goto L_0x012a
            r3 = r7
        L_0x012a:
            r0 = 0
            if (r12 == 0) goto L_0x012e
            r0 = r6
        L_0x012e:
            boolean r0 = r13.A12(r4, r3, r0)
            if (r0 == 0) goto L_0x013b
            android.view.ViewParent r0 = r13.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
        L_0x013b:
            X.0mz r5 = r13.A0M
            if (r5 == 0) goto L_0x007d
            if (r7 != 0) goto L_0x0143
            if (r6 == 0) goto L_0x007d
        L_0x0143:
            boolean r0 = r13.A0j
            if (r0 == 0) goto L_0x0158
            long r3 = r5.A01
            r8 = 0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0158
            long r3 = java.lang.System.nanoTime()
            r5.A01 = r3
            r13.post(r5)
        L_0x0158:
            X.0ee r0 = r13.A0L
            r0.A01 = r7
            r0.A02 = r6
            goto L_0x007d
        L_0x0160:
            int r6 = r6 + r0
            int r6 = java.lang.Math.min(r3, r6)
            goto L_0x00dd
        L_0x0167:
            if (r11 == 0) goto L_0x00e2
            goto L_0x00df
        L_0x016b:
            int r7 = r7 + r0
            int r7 = java.lang.Math.min(r3, r7)
            goto L_0x00cf
        L_0x0172:
            android.view.VelocityTracker r0 = r13.A0D
            r0.addMovement(r1)
            android.view.VelocityTracker r6 = r13.A0D
            int r0 = r13.A0q
            float r4 = (float) r0
            r0 = 1000(0x3e8, float:1.401E-42)
            r6.computeCurrentVelocity(r0, r4)
            r7 = 0
            if (r5 == 0) goto L_0x01b2
            android.view.VelocityTracker r4 = r13.A0D
            int r0 = r13.A0A
            float r0 = r4.getXVelocity(r0)
            float r6 = -r0
        L_0x018d:
            if (r12 == 0) goto L_0x01b0
            android.view.VelocityTracker r4 = r13.A0D
            int r0 = r13.A0A
            float r0 = r4.getYVelocity(r0)
            float r5 = -r0
        L_0x0198:
            int r0 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x01a0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x01a8
        L_0x01a0:
            int r4 = (int) r6
            int r0 = (int) r5
            boolean r0 = r13.A10(r4, r0)
            if (r0 != 0) goto L_0x01ab
        L_0x01a8:
            r13.setScrollState(r3)
        L_0x01ab:
            r13.A04()
            goto L_0x0082
        L_0x01b0:
            r5 = 0
            goto L_0x0198
        L_0x01b2:
            r6 = 0
            goto L_0x018d
        L_0x01b4:
            int r0 = r4.getPointerId(r3)
            r13.A0A = r0
            float r0 = r4.getX()
            float r0 = r0 + r7
            int r0 = (int) r0
            r13.A07 = r0
            r13.A04 = r0
            float r0 = r4.getY()
            float r0 = r0 + r7
            int r0 = (int) r0
            r13.A08 = r0
            r13.A05 = r0
            if (r12 == 0) goto L_0x01d2
            r5 = r5 | 2
        L_0x01d2:
            X.0Qf r0 = r13.getScrollingChildHelper()
            r0.A05(r5, r3)
            goto L_0x007d
        L_0x01db:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestChildFocus(View view, View view2) {
        C04690Qg r0 = this.A0S.A06;
        if ((r0 == null || !r0.A05) && this.A09 <= 0 && view2 != null) {
            A0l(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.A14;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass0u9) arrayList.get(i)).Ba3(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.A06 != 0 || this.A0m) {
            this.A0n = true;
        } else {
            super.requestLayout();
        }
    }

    public void scrollBy(int i, int i2) {
        C06440Xs r2 = this.A0S;
        if (r2 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.A0m) {
            boolean A172 = r2.A17();
            boolean A182 = r2.A18();
            if (!A172) {
                if (A182) {
                    i = 0;
                } else {
                    return;
                }
            } else if (!A182) {
                i2 = 0;
            }
            A12((MotionEvent) null, i, i2);
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int A002;
        if (this.A09 > 0) {
            int i = 0;
            if (!(accessibilityEvent == null || (A002 = C05000Rm.A00(accessibilityEvent)) == 0)) {
                i = A002;
            }
            this.A03 |= i;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(AnonymousClass063 r1) {
        this.A0Y = r1;
        C06560Yg.A0O(this, r1);
    }

    public void setClipToPadding(boolean z) {
        if (z != this.A0d) {
            this.A0E = null;
            this.A0H = null;
            this.A0G = null;
            this.A0F = null;
        }
        this.A0d = z;
        super.setClipToPadding(z);
        if (this.A0g) {
            requestLayout();
        }
    }

    public void setItemAnimator(AnonymousClass0UY r3) {
        AnonymousClass0UY r0 = this.A0R;
        if (r0 != null) {
            r0.A07();
            this.A0R.A04 = null;
        }
        this.A0R = r3;
        if (r3 != null) {
            r3.A04 = this.A0Q;
        }
    }

    public void setItemViewCacheSize(int i) {
        C04870Qz r0 = this.A0w;
        r0.A00 = i;
        r0.A04();
    }

    public void setLayoutManager(C06440Xs r7) {
        C04870Qz r4;
        if (r7 != this.A0S) {
            A0T();
            if (this.A0S != null) {
                AnonymousClass0UY r0 = this.A0R;
                if (r0 != null) {
                    r0.A07();
                }
                C06440Xs r02 = this.A0S;
                r4 = this.A0w;
                r02.A0s(r4);
                this.A0S.A0t(r4);
                r4.A05.clear();
                r4.A03();
                if (this.A0j) {
                    C06440Xs r1 = this.A0S;
                    r1.A0B = false;
                    r1.A0w(r4, this);
                }
                C06440Xs r2 = this.A0S;
                r2.A07 = null;
                r2.A05 = null;
                r2.A03 = 0;
                r2.A00 = 0;
                r2.A04 = 1073741824;
                r2.A01 = 1073741824;
                this.A0S = null;
            } else {
                r4 = this.A0w;
                r4.A05.clear();
                r4.A03();
            }
            AnonymousClass0R0 r5 = this.A0K;
            r5.A00.A01();
            List list = r5.A02;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                r5.A01.BV3((View) list.get(size));
                list.remove(size);
            }
            RecyclerView recyclerView = ((C08480eY) r5.A01).A00;
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                recyclerView.A0k(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeAllViews();
            this.A0S = r7;
            if (r7 != null) {
                if (r7.A07 == null) {
                    r7.A07 = this;
                    r7.A05 = r5;
                    r7.A03 = getWidth();
                    r7.A00 = getHeight();
                    r7.A04 = 1073741824;
                    r7.A01 = 1073741824;
                    if (this.A0j) {
                        C06440Xs r12 = this.A0S;
                        r12.A0B = true;
                        r12.A10(this);
                    }
                } else {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("LayoutManager ");
                    A0o2.append(r7);
                    A0o2.append(" is already attached to a RecyclerView:");
                    throw AnonymousClass000.A0F(r7.A07.A0I(), A0o2);
                }
            }
            r4.A04();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw AnonymousClass001.A0c("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setRecycledViewPool(AnonymousClass0ON r4) {
        C04870Qz r2 = this.A0w;
        AnonymousClass0ON r1 = r2.A02;
        if (r1 != null) {
            r1.A00--;
        }
        r2.A02 = r4;
        if (r4 != null && r2.A08.A0N != null) {
            r4.A00++;
        }
    }

    public void setScrollState(int i) {
        C04690Qg r0;
        if (i != this.A0B) {
            this.A0B = i;
            if (i != 2) {
                C13230mq r1 = this.A0z;
                r1.A06.removeCallbacks(r1);
                r1.A03.abortAnimation();
                C06440Xs r02 = this.A0S;
                if (!(r02 == null || (r0 = r02.A06) == null)) {
                    r0.A01();
                }
            }
            C06440Xs r03 = this.A0S;
            if (r03 != null) {
                r03.A0Y(i);
            }
            A0Y(i);
            AnonymousClass0O5 r04 = this.A0V;
            if (r04 != null) {
                r04.A05(this, i);
            }
            List list = this.A0b;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((AnonymousClass0O5) this.A0b.get(size)).A05(this, i);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setViewCacheExtension(AnonymousClass0GX r2) {
        this.A0w.A03 = r2;
    }

    public final void suppressLayout(boolean z) {
        if (z != this.A0m) {
            A0t("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.A0m = false;
                if (!(!this.A0n || this.A0S == null || this.A0N == null)) {
                    requestLayout();
                }
                this.A0n = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.A0m = true;
            this.A0i = true;
            A0T();
        }
    }

    public static int A00(View view) {
        C05570Ua A022 = A02(view);
        if (A022 != null) {
            return A022.A01();
        }
        return -1;
    }

    public static int A01(View view) {
        C05570Ua A022 = A02(view);
        if (A022 != null) {
            return AnonymousClass001.A0J(A022);
        }
        return -1;
    }

    public static void A05(View view, Rect rect) {
        C002102g A0Y2 = AnonymousClass001.A0Y(view);
        Rect rect2 = A0Y2.A03;
        rect.set((view.getLeft() - rect2.left) - A0Y2.leftMargin, (view.getTop() - rect2.top) - A0Y2.topMargin, view.getRight() + rect2.right + A0Y2.rightMargin, view.getBottom() + rect2.bottom + A0Y2.bottomMargin);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if ((r1 & 4) == 0) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Rect A0C(android.view.View r11) {
        /*
            r10 = this;
            X.02g r8 = X.AnonymousClass001.A0Y(r11)
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x001a
            X.0Q1 r7 = r10.A0y
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x001d
            X.0Ua r0 = r8.A00
            int r1 = r0.A00
            r0 = r1 & 2
            if (r0 != 0) goto L_0x001a
            r0 = r1 & 4
            if (r0 == 0) goto L_0x001d
        L_0x001a:
            android.graphics.Rect r0 = r8.A03
            return r0
        L_0x001d:
            android.graphics.Rect r6 = r8.A03
            r5 = 0
            r6.set(r5, r5, r5, r5)
            java.util.ArrayList r4 = r10.A13
            int r3 = r4.size()
            r2 = 0
        L_0x002a:
            if (r2 >= r3) goto L_0x0059
            android.graphics.Rect r9 = r10.A0s
            r9.set(r5, r5, r5, r5)
            java.lang.Object r0 = r4.get(r2)
            X.0Ov r0 = (X.C04580Ov) r0
            r0.A03(r9, r11, r7, r10)
            int r1 = r6.left
            int r0 = r9.left
            int r1 = r1 + r0
            r6.left = r1
            int r1 = r6.top
            int r0 = r9.top
            int r1 = r1 + r0
            r6.top = r1
            int r1 = r6.right
            int r0 = r9.right
            int r1 = r1 + r0
            r6.right = r1
            int r1 = r6.bottom
            int r0 = r9.bottom
            int r1 = r1 + r0
            r6.bottom = r1
            int r2 = r2 + 1
            goto L_0x002a
        L_0x0059:
            r8.A01 = r5
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0C(android.view.View):android.graphics.Rect");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0012 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0E(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r1 = r3.getParent()
            if (r1 == 0) goto L_0x0010
            if (r1 == r2) goto L_0x0010
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x0010
            r3 = r1
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r1 == r2) goto L_0x0013
            r3 = 0
        L_0x0013:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0E(android.view.View):android.view.View");
    }

    public C05570Ua A0H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return AnonymousClass001.A0Y(view).A00;
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("View ");
        A0o2.append(view);
        throw AnonymousClass000.A0E(this, " is not a direct child of ", A0o2);
    }

    public String A0I() {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        AnonymousClass001.A1L(A0o2);
        A0o2.append(super.toString());
        A0o2.append(", adapter:");
        A0o2.append(this.A0N);
        A0o2.append(", layout:");
        A0o2.append(this.A0S);
        A0o2.append(", context:");
        return AnonymousClass000.A0R(getContext(), A0o2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0034, code lost:
        if (r4.A0R == null) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0V() {
        /*
            r4 = this;
            r4.A0S()
            int r0 = r4.A09
            int r0 = r0 + 1
            r4.A09 = r0
            X.0Q1 r3 = r4.A0y
            r0 = 6
            r3.A01(r0)
            X.0ec r0 = r4.A0J
            r0.A03()
            X.0R6 r0 = r4.A0N
            int r0 = r0.A0G()
            r3.A03 = r0
            r2 = 0
            r3.A00 = r2
            r3.A08 = r2
            X.0Xs r1 = r4.A0S
            X.0Qz r0 = r4.A0w
            r1.A0v(r0, r3)
            r3.A0C = r2
            r0 = 0
            r4.A0X = r0
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x0036
            X.0UY r1 = r4.A0R
            r0 = 1
            if (r1 != 0) goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            r3.A0B = r0
            r0 = 4
            r3.A04 = r0
            r0 = 1
            r4.A0u(r0)
            r4.A0w(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0V():void");
    }

    public void A0b(int i) {
        getScrollingChildHelper().A02(i);
    }

    public void A0d(int i, int i2) {
        setMeasuredDimension(C06440Xs.A01(i, AnonymousClass000.A02(this), AnonymousClass0YY.A02(this)), C06440Xs.A01(i2, AnonymousClass000.A03(this), AnonymousClass0YY.A01(this)));
    }

    public void A0i(int i, int[] iArr, int i2) {
        int i3;
        int i4;
        C05570Ua r0;
        A0S();
        this.A09++;
        AnonymousClass0RZ.A01("RV Scroll");
        AnonymousClass0Q1 r2 = this.A0y;
        if (getScrollState() == 2) {
            OverScroller overScroller = this.A0z.A03;
            overScroller.getFinalX();
            overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
        }
        if (i != 0) {
            i3 = this.A0S.A0G(this.A0w, r2, i);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = this.A0S.A0H(this.A0w, r2, i2);
        } else {
            i4 = 0;
        }
        AnonymousClass0RZ.A00();
        AnonymousClass0R0 r8 = this.A0K;
        int A012 = r8.A01();
        for (int i5 = 0; i5 < A012; i5++) {
            View A052 = r8.A05(i5);
            C05570Ua A0H2 = A0H(A052);
            if (!(A0H2 == null || (r0 = A0H2.A0B) == null)) {
                View view = r0.A0H;
                int left = A052.getLeft();
                int top = A052.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        A0u(true);
        A0w(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    public final void A0j(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A0A) {
            boolean A1T = AnonymousClass000.A1T(actionIndex);
            this.A0A = motionEvent.getPointerId(A1T ? 1 : 0);
            int x = (int) (motionEvent.getX(A1T) + 0.5f);
            this.A07 = x;
            this.A04 = x;
            int y = (int) (motionEvent.getY(A1T) + 0.5f);
            this.A08 = y;
            this.A05 = y;
        }
    }

    public void A0k(View view) {
        C05570Ua A022 = A02(view);
        AnonymousClass0R6 r0 = this.A0N;
        if (!(r0 == null || A022 == null)) {
            r0.A0I(A022);
        }
        List list = this.A0a;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((C16670tm) this.A0a.get(size)).BOu(view);
                } else {
                    return;
                }
            }
        }
    }

    public final void A0y(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5) {
        getScrollingChildHelper().A07(iArr, iArr2, i, i2, i3, i4, i5);
    }

    public final boolean A11(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.A14;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            AnonymousClass0u9 r1 = (AnonymousClass0u9) arrayList.get(i);
            if (!r1.BUh(motionEvent, this) || action == 3) {
                i++;
            } else {
                this.A0U = r1;
                return true;
            }
        }
        return false;
    }

    public boolean A13(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        return getScrollingChildHelper().A06(iArr, iArr2, i, i2, i3);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().A04(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().A03(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().A06(iArr, iArr2, i, i2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().A07(iArr, (int[]) null, i, i2, i3, i4, 0);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (r0.draw(r8) == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0078, code lost:
        if (r1 == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ae, code lost:
        if (r1 == false) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            super.draw(r8)
            java.util.ArrayList r3 = r7.A13
            int r4 = r3.size()
            r6 = 0
            r2 = 0
        L_0x000b:
            if (r2 >= r4) goto L_0x001b
            java.lang.Object r1 = r3.get(r2)
            X.0Ov r1 = (X.C04580Ov) r1
            X.0Q1 r0 = r7.A0y
            r1.A02(r8, r0, r7)
            int r2 = r2 + 1
            goto L_0x000b
        L_0x001b:
            android.widget.EdgeEffect r0 = r7.A0F
            if (r0 == 0) goto L_0x0116
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0116
            int r2 = r8.save()
            boolean r0 = r7.A0d
            if (r0 == 0) goto L_0x0113
            int r1 = r7.getPaddingBottom()
        L_0x0031:
            r0 = 1132920832(0x43870000, float:270.0)
            r8.rotate(r0)
            int r0 = r7.getHeight()
            int r0 = -r0
            int r0 = r0 + r1
            float r1 = (float) r0
            r0 = 0
            r8.translate(r1, r0)
            android.widget.EdgeEffect r0 = r7.A0F
            if (r0 == 0) goto L_0x004c
            boolean r0 = r0.draw(r8)
            r5 = 1
            if (r0 != 0) goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            r8.restoreToCount(r2)
        L_0x0050:
            android.widget.EdgeEffect r0 = r7.A0H
            if (r0 == 0) goto L_0x007f
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x007f
            int r2 = r8.save()
            boolean r0 = r7.A0d
            if (r0 == 0) goto L_0x006f
            int r0 = r7.getPaddingLeft()
            float r1 = (float) r0
            int r0 = r7.getPaddingTop()
            float r0 = (float) r0
            r8.translate(r1, r0)
        L_0x006f:
            android.widget.EdgeEffect r0 = r7.A0H
            if (r0 == 0) goto L_0x007a
            boolean r1 = r0.draw(r8)
            r0 = 1
            if (r1 != 0) goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            r5 = r5 | r0
            r8.restoreToCount(r2)
        L_0x007f:
            android.widget.EdgeEffect r0 = r7.A0G
            if (r0 == 0) goto L_0x00b5
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00b5
            int r4 = r8.save()
            int r2 = r7.getWidth()
            boolean r0 = r7.A0d
            if (r0 == 0) goto L_0x0111
            int r1 = r7.getPaddingTop()
        L_0x0099:
            r0 = 1119092736(0x42b40000, float:90.0)
            r8.rotate(r0)
            int r0 = -r1
            float r1 = (float) r0
            int r0 = -r2
            float r0 = (float) r0
            r8.translate(r1, r0)
            android.widget.EdgeEffect r0 = r7.A0G
            if (r0 == 0) goto L_0x00b0
            boolean r1 = r0.draw(r8)
            r0 = 1
            if (r1 != 0) goto L_0x00b1
        L_0x00b0:
            r0 = 0
        L_0x00b1:
            r5 = r5 | r0
            r8.restoreToCount(r4)
        L_0x00b5:
            android.widget.EdgeEffect r0 = r7.A0E
            if (r0 == 0) goto L_0x00f4
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00f4
            int r4 = r8.save()
            r0 = 1127481344(0x43340000, float:180.0)
            r8.rotate(r0)
            boolean r2 = r7.A0d
            int r0 = r7.getWidth()
            int r1 = -r0
            if (r2 == 0) goto L_0x010a
            int r0 = r7.getPaddingRight()
            int r1 = r1 + r0
            float r2 = (float) r1
            int r0 = r7.getHeight()
            int r1 = -r0
            int r0 = r7.getPaddingBottom()
            int r1 = r1 + r0
        L_0x00e1:
            float r0 = (float) r1
            r8.translate(r2, r0)
            android.widget.EdgeEffect r0 = r7.A0E
            if (r0 == 0) goto L_0x00f0
            boolean r0 = r0.draw(r8)
            if (r0 == 0) goto L_0x00f0
            r6 = 1
        L_0x00f0:
            r5 = r5 | r6
            r8.restoreToCount(r4)
        L_0x00f4:
            if (r5 != 0) goto L_0x0106
            X.0UY r1 = r7.A0R
            if (r1 == 0) goto L_0x0109
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x0109
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L_0x0109
        L_0x0106:
            X.AnonymousClass0YY.A05(r7)
        L_0x0109:
            return
        L_0x010a:
            float r2 = (float) r1
            int r0 = r7.getHeight()
            int r1 = -r0
            goto L_0x00e1
        L_0x0111:
            r1 = 0
            goto L_0x0099
        L_0x0113:
            r1 = 0
            goto L_0x0031
        L_0x0116:
            r5 = 0
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.draw(android.graphics.Canvas):void");
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public boolean hasNestedScrollingParent() {
        return AnonymousClass000.A1W(getScrollingChildHelper().A01);
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        if (r1 >= 30.0f) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            r2 = 0
            r4.A09 = r2
            r1 = 1
            r4.A0j = r1
            boolean r0 = r4.A0g
            if (r0 == 0) goto L_0x0061
            boolean r0 = r4.isLayoutRequested()
            if (r0 != 0) goto L_0x0061
        L_0x0013:
            r4.A0g = r1
            X.0Xs r1 = r4.A0S
            if (r1 == 0) goto L_0x001f
            r0 = 1
            r1.A0B = r0
            r1.A10(r4)
        L_0x001f:
            r4.A0o = r2
            java.lang.ThreadLocal r3 = X.C13320mz.A05
            java.lang.Object r0 = r3.get()
            X.0mz r0 = (X.C13320mz) r0
            r4.A0M = r0
            if (r0 != 0) goto L_0x0056
            X.0mz r0 = new X.0mz
            r0.<init>()
            r4.A0M = r0
            android.view.Display r1 = X.AnonymousClass0YH.A04(r4)
            boolean r0 = r4.isInEditMode()
            if (r0 != 0) goto L_0x005e
            if (r1 == 0) goto L_0x005e
            float r1 = r1.getRefreshRate()
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x005e
        L_0x004a:
            X.0mz r2 = r4.A0M
            r0 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r0 = r0 / r1
            long r0 = (long) r0
            r2.A00 = r0
            r3.set(r2)
        L_0x0056:
            X.0mz r0 = r4.A0M
            java.util.ArrayList r0 = r0.A02
            r0.add(r4)
            return
        L_0x005e:
            r1 = 1114636288(0x42700000, float:60.0)
            goto L_0x004a
        L_0x0061:
            r1 = 0
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass0UY r0 = this.A0R;
        if (r0 != null) {
            r0.A07();
        }
        A0T();
        this.A0j = false;
        C06440Xs r1 = this.A0S;
        if (r1 != null) {
            C04870Qz r02 = this.A0w;
            r1.A0B = false;
            r1.A0w(r02, this);
        }
        this.A15.clear();
        removeCallbacks(this.A0Z);
        do {
        } while (AnonymousClass0TA.A03.AwG() != null);
        C13320mz r03 = this.A0M;
        if (r03 != null) {
            r03.A02.remove(this);
            this.A0M = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.A13;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C04580Ov) arrayList.get(i)).A01(canvas, this.A0y, this);
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable parcelable;
        C008807b r1 = new C008807b(super.onSaveInstanceState());
        C008807b r0 = this.A0X;
        if (r0 != null) {
            parcelable = r0.A00;
        } else {
            C06440Xs r02 = this.A0S;
            if (r02 != null) {
                parcelable = r02.A0O();
            } else {
                parcelable = null;
            }
        }
        r1.A00 = parcelable;
        return r1;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            this.A0E = null;
            this.A0H = null;
            this.A0G = null;
            this.A0F = null;
        }
    }

    public void removeDetachedView(View view, boolean z) {
        C05570Ua A022 = A02(view);
        if (A022 != null) {
            int i = A022.A00;
            if ((i & 256) != 0) {
                A022.A00 = i & -257;
            } else if (!AnonymousClass000.A1S(i & 128)) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                A0o2.append(A022);
                throw AnonymousClass000.A0F(A0I(), A0o2);
            }
        }
        view.clearAnimation();
        A0k(view);
        super.removeDetachedView(view, z);
    }

    public void setEdgeEffectFactory(C02900Ia r2) {
        r2.getClass();
        this.A0P = r2;
        this.A0E = null;
        this.A0H = null;
        this.A0G = null;
        this.A0F = null;
    }

    public void setNestedScrollingEnabled(boolean z) {
        C04680Qf scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.A02) {
            AnonymousClass0YZ.A0A(scrollingChildHelper.A04);
        }
        scrollingChildHelper.A02 = z;
    }

    public void setScrollingTouchSlop(int i) {
        int i2;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("setScrollingTouchSlop(): bad argument constant ");
                A0o2.append(i);
                Log.w("RecyclerView", AnonymousClass000.A0X("; using default value", A0o2));
            } else {
                i2 = viewConfiguration.getScaledPagingTouchSlop();
                this.A0C = i2;
            }
        }
        i2 = viewConfiguration.getScaledTouchSlop();
        this.A0C = i2;
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().A05(i, 0);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().A02(0);
    }

    public void A0Y(int i) {
    }

    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void setHasFixedSize(boolean z) {
        this.A0h = z;
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setOnFlingListener(C04110Mv r1) {
        this.A0T = r1;
    }

    @Deprecated
    public void setOnScrollListener(AnonymousClass0O5 r1) {
        this.A0V = r1;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.A0p = z;
    }

    public void setRecyclerListener(C16030sM r1) {
        this.A0W = r1;
    }

    public void addFocusables(ArrayList arrayList, int i, int i2) {
        super.addFocusables(arrayList, i, i2);
    }

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C06440Xs r0 = this.A0S;
        if (r0 != null) {
            return r0.A0U(layoutParams);
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("RecyclerView has no LayoutManager");
        throw AnonymousClass000.A0I(A0I(), A0o2);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
    }
}
