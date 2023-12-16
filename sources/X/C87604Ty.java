package X;

import android.app.Application;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.4Ty  reason: invalid class name and case insensitive filesystem */
public class C87604Ty extends AnonymousClass08N {
    public final AnonymousClass08M A00 = AnonymousClass08M.A01();
    public final C56972sr A01;
    public final C105035Th A02;
    public final C620433g A03;
    public final AnonymousClass4CK A04;
    public final C29291ia A05;
    public final C56422rx A06;
    public final UserJid A07;
    public final AnonymousClass4FS A08;

    public void A0C() {
        this.A05.A07(this.A04);
    }

    public void A0E() {
        C117115rP.A01(this.A08, this, 22);
    }

    public C87604Ty(Application application, C56972sr r4, C105035Th r5, C620433g r6, C29291ia r7, C56422rx r8, UserJid userJid, AnonymousClass4FS r10) {
        super(application);
        AnonymousClass930 r0 = new AnonymousClass930(this, 0);
        this.A04 = r0;
        this.A08 = r10;
        this.A01 = r4;
        this.A06 = r8;
        this.A03 = r6;
        this.A05 = r7;
        this.A02 = r5;
        this.A07 = userJid;
        r7.A06(r0);
    }

    public static long A00(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C152217Ya A0J = AnonymousClass4L0.A0J(it);
            if (A0J.A02.A0F.equals(str)) {
                return A0J.A00;
            }
        }
        return 0;
    }

    public static Set A01(List list, List list2) {
        HashSet A0K = AnonymousClass002.A0K();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0K.add(AnonymousClass4L0.A0J(it).A02.A0F);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            A0K.add(AnonymousClass4L0.A0J(it2).A02.A0F);
        }
        return A0K;
    }

    public String A0D(C620733j r6, List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = (int) (((long) i) + AnonymousClass4L0.A0J(it).A00);
        }
        if (i == 0) {
            return "";
        }
        if (i <= 999) {
            return r6.A0M().format((long) i);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(r6.A0M().format(999));
        return AnonymousClass000.A0X("+", A0o);
    }
}
