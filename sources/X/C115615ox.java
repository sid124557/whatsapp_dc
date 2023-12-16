package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5ox  reason: invalid class name and case insensitive filesystem */
public final class C115615ox implements C1230366u {
    public String A00 = "";
    public final C54292oU A01;
    public final AnonymousClass1VX A02;

    public void Bmq(String str) {
        C162457s7.A0J(str, 0);
        this.A00 = str;
    }

    public /* synthetic */ List B4E() {
        return C72023d3.A00;
    }

    public String B8w() {
        return "account_report";
    }

    public String BAV() {
        return "request_account_info";
    }

    public String BAX() {
        return this.A00;
    }

    public String BBg() {
        boolean A0X = this.A02.A0X(455);
        C54292oU r0 = this.A01;
        int i = R.string.f11nameremoved;
        if (A0X) {
            i = R.string.f11nameremoved;
        }
        String string = C54292oU.A00(r0).getString(i);
        C162457s7.A0H(string);
        return string;
    }

    public int BDm() {
        return 2;
    }

    public /* synthetic */ boolean BIp() {
        return false;
    }

    public /* synthetic */ boolean BJM() {
        return true;
    }

    public /* synthetic */ boolean Bo5() {
        return true;
    }

    public /* synthetic */ Drawable getIcon() {
        return null;
    }

    public C115615ox(C54292oU r2, AnonymousClass1VX r3) {
        C18260x0.A0Q(r3, r2);
        this.A02 = r3;
        this.A01 = r2;
    }

    public /* synthetic */ View BEI(View view) {
        return null;
    }
}
