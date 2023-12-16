package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.8Ix  reason: invalid class name and case insensitive filesystem */
public final class C171918Ix implements AnonymousClass4DL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C161447pg A01;
    public final /* synthetic */ AnonymousClass4B3 A02;
    public final /* synthetic */ AnonymousClass4DQ A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ Map A06;

    public void BSz(C52632ln r10) {
        C162457s7.A0J(r10, 0);
        C161447pg r3 = this.A01;
        int i = this.A00;
        Long valueOf = Long.valueOf(r10.A00);
        AnonymousClass1j0 r4 = r3.A0B;
        r3.A05(r4, valueOf, "iqResponse", "error_code", i);
        r4.A03.A07(i, 467);
        C44522Wj r2 = r3.A0E;
        String str = r3.A0L;
        synchronized (r2) {
            C162457s7.A0J(str, 0);
            r2.A00.remove(str);
        }
        AnonymousClass4DQ r1 = this.A03;
        if (r1 != null) {
            r1.BdH(C57692u3.A04(AnonymousClass21V.A02.key, r10));
        }
    }

    public C171918Ix(C161447pg r1, AnonymousClass4B3 r2, AnonymousClass4DQ r3, String str, String str2, Map map, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A04 = str;
        this.A02 = r2;
        this.A03 = r3;
        this.A06 = map;
        this.A05 = str2;
    }

    public void BT0(C138956rH r21) {
        C138966rI r3;
        C161447pg r14 = this.A01;
        int i = this.A00;
        AnonymousClass1j0 r15 = r14.A0B;
        r15.A00(i, "iqResponse");
        String str = this.A04;
        AnonymousClass4B3 r6 = this.A02;
        AnonymousClass4DQ r2 = this.A03;
        Map map = this.A06;
        C138746qv r0 = (C138746qv) r21.A00;
        C162457s7.A0D(r0);
        String str2 = this.A05;
        C159127lA A002 = r14.A02.A00(r14.A0C, str, r14.A0F.A00(), r14.A0L, (String) null, (String) null);
        r14.A00 = A002;
        if (r6 != null) {
            r6.BTd(A002.A0a);
        }
        C138626qj r32 = (C138626qj) r0.A04;
        if (!(r32 == null || (r3 = (C138966rI) r32.A00) == null)) {
            r14.A0F(r14.A03(r3, str));
            String str3 = r3.A01;
            C162457s7.A0D(str3);
            Map A042 = C57692u3.A04(C373721z.REFERRAL.key, str2);
            if (map == null) {
                map = C73813g7.A0A();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(A042);
            linkedHashMap.putAll(map);
            A002.A02(new C1896492c(r14, r2, 0), str3, linkedHashMap, (Map) null, false);
            r14.A05(r15, AnonymousClass0x9.A0m(((List) r3.A00).size()), "initializeStateMachine", "num_states", i);
            C138626qj r22 = (C138626qj) r0.A01;
            if (r22 != null) {
                for (C138816r3 r23 : (Iterable) ((C138626qj) r22.A00).A00) {
                    C162457s7.A0H(r23);
                    r14.A0C(r23);
                }
            }
            r15.A03.A07(i, 467);
        }
        C138626qj r02 = (C138626qj) r0.A02;
        if (r02 != null) {
            for (C138966rI r03 : (Iterable) ((C138626qj) r02.A00).A00) {
                C162457s7.A0H(r03);
                C161447pg.A01(r14, r03);
            }
        }
    }
}
