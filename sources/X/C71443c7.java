package X;

import android.content.Context;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.3c7  reason: invalid class name and case insensitive filesystem */
public class C71443c7 implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public final int A05;

    public C71443c7(AnonymousClass4BM r2, C27841el r3, AnonymousClass39M r4, long j) {
        this.A05 = 2;
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = true;
        this.A00 = j;
        this.A03 = r2;
    }

    public final void run() {
        TextView textView;
        Number number;
        boolean z;
        long j;
        C93324oK r0;
        String A032;
        int intValue;
        switch (this.A05) {
            case 0:
                r0 = (C93324oK) this.A01;
                textView = (TextView) this.A02;
                j = this.A00;
                z = this.A04;
                number = (Number) this.A03;
                break;
            case 1:
                r0 = (C93324oK) this.A01;
                textView = (TextView) this.A02;
                number = (Number) this.A03;
                j = this.A00;
                z = this.A04;
                break;
            default:
                long j2 = this.A00;
                C27841el.A00((AnonymousClass4BM) this.A03, (C27841el) this.A01, (AnonymousClass39M) this.A02, j2);
                return;
        }
        Context context = r0.getContext();
        C620733j r3 = r0.A0M;
        if (j <= 0) {
            A032 = "";
        } else {
            A032 = AnonymousClass35V.A03(r3, j);
        }
        if (number == null) {
            if (z) {
                intValue = R.string.f11nameremoved;
            }
            textView.setText(A032);
        }
        intValue = number.intValue();
        A032 = AnonymousClass0x2.A0X(context, A032, 1, intValue);
        textView.setText(A032);
    }

    public C71443c7(Object obj, Object obj2, Object obj3, int i, long j, boolean z) {
        this.A05 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = j;
        this.A04 = z;
        this.A03 = obj3;
    }
}
