package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0fZ  reason: invalid class name and case insensitive filesystem */
public class C09050fZ implements C16880uB, C16140sX, C16740tt {
    public static final String A09 = C06240Wu.A01("GreedyScheduler");
    public AnonymousClass0TC A00;
    public Boolean A01;
    public boolean A02;
    public final Context A03;
    public final AnonymousClass0QD A04 = new AnonymousClass0QD();
    public final C06310Xb A05;
    public final C16750tu A06;
    public final Object A07;
    public final Set A08 = AnonymousClass002.A0K();

    public void AyW(String str) {
        Runnable runnable;
        Boolean bool = this.A01;
        if (bool == null) {
            bool = Boolean.valueOf(AnonymousClass0VL.A01(this.A03, this.A05.A02));
            this.A01 = bool;
        }
        if (!bool.booleanValue()) {
            C06240Wu.A00();
            Log.i(A09, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.A02) {
            this.A05.A03.A02(this);
            this.A02 = true;
        }
        C06240Wu A002 = C06240Wu.A00();
        String str2 = A09;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Cancelling work ID ");
        C06240Wu.A03(A002, str, str2, A0o);
        AnonymousClass0TC r2 = this.A00;
        if (!(r2 == null || (runnable = (Runnable) r2.A02.remove(str)) == null)) {
            ((C08980fS) r2.A00).A00.removeCallbacks(runnable);
        }
        for (C03440Kd A092 : this.A04.A02(str)) {
            this.A05.A09(A092);
        }
    }

    public boolean BFJ() {
        return false;
    }

    public void BSX(AnonymousClass0PL r8, boolean z) {
        this.A04.A00(r8);
        synchronized (this.A07) {
            Set set = this.A08;
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C06250Wv r4 = (C06250Wv) it.next();
                if (AnonymousClass0J0.A00(r4).equals(r8)) {
                    C06240Wu.A02(C06240Wu.A00(), r8, "Stopping tracking for ", A09, AnonymousClass001.A0o());
                    set.remove(r4);
                    this.A06.BjY(set);
                    break;
                }
            }
        }
    }

    public void Bkm(C06250Wv... r14) {
        C06240Wu A002;
        String str;
        StringBuilder A0o;
        String str2;
        Boolean bool = this.A01;
        if (bool == null) {
            bool = Boolean.valueOf(AnonymousClass0VL.A01(this.A03, this.A05.A02));
            this.A01 = bool;
        }
        if (!bool.booleanValue()) {
            C06240Wu.A00();
            Log.i(A09, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.A02) {
            this.A05.A03.A02(this);
            this.A02 = true;
        }
        HashSet A0K = AnonymousClass002.A0K();
        HashSet A0K2 = AnonymousClass002.A0K();
        for (C06250Wv r10 : r14) {
            AnonymousClass0PL A003 = AnonymousClass0J0.A00(r10);
            AnonymousClass0QD r9 = this.A04;
            if (!r9.A03(A003)) {
                long A022 = r10.A02();
                long currentTimeMillis = System.currentTimeMillis();
                if (r10.A0E == AnonymousClass0GD.ENQUEUED) {
                    if (currentTimeMillis < A022) {
                        AnonymousClass0TC r92 = this.A00;
                        if (r92 != null) {
                            Map map = r92.A02;
                            String str3 = r10.A0J;
                            Runnable runnable = (Runnable) map.remove(str3);
                            if (runnable != null) {
                                ((C08980fS) r92.A00).A00.removeCallbacks(runnable);
                            }
                            C12050kt r4 = new C12050kt(r92, r10);
                            map.put(str3, r4);
                            ((C08980fS) r92.A00).A00.postDelayed(r4, r10.A02() - System.currentTimeMillis());
                        }
                    } else if (r10.A05()) {
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 23) {
                            AnonymousClass0XS r1 = r10.A0A;
                            if (r1.A00()) {
                                A002 = C06240Wu.A00();
                                str = A09;
                                A0o = AnonymousClass001.A0o();
                                A0o.append("Ignoring ");
                                A0o.append(r10);
                                str2 = ". Requires device idle.";
                            } else if (i >= 24 && (!r1.A03.isEmpty())) {
                                A002 = C06240Wu.A00();
                                str = A09;
                                A0o = AnonymousClass001.A0o();
                                A0o.append("Ignoring ");
                                A0o.append(r10);
                                str2 = ". Requires ContentUri triggers.";
                            }
                            C06240Wu.A03(A002, str2, str, A0o);
                        }
                        A0K.add(r10);
                        A0K2.add(r10.A0J);
                    } else if (!r9.A03(AnonymousClass0J0.A00(r10))) {
                        C06240Wu A004 = C06240Wu.A00();
                        String str4 = A09;
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        A0o2.append("Starting work for ");
                        C06240Wu.A03(A004, r10.A0J, str4, A0o2);
                        C06310Xb r42 = this.A05;
                        r42.A06.B2t(new C12720m1((C03790Lo) null, r9.A01(AnonymousClass0J0.A00(r10)), r42));
                    }
                }
            }
        }
        synchronized (this.A07) {
            if (!A0K.isEmpty()) {
                String join = TextUtils.join(",", A0K2);
                C06240Wu A005 = C06240Wu.A00();
                String str5 = A09;
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("Starting tracking for ");
                C06240Wu.A03(A005, join, str5, A0o3);
                Set set = this.A08;
                set.addAll(A0K);
                this.A06.BjY(set);
            }
        }
    }

    public C09050fZ(Context context, C04320Nt r4, C06310Xb r5, AnonymousClass0TH r6) {
        this.A03 = context;
        this.A05 = r5;
        this.A06 = new C09080fc(this, r6);
        this.A00 = new AnonymousClass0TC(r4.A03, this);
        this.A07 = AnonymousClass002.A0D();
    }

    public void BML(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass0PL A002 = AnonymousClass0J0.A00((C06250Wv) it.next());
            AnonymousClass0QD r5 = this.A04;
            if (!r5.A03(A002)) {
                C06240Wu.A02(C06240Wu.A00(), A002, "Constraints met: Scheduling work ID ", A09, AnonymousClass001.A0o());
                C06310Xb r4 = this.A05;
                r4.A06.B2t(new C12720m1((C03790Lo) null, r5.A01(A002), r4));
            }
        }
    }

    public void BMM(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass0PL A002 = AnonymousClass0J0.A00((C06250Wv) it.next());
            C06240Wu.A02(C06240Wu.A00(), A002, "Constraints not met: Cancelling work ID ", A09, AnonymousClass001.A0o());
            C03440Kd A003 = this.A04.A00(A002);
            if (A003 != null) {
                this.A05.A09(A003);
            }
        }
    }
}
