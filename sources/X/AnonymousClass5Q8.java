package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.5Q8  reason: invalid class name */
public final class AnonymousClass5Q8 {
    public int A00;
    public int A01;
    public final Context A02;

    public AnonymousClass5Q8(Context context, C141366vS r5) {
        int i;
        C162457s7.A0J(r5, 2);
        this.A02 = context;
        int ordinal = r5.ordinal();
        if (ordinal == 0) {
            this.A00 = R.color.f5nameremoved;
            i = R.color.f5nameremoved;
        } else if (ordinal == 1) {
            this.A00 = R.color.f5nameremoved;
            i = R.color.f5nameremoved;
        } else {
            return;
        }
        this.A01 = i;
    }

    public final Drawable A00(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        Drawable A012 = C06130Wj.A01(drawable.mutate());
        C162457s7.A0D(A012);
        AnonymousClass0YG.A06(A012, AnonymousClass0Y8.A04(this.A02, R.color.f5nameremoved));
        return A012;
    }

    public final AnonymousClass6D7 A01() {
        Context context = this.A02;
        float dimension = context.getResources().getDimension(R.dimen.f6nameremoved);
        C158227jd r1 = new C158227jd();
        r1.A02(dimension);
        AnonymousClass6D7 r12 = new AnonymousClass6D7(new C161877ql(r1));
        r12.A06(AnonymousClass0Y8.A07(context, this.A01));
        return r12;
    }
}
