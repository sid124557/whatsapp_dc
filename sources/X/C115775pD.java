package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5pD  reason: invalid class name and case insensitive filesystem */
public final class C115775pD implements C1230366u {
    public String A00 = "";
    public final C116985rC A01;
    public final C116985rC A02;
    public final C116985rC A03;
    public final C56972sr A04;
    public final C54292oU A05;

    public View BEI(View view) {
        C162457s7.A0J(view, 0);
        return view.findViewById(R.id.premium_tools);
    }

    public void Bmq(String str) {
        C162457s7.A0J(str, 0);
        this.A00 = str;
    }

    public /* synthetic */ List B4E() {
        return C72023d3.A00;
    }

    public String B8w() {
        return "premium_subscription";
    }

    public String BAV() {
        return "";
    }

    public String BAX() {
        return this.A00;
    }

    public String BBg() {
        this.A02.A04();
        throw AnonymousClass001.A0g("getSmbPremiumToolsTitleStringId");
    }

    public int BDm() {
        return 10;
    }

    public /* synthetic */ boolean BIp() {
        return false;
    }

    public boolean BJM() {
        C116985rC r1 = this.A03;
        if (!r1.A07() || this.A04.A0Y()) {
            return false;
        }
        r1.A04();
        throw AnonymousClass001.A0g("isOnlyPremiumFeatureEnabled");
    }

    public /* synthetic */ boolean Bo5() {
        return true;
    }

    public Drawable getIcon() {
        this.A01.A04();
        throw AnonymousClass001.A0g("getSettingsPremiumIconId");
    }

    public C115775pD(C116985rC r2, C116985rC r3, C116985rC r4, C56972sr r5, C54292oU r6) {
        C18260x0.A0R(r6, r5);
        this.A05 = r6;
        this.A02 = r2;
        this.A04 = r5;
        this.A03 = r3;
        this.A01 = r4;
    }
}
