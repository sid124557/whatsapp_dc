package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.2s3  reason: invalid class name and case insensitive filesystem */
public abstract class C56482s3 {
    public final C183538qC A00;
    public final Map A01 = AnonymousClass001.A0t();

    public synchronized Runnable A01(Object obj) {
        Runnable runnable;
        C71773ce r0 = (C71773ce) this.A01.get(obj);
        if (r0 != null) {
            runnable = r0.A02;
        } else {
            runnable = null;
        }
        return runnable;
    }

    public synchronized Runnable A02(Object obj, Object obj2) {
        C71773ce r1;
        Map map = this.A01;
        r1 = (C71773ce) map.get(obj);
        if (r1 == null) {
            r1 = new C71773ce(this, obj, obj2, A07(obj, obj2));
            map.put(obj, r1);
            ((ThreadPoolExecutor) this.A00.get()).execute(r1);
        }
        return r1.A02;
    }

    public void A03(C84134Bd r3) {
        HashSet<Object> A0s;
        synchronized (this) {
            A0s = C18310x6.A0s(this.A01);
        }
        for (Object AwB : A0s) {
            r3.AwB(AwB);
        }
    }

    public synchronized void A04(Runnable runnable) {
        synchronized (this) {
            Iterator it = C18310x6.A0s(this.A01).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (runnable.equals(A01(next))) {
                    A06(next);
                    break;
                }
            }
        }
    }

    public final synchronized boolean A05(C71773ce r3, Object obj) {
        Map map = this.A01;
        if (!r3.equals(map.get(obj))) {
            return false;
        }
        map.remove(obj);
        ((ThreadPoolExecutor) this.A00.get()).remove(r3);
        return true;
    }

    public synchronized boolean A06(Object obj) {
        Map map = this.A01;
        C71773ce r1 = (C71773ce) map.get(obj);
        if (r1 == null) {
            return false;
        }
        r1.cancel();
        ((ThreadPoolExecutor) this.A00.get()).remove(r1);
        map.remove(obj);
        return true;
    }

    public Runnable A07(Object obj, Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        if (this instanceof C28121fj) {
            C28121fj r3 = (C28121fj) this;
            C61212zt r14 = (C61212zt) obj4;
            C626936e.A06(r14);
            int A002 = r14.A00();
            if (A002 != 2) {
                C55972rD r0 = r3.A00;
                if (A002 != 4) {
                    boolean booleanValue = r0.A05().booleanValue();
                    C54292oU r23 = r0.A07;
                    C56612sH r22 = r0.A06;
                    AnonymousClass1VX r26 = r0.A0B;
                    C69263Wi r43 = r0.A02;
                    C55682qk r1 = r0.A00;
                    if (booleanValue) {
                        C55682qk r42 = r1;
                        AnonymousClass4FS r20 = r0.A0Q;
                        C64393Dh r19 = r0.A01;
                        C56492s4 r18 = r0.A05;
                        AnonymousClass2JB r17 = r0.A0R;
                        C29011i8 r15 = r0.A0P;
                        AnonymousClass2WV r13 = r0.A0G;
                        C60132y3 r12 = r0.A0I;
                        C622934l r11 = r0.A0M;
                        AnonymousClass319 r10 = r0.A09;
                        AnonymousClass2RO r9 = r0.A0N;
                        C49802h7 r8 = r0.A0A;
                        C49592gm r7 = r0.A0K;
                        AnonymousClass2H2 r6 = r0.A0H;
                        C54672p6 r5 = r0.A0F;
                        C46992cX r4 = r0.A0D;
                        C55002pd r32 = r0.A0E;
                        C60152y5 r2 = r0.A0O;
                        AnonymousClass5KI r16 = r0.A0L;
                        AnonymousClass4FS r40 = r20;
                        AnonymousClass2JB r41 = r17;
                        C56492s4 r21 = r18;
                        AnonymousClass319 r24 = r10;
                        C49802h7 r25 = r8;
                        C46992cX r27 = r4;
                        C55002pd r28 = r32;
                        C54672p6 r29 = r5;
                        AnonymousClass2WV r30 = r13;
                        AnonymousClass2H2 r31 = r6;
                        return new AnonymousClass1g5(r42, r19, r43, r0.A04, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r12, r7, r14, r16, r11, r9, r2, r15, r40, r41);
                    }
                    C55682qk r202 = r1;
                    AnonymousClass4FS r192 = r0.A0Q;
                    C64393Dh r182 = r0.A01;
                    C56492s4 r172 = r0.A05;
                    C29011i8 r152 = r0.A0P;
                    AnonymousClass2WV r132 = r0.A0G;
                    C60132y3 r122 = r0.A0I;
                    C622934l r112 = r0.A0M;
                    AnonymousClass319 r102 = r0.A09;
                    AnonymousClass2RO r92 = r0.A0N;
                    C49802h7 r82 = r0.A0A;
                    C49592gm r72 = r0.A0K;
                    AnonymousClass2H2 r62 = r0.A0H;
                    C54672p6 r52 = r0.A0F;
                    C46992cX r44 = r0.A0D;
                    C55002pd r33 = r0.A0E;
                    C60152y5 r210 = r0.A0O;
                    AnonymousClass5KI r110 = r0.A0L;
                    AnonymousClass4FS r402 = r192;
                    C56492s4 r212 = r172;
                    AnonymousClass319 r242 = r102;
                    C49802h7 r252 = r82;
                    C46992cX r272 = r44;
                    C55002pd r282 = r33;
                    C54672p6 r292 = r52;
                    AnonymousClass2WV r302 = r132;
                    AnonymousClass2H2 r312 = r62;
                    return new AnonymousClass1I5(r202, r182, r43, r0.A04, r212, r22, r23, r242, r252, r26, r272, r282, r292, r302, r312, r122, r72, r14, r110, r112, r92, r210, r152, r402);
                }
                C54292oU r232 = r0.A07;
                C56612sH r222 = r0.A06;
                AnonymousClass1VX r262 = r0.A0B;
                C69263Wi r412 = r0.A02;
                C55682qk r203 = r0.A00;
                AnonymousClass4FS r193 = r0.A0Q;
                C64393Dh r183 = r0.A01;
                C56492s4 r173 = r0.A05;
                C29011i8 r153 = r0.A0P;
                AnonymousClass2WV r133 = r0.A0G;
                C60132y3 r123 = r0.A0I;
                C622934l r113 = r0.A0M;
                AnonymousClass319 r103 = r0.A09;
                AnonymousClass2RO r93 = r0.A0N;
                C49802h7 r83 = r0.A0A;
                C49592gm r73 = r0.A0K;
                AnonymousClass2H2 r63 = r0.A0H;
                C54672p6 r53 = r0.A0F;
                C46992cX r45 = r0.A0D;
                C55002pd r34 = r0.A0E;
                C60152y5 r211 = r0.A0O;
                AnonymousClass5KI r111 = r0.A0L;
                AnonymousClass4FS r403 = r193;
                C56492s4 r213 = r173;
                AnonymousClass319 r243 = r103;
                C49802h7 r253 = r83;
                C46992cX r273 = r45;
                C55002pd r283 = r34;
                C54672p6 r293 = r53;
                AnonymousClass2WV r303 = r133;
                AnonymousClass2H2 r313 = r63;
                return new AnonymousClass1g4(r203, r183, r412, r0.A04, r213, r222, r232, r243, r253, r262, r273, r283, r293, r303, r313, r123, r73, r14, r111, r113, r93, r211, r153, r403);
            }
            C55972rD r02 = r3.A00;
            C54292oU r233 = r02.A07;
            C56612sH r223 = r02.A06;
            AnonymousClass1VX r263 = r02.A0B;
            C69263Wi r413 = r02.A02;
            C55682qk r204 = r02.A00;
            AnonymousClass4FS r194 = r02.A0Q;
            C64393Dh r184 = r02.A01;
            C56492s4 r174 = r02.A05;
            C29011i8 r154 = r02.A0P;
            AnonymousClass2WV r134 = r02.A0G;
            C60132y3 r124 = r02.A0I;
            C622934l r114 = r02.A0M;
            AnonymousClass319 r104 = r02.A09;
            AnonymousClass2RO r94 = r02.A0N;
            C49802h7 r84 = r02.A0A;
            C49592gm r74 = r02.A0K;
            AnonymousClass2H2 r64 = r02.A0H;
            C54672p6 r54 = r02.A0F;
            C46992cX r46 = r02.A0D;
            C55002pd r35 = r02.A0E;
            C60152y5 r214 = r02.A0O;
            AnonymousClass5KI r115 = r02.A0L;
            AnonymousClass4FS r404 = r194;
            C56492s4 r215 = r174;
            AnonymousClass319 r244 = r104;
            C49802h7 r254 = r84;
            C46992cX r274 = r46;
            C55002pd r284 = r35;
            C54672p6 r294 = r54;
            AnonymousClass2WV r304 = r134;
            AnonymousClass2H2 r314 = r64;
            return new AnonymousClass1g6(r204, r184, r413, r02.A04, r215, r223, r233, r244, r254, r263, r274, r284, r294, r304, r314, r124, r74, (C135406kc) r14, r115, r114, r94, r214, r154, r404);
        } else if (this instanceof C28091fg) {
            C624134x r216 = (C624134x) obj3;
            AnonymousClass1I8 r142 = (AnonymousClass1I8) obj4;
            C162457s7.A0J(r216, 0);
            if (r142 != null) {
                return r142;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A0N(C28091fg.class, A0o);
            C624134x.A0S(r216, "/makeRunnable: mediaDownload of message ", A0o);
            throw AnonymousClass0x2.A0V(" is null", A0o);
        } else if ((this instanceof C28111fi) || (this instanceof C28131fk)) {
            return (AnonymousClass1I8) obj4;
        } else {
            C149087Kz r143 = (C149087Kz) obj4;
            C626936e.A06(r143);
            C64333Db r03 = ((C28101fh) this).A00.A00.A01;
            return new C71743cb(C64333Db.A01(r03), (C153407bG) r03.AbG.get(), C64333Db.A2q(r03), r143);
        }
    }

    public C56482s3(C183538qC r2) {
        this.A00 = r2;
    }
}
