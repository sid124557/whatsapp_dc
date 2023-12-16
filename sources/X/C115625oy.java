package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5oy  reason: invalid class name and case insensitive filesystem */
public final class C115625oy implements C1230366u {
    public String A00 = "";
    public final C116985rC A01;
    public final C54292oU A02;

    public C115625oy(C116985rC r2, C54292oU r3) {
        C162457s7.A0J(r3, 1);
        this.A02 = r3;
        this.A01 = r2;
    }

    public View BEI(View view) {
        C162457s7.A0J(view, 0);
        return view.findViewById(R.id.business_tools);
    }

    public void Bmq(String str) {
        C162457s7.A0J(str, 0);
        this.A00 = str;
    }

    public /* synthetic */ List B4E() {
        return C72023d3.A00;
    }

    public String B8w() {
        return "business_tools";
    }

    public String BAV() {
        return "";
    }

    public String BAX() {
        return this.A00;
    }

    public String BBg() {
        this.A01.A04();
        throw AnonymousClass001.A0g("getSmbBusinessTitleStringId");
    }

    public int BDm() {
        return 1;
    }

    public /* synthetic */ boolean BIp() {
        return false;
    }

    public boolean BJM() {
        return false;
    }

    public /* synthetic */ boolean Bo5() {
        return true;
    }

    public Drawable getIcon() {
        return AnonymousClass0RP.A00(this.A02.A00, R.drawable.ic_settings_business);
    }
}
