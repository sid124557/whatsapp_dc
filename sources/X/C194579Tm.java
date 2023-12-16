package X;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: X.9Tm  reason: invalid class name and case insensitive filesystem */
public class C194579Tm {
    public AnonymousClass9K2 A00;
    public String A01;
    public String A02;
    public Throwable A03;
    public Map A04;

    public AnonymousClass9KQ A00() {
        String str;
        if (this.A00 != null) {
            if (TextUtils.isEmpty(this.A01)) {
                str = this.A00.mMessage;
            } else {
                str = this.A01;
            }
            Throwable th = this.A03;
            if (th != null) {
                str = TextUtils.join(";", new String[]{str, th.getMessage()});
            }
            return new AnonymousClass9KQ(this.A00, str, this.A02, this.A03, this.A04);
        }
        throw AnonymousClass001.A0c("Must set load exception type");
    }

    public void A01(AnonymousClass9K2 r1) {
        this.A00 = r1;
    }

    public void A02(String str) {
        this.A01 = str;
    }

    public void A03(String str) {
        this.A02 = str;
    }

    public void A04(Throwable th) {
        this.A03 = th;
    }

    public void A05(Map map) {
        this.A04 = map;
    }
}
