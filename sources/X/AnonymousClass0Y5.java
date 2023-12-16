package X;

import android.content.Context;
import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0Y5  reason: invalid class name */
public final class AnonymousClass0Y5 {
    public AnonymousClass0W9 A00 = null;
    public C186468vN A01 = null;
    public C181448mm A02 = null;
    public final AnonymousClass0P9 A03;
    public final C10110hP A04;
    public final C09640gW A05;
    public final C16800tz A06;
    public final C180328kr A07;
    public final C156397gY A08;
    public final AtomicLong A09 = new AtomicLong();
    public final AtomicReference A0A = new AtomicReference(C160367nW.A02);
    public final AtomicReference A0B = new AtomicReference();

    public static AnonymousClass0W9 A00(Context context, C156397gY r11, String str, Map map) {
        String str2 = str;
        AnonymousClass0W9 r3 = new AnonymousClass0W9((C181448mm) null);
        C15450rM r2 = ((C03510Km) C158977kt.A00().A06.A00()).A00;
        C03500Kl r1 = new C03500Kl(r3);
        AnonymousClass80b r22 = (AnonymousClass80b) r2;
        String str3 = (String) map.get("params");
        C55552qX r4 = (C55552qX) r22.A01.get();
        String str4 = r11.A02;
        if (str4 != null) {
            str2 = str4;
        }
        r4.A03((AnonymousClass39C) null, new AnonymousClass8KJ(context, r1, r22), (Boolean) null, str2, str3, (String) null);
        return r3;
    }

    public static String A03(String str, int i) {
        String str2;
        boolean A1U = AnonymousClass000.A1U(i, 2);
        StringBuilder A0o = AnonymousClass001.A0o();
        if (A1U) {
            str2 = "cc_";
        } else {
            str2 = "nc_";
        }
        return AnonymousClass000.A0V(str2, str, A0o);
    }

    public static C186468vN A02(C09640gW r6, C16800tz r7) {
        C16800tz r0 = r7;
        C186468vN Bq1 = r0.Bq1(r6.A04, r6.A01, r6.A00, r6.A02);
        Map map = r6.A07;
        if (map != null) {
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                AnonymousClass0XF.A01(Bq1, A0w.getValue(), (String) A0w.getKey());
            }
        }
        Iterator it = r6.A06.iterator();
        if (!it.hasNext()) {
            return Bq1;
        }
        it.next();
        throw AnonymousClass001.A0g("onStart");
    }

    /* JADX INFO: finally extract failed */
    public Pair A05(Context context) {
        try {
            C10110hP r1 = this.A04;
            Pair A052 = r1.A05(context);
            AnonymousClass0W9 r0 = this.A00;
            if (r0 != null) {
                r0.A03(r1);
                C181448mm A072 = A07(r1);
                this.A02 = A072;
                this.A00.A02(A072);
            }
            return A052;
        } catch (Throwable th) {
            AnonymousClass0W9 r12 = this.A00;
            if (r12 != null) {
                C10110hP r02 = this.A04;
                r12.A03(r02);
                C181448mm A073 = A07(r02);
                this.A02 = A073;
                this.A00.A02(A073);
            }
            throw th;
        }
    }

    public final C16300sn A06(C16300sn r2, C186468vN r3) {
        return new C09650gX(this, r2, r3);
    }

    public final C181448mm A07(C181448mm r2) {
        return new C10100hO(this, r2);
    }

    public Throwable A08() {
        AnonymousClass7RT r1 = (AnonymousClass7RT) this.A0B.get();
        if (r1 instanceof C131176dA) {
            return ((C131176dA) r1).A01();
        }
        return null;
    }

    public void A09() {
        AnonymousClass0W9 r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        }
        this.A00 = null;
        this.A04.A07();
        this.A0B.set((Object) null);
    }

    public void A0A() {
        try {
            C181448mm r1 = this.A02;
            if (r1 != null) {
                AnonymousClass0W9 r0 = this.A00;
                if (r0 != null) {
                    r0.A03(r1);
                }
                this.A02 = null;
            }
        } finally {
            C186468vN r02 = this.A01;
            if (r02 != null) {
                r02.BJf("BloksSurfaceController_onDestroyView");
            }
        }
    }

    public void A0B() {
        C186468vN r1 = this.A01;
        if (r1 != null) {
            r1.BJf("BloksSurfaceController_onPause");
        }
    }

    public final void A0C(Context context) {
        String str;
        C09640gW r1 = this.A05;
        if (!r1.A0A && (str = r1.A04) != null) {
            this.A00 = A00(context, this.A08, str, r1.A05);
        }
    }

    public final void A0D(C186468vN r12, C160367nW r13) {
        long now = this.A07.now();
        C186468vN r4 = r12;
        if (r13.A01.A00) {
            Iterator A0u = AnonymousClass001.A0u(AnonymousClass001.A0t());
            while (A0u.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0u);
                r12.BKk((String) A0w.getKey(), ((Number) A0w.getValue()).longValue());
            }
            HashMap A0t = AnonymousClass001.A0t();
            if ("".length() > 0) {
                A0t.put("fb_request_id", "");
            }
            Iterator A0u2 = AnonymousClass001.A0u(A0t);
            while (A0u2.hasNext()) {
                Map.Entry A0w2 = AnonymousClass001.A0w(A0u2);
                r12.BKb((String) A0w2.getKey(), (String) A0w2.getValue());
            }
        }
        if (r13.A00 != 2) {
            r12.BLS("bloks_query", true);
        } else {
            r4.AyH(0, "bloks_query", r13.A01(), now);
        }
    }

    public AnonymousClass0Y5(C10110hP r4, C09640gW r5, C156397gY r6) {
        C16800tz A032 = C158977kt.A00().A03();
        this.A06 = A032;
        C180328kr BDU = A032.BDU();
        this.A07 = BDU;
        this.A04 = r4;
        this.A05 = r5;
        this.A08 = r6;
        this.A03 = new AnonymousClass0P9(BDU.now());
    }
}
