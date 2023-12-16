package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import com.whatsapp.bridge.wfal.WfalManager;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.51z  reason: invalid class name */
public final class AnonymousClass51z extends C113165kz {
    public final WfalManager A00;
    public final C54292oU A01;
    public final C105105Tp A02;
    public final C45662aN A03;

    public boolean BoM(Collection collection) {
        C162457s7.A0J(collection, 0);
        if (this.A00.A02()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!this.A03.A00(AnonymousClass223.INSTAGRAM, C18300x5.A0T(it))) {
                    return false;
                }
            }
        } else if (!this.A02.A01() || !super.BoM(collection)) {
            return false;
        }
        return true;
    }

    public Drawable B8D(Context context, C620733j r4) {
        return AnonymousClass0RP.A00(this.A01.A00, R.drawable.ic_settings_ig);
    }

    public int getId() {
        return 36;
    }

    public AnonymousClass51z(WfalManager wfalManager, C54292oU r2, C105105Tp r3, C45662aN r4) {
        C18260x0.A0V(r2, wfalManager, r3);
        this.A01 = r2;
        this.A00 = wfalManager;
        this.A02 = r3;
        this.A03 = r4;
    }

    public String BDk(AnonymousClass66W r3) {
        return C18290x4.A0l(C86604Kt.A07(r3), R.string.f11nameremoved);
    }
}
