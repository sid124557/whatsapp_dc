package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.62C  reason: invalid class name */
public final class AnonymousClass62C extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass4Ut this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass62C(AnonymousClass4Ut r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ArrayList arrayList;
        AnonymousClass7YM r1;
        AnonymousClass1hC r12;
        Map map;
        boolean z;
        AnonymousClass1RL r13;
        Map map2 = (Map) obj;
        C162457s7.A0J(map2, 0);
        AnonymousClass4Ut r10 = this.this$0;
        if (r10.A08.A01.A0X(5185)) {
            Iterator it = r10.A0B.iterator();
            loop0:
            while (true) {
                z = false;
                while (it.hasNext()) {
                    C95814uZ r2 = C86614Ku.A0h(it).A00;
                    if (!(r2 instanceof C95804uY)) {
                        r2 = null;
                    }
                    if (!z) {
                        AnonymousClass31A A0A = r10.A07.A0A(r2, false);
                        if (!(A0A instanceof AnonymousClass1RL) || (r13 = (AnonymousClass1RL) A0A) == null || !r13.A0K()) {
                        }
                    }
                    z = true;
                }
                break loop0;
            }
            C142386x7[] values = C142386x7.values();
            ArrayList A0s = AnonymousClass001.A0s();
            for (C142386x7 r14 : values) {
                if (z || !r14.requiresAdmin) {
                    A0s.add(r14);
                }
            }
            arrayList = A0s;
        } else {
            arrayList = C18290x4.A12(C142386x7.A02);
        }
        AnonymousClass08M r3 = r10.A04;
        AnonymousClass7YM r0 = (AnonymousClass7YM) r3.A07();
        if (r0 != null) {
            int i = r0.A00;
            int A04 = AnonymousClass002.A04(arrayList, 1);
            if (i > A04) {
                i = A04;
            }
            r1 = new AnonymousClass7YM(arrayList, i);
        } else {
            r1 = new AnonymousClass7YM(arrayList, 0);
        }
        if (!C162457s7.A0P(r3.A07(), r1)) {
            r3.A0G(r1);
        }
        if (this.this$0.A08.A01.A0X(5185)) {
            AnonymousClass4Ut r5 = this.this$0;
            AnonymousClass08M r4 = r5.A00;
            AnonymousClass7YK r22 = (AnonymousClass7YK) r4.A07();
            if (r22 != null) {
                List<C104925Sw> list = r22.A01;
                ArrayList A0c = C73783g4.A0c(list);
                for (C104925Sw r7 : list) {
                    C624134x r102 = r7.A01;
                    Object obj2 = map2.get(r102.A1J.toString());
                    List list2 = null;
                    if (!(!(obj2 instanceof AnonymousClass1hC) || (r12 = (AnonymousClass1hC) obj2) == null || (map = r12.A00) == null)) {
                        String A02 = C107165ao.A02(r7.A03);
                        C162457s7.A0D(A02);
                        Iterable iterable = (Iterable) map.get(A02);
                        if (iterable != null) {
                            list2 = C86654Ky.A0q(iterable, 45);
                        }
                    }
                    A0c.add(new C104925Sw(r102, r7.A02, r7.A03, list2, r7.A00, r7.A05));
                }
                r4.A0G(new AnonymousClass7YK(A0c, r22.A00));
                ArrayList A0s2 = AnonymousClass001.A0s();
                Iterator it2 = A0c.iterator();
                long j = 0;
                while (it2.hasNext()) {
                    C104925Sw r9 = (C104925Sw) it2.next();
                    List<AnonymousClass7YJ> list3 = r9.A04;
                    if (list3 != null) {
                        for (AnonymousClass7YJ r8 : list3) {
                            j++;
                            C624134x r6 = r9.A01;
                            String A0o = C18290x4.A0o(r6.A1J);
                            String str = r9.A03;
                            A0s2.add(new AnonymousClass7ZJ(r8, r6, AnonymousClass0x2.A0e(str, AnonymousClass000.A0l(A0o), '_'), str));
                        }
                    }
                }
                r5.A02.A0G(new AnonymousClass7YL(A0s2, j));
            }
        }
        return C59022wD.A00;
    }
}
