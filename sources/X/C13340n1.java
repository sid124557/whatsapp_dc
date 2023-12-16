package X;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: X.0n1  reason: invalid class name and case insensitive filesystem */
public class C13340n1 implements Runnable {
    public static final String A0I = C06240Wu.A01("WorkerWrapper");
    public Context A00;
    public C04320Nt A01;
    public C03070Is A02 = new C01400Ao();
    public AnonymousClass0QH A03;
    public C03790Lo A04;
    public WorkDatabase A05;
    public C15380rF A06;
    public C16160sZ A07;
    public C06250Wv A08;
    public C17060uV A09;
    public AnonymousClass0BT A0A = AnonymousClass0BT.A00();
    public C16180sb A0B;
    public String A0C;
    public List A0D;
    public List A0E;
    public final AnonymousClass0BT A0F = AnonymousClass0BT.A00();
    public final String A0G;
    public volatile boolean A0H;

    public void A02() {
        this.A0H = true;
        A08();
        AnonymousClass0BT r1 = this.A0F;
        r1.cancel(true);
        if (this.A03 == null || !r1.isCancelled()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("WorkSpec ");
            A0o.append(this.A08);
            C06240Wu.A00().A04(A0I, AnonymousClass000.A0X(" is already done. Not interrupting.", A0o));
            return;
        }
        AnonymousClass0QH r12 = this.A03;
        r12.A03 = true;
        r12.A0A();
    }

    public static /* synthetic */ void A00(C13340n1 r0, C188268yc r1) {
        if (r0.A0F.isCancelled()) {
            r1.cancel(true);
        }
    }

    public C188268yc A01() {
        return this.A0A;
    }

    public void A04() {
        WorkDatabase workDatabase = this.A05;
        workDatabase.A0A();
        try {
            String str = this.A0G;
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (!linkedList.isEmpty()) {
                String str2 = (String) linkedList.remove();
                C17060uV r2 = this.A09;
                if (r2.BDH(str2) != AnonymousClass0GD.CANCELLED) {
                    r2.BnQ(AnonymousClass0GD.FAILED, str2);
                }
                linkedList.addAll(this.A07.B6v(str2));
            }
            this.A09.Bmn(((C01400Ao) this.A02).A00, str);
            workDatabase.A0B();
        } finally {
            workDatabase.A0C();
            A07(false);
        }
    }

    public final void A05() {
        boolean z;
        C17060uV r0 = this.A09;
        String str = this.A0G;
        AnonymousClass0GD BDH = r0.BDH(str);
        AnonymousClass0GD r4 = AnonymousClass0GD.RUNNING;
        C06240Wu A002 = C06240Wu.A00();
        String str2 = A0I;
        StringBuilder A0m = AnonymousClass000.A0m("Status for ", str);
        if (BDH == r4) {
            C06240Wu.A03(A002, " is RUNNING; not doing any work and rescheduling for later execution", str2, A0m);
            z = true;
        } else {
            A0m.append(" is ");
            A0m.append(BDH);
            C06240Wu.A03(A002, " ; not doing any work", str2, A0m);
            z = false;
        }
        A07(z);
    }

