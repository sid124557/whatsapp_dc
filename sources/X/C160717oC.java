package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.7oC  reason: invalid class name and case insensitive filesystem */
public final class C160717oC {
    public C141816wB A00;
    public boolean A01;
    public final AnonymousClass282 A02;
    public final AnonymousClass7EK A03;
    public final C152387Yr A04;
    public final C54522or A05;

    public final void A02(C368820c r13) {
        String str;
        AnonymousClass7YO r0;
        C152387Yr r1 = this.A04;
        Stack stack = r1.A01;
        if (stack.size() == 0) {
            C159127lA r02 = this.A03.A00;
            r02.A0K.A0S(r02.A0W);
            return;
        }
        String str2 = r1.A00().A01;
        int size = stack.size();
        if (size < 2 || (r0 = (AnonymousClass7YO) AnonymousClass002.A0J(stack).get(size - 2)) == null) {
            str = null;
        } else {
            str = r0.A01;
        }
        A00(str);
        A03(r13, (C60752z6) null, str, str2, (String) null, (Map) null, true);
    }

    public final void A04(C368820c r13, C60752z6 r14, String str, String str2, Map map) {
        boolean z;
        ArrayList A0J;
        String str3 = str;
        C368820c r5 = r13;
        C162457s7.A0J(r13, 0);
        C152387Yr r1 = this.A04;
        Stack stack = r1.A01;
        if (stack.size() != 0) {
            String str4 = r1.A00().A01;
            if (str == null) {
                Stack stack2 = r1.A02;
                int size = stack2.size();
                if (size >= 2) {
                    A0J = AnonymousClass002.A0J(stack2);
                } else {
                    size = stack.size();
                    if (size >= 2) {
                        A0J = AnonymousClass002.A0J(stack);
                    }
                    str3 = null;
                }
                AnonymousClass7YO r0 = (AnonymousClass7YO) A0J.get(size - 2);
                if (r0 != null) {
                    str3 = r0.A01;
                }
                str3 = null;
            }
            AnonymousClass7YO A002 = A00(str3);
            if (A002 != null) {
                z = A002.A00;
                A002.A00 = true;
            } else {
                z = true;
            }
            A03(r5, r14, str3, str4, str2, map, z);
        }
    }

    public final AnonymousClass7YO A00(String str) {
        Stack stack;
        while (true) {
            C152387Yr r5 = this.A04;
            Stack stack2 = r5.A02;
            if (stack2.size() == 0) {
                AnonymousClass7YO r1 = null;
                while (true) {
                    stack = r5.A01;
                    if (stack.size() == 0) {
                        break;
                    }
                    String str2 = ((AnonymousClass7YO) C162457s7.A03(stack)).A01;
                    if (C162457s7.A0P(str2, str)) {
                        r1 = (AnonymousClass7YO) C162457s7.A03(stack);
                        break;
                    }
                    if (stack.size() >= 1) {
                        stack.pop();
                    }
                    r5.A00.remove(str2);
                }
                C54522or r52 = this.A05;
                ArrayList A0J = AnonymousClass002.A0J(stack);
                ArrayList A0c = C73783g4.A0c(A0J);
                Iterator it = A0J.iterator();
                while (it.hasNext()) {
                    A0c.add(((AnonymousClass7YO) it.next()).A01);
                }
                r52.A01(new C197919e5(A0c));
                this.A01 = false;
                return r1;
            }
            String str3 = ((AnonymousClass7YO) C162457s7.A03(stack2)).A01;
            if (C162457s7.A0P(str3, str)) {
                return (AnonymousClass7YO) C162457s7.A03(stack2);
            }
            if (stack2.size() >= 1) {
                stack2.pop();
            }
            r5.A00.remove(str3);
        }
    }

    public final Map A01(String str, String str2) {
        LinkedHashMap A0r;
        Map map;
        AnonymousClass7YP r0 = (AnonymousClass7YP) this.A04.A00.remove(str);
        if (r0 == null || (map = r0.A01) == null) {
            A0r = C18320x8.A0r();
        } else {
            A0r = new LinkedHashMap(map);
        }
        A0r.remove(C373621y.ERROR.key);
        A0r.remove("is_back_triggered");
        if (str2 != null) {
            Object A012 = C159957ml.A01(str2).A01("$", new C181468mo[0]);
            C162457s7.A0D(A012);
            A0r.putAll((Map) A012);
        }
        return A0r;
    }

    public final void A03(C368820c r13, C60752z6 r14, String str, String str2, String str3, Map map, boolean z) {
        C137066ni r8;
        if (str == null) {
            C159127lA r0 = this.A03.A00;
            r0.A0K.A0S(r0.A0W);
            return;
        }
        String str4 = (String) C73723fy.A03(C175728Zm.A0P(str, new String[]{":"}, 0));
        if (!C162457s7.A0P(str4, C73723fy.A03(AnonymousClass2AB.A02(str2, ":")))) {
            this.A05.A01(new C172098Jp(str4));
            return;
        }
        AnonymousClass7EK r1 = this.A03;
        String str5 = str3;
        Map map2 = map;
        if (z) {
            Map A012 = A01(str, str5);
            C162457s7.A0J(r13, 4);
            C159127lA r2 = r1.A00;
            r2.A03 = r13;
            r2.A06(r14, C57412tb.A00(str), map2, A012, true);
            return;
        }
        Map A013 = A01(str, str5);
        C162457s7.A0J(r13, 3);
        C159127lA r6 = r1.A00;
        r6.A03 = r13;
        String A002 = C57412tb.A00(str);
        C40622Hc r02 = r6.A0Q;
        C162457s7.A0J(A002, 0);
        AnonymousClass7SR r82 = (AnonymousClass7SR) ((Map) C162457s7.A03(r02.A00)).get(A002);
        String str6 = null;
        if (!(r82 instanceof C137066ni) || (r8 = (C137066ni) r82) == null) {
            throw AnonymousClass0x9.A0i(AnonymousClass000.A0V("state not found for name: ", A002, AnonymousClass001.A0o()));
        }
        if (map != null) {
            str6 = r8.A03;
        }
        r6.A04(AnonymousClass211.RESTORE, r8, (C60752z6) null, str6, C60372yS.A00.A00(r8.A01, r8.A03, map2, A013));
    }

    public C160717oC(AnonymousClass282 r2, AnonymousClass7EK r3, C152387Yr r4, C60482yd r5, String str, boolean z) {
        C18260x0.A0R(r5, r2);
        C162457s7.A0J(r3, 5);
        this.A04 = r4;
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = z;
        this.A05 = r5.A02(str);
    }
}
