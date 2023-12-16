package X;

import android.widget.ImageView;
import com.whatsapp.R;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7PR  reason: invalid class name */
public class AnonymousClass7PR {
    public int A00;
    public int A01;
    public C56852sf A02;
    public final String A03;
    public final String A04;
    public final ConcurrentMap A05;
    public final boolean A06;
    public volatile AtomicBoolean A07 = new AtomicBoolean();

    public AnonymousClass7PR(C186038ue r5) {
        ConcurrentHashMap A1D = AnonymousClass0x9.A1D();
        this.A05 = A1D;
        A1D.put(r5, r5);
        this.A03 = r5.getId();
        this.A04 = r5.BE7();
        this.A00 = r5.B9P();
        this.A01 = r5.B9R();
        ImageView B8H = r5.B8H();
        boolean z = false;
        if (!(B8H == null || B8H.getTag(R.id.optin_for_bitmapool_caching) == null || !AnonymousClass001.A1Z(B8H.getTag(R.id.optin_for_bitmapool_caching)))) {
            z = true;
        }
        this.A06 = z;
    }
}
