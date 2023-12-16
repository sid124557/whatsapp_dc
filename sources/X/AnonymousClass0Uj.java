package X;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ListAdapter;

/* renamed from: X.0Uj  reason: invalid class name */
public class AnonymousClass0Uj {
    public final int A00;
    public final C04070Mr A01;

    public AnonymousClass0Uj A0A(int i) {
        C04070Mr r1 = this.A01;
        r1.A0E = r1.A0O.getText(i);
        return this;
    }

    public AnonymousClass0Uj A0B(int i) {
        C04070Mr r1 = this.A01;
        r1.A0I = r1.A0O.getText(i);
        return this;
    }

    public AnonymousClass0Uj A0C(int i) {
        C04070Mr r1 = this.A01;
        r1.A0C = null;
        r1.A01 = i;
        return this;
    }

    public AnonymousClass0Uj A0D(DialogInterface.OnCancelListener onCancelListener) {
        this.A01.A02 = onCancelListener;
        return this;
    }

    public AnonymousClass0Uj A0E(DialogInterface.OnClickListener onClickListener, ListAdapter listAdapter) {
        C04070Mr r0 = this.A01;
        r0.A0D = listAdapter;
        r0.A05 = onClickListener;
        return this;
    }

    public AnonymousClass0Uj A0F(DialogInterface.OnClickListener onClickListener, ListAdapter listAdapter, int i) {
        C04070Mr r1 = this.A01;
        r1.A0D = listAdapter;
        r1.A05 = onClickListener;
        r1.A00 = i;
        r1.A0L = true;
        return this;
    }

    public AnonymousClass0Uj A0G(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        C04070Mr r0 = this.A01;
        r0.A0F = charSequence;
        r0.A03 = onClickListener;
        return this;
    }

    public AnonymousClass0Uj A0H(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        C04070Mr r0 = this.A01;
        r0.A0G = charSequence;
        r0.A04 = onClickListener;
        return this;
    }

    public AnonymousClass0Uj A0I(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        C04070Mr r0 = this.A01;
        r0.A0H = charSequence;
        r0.A06 = onClickListener;
        return this;
    }

    public AnonymousClass0Uj A0J(DialogInterface.OnClickListener onClickListener, CharSequence[] charSequenceArr) {
        C04070Mr r0 = this.A01;
        r0.A0M = charSequenceArr;
        r0.A05 = onClickListener;
        return this;
    }

    public AnonymousClass0Uj A0K(DialogInterface.OnClickListener onClickListener, CharSequence[] charSequenceArr, int i) {
        C04070Mr r1 = this.A01;
        r1.A0M = charSequenceArr;
        r1.A05 = onClickListener;
        r1.A00 = i;
        r1.A0L = true;
        return this;
    }

    public AnonymousClass0Uj A0L(DialogInterface.OnDismissListener onDismissListener) {
        this.A01.A07 = onDismissListener;
        return this;
    }

    public AnonymousClass0Uj A0M(DialogInterface.OnKeyListener onKeyListener) {
        this.A01.A08 = onKeyListener;
        return this;
    }

    public AnonymousClass0Uj A0N(DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener, CharSequence[] charSequenceArr, boolean[] zArr) {
        C04070Mr r1 = this.A01;
        r1.A0M = charSequenceArr;
        r1.A09 = onMultiChoiceClickListener;
        r1.A0N = zArr;
        r1.A0K = true;
        return this;
    }

    public AnonymousClass0Uj A0O(Drawable drawable) {
        this.A01.A0A = drawable;
        return this;
    }

    public AnonymousClass0Uj A0P(View view) {
        this.A01.A0B = view;
        return this;
    }

    public AnonymousClass0Uj A0Q(CharSequence charSequence) {
        this.A01.A0E = charSequence;
        return this;
    }

