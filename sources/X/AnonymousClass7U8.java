package X;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7U8  reason: invalid class name */
public final class AnonymousClass7U8 {
    public Uri A00;
    public C1442570q A01 = new C1442570q();
    public AnonymousClass7F2 A02 = new AnonymousClass7F2();
    public C1442670r A03 = new C1442670r();
    public String A04;
    public List A05 = Collections.emptyList();
    public List A06 = Collections.emptyList();

    public C1672480i A00() {
        AnonymousClass6JT r3 = null;
        Uri uri = this.A00;
        if (uri != null) {
            r3 = new AnonymousClass6JT(uri, this.A05, this.A06);
        }
        String str = this.A04;
        if (str == null) {
            str = "";
        }
        return new C1672480i(new AnonymousClass6JS(), new AnonymousClass80c(), r3, AnonymousClass80e.A00, str);
    }
}