    /* JADX INFO: finally extract failed */
    public final void A06() {
        String str;
        StringBuilder A0o;
        String str2;
        AnonymousClass0Xq A032;
        byte[] bArr;
        boolean z;
        AnonymousClass0R5 r6;
        AnonymousClass0QE r5;
        C17320vK A002;
        if (!A08()) {
            WorkDatabase workDatabase = this.A05;
            workDatabase.A0A();
            try {
                C06250Wv r1 = this.A08;
                AnonymousClass0GD r0 = r1.A0E;
                AnonymousClass0GD r62 = AnonymousClass0GD.ENQUEUED;
                if (r0 != r62) {
                    A05();
                    workDatabase.A0B();
                    C06240Wu A003 = C06240Wu.A00();
                    String str3 = A0I;
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append(r1.A0G);
                    C06240Wu.A03(A003, " is not in ENQUEUED state. Nothing more to do", str3, A0o2);
                } else if ((r1.A05 != 0 || r1.A01 > 0) && System.currentTimeMillis() < r1.A02()) {
                    C06240Wu.A00().A04(A0I, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{r1.A0G}));
                    A07(true);
                    workDatabase.A0B();
                } else {
                    workDatabase.A0B();
                    workDatabase.A0C();
                    if (r1.A05 != 0) {
                        A032 = r1.A0B;
                    } else {
                        String str4 = r1.A0F;
                        try {
                            AnonymousClass0TT r10 = (AnonymousClass0TT) AnonymousClass001.A0h(Class.forName(str4));
                            if (r10 != null) {
                                ArrayList A0s = AnonymousClass001.A0s();
                                A0s.add(r1.A0B);
                                C17060uV r7 = this.A09;
                                String str5 = this.A0G;
                                C08700eu A004 = C02920Ic.A00("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
                                A004.Axu(1, str5);
                                AnonymousClass0R5 r02 = ((C09140fi) r7).A02;
                                r02.A09();
                                Cursor A005 = C02930Id.A00(r02, A004, false);
                                try {
                                    ArrayList A0o3 = AnonymousClass000.A0o(A005);
                                    while (A005.moveToNext()) {
                                        if (A005.isNull(0)) {
                                            bArr = null;
                                        } else {
                                            bArr = A005.getBlob(0);
                                        }
                                        A0o3.add(AnonymousClass0Xq.A00(bArr));
                                    }
                                    A005.close();
                                    A004.A01();
                                    A0s.addAll(A0o3);
                                    A032 = r10.A03(A0s);
                                } catch (Throwable th) {
                                    A005.close();
                                    A004.A01();
                                    throw th;
                                }
                            }
                        } catch (Exception e) {
                            C06240Wu.A00();
                            Log.e(AnonymousClass0TT.A00, AnonymousClass000.A0V("Trouble instantiating + ", str4, AnonymousClass001.A0o()), e);
                        }
                        C06240Wu.A00();
                        str = A0I;
                        A0o = AnonymousClass001.A0o();
                        A0o.append("Could not create Input Merger ");
                        str2 = r1.A0F;
                        AnonymousClass000.A1D(str2, str, A0o);
                        A04();
                        return;
                    }
                    String str6 = this.A0G;
                    UUID fromString = UUID.fromString(str6);
                    List list = this.A0E;
                    C03790Lo r13 = this.A04;
                    int i = r1.A01;
                    C04320Nt r72 = this.A01;
                    Executor executor = r72.A05;
                    C16180sb r14 = this.A0B;
                    C05500Tp r12 = r72.A04;
                    WorkerParameters workerParameters = new WorkerParameters(A032, new C08950fP(workDatabase, this.A06, r14), new C08970fR(workDatabase, r14), r12, r13, r14, list, fromString, executor, i);
                    AnonymousClass0QH r73 = this.A03;
                    if (r73 == null) {
                        Context context = this.A00;
                        str2 = r1.A0G;
                        r73 = r12.A00(context, workerParameters, str2);
                        this.A03 = r73;
                        if (r73 == null) {
                            C06240Wu.A00();
                            str = A0I;
                            A0o = AnonymousClass001.A0o();
                            A0o.append("Could not create Worker ");
                            AnonymousClass000.A1D(str2, str, A0o);
                            A04();
                            return;
                        }
                    }
                    if (r73.A02) {
                        C06240Wu.A00();
                        str = A0I;
                        A0o = AnonymousClass001.A0o();
                        A0o.append("Received an already-used Worker ");
                        A0o.append(r1.A0G);
                        str2 = "; Worker Factory should return new instances";
                        AnonymousClass000.A1D(str2, str, A0o);
                        A04();
                        return;
                    }
                    r73.A02 = true;
                    workDatabase.A0A();
                    C17060uV r52 = this.A09;
                    if (r52.BDH(str6) == r62) {
                        r52.BnQ(AnonymousClass0GD.RUNNING, str6);
                        C09140fi r53 = (C09140fi) r52;
                        r6 = r53.A02;
                        r6.A09();
                        r5 = r53.A06;
                        A002 = AnonymousClass0QE.A00(r6, r5, str6);
                        AnonymousClass0A6.A00(r6, A002);
                        r6.A0C();
                        r5.A04(A002);
                        z = true;
                    } else {
                        z = false;
                    }
                    workDatabase.A0B();
                    workDatabase.A0C();
                    if (!z) {
                        A05();
                        return;
                    } else if (!A08()) {
                        C13350n2 r3 = new C13350n2(this.A00, workerParameters.A02, this.A03, r1, r14);
                        C09160fk r142 = (C09160fk) r14;
                        Executor executor2 = r142.A02;
                        executor2.execute(r3);
                        C188268yc A022 = r3.A02();
                        AnonymousClass0BT r32 = this.A0F;
                        r32.AwV(new C12020kq(this, A022), new C13630nU());
                        A022.AwV(new C12030kr(this, A022), executor2);
                        r32.AwV(new C12040ks(this, this.A0C), r142.A01);
                        return;
                    } else {
                        return;
                    }
                }
                workDatabase.A0C();
            } catch (Throwable th2) {
                workDatabase.A0C();
                throw th2;
            }
        }
    }

