package X;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2t5  reason: invalid class name and case insensitive filesystem */
public class C57102t5 {
    public static int A00(String str) {
        if (!(str == null || str.length() == 0)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                Log.d("Whatsapp", AnonymousClass000.A0V("NumberUtil/Invalid int value:", str, AnonymousClass001.A0o()), e);
            }
        }
        return -1;
    }

    public static Map A01(Map map) {
        HashMap A0t = AnonymousClass001.A0t();
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            C18270x1.A1N(A0t, AnonymousClass001.A0w(A0q));
        }
        return A0t;
    }
}
