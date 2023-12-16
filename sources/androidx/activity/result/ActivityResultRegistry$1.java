package androidx.activity.result;

import X.AnonymousClass0GH;
import X.AnonymousClass0US;
import X.C03610Kw;
import X.C04520Op;
import X.C06800Zg;
import X.C15530rW;
import X.C15910sA;
import X.C17280vG;
import android.os.Bundle;
import java.util.Map;

public class ActivityResultRegistry$1 implements C17280vG {
    public final /* synthetic */ AnonymousClass0US A00;
    public final /* synthetic */ C15530rW A01;
    public final /* synthetic */ C04520Op A02;
    public final /* synthetic */ String A03;

    public ActivityResultRegistry$1(AnonymousClass0US r1, C15530rW r2, C04520Op r3, String str) {
        this.A00 = r1;
        this.A03 = str;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void BcK(AnonymousClass0GH r7, C15910sA r8) {
        if (AnonymousClass0GH.ON_START.equals(r7)) {
            AnonymousClass0US r5 = this.A00;
            Map map = r5.A07;
            String str = this.A03;
            C15530rW r3 = this.A01;
            C04520Op r2 = this.A02;
            map.put(str, new C03610Kw(r3, r2));
            Map map2 = r5.A05;
            if (map2.containsKey(str)) {
                Object obj = map2.get(str);
                map2.remove(str);
                r3.BM2(obj);
            }
            Bundle bundle = r5.A02;
            C06800Zg r0 = (C06800Zg) bundle.getParcelable(str);
            if (r0 != null) {
                bundle.remove(str);
                r3.BM2(r2.A07(r0.A01, r0.A00));
            }
        } else if (AnonymousClass0GH.ON_STOP.equals(r7)) {
            this.A00.A07.remove(this.A03);
        } else if (AnonymousClass0GH.ON_DESTROY.equals(r7)) {
            this.A00.A05(this.A03);
        }
    }
}
