package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5p6  reason: invalid class name and case insensitive filesystem */
public final class C115705p6 implements C1230366u {
    public String A00 = "";
    public final C54292oU A01;
    public final AnonymousClass1VX A02;

    public View BEI(View view) {
        C162457s7.A0J(view, 0);
        return view.findViewById(R.id.settings_report_bug);
    }

    public void Bmq(String str) {
        C162457s7.A0J(str, 0);
        this.A00 = str;
    }

    public List B4E() {
        return C86604Kt.A0s(this.A01, R.string.f11nameremoved);
    }

    public String B8w() {
        return "report_bug";
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
        return 22;
    }

    public /* synthetic */ boolean BIp() {
        return false;
    }

    public boolean BJM() {
        return this.A02.A0X(2090);
    }

    public /* synthetic */ boolean Bo5() {
        return true;
    }

    public Drawable getIcon() {
        return AnonymousClass0RP.A00(this.A01.A00, R.drawable.vec_ic_settings_bug_report);
    }

    public C115705p6(C54292oU r2, AnonymousClass1VX r3) {
        C18260x0.A0Q(r2, r3);
        this.A01 = r2;
        this.A02 = r3;
    }
}
