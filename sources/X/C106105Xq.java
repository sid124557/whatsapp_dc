package X;

import android.net.Uri;
import android.os.Bundle;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5Xq  reason: invalid class name and case insensitive filesystem */
public class C106105Xq {
    public final Map A00 = AnonymousClass001.A0t();

    public AnonymousClass5YF A00(Uri uri) {
        Map map = this.A00;
        AnonymousClass5YF r0 = (AnonymousClass5YF) map.get(uri);
        if (r0 != null) {
            return r0;
        }
        Log.e("mediapreviewparams/get/item should be explicitly added");
        AnonymousClass5YF r02 = new AnonymousClass5YF(uri);
        map.put(uri, r02);
        return r02;
    }

    public Collection A01() {
        return C18300x5.A0v(this.A00);
    }

    public void A02(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("media_preview_params");
        if (bundle2 != null) {
            Map map = this.A00;
            map.clear();
            ArrayList parcelableArrayList = bundle2.getParcelableArrayList("items");
            if (parcelableArrayList != null) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    AnonymousClass5YF r1 = ((C108885di) it.next()).A00;
                    map.put(r1.A0G, r1);
                }
            }
        }
    }

    public void A04(AnonymousClass5YF r4) {
        Map map = this.A00;
        Uri uri = r4.A0G;
        if (map.containsKey(uri)) {
            Log.e("mediapreviewparams/add/item was already added");
        }
        map.put(uri, r4);
    }

    public C106105Xq(AnonymousClass5YF r2) {
        A04(r2);
    }

    public final void A03(Bundle bundle) {
        String str;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator A0v = AnonymousClass001.A0v(this.A00);
        while (A0v.hasNext()) {
            AnonymousClass5YF r0 = (AnonymousClass5YF) A0v.next();
            C162457s7.A0J(r0, 1);
            Uri uri = r0.A0G;
            C162457s7.A0D(uri);
            Byte A08 = r0.A08();
            File A07 = r0.A07();
            String A09 = r0.A09();
            String A0B = r0.A0B();
            String A0A = r0.A0A();
            synchronized (r0) {
                str = r0.A0B;
            }
            int A01 = r0.A01();
            File A05 = r0.A05();
            C108885di r4 = new C108885di(r0.A02(), r0.A03(), uri, A07, A05, A08, A09, A0B, A0A, str, A01, r0.A00(), r0.A0J());
            r4.A00 = r0;
            A0s.add(r4);
        }
        bundle.putParcelableArrayList("items", A0s);
    }

    public C106105Xq() {
    }
}
