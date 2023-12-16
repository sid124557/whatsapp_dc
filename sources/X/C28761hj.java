package X;

import android.content.Context;
import android.text.format.Formatter;
import com.whatsapp.R;
import java.util.Iterator;

/* renamed from: X.1hj  reason: invalid class name and case insensitive filesystem */
public class C28761hj extends C61102zi {
    public void A08(int i) {
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            C42352Nt r6 = (C42352Nt) A03.next();
            if (i == 0) {
                Context context = r6.A00;
                r6.A02.A00(AnonymousClass0x2.A0X(context, Formatter.formatFileSize(context, r6.A01.A03()), 1, R.string.f11nameremoved));
            } else if (i == 1) {
                long A032 = r6.A01.A03();
                if (A032 < 10485760) {
                    Context context2 = r6.A00;
                    String formatFileSize = Formatter.formatFileSize(context2, A032);
                    C18260x0.A0s("errorreporter/diskio/diskspace ", formatFileSize, AnonymousClass001.A0o());
                    if (formatFileSize != null) {
                        C49262gF r2 = r6.A02;
                        StringBuilder A0o = AnonymousClass001.A0o();
                        AnonymousClass0x2.A1N(A0o, context2.getString(R.string.f11nameremoved));
                        r2.A00(AnonymousClass000.A0X(AnonymousClass0x2.A0X(context2, formatFileSize, 1, R.string.f11nameremoved), A0o));
                    }
                }
                r6.A02.A00(r6.A00.getString(R.string.f11nameremoved));
            } else if (i == 2) {
                r6.A02.A00(r6.A00.getString(R.string.f11nameremoved));
            } else if (i != 3) {
                r6.A02.A00(r6.A00.getString(R.string.f11nameremoved));
            } else {
                r6.A02.A00(r6.A00.getString(R.string.f11nameremoved));
            }
        }
    }

    public C28761hj(C183538qC r1) {
        super(r1);
    }
}
