package X;

import android.text.TextUtils;
import java.nio.CharBuffer;

/* renamed from: X.7nY  reason: invalid class name and case insensitive filesystem */
public class C160387nY {
    public final String A00;
    public final String A01;
    public final String A02;

    public C160387nY(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public static void A00(CharBuffer charBuffer) {
        int limit = charBuffer.limit() - charBuffer.position();
        if (limit >= 4 || limit <= 0) {
            throw AnonymousClass001.A0c("IPV4 octet must contain between 1 and 3 digits");
        }
        try {
            int parseInt = Integer.parseInt(charBuffer.toString(), 10);
            if (parseInt < 0 || parseInt > 255) {
                throw AnonymousClass000.A0G("IPV4 octet value must be between 0 and 255, got ", AnonymousClass001.A0o(), parseInt);
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(AnonymousClass000.A0P(charBuffer, "Unable to parse decimal octet ", AnonymousClass001.A0o()), e);
        }
    }

    public String A01() {
        StringBuilder A0o = AnonymousClass001.A0o();
        if (!TextUtils.isEmpty(this.A02)) {
            A0o.append("<REDACTED>");
            A0o.append("@");
        }
        String str = this.A00;
        if (!TextUtils.isEmpty(str)) {
            A0o.append(str);
        }
        String str2 = this.A01;
        if (!TextUtils.isEmpty(str2)) {
            A0o.append(":");
            A0o.append(str2);
        }
        return A0o.toString();
    }

    public String toString() {
        return A01();
    }
}
