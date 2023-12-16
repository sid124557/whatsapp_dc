package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2cn  reason: invalid class name and case insensitive filesystem */
public final class C47152cn {
    public final C64393Dh A00;
    public final C69263Wi A01;
    public final C29161iN A02;
    public final C183538qC A03;
    public final C183538qC A04;
    public final C183538qC A05;
    public final C183538qC A06;
    public final C183538qC A07;

    public final void A00(C84984Em r11, String str, List list, List list2) {
        C108895dj r1;
        C626936e.A0B(!C615631i.A02());
        ArrayList A0s = AnonymousClass001.A0s();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(C18320x8.A0R(list, i).A0K + 86400000);
            if (list2 != null) {
                r1 = (C108895dj) list2.get(i);
            } else {
                r1 = null;
            }
            A0s.add(new C52102kt(r1, seconds));
        }
        String str2 = str;
        C46242bJ r6 = new C46242bJ(r11, this, str, list);
        ArrayList A0c = C73783g4.A0c(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C624134x.A0Z(A0c, it);
        }
        AnonymousClass36X.A06(this.A01, this.A02, this.A06, A0c, 1);
        C46252bK r3 = (C46252bK) this.A04.get();
        C185988uZ r0 = C158317jm.A00().A00;
        byte[] B3i = r0.B3i();
        byte[] generatePublicKey = r0.generatePublicKey(B3i);
        C162457s7.A0D(generatePublicKey);
        C162457s7.A0D(B3i);
        C72393de r7 = new C72393de(generatePublicKey, B3i);
        C51132jK A002 = r3.A01.A00(AnonymousClass21S.A0L);
        if (A002 == null) {
            r6.A00(-5, (Integer) null);
            return;
        }
        r3.A00(new C54662p5(3, C59192wV.A01), A002.A00, r6, r7, str2, A0s);
    }

    public C47152cn(C64393Dh r1, C69263Wi r2, C29161iN r3, C183538qC r4, C183538qC r5, C183538qC r6, C183538qC r7, C183538qC r8) {
        C18260x0.A0f(r2, r1, r3, r4, r5);
        C18260x0.A0W(r6, r7, r8);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A06 = r4;
        this.A07 = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A03 = r8;
    }
}
