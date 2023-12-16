package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.android.di.BaseEntryPoint;
import java.util.List;

/* renamed from: X.5ot  reason: invalid class name and case insensitive filesystem */
public class C115575ot implements C1230366u {
    public String A00 = "";
    public final C54292oU A01;

    public C115575ot(C54292oU r2) {
        C162457s7.A0J(r2, 1);
        this.A01 = r2;
    }

    public void Bmq(String str) {
        C162457s7.A0J(str, 0);
        this.A00 = str;
    }

    public List B4E() {
        if (this instanceof C983850r) {
            return C86604Kt.A0s(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof C983750q) {
            return C86604Kt.A0s(this.A01, R.string.f11nameremoved);
        }
        String[] strArr = new String[2];
        C54292oU r2 = this.A01;
        strArr[0] = C54292oU.A04(r2, R.string.f11nameremoved);
        return AnonymousClass0x9.A19(C54292oU.A04(r2, R.string.f11nameremoved), strArr, 1);
    }

    public String B8w() {
        if (this instanceof C983550o) {
            return "terms";
        }
        if (this instanceof C983850r) {
            return "get_help";
        }
        if (this instanceof C983650p) {
            return "help_center";
        }
        if (this instanceof C983750q) {
            return "contact_us";
        }
        if (this instanceof C983450n) {
            return "app_info";
        }
        return "help";
    }

    public String BAV() {
        if ((this instanceof C983550o) || (this instanceof C983850r) || (this instanceof C983650p) || (this instanceof C983750q) || (this instanceof C983450n)) {
            return "help";
        }
        return "";
    }

    public String BAX() {
        return this.A00;
    }

    public String BBg() {
        if (this instanceof C983550o) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof C983850r) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof C983650p) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        if (this instanceof C983750q) {
            return C54292oU.A04(this.A01, R.string.f11nameremoved);
        }
        boolean z = this instanceof C983450n;
        C54292oU r1 = this.A01;
        if (z) {
            return C54292oU.A04(r1, R.string.f11nameremoved);
        }
        return C54292oU.A04(r1, R.string.f11nameremoved);
    }

    public int BDm() {
        return 6;
    }

    public View BEI(View view) {
        int i;
        if (this instanceof C983550o) {
            C162457s7.A0J(view, 0);
            i = R.id.terms_and_privacy_preference;
        } else if (this instanceof C983850r) {
            C162457s7.A0J(view, 0);
            i = R.id.get_help_preference;
        } else if (this instanceof C983650p) {
            C162457s7.A0J(view, 0);
            i = R.id.faq_preference;
        } else if (this instanceof C983750q) {
            C162457s7.A0J(view, 0);
            i = R.id.contact_us_preference;
        } else if (this instanceof C983450n) {
            C162457s7.A0J(view, 0);
            i = R.id.about_preference;
        } else {
            C162457s7.A0J(view, 0);
            i = R.id.settings_help;
        }
        return view.findViewById(i);
    }

    public /* synthetic */ boolean BIp() {
        return false;
    }

    public /* synthetic */ boolean BJM() {
        if ((this instanceof C983850r) || (this instanceof C983650p) || (this instanceof C983750q)) {
            return false;
        }
        return true;
    }

    public /* synthetic */ boolean Bo5() {
        return true;
    }

    public Drawable getIcon() {
        Context context = this.A01.A00;
        C162457s7.A0D(context);
        return new C131656dw(AnonymousClass0RP.A00(context, R.drawable.ic_settings_help), ((BaseEntryPoint) C389229y.A02(context, BaseEntryPoint.class)).BsW());
    }
}
