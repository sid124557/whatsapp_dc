package X;

import com.whatsapp.R;
import com.whatsapp.jid.PhoneUserJid;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* renamed from: X.2re  reason: invalid class name and case insensitive filesystem */
public class C56232re {
    public final C55682qk A00;
    public final C69263Wi A01;
    public final C56972sr A02;
    public final AnonymousClass36E A03;
    public final C56612sH A04;
    public final AnonymousClass2ZV A05;
    public final C66543Lv A06;
    public final C29431io A07;
    public final C55332qB A08;
    public final C29041iB A09;
    public final AnonymousClass36Y A0A;
    public final AnonymousClass1VX A0B;
    public final AnonymousClass4FV A0C;
    public final C620033c A0D;
    public final C618132i A0E;
    public final C54882pR A0F;
    public final AnonymousClass2YS A0G;
    public final C49592gm A0H;
    public final C55852r1 A0I;
    public final C162287rd A0J;
    public final C28121fj A0K;
    public final C58942w4 A0L;
    public final C54462ol A0M;
    public final AnonymousClass35J A0N;
    public final C50222hp A0O;
    public final C45042Yl A0P;
    public final C617832f A0Q;
    public final AnonymousClass4FS A0R;
    public final C72163dH A0S;
    public final Object A0T = AnonymousClass002.A0D();
    public final WeakHashMap A0U = new WeakHashMap();
    public final Executor A0V;

