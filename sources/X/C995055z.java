package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.55z  reason: invalid class name and case insensitive filesystem */
public final class C995055z extends AnonymousClass560 {
    public int A00 = 1;
    public C1229766o A01;
    public C95814uZ A02;
    public boolean A03;
    public boolean A04 = true;
    public boolean A05 = true;

    public C995055z(Context context, View view, C95814uZ r6) {
        super(context, view);
        A01();
        this.A0T = false;
        setId(R.id.bot_embodiment_draggable_container);
        setClipToPadding(false);
        C86644Kx.A0z(this, getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        this.A0X = false;
        this.A02 = r6;
    }

    public final void setBonsaiUiUtil(C1229766o r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (r6.A00 != 2) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(int r7, boolean r8) {
        /*
            r6 = this;
            r6.A00 = r7
            android.view.View r4 = r6.A0F
            if (r4 == 0) goto L_0x0058
            boolean r0 = r6.A04
            if (r0 != 0) goto L_0x000f
            X.0WM r0 = r6.A0b
            r0.A03()
        L_0x000f:
            r5 = 1
            r2 = 2
            if (r7 != r5) goto L_0x006f
            int r0 = r6.getLeftOfDraggableArea()
            if (r0 < 0) goto L_0x006a
            int r0 = r6.getRightOfDraggableArea()
            if (r0 < 0) goto L_0x006a
            int r1 = r6.getLeftOfDraggableArea()
            int r0 = r6.getRightOfDraggableArea()
            int r1 = r1 + r0
        L_0x0028:
            int r1 = r1 / 2
            int r0 = X.C86664Kz.A0E(r4, r2)
            int r1 = r1 - r0
            int r0 = r4.getHeight()
            int r3 = r6.A05(r0)
        L_0x0037:
            if (r3 >= 0) goto L_0x003e
            int r3 = r4.getHeight()
            int r3 = r3 / r2
        L_0x003e:
            if (r1 < 0) goto L_0x0058
            if (r3 < 0) goto L_0x0058
            if (r2 != r7) goto L_0x0046
            r6.A0S = r5
        L_0x0046:
            if (r8 == 0) goto L_0x0059
            r6.A06 = r1
            r6.A07 = r3
        L_0x004c:
            int r0 = r6.A09
            if (r0 == r2) goto L_0x0055
            int r0 = r6.A00
            r1 = 0
            if (r0 == r2) goto L_0x0056
        L_0x0055:
            r1 = 1
        L_0x0056:
            r6.A0V = r1
        L_0x0058:
            return
        L_0x0059:
            boolean r0 = r6.A0C(r1, r3)
            if (r0 == 0) goto L_0x004c
            r1 = 31
            X.5rV r0 = new X.5rV
            r0.<init>(r6, r1, r4)
            X.AnonymousClass0YY.A07(r4, r0)
            goto L_0x004c
        L_0x006a:
            int r1 = r6.getMeasuredWidth()
            goto L_0x0028
        L_0x006f:
            r6.A05 = r5
            int r0 = r4.getWidth()
            int r1 = r6.getRightOfDraggableArea()
            int r1 = r1 - r0
            int r0 = X.AnonymousClass560.A00(r6, r0)
            int r1 = r1 + r0
            int r0 = r4.getHeight()
            int r3 = r6.A05(r0)
            if (r1 >= 0) goto L_0x0037
            int r1 = r6.getMeasuredWidth()
            int r0 = X.C86664Kz.A0E(r4, r2)
            int r1 = r1 - r0
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C995055z.A0D(int, boolean):void");
    }

    public final boolean A0E() {
        int measuredWidth;
        View view = this.A0F;
        if (view == null) {
            return false;
        }
        int A0B = this.A06 + C86664Kz.A0B(view);
        if (getLeftOfDraggableArea() < 0 || getRightOfDraggableArea() < 0) {
            measuredWidth = getMeasuredWidth();
        } else {
            measuredWidth = getLeftOfDraggableArea() + getRightOfDraggableArea();
        }
        if (A0B == measuredWidth / 2) {
            return true;
        }
        return false;
    }

    public final C1229766o getBonsaiUiUtil() {
        C1229766o r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("bonsaiUiUtil");
    }
}
