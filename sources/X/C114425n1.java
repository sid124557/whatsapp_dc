package X;

import com.whatsapp.jid.Jid;
import java.util.ListIterator;

/* renamed from: X.5n1  reason: invalid class name and case insensitive filesystem */
public class C114425n1 implements C184408rk {
    public final AnonymousClass5ZO A00;
    public final Jid A01;
    public final /* synthetic */ C112275jT A02;

    public C114425n1(AnonymousClass5ZO r1, C112275jT r2, Jid jid) {
        this.A02 = r2;
        this.A00 = r1;
        this.A01 = jid;
    }

    public void BSO(AnonymousClass7T4 r2, int i) {
        C184198rP r0 = this.A02.A0C;
        if (r0 != null) {
            r0.BNv(r2, i);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass5TI r5 = (AnonymousClass5TI) obj;
        C112275jT r3 = this.A02;
        if (r3.A0C != null) {
            Jid jid = this.A01;
            if (jid != null) {
                String rawString = jid.getRawString();
                ListIterator listIterator = r5.A09.listIterator();
                while (listIterator.hasNext()) {
                    if (((C109065e1) listIterator.next()).A0F.equals(rawString)) {
                        listIterator.remove();
                    }
                }
            }
            AnonymousClass5ZZ.A03(this.A00, r5.A09);
            r3.A0C.BNw(r5);
        }
    }
}
