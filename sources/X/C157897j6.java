package X;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: X.7j6  reason: invalid class name and case insensitive filesystem */
public final class C157897j6 {
    public final String A00;

    public static String A00(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                String join = TextUtils.join(", ", objArr);
                StringBuilder A0l = AnonymousClass000.A0l(str2);
                A0l.append(" [");
                str2 = AnonymousClass000.A0W(join, A0l);
            }
        }
        return AnonymousClass000.A0V(" : ", str2, AnonymousClass000.A0l(str));
    }

    public final void A01(String str, Throwable th, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", A00(this.A00, str, objArr), th);
        }
    }

    public final void A02(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", A00(this.A00, str, objArr));
        }
    }

    public C157897j6(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UID: [");
        A0o.append(myUid);
        A0o.append("]  PID: [");
        A0o.append(myPid);
        this.A00 = AnonymousClass000.A0X("] ", A0o).concat(str);
    }
}
