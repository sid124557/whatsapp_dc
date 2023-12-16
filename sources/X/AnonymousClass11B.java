package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.11B  reason: invalid class name */
public class AnonymousClass11B extends C05550Ty {
    public final AnonymousClass08J A00;
    public final C69263Wi A01;
    public final C56972sr A02;
    public final C56942so A03;
    public final C59712xM A04;
    public final C56602sG A05 = new AnonymousClass4H9(this, 3);
    public final C29421in A06;
    public final AnonymousClass4F5 A07 = new C86174Jc(this, 0);
    public final C28951i2 A08;
    public final C56982ss A09;
    public final AnonymousClass4FI A0A = new AnonymousClass4IC(this, 5);
    public final C28891hw A0B;
    public final C56152rV A0C;
    public final AnonymousClass4FW A0D = new C86164Jb(this, 3);
    public final C29431io A0E;
    public final AnonymousClass1VX A0F;
    public final C55702qm A0G = new AnonymousClass4HI(this, 3);
    public final C29241iV A0H;
    public final C56252rg A0I = new AnonymousClass4HJ(this, 1);
    public final C29331ie A0J;
    public final C52472lX A0K;
    public final AnonymousClass107 A0L;
    public final AnonymousClass107 A0M;
    public final C72173dI A0N;
    public final AnonymousClass4UC A0O = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0P = AnonymousClass0x9.A0b();
    public final Comparator A0Q;
    public final Comparator A0R;
    public final Map A0S = C18320x8.A0r();
    public final Map A0T = AnonymousClass001.A0t();
    public final AnonymousClass4GQ A0U = new C86364Jv(this, 6);
    public final AnonymousClass4GQ A0V = new C86364Jv(this, 4);
    public final AnonymousClass4GQ A0W = new C86364Jv(this, 5);

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (r4 == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r4.isEmpty() != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(X.AnonymousClass11B r6, com.whatsapp.jid.GroupJid r7) {
        /*
            X.2ss r0 = r6.A09
            X.31A r5 = X.C56982ss.A00(r0, r7)
            if (r5 == 0) goto L_0x0032
            java.util.List r4 = r6.A0D(r5)
            r3 = 1
            if (r4 == 0) goto L_0x0016
            boolean r0 = r4.isEmpty()
            r2 = 0
            if (r0 == 0) goto L_0x0017
        L_0x0016:
            r2 = 1
        L_0x0017:
            java.util.Map r0 = r6.A0T
            java.util.List r1 = r6.A0E(r5, r0)
            if (r1 == 0) goto L_0x0033
            java.util.Comparator r0 = r6.A0R
            java.util.Collections.sort(r1, r0)
            java.util.Map r0 = r6.A0S
            r0.put(r5, r1)
        L_0x0029:
            r0 = 0
        L_0x002a:
            if (r2 != 0) goto L_0x002f
            if (r0 != 0) goto L_0x002f
            r3 = 0
        L_0x002f:
            r6.A0F(r3)
        L_0x0032:
            return
        L_0x0033:
            X.2xM r0 = r6.A04
            java.util.Set r0 = r0.A01
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L_0x0047
            java.util.Map r1 = r6.A0S
            java.util.List r0 = java.util.Collections.emptyList()
            r1.put(r5, r0)
            goto L_0x0029
        L_0x0047:
            r0 = 1
            if (r4 != 0) goto L_0x002a
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11B.A00(X.11B, com.whatsapp.jid.GroupJid):void");
    }

    public void A0C() {
        this.A0B.A07(this.A0A);
        this.A08.A07(this.A07);
        this.A0J.A07(this.A0I);
        this.A0E.A07(this.A0D);
        this.A0H.A07(this.A0G);
        this.A06.A07(this.A05);
        C59712xM r0 = this.A04;
        r0.A03.A07(r0.A02);
    }

    public final List A0D(AnonymousClass31A r5) {
        List<AnonymousClass31A> list = (List) this.A0S.remove(r5);
        if (list != null) {
            for (AnonymousClass31A A052 : list) {
                this.A0T.remove(AnonymousClass32V.A00(A052.A05()));
            }
        }
        return list;
    }

    public final List A0E(AnonymousClass31A r6, Map map) {
        Set A052 = this.A03.A05(AnonymousClass34R.A01(r6.A05()));
        if (!A052.isEmpty()) {
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = A052.iterator();
            while (it.hasNext()) {
                C52882mC A0O2 = AnonymousClass0x7.A0O(it);
                C56982ss r0 = this.A09;
                GroupJid groupJid = A0O2.A02;
                AnonymousClass31A A002 = C56982ss.A00(r0, groupJid);
                if (A002 != null) {
                    map.put(groupJid, r6);
                    A0s.add(A002);
                }
            }
            if (!A0s.isEmpty()) {
                return A0s;
            }
        }
        return null;
    }

    public final boolean A0G(C95814uZ r6) {
        if (r6 instanceof C27991fJ) {
            Map map = this.A0S;
            if (!map.isEmpty()) {
                Iterator A0q = AnonymousClass000.A0q(map);
                while (A0q.hasNext()) {
                    AnonymousClass31A r2 = (AnonymousClass31A) AnonymousClass001.A0w(A0q).getKey();
                    C95814uZ A052 = r2.A05();
                    if ((A052 instanceof C27991fJ) && r6.equals(A052)) {
                        A0D(r2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x015a, code lost:
        if (r3.isEmpty() != false) goto L_0x015c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fc A[LOOP:1: B:36:0x00f3->B:40:0x00fc, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(boolean r21) {
        /*
            r20 = this;
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            r2 = r20
            java.util.Map r6 = r2.A0S
            java.util.Set r0 = r6.keySet()
            java.util.ArrayList r1 = X.AnonymousClass002.A0J(r0)
            java.util.Comparator r0 = r2.A0Q
            java.util.Collections.sort(r1, r0)
            java.util.Iterator r12 = r1.iterator()
        L_0x0019:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0131
            java.lang.Object r14 = r12.next()
            X.31A r14 = (X.AnonymousClass31A) r14
            java.util.List r8 = X.C18320x8.A0s(r14, r6)
            X.4uZ r0 = r14.A05()
            com.whatsapp.jid.GroupJid r1 = X.AnonymousClass32V.A00(r0)
            if (r1 == 0) goto L_0x003b
            if (r8 == 0) goto L_0x003b
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0046
        L_0x003b:
            X.2xM r0 = r2.A04
            java.util.Set r0 = r0.A01
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0046
            goto L_0x0019
        L_0x0046:
            X.2xM r5 = r2.A04
            java.util.Set r0 = r5.A01
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x008f
            X.4uZ r0 = r14.A05()
            com.whatsapp.jid.GroupJid r15 = X.AnonymousClass32V.A01(r0)
            if (r15 != 0) goto L_0x0062
            java.util.List r7 = java.util.Collections.emptyList()
        L_0x005e:
            r3.addAll(r7)
            goto L_0x0019
        L_0x0062:
            r18 = 1
            r0 = 9
            X.26z r4 = new X.26z
            r4.<init>(r5, r0)
            r0 = 10
            X.26z r1 = new X.26z
            r1.<init>(r5, r0)
            X.2jn r0 = r5.A00
            java.util.Set r0 = r0.A00
            boolean r19 = X.C73723fy.A0U(r0, r15)
            X.5St r13 = new X.5St
            r16 = r4
            r17 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r1 = 8
            X.5Pt r0 = new X.5Pt
            r0.<init>(r15, r13, r1)
            java.util.List r7 = java.util.Collections.singletonList(r0)
            goto L_0x005e
        L_0x008f:
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            X.4uZ r0 = r14.A05()
            com.whatsapp.jid.GroupJid r15 = X.AnonymousClass32V.A01(r0)
            if (r15 == 0) goto L_0x00b8
            r18 = 0
            X.4GQ r1 = r2.A0V
            X.4GQ r0 = r2.A0W
            X.5St r13 = new X.5St
            r16 = r1
            r17 = r0
            r19 = r18
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r1 = 8
            X.5Pt r0 = new X.5Pt
            r0.<init>(r15, r13, r1)
            r7.add(r0)
        L_0x00b8:
            X.2rV r4 = r2.A0C
            X.4uZ r1 = r14.A05()
            r0 = 1
            X.34x r11 = r4.A02(r1, r0)
            r9 = 0
            if (r11 == 0) goto L_0x00d6
            X.2sr r0 = r2.A02
            boolean r0 = X.C627636p.A0S(r0, r11)
            if (r0 == 0) goto L_0x00d6
            monitor-enter(r14)
            long r4 = r14.A0K     // Catch:{ all -> 0x012e }
            monitor-exit(r14)
            monitor-enter(r14)
            long r0 = r14.A0J     // Catch:{ all -> 0x012e }
            goto L_0x00d8
        L_0x00d6:
            r10 = 0
            goto L_0x00f3
        L_0x00d8:
            monitor-exit(r14)
            int r10 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r10 < 0) goto L_0x00d6
            X.4GQ r0 = r2.A0U
            X.2jl r5 = new X.2jl
            r5.<init>(r11, r0)
            X.4uZ r4 = r11.A0n()
            r1 = 13
            X.5Pt r0 = new X.5Pt
            r0.<init>(r4, r5, r1)
            r7.add(r0)
            r10 = 1
        L_0x00f3:
            int r0 = r8.size()
            if (r9 >= r0) goto L_0x011e
            r0 = 3
            if (r10 >= r0) goto L_0x011e
            java.lang.Object r4 = r8.get(r9)
            X.31A r4 = (X.AnonymousClass31A) r4
            X.4uZ r1 = r4.A05()
            r0 = 2
            X.4zQ r5 = new X.4zQ
            r5.<init>(r1, r0)
            X.4uZ r4 = r4.A05()
            r1 = 4
            X.5Pt r0 = new X.5Pt
            r0.<init>(r4, r5, r1)
            r7.add(r0)
            int r10 = r10 + 1
            int r9 = r9 + 1
            goto L_0x00f3
        L_0x011e:
            r4 = 9
            X.4uZ r1 = r14.A05()
            X.5Pt r0 = new X.5Pt
            r0.<init>(r1, r14, r4)
            r7.add(r0)
            goto L_0x005e
        L_0x012e:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x0131:
            int r0 = r3.size()
            r5 = 0
            if (r0 == 0) goto L_0x015c
            X.1VX r4 = r2.A0F
            r0 = 982(0x3d6, float:1.376E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r0 = r4.A0Y(r1, r0)
            if (r0 == 0) goto L_0x0156
            r0 = 5543(0x15a7, float:7.767E-42)
            boolean r0 = r4.A0Y(r1, r0)
            if (r0 != 0) goto L_0x0156
            r0 = 7
            X.5Pt r1 = new X.5Pt
            r1.<init>(r5, r5, r0)
            r0 = 0
            r3.add(r0, r1)
        L_0x0156:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x016a
        L_0x015c:
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            r1 = 10
            X.5Pt r0 = new X.5Pt
            r0.<init>(r5, r5, r1)
            r3.add(r0)
        L_0x016a:
            X.107 r0 = r2.A0M
            r0.A0G(r3)
            if (r21 == 0) goto L_0x0176
            X.107 r0 = r2.A0L
            r0.A0G(r3)
        L_0x0176:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11B.A0F(boolean):void");
    }

    public AnonymousClass11B(C69263Wi r6, C56972sr r7, C56942so r8, C29421in r9, C28951i2 r10, C56982ss r11, C28891hw r12, C56152rV r13, C29431io r14, AnonymousClass1VX r15, C29241iV r16, C29331ie r17, C56062rM r18, C52472lX r19, AnonymousClass4FS r20) {
        this.A0F = r15;
        this.A01 = r6;
        this.A02 = r7;
        this.A09 = r11;
        this.A0N = new C72173dI(r20, false);
        this.A06 = r9;
        this.A0C = r13;
        this.A0E = r14;
        this.A0K = r19;
        this.A08 = r10;
        this.A03 = r8;
        this.A0J = r17;
        this.A0B = r12;
        this.A0H = r16;
        this.A0M = new AnonymousClass107(AnonymousClass001.A0s());
        AnonymousClass107 r4 = new AnonymousClass107(AnonymousClass001.A0s());
        this.A0L = r4;
        this.A0R = new C71913cs(r11);
        this.A0Q = new C71883cp(r11, r18);
        C59712xM r3 = new C59712xM(r12, new C86364Jv(this, 7));
        this.A04 = r3;
        AnonymousClass08J r2 = new AnonymousClass08J();
        this.A00 = r2;
        Objects.requireNonNull(r2);
        r2.A0J(r4, new AnonymousClass4K2(r2, 33));
        AnonymousClass4K2.A01(r3.A04, r2, this, 34);
    }
}
