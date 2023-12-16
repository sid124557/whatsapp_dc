package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;

/* renamed from: X.5YH  reason: invalid class name */
public class AnonymousClass5YH {
    public static float A00(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Motion easing control point value must be between 0 and 1; instead got: ");
        A0o.append(parseFloat);
        throw AnonymousClass001.A0c(A0o.toString());
    }

    public static TimeInterpolator A01(TimeInterpolator timeInterpolator, Context context, int i) {
        TypedValue A0B = AnonymousClass4L0.A0B();
        if (!context.getTheme().resolveAttribute(i, A0B, true)) {
            return timeInterpolator;
        }
        if (A0B.type == 3) {
            String valueOf = String.valueOf(A0B.string);
            if (!A02(valueOf, "cubic-bezier") && !A02(valueOf, "path")) {
                return AnimationUtils.loadInterpolator(context, A0B.resourceId);
            }
            if (A02(valueOf, "cubic-bezier")) {
                String[] A1b = C18320x8.A1b(valueOf.substring("cubic-bezier".length() + 1, valueOf.length() - 1));
                int length = A1b.length;
                if (length == 4) {
                    return C05030Rp.A00(A00(A1b, 0), A00(A1b, 1), A00(A1b, 2), A00(A1b, 3));
                }
                throw AnonymousClass000.A0G("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ", AnonymousClass001.A0o(), length);
            } else if (A02(valueOf, "path")) {
                return C05030Rp.A01(AnonymousClass0WW.A00(valueOf.substring("path".length() + 1, valueOf.length() - 1)));
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Invalid motion easing type: ");
                throw AnonymousClass000.A0F(valueOf, A0o);
            }
        } else {
            throw AnonymousClass001.A0c("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
    }

    public static boolean A02(String str, String str2) {
        if (!str.startsWith(AnonymousClass000.A0X("(", AnonymousClass000.A0l(str2))) || !str.endsWith(")")) {
            return false;
        }
        return true;
    }
}
