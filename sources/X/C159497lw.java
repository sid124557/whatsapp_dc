package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import com.whatsapp.R;

/* renamed from: X.7lw  reason: invalid class name and case insensitive filesystem */
public final class C159497lw {
    public static final PointF A00(Context context, C142746xh r4, C142556xO r5) {
        float f;
        Resources resources;
        int i;
        Resources resources2;
        int i2;
        C162457s7.A0J(r5, 0);
        int ordinal = r4.ordinal();
        if (ordinal == 0) {
            int ordinal2 = r5.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    return new PointF(0.0f, 0.0f);
                }
                resources2 = context.getResources();
                i2 = R.dimen.f6nameremoved;
                f = resources2.getDimension(i2);
                resources = context.getResources();
                i = R.dimen.f6nameremoved;
                return new PointF(f, resources.getDimension(i));
            }
        } else if (ordinal == 1) {
            switch (r5.ordinal()) {
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                case 3:
                case 4:
                    resources2 = context.getResources();
                    i2 = R.dimen.f6nameremoved;
                    break;
                case 5:
                    f = context.getResources().getDimension(R.dimen.f6nameremoved);
                    resources = context.getResources();
                    i = R.dimen.f6nameremoved;
                    break;
                default:
                    throw C73153f1.A00();
            }
        } else {
            throw C73153f1.A00();
        }
        f = context.getResources().getDimension(R.dimen.f6nameremoved);
        resources = context.getResources();
        i = R.dimen.f6nameremoved;
        return new PointF(f, resources.getDimension(i));
    }

    public static final C150647Rq A01(Context context, C142556xO r2) {
        float f = A02(r2).A00(context).A01;
        switch (r2.ordinal()) {
            case 0:
                return new C139896sp(f);
            case 1:
            case 2:
            case 3:
                return new C139926ss(f);
            case 4:
                return new C139916sr(f);
            case 5:
                return new C139906sq(f);
            default:
                throw C73153f1.A00();
        }
    }

    public static final C142816xp A02(C142556xO r0) {
        switch (r0.ordinal()) {
            case 0:
                return C142816xp.EXTRA_SMALL;
            case 1:
                return C142816xp.SMALL;
            case 2:
                return C142816xp.MEDIUM;
            case 3:
                return C142816xp.LARGE;
            case 4:
                return C142816xp.EXTRA_LARGE;
            case 5:
                return C142816xp.EXTRA_EXTRA_LARGE;
            default:
                throw C73153f1.A00();
        }
    }
}
