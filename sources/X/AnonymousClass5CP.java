package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.whatsapp.R;

/* renamed from: X.5CP  reason: invalid class name */
public final class AnonymousClass5CP {
    public static final float A00(Context context) {
        C162457s7.A0J(context, 0);
        TypedValue A0B = AnonymousClass4L0.A0B();
        if (context.getTheme().resolveAttribute(R.attr.f3nameremoved, A0B, true)) {
            return TypedValue.complexToDimension(A0B.data, AnonymousClass000.A0B(context));
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Attribute ");
        A0o.append(R.attr.f3nameremoved);
        throw new Resources.NotFoundException(AnonymousClass000.A0X(" could not be resolved", A0o));
    }
}
