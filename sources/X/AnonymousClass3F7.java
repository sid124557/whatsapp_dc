package X;

import android.content.Context;
import android.net.Uri;
import com.whatsapp.jid.Jid;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

/* renamed from: X.3F7  reason: invalid class name */
public final class AnonymousClass3F7 implements C182268o8 {
    public final C55682qk A00;
    public final C85244Fm A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass2Ze A03;

    public void Bgi(Context context, C624134x r16, AnonymousClass39W r17, int i) {
        C55682qk r1;
        String str;
        String str2;
        C162457s7.A0J(context, 0);
        C632938r r0 = r17.A06;
        if (r0 == null || (str2 = r0.A02) == null) {
            r1 = this.A00;
            str = "missing content/shopId";
        } else {
            String A08 = C56952sp.A08(this.A02, 1054);
            if (A08.length() == 0) {
                r1 = this.A00;
                str = "missing url format";
            } else {
                C85244Fm r2 = this.A01;
                Locale locale = Locale.US;
                Objects.requireNonNull(A08);
                String format = String.format(locale, A08, Arrays.copyOf(new Object[]{str2}, 1));
                C162457s7.A0D(format);
                r2.BkW(context, Uri.parse(format), (C624134x) null);
                this.A03.A00((Jid) null, (Integer) null, (String) null, (String) null, 5, 6, 33, false);
                return;
            }
        }
        r1.A0A("OpenShopAction/perform", false, str);
    }

    public AnonymousClass3F7(C55682qk r1, C85244Fm r2, AnonymousClass1VX r3, AnonymousClass2Ze r4) {
        C18260x0.A0c(r3, r1, r2, r4);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
    }
}
