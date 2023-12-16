package X;

import android.text.SpannableString;
import com.whatsapp.util.Log;

/* renamed from: X.26i  reason: invalid class name and case insensitive filesystem */
public final class C382526i {
    public static final SpannableString A00(String str, int i) {
        C162457s7.A0J(str, 0);
        int i2 = i - 3;
        if (C175728Zm.A0C(str, 8206, 0) >= 0) {
            i2++;
        }
        if (str.length() <= 0 || i2 <= 0) {
            Log.e("FlowsUtil/truncateTextWithEllipsis -- actual string is empty or truncatedLength is invalid");
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            String substring = str.substring(0, i2);
            C162457s7.A0D(substring);
            A0o.append(substring);
            str = AnonymousClass000.A0X("...", A0o);
        }
        return new SpannableString(str);
    }
}
