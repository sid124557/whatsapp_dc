package X;

import com.whatsapp.jid.Jid;
import java.util.List;

/* renamed from: X.2YG  reason: invalid class name */
public class AnonymousClass2YG {
    public final C55682qk A00;
    public final AnonymousClass31C A01;

    public void A00(AnonymousClass4EQ r16, C27991fJ r17, List list) {
        AnonymousClass31C r8 = this.A01;
        String A03 = r8.A03();
        List list2 = list;
        int size = list2.size();
        AnonymousClass36K[] r5 = new AnonymousClass36K[size];
        int i = 0;
        while (true) {
            AnonymousClass39V[] r2 = new AnonymousClass39V[1];
            if (i < size) {
                AnonymousClass39V.A02((Jid) list2.get(i), "jid", r2, 0);
                AnonymousClass36K.A0U("group", r2, r5, i);
                i++;
            } else {
                AnonymousClass39V.A0B("link_type", "sub_group", r2, 0);
                AnonymousClass36K A0F = AnonymousClass36K.A0F(AnonymousClass36K.A0J("link", r2, r5), "links", (AnonymousClass39V[]) null);
                AnonymousClass39V[] A0H = AnonymousClass39V.A0H(A03, 0);
                AnonymousClass39V.A0A("xmlns", "w:g2", A0H);
                r8.A0D(new AnonymousClass3SW(r16), AnonymousClass36K.A0C(r17, A0F, A0H), A03, 301, 32000);
                return;
            }
        }
    }

    public AnonymousClass2YG(C55682qk r1, AnonymousClass31C r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