    public AnonymousClass0Uj A0R(boolean z) {
        this.A01.A0J = z;
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass043 create() {
        /*
            r11 = this;
            X.0Mr r7 = r11.A01
            android.content.Context r6 = r7.A0O
            int r0 = r11.A00
            X.043 r4 = new X.043
            r4.<init>(r6, r0)
            X.0Wq r3 = r4.A00
            android.view.View r0 = r7.A0B
            if (r0 == 0) goto L_0x00f3
            r3.A0C = r0
        L_0x0013:
            java.lang.CharSequence r1 = r7.A0E
            if (r1 == 0) goto L_0x0020
            r3.A0Q = r1
            android.widget.TextView r0 = r3.A0K
            if (r0 == 0) goto L_0x0020
            r0.setText(r1)
        L_0x0020:
            java.lang.CharSequence r5 = r7.A0H
            if (r5 == 0) goto L_0x0034
            android.content.DialogInterface$OnClickListener r2 = r7.A06
            r1 = -1
            r0 = 0
            if (r2 == 0) goto L_0x0030
            android.os.Handler r0 = r3.A08
            android.os.Message r0 = r0.obtainMessage(r1, r2)
        L_0x0030:
            r3.A0P = r5
            r3.A0B = r0
        L_0x0034:
            java.lang.CharSequence r5 = r7.A0F
            if (r5 == 0) goto L_0x0048
            android.content.DialogInterface$OnClickListener r2 = r7.A03
            r1 = -2
            r0 = 0
            if (r2 == 0) goto L_0x0044
            android.os.Handler r0 = r3.A08
            android.os.Message r0 = r0.obtainMessage(r1, r2)
        L_0x0044:
            r3.A0N = r5
            r3.A09 = r0
        L_0x0048:
            java.lang.CharSequence r5 = r7.A0G
            if (r5 == 0) goto L_0x005c
            android.content.DialogInterface$OnClickListener r2 = r7.A04
            r1 = -3
            r0 = 0
            if (r2 == 0) goto L_0x0058
            android.os.Handler r0 = r3.A08
            android.os.Message r0 = r0.obtainMessage(r1, r2)
        L_0x0058:
            r3.A0O = r5
            r3.A0A = r0
        L_0x005c:
            java.lang.CharSequence[] r0 = r7.A0M
            if (r0 != 0) goto L_0x0064
            android.widget.ListAdapter r0 = r7.A0D
            if (r0 == 0) goto L_0x0099
        L_0x0064:
            android.view.LayoutInflater r2 = r7.A0P
            int r1 = r3.A03
            r0 = 0
            android.view.View r8 = r2.inflate(r1, r0)
            androidx.appcompat.app.AlertController$RecycleListView r8 = (androidx.appcompat.app.AlertController$RecycleListView) r8
            boolean r0 = r7.A0K
            r2 = 1
            if (r0 == 0) goto L_0x00de
            int r10 = r3.A04
            java.lang.CharSequence[] r9 = r7.A0M
            X.02z r5 = new X.02z
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x007d:
            r3.A0I = r5
            int r0 = r7.A00
            r3.A01 = r0
            android.content.DialogInterface$OnClickListener r0 = r7.A05
            if (r0 == 0) goto L_0x00d4
            r1 = 0
            X.0wJ r0 = new X.0wJ
            r0.<init>(r7, r1, r3)
        L_0x008d:
            r8.setOnItemClickListener(r0)
        L_0x0090:
            boolean r0 = r7.A0L
            if (r0 == 0) goto L_0x00cb
            r8.setChoiceMode(r2)
        L_0x0097:
            r3.A0J = r8
        L_0x0099:
            android.view.View r0 = r7.A0C
            if (r0 == 0) goto L_0x00c1
            r3.A0D = r0
            r0 = 0
            r3.A06 = r0
        L_0x00a2:
            boolean r0 = r7.A0J
            r4.setCancelable(r0)
            boolean r0 = r7.A0J
            if (r0 == 0) goto L_0x00af
            r0 = 1
            r4.setCanceledOnTouchOutside(r0)
        L_0x00af:
            android.content.DialogInterface$OnCancelListener r0 = r7.A02
            r4.setOnCancelListener(r0)
            android.content.DialogInterface$OnDismissListener r0 = r7.A07
            r4.setOnDismissListener(r0)
            android.content.DialogInterface$OnKeyListener r0 = r7.A08
            if (r0 == 0) goto L_0x00c0
            r4.setOnKeyListener(r0)
        L_0x00c0:
            return r4
        L_0x00c1:
            int r1 = r7.A01
            if (r1 == 0) goto L_0x00a2
            r0 = 0
            r3.A0D = r0
            r3.A06 = r1
            goto L_0x00a2
        L_0x00cb:
            boolean r0 = r7.A0K
            if (r0 == 0) goto L_0x0097
            r0 = 2
            r8.setChoiceMode(r0)
            goto L_0x0097
        L_0x00d4:
            android.content.DialogInterface$OnMultiChoiceClickListener r0 = r7.A09
            if (r0 == 0) goto L_0x0090
            X.0ai r0 = new X.0ai
            r0.<init>(r7, r8, r3)
            goto L_0x008d
        L_0x00de:
            boolean r0 = r7.A0L
            if (r0 == 0) goto L_0x00f0
            int r1 = r3.A05
        L_0x00e4:
            android.widget.ListAdapter r5 = r7.A0D
            if (r5 != 0) goto L_0x007d
            java.lang.CharSequence[] r0 = r7.A0M
            X.030 r5 = new X.030
            r5.<init>(r6, r0, r1)
            goto L_0x007d
        L_0x00f0:
            int r1 = r3.A02
            goto L_0x00e4
        L_0x00f3:
            java.lang.CharSequence r1 = r7.A0I
            if (r1 == 0) goto L_0x0100
            r3.A0R = r1
            android.widget.TextView r0 = r3.A0L
            if (r0 == 0) goto L_0x0100
            r0.setText(r1)
        L_0x0100:
            android.graphics.drawable.Drawable r2 = r7.A0A
            if (r2 == 0) goto L_0x0013
            r3.A07 = r2
            r1 = 0
            android.widget.ImageView r0 = r3.A0H
            if (r0 == 0) goto L_0x0013
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r3.A0H
            r0.setImageDrawable(r2)
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Uj.create():X.043");
    }

    public Context getContext() {
        return this.A01.A0O;
    }

    public AnonymousClass0Uj setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        C04070Mr r1 = this.A01;
        r1.A0F = r1.A0O.getText(i);
        r1.A03 = onClickListener;
        return this;
    }

    public AnonymousClass0Uj setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        C04070Mr r1 = this.A01;
        r1.A0H = r1.A0O.getText(i);
        r1.A06 = onClickListener;
        return this;
    }

    public AnonymousClass0Uj setTitle(CharSequence charSequence) {
        this.A01.A0I = charSequence;
        return this;
    }

    public AnonymousClass0Uj setView(View view) {
        C04070Mr r1 = this.A01;
        r1.A0C = view;
        r1.A01 = 0;
        return this;
    }

    public AnonymousClass0Uj(Context context, int i) {
        this.A01 = new C04070Mr(new ContextThemeWrapper(context, AnonymousClass043.A00(context, i)));
        this.A00 = i;
    }

    public AnonymousClass043 A0S() {
        AnonymousClass043 create = create();
        create.show();
        return create;
    }

    public AnonymousClass0Uj(Context context) {
        this(context, AnonymousClass043.A00(context, 0));
    }
}
