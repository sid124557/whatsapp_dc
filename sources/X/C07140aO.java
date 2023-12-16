package X;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewManager;
import android.view.accessibility.AccessibilityManager;

/* renamed from: X.0aO  reason: invalid class name and case insensitive filesystem */
public class C07140aO implements View.OnLongClickListener, View.OnAttachStateChangeListener, View.OnHoverListener {
    public static C07140aO A09;
    public static C07140aO A0A;
    public int A00;
    public int A01;
    public C03940Md A02;
    public boolean A03;
    public final int A04;
    public final View A05;
    public final CharSequence A06;
    public final Runnable A07 = new C10830ia(this);
    public final Runnable A08 = new C10820iZ(this);

    public static void A00(C07140aO r4) {
        C07140aO r0 = A0A;
        if (r0 != null) {
            r0.A05.removeCallbacks(r0.A08);
        }
        A0A = r4;
        if (r4 != null) {
            r4.A05.postDelayed(r4.A08, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    public void A01() {
        if (A09 == this) {
            A09 = null;
            C03940Md r1 = this.A02;
            if (r1 != null) {
                View view = r1.A02;
                if (view.getParent() != null) {
                    ((ViewManager) r1.A00.getSystemService("window")).removeView(view);
                }
                this.A02 = null;
                this.A00 = Integer.MAX_VALUE;
                this.A01 = Integer.MAX_VALUE;
                this.A05.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (A0A == this) {
            A00((C07140aO) null);
        }
        this.A05.removeCallbacks(this.A07);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0132  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(boolean r19) {
        /*
            r18 = this;
            r6 = r18
            android.view.View r5 = r6.A05
            boolean r0 = X.C06360Xi.A04(r5)
            if (r0 == 0) goto L_0x0131
            r0 = 0
            A00(r0)
            X.0aO r0 = A09
            if (r0 == 0) goto L_0x0015
            r0.A01()
        L_0x0015:
            A09 = r18
            r0 = r19
            r6.A03 = r0
            android.content.Context r0 = r5.getContext()
            X.0Md r13 = new X.0Md
            r13.<init>(r0)
            r6.A02 = r13
            int r12 = r6.A00
            int r8 = r6.A01
            boolean r9 = r6.A03
            java.lang.CharSequence r2 = r6.A06
            android.view.View r4 = r13.A02
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L_0x0049
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L_0x0049
            android.content.Context r1 = r13.A00
            java.lang.String r0 = "window"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.ViewManager r0 = (android.view.ViewManager) r0
            r0.removeView(r4)
        L_0x0049:
            android.widget.TextView r0 = r13.A04
            r0.setText(r2)
            android.view.WindowManager$LayoutParams r3 = r13.A03
            android.os.IBinder r0 = r5.getApplicationWindowToken()
            r3.token = r0
            android.content.Context r7 = r13.A00
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131168462(0x7f070cce, float:1.7951227E38)
            int r1 = r1.getDimensionPixelOffset(r0)
            int r0 = r5.getWidth()
            if (r0 >= r1) goto L_0x006f
            int r0 = r5.getWidth()
            int r12 = r0 / 2
        L_0x006f:
            int r0 = r5.getHeight()
            r2 = 0
            if (r0 < r1) goto L_0x0177
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131168461(0x7f070ccd, float:1.7951224E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            int r17 = r8 + r0
            int r8 = r8 - r0
        L_0x0084:
            r0 = 49
            r3.gravity = r0
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131168466(0x7f070cd2, float:1.7951235E38)
            if (r9 == 0) goto L_0x0094
            r0 = 2131168467(0x7f070cd3, float:1.7951237E38)
        L_0x0094:
            int r16 = r1.getDimensionPixelOffset(r0)
            android.view.View r11 = r5.getRootView()
            android.view.ViewGroup$LayoutParams r1 = r11.getLayoutParams()
            boolean r0 = r1 instanceof android.view.WindowManager.LayoutParams
            if (r0 == 0) goto L_0x0154
            android.view.WindowManager$LayoutParams r1 = (android.view.WindowManager.LayoutParams) r1
            int r1 = r1.type
            r0 = 2
            if (r1 != r0) goto L_0x0154
        L_0x00ab:
            android.graphics.Rect r10 = r13.A01
            r11.getWindowVisibleDisplayFrame(r10)
            int r0 = r10.left
            if (r0 >= 0) goto L_0x00d7
            int r0 = r10.top
            if (r0 >= 0) goto L_0x00d7
            android.content.res.Resources r1 = r7.getResources()
            java.lang.String r15 = "dimen"
            java.lang.String r14 = "android"
            java.lang.String r0 = "status_bar_height"
            int r0 = r1.getIdentifier(r0, r15, r14)
            if (r0 == 0) goto L_0x0151
            int r14 = r1.getDimensionPixelSize(r0)
        L_0x00cc:
            android.util.DisplayMetrics r0 = r1.getDisplayMetrics()
            int r1 = r0.widthPixels
            int r0 = r0.heightPixels
            r10.set(r2, r14, r1, r0)
        L_0x00d7:
            int[] r0 = r13.A06
            r11.getLocationOnScreen(r0)
            int[] r1 = r13.A05
            r5.getLocationOnScreen(r1)
            r13 = r1[r2]
            r14 = r0[r2]
            int r13 = r13 - r14
            r1[r2] = r13
            r15 = 1
            r14 = r1[r15]
            r0 = r0[r15]
            int r14 = r14 - r0
            r1[r15] = r14
            int r13 = r13 + r12
            int r0 = r11.getWidth()
            int r0 = r0 / 2
            int r13 = r13 - r0
            r3.x = r13
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            r4.measure(r0, r0)
            int r2 = r4.getMeasuredHeight()
            r1 = r1[r15]
            int r8 = r8 + r1
            int r8 = r8 - r16
            int r8 = r8 - r2
            int r1 = r1 + r17
            int r1 = r1 + r16
            if (r9 == 0) goto L_0x0147
            if (r8 < 0) goto L_0x014e
        L_0x0113:
            r3.y = r8
        L_0x0115:
            java.lang.String r0 = "window"
            java.lang.Object r0 = r7.getSystemService(r0)
            android.view.ViewManager r0 = (android.view.ViewManager) r0
            r0.addView(r4, r3)
            r5.addOnAttachStateChangeListener(r6)
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x0132
            r0 = 2500(0x9c4, double:1.235E-320)
        L_0x0129:
            java.lang.Runnable r2 = r6.A07
            r5.removeCallbacks(r2)
            r5.postDelayed(r2, r0)
        L_0x0131:
            return
        L_0x0132:
            int r0 = X.AnonymousClass0YY.A03(r5)
            r4 = r0 & 1
            r1 = 1
            int r0 = android.view.ViewConfiguration.getLongPressTimeout()
            long r2 = (long) r0
            if (r4 != r1) goto L_0x0144
            r0 = 3000(0xbb8, double:1.482E-320)
        L_0x0142:
            long r0 = r0 - r2
            goto L_0x0129
        L_0x0144:
            r0 = 15000(0x3a98, double:7.411E-320)
            goto L_0x0142
        L_0x0147:
            int r2 = r2 + r1
            int r0 = r10.height()
            if (r2 > r0) goto L_0x0113
        L_0x014e:
            r3.y = r1
            goto L_0x0115
        L_0x0151:
            r14 = 0
            goto L_0x00cc
        L_0x0154:
            android.content.Context r1 = r5.getContext()
        L_0x0158:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0170
            android.app.Activity r1 = (android.app.Activity) r1
            android.view.View r11 = X.AnonymousClass001.A0Q(r1)
            if (r11 != 0) goto L_0x00ab
            java.lang.String r1 = "TooltipPopup"
            java.lang.String r0 = "Cannot find app view"
            android.util.Log.e(r1, r0)
            goto L_0x0115
        L_0x0170:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L_0x0158
        L_0x0177:
            int r17 = r5.getHeight()
            r8 = 0
            goto L_0x0084
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07140aO.A02(boolean):void");
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.A02 == null || !this.A03) {
            View view2 = this.A05;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    this.A00 = Integer.MAX_VALUE;
                    this.A01 = Integer.MAX_VALUE;
                    A01();
                    return false;
                }
            } else if (view2.isEnabled() && this.A02 == null) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                int A0A2 = AnonymousClass001.A0A(x, this.A00);
                int i = this.A04;
                if (A0A2 <= i && AnonymousClass001.A0A(y, this.A01) <= i) {
                    return false;
                }
                this.A00 = x;
                this.A01 = y;
                A00(this);
                return false;
            }
        }
        return false;
    }

    public C07140aO(View view, CharSequence charSequence) {
        this.A05 = view;
        this.A06 = charSequence;
        this.A04 = C06500Xy.A03(ViewConfiguration.get(view.getContext()));
        this.A00 = Integer.MAX_VALUE;
        this.A01 = Integer.MAX_VALUE;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public boolean onLongClick(View view) {
        this.A00 = view.getWidth() / 2;
        this.A01 = view.getHeight() / 2;
        A02(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        A01();
    }
}
