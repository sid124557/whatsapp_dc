package X;

import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.72N  reason: invalid class name */
public class AnonymousClass72N {
    public static void A00(StringBuilder sb, HashMap hashMap) {
        sb.append("{");
        Iterator A11 = C18290x4.A11(hashMap);
        boolean z = true;
        while (A11.hasNext()) {
            String A0m = AnonymousClass001.A0m(A11);
            if (!z) {
                C18320x8.A1K(sb);
            }
            String A0e = C18320x8.A0e(A0m, hashMap);
            sb.append("\"");
            sb.append(A0m);
            sb.append("\":");
            if (A0e == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(A0e);
                sb.append("\"");
            }
            z = false;
        }
        sb.append("}");
    }
}
