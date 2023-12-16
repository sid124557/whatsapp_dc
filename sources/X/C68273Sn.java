package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.HashSet;

/* renamed from: X.3Sn  reason: invalid class name and case insensitive filesystem */
public class C68273Sn implements AnonymousClass4EZ {
    public final C55682qk A00;
    public final C44222Vd A01;
    public final AnonymousClass33p A02;
    public final AnonymousClass31C A03;

    public void BQs(String str) {
        this.A01.A00.A00();
    }

    public C68273Sn(C55682qk r1, C44222Vd r2, AnonymousClass33p r3, AnonymousClass31C r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void BSN(AnonymousClass36K r3, String str) {
        this.A01.A00.A01(C57492tj.A01(r3));
    }

    public void BdM(AnonymousClass36K r9, String str) {
        AnonymousClass36K A0j = r9.A0j();
        AnonymousClass36K.A0N(A0j, "list");
        if (A0j.A0q("matched").equals("false")) {
            HashSet A0K = AnonymousClass002.A0K();
            AnonymousClass36K[] r3 = A0j.A03;
            if (r3 != null) {
                for (AnonymousClass36K r1 : r3) {
                    AnonymousClass36K.A0N(r1, "item");
                    A0K.add(AnonymousClass36K.A06(r1));
                }
            }
            if (TextUtils.equals(A0j.A0r("c_dhash", (String) null), C18280x3.A0Z(AnonymousClass0x2.A0F(this.A02), "block_list_v2_dhash"))) {
                Log.w("blocklistv2setprotocolhelper/onSuccess/only dhash mis-match.");
                this.A01.A00(A0j.A0r("dhash", (String) null), A0K, false);
                return;
            }
            Log.w("blocklistv2setprotocolhelper/onSuccess/dhash and c_dhash mis-match.");
            this.A01.A00((String) null, A0K, true);
            return;
        }
        Log.d("blocklistv2setprotocolhelper/onSuccess/dhash match.");
        this.A01.A00.A02(AnonymousClass36K.A0L(A0j, "dhash"));
    }
}
