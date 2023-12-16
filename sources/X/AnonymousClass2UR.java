package X;

import android.content.Context;
import android.graphics.Typeface;
import com.whatsapp.R;

/* renamed from: X.2UR  reason: invalid class name */
public abstract class AnonymousClass2UR {
    public Typeface A00(Context context, String str, int i) {
        int i2;
        Typeface A02;
        C18260x0.A0O(context, str);
        if (str.equals("Optimistic Display App")) {
            i2 = R.font.optimistic_text_bold;
        } else {
            if (str.equals("Optimistic Display App Medium")) {
                i2 = R.font.optimistic_text_medium_regular;
            }
            Typeface create = Typeface.create(str, i);
            C162457s7.A0D(create);
            return create;
        }
        Integer valueOf = Integer.valueOf(i2);
        if (!(valueOf == null || (A02 = C06400Xn.A02(context, valueOf.intValue())) == null)) {
            return A02;
        }
        Typeface create2 = Typeface.create(str, i);
        C162457s7.A0D(create2);
        return create2;
    }
}
