package X;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.8Iw  reason: invalid class name and case insensitive filesystem */
public final class C171908Iw implements AnonymousClass4DL {
    public final /* synthetic */ C150577Ri A00;
    public final /* synthetic */ C137056nh A01;
    public final /* synthetic */ C161447pg A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ Map A05;

    public void BSz(C52632ln r7) {
        C162457s7.A0J(r7, 0);
        C137056nh r5 = this.A01;
        Map map = this.A04;
        r5.A00(this.A00, new C60752z6(Integer.valueOf((int) r7.A00), "", r7.A01), map, (Map) null);
    }

    public C171908Iw(C150577Ri r1, C137056nh r2, C161447pg r3, String str, Map map, Map map2) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = str;
        this.A00 = r1;
        this.A05 = map;
        this.A04 = map2;
    }

    public void BT0(C138956rH r11) {
        C138966rI r3;
        C161447pg r6 = this.A02;
        C162457s7.A0C(r6);
        C137056nh r0 = this.A01;
        String str = r0.A01;
        String str2 = r0.A07;
        String str3 = this.A03;
        C138626qj r02 = (C138626qj) ((C138746qv) r11.A00).A04;
        if (!(r02 == null || (r3 = (C138966rI) r02.A00) == null)) {
            C40622Hc r03 = r6.A0C;
            Map A032 = r6.A03(r3, str2);
            Stack stack = r03.A00;
            stack.add(AnonymousClass001.A0t());
            ((Map) C162457s7.A03(stack)).putAll(A032);
            if (str3 != null) {
                r6.A0N.put(str2, str3);
                C48712fL r04 = (C48712fL) r6.A0O.get(str3);
                if (r04 != null) {
                    r04.A01();
                }
            }
            C159127lA r5 = r6.A00;
            if (r5 != null) {
                String str4 = r3.A01;
                C162457s7.A0D(str4);
                long size = (long) ((List) r3.A00).size();
                C151217Tw r4 = r5.A01;
                if (r4 == null) {
                    throw C18270x1.A0S("flowManager");
                }
                Stack stack2 = r4.A04;
                ((Deque) C162457s7.A03(stack2)).addFirst(str);
                LinkedList A18 = AnonymousClass0x9.A18();
                A18.addLast(str4);
                stack2.add(A18);
                r4.A03.add(str2);
                AnonymousClass1j2 r42 = r5.A0M;
                r42.A00(r5.A00, "queueEmbeddedSubflowStates");
                r42.A02(r5.A00, "num_states_queued", size);
                r5.A01();
            }
        }
        C160967ok.A02(r6, r11);
        this.A00.A00((String) null, this.A05);
    }
}
