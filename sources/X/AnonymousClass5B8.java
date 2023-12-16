package X;

import android.widget.TextView;

/* renamed from: X.5B8  reason: invalid class name */
public class AnonymousClass5B8 implements C84144Be {
    public Object A00;
    public final int A01;

    public AnonymousClass5B8(AnonymousClass5ZT r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final void AyM(Object obj) {
        long j;
        if (this.A01 != 0) {
            AnonymousClass5ZT r6 = (AnonymousClass5ZT) this.A00;
            int A0K = AnonymousClass001.A0K(obj);
            if (A0K != r6.A00) {
                C102405Is r4 = r6.A1J;
                boolean z = r6.A12.A08;
                String A0A = C107565bW.A0A(r4.A02, (long) A0K);
                r4.A01.setText(A0A);
                TextView textView = r4.A00;
                textView.setText(A0A);
                if (z) {
                    textView.setVisibility(4);
                }
                r6.A00 = A0K;
                return;
            }
            return;
        }
        AnonymousClass5ZT r0 = (AnonymousClass5ZT) this.A00;
        boolean A1Z = AnonymousClass001.A1Z(obj);
        C116635qb r5 = r0.A1D;
        AnonymousClass5ZQ r02 = r0.A0K;
        if (r02 != null) {
            int A02 = r02.A02();
            boolean A0F = r02.A0F();
            int A03 = r02.A03();
            if (A1Z) {
                A02 = 0;
                A0F = false;
            }
            r5.A04.setProgress(A02);
            r5.A03.setPlaybackPercentage(((float) A02) / ((float) A03));
            if (A0F) {
                j = (long) A02;
            } else {
                j = (long) A03;
            }
            C107565bW.A0I(r5.A02, r5.A0H, C18290x4.A0B(j));
        }
    }
}
