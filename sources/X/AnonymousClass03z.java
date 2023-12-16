package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.03z  reason: invalid class name */
public class AnonymousClass03z extends AnonymousClass0R8 implements C14490pm {
    public static final Interpolator A0R = new AccelerateInterpolator();
    public static final Interpolator A0S = new DecelerateInterpolator();
    public int A00 = 0;
    public Activity A01;
    public Context A02;
    public Context A03;
    public View A04;
    public AnonymousClass04C A05;
    public C16910uE A06;
    public AnonymousClass0R2 A07;
    public C04410Oc A08;
    public ActionBarContainer A09;
    public ActionBarContextView A0A;
    public ActionBarOverlayLayout A0B;
    public C17020uQ A0C;
    public ArrayList A0D = AnonymousClass001.A0s();
    public ArrayList A0E = AnonymousClass001.A0s();
    public boolean A0F = true;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L = true;
    public boolean A0M;
    public boolean A0N;
    public final AnonymousClass0u4 A0O = new C17580vo(this, 3);
    public final AnonymousClass0u4 A0P = new C17580vo(this, 4);
    public final C15010qd A0Q = new C08170dR(this);

    public void A0F(Drawable drawable) {
        C07580bG r0 = (C07580bG) this.A0C;
        r0.A04 = null;
        r0.A00();
    }

    public void A0N(boolean z) {
        int i = 0;
        if (z) {
            i = 4;
        }
        A0Y(i, 4);
    }

    public void A0P(boolean z) {
        int i = 0;
        if (z) {
            i = 2;
        }
        A0Y(i, 2);
    }

    public float A00() {
        return AnonymousClass0YZ.A00(this.A09);
    }

    public int A01() {
        return ((C07580bG) this.A0C).A01;
    }

    public Context A02() {
        Context context = this.A03;
        if (context == null) {
            TypedValue typedValue = new TypedValue();
            this.A02.getTheme().resolveAttribute(R.attr.f3nameremoved, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                context = new ContextThemeWrapper(this.A02, i);
            } else {
                context = this.A02;
            }
            this.A03 = context;
        }
        return context;
    }

    public View A03() {
        return ((C07580bG) this.A0C).A06;
    }

    public AnonymousClass0R2 A04(C16910uE r4) {
        AnonymousClass04C r0 = this.A05;
        if (r0 != null) {
            r0.A05();
        }
        this.A0B.setHideOnContentScrollEnabled(false);
        this.A0A.A03();
        AnonymousClass04C r2 = new AnonymousClass04C(this.A0A.getContext(), this, r4);
        C07890cz r1 = r2.A03;
        r1.A08();
        try {
            if (!r2.A00.BQL(r1, r2)) {
                return null;
            }
            this.A05 = r2;
            r2.A06();
            this.A0A.A05(r2);
            A0a(true);
            this.A0A.sendAccessibilityEvent(32);
            return r2;
        } finally {
            r1.A07();
        }
    }

    public void A06() {
        if (!this.A0H) {
            this.A0H = true;
            A0b(false);
        }
    }

    public void A07() {
        if (this.A0H) {
            this.A0H = false;
            A0b(false);
        }
    }

    public void A08(float f) {
        AnonymousClass0YZ.A0B(this.A09, f);
    }

    public void A09(int i) {
        C07580bG r2 = (C07580bG) this.A0C;
        r2.Bmf(AnonymousClass0XW.A01(r2.A09.getContext(), R.drawable.ic_pip_close));
    }

    public void A0A(int i) {
        A0I(this.A02.getString(i));
    }

    public void A0B(int i) {
        A0J(this.A02.getString(i));
    }

    public void A0C(Configuration configuration) {
        this.A02.getResources().getBoolean(R.bool.f4nameremoved);
        this.A09.setTabContainer((AnonymousClass03P) null);
        ((C07580bG) this.A0C).A09.setCollapsible(false);
        this.A0B.A0G = false;
    }

    public void A0D(Drawable drawable) {
        this.A09.setPrimaryBackground(drawable);
    }

    public void A0E(Drawable drawable) {
        this.A0C.Bmf(drawable);
    }

    public void A0G(View view) {
        this.A0C.Bm8(view);
    }

    public void A0I(CharSequence charSequence) {
        this.A0C.BnV(charSequence);
    }

