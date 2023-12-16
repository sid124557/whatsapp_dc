package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.5RD  reason: invalid class name */
public class AnonymousClass5RD {
    public AnonymousClass4FW A00;
    public AtomicBoolean A01;
    public final AnonymousClass08J A02;
    public final AnonymousClass08J A03;
    public final AnonymousClass08J A04;
    public final AnonymousClass08J A05;
    public final AnonymousClass08J A06;
    public final AnonymousClass08J A07;
    public final AnonymousClass08M A08 = AnonymousClass08M.A01();
    public final AnonymousClass08M A09 = AnonymousClass08M.A01();
    public final AnonymousClass08M A0A = AnonymousClass08M.A01();
    public final AnonymousClass08M A0B = AnonymousClass08M.A01();
    public final AnonymousClass08M A0C = AnonymousClass08M.A01();
    public final C64773Ex A0D;
    public final AnonymousClass5ZU A0E;
    public final C56612sH A0F;
    public final C66533Lu A0G;
    public final AnonymousClass1VX A0H;
    public final AnonymousClass4FV A0I;
    public final AnonymousClass8JP A0J;
    public final C56532s8 A0K;
    public final C56532s8 A0L;
    public final C104345Qp A0M;

    public final String A00() {
        C56532s8 r2 = this.A0K;
        String A022 = r2.A02();
        UserJid A032 = AnonymousClass32Y.A03(r2.A04);
        if (A032 == null) {
            return A022;
        }
        AnonymousClass3ZH A0A2 = this.A0D.A0A(A032);
        AnonymousClass5ZU r7 = this.A0E;
        List A042 = r2.A04();
        List A033 = r2.A03();
        C626936e.A0E(AnonymousClass000.A1T(A033.size() % 2), "tokenPositions.size must be even");
        Iterator it = A033.iterator();
        ArrayList A0s = AnonymousClass001.A0s();
        C18270x1.A1K(A0s, 0);
        for (Object next : A042) {
            Object next2 = it.next();
            Object next3 = it.next();
            if (AnonymousClass5ZU.A04(r7, A0A2, Collections.singletonList(next))) {
                A0s.add(next2);
                A0s.add(next3);
            }
        }
        C18270x1.A1K(A0s, A022.length());
        Iterator it2 = A0s.iterator();
        ArrayList A0s2 = AnonymousClass001.A0s();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Number number = (Number) it2.next();
            Number number2 = (Number) it2.next();
            if (number == null || number2 == null) {
                Log.e("messageSearchModel/invalid index in token mapping");
            } else if (!number.equals(number2)) {
                String trim = A022.subSequence(number.intValue(), number2.intValue()).toString().trim();
                if (trim.length() > 0) {
                    A0s2.add(trim);
                }
            }
        }
        return TextUtils.join(" ", A0s2);
    }

    public void A01(boolean z) {
        AnonymousClass08M r0 = this.A0B;
        Boolean bool = Boolean.TRUE;
        r0.A0H(bool);
        this.A05.A0H(new C105745Wf());
        AnonymousClass08J r1 = this.A06;
        if (!z) {
            bool = null;
        }
        r1.A0H(C18290x4.A0K(bool, 0));
        this.A07.A0H(this.A0L);
        this.A0K.A0F = true;
    }

    public AnonymousClass5RD(C06270Wx r10, C06270Wx r11, C06270Wx r12, C06270Wx r13, C64773Ex r14, AnonymousClass5ZU r15, C56612sH r16, C620733j r17, C66533Lu r18, AnonymousClass1VX r19, AnonymousClass4FV r20, AnonymousClass8JP r21, C104345Qp r22, C103315Mk r23) {
        AnonymousClass08J A0E2 = AnonymousClass4L0.A0E();
        this.A04 = A0E2;
        AnonymousClass08J A0E3 = AnonymousClass4L0.A0E();
        this.A07 = A0E3;
        AnonymousClass08J A0E4 = AnonymousClass4L0.A0E();
        this.A05 = A0E4;
        AnonymousClass08J A0E5 = AnonymousClass4L0.A0E();
        this.A02 = A0E5;
        AnonymousClass08J A0E6 = AnonymousClass4L0.A0E();
        this.A03 = A0E6;
        AnonymousClass08J A0E7 = AnonymousClass4L0.A0E();
        this.A06 = A0E7;
        this.A01 = new AtomicBoolean();
        this.A00 = new C124166Bf(this, 18);
        C620733j r6 = r17;
        C56532s8 r8 = new C56532s8(r6);
        r8.A01 = 100;
        this.A0K = r8;
        this.A0L = new C56532s8(r6);
        this.A0H = r19;
        this.A0F = r16;
        this.A0I = r20;
        this.A0D = r14;
        this.A0E = r15;
        this.A0G = r18;
        this.A0M = r22;
        this.A0J = r21;
        A01(false);
        C103315Mk r62 = r23;
        C103315Mk.A00(A0E2, A0E4, r62, this, 13);
        A0E5.A0J(A0E3, new C63633Aa(new AnonymousClass4J8(this, 0), A0E5, r62));
        A0E6.A0J(A0E3, new C63633Aa(new AnonymousClass4J8(this, 1), A0E6, r62));
        AnonymousClass6C6.A03(A0E7, A0E2, this, 301);
        AnonymousClass6C6.A03(r11, A0E7, this, 302);
        AnonymousClass6C6.A03(r10, A0E7, this, 303);
        AnonymousClass6C6.A03(r12, A0E7, this, 304);
        AnonymousClass6C6.A03(r13, A0E7, this, 305);
    }
}
