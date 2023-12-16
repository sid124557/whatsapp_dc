package X;

import android.graphics.drawable.Drawable;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6BX  reason: invalid class name */
public class AnonymousClass6BX implements AnonymousClass667 {
    public Object A00;
    public final int A01;

    public AnonymousClass6BX(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BSp(UserJid userJid, int i) {
        if (this.A01 != 0) {
            ((AnonymousClass4Uk) this.A00).A02.A0G(AnonymousClass001.A0s());
        }
    }

    public void Bd4(UserJid userJid) {
        String A0o;
        AnonymousClass08M r1;
        ArrayList A0J;
        if (this.A01 != 0) {
            AnonymousClass4Uk r4 = (AnonymousClass4Uk) this.A00;
            AnonymousClass5RQ A05 = r4.A05.A05(userJid);
            if (A05 == null) {
                r1 = r4.A02;
                A0J = AnonymousClass001.A0s();
            } else {
                List<C104785Si> list = A05.A00;
                ArrayList A0c = C73783g4.A0c(list);
                for (C104785Si r12 : list) {
                    A0c.add(new C108855df((C108815db) C18290x4.A0k(r12.A04), r12.A02, r12.A01, r12.A03, r12.A00));
                }
                r1 = r4.A02;
                A0J = AnonymousClass002.A0J(A0c);
            }
            r1.A0G(A0J);
            return;
        }
        AnonymousClass4UW r3 = (AnonymousClass4UW) this.A00;
        C989153s r42 = r3.A03;
        UserJid userJid2 = r3.A01;
        if (userJid2 == null) {
            throw C18270x1.A0S("bizJid");
        }
        AnonymousClass5RQ A052 = r42.A05(userJid2);
        UserJid userJid3 = r3.A01;
        if (userJid3 == null) {
            throw C18270x1.A0S("bizJid");
        }
        synchronized (r42) {
            A0o = C18310x6.A0o(userJid3, r42.A01);
        }
        if (A0o != null) {
            r3.A06.A0G(A0o);
        }
        if (A052 != null) {
            List list2 = A052.A00;
            if (C18310x6.A1X(list2)) {
                ArrayList A0s = AnonymousClass001.A0s();
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    C104785Si r7 = (C104785Si) list2.get(i);
                    if (!r7.A04.isEmpty()) {
                        C108815db r11 = (C108815db) r7.A04.get(0);
                        r3.A0A.add(new C108855df(r11, r7.A02, r7.A01, r7.A03, r7.A00));
                        String A06 = C107315b6.A06(AnonymousClass000.A0Y("_", AnonymousClass000.A0l(r11.A04), 0));
                        C162457s7.A0D(A06);
                        A0s.add(new C149947On((Drawable) null, new C172028Ji(r3, i), new C1896091y(r3, 1, r11), (String) null, (String) null, A06));
                    }
                }
                r3.A08.A0G(A0s);
            }
        }
    }
}