    public final AnonymousClass30M A00(C30471mV r7) {
        synchronized (this.A0T) {
            Iterator A0u = AnonymousClass001.A0u(this.A0U);
            while (A0u.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0u);
                AnonymousClass30M r0 = (AnonymousClass30M) A0w.getKey();
                AnonymousClass2z0 r2 = r7.A1J;
                if (r2 != null) {
                    Iterator it = r0.A02.iterator();
                    while (it.hasNext()) {
                        if (r2.equals(C18320x8.A0S(it).A1J)) {
                            AnonymousClass30M r02 = (AnonymousClass30M) A0w.getKey();
                            return r02;
                        }
                    }
                    continue;
                }
            }
            return null;
        }
    }

    public AnonymousClass3QO A01(AnonymousClass30M r3) {
        AnonymousClass3QO r0;
        synchronized (this.A0T) {
            r0 = (AnonymousClass3QO) this.A0U.get(r3);
        }
        return r0;
    }

    public final void A02(AnonymousClass30M r3, AnonymousClass3QO r4) {
        synchronized (this.A0T) {
            if (r4 == null) {
                this.A0U.remove(r3);
            } else {
                this.A0U.put(r3, r4);
            }
        }
    }

    public void A04(C624134x r5, boolean z) {
        if (!(r5 instanceof C30471mV)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A0n(C624134x.A08(r5, "mediajobmanager/cancelmessage; attempt to cancel non-media message: ", A0o), A0o);
            return;
        }
        boolean A1U = AnonymousClass001.A1U(AnonymousClass358.A00(r5.A0D, 2));
        StringBuilder A0o2 = AnonymousClass001.A0o();
        if (A1U) {
            C18260x0.A0n(C624134x.A08(r5, "mediajobmanager/cancelmessage; attempt to cancel uploaded message: ", A0o2), A0o2);
            if (z) {
                this.A01.A0H(R.string.f11nameremoved, 0);
                return;
            }
            return;
        }
        C18260x0.A0n(C624134x.A08(r5, "mediajobmanager/cancelmessage: ", A0o2), A0o2);
        this.A0M.A02(r5);
        AnonymousClass1I4 r2 = new AnonymousClass1I4(this, Collections.singletonList(r5), false);
        this.A0R.BkM(r2);
        r2.A04(new C86264Jl(this, 10, r5), this.A0V);
    }

    public void A03(AnonymousClass30M r13, AnonymousClass3QO r14, boolean z, boolean z2) {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("mediajobmanager/attach/job=");
        AnonymousClass3QO r9 = r14;
        A0o.append(r14);
        A0o.append("; messages=");
        AnonymousClass30M r7 = r13;
        C18260x0.A1J(A0o, r13.A01());
        A02(r13, r14);
        r14.A01 = C622934l.A00(r13);
        C633138t r5 = r14.A00().A06;
        if (AnonymousClass36O.A05(r5)) {
            str = "newsletter";
        } else {
            str = "mms";
        }
        r14.A0W = str;
        if (!this.A0Q.A01(r5, true) && ((r5 == C633138t.A09 || r5 == C633138t.A0C || r5 == C633138t.A0g) && C56952sp.A0I(this.A0B))) {
            List unmodifiableList = Collections.unmodifiableList(r13.A02);
            if (unmodifiableList.size() == 1 && (C18320x8.A0R(unmodifiableList, 0).A1J.A00 instanceof PhoneUserJid)) {
                r14.A0W = "express";
                r14.A0M.A09(4);
            }
        }
        C86224Jh r1 = new C86224Jh(r13, this, r14, 5);
        Executor executor = this.A0V;
        r14.A0A.A04(r1, executor);
        r14.A08.A04(new AnonymousClass92Y(r13, 0, this), (Executor) null);
        r14.A09.A04(new C86224Jh(r13, this, r14, 6), (Executor) null);
        r14.A0E.A04(new C86244Jj(r13, this, r14, 0), executor);
        r14.A0D.A04(new C86224Jh(r13, this, r14, 7), executor);
        r14.A0F.A04(new C86224Jh(r13, this, r14, 8), (Executor) null);
        r14.A0H.A04(new C86224Jh(r13, this, r14, 9), executor);
        r14.A0I.A04(new C86244Jj(r13, this, r14, 1), executor);
        AnonymousClass3X6 r2 = new AnonymousClass3X6(r13, this, r14, r5);
        if (C162457s7.A0P(r14.A0W, "express") || C162457s7.A0P(r14.A0W, "express-optimistic")) {
            r14.A07.A04(r2, (Executor) null);
        }
        r14.A06.A04(new C86224Jh(r13, this, r14, 3), (Executor) null);
        r14.A04(new AnonymousClass3X3(r7, this, r9, z, z2), executor);
    }

    public boolean A05(C30471mV r4) {
        boolean containsKey;
        AnonymousClass3QO A012 = A01(A00(r4));
        if (A012 != null) {
            C28121fj r2 = this.A0D.A0H;
            synchronized (r2) {
                containsKey = r2.A01.containsKey(A012);
            }
            if (!containsKey) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C56232re(C55682qk r6, C69263Wi r7, C56972sr r8, AnonymousClass36E r9, C56612sH r10, AnonymousClass2ZV r11, C66543Lv r12, C29431io r13, C55332qB r14, C29041iB r15, AnonymousClass36Y r16, AnonymousClass1VX r17, AnonymousClass4FV r18, C620033c r19, C618132i r20, C54882pR r21, AnonymousClass2YS r22, C49592gm r23, C55852r1 r24, C162287rd r25, C28121fj r26, C58942w4 r27, C54462ol r28, AnonymousClass35J r29, C50222hp r30, C45042Yl r31, C617832f r32, AnonymousClass4FS r33) {
        C72163dH r0;
        this.A04 = r10;
        AnonymousClass1VX r4 = r17;
        this.A0B = r4;
        this.A01 = r7;
        this.A00 = r6;
        this.A02 = r8;
        AnonymousClass4FS r3 = r33;
        this.A0R = r3;
        this.A0C = r18;
        this.A0I = r24;
        this.A0A = r16;
        this.A03 = r9;
        this.A0J = r25;
        this.A0Q = r32;
        this.A0N = r29;
        this.A0D = r19;
        this.A06 = r12;
        this.A0K = r26;
        this.A07 = r13;
        this.A0G = r22;
        this.A0F = r21;
        this.A0H = r23;
        this.A08 = r14;
        this.A05 = r11;
        this.A0M = r28;
        this.A09 = r15;
        this.A0E = r20;
        this.A0L = r27;
        Objects.requireNonNull(r7);
        this.A0V = new C86044Ip(r7, 2);
        this.A0O = r30;
        this.A0P = r31;
        C58422vE r1 = C58422vE.A02;
        if (r4.A0O(r1, 776) > 0) {
            r0 = new C72163dH(r3, r4.A0O(r1, 776), false);
        } else {
            r0 = null;
        }
        this.A0S = r0;
    }
}
