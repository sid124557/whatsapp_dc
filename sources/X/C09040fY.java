package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.PersistableBundle;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.0fY  reason: invalid class name and case insensitive filesystem */
public class C09040fY implements C16880uB {
    public static final String A04 = C06240Wu.A01("SystemJobScheduler");
    public final JobScheduler A00;
    public final Context A01;
    public final C06310Xb A02;
    public final C05940Vo A03;

    public static List A00(JobScheduler jobScheduler, Context context) {
        List<JobInfo> list;
        ArrayList arrayList = null;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            C06240Wu.A00();
            Log.e(A04, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list != null) {
            arrayList = AnonymousClass000.A0p(list);
            ComponentName componentName = new ComponentName(context, SystemJobService.class);
            for (JobInfo next : list) {
                if (componentName.equals(next.getService())) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    public C09040fY(Context context, C06310Xb r4) {
        C05940Vo r0 = new C05940Vo(context);
        this.A01 = context;
        this.A02 = r4;
        this.A00 = (JobScheduler) context.getSystemService("jobscheduler");
        this.A03 = r0;
    }

    public static void A03(Context context) {
        List<JobInfo> A002;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (A002 = A00(jobScheduler, context)) != null && !A002.isEmpty()) {
            for (JobInfo id : A002) {
                A02(jobScheduler, id.getId());
            }
        }
    }

    public static boolean A04(Context context, C06310Xb r10) {
        int i;
        String str;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> A002 = A00(jobScheduler, context);
        WorkDatabase workDatabase = r10.A04;
        boolean z = false;
        C08700eu A003 = C02920Ic.A00("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        AnonymousClass0R5 r0 = ((C09110ff) workDatabase.A0G()).A01;
        r0.A09();
        Cursor A004 = C02930Id.A00(r0, A003, false);
        try {
            ArrayList A0o = AnonymousClass000.A0o(A004);
            while (A004.moveToNext()) {
                if (A004.isNull(0)) {
                    str = null;
                } else {
                    str = A004.getString(0);
                }
                A0o.add(str);
            }
            if (A002 != null) {
                i = A002.size();
            } else {
                i = 0;
            }
            HashSet hashSet = new HashSet(i);
            if (A002 != null && !A002.isEmpty()) {
                for (JobInfo jobInfo : A002) {
                    PersistableBundle extras = jobInfo.getExtras();
                    if (extras != null) {
                        try {
                            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                                hashSet.add(new AnonymousClass0PL(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0)).A01);
                            }
                        } catch (NullPointerException unused) {
                        }
                    }
                    A02(jobScheduler, jobInfo.getId());
                }
            }
            Iterator it = A0o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!hashSet.contains(it.next())) {
                    C06240Wu.A00().A04(A04, "Reconciling jobs");
                    z = true;
                    workDatabase.A0A();
                    try {
                        C17060uV A0J = workDatabase.A0J();
                        Iterator it2 = A0o.iterator();
                        while (it2.hasNext()) {
                            A0J.BKZ(AnonymousClass001.A0m(it2), -1);
                        }
                        workDatabase.A0B();
                    } finally {
                        workDatabase.A0C();
                    }
                }
            }
            return z;
        } finally {
            A004.close();
            A003.A01();
        }
    }

    public void A05(C06250Wv r9, int i) {
        int i2;
        JobInfo A012 = this.A03.A01(r9, i);
        C06240Wu A002 = C06240Wu.A00();
        String str = A04;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Scheduling work ID ");
        String str2 = r9.A0J;
        A0o.append(str2);
        A002.A04(str, AnonymousClass000.A0Y("Job ID ", A0o, i));
        try {
            if (this.A00.schedule(A012) == 0) {
                C06240Wu.A00();
                Log.w(str, AnonymousClass000.A0V("Unable to schedule work ID ", str2, AnonymousClass001.A0o()));
                if (r9.A0H && r9.A0D == AnonymousClass0FO.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    r9.A0H = false;
                    C06240Wu.A00().A04(str, String.format("Scheduling a non-expedited job (work ID %s)", new Object[]{str2}));
                    A05(r9, i);
                }
            }
        } catch (IllegalStateException e) {
            List A003 = A00(this.A00, this.A01);
            if (A003 != null) {
                i2 = A003.size();
            } else {
                i2 = 0;
            }
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[3];
            AnonymousClass000.A1P(objArr, i2, 0);
            C06310Xb r1 = this.A02;
            AnonymousClass000.A1P(objArr, r1.A04.A0J().BCT().size(), 1);
            AnonymousClass000.A1N(objArr, r1.A02.A00());
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", objArr);
            C06240Wu.A00();
            Log.e(str, format);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            C06240Wu.A00();
            Log.e(str, AnonymousClass000.A0P(r9, "Unable to schedule ", AnonymousClass001.A0o()), th);
        }
    }

    public void AyW(String str) {
        Context context = this.A01;
        JobScheduler jobScheduler = this.A00;
        List<Object> A012 = A01(jobScheduler, context, str);
        if (A012 != null && !A012.isEmpty()) {
            for (Object A0K : A012) {
                A02(jobScheduler, AnonymousClass001.A0K(A0K));
            }
            C09110ff r0 = (C09110ff) this.A02.A04.A0G();
            AnonymousClass0R5 r3 = r0.A01;
            r3.A09();
            AnonymousClass0QE r2 = r0.A03;
            C17320vK A013 = r2.A01();
            if (str == null) {
                A013.Axt(1);
            } else {
                A013.Axu(1, str);
            }
            r3.A0A();
            try {
                AnonymousClass0A6.A00(r3, A013);
            } finally {
                r3.A0C();
                r2.A04(A013);
            }
        }
    }

    public boolean BFJ() {
        return true;
    }

    /* JADX INFO: finally extract failed */
    public void Bkm(C06250Wv... r14) {
        int A012;
        List A013;
        int A014;
        C06310Xb r8 = this.A02;
        WorkDatabase workDatabase = r8.A04;
        AnonymousClass0OB r6 = new AnonymousClass0OB(workDatabase);
        int length = r14.length;
        int i = 0;
        while (i < length) {
            C06250Wv r10 = r14[i];
            workDatabase.A0A();
            try {
                C17060uV A0J = workDatabase.A0J();
                String str = r10.A0J;
                C06250Wv BEX = A0J.BEX(str);
                if (BEX == null) {
                    C06240Wu.A00();
                    AnonymousClass000.A1F(" because it's no longer in the DB", A04, AnonymousClass000.A0m("Skipping scheduling ", str));
                } else if (BEX.A0E != AnonymousClass0GD.ENQUEUED) {
                    C06240Wu.A00();
                    AnonymousClass000.A1F(" because it is no longer enqueued", A04, AnonymousClass000.A0m("Skipping scheduling ", str));
                } else {
                    AnonymousClass0PL A002 = AnonymousClass0J0.A00(r10);
                    AnonymousClass0PX BDR = workDatabase.A0G().BDR(A002);
                    if (BDR != null) {
                        A012 = BDR.A01;
                    } else {
                        C04320Nt r0 = r8.A02;
                        A012 = r6.A01(r0.A02, r0.A01);
                        workDatabase.A0G().BGf(new AnonymousClass0PX(A002.A01, A002.A00, A012));
                    }
                    A05(r10, A012);
                    if (Build.VERSION.SDK_INT == 23 && (A013 = A01(this.A00, this.A01, str)) != null) {
                        int indexOf = A013.indexOf(Integer.valueOf(A012));
                        if (indexOf >= 0) {
                            A013.remove(indexOf);
                        }
                        if (!A013.isEmpty()) {
                            A014 = ((Integer) A013.get(0)).intValue();
                        } else {
                            C04320Nt r02 = r8.A02;
                            A014 = r6.A01(r02.A02, r02.A01);
                        }
                        A05(r10, A014);
                    }
                }
                workDatabase.A0B();
                workDatabase.A0C();
                i++;
            } catch (Throwable th) {
                workDatabase.A0C();
                throw th;
            }
        }
    }

    public static List A01(JobScheduler jobScheduler, Context context, String str) {
        AnonymousClass0PL r0;
        List<JobInfo> A002 = A00(jobScheduler, context);
        if (A002 == null) {
            return null;
        }
        ArrayList A0I = AnonymousClass002.A0I(2);
        for (JobInfo jobInfo : A002) {
            PersistableBundle extras = jobInfo.getExtras();
            if (extras != null) {
                try {
                    if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                        r0 = new AnonymousClass0PL(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
                        if (r0 != null && str.equals(r0.A01)) {
                            A0I.add(Integer.valueOf(jobInfo.getId()));
                        }
                    }
                } catch (NullPointerException unused) {
                }
            }
            r0 = null;
            A0I.add(Integer.valueOf(jobInfo.getId()));
        }
        return A0I;
    }

    public static void A02(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            C06240Wu.A00();
            String str = A04;
            Locale locale = Locale.getDefault();
            Object[] A0L = AnonymousClass002.A0L();
            AnonymousClass000.A1P(A0L, i, 0);
            Log.e(str, String.format(locale, "Exception while trying to cancel job (%d)", A0L), th);
        }
    }
}
