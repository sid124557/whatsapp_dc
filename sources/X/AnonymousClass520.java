package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import com.whatsapp.bridge.wfal.WfalManager;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.520  reason: invalid class name */
public final class AnonymousClass520 extends C113165kz {
    public final WfalManager A00;
    public final C54292oU A01;
    public final C105105Tp A02;
    public final C45662aN A03;
    public final AnonymousClass5O0 A04;
    public final C104745Se A05;

    public boolean BoM(Collection collection) {
        C162457s7.A0J(collection, 0);
        if (this.A00.A02()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!this.A03.A00(AnonymousClass223.FACEBOOK, C18300x5.A0T(it))) {
                    return false;
                }
            }
            return true;
        } else if (this.A05.A00()) {
            return this.A04.A01(1, collection);
        } else {
            if (!this.A02.A01() || !super.BoM(collection)) {
                return false;
            }
            return true;
        }
    }

    public Drawable B8D(Context context, C620733j r4) {
        return AnonymousClass0RP.A00(this.A01.A00, R.drawable.ic_settings_fb);
    }

    public int getId() {
        return 13;
    }

    public AnonymousClass520(WfalManager wfalManager, C54292oU r3, C105105Tp r4, C45662aN r5, AnonymousClass5O0 r6, C104745Se r7) {
        C18260x0.A0c(r3, r7, wfalManager, r4);
        C162457s7.A0J(r6, 6);
        this.A01 = r3;
        this.A05 = r7;
        this.A00 = wfalManager;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
    }

    public String BDk(AnonymousClass66W r3) {
        return C18290x4.A0l(C86604Kt.A07(r3), R.string.f11nameremoved);
    }
}
