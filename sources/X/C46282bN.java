package X;

import android.os.Process;
import android.text.TextUtils;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: X.2bN  reason: invalid class name and case insensitive filesystem */
public class C46282bN {
    public final long A00 = System.currentTimeMillis();
    public final String A01;
    public final String A02;
    public final String A03 = Thread.currentThread().getName();
    public final Object[] A04;

    public C46282bN(String str, String str2, Object[] objArr) {
        this.A02 = str;
        this.A01 = str2;
        this.A04 = objArr;
    }

    public String toString() {
        try {
            JSONObject A1G = AnonymousClass0x9.A1G();
            StringBuilder A0o = AnonymousClass001.A0o();
            String str = this.A02;
            if (!TextUtils.isEmpty(str)) {
                A0o.append(str);
                A0o.append(": ");
            }
            A0o.append(String.format(Locale.ROOT, this.A01, this.A04));
            C18300x5.A1L(A0o, "content", A1G);
            A1G.put("time", this.A00);
            A1G.put("thread", this.A03);
            A1G.put("process", Process.myPid());
            return A1G.toString();
        } catch (Exception e) {
            Locale locale = Locale.ROOT;
            Object[] A0L = AnonymousClass002.A0L();
            A0L[0] = e.getMessage();
            return String.format(locale, "Invalid log: %s", A0L);
        }
    }
}
