package X;

import android.content.Context;
import android.content.res.Resources;
import com.whatsapp.R;
import java.util.Iterator;

/* renamed from: X.27F  reason: invalid class name */
public class AnonymousClass27F {
    public static String A00(Context context, AnonymousClass2RJ r7) {
        Iterator A0q = AnonymousClass000.A0q(r7.A02);
        int i = 0;
        int i2 = 0;
        while (A0q.hasNext()) {
            int A0K = AnonymousClass001.A0K(AnonymousClass0x2.A0W(A0q));
            if (A0K == 419 || A0K == 412) {
                i++;
            } else if (A0K == 417) {
                i2++;
            }
        }
        if (i > 0) {
            Resources resources = context.getResources();
            int i3 = R.plurals.f9nameremoved;
            if (i2 > 0) {
                i3 = R.plurals.f9nameremoved;
                i += i2;
            }
            return AnonymousClass0x2.A0Y(resources, i, 0, i3);
        } else if (i2 > 0) {
            return AnonymousClass0x2.A0Y(context.getResources(), i2, 0, R.plurals.f9nameremoved);
        } else {
            return null;
        }
    }
}
