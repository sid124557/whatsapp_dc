package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5p1  reason: invalid class name and case insensitive filesystem */
public final class C115655p1 implements C1230366u {
    public String A00 = "";
    public final C54292oU A01;
    public final C187958y5 A02;

    public View BEI(View view) {
        C162457s7.A0J(view, 0);
        return view.findViewById(R.id.setting_tell_a_friend);
    }

    public void Bmq(String str) {
        C162457s7.A0J(str, 0);
        this.A00 = str;
    }

    public /* synthetic */ List B4E() {
        return C72023d3.A00;
    }

    public String B8w() {
        return "tell_a_friend";
    }

    public String BAV() {
        return "";
    }

    public String BAX() {
        return this.A00;
    }

    public String BBg() {
        return C54292oU.A04(this.A01, R.string.f11nameremoved);
    }

    public int BDm() {
        return 7;
    }

    public /* synthetic */ boolean BIp() {
        return false;
    }

    public boolean BJM() {
        return true;
    }

    public /* synthetic */ boolean Bo5() {
        return true;
    }

    public Drawable getIcon() {
        return AnonymousClass0RP.A00(this.A01.A00, R.drawable.ic_settings_contacts);
    }

    public C115655p1(C54292oU r2, C187958y5 r3) {
        C18260x0.A0Q(r2, r3);
        this.A01 = r2;
        this.A02 = r3;
    }
}