    public void A0J(CharSequence charSequence) {
        this.A0C.BnZ(charSequence);
    }

    public void A0K(CharSequence charSequence) {
        this.A0C.setWindowTitle(charSequence);
    }

    public void A0L(boolean z) {
        if (z != this.A0K) {
            this.A0K = z;
            ArrayList arrayList = this.A0D;
            if (0 < arrayList.size()) {
                arrayList.get(0);
                throw AnonymousClass001.A0g("onMenuVisibilityChanged");
            }
        }
    }

    public void A0M(boolean z) {
        if (!this.A0G) {
            A0N(z);
        }
    }

    public void A0O(boolean z) {
        A0Y(16, 16);
    }

    public void A0Q(boolean z) {
        int i = 0;
        if (z) {
            i = 8;
        }
        A0Y(i, 8);
    }

    public void A0R(boolean z) {
        C04410Oc r0;
        this.A0M = z;
        if (!z && (r0 = this.A08) != null) {
            r0.A00();
        }
    }

    public boolean A0V() {
        AnonymousClass0b8 r0;
        C07910d1 r02;
        C17020uQ r03 = this.A0C;
        if (r03 == null || (r0 = ((C07580bG) r03).A09.A0Q) == null || (r02 = r0.A01) == null) {
            return false;
        }
        r02.collapseActionView();
        return true;
    }

