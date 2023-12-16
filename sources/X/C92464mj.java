package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.4mj  reason: invalid class name and case insensitive filesystem */
public abstract class C92464mj extends C93314oJ {
    public int A22(int i) {
        int A01;
        Context context = getContext();
        Context context2 = getContext();
        if (i == 0) {
            A01 = AnonymousClass5Yj.A02(context2, R.attr.f3nameremoved, R.color.f5nameremoved);
        } else {
            A01 = AnonymousClass34K.A01(context2, R.attr.f3nameremoved);
        }
        return AnonymousClass0Y8.A04(context, A01);
    }

    public void A23(AnonymousClass5UY r4, int i) {
        int A22 = A22(i);
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1A(this, A0o);
        r4.A0A(new C172118Jr(A22), AnonymousClass000.A0X("#updateProgressBarColor", A0o));
    }

    public C92464mj(Context context, AnonymousClass677 r2, C624134x r3) {
        super(context, r2, r3);
    }
}
