package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.6xp  reason: invalid class name and case insensitive filesystem */
public enum C142816xp {
    EXTRA_SMALL(R.dimen.f6nameremoved, R.dimen.f6nameremoved, R.dimen.f6nameremoved),
    SMALL(R.dimen.f6nameremoved, R.dimen.f6nameremoved, R.dimen.f6nameremoved),
    MEDIUM(R.dimen.f6nameremoved, R.dimen.f6nameremoved, R.dimen.f6nameremoved),
    LARGE(R.dimen.f6nameremoved, R.dimen.f6nameremoved, R.dimen.f6nameremoved),
    EXTRA_LARGE(R.dimen.f6nameremoved, R.dimen.f6nameremoved, R.dimen.f6nameremoved),
    EXTRA_EXTRA_LARGE(R.dimen.f6nameremoved, R.dimen.f6nameremoved, R.dimen.f6nameremoved);
    
    public final int dimension;
    public final int innerStrokeWidth;
    public final int strokeWidth;

    /* access modifiers changed from: public */
    static {
        C142816xp[] r0;
        A00 = C73653fr.A00(r0);
    }

    /* access modifiers changed from: public */
    C142816xp(int i, int i2, int i3) {
        this.dimension = i;
        this.strokeWidth = i2;
        this.innerStrokeWidth = i3;
    }

    public final C152457Yy A00(Context context) {
        float dimension2 = context.getResources().getDimension(this.dimension);
        return new C152457Yy(new AnonymousClass7YX(dimension2, dimension2), context.getResources().getDimension(this.strokeWidth), context.getResources().getDimension(this.innerStrokeWidth));
    }
}
