package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5pB  reason: invalid class name and case insensitive filesystem */
public final class C115755pB implements C1230366u {
    public String A00 = "";
    public final C56972sr A01;
    public final C54292oU A02;
    public final AnonymousClass1VX A03;

    public View BEI(View view) {
        C162457s7.A0J(view, 0);
        return view.findViewById(R.id.settings_avatar);
    }

    public void Bmq(String str) {
        C162457s7.A0J(str, 0);
        this.A00 = str;
    }

    public List B4E() {
        return C86604Kt.A0s(this.A02, R.string.f11nameremoved);
    }

    public String B8w() {
        return "avatar";
    }

    public String BAV() {
        return "";
    }

    public String BAX() {
        return this.A00;
    }

    public String BBg() {
        return C54292oU.A04(this.A02, R.string.f11nameremoved);
    }

    public int BDm() {
        return 22;
    }

    public /* synthetic */ boolean BIp() {
        return false;
    }

    public boolean BJM() {
        if (this.A01.A0Y() || !this.A03.A0X(1396)) {
            return false;
        }
        return true;
    }

    public /* synthetic */ boolean Bo5() {
        return true;
    }

    public Drawable getIcon() {
        return AnonymousClass0RP.A00(this.A02.A00, R.drawable.ic_settings_avatar);
    }

    public C115755pB(C56972sr r2, C54292oU r3, AnonymousClass1VX r4) {
        C18260x0.A0V(r3, r2, r4);
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }
}
