package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: X.0Su  reason: invalid class name and case insensitive filesystem */
public class C05300Su {
    public BlockingDeque A00 = new LinkedBlockingDeque();

    public static String A00(List list) {
        StringBuilder A0o = AnonymousClass001.A0o();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            long j = (longValue >> 63) ^ (longValue << 1);
            while (true) {
                long j2 = (long) 128;
                if (j < j2) {
                    break;
                }
                j >>= 7;
                A0o.append((char) ((int) (j2 | (((long) 127) & j))));
            }
            A0o.append((char) ((int) j));
        }
        StringBuilder sb = new StringBuilder(A0o.toString());
        StringBuilder A0o2 = AnonymousClass001.A0o();
        StringBuilder A0o3 = AnonymousClass001.A0o();
        int length = sb.length() % 3;
        if (length > 0) {
            while (length < 3) {
                A0o3.append('=');
                sb.append(0);
                length++;
            }
        }
        for (int i = 0; i < sb.length(); i += 3) {
            int charAt = (sb.charAt(i) << 16) + (sb.charAt(i + 1) << 8) + sb.charAt(i + 2);
            A0o2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((charAt >> 18) & 63));
            A0o2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((charAt >> 12) & 63));
            A0o2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((charAt >> 6) & 63));
            A0o2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(charAt & 63));
        }
        return AnonymousClass000.A0P(A0o3, A0o2.substring(0, A0o2.length() - A0o3.length()), AnonymousClass001.A0o());
    }
}
