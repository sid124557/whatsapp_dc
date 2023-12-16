package X;

import android.content.Context;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.4nu  reason: invalid class name and case insensitive filesystem */
public abstract class C93104nu extends C133426hK {
    public TextView A00;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        if (r10.A0O.A0X(6307) == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r5.A1z() == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A22() {
        /*
            r10 = this;
            X.34x r5 = r10.A0S
            X.1mr r5 = (X.C30691mr) r5
            X.1VX r1 = r10.A0O
            r0 = 1972(0x7b4, float:2.763E-42)
            boolean r0 = r1.A0X(r0)
            r3 = 1
            r8 = 0
            if (r0 == 0) goto L_0x0017
            boolean r0 = r5.A1z()
            r6 = 1
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r6 = 0
        L_0x0018:
            java.util.List r4 = r5.A02
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0037
            java.lang.Object r0 = r4.get(r8)
            X.3ZF r0 = (X.AnonymousClass3ZF) r0
            boolean r0 = r0.A0P()
            if (r0 == 0) goto L_0x0037
            X.1VX r1 = r10.A0O
            r0 = 6307(0x18a3, float:8.838E-42)
            boolean r0 = r1.A0X(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0038
        L_0x0037:
            r2 = 0
        L_0x0038:
            int r1 = r5.A1y()
            if (r1 == 0) goto L_0x00be
            if (r1 == r3) goto L_0x00bb
            r0 = 2
            if (r1 == r0) goto L_0x00b8
            X.7Kd r1 = X.C92674n4.A02
        L_0x0045:
            if (r6 == 0) goto L_0x009b
            r9 = 2131887399(0x7f120527, float:1.9409404E38)
        L_0x004a:
            X.2sH r2 = r10.A1E
            long r0 = r5.A0K
            long r1 = r2.A0I(r0)
            android.widget.TextView r4 = r10.A00
            X.33j r7 = r10.A0M
            android.content.Context r6 = r10.getContext()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            X.33j r0 = r10.A0M
            java.lang.String r0 = X.C107145am.A00(r0, r1)
            java.lang.String r0 = X.AnonymousClass002.A0F(r6, r0, r3, r8, r9)
            java.lang.String r0 = X.C107145am.A01(r7, r0, r1)
            r4.setText(r0)
            r0 = 14
            X.C109475eg.A00(r4, r10, r5, r0)
            X.33j r3 = r10.A0M
            android.content.Context r2 = r10.getContext()
            boolean r0 = r5.A20()
            r1 = 2131232440(0x7f0806b8, float:1.808099E38)
            if (r0 == 0) goto L_0x0084
            r1 = 2131233192(0x7f0809a8, float:1.8082515E38)
        L_0x0084:
            r0 = 2131101893(0x7f0608c5, float:1.7816209E38)
            android.graphics.drawable.Drawable r2 = X.C107335b8.A04(r2, r1, r0)
            boolean r0 = X.C102805Ki.A00(r3)
            r1 = 0
            if (r0 == 0) goto L_0x00c1
            X.6dx r0 = new X.6dx
            r0.<init>(r2, r3)
            r4.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r0, r1)
            return
        L_0x009b:
            if (r2 == 0) goto L_0x00a0
            int r9 = r1.A00
            goto L_0x004a
        L_0x00a0:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x00b5
            java.lang.Object r0 = r4.get(r8)
            X.3ZF r0 = (X.AnonymousClass3ZF) r0
            boolean r0 = r0.A0O()
            if (r0 == 0) goto L_0x00b5
            int r9 = r1.A01
            goto L_0x004a
        L_0x00b5:
            int r9 = r1.A02
            goto L_0x004a
        L_0x00b8:
            X.7Kd r1 = X.C92674n4.A03
            goto L_0x0045
        L_0x00bb:
            X.7Kd r1 = X.C92674n4.A04
            goto L_0x0045
        L_0x00be:
            X.7Kd r1 = X.C92674n4.A05
            goto L_0x0045
        L_0x00c1:
            r4.setCompoundDrawablesWithIntrinsicBounds(r2, r1, r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93104nu.A22():void");
    }

    public int getUserNameInGroupLayoutOption() {
        return 3;
    }

    public C93104nu(Context context, AnonymousClass677 r4, C624134x r5) {
        super(context, r4, r5);
        TextView A0G = C18300x5.A0G(this, R.id.info);
        this.A00 = A0G;
        A0G.setTextSize(getDividerFontSize());
    }

    public void A1H() {
        A22();
        A1t(false);
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, getFMessage());
        super.A1q(r2, z);
        if (z || A1W) {
            A22();
        }
    }

    public int getCenteredLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f8nameremoved;
    }
}
