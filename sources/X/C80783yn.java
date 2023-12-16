package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.3yn  reason: invalid class name and case insensitive filesystem */
public final class C80783yn extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass2LL $visibleMessages;
    public final /* synthetic */ C53502nC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80783yn(C53502nC r2, AnonymousClass2LL r3) {
        super(0);
        this.this$0 = r2;
        this.$visibleMessages = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C55592qb r0;
        C56482s3 r02;
        AnonymousClass33C r03;
        C53502nC r4 = this.this$0;
        HashSet hashSet = this.$visibleMessages.A00;
        C620133d r3 = r4.A01;
        HashSet A0K = AnonymousClass002.A0K();
        synchronized (r3.A0Q) {
            Iterator it = r3.A04().iterator();
            while (it.hasNext()) {
                C30471mV A0S = C18320x8.A0S(it);
                if (AnonymousClass2z0.A0C(A0S)) {
                    A0K.add(A0S);
                }
            }
        }
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it2 = A0K.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            C30471mV r1 = (C30471mV) next;
            if (!hashSet.contains(r1) && ((r03 = r1.A01) == null || r03.A0C < 70)) {
                A0s.add(next);
            }
        }
        Iterator it3 = A0s.iterator();
        while (it3.hasNext()) {
            r3.A0B(C18320x8.A0S(it3));
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it4 = hashSet.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            if (!A0K.contains(next2)) {
                A0s2.add(next2);
            }
        }
        Iterator it5 = A0s2.iterator();
        while (it5.hasNext()) {
            r4.A00.A01(C18320x8.A0S(it5));
        }
        C53502nC r12 = this.this$0;
        HashSet hashSet2 = this.$visibleMessages.A01;
        C50572iO r6 = r12.A02;
        HashSet A0K2 = AnonymousClass002.A0K();
        C28191fq r42 = r6.A0A;
        r42.A03(new C86234Ji(A0K2, 19));
        ArrayList A0s3 = AnonymousClass001.A0s();
        Iterator it6 = A0K2.iterator();
        while (it6.hasNext()) {
            Object next3 = it6.next();
            if (true ^ hashSet2.contains(next3)) {
                A0s3.add(next3);
            }
        }
        Iterator it7 = A0s3.iterator();
        while (it7.hasNext()) {
            C624134x A0T = C18300x5.A0T(it7);
            if (C624134x.A07(A0T).A00 instanceof C95804uY) {
                r02 = r42;
            } else {
                r02 = r6.A0B;
            }
            r02.A06(A0T);
        }
        ArrayList A0s4 = AnonymousClass001.A0s();
        Iterator it8 = hashSet2.iterator();
        while (it8.hasNext()) {
            Object next4 = it8.next();
            C624134x r13 = (C624134x) next4;
            if (!A0K2.contains(r13) && (r0 = r13.A0l) != null && !r0.A09) {
                A0s4.add(next4);
            }
        }
        Iterator it9 = A0s4.iterator();
        while (it9.hasNext()) {
            r6.A01(C18300x5.A0T(it9), 1);
        }
        return C59022wD.A00;
    }
}
