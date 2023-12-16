package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.timepicker.ClockFaceView;
import com.google.android.material.timepicker.ClockHandView;

/* renamed from: X.8zT  reason: invalid class name and case insensitive filesystem */
public class C188778zT extends AnonymousClass0WH {
    public Object A00;
    public final int A01;

    public C188778zT(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A06(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.A01) {
            case 8:
                super.A06(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.A00).isChecked());
                return;
            case 14:
                if (accessibilityEvent.getEventType() == 2048) {
                    return;
                }
                break;
        }
        super.A06(view, accessibilityEvent);
    }

    public void A07(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.A01) {
            case 2:
                super.A07(view, accessibilityEvent);
                if (accessibilityEvent.getEventType() == 1) {
                    ((BottomSheetDragHandleView) this.A00).A02();
                    return;
                }
                return;
            case 12:
                view.setLongClickable(false);
                return;
            default:
                super.A07(view, accessibilityEvent);
                return;
        }
    }

    public boolean A09(View view, int i, Bundle bundle) {
        View view2 = view;
        int i2 = i;
        switch (this.A01) {
            case 1:
                if (i2 == 1048576) {
                    AnonymousClass4SH r1 = (AnonymousClass4SH) this.A00;
                    if (r1.A06) {
                        r1.cancel();
                        return true;
                    }
                }
                break;
            case 10:
                if (i2 == 1048576) {
                    ((C159097l7) this.A00).A08(3);
                    return true;
                }
                break;
            case 11:
                if (i2 == 16) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    ClockFaceView clockFaceView = (ClockFaceView) this.A00;
                    Rect rect = clockFaceView.A08;
                    view2.getHitRect(rect);
                    float centerX = (float) rect.centerX();
                    float centerY = (float) rect.centerY();
                    ClockHandView clockHandView = clockFaceView.A0C;
                    clockHandView.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
                    clockHandView.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
                    return true;
                }
                break;
        }
        return super.A09(view2, i2, bundle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x009e, code lost:
        r10.A07(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0105, code lost:
        r10.A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0108, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(android.view.View r9, X.C05650Ui r10) {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L_0x016d;
                case 1: goto L_0x0153;
                case 2: goto L_0x0005;
                case 3: goto L_0x0109;
                case 4: goto L_0x0101;
                case 5: goto L_0x00f7;
                case 6: goto L_0x00d6;
                case 7: goto L_0x0101;
                case 8: goto L_0x00c0;
                case 9: goto L_0x00b1;
                case 10: goto L_0x00a2;
                case 11: goto L_0x0064;
                case 12: goto L_0x0005;
                case 13: goto L_0x004a;
                case 14: goto L_0x0005;
                case 15: goto L_0x002d;
                case 16: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A0D(r9, r10)
            return
        L_0x0009:
            super.A0D(r9, r10)
            r1 = 0
            r10.A0H(r1)
            android.view.accessibility.AccessibilityNodeInfo r0 = r10.A01
            r0.setLongClickable(r1)
            X.0Ws r0 = X.C06220Ws.A08
            r10.A08(r0)
            java.lang.Object r0 = r8.A00
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            r0 = 2131892877(0x7f121a8d, float:1.9420515E38)
            java.lang.String r0 = r1.getString(r0)
            r10.A09(r0)
            return
        L_0x002d:
            X.C18260x0.A0O(r9, r10)
            super.A0D(r9, r10)
            java.lang.Object r0 = r8.A00
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            r0 = 2131888236(0x7f12086c, float:1.9411102E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 16
            X.0Ws r2 = new X.0Ws
            r2.<init>((int) r0, (java.lang.CharSequence) r1)
            goto L_0x009e
        L_0x004a:
            super.A0D(r9, r10)
            java.lang.Object r0 = r8.A00
            com.google.android.material.tabs.TabLayout r0 = (com.google.android.material.tabs.TabLayout) r0
            java.util.ArrayList r0 = r0.A0k
            int r2 = r0.size()
            r1 = 1
            r0 = 0
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r0 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r1, r2, r0)
            X.0KO r1 = new X.0KO
            r1.<init>(r0)
            goto L_0x0105
        L_0x0064:
            super.A0D(r9, r10)
            r0 = 2131431242(0x7f0b0f4a, float:1.8484208E38)
            java.lang.Object r0 = r9.getTag(r0)
            int r3 = X.AnonymousClass001.A0K(r0)
            if (r3 <= 0) goto L_0x0085
            java.lang.Object r0 = r8.A00
            com.google.android.material.timepicker.ClockFaceView r0 = (com.google.android.material.timepicker.ClockFaceView) r0
            android.util.SparseArray r1 = r0.A0A
            int r0 = r3 + -1
            java.lang.Object r0 = r1.get(r0)
            android.view.View r0 = (android.view.View) r0
            r10.A05(r0)
        L_0x0085:
            r2 = 1
            boolean r6 = r9.isSelected()
            r1 = 0
            r4 = r2
            r5 = r1
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r1 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r1, r2, r3, r4, r5, r6)
            X.0KP r0 = new X.0KP
            r0.<init>(r1)
            r10.A0G(r0)
            r10.A0H(r2)
            X.0Ws r2 = X.C06220Ws.A08
        L_0x009e:
            r10.A07(r2)
            return
        L_0x00a2:
            super.A0D(r9, r10)
            r0 = 1048576(0x100000, float:1.469368E-39)
            android.view.accessibility.AccessibilityNodeInfo r1 = r10.A01
            r1.addAction(r0)
            r0 = 1
            r1.setDismissable(r0)
            return
        L_0x00b1:
            super.A0D(r9, r10)
            java.lang.Object r0 = r8.A00
            com.google.android.material.internal.NavigationMenuItemView r0 = (com.google.android.material.internal.NavigationMenuItemView) r0
            boolean r1 = r0.A07
            android.view.accessibility.AccessibilityNodeInfo r0 = r10.A01
            r0.setCheckable(r1)
            return
        L_0x00c0:
            super.A0D(r9, r10)
            java.lang.Object r2 = r8.A00
            com.google.android.material.internal.CheckableImageButton r2 = (com.google.android.material.internal.CheckableImageButton) r2
            boolean r0 = r2.A00
            android.view.accessibility.AccessibilityNodeInfo r1 = r10.A01
            r1.setCheckable(r0)
            boolean r0 = r2.isChecked()
            r1.setChecked(r0)
            return
        L_0x00d6:
            super.A0D(r9, r10)
            java.lang.Object r2 = r8.A00
            com.google.android.material.datepicker.MaterialCalendar r2 = (com.google.android.material.datepicker.MaterialCalendar) r2
            android.view.View r0 = r2.A01
            int r0 = r0.getVisibility()
            r1 = 2131896124(0x7f12273c, float:1.94271E38)
            if (r0 != 0) goto L_0x00eb
            r1 = 2131896126(0x7f12273e, float:1.9427104E38)
        L_0x00eb:
            android.content.res.Resources r0 = X.C08310eF.A09(r2)
            java.lang.String r0 = r0.getString(r1)
            r10.A0A(r0)
            return
        L_0x00f7:
            super.A0D(r9, r10)
            r1 = 0
            android.view.accessibility.AccessibilityNodeInfo r0 = r10.A01
            r0.setScrollable(r1)
            return
        L_0x0101:
            super.A0D(r9, r10)
            r1 = 0
        L_0x0105:
            r10.A0F(r1)
            return
        L_0x0109:
            super.A0D(r9, r10)
            java.lang.Object r3 = r8.A00
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            boolean r0 = r9 instanceof com.google.android.material.button.MaterialButton
            if (r0 == 0) goto L_0x013b
            r2 = 0
            r4 = 0
        L_0x0116:
            int r0 = r3.getChildCount()
            if (r2 >= r0) goto L_0x013b
            android.view.View r0 = r3.getChildAt(r2)
            if (r0 == r9) goto L_0x013c
            android.view.View r0 = r3.getChildAt(r2)
            boolean r0 = r0 instanceof com.google.android.material.button.MaterialButton
            if (r0 == 0) goto L_0x0138
            android.view.View r0 = r3.getChildAt(r2)
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0138
            int r4 = r4 + 1
        L_0x0138:
            int r2 = r2 + 1
            goto L_0x0116
        L_0x013b:
            r4 = -1
        L_0x013c:
            com.google.android.material.button.MaterialButton r9 = (com.google.android.material.button.MaterialButton) r9
            boolean r7 = r9.isChecked()
            r2 = 0
            r3 = 1
            r5 = r3
            r6 = r2
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r1 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r2, r3, r4, r5, r6, r7)
            X.0KP r0 = new X.0KP
            r0.<init>(r1)
            r10.A0G(r0)
            return
        L_0x0153:
            super.A0D(r9, r10)
            java.lang.Object r0 = r8.A00
            X.4SH r0 = (X.AnonymousClass4SH) r0
            boolean r0 = r0.A06
            r1 = 0
            if (r0 == 0) goto L_0x0167
            r1 = 1048576(0x100000, float:1.469368E-39)
            android.view.accessibility.AccessibilityNodeInfo r0 = r10.A01
            r0.addAction(r1)
            r1 = 1
        L_0x0167:
            android.view.accessibility.AccessibilityNodeInfo r0 = r10.A01
            r0.setDismissable(r1)
            return
        L_0x016d:
            super.A0D(r9, r10)
            java.lang.Object r0 = r8.A00
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r0 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r0
            boolean r0 = r0.A05
            android.view.accessibility.AccessibilityNodeInfo r1 = r10.A01
            r1.setScrollable(r0)
            java.lang.Class<android.widget.ScrollView> r0 = android.widget.ScrollView.class
            java.lang.String r0 = r0.getName()
            r1.setClassName(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C188778zT.A0D(android.view.View, X.0Ui):void");
    }
}
