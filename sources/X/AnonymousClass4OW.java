package X;

import android.content.Context;
import android.widget.BaseAdapter;

/* renamed from: X.4OW  reason: invalid class name */
public class AnonymousClass4OW extends BaseAdapter {
    public final int A00;
    public final Context A01;
    public final C620733j A02;
    public final /* synthetic */ AnonymousClass5ZF A03;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r1 != r4.A01) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
        /*
            r10 = this;
            r5 = 0
            if (r12 == 0) goto L_0x000f
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            int r1 = r12.getChildCount()
            X.5ZF r4 = r10.A03
            int r0 = r4.A01
            if (r1 == r0) goto L_0x0036
        L_0x000f:
            X.5ZF r4 = r10.A03
            android.content.Context r0 = r4.A09
            X.4Nv r12 = new X.4Nv
            r12.<init>(r0, r10)
            r2 = 0
        L_0x0019:
            int r0 = r4.A01
            if (r2 >= r0) goto L_0x002f
            android.content.Context r0 = r10.A01
            X.4NX r1 = new X.4NX
            r1.<init>(r0, r4)
            int r0 = r4.A05
            X.C86624Kv.A0v(r1, r0)
            r12.addView(r1)
            int r2 = r2 + 1
            goto L_0x0019
        L_0x002f:
            r12.setClickable(r5)
            r0 = 2
            X.AnonymousClass0YY.A06(r12, r0)
        L_0x0036:
            r3 = 0
        L_0x0037:
            int r0 = r4.A01
            if (r3 >= r0) goto L_0x00ac
            android.view.View r2 = r12.getChildAt(r3)
            X.4NX r2 = (X.AnonymousClass4NX) r2
            int r8 = r4.A01
            int r8 = r8 * r11
            int r8 = r8 + r3
            X.5X5[] r9 = r4.A0U
            int r7 = r10.A00
            r0 = r9[r7]
            int r0 = r0.A00()
            r6 = 0
            if (r8 >= r0) goto L_0x0099
            r0 = r9[r7]
            X.2y5 r1 = r4.A0R
            int[] r0 = r0.A01(r1, r8)
            r2.setEmoji(r0)
            r0 = 2131233591(0x7f080b37, float:1.8083324E38)
            r2.setBackgroundResource(r0)
            r0 = 1
            r2.setClickable(r0)
            android.view.View$OnClickListener r0 = r4.A0C
            r2.setOnClickListener(r0)
            r0 = r9[r7]
            int[] r1 = r0.A01(r1, r8)
            if (r1 == 0) goto L_0x0085
            boolean r0 = X.C107425bI.A02(r1)
            if (r0 == 0) goto L_0x0085
            X.692 r1 = new X.692
            r1.<init>(r10, r5)
        L_0x007f:
            r2.setOnLongClickListener(r1)
        L_0x0082:
            int r3 = r3 + 1
            goto L_0x0037
        L_0x0085:
            boolean r0 = X.C107425bI.A03(r1)
            if (r0 == 0) goto L_0x0092
            r0 = 1
            X.692 r1 = new X.692
            r1.<init>(r10, r0)
            goto L_0x007f
        L_0x0092:
            r2.setOnLongClickListener(r6)
            r2.setLongClickable(r5)
            goto L_0x0082
        L_0x0099:
            r2.setEmoji(r6)
            r2.setBackground(r6)
            r2.setOnClickListener(r6)
            r2.setClickable(r5)
            r2.setOnLongClickListener(r6)
            r2.setLongClickable(r5)
            goto L_0x0082
        L_0x00ac:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4OW.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public AnonymousClass4OW(Context context, AnonymousClass5ZF r2, C620733j r3, int i) {
        this.A03 = r2;
        this.A01 = context;
        this.A02 = r3;
        this.A00 = i;
    }

    public int getCount() {
        AnonymousClass5ZF r6 = this.A03;
        int i = 0;
        if (r6.A01 == 0) {
            return 0;
        }
        AnonymousClass5X5[] r4 = r6.A0U;
        int i2 = this.A00;
        int A002 = r4[i2].A00();
        int i3 = r6.A01;
        int i4 = ((A002 + i3) - 1) / i3;
        if (r6.A0S && r4[i2].A00() > 0) {
            i = 1;
        }
        return i4 + i;
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return 0;
    }
}
