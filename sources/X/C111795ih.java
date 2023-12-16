package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: X.5ih  reason: invalid class name and case insensitive filesystem */
public final class C111795ih implements C184028r8 {
    public final /* synthetic */ AnonymousClass5QD A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ Set A02;
    public final /* synthetic */ AnonymousClass4GQ A03;

    public void BT7(C151157Tq r3, int i) {
        Object r0;
        AnonymousClass4GQ r1 = this.A03;
        if (i == -1) {
            r0 = new C132916gE();
        } else {
            r0 = new AnonymousClass6gF();
        }
        r1.invoke(r0);
    }

    public C111795ih(AnonymousClass5QD r1, UserJid userJid, Set set, AnonymousClass4GQ r4) {
        this.A00 = r1;
        this.A02 = set;
        this.A01 = userJid;
        this.A03 = r4;
    }

    public void BT8(C151157Tq r7, C64553Dy r8) {
        AnonymousClass5QD r5 = this.A00;
        Set set = this.A02;
        UserJid userJid = this.A01;
        LinkedHashMap A0r = C18320x8.A0r();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            A0r.put(A0m, r5.A03.A01(userJid, A0m));
        }
        this.A03.invoke(new AnonymousClass6gH(A0r, false));
    }
}