    public final void A07(boolean z) {
        Map map;
        boolean containsKey;
        WorkDatabase workDatabase = this.A05;
        workDatabase.A0A();
        boolean z2 = false;
        C08700eu A002 = C02920Ic.A00("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        AnonymousClass0R5 r0 = ((C09140fi) workDatabase.A0J()).A02;
        r0.A09();
        Cursor A003 = C02930Id.A00(r0, A002, false);
        try {
            if (A003.moveToFirst() && A003.getInt(0) != 0) {
                z2 = true;
            }
            A003.close();
            A002.A01();
            if (!z2) {
                AnonymousClass0SG.A00(this.A00, RescheduleReceiver.class, false);
            }
            if (z) {
                C17060uV r3 = this.A09;
                AnonymousClass0GD r02 = AnonymousClass0GD.ENQUEUED;
                String str = this.A0G;
                r3.BnQ(r02, str);
                r3.BKZ(str, -1);
            }
            if (this.A03 != null) {
                C15380rF r4 = this.A06;
                String str2 = this.A0G;
                C09020fW r42 = (C09020fW) r4;
                Object obj = r42.A0A;
                synchronized (obj) {
                    try {
                        map = r42.A07;
                        containsKey = map.containsKey(str2);
                    } catch (Throwable th) {
                        while (true) {
                            th = th;
                            break;
                        }
                    }
                }
                if (containsKey) {
                    synchronized (obj) {
                        try {
                            map.remove(str2);
                            r42.A01();
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                }
            }
            workDatabase.A0B();
            workDatabase.A0C();
            this.A0A.A09(Boolean.valueOf(z));
        } catch (Throwable th3) {
            workDatabase.A0C();
            throw th3;
        }
    }

    public final boolean A08() {
        if (!this.A0H) {
            return false;
        }
        C06240Wu A002 = C06240Wu.A00();
        String str = A0I;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Work interrupted for ");
        C06240Wu.A03(A002, this.A0C, str, A0o);
        AnonymousClass0GD BDH = this.A09.BDH(this.A0G);
        if (BDH == null) {
            A07(false);
            return true;
        }
        A07(!BDH.A00());
        return true;
    }

    public void run() {
        List list = this.A0E;
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.A0G);
        sb.append(", tags={ ");
        Iterator it = list.iterator();
        boolean z = true;
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            if (z) {
                z = false;
            } else {
                AnonymousClass001.A1M(sb);
            }
            sb.append(A0m);
        }
        this.A0C = AnonymousClass000.A0X(" } ]", sb);
        A06();
    }

    public C13340n1(C03980Mh r2) {
        this.A00 = r2.A00;
        this.A0B = r2.A06;
        this.A06 = r2.A04;
        C06250Wv r0 = r2.A05;
        this.A08 = r0;
        this.A0G = r0.A0J;
        this.A0D = r2.A07;
        this.A04 = r2.A02;
        this.A03 = null;
        this.A01 = r2.A01;
        WorkDatabase workDatabase = r2.A03;
        this.A05 = workDatabase;
        this.A09 = workDatabase.A0J();
        this.A07 = this.A05.A0E();
        this.A0E = r2.A08;
    }

    /* JADX INFO: finally extract failed */
    public void A03() {
        boolean z;
        boolean z2;
        C08700eu A012;
        Cursor A002;
        if (!A08()) {
            WorkDatabase workDatabase = this.A05;
            workDatabase.A0A();
            try {
                C17060uV r5 = this.A09;
                String str = this.A0G;
                AnonymousClass0GD BDH = r5.BDH(str);
                C09130fh r0 = (C09130fh) workDatabase.A0I();
                AnonymousClass0R5 r6 = r0.A01;
                r6.A09();
                AnonymousClass0QE r2 = r0.A02;
                C17320vK A003 = AnonymousClass0QE.A00(r6, r2, str);
                try {
                    AnonymousClass0A6.A00(r6, A003);
                    r6.A0C();
                    r2.A04(A003);
                    if (BDH == null) {
                        A07(false);
                    } else {
                        if (BDH == AnonymousClass0GD.RUNNING) {
                            C03070Is r1 = this.A02;
                            if (r1 instanceof C01410Ap) {
                                C06240Wu.A00();
                                String str2 = A0I;
                                StringBuilder A0o = AnonymousClass001.A0o();
                                A0o.append("Worker result SUCCESS for ");
                                Log.i(str2, AnonymousClass000.A0X(this.A0C, A0o));
                                if (this.A08.A05 == 0) {
                                    workDatabase.A0A();
                                    z2 = false;
                                    try {
                                        r5.BnQ(AnonymousClass0GD.SUCCEEDED, str);
                                        r5.Bmn(((C01410Ap) this.A02).A00, str);
                                        long currentTimeMillis = System.currentTimeMillis();
                                        C16160sZ r8 = this.A07;
                                        Iterator it = r8.B6v(str).iterator();
                                        while (it.hasNext()) {
                                            String A0m = AnonymousClass001.A0m(it);
                                            if (r5.BDH(A0m) == AnonymousClass0GD.BLOCKED) {
                                                boolean z3 = true;
                                                A012 = C02920Ic.A01("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", A0m);
                                                AnonymousClass0R5 r02 = ((C09090fd) r8).A01;
                                                r02.A09();
                                                boolean z4 = false;
                                                A002 = C02930Id.A00(r02, A012, false);
                                                if (A002.moveToFirst()) {
                                                    if (A002.getInt(0) == 0) {
                                                        z3 = false;
                                                    }
                                                    z4 = z3;
                                                }
                                                A002.close();
                                                A012.A01();
                                                if (z4) {
                                                    C06240Wu.A00();
                                                    Log.i(str2, AnonymousClass000.A0V("Setting status to enqueued for ", A0m, AnonymousClass001.A0o()));
                                                    r5.BnQ(AnonymousClass0GD.ENQUEUED, A0m);
                                                    r5.BmU(A0m, currentTimeMillis);
                                                }
                                            }
                                        }
                                        workDatabase.A0B();
                                        workDatabase.A0C();
                                        A07(z2);
                                    } catch (Throwable th) {
                                        th = th;
                                        workDatabase.A0C();
                                        A07(z);
                                        throw th;
                                    }
                                }
                            } else {
                                boolean z5 = r1 instanceof C01390An;
                                C06240Wu.A00();
                                String str3 = A0I;
                                if (z5) {
                                    StringBuilder A0o2 = AnonymousClass001.A0o();
                                    A0o2.append("Worker result RETRY for ");
                                    Log.i(str3, AnonymousClass000.A0X(this.A0C, A0o2));
                                } else {
                                    StringBuilder A0o3 = AnonymousClass001.A0o();
                                    A0o3.append("Worker result FAILURE for ");
                                    Log.i(str3, AnonymousClass000.A0X(this.A0C, A0o3));
                                    if (this.A08.A05 == 0) {
                                        A04();
                                    }
                                }
                            }
                            workDatabase.A0A();
                            z2 = false;
                            r5.BmU(str, System.currentTimeMillis());
                            r5.BnQ(AnonymousClass0GD.ENQUEUED, str);
                            C09140fi r03 = (C09140fi) r5;
                            AnonymousClass0R5 r62 = r03.A02;
                            r62.A09();
                            AnonymousClass0QE r22 = r03.A0A;
                            C17320vK A004 = AnonymousClass0QE.A00(r62, r22, str);
                            try {
                                AnonymousClass0A6.A00(r62, A004);
                                r62.A0C();
                                r22.A04(A004);
                                r62.A09();
                                r22 = r03.A05;
                                A004 = AnonymousClass0QE.A00(r62, r22, str);
                                AnonymousClass0A6.A00(r62, A004);
                                r62.A0C();
                                r22.A04(A004);
                                r5.BKZ(str, -1);
                                workDatabase.A0B();
                                workDatabase.A0C();
                                A07(z2);
                            } catch (Throwable th2) {
                                th = th2;
                                r62.A0C();
                                r22.A04(A004);
                                throw th;
                            }
                        } else if (!BDH.A00()) {
                        }
                        workDatabase.A0A();
                        r5.BnQ(AnonymousClass0GD.ENQUEUED, str);
                        r5.BmU(str, System.currentTimeMillis());
                        r5.BKZ(str, -1);
                        workDatabase.A0B();
                        workDatabase.A0C();
                        A07(true);
                    }
                    workDatabase.A0B();
                    workDatabase.A0C();
                } catch (Throwable th3) {
                    th = th3;
                    r6.A0C();
                    r2.A04(A003);
                    throw th;
                }
            } catch (Throwable th4) {
                workDatabase.A0C();
                throw th4;
            }
        }
        List<C16880uB> list = this.A0D;
        if (list != null) {
            for (C16880uB AyW : list) {
                AyW.AyW(this.A0G);
            }
            AnonymousClass0VJ.A01(this.A01, this.A05, list);
        }
    }
}
