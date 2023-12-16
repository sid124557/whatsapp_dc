package X;

import com.whatsapp.jid.Jid;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3PI  reason: invalid class name */
public final class AnonymousClass3PI implements AnonymousClass4D2 {
    public final C183538qC A00;

    public AnonymousClass3PI(C183538qC r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final void A00(AnonymousClass1A3 r10, C624134x r11) {
        Set entrySet = ((C54012o2) this.A00.get()).A00(r11).A00.entrySet();
        C162457s7.A0D(entrySet);
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(it);
            C162457s7.A0H(A0w);
            Jid A0R = AnonymousClass0x9.A0R(A0w);
            C60722z3 r7 = (C60722z3) A0w.getValue();
            C130546c9 A0G = C21751Da.DEFAULT_INSTANCE.A0G();
            String A0g = C18300x5.A0g(A0G, A0R);
            C21751Da r1 = (C21751Da) A0G.A00;
            A0g.getClass();
            r1.bitField0_ |= 1;
            r1.userJid_ = A0g;
            long j = (long) 1000;
            C21751Da r3 = (C21751Da) C18320x8.A0C(A0G);
            r3.bitField0_ |= 2;
            r3.receiptTimestamp_ = r7.A00 / j;
            C21751Da r12 = (C21751Da) C18320x8.A0C(A0G);
            r12.bitField0_ |= 4;
            r12.readTimestamp_ = r7.A02 / j;
            C21751Da r13 = (C21751Da) C18320x8.A0C(A0G);
            r13.bitField0_ |= 8;
            r13.playedTimestamp_ = r7.A01 / j;
            AnonymousClass1ES A0X = C18310x6.A0X(r10);
            C130786cX A06 = A0G.A06();
            A06.getClass();
            C188248ya r14 = A0X.userReceipt_;
            if (!((AnonymousClass8T6) r14).A00) {
                r14 = C130786cX.A07(r14);
                A0X.userReceipt_ = r14;
            }
            r14.add(A06);
        }
    }

    public void BYV(C52952mJ r1, AnonymousClass1A3 r2, C624134x r3) {
        C18260x0.A0O(r3, r2);
        A00(r2, r3);
    }

    public /* synthetic */ void BYW(C50972j4 r1, AnonymousClass1ES r2, C624134x r3) {
    }
}
