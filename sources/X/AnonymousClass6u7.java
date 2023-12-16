package X;

import java.io.IOException;

/* renamed from: X.6u7  reason: invalid class name */
public class AnonymousClass6u7 extends IOException {
    public static AnonymousClass6u7 A01(String str) {
        return new AnonymousClass6u7(str);
    }

    public AnonymousClass6u7(String str, Throwable th) {
        super(str, th);
    }

    public static AnonymousClass6u7 A00(Object obj) {
        return new AnonymousClass6u7(obj.toString());
    }

    public static AnonymousClass6u7 A02(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        return new AnonymousClass6u7(sb.toString());
    }

    public AnonymousClass6u7() {
    }

    public AnonymousClass6u7(String str) {
        super(str);
    }
}
