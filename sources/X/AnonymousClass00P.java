package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.whatsapp.R;

/* renamed from: X.00P  reason: invalid class name */
public final class AnonymousClass00P extends Dialog {
    public static final C16290sm A0H = new C17730w9(2);
    public static final C16290sm A0I = new C17730w9(3);
    public float A00 = 1.0f;
    public float A01 = 1.0f;
    public int A02 = -16777216;
    public Context A03;
    public View A04;
    public FrameLayout A05;
    public AnonymousClass0LP A06;
    public C16290sm A07 = new C17730w9(1);
    public C16290sm A08 = A0I;
    public C002202q A09;
    public boolean A0A = true;
    public boolean A0B = true;
    public boolean A0C = true;
    public boolean A0D = false;
    public boolean A0E = true;
    public final Handler A0F = AnonymousClass000.A0A();
    public final AnonymousClass0OC A0G = new AnonymousClass0OC(this);

    public void show() {
        C16290sm r0;
        AccessibilityManager accessibilityManager;
        this.A0D = false;
        C002202q r3 = this.A09;
        r3.A07.A02();
        r3.A0C = true;
        super.show();
        Context context = this.A03;
        if ((!Boolean.getBoolean("is_accessibility_enabled") && (context == null || (accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility")) == null || !accessibilityManager.isTouchExplorationEnabled())) || (r0 = this.A07) == null) {
            r0 = this.A08;
        }
        r3.A02(r0, -1);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(float r5) {
        /*
            r4 = this;
            float r1 = r4.A01
            float r1 = r1 * r5
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L_0x0039
            android.view.View r3 = r0.getDecorView()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r0 = 0
            android.view.View r0 = r3.getChildAt(r0)
            if (r0 == 0) goto L_0x0017
            r3 = r0
        L_0x0017:
            int r2 = r4.A02
            r0 = 0
            float r1 = java.lang.Math.max(r0, r1)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.min(r0, r1)
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            int r2 = X.AnonymousClass0YI.A06(r2, r0)
            android.graphics.drawable.Drawable r1 = r3.getBackground()
            boolean r0 = r1 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L_0x003a
            android.graphics.drawable.ColorDrawable r1 = (android.graphics.drawable.ColorDrawable) r1
        L_0x0036:
            r1.setColor(r2)
        L_0x0039:
            return
        L_0x003a:
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r1.<init>()
            X.AnonymousClass0YY.A04(r1, r3)
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass00P.A02(float):void");
    }

    public void A03(AnonymousClass0FG r6) {
        int i;
        AnonymousClass0LP r0 = this.A06;
        if (r0 != null) {
            C09630gV r4 = r0.A01;
            Context context = r0.A00;
            if (r6 != AnonymousClass0FG.BACK_BUTTON) {
                int ordinal = r6.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 2) {
                        i = 4;
                    } else if (ordinal == 3) {
                        i = 5;
                    }
                    r4.A00 = i;
                } else {
                    r4.A00 = 3;
                }
            } else {
                r4.A03(context);
                r4.A00 = 2;
                return;
            }
        }
        super.cancel();
    }

    public void cancel() {
        A03(AnonymousClass0FG.OTHER);
    }

    public void onBackPressed() {
        if (this.A0B) {
            A03(AnonymousClass0FG.BACK_BUTTON);
        }
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        View view2 = this.A04;
        if (view2 != null) {
            this.A09.removeView(view2);
        }
        this.A04 = view;
        C002202q r0 = this.A09;
        if (layoutParams == null) {
            r0.addView(view);
        } else {
            r0.addView(view, layoutParams);
        }
    }

    public AnonymousClass00P(Context context) {
        super(context, R.style.f12nameremoved);
        Context context2 = getContext();
        this.A03 = context2;
        C002202q r4 = new C002202q(context2);
        this.A09 = r4;
        r4.A05 = this.A0G;
        r4.A00 = -1;
        r4.A03(new C16290sm[]{A0H, this.A08, this.A07}, true);
        C002202q r1 = this.A09;
        r1.A04 = new C03490Kk(this);
        r1.setFitsSystemWindows(true);
        this.A09.A07.A02();
        FrameLayout frameLayout = new FrameLayout(this.A03);
        this.A05 = frameLayout;
        frameLayout.addView(this.A09);
        super.setContentView(this.A05);
        C06560Yg.A0O(this.A09, new C17550vl(this, 1));
    }

    public void A00() {
        InputMethodManager A0C2;
        View currentFocus = getCurrentFocus();
        if (!(currentFocus == null || (A0C2 = AnonymousClass000.A0C(currentFocus)) == null)) {
            A0C2.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
        super.dismiss();
    }

    public final void A01() {
        InputMethodManager A0C2;
        Window window = getWindow();
        C002202q r3 = this.A09;
        if (!r3.hasWindowFocus()) {
            A00();
        }
        if (window != null) {
            window.setFlags(8, 8);
        }
        this.A0D = true;
        if (!this.A0A && this.A01 != 0.0f) {
            this.A01 = 0.0f;
            A02(this.A00);
        }
        r3.A07.A02();
        r3.A02(A0H, -1);
        r3.setInteractable(false);
        View currentFocus = getCurrentFocus();
        if (currentFocus != null && (A0C2 = AnonymousClass000.A0C(currentFocus)) != null) {
            A0C2.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public void dismiss() {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.A0F;
        if (myLooper == handler.getLooper()) {
            A01();
        } else {
            handler.post(new C11220jI(this));
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            return true;
        }
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        this.A0B = z;
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        this.A0C = z;
    }

    public void setContentView(int i) {
        setContentView(AnonymousClass001.A0R(LayoutInflater.from(getContext()), this.A09, i), (ViewGroup.LayoutParams) null);
    }

    public void setContentView(View view) {
        setContentView(view, (ViewGroup.LayoutParams) null);
    }
}