    public boolean A0W(int i, KeyEvent keyEvent) {
        AnonymousClass04C r0 = this.A05;
        if (r0 == null) {
            return false;
        }
        C07890cz r2 = r0.A03;
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() == 1) {
            z = false;
        }
        r2.setQwertyMode(z);
        return r2.performShortcut(i, keyEvent, 0);
    }

    public void A0Y(int i, int i2) {
        C17020uQ r2 = this.A0C;
        int i3 = ((C07580bG) r2).A01;
        if ((i2 & 4) != 0) {
            this.A0G = true;
        }
        r2.BmB((i & i2) | ((~i2) & i3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0a(boolean r9) {
        /*
            r8 = this;
            boolean r0 = r8.A0N
            if (r9 == 0) goto L_0x00cc
            if (r0 != 0) goto L_0x000d
            r0 = 1
            r8.A0N = r0
            r0 = 0
        L_0x000a:
            r8.A0b(r0)
        L_0x000d:
            androidx.appcompat.widget.ActionBarContainer r0 = r8.A09
            boolean r0 = X.C06360Xi.A05(r0)
            r4 = 8
            r3 = 0
            if (r0 == 0) goto L_0x00d3
            X.0uQ r7 = r8.A0C
            if (r9 == 0) goto L_0x0090
            r4 = 4
            r0 = 100
            X.0bG r7 = (X.C07580bG) r7
            androidx.appcompat.widget.Toolbar r2 = r7.A09
            X.0Qv r6 = X.C06560Yg.A05(r2)
            r5 = 0
            r6.A03(r5)
            r6.A08(r0)
            X.0vn r0 = new X.0vn
            r0.<init>(r7, r4)
            r6.A0A(r0)
            androidx.appcompat.widget.ActionBarContextView r4 = r8.A0A
            r0 = 200(0xc8, double:9.9E-322)
            X.0Qv r2 = r4.A0C
            if (r2 == 0) goto L_0x0041
            r2.A01()
        L_0x0041:
            int r2 = r4.getVisibility()
            if (r2 == 0) goto L_0x004a
            r4.setAlpha(r5)
        L_0x004a:
            X.0Qv r5 = X.C06560Yg.A05(r4)
            r2 = 1065353216(0x3f800000, float:1.0)
            r5.A03(r2)
            r5.A08(r0)
            X.0dQ r1 = r4.A0J
            androidx.appcompat.widget.ActionBarContextView r0 = r1.A02
            r0.A0C = r5
            r1.A00 = r3
            r5.A0A(r1)
        L_0x0061:
            X.0Oc r4 = new X.0Oc
            r4.<init>()
            java.util.ArrayList r3 = r4.A05
            r3.add(r6)
            android.view.View r0 = X.C04830Qv.A00(r6)
            if (r0 == 0) goto L_0x008d
            android.view.ViewPropertyAnimator r0 = r0.animate()
            long r1 = r0.getDuration()
        L_0x0079:
            android.view.View r0 = X.C04830Qv.A00(r5)
            if (r0 == 0) goto L_0x0086
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.setStartDelay(r1)
        L_0x0086:
            r3.add(r5)
            r4.A01()
            return
        L_0x008d:
            r1 = 0
            goto L_0x0079
        L_0x0090:
            r1 = 200(0xc8, double:9.9E-322)
            X.0bG r7 = (X.C07580bG) r7
            androidx.appcompat.widget.Toolbar r0 = r7.A09
            X.0Qv r5 = X.C06560Yg.A05(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.A03(r0)
            r5.A08(r1)
            X.0vn r0 = new X.0vn
            r0.<init>(r7, r3)
            r5.A0A(r0)
            androidx.appcompat.widget.ActionBarContextView r3 = r8.A0A
            r1 = 100
            X.0Qv r0 = r3.A0C
            if (r0 == 0) goto L_0x00b5
            r0.A01()
        L_0x00b5:
            r0 = 0
            X.0Qv r6 = X.C06560Yg.A05(r3)
            r6.A03(r0)
            r6.A08(r1)
            X.0dQ r1 = r3.A0J
            androidx.appcompat.widget.ActionBarContextView r0 = r1.A02
            r0.A0C = r6
            r1.A00 = r4
            r6.A0A(r1)
            goto L_0x0061
        L_0x00cc:
            if (r0 == 0) goto L_0x000d
            r0 = 0
            r8.A0N = r0
            goto L_0x000a
        L_0x00d3:
            X.0uQ r0 = r8.A0C
            if (r9 == 0) goto L_0x00e5
            r1 = 4
            X.0bG r0 = (X.C07580bG) r0
            androidx.appcompat.widget.Toolbar r0 = r0.A09
            r0.setVisibility(r1)
            androidx.appcompat.widget.ActionBarContextView r0 = r8.A0A
            r0.setVisibility(r3)
            return
        L_0x00e5:
            X.0bG r0 = (X.C07580bG) r0
            androidx.appcompat.widget.Toolbar r0 = r0.A09
            r0.setVisibility(r3)
            androidx.appcompat.widget.ActionBarContextView r0 = r8.A0A
            r0.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass03z.A0a(boolean):void");
    }

    public final void A0b(boolean z) {
        boolean z2;
        View view;
        AnonymousClass0H3 r1;
        View view2;
        View view3;
        AnonymousClass0H3 r12;
        boolean z3 = this.A0H;
        boolean z4 = this.A0I;
        if (this.A0N || (!z3 && !z4)) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = this.A0L;
        if (z2) {
            if (!z5) {
                this.A0L = true;
                C04410Oc r0 = this.A08;
                if (r0 != null) {
                    r0.A00();
                }
                this.A09.setVisibility(0);
                if (this.A00 != 0 || (!this.A0M && !z)) {
                    this.A09.setAlpha(1.0f);
                    this.A09.setTranslationY(0.0f);
                    if (this.A0F && (view2 = this.A04) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    this.A0P.BMQ((View) null);
                } else {
                    this.A09.setTranslationY(0.0f);
                    float f = (float) (-this.A09.getHeight());
                    if (z) {
                        int[] iArr = {0, 0};
                        this.A09.getLocationInWindow(iArr);
                        f -= (float) iArr[1];
                    }
                    this.A09.setTranslationY(f);
                    C04410Oc r3 = new C04410Oc();
                    C04830Qv A052 = C06560Yg.A05(this.A09);
                    A052.A07(0.0f);
                    C15010qd r5 = this.A0Q;
                    View A002 = C04830Qv.A00(A052);
                    if (A002 != null) {
                        if (r5 != null) {
                            r12 = new AnonymousClass0H3(A002, 0, r5);
                        } else {
                            r12 = null;
                        }
                        AnonymousClass0IA.A00(r12, A002.animate());
                    }
                    if (!r3.A03) {
                        r3.A05.add(A052);
                    }
                    if (this.A0F && (view3 = this.A04) != null) {
                        view3.setTranslationY(f);
                        C04830Qv A053 = C06560Yg.A05(view3);
                        A053.A07(0.0f);
                        if (!r3.A03) {
                            r3.A05.add(A053);
                        }
                    }
                    Interpolator interpolator = A0S;
                    boolean z6 = r3.A03;
                    if (!z6) {
                        r3.A01 = interpolator;
                        r3.A00 = 250;
                    }
                    AnonymousClass0u4 r02 = this.A0P;
                    if (!z6) {
                        r3.A02 = r02;
                    }
                    this.A08 = r3;
                    r3.A01();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.A0B;
                if (actionBarOverlayLayout != null) {
                    AnonymousClass0V0.A02(actionBarOverlayLayout);
                }
            }
        } else if (z5) {
            this.A0L = false;
            C04410Oc r03 = this.A08;
            if (r03 != null) {
                r03.A00();
            }
            if (this.A00 != 0 || (!this.A0M && !z)) {
                this.A0O.BMQ((View) null);
                return;
            }
            this.A09.setAlpha(1.0f);
            this.A09.setTransitioning(true);
            C04410Oc r32 = new C04410Oc();
            float f2 = (float) (-this.A09.getHeight());
            if (z) {
                int[] iArr2 = {0, 0};
                this.A09.getLocationInWindow(iArr2);
                f2 -= (float) iArr2[1];
            }
            C04830Qv A054 = C06560Yg.A05(this.A09);
            A054.A07(f2);
            C15010qd r4 = this.A0Q;
            View A003 = C04830Qv.A00(A054);
            if (A003 != null) {
                if (r4 != null) {
                    r1 = new AnonymousClass0H3(A003, 0, r4);
                } else {
                    r1 = null;
                }
                AnonymousClass0IA.A00(r1, A003.animate());
            }
            if (!r32.A03) {
                r32.A05.add(A054);
            }
            if (this.A0F && (view = this.A04) != null) {
                C04830Qv A055 = C06560Yg.A05(view);
                A055.A07(f2);
                if (!r32.A03) {
                    r32.A05.add(A055);
                }
            }
            Interpolator interpolator2 = A0R;
            boolean z7 = r32.A03;
            if (!z7) {
                r32.A01 = interpolator2;
                r32.A00 = 250;
            }
            AnonymousClass0u4 r04 = this.A0O;
            if (!z7) {
                r32.A02 = r04;
            }
            this.A08 = r32;
            r32.A01();
        }
    }

    public AnonymousClass03z(Activity activity, boolean z) {
        this.A01 = activity;
        View A0Q2 = AnonymousClass001.A0Q(activity);
        A0Z(A0Q2);
        if (!z) {
            this.A04 = A0Q2.findViewById(16908290);
        }
    }

    public void A0H(View view, C001902e r3) {
        view.setLayoutParams(r3);
        this.A0C.Bm8(view);
    }

    public final void A0Z(View view) {
        String str;
        C17020uQ wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.A0B = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof C17020uQ) {
            wrapper = (C17020uQ) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Can't make a decor toolbar out of ");
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            throw AnonymousClass000.A0I(str, A0o);
        }
        this.A0C = wrapper;
        this.A0A = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.A09 = actionBarContainer;
        C17020uQ r1 = this.A0C;
        if (r1 == null || this.A0A == null || actionBarContainer == null) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            AnonymousClass000.A1A(this, A0o2);
            throw AnonymousClass000.A0I(" can only be used with a compatible window decor layout", A0o2);
        }
        Context context = ((C07580bG) r1).A09.getContext();
        this.A02 = context;
        if ((((C07580bG) this.A0C).A01 & 4) != 0) {
            this.A0G = true;
        }
        context.getApplicationInfo();
        context.getResources().getBoolean(R.bool.f4nameremoved);
        this.A09.setTabContainer((AnonymousClass03P) null);
        ((C07580bG) this.A0C).A09.setCollapsible(false);
        this.A0B.A0G = false;
        TypedArray obtainStyledAttributes = this.A02.obtainStyledAttributes((AttributeSet) null, AnonymousClass0KC.A00, R.attr.f3nameremoved, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.A0B;
            if (actionBarOverlayLayout2.A0J) {
                this.A0J = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw AnonymousClass001.A0e("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            A08((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public AnonymousClass03z(Dialog dialog) {
        A0Z(dialog.getWindow().getDecorView());
    }
}
