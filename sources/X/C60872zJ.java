package X;

import android.text.TextUtils;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.QuicException;

/* renamed from: X.2zJ  reason: invalid class name and case insensitive filesystem */
public class C60872zJ {
    public final C55682qk A00;
    public final C54292oU A01;
    public final C133626hg A02;
    public final AnonymousClass1VX A03;
    public final C56312rm A04;

    public static String A00(Throwable th, boolean z) {
        Integer num;
        String str;
        String str2 = "";
        if (!(th instanceof CronetException)) {
            return str2;
        }
        Integer num2 = null;
        if (th instanceof NetworkException) {
            num = Integer.valueOf(((NetworkException) th).getErrorCode());
        } else {
            num = null;
        }
        if (th instanceof QuicException) {
            num2 = Integer.valueOf(((QuicException) th).getQuicDetailedErrorCode());
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        if (z) {
            str = "Upload ";
        } else {
            str = "Download ";
        }
        A0o.append(str);
        if (th.getMessage() != null) {
            str2 = AnonymousClass000.A0V(th.getMessage(), "\n", AnonymousClass001.A0o());
        }
        A0o.append(str2);
        if (th.getCause() != null) {
            th = th.getCause();
        }
        A0o.append(C615631i.A00(th));
        A0o.append("\n");
        A0o.append(num);
        return AnonymousClass000.A0P(num2, "\n", A0o);
    }

    public boolean A02() {
        if (!AnonymousClass000.A1T(C159787mS.A00(this.A01.A00)) || this.A04.A06() || this.A02.A01() == null || !this.A03.A0Y(C58422vE.A01, 4391)) {
            return false;
        }
        return true;
    }

    public C60872zJ(C55682qk r1, C54292oU r2, C133626hg r3, AnonymousClass1VX r4, C56312rm r5) {
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
    }

    public void A01(String str) {
        if (!TextUtils.isEmpty(str) && this.A03.A0Y(C58422vE.A02, 5478)) {
            this.A00.A0A("CronetExceptionFinal", true, str);
        }
    }
}
