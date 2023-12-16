package X;

import android.graphics.Bitmap;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.1sU  reason: invalid class name and case insensitive filesystem */
public class C33131sU extends AnonymousClass3CR {
    public AtomicInteger A00 = new AtomicInteger(SearchActionVerificationClientService.NOTIFICATION_ID);
    public AtomicLong A01 = new AtomicLong(-1);
    public final C19370zQ A02;
    public final C380625j A03;
    public final String A04;

    public Object A06(Object obj) {
        C41282Jq r3 = (C41282Jq) this.A02.A04(obj);
        if (r3 == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.A01.set(currentTimeMillis);
        r3.A00 = currentTimeMillis;
        if (this instanceof C22341Mr) {
            ((C22341Mr) this).A0A();
        }
        return r3.A01;
    }

    public void A07(AnonymousClass49N r4) {
        C86494Ki r1;
        C19370zQ r2 = this.A02;
        if (r4 == null) {
            r1 = null;
        } else {
            r1 = new C86494Ki(r4, 0);
        }
        synchronized (r2) {
            r2.A00 = r1;
        }
    }

    public void A08(Object obj) {
        this.A02.A05(obj);
    }

    public C33131sU(C380625j r4, AnonymousClass2MO r5, String str, int i) {
        super(r5);
        this.A03 = r4;
        this.A04 = str;
        this.A02 = new C19370zQ(this, i);
    }

    public long A05(int i) {
        int i2;
        long currentTimeMillis = System.currentTimeMillis() - ((long) i);
        Iterator A0q = AnonymousClass000.A0q(this.A02.A06());
        long j = 0;
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            if (((C41282Jq) A0w.getValue()).A00 >= currentTimeMillis) {
                break;
            }
            A08(A0w.getKey());
            A0w.getKey();
            Object obj = ((C41282Jq) A0w.getValue()).A01;
            if (this instanceof C22341Mr) {
                i2 = ((Bitmap) obj).getByteCount() / EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            } else {
                i2 = 1;
            }
            j += (long) i2;
        }
        return j;
    }

    public void A09(Object obj, Object obj2) {
        long currentTimeMillis = System.currentTimeMillis();
        this.A01.set(currentTimeMillis);
        this.A02.A08(obj, new C41282Jq(obj2, currentTimeMillis));
        if (this instanceof C22341Mr) {
            ((C22341Mr) this).A0A();
        }
    }
}
