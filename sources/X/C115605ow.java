package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5ow  reason: invalid class name and case insensitive filesystem */
public final class C115605ow implements C1230366u {
    public String A00 = "";
    public final C105275Ug A01;
    public final C54292oU A02;

    public View BEI(View view) {
        C162457s7.A0J(view, 0);
        return view.findViewById(R.id.app_auth_settings_preference);
    }

    public void Bmq(String str) {
        C162457s7.A0J(str, 0);
        this.A00 = str;
    }

    public /* synthetic */ List B4E() {
        return C72023d3.A00;
    }

    public String B8w() {
        return "app_authentication";
    }

    public String BAV() {
        return "screen_lock";
    }

    public String BAX() {
        return this.A00;
    }

    public String BBg() {
        C54292oU r2 = this.A02;
        boolean A0X = this.A01.A05.A0X(266);
        int i = R.string.f11nameremoved;
        if (A0X) {
            i = R.string.f11nameremoved;
        }
        return C54292oU.A04(r2, i);
    }

    public int BDm() {
        return 11;
    }

    public /* synthetic */ boolean BIp() {
        return false;
    }

    public boolean BJM() {
        return this.A01.A06();
    }

    public boolean Bo5() {
        return false;
    }

    public /* synthetic */ Drawable getIcon() {
        return null;
    }

    public C115605ow(C105275Ug r2, C54292oU r3) {
        C18260x0.A0Q(r3, r2);
        this.A02 = r3;
        this.A01 = r2;
    }
}
