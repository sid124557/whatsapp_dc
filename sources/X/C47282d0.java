package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2d0  reason: invalid class name and case insensitive filesystem */
public class C47282d0 {
    public boolean A00;
    public final Context A01;
    public final ExecutorService A02 = Executors.newSingleThreadExecutor();
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public final AtomicInteger A04 = new AtomicInteger(0);
    public final C73213f7 A05;
    public final C53752nb A06;
    public final C103135Lr A07;
    public final C59692xK A08;

    public C47282d0(Context context, C146907Cb r8, AnonymousClass73V r9, String str, List list, int i, int i2, boolean z) {
        this.A06 = new C53752nb(r8, z);
        this.A01 = context;
        C103135Lr r5 = new C103135Lr();
        this.A07 = r5;
        this.A08 = new C59692xK(context, r8, r9, str, r5);
        C71303bt r1 = new C71303bt(this);
        if (!this.A00) {
            this.A02.execute(r1);
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((AnonymousClass4CA) it.next()).BmX(this);
            }
        }
        C73213f7 r0 = new C73213f7(this.A04, this.A06, this.A08, i, i2);
        this.A05 = r0;
        r0.start();
    }

    public void A00() {
        C71303bt r1 = new C71303bt(this, 14);
        if (!this.A00) {
            this.A02.execute(r1);
        }
    }
}
