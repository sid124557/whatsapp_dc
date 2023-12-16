package X;

import com.whatsapp.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9jD  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200909jD implements Runnable {
    public final /* synthetic */ C194589Tn A00;
    public final /* synthetic */ C197059cS A01;
    public final /* synthetic */ List A02;

    public final void run() {
        boolean z;
        C194589Tn r3 = this.A00;
        List<AnonymousClass39R> list = this.A02;
        C197059cS r1 = this.A01;
        if (!list.isEmpty()) {
            AnonymousClass97C r6 = r1.A00;
            r6.A05.setVisibility(0);
            List list2 = r6.A0K;
            synchronized (list2) {
                r6.A08.A01 = r6.A07;
                list2.clear();
                C193959Ra r12 = new C193959Ra((AnonymousClass39R) null);
                r12.A00 = true;
                r12.A02 = AnonymousClass000.A1X(r6.A07);
                list2.add(r12);
                for (AnonymousClass39R r5 : list) {
                    C193959Ra r2 = new C193959Ra(r5);
                    AnonymousClass39R r0 = r6.A07;
                    if (r0 != null) {
                        boolean equals = r0.A0F.equals(r5.A0F);
                        z = true;
                        if (equals) {
                            r2.A02 = z;
                            list2.add(r2);
                        }
                    }
                    z = false;
                    r2.A02 = z;
                    list2.add(r2);
                }
                AnonymousClass959 r22 = r6.A08;
                list2.size();
                List list3 = r22.A05;
                C18280x3.A0s(new AnonymousClass951(list3, list2), r22, list2, list3);
            }
            r6.A06.setVisibility(8);
            r6.A03.setText(R.string.f11nameremoved);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
                Iterator A03 = C61102zi.A03(r3.A0A);
                while (A03.hasNext()) {
                    A03.next();
                }
            }
            return;
        }
        r1.A00.A01.postDelayed(new C199559gm(r1), 2000);
    }

    public /* synthetic */ C200909jD(C194589Tn r1, C197059cS r2, List list) {
        this.A00 = r1;
        this.A02 = list;
        this.A01 = r2;
    }
}
