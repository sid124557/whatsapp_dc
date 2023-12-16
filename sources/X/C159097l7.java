package X;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.7l7  reason: invalid class name and case insensitive filesystem */
public abstract class C159097l7 {
    public static final TimeInterpolator A0M = C159917mg.A03;
    public static final TimeInterpolator A0N = C159917mg.A04;
    public static final TimeInterpolator A0O = C159917mg.A02;
    public static final Handler A0P = new Handler(Looper.getMainLooper(), new C162947t1());
    public static final String A0Q = C159097l7.class.getSimpleName();
    public static final int[] A0R;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public C110075fe A06;
    public C178918iJ A07 = new C170128Bz(this);
    public List A08;
    public boolean A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final TimeInterpolator A0D;
    public final TimeInterpolator A0E;
    public final TimeInterpolator A0F;
    public final Context A0G;
    public final ViewGroup A0H;
    public final AccessibilityManager A0I;
    public final AnonymousClass6FH A0J;
    public final C178908iI A0K;
    public final Runnable A0L = new C172668Mf(this, 36);

    static {
        int[] A0E2 = C18330xA.A0E();
        A0E2[0] = R.attr.f3nameremoved;
        A0R = A0E2;
    }

    public void A03() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = this.A0J.getRootWindowInsets()) != null) {
            this.A02 = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            A07();
        }
    }

    public final void A06() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.A0I;
        if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
            this.A0J.post(new C172668Mf(this, 38));
            return;
        }
        AnonymousClass6FH r1 = this.A0J;
        if (r1.getParent() != null) {
            r1.setVisibility(0);
        }
        A04();
    }

    public final void A07() {
        int i;
        AnonymousClass6FH r2 = this.A0J;
        ViewGroup.LayoutParams layoutParams = r2.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || r2.A03 == null) {
            Log.w(A0Q, "Unable to update margins because layout params are not MarginLayoutParams");
        } else if (r2.getParent() != null) {
            C110075fe r0 = this.A06;
            if (r0 == null || r0.A00.get() == null) {
                i = this.A03;
            } else {
                i = this.A01;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Rect rect = r2.A03;
            marginLayoutParams.bottomMargin = rect.bottom + i;
            marginLayoutParams.leftMargin = rect.left + this.A04;
            marginLayoutParams.rightMargin = rect.right + this.A05;
            marginLayoutParams.topMargin = rect.top;
            r2.requestLayout();
            if (Build.VERSION.SDK_INT >= 29 && this.A02 > 0) {
                ViewGroup.LayoutParams layoutParams2 = r2.getLayoutParams();
                if ((layoutParams2 instanceof C002002f) && (((C002002f) layoutParams2).A0A instanceof SwipeDismissBehavior)) {
                    Runnable runnable = this.A0L;
                    r2.removeCallbacks(runnable);
                    r2.post(runnable);
                }
            }
        }
    }

    public void A0A(C150387Ql r2) {
        if (r2 != null) {
            List list = this.A08;
            if (list == null) {
                list = AnonymousClass001.A0s();
                this.A08 = list;
            }
            list.add(r2);
        }
    }

    public int A0C() {
        return this.A00;
    }

    public C159097l7(Context context, View view, ViewGroup viewGroup, C178908iI r9) {
        if (view == null) {
            throw AnonymousClass001.A0c("Transient bottom bar must have non-null content");
        } else if (r9 != null) {
            this.A0H = viewGroup;
            this.A0K = r9;
            this.A0G = context;
            C161837qd.A04(context, "Theme.AppCompat", C161837qd.A00);
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = this.A0G.obtainStyledAttributes(A0R);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            AnonymousClass6FH r2 = (AnonymousClass6FH) from.inflate(resourceId != -1 ? R.layout.f8nameremoved : R.layout.f8nameremoved, viewGroup, false);
            this.A0J = r2;
            r2.A05 = this;
            if (view instanceof SnackbarContentLayout) {
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
                float f = r2.A07;
                if (f != 1.0f) {
                    snackbarContentLayout.A01.setTextColor(AnonymousClass5ZV.A00(f, AnonymousClass5ZV.A02(snackbarContentLayout, R.attr.f3nameremoved), snackbarContentLayout.A01.getCurrentTextColor()));
                }
                snackbarContentLayout.A00 = r2.A09;
            }
            r2.addView(view);
            C06360Xi.A01(r2, 1);
            AnonymousClass0YY.A06(r2, 1);
            r2.setFitsSystemWindows(true);
            AnonymousClass0YZ.A0E(r2, new AnonymousClass92E(this, 2));
            C06560Yg.A0O(r2, new C188778zT(this, 10));
            this.A0I = (AccessibilityManager) context.getSystemService("accessibility");
            this.A0C = C160907oe.A00(context, R.attr.f3nameremoved, 250);
            this.A0A = C160907oe.A00(context, R.attr.f3nameremoved, 150);
            this.A0B = C160907oe.A00(context, R.attr.f3nameremoved, 75);
            this.A0D = AnonymousClass5YH.A01(A0M, context, R.attr.f3nameremoved);
            this.A0E = AnonymousClass5YH.A01(A0N, context, R.attr.f3nameremoved);
            this.A0F = AnonymousClass5YH.A01(A0O, context, R.attr.f3nameremoved);
        } else {
            throw AnonymousClass001.A0c("Transient bottom bar must have non-null callback");
        }
    }

    public void A04() {
        C158937ko A002 = C158937ko.A00();
        C178918iJ r0 = this.A07;
        synchronized (A002.A03) {
            if (A002.A05(r0)) {
                A002.A04(A002.A00);
            }
        }
        List list = this.A08;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    this.A08.get(size);
                } else {
                    return;
                }
            }
        }
    }

    public void A05() {
        C158937ko A002 = C158937ko.A00();
        int A0C2 = A0C();
        C178918iJ r3 = this.A07;
        synchronized (A002.A03) {
            if (A002.A05(r3)) {
                AnonymousClass7K0 r1 = A002.A00;
                r1.A00 = A0C2;
                A002.A02.removeCallbacksAndMessages(r1);
                A002.A04(A002.A00);
            } else {
                AnonymousClass7K0 r12 = A002.A01;
                if (r12 == null || r3 == null || r12.A02.get() != r3) {
                    A002.A01 = new AnonymousClass7K0(r3, A0C2);
                } else {
                    r12.A00 = A0C2;
                }
                AnonymousClass7K0 r13 = A002.A00;
                if (r13 == null || !A002.A06(r13, 4)) {
                    A002.A00 = null;
                    A002.A01();
                }
            }
        }
    }

    public void A08(int i) {
        C158937ko A002 = C158937ko.A00();
        C178918iJ r3 = this.A07;
        synchronized (A002.A03) {
            if (A002.A05(r3)) {
                A002.A06(A002.A00, i);
            } else {
                AnonymousClass7K0 r1 = A002.A01;
                if (!(r1 == null || r3 == null || r1.A02.get() != r3)) {
                    A002.A06(r1, i);
                }
            }
        }
    }

    public void A09(int i) {
        C158937ko A002 = C158937ko.A00();
        C178918iJ r0 = this.A07;
        synchronized (A002.A03) {
            if (A002.A05(r0)) {
                A002.A00 = null;
                if (A002.A01 != null) {
                    A002.A01();
                }
            }
        }
        List list = this.A08;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((C150387Ql) this.A08.get(size)).A00(this, i);
            }
        }
        AnonymousClass6FH r2 = this.A0J;
        ViewParent parent = r2.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(r2);
        }
    }

    public boolean A0B() {
        boolean A052;
        C158937ko A002 = C158937ko.A00();
        C178918iJ r0 = this.A07;
        synchronized (A002.A03) {
            A052 = A002.A05(r0);
        }
        return A052;
    }
}
