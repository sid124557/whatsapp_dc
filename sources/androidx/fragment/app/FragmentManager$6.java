package androidx.fragment.app;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0GH;
import X.AnonymousClass0O9;
import X.C08270df;
import X.C15900s9;
import X.C15910sA;
import X.C17280vG;
import android.os.Bundle;
import android.util.Log;
import java.util.Map;

public class FragmentManager$6 implements C17280vG {
    public final /* synthetic */ C08270df A00;
    public final /* synthetic */ C15900s9 A01;
    public final /* synthetic */ AnonymousClass0O9 A02;
    public final /* synthetic */ String A03;

    public FragmentManager$6(C08270df r1, C15900s9 r2, AnonymousClass0O9 r3, String str) {
        this.A00 = r1;
        this.A03 = str;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void BcK(AnonymousClass0GH r5, C15910sA r6) {
        if (r5 == AnonymousClass0GH.ON_START) {
            Map map = this.A00.A0c;
            String str = this.A03;
            Bundle bundle = (Bundle) map.get(str);
            if (bundle != null) {
                this.A01.BTp(str, bundle);
                map.remove(str);
                if (C08270df.A04()) {
                    Log.v("FragmentManager", AnonymousClass000.A0V("Clearing fragment result with key ", str, AnonymousClass001.A0o()));
                }
            }
        }
        if (r5 == AnonymousClass0GH.ON_DESTROY) {
            this.A02.A01(this);
            this.A00.A0b.remove(this.A03);
        }
    }
}
