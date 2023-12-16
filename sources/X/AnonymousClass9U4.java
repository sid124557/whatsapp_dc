package X;

import android.text.TextUtils;
import com.whatsapp.payments.PaymentConfiguration;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.9U4  reason: invalid class name */
public class AnonymousClass9U4 {
    public C194569Tl A00;
    public PaymentConfiguration A01;
    public C197129cc A02;
    public boolean A03;
    public final C66663Mh A04;
    public final C54292oU A05;
    public final C620733j A06;
    public final AnonymousClass36F A07;
    public final AnonymousClass8EA A08;
    public final C49622gp A09;
    public final C153087ae A0A;
    public final C1907099n A0B;
    public final AnonymousClass9TA A0C;
    public final C160757oG A0D = C160757oG.A00("PaymentsManager", "infra", "COMMON");
    public final AnonymousClass4FS A0E;
    public final Map A0F;

    public synchronized AnonymousClass9SU A0F(String str) {
        A0J();
        PaymentConfiguration paymentConfiguration = this.A01;
        if (paymentConfiguration == null) {
            return null;
        }
        return paymentConfiguration.A00(str);
    }

    @Deprecated
    public synchronized C203719oC A0G() {
        C197129cc r0;
        A0J();
        r0 = this.A02;
        C626936e.A06(r0);
        return r0;
    }

    public final synchronized void A0J() {
        if (!this.A03) {
            PaymentConfiguration paymentConfiguration = this.A01;
            if (paymentConfiguration == null) {
                paymentConfiguration = (PaymentConfiguration) ((C64333Db) C389229y.A02(this.A05.A00, C64333Db.class)).AcK.A00.A8d.get();
                this.A01 = paymentConfiguration;
            }
            this.A01 = paymentConfiguration;
            if (paymentConfiguration == null) {
                this.A0D.A05("initialize/paymentConfig is null");
            } else {
                this.A02 = new C197129cc(this.A04, this.A06, this.A0A, paymentConfiguration.BCr());
                AnonymousClass8EA r4 = this.A08;
                PaymentConfiguration paymentConfiguration2 = this.A01;
                synchronized (r4) {
                    r4.A01 = paymentConfiguration2;
                    if (!r4.A09) {
                        r4.A00 = new AnonymousClass1RD(r4.A04.A00, r4.A02, r4.A06, r4.A07, Collections.singleton(new AnonymousClass2G3(r4)));
                        r4.A09 = true;
                    }
                }
                AnonymousClass36F r3 = this.A07;
                PaymentConfiguration paymentConfiguration3 = this.A01;
                r3.A00 = paymentConfiguration3;
                this.A0C.A00 = paymentConfiguration3;
                this.A00 = new C194569Tl(r3, r4, paymentConfiguration3, this.A0E);
                this.A03 = true;
                this.A0D.A06("initialized");
            }
        }
    }

