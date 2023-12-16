package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1Oq  reason: invalid class name and case insensitive filesystem */
public class C22551Oq extends C56822sc {
    public final C66663Mh A00;
    public final AnonymousClass33E A01;
    public final C64663Ek A02;
    public final C56612sH A03;
    public final C28871hu A04;
    public final C56922sm A05;
    public final C56982ss A06;
    public final C623934v A07;
    public final AnonymousClass1R1 A08;

    public final void A0D(List list) {
        AnonymousClass31A A002;
        List A0A = this.A07.A0A("pin_v1", false);
        HashMap A0t = AnonymousClass001.A0t();
        Iterator it = A0A.iterator();
        while (it.hasNext()) {
            AnonymousClass33W A0K = C18320x8.A0K(it);
            A0t.put(A0K.A08(), A0K);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AnonymousClass33W A0K2 = C18320x8.A0K(it2);
            A0t.put(A0K2.A08(), A0K2);
        }
        ArrayList A0J = AnonymousClass002.A0J(A0t.values());
        Iterator it3 = A0J.iterator();
        while (it3.hasNext()) {
            if (!((AnonymousClass1SY) it3.next()).A01) {
                it3.remove();
            }
        }
        AnonymousClass4IU.A00(A0J, 6);
        List<AnonymousClass1SY> subList = A0J.subList(0, Math.min(A0J.size(), 3));
        AnonymousClass1R1 r3 = this.A08;
        Set A0R = r3.A0R();
        Iterator it4 = A0R.iterator();
        while (it4.hasNext()) {
            C95814uZ A0P = C18300x5.A0P(it4);
            Iterator it5 = subList.iterator();
            while (true) {
                if (it5.hasNext()) {
                    if (((AnonymousClass1SY) it5.next()).A00.equals(A0P)) {
                        break;
                    }
                } else {
                    this.A02.A07(2);
                    r3.A0N(A0P);
                    break;
                }
            }
        }
        for (AnonymousClass1SY r1 : subList) {
            C95814uZ r8 = r1.A00;
            if (!A0R.contains(r8)) {
                long j = r1.A04;
                r3.A0O(r8, j);
                C56982ss r12 = this.A06;
                if (r12.A0L(r8) && (A002 = C56982ss.A00(r12, r8)) != null && A002.A0i) {
                    Log.i("PinChatHandler/setArchive - false");
                    A002.A0i = false;
                    this.A05.A0G(A002);
                    this.A04.A08();
                    this.A00.A0G(Collections.singleton(new AnonymousClass1SW(this.A01.A04(r8, false), r8, j, false)));
                }
            }
        }
        list.retainAll(subList);
    }

    public C22551Oq(C66663Mh r1, AnonymousClass33E r2, C64663Ek r3, C56612sH r4, C28871hu r5, C56922sm r6, C56982ss r7, C623934v r8, AnonymousClass1R1 r9) {
        super(r8);
        this.A03 = r4;
        this.A05 = r6;
        this.A06 = r7;
        this.A00 = r1;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
        this.A08 = r9;
        this.A07 = r8;
    }
}
