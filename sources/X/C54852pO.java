package X;

import android.content.Context;
import android.util.SparseArray;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.2pO  reason: invalid class name and case insensitive filesystem */
public class C54852pO {
    public SparseArray A00 = new SparseArray();
    public Map A01 = Collections.emptyMap();
    public Map A02 = Collections.emptyMap();
    public final Context A03;
    public final AnonymousClass7r0 A04;
    public final C47382dA A05;

    public C159037kz A00() {
        Context context = this.A03;
        context.getClass();
        AnonymousClass7r0 r3 = this.A04;
        r3.getClass();
        Map map = this.A01;
        Map map2 = this.A02;
        C47382dA r4 = this.A05;
        r4.getClass();
        return new C159037kz(context, this.A00, r3, r4, map, map2);
    }

    public void A01(SparseArray sparseArray) {
        this.A00 = sparseArray;
    }

    public void A02(Map map) {
        this.A01 = map;
    }

    public void A03(Map map) {
        this.A02 = map;
    }

    public C54852pO(Context context, AnonymousClass7r0 r3, C47382dA r4) {
        this.A03 = context;
        this.A04 = r3;
        this.A05 = r4;
    }
}
