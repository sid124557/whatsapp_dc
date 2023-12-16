package X;

import android.widget.EditText;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.52T  reason: invalid class name */
public class AnonymousClass52T extends C166677z5 {
    public int A00;
    public Runnable A01;
    public final int A02;
    public final int A03;
    public final EditText A04;
    public final TextView A05;
    public final C620633i A06;
    public final C620733j A07;
    public final AnonymousClass487 A08;
    public final AnonymousClass5Y0 A09;
    public final C60152y5 A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r11 < r1) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009b, code lost:
        if (r11 != r9) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009e, code lost:
        r8.setVisibility(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r13) {
        /*
            r12 = this;
            boolean r0 = r12.A0B
            android.widget.EditText r3 = r12.A04
            r5 = r13
            if (r0 == 0) goto L_0x00a2
            android.content.Context r4 = r3.getContext()
            X.5Y0 r8 = r12.A09
            X.33i r7 = r12.A06
            X.2y5 r9 = r12.A0A
            android.text.TextPaint r6 = r3.getPaint()
            boolean r0 = r12.A0D
            r10 = 2131102273(0x7f060a41, float:1.781698E38)
            if (r0 == 0) goto L_0x001f
            r10 = 2131102272(0x7f060a40, float:1.7816977E38)
        L_0x001f:
            boolean r11 = r12.A0C
            X.C107635bd.A0F(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x0024:
            int r9 = r12.A02
            if (r9 == 0) goto L_0x008e
            java.lang.Runnable r1 = r12.A01
            if (r1 == 0) goto L_0x0031
            android.widget.TextView r0 = r12.A05
            r0.removeCallbacks(r1)
        L_0x0031:
            java.lang.String r7 = r13.toString()
            int r10 = X.AnonymousClass5VB.A00(r7)
            android.widget.TextView r8 = r12.A05
            if (r8 == 0) goto L_0x0074
            int r11 = r9 - r10
            int r1 = r12.A03
            if (r1 == 0) goto L_0x009a
            r0 = 8
            if (r11 >= r1) goto L_0x009e
        L_0x0047:
            r0 = 15
            X.3cJ r2 = new X.3cJ
            r2.<init>((java.lang.Object) r12, (int) r11, (int) r0)
            r12.A01 = r2
            r0 = 1000(0x3e8, double:4.94E-321)
            r8.postDelayed(r2, r0)
            r6 = 0
            r8.setVisibility(r6)
            X.33j r2 = r12.A07
            java.text.NumberFormat r0 = r2.A0M()
            long r4 = (long) r11
            X.C86634Kw.A1K(r8, r0, r4)
            r1 = 2131755370(0x7f10016a, float:1.9141617E38)
            java.lang.Object[] r0 = X.AnonymousClass002.A0L()
            X.AnonymousClass000.A1P(r0, r11, r6)
            java.lang.String r0 = r2.A0L(r0, r1, r4)
            r8.setContentDescription(r0)
        L_0x0074:
            if (r10 < r9) goto L_0x008f
            int r0 = r12.A00
            if (r0 != 0) goto L_0x008f
            int r1 = r3.getInputType()
            r12.A00 = r1
            if (r1 == 0) goto L_0x008e
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r0
            r3.setInputType(r1)
            r3.setText(r7)
            X.C86654Ky.A1D(r3, r7)
        L_0x008e:
            return
        L_0x008f:
            int r0 = r12.A00
            if (r0 == 0) goto L_0x008e
            r3.setInputType(r0)
            r0 = 0
            r12.A00 = r0
            return
        L_0x009a:
            r0 = 4
            if (r11 == r9) goto L_0x009e
            goto L_0x0047
        L_0x009e:
            r8.setVisibility(r0)
            goto L_0x0074
        L_0x00a2:
            android.content.Context r2 = r3.getContext()
            android.text.TextPaint r1 = r3.getPaint()
            X.5Y0 r0 = r12.A09
            X.C107345b9.A07(r2, r1, r13, r0)
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass52T.afterTextChanged(android.text.Editable):void");
    }

    public AnonymousClass52T(EditText editText, TextView textView, C620633i r7, C620733j r8, AnonymousClass487 r9, AnonymousClass5Y0 r10, C60152y5 r11, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A09 = r10;
        this.A06 = r7;
        this.A07 = r8;
        this.A0A = r11;
        this.A08 = r9;
        this.A04 = editText;
        this.A05 = textView;
        this.A02 = i;
        this.A03 = i2;
        this.A0B = z;
        this.A0C = z3;
        this.A0D = z2;
        C86614Ku.A1H(editText, this, 14);
        if (textView != null) {
            long j = (long) i;
            Object[] A0L = AnonymousClass002.A0L();
            C18270x1.A1Q(A0L, i);
            textView.setContentDescription(r8.A0L(A0L, R.plurals.f9nameremoved, j));
            if (i != 0 && i2 == 0) {
                C86634Kw.A1K(textView, r8.A0M(), j);
            }
        }
    }

    public AnonymousClass52T(EditText editText, TextView textView, C620633i r16, C620733j r17, AnonymousClass487 r18, AnonymousClass5Y0 r19, C60152y5 r20, int i, int i2, boolean z) {
        this(editText, textView, r16, r17, r18, r19, r20, i, i2, z, false, false);
    }
}
