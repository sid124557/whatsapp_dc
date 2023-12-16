package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.320  reason: invalid class name */
public class AnonymousClass320 {
    public static final boolean A00 = C18280x3.A1U(Build.VERSION.SDK_INT, 23);

    public static List A01(List list, Set set) {
        C106655Zv[] r3;
        if (set == null || list == null) {
            return AnonymousClass002.A0I(0);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass39M A0b = AnonymousClass0x7.A0b(it);
            AnonymousClass330 r0 = A0b.A04;
            if (r0 != null && (r3 = r0.A0B) != null) {
                int length = r3.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (set.contains(r3[i])) {
                        A0s.add(A0b);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        return A0s;
    }

    public static String A00(Context context, AnonymousClass39M r4) {
        String str = r4.A07;
        if (TextUtils.isEmpty(str)) {
            return context.getString(R.string.f11nameremoved);
        }
        return context.getString(R.string.f11nameremoved, AnonymousClass000.A1b(str));
    }
}
