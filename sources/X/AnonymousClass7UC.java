package X;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.7UC  reason: invalid class name */
public final class AnonymousClass7UC {
    public Uri A00;
    public Object A01;
    public String A02;
    public List A03 = Collections.emptyList();
    public List A04 = Collections.emptyList();
    public List A05 = Collections.emptyList();
    public Map A06 = Collections.emptyMap();

    public C151877Wq A00() {
        Uri uri = this.A00;
        AnonymousClass7WW r4 = null;
        if (uri != null) {
            r4 = new AnonymousClass7WW(uri, this.A01, this.A04, this.A05);
            String str = this.A02;
            if (str == null) {
                str = uri.toString();
            }
            this.A02 = str;
        }
        String str2 = this.A02;
        str2.getClass();
        return new C151877Wq(new C151377Un(), new C151387Uo(), r4, new C151397Up(), str2);
    }
}
