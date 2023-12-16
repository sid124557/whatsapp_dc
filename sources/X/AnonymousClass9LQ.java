package X;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: X.9LQ  reason: invalid class name */
public class AnonymousClass9LQ {
    public static Object A00(Object obj, int i, boolean z) {
        if (obj != null) {
            boolean z2 = false;
            if (i != 1) {
                if (i == 2) {
                    return Long.valueOf(C18310x6.A0B(obj));
                }
                if (i == 3) {
                    return Float.valueOf(AnonymousClass001.A05(obj));
                }
                if (i != 4) {
                    if (i != 5) {
                        Log.d("Whatsapp", AnonymousClass000.A0Y("BloksFieldStatParser/parseValue/unknown type/type=", AnonymousClass001.A0o(), i));
                        return null;
                    }
                    String str = (String) obj;
                    if (str != null) {
                        String[] split = TextUtils.split(str, "\\|");
                        int length = split.length;
                        if (length != 2) {
                            Log.d("Whatsapp", AnonymousClass000.A0Y("BloksFieldStatParser/parseValue/invalid enum format/length=", AnonymousClass001.A0o(), length));
                            return null;
                        } else if (z) {
                            return split[1];
                        } else {
                            return Integer.valueOf(C57102t5.A00(split[0]));
                        }
                    }
                }
            } else if (!(obj instanceof Boolean)) {
                if (1 == AnonymousClass001.A0K(obj)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
            return obj;
        }
        return null;
    }
}
