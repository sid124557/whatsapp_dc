package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5pA  reason: invalid class name and case insensitive filesystem */
public final class C115745pA implements C1230366u {
    public String A00 = "";
    public final C105275Ug A01;
    public final C54292oU A02;
    public final AnonymousClass33p A03;

    public View BEI(View view) {
        C162457s7.A0J(view, 0);
        return view.findViewById(R.id.notification_preference);
    }

    public void Bmq(String str) {
        C162457s7.A0J(str, 0);
        this.A00 = str;
    }

    public /* synthetic */ List B4E() {
        return C72023d3.A00;
    }

    public String B8w() {
        return "show_content_in_notifications";
    }

    public String BAV() {
        return "screen_lock";
    }

    public String BAX() {
        return this.A00;
    }

    public String BBg() {
        return C54292oU.A04(this.A02, R.string.f11nameremoved);
    }

    public int BDm() {
        return 11;
    }

    public /* synthetic */ boolean BIp() {
        return false;
    }

    public boolean BJM() {
        if (!this.A01.A06() || !C18280x3.A1W(AnonymousClass0x2.A0F(this.A03), "privacy_fingerprint_enabled")) {
            return false;
        }
        return true;
    }

    public boolean Bo5() {
        return false;
    }

    public /* synthetic */ Drawable getIcon() {
        return null;
    }

    public C115745pA(C105275Ug r2, C54292oU r3, AnonymousClass33p r4) {
        C18260x0.A0V(r3, r2, r4);
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }
}
