package X;

import android.content.Context;
import android.util.SparseArray;
import com.whatsapp.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7bI  reason: invalid class name and case insensitive filesystem */
public class C153427bI {
    public final Context A00;
    public final SparseArray A01;
    public final C47382dA A02;
    public final Map A03 = Collections.synchronizedMap(new HashMap(4));
    public final Map A04 = new HashMap(4);
    public final boolean A05;

    public Context A00() {
        return this.A00;
    }

    public C47382dA A01() {
        return this.A02;
    }

    public Object A02(int i) {
        Object obj = this.A01.get(i);
        if (obj != null) {
            return obj;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Null value associated with key: ");
        throw AnonymousClass0x2.A0V(this.A00.getResources().getResourceEntryName(i), A0o);
    }

    public Object A03(C181398mh r6, AnonymousClass84O r7, int i) {
        Integer valueOf;
        Object obj;
        Object obj2;
        int i2 = r7.A02;
        synchronized (this) {
            Map map = this.A04;
            valueOf = Integer.valueOf(i2);
            obj = map.get(valueOf);
            if (obj == null) {
                obj = AnonymousClass002.A0D();
                map.put(valueOf, obj);
            }
        }
        synchronized (obj) {
            Map map2 = this.A03;
            SparseArray sparseArray = (SparseArray) map2.get(valueOf);
            if (sparseArray == null) {
                sparseArray = new SparseArray(2);
                map2.put(valueOf, sparseArray);
            }
            obj2 = sparseArray.get(i);
            if (obj2 == null) {
                obj2 = r6.BLU(this, r7);
            }
            sparseArray.put(i, obj2);
        }
        return obj2;
    }

    public boolean A05() {
        return this.A05;
    }

    public C153427bI(Context context, SparseArray sparseArray, C47382dA r5) {
        this.A00 = context;
        this.A02 = r5;
        this.A05 = r5.A02.A02;
        this.A01 = sparseArray;
    }

    public void A04() {
        this.A01.get(R.id.bk_context_key_rendercore_extensions_creator);
    }
}
