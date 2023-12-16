package X;

import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4IB  reason: invalid class name */
public class AnonymousClass4IB implements MenuItem.OnMenuItemClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4IB(C102895Kr r1, UserJid userJid, int i) {
        this.A02 = i;
        this.A00 = r1;
        this.A01 = userJid;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        int i = this.A02;
        C102895Kr r0 = (C102895Kr) this.A00;
        if (i != 0) {
            r0.A04.A05.A01((UserJid) this.A01, (Integer) null);
            return true;
        }
        Jid jid = (Jid) this.A01;
        C46632bx r5 = r0.A04;
        if (r5.A05.A02()) {
            return true;
        }
        C44732Xg r4 = new C44732Xg(1);
        C89644eZ r3 = r5.A03;
        String string = r3.getString(R.string.f11nameremoved);
        Bundle bundle = r4.A01;
        bundle.putString("title", string);
        bundle.putCharSequence("message", r3.getString(R.string.f11nameremoved));
        AnonymousClass0x2.A0v(bundle, jid, "user_jid");
        r4.A00 = r5.A01;
        AnonymousClass1Hf.A2B(bundle, r3, r4, R.string.f11nameremoved);
        return true;
    }
}
