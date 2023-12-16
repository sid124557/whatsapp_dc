package X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.9UN  reason: invalid class name */
public class AnonymousClass9UN {
    public static AnonymousClass0PJ A00(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            Object obj = str;
            if (TextUtils.isEmpty(str2)) {
                List asList = Arrays.asList(str.split("\\|"));
                if (asList.size() == 2) {
                    Object A0k = C18290x4.A0k(asList);
                    str2 = TextUtils.join(".", asList);
                    obj = A0k;
                }
            }
            return AnonymousClass0x9.A0G(obj, str2);
        }
        return null;
    }
}
