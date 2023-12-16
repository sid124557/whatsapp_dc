package X;

import android.view.View;
import android.view.ViewParent;
import com.whatsapp.R;

/* renamed from: X.4TO  reason: invalid class name */
public class AnonymousClass4TO extends C04810Qt {
    public final /* synthetic */ AnonymousClass560 A00;

    public AnonymousClass4TO(AnonymousClass560 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(android.view.View r15, float r16, float r17) {
        /*
            r14 = this;
            X.560 r3 = r14.A00
            boolean r2 = r3 instanceof X.C995055z
            if (r2 == 0) goto L_0x002f
            r5 = r3
            X.55z r5 = (X.C995055z) r5
            r0 = 0
            X.C162457s7.A0J(r15, r0)
            int r4 = r15.getTop()
            int r0 = r15.getHeight()
            int r0 = r5.A05(r0)
            int r1 = X.AnonymousClass001.A0A(r4, r0)
            int r0 = r15.getHeight()
            int r0 = r5.A04(r0)
            int r0 = X.AnonymousClass001.A0A(r4, r0)
            boolean r0 = X.AnonymousClass001.A1Y(r1, r0)
            r5.A05 = r0
        L_0x002f:
            android.view.View r0 = r3.A0F
            if (r0 == 0) goto L_0x00e9
            if (r0 != r15) goto L_0x00e9
            float r4 = java.lang.Math.abs(r16)
            float r0 = java.lang.Math.abs(r17)
            r1 = 1077936128(0x40400000, float:3.0)
            r6 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a7
            float r0 = r16 / r17
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0050
            r17 = 0
        L_0x0050:
            r5 = 1
            r4 = 0
            int r13 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            int r0 = r15.getWidth()
            if (r13 != 0) goto L_0x018e
            int r1 = r3.A02(r0)
            r12 = 0
        L_0x005f:
            int r11 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1))
            int r0 = r15.getHeight()
            if (r11 != 0) goto L_0x0180
            int r6 = r3.A03(r0)
        L_0x006b:
            android.util.DisplayMetrics r9 = X.C86614Ku.A0E(r3)
            int r0 = r3.A0A
            int r0 = X.AnonymousClass001.A0A(r1, r0)
            float r0 = (float) r0
            float r7 = r9.density
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            boolean r10 = X.AnonymousClass0x7.A1P(r0)
            int r0 = r3.A0B
            int r0 = X.AnonymousClass001.A0A(r6, r0)
            float r0 = (float) r0
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            boolean r8 = X.AnonymousClass0x7.A1P(r0)
            if (r12 != 0) goto L_0x0097
            int r7 = r15.getTop()
            int r0 = r9.heightPixels
            int r0 = r0 / 3
            if (r7 <= r0) goto L_0x014f
        L_0x0097:
            boolean r0 = r3.A0R
            if (r0 == 0) goto L_0x00ea
            r3.A0Q = r5
            X.8jg r0 = r3.A0K
            if (r0 == 0) goto L_0x00a8
            X.8Jx r0 = (X.C172178Jx) r0
            X.5qO r0 = r0.A00
            r0.B2u(r5)
        L_0x00a8:
            X.4P1 r5 = r3.A0N
            if (r5 == 0) goto L_0x00c5
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131099845(0x7f0600c5, float:1.7812055E38)
            int r0 = r1.getColor(r0)
            r5.A05(r4, r0)
            X.4P1 r1 = r3.A0N
            r0 = 6
            r1.setPlayerElevation(r0)
            X.4P1 r0 = r3.A0N
            r0.setVisibility(r4)
        L_0x00c5:
            if (r2 == 0) goto L_0x00e9
            X.55z r3 = (X.C995055z) r3
            int r2 = r3.A07
            int r0 = r15.getHeight()
            int r0 = r3.A05(r0)
            int r1 = X.AnonymousClass001.A0A(r2, r0)
            int r0 = r15.getHeight()
            int r0 = r3.A04(r0)
            int r0 = X.AnonymousClass001.A0A(r2, r0)
            boolean r0 = X.AnonymousClass001.A1Y(r1, r0)
            r3.A05 = r0
        L_0x00e9:
            return
        L_0x00ea:
            if (r12 == 0) goto L_0x014f
            boolean r0 = r3.A0X
            if (r0 == 0) goto L_0x014f
            if (r10 == 0) goto L_0x00f4
            if (r8 != 0) goto L_0x010b
        L_0x00f4:
            r7 = 1169915904(0x45bb8000, float:6000.0)
            if (r10 == 0) goto L_0x0101
            float r0 = java.lang.Math.abs(r16)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x010b
        L_0x0101:
            if (r8 == 0) goto L_0x014f
            float r0 = java.lang.Math.abs(r17)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x014f
        L_0x010b:
            r3.A0H = r15
            r3.A0U = r5
            if (r13 != 0) goto L_0x013c
            float r0 = r15.getX()
            int r1 = (int) r0
        L_0x0116:
            if (r11 != 0) goto L_0x012e
            float r0 = r15.getY()
            int r5 = (int) r0
        L_0x011d:
            X.0WM r0 = r3.A0b
            r0.A0H(r15, r1, r5)
            r1 = 33
            X.5rN r0 = new X.5rN
            r0.<init>(r14, r1)
            r3.postOnAnimation(r0)
            goto L_0x00a8
        L_0x012e:
            int r0 = r15.getHeight()
            if (r11 <= 0) goto L_0x0139
            int r5 = X.C86664Kz.A0C(r3, r0)
            goto L_0x011d
        L_0x0139:
            int r5 = r0 * -2
            goto L_0x011d
        L_0x013c:
            if (r13 <= 0) goto L_0x0148
            int r1 = r15.getWidth()
            int r0 = r3.getWidth()
            int r1 = r1 + r0
            goto L_0x0116
        L_0x0148:
            int r0 = r15.getHeight()
            int r1 = r0 * -2
            goto L_0x0116
        L_0x014f:
            boolean r5 = r3.A0R
            X.0WM r0 = r3.A0b
            if (r5 != 0) goto L_0x0161
            r0.A0C(r1, r6)
            r3.A06 = r1
            r3.A07 = r6
        L_0x015c:
            r3.invalidate()
            goto L_0x00a8
        L_0x0161:
            r0.A0C(r4, r4)
            X.4P1 r0 = r3.A0N
            if (r0 == 0) goto L_0x017b
            X.563 r0 = (X.AnonymousClass563) r0
            X.5YG r0 = r0.A0I
            if (r0 == 0) goto L_0x017b
            boolean r0 = r0.A0a()
            if (r0 == 0) goto L_0x017b
            X.4P1 r1 = r3.A0N
            r0 = 100
            r1.A04(r0)
        L_0x017b:
            r3.A06 = r4
            r3.A07 = r4
            goto L_0x015c
        L_0x0180:
            if (r11 <= 0) goto L_0x0189
            int r6 = r3.A04(r0)
        L_0x0186:
            r12 = 1
            goto L_0x006b
        L_0x0189:
            int r6 = r3.A05(r0)
            goto L_0x0186
        L_0x018e:
            if (r13 <= 0) goto L_0x019d
            int r1 = r3.getRightOfDraggableArea()
            int r1 = r1 - r0
            int r0 = X.AnonymousClass560.A00(r3, r0)
            int r1 = r1 + r0
        L_0x019a:
            r12 = 1
            goto L_0x005f
        L_0x019d:
            int r1 = r3.getLeftOfDraggableArea()
            int r0 = X.AnonymousClass560.A00(r3, r0)
            int r1 = r1 - r0
            goto L_0x019a
        L_0x01a7:
            float r0 = r17 / r16
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0050
            r16 = 0
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TO.A06(android.view.View, float, float):void");
    }

    public void A08(View view, int i, int i2, int i3, int i4) {
        AnonymousClass560 r2 = this.A00;
        if (!r2.A0S) {
            r2.A0J.A02(view);
        }
        if (r2.A0b.A03 == 1 && !r2.A0U) {
            r2.A07 = view.getTop();
            r2.A06 = view.getLeft();
        }
    }

    public boolean A09(View view, int i) {
        AnonymousClass560 r1 = this.A00;
        View view2 = r1.A0F;
        if (view2 == null || view != view2 || r1.A0V) {
            return false;
        }
        return true;
    }

    public int A01(View view) {
        return view.getWidth();
    }

    public int A02(View view) {
        return view.getHeight();
    }

    public void A07(View view, int i) {
        AnonymousClass4P1 r2;
        ViewParent parent = view.getParent();
        AnonymousClass560 r3 = this.A00;
        r3.A0A = r3.A06;
        r3.A0B = r3.A07;
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        if (r3.A0R && (r2 = r3.A0N) != null) {
            r2.A05(r3.getResources().getColor(R.color.f5nameremoved), 0);
            r3.A0N.setPlayerElevation(0);
            r3.A0N.setVisibility(8);
            AnonymousClass5YG r0 = ((AnonymousClass563) r3.A0N).A0I;
            if (r0 != null && r0.A0a()) {
                r3.A0N.A01();
            }
        }
    }

    public int A03(View view, int i, int i2) {
        return i;
    }

    public int A04(View view, int i, int i2) {
        return i;
    }
}