    public synchronized void A0L(boolean z, boolean z2) {
        C620933l r4;
        this.A0D.A06("reset");
        A0J();
        this.A03 = false;
        C153087ae r2 = this.A0A;
        synchronized (r2) {
            try {
                r2.A07.A04("reset country");
                r2.A00 = null;
                r2.A01 = false;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
        if (this.A08.A09 && !z2) {
            C194569Tl r22 = this.A00;
            C18270x1.A0w(new AnonymousClass99B(r22), r22.A03);
        }
        this.A09.A00();
        if (z) {
            if (this.A0B.A02.A0X(2928)) {
                A0C("p2m_context").A05();
            }
            A0C("p2p_context").A05();
        } else {
            if (this.A0B.A02.A0X(2928)) {
                A0C("p2m_context").A06();
            }
            A0C("p2p_context").A06();
        }
        C153527bU BAh = A0G().BAh();
        if (BAh != null) {
            synchronized (BAh) {
                try {
                    if (BAh.A07(C72063d7.A00)) {
                        BAh.A00.clear();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        }
        C185728u9 B63 = this.A02.B63();
        if (B63 != null) {
            B63.B1M();
        }
        C194619Tt B64 = this.A02.B64();
        if (B64 != null) {
            synchronized (B64) {
                try {
                    Log.i("PAY: IndiaUpiBlockListManager clear");
                    B64.A0A.clear();
                    r4 = B64.A09;
                    C18270x1.A0j(C620933l.A00(r4), "payments_block_list", "");
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
            synchronized (B64) {
                Log.i("PAY: IndiaUpiBlockListManager setShouldFetch called");
                B64.A00 = -1;
                C18270x1.A0i(C620933l.A00(r4), "payments_block_list_last_sync_time", -1);
            }
        }
    }

    public static C203719oC A07(AnonymousClass9U4 r1) {
        C203719oC A0H = r1.A0H("UPI");
        C626936e.A06(A0H);
        return A0H;
    }

    public String A0I(String str) {
        PaymentConfiguration paymentConfiguration = this.A01;
        if (paymentConfiguration == null) {
            return "UNSET";
        }
        paymentConfiguration.A01.A04();
        if (str != null) {
            str = C86664Kz.A1L(str);
        }
        if (TextUtils.isEmpty(str)) {
            return "UNSET";
        }
        switch (str.hashCode()) {
            case 66044:
                if (str.equals("BRL")) {
                    return "BR";
                }
                return "UNSET";
            case 72653:
                if (str.equals("INR")) {
                    return "IN";
                }
                return "UNSET";
            case 82032:
                if (str.equals("SGD")) {
                    return "SG";
                }
                return "UNSET";
            default:
                return "UNSET";
        }
    }

    public AnonymousClass9U4(C66663Mh r4, C54292oU r5, C620733j r6, AnonymousClass36F r7, AnonymousClass8EA r8, C49622gp r9, C153087ae r10, C1907099n r11, AnonymousClass9TA r12, AnonymousClass4FS r13, Map map) {
        this.A05 = r5;
        this.A0E = r13;
        this.A04 = r4;
        this.A08 = r8;
        this.A06 = r6;
        this.A0C = r12;
        this.A0B = r11;
        this.A0A = r10;
        this.A0F = map;
        this.A09 = r9;
        this.A07 = r7;
    }

    public static C194569Tl A00(AnonymousClass9U4 r0) {
        r0.A0J();
        C194569Tl r02 = r0.A00;
        C626936e.A06(r02);
        return r02;
    }

    public static AnonymousClass36F A01(AnonymousClass9U4 r0) {
        r0.A0J();
        return r0.A07;
    }

    public static C166587yw A02(AnonymousClass9U4 r0, String str) {
        r0.A0J();
        return r0.A08.A08(str);
    }

    public static AnonymousClass8EA A03(AnonymousClass9U4 r0) {
        r0.A0J();
        return r0.A08;
    }

    public static AnonymousClass9TC A04(AnonymousClass9U4 r0) {
        return r0.A0G().BAy();
    }

    public static C194659Tz A05(AnonymousClass9U4 r0) {
        return r0.A0G().BAx();
    }

    public static C203499no A06(AnonymousClass9U4 r0) {
        return r0.A0G().B7b();
    }

    public static List A08(AnonymousClass9U4 r0) {
        r0.A0J();
        return r0.A08.A0B();
    }

    public C194569Tl A09() {
        return A00(this);
    }

    public AnonymousClass36F A0A() {
        return A01(this);
    }

    public AnonymousClass8EA A0B() {
        return A03(this);
    }

    public C194979Vj A0C(String str) {
        A0J();
        Object obj = this.A0F.get(str);
        C626936e.A06(obj);
        return (C194979Vj) obj;
    }

    public AnonymousClass9TA A0E() {
        A0J();
        return this.A0C;
    }

    public C203719oC A0H(String str) {
        C197119cb r2;
        A0J();
        PaymentConfiguration paymentConfiguration = this.A01;
        if (paymentConfiguration == null) {
            return null;
        }
        AnonymousClass9ND r4 = (AnonymousClass9ND) paymentConfiguration.A01.A04();
        synchronized (r4) {
            Iterator A0q = AnonymousClass000.A0q(r4.A00);
            r2 = null;
            while (A0q.hasNext()) {
                C197119cb r1 = (C197119cb) ((AnonymousClass4C1) AnonymousClass0x2.A0W(A0q)).get();
                if (str.equalsIgnoreCase(r1.A08)) {
                    r2 = r1;
                }
            }
        }
        return r2;
    }

    public void A0K(AnonymousClass4EY r7) {
        Map map;
        boolean A1W;
        A0J();
        C49622gp r5 = this.A09;
        if (r5 != null) {
            synchronized (r5) {
                map = r5.A00;
                A1W = AnonymousClass001.A1W(map.size());
            }
            if (A1W) {
                synchronized (r5) {
                    HashSet A0K = AnonymousClass002.A0K();
                    Iterator it = map.keySet().iterator();
                    while (it.hasNext()) {
                        String A0m = AnonymousClass001.A0m(it);
                        if (map.get(A0m) == r7) {
                            A0K.add(A0m);
                        }
                    }
                    Iterator it2 = A0K.iterator();
                    while (it2.hasNext()) {
                        map.remove(AnonymousClass001.A0m(it2));
                    }
                }
            }
        }
    }

    public C1907099n A0D() {
        return this.A0B;
    }
}
