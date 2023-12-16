package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5oq  reason: invalid class name and case insensitive filesystem */
public final class C115545oq implements C1230366u {
    public String A00 = "";
    public final C54292oU A01;

    public C115545oq(C54292oU r2) {
        C162457s7.A0J(r2, 1);
        this.A01 = r2;
    }

    public View BEI(View view) {
        C162457s7.A0J(view, 0);
        return view.findViewById(R.id.dm_setting_default_message_timer_row);
    }

    public void Bmq(String str) {
        C162457s7.A0J(str, 0);
        this.A00 = str;
    }

    public /* synthetic */ List B4E() {
        return C72023d3.A00;
    }

    public String B8w() {
        return "default_message_timer";
    }

    public String BAV() {
        return "disappearing_messages_storage";
    }

    public String BAX() {
        return this.A00;
    }

    public String BBg() {
        return C54292oU.A04(this.A01, R.string.f11nameremoved);
    }

    public int BDm() {
        return 5;
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
}
