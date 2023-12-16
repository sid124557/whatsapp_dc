package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.5hs  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C111305hs implements C835748y {
    public final /* synthetic */ C112975kg A00;

    public final void BQl(Set set) {
        AnonymousClass6FH r1;
        View findViewById;
        C112975kg r3 = this.A00;
        C95814uZ A04 = C627636p.A04(set);
        int size = set.size();
        Object[] A0L = AnonymousClass002.A0L();
        C18270x1.A1Q(A0L, size);
        String A0L2 = r3.A0N.getWhatsAppLocale().A0L(A0L, R.plurals.f9nameremoved, (long) size);
        String string = r3.A0N.getString(R.string.f11nameremoved);
        C109725f5 r2 = new C109725f5((Object) r3, (Object) A04, (Object) set, 40);
        if (((AnonymousClass08A) r3.A0N.getLifecycle()).A02 != AnonymousClass0GC.DESTROYED) {
            C88694ab A02 = C88694ab.A02(r3.A0N.findViewById(16908298), A0L2, 4000);
            A02.A0F(string, r2);
            A02.A0D(AnonymousClass5Yj.A03(C112975kg.A00(r3), C112975kg.A00(r3), R.attr.f3nameremoved, R.color.f5nameremoved));
            ArrayList A0s = AnonymousClass001.A0s();
            A0s.add(r3.A0N.findViewById(R.id.next_important_message));
            A0s.add(r3.A0N.findViewById(R.id.scroll_bottom));
            C110065fd r4 = new C110065fd(C112975kg.A00(r3), A02, r3.A0N.getSystemServices(), A0s, false);
            r3.A0w = r4;
            r4.A05(C117085rM.A00(r3, 48));
            C88694ab r0 = r3.A0w.A03;
            if (!(r0 == null || (r1 = r0.A0J) == null || (findViewById = r1.findViewById(R.id.snackbar_text)) == null || !(findViewById instanceof TextView))) {
                ((TextView) findViewById).setMaxLines(3);
            }
            r3.A0w.A01();
        }
    }

    public /* synthetic */ C111305hs(C112975kg r1) {
        this.A00 = r1;
    }
}
