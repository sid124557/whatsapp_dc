package X;

import com.whatsapp.R;
import java.util.Map;

/* renamed from: X.2x9  reason: invalid class name and case insensitive filesystem */
public final class C59582x9 {
    public final C29441ip A00;
    public final C54292oU A01;
    public final C66543Lv A02;
    public final AnonymousClass4FS A03;

    public static final Map A00(String str, String str2) {
        AnonymousClass3Z6[] r2 = new AnonymousClass3Z6[2];
        AnonymousClass3Z6.A04("screen", str2, r2);
        AnonymousClass3Z6.A05(C373621y.ERROR.key, C57692u3.A04(C373621y.ERROR_MESSAGE.key, str), r2);
        return C73813g7.A0F(r2);
    }

    public final String A01() {
        C54292oU r2 = this.A01;
        boolean A0F = this.A00.A0F();
        int i = R.string.f11nameremoved;
        if (!A0F) {
            i = R.string.f11nameremoved;
        }
        return C54292oU.A04(r2, i);
    }

    public C59582x9(C29441ip r1, C54292oU r2, C66543Lv r3, AnonymousClass4FS r4) {
        C18260x0.A0c(r2, r1, r4, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
    }
}
