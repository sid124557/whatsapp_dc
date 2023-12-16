package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4Xg  reason: invalid class name and case insensitive filesystem */
public final class C88084Xg extends C08560eg {
    public int A00 = 150;
    public int A01 = -1;
    public int A02 = 8;
    public int A03 = -1;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final C71343bx A08 = new C71343bx(this);
    public final C185448tf A09;

    public boolean BUh(MotionEvent motionEvent, RecyclerView recyclerView) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            this.A04 = false;
        }
        return this.A04;
    }

    public final void A00(RecyclerView recyclerView, int i) {
        C186058ug r0;
        boolean z;
        if (i != this.A03) {
            C185448tf r2 = this.A09;
            if (r2.BKt()) {
                if (!this.A05) {
                    r2.Bos();
                }
                z = true;
            } else {
                C05570Ua A0G = recyclerView.A0G(i, false);
                if ((A0G instanceof AnonymousClass6IG) && (r0 = ((AnonymousClass6IG) A0G).A00.A0A) != null) {
                    r2.Bl8(r0);
                    z = false;
                } else {
                    return;
                }
            }
            this.A05 = z;
        }
    }

    public final void A01(RecyclerView recyclerView, int i) {
        C186058ug r1;
        if (i != this.A03) {
            C05570Ua A0G = recyclerView.A0G(i, false);
            if ((A0G instanceof AnonymousClass6IG) && (r1 = ((AnonymousClass6IG) A0G).A00.A0A) != null) {
                this.A09.BrQ(r1);
            }
        }
    }

    public C88084Xg(C185448tf r2) {
        this.A09 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x008c, code lost:
        if (r3 > r4) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BeG(android.view.MotionEvent r6, androidx.recyclerview.widget.RecyclerView r7) {
        /*
            r5 = this;
            boolean r0 = X.C18270x1.A1U(r7, r6)
            int r1 = r6.getActionMasked()
            if (r1 == r0) goto L_0x00a5
            r0 = 2
            if (r1 == r0) goto L_0x0011
            r0 = 3
            if (r1 == r0) goto L_0x00a5
        L_0x0010:
            return
        L_0x0011:
            float r1 = r6.getX()
            float r0 = r6.getY()
            android.view.View r0 = r7.A0D(r1, r0)
            if (r0 == 0) goto L_0x00d9
            int r4 = androidx.recyclerview.widget.RecyclerView.A00(r0)
            r0 = -1
            if (r4 == r0) goto L_0x00d9
            int r3 = r5.A01
            if (r4 == r3) goto L_0x00d9
            int r2 = r5.A03
            if (r2 == r0) goto L_0x00d9
            if (r3 != r0) goto L_0x0042
            int r1 = java.lang.Math.min(r4, r2)
            int r0 = java.lang.Math.max(r4, r2)
            if (r1 > r0) goto L_0x00d7
        L_0x003a:
            r5.A00(r7, r1)
            if (r1 == r0) goto L_0x00d7
            int r1 = r1 + 1
            goto L_0x003a
        L_0x0042:
            if (r2 <= r3) goto L_0x005c
            if (r2 <= r4) goto L_0x005c
        L_0x0046:
            r0 = 1
        L_0x0047:
            r1 = 1
            if (r0 == 0) goto L_0x0071
            if (r2 <= r3) goto L_0x0063
            if (r2 <= r4) goto L_0x0063
            if (r3 > r4) goto L_0x008e
            int r0 = r4 + -1
            if (r3 > r0) goto L_0x00d7
        L_0x0054:
            r5.A01(r7, r3)
            if (r3 == r0) goto L_0x00d7
            int r3 = r3 + 1
            goto L_0x0054
        L_0x005c:
            if (r2 >= r3) goto L_0x0061
            if (r2 >= r4) goto L_0x0061
            goto L_0x0046
        L_0x0061:
            r0 = 0
            goto L_0x0047
        L_0x0063:
            if (r3 < r4) goto L_0x0099
            int r0 = r4 + 1
            if (r0 > r3) goto L_0x00d7
        L_0x0069:
            r5.A01(r7, r3)
            if (r3 == r0) goto L_0x00d7
            int r3 = r3 + -1
            goto L_0x0069
        L_0x0071:
            if (r2 <= r3) goto L_0x007e
            int r2 = r2 - r1
            if (r3 > r2) goto L_0x008a
        L_0x0076:
            r5.A01(r7, r3)
            if (r3 == r2) goto L_0x008a
            int r3 = r3 + 1
            goto L_0x0076
        L_0x007e:
            int r0 = r2 + 1
            if (r0 > r3) goto L_0x008a
        L_0x0082:
            r5.A01(r7, r3)
            if (r3 == r0) goto L_0x008a
            int r3 = r3 + -1
            goto L_0x0082
        L_0x008a:
            int r3 = r5.A03
            if (r3 <= r4) goto L_0x0099
        L_0x008e:
            int r3 = r3 - r1
            if (r4 > r3) goto L_0x00d7
        L_0x0091:
            r5.A00(r7, r3)
            if (r3 == r4) goto L_0x00d7
            int r3 = r3 + -1
            goto L_0x0091
        L_0x0099:
            int r0 = r3 + 1
            if (r0 > r4) goto L_0x00d7
        L_0x009d:
            r5.A00(r7, r0)
            if (r0 == r4) goto L_0x00d7
            int r0 = r0 + 1
            goto L_0x009d
        L_0x00a5:
            r1 = 0
            r5.A04 = r1
            r0 = 8
            r5.A02 = r0
            r5.A05 = r1
            r0 = -1
            r5.A01 = r0
            r5.A03 = r0
            r5.A06 = r1
            goto L_0x00ca
        L_0x00b6:
            float r2 = r6.getY()
            int r1 = r7.getBottom()
            int r0 = r5.A00
            int r1 = r1 - r0
            float r0 = (float) r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r1 = 1
            if (r0 >= 0) goto L_0x00ea
            r0 = 0
            r5.A06 = r0
        L_0x00ca:
            android.os.Handler r0 = r7.getHandler()
            X.3bx r1 = r5.A08
            r0.removeCallbacks(r1)
            r0 = 0
            r1.A00 = r0
            return
        L_0x00d7:
            r5.A01 = r4
        L_0x00d9:
            float r2 = r6.getY()
            int r1 = r7.getTop()
            int r0 = r5.A00
            int r1 = r1 + r0
            float r0 = (float) r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00b6
            r1 = 0
        L_0x00ea:
            r5.A07 = r1
            if (r1 == 0) goto L_0x0120
            float r2 = r6.getY()
            int r1 = r7.getBottom()
            int r0 = r5.A00
            int r1 = r1 - r0
            float r0 = (float) r1
            float r2 = r2 - r0
            int r0 = (int) r2
        L_0x00fc:
            int r0 = java.lang.Math.abs(r0)
            int r1 = r5.A00
            int r0 = java.lang.Math.min(r0, r1)
            int r0 = r0 * 12
            int r0 = r0 / r1
            int r0 = r0 + 8
            r5.A02 = r0
            boolean r0 = r5.A06
            if (r0 != 0) goto L_0x0010
            r0 = 1
            r5.A06 = r0
            X.3bx r1 = r5.A08
            r1.A00 = r7
            android.os.Handler r0 = r7.getHandler()
            r0.post(r1)
            return
        L_0x0120:
            int r1 = r7.getTop()
            int r0 = r5.A00
            int r1 = r1 + r0
            float r1 = (float) r1
            float r0 = r6.getY()
            float r1 = r1 - r0
            int r0 = (int) r1
            goto L_0x00fc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88084Xg.BeG(android.view.MotionEvent, androidx.recyclerview.widget.RecyclerView):void");
    }
}
