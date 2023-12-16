package X;

import android.util.Log;

/* renamed from: X.3Av  reason: invalid class name */
public class AnonymousClass3Av implements C834948q {
    public void Bja(String str, String str2, Throwable th) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("category=");
        A0o.append(str);
        A0o.append(", message=");
        A0o.append(str2);
        if (th != null) {
            C18270x1.A1H(A0o, ", cause=", th);
        }
        Log.e("Security-LocalReporter", A0o.toString());
    }
}
