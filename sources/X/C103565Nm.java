package X;

import android.content.Context;
import android.text.Spannable;

/* renamed from: X.5Nm  reason: invalid class name and case insensitive filesystem */
public final class C103565Nm {
    public final C69263Wi A00;
    public final C85244Fm A01;
    public final C620633i A02;
    public final C114635nM A03;

    public final int A00(Context context, Spannable spannable, C624134x r15) {
        C624134x r9 = r15;
        C18260x0.A0Q(spannable, r15);
        Object[] spans = spannable.getSpans(0, spannable.length(), C86984Mq.class);
        C162457s7.A0D(spans);
        for (C86984Mq r0 : (C86984Mq[]) spans) {
            AnonymousClass75N.A00(spannable, spannable, r0, new C89244c9(context, this.A01, this.A00, this.A02, r9, r0.A00, r0.A01));
        }
        return r2;
    }

    public C103565Nm(C69263Wi r1, C85244Fm r2, C620633i r3, C114635nM r4) {
        C18260x0.A0c(r4, r1, r3, r2);
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
