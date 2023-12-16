package X;

import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.2fT  reason: invalid class name and case insensitive filesystem */
public final class C48782fT {
    public AnonymousClass4FS A00;
    public Set A01;

    public final void A01() {
        Set set = this.A01;
        if (set != null) {
            Locale locale = Locale.ENGLISH;
            Object[] objArr = new Object[1];
            AnonymousClass000.A1L(objArr, set.size());
            String format = String.format(locale, "WaffleDataDeletionManager/purgeWaffleData: purging waffle data. Running %d deleters", Arrays.copyOf(objArr, 1));
            C162457s7.A0D(format);
            Log.i(format);
            Set<C84234Bo> set2 = this.A01;
            if (set2 != null) {
                for (C84234Bo r0 : set2) {
                    if (r0 != null) {
                        r0.Bhk();
                    }
                }
                return;
            }
            throw C18270x1.A0S("waffleDataDeleters");
        }
        throw C18270x1.A0S("waffleDataDeleters");
    }

    public final void A00() {
        if (C615631i.A02()) {
            AnonymousClass4FS r2 = this.A00;
            if (r2 != null) {
                r2.BkM(new C117105rO(this, 43));
                return;
            }
            throw C18270x1.A0S("waWorkers");
        }
        A01();
    }
}
