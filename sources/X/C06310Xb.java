package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import com.whatsapp.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.0Xb  reason: invalid class name and case insensitive filesystem */
public class C06310Xb {
    public static C06310Xb A0B;
    public static C06310Xb A0C;
    public static final Object A0D = AnonymousClass002.A0D();
    public BroadcastReceiver.PendingResult A00;
    public Context A01;
    public C04320Nt A02;
    public C09020fW A03;
    public WorkDatabase A04;
    public C03450Ke A05;
    public C16180sb A06;
    public List A07;
    public boolean A08;
    public final AnonymousClass0TH A09;
    public volatile AnonymousClass0GY A0A;

    public C06310Xb(Context context, C04320Nt r12, C16180sb r13) {
        Context context2 = context;
        C16180sb r8 = r13;
        WorkDatabase A002 = A00(context.getApplicationContext(), ((C09160fk) r8).A01, context.getResources().getBoolean(R.bool.f4nameremoved));
        Context applicationContext = context.getApplicationContext();
        C04320Nt r6 = r12;
        C06240Wu r0 = new C06240Wu(r12.A00);
        synchronized (C06240Wu.A01) {
            C06240Wu.A02 = r0;
        }
        AnonymousClass0TH r3 = new AnonymousClass0TH(applicationContext, r13);
        this.A09 = r3;
        List asList = Arrays.asList(new C16880uB[]{AnonymousClass0VJ.A00(applicationContext, this), new C09050fZ(applicationContext, r12, this, r3)});
        C09020fW r4 = new C09020fW(context2, r6, A002, r8, asList);
        Context applicationContext2 = context.getApplicationContext();
        this.A01 = applicationContext2;
        this.A02 = r12;
        this.A06 = r13;
        this.A04 = A002;
        this.A07 = asList;
        this.A03 = r4;
        this.A05 = new C03450Ke(A002);
        this.A08 = false;
        if (Build.VERSION.SDK_INT < 24 || !C03100Iv.A00(applicationContext2)) {
            this.A06.B2t(new C13300mx(applicationContext2, this));
            return;
        }
        throw AnonymousClass001.A0e("Cannot initialize WorkManager in direct boot mode");
    }

    public static final WorkDatabase A00(Context context, Executor executor, boolean z) {
        C04490Om A002;
        C162457s7.A0J(context, 0);
        C162457s7.A0J(executor, 1);
        if (z) {
            A002 = new C04490Om(context, (String) null);
            A002.A08 = true;
        } else {
            A002 = AnonymousClass0S0.A00(context);
            A002.A01 = new C08650ep(context);
        }
        A002.A05 = executor;
        A002.A0D.add(AnonymousClass0SF.A00);
        AnonymousClass0NF[] A022 = A02(A002, C012609x.A00, A02(A002, AnonymousClass09w.A00, A02(A002, new C012509u(context, 10, 11), A02(A002, new AnonymousClass09v(context), A02(A002, AnonymousClass0A4.A00, A02(A002, AnonymousClass0A3.A00, A02(A002, AnonymousClass0A2.A00, A02(A002, new C012509u(context, 5, 6), A02(A002, AnonymousClass0A1.A00, A02(A002, AnonymousClass0A0.A00, A02(A002, new C012509u(context, 2, 3), A02(A002, C012809z.A00, new AnonymousClass0NF[1]))))))))))));
        A022[0] = C012709y.A00;
        A002.A01(A022);
        A002.A09 = false;
        A002.A07 = true;
        return (WorkDatabase) A002.A00();
    }

    public static AnonymousClass0NF[] A02(C04490Om r2, Object obj, AnonymousClass0NF[] r4) {
        r4[0] = obj;
        r2.A01(r4);
        return new AnonymousClass0NF[1];
    }

    public void A0B(String str) {
        this.A06.B2t(new AnonymousClass0BQ(this, str, true));
    }

    static {
        C06240Wu.A01("WorkManagerImpl");
    }

    public static C06310Xb A01(Context context) {
        C06310Xb r0;
        synchronized (A0D) {
            try {
                r0 = A0C;
                if (r0 == null && (r0 = A0B) == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext instanceof C16120sV) {
                        C04320Nt workManagerConfiguration = ((C16120sV) applicationContext).getWorkManagerConfiguration();
                        if (A0C == null) {
                            Context applicationContext2 = applicationContext.getApplicationContext();
                            C06310Xb r1 = A0B;
                            if (r1 == null) {
                                r1 = new C06310Xb(applicationContext2, workManagerConfiguration, new C09160fk(workManagerConfiguration.A06));
                                A0B = r1;
                            }
                            A0C = r1;
                        } else if (A0B != null) {
                            throw AnonymousClass001.A0e("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                        }
                        r0 = A01(applicationContext);
                    } else {
                        th = AnonymousClass001.A0e("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                        throw th;
                    }
                }
            } catch (Throwable th) {
                th = th;
            }
        }
        return r0;
    }

    public C188268yc A04(String str) {
        C13260mt r1 = new C13260mt(this, str);
        ((C09160fk) this.A06).A01.execute(r1);
        return r1.A00();
    }

    public void A05() {
        synchronized (A0D) {
            this.A08 = true;
            BroadcastReceiver.PendingResult pendingResult = this.A00;
            if (pendingResult != null) {
                pendingResult.finish();
                this.A00 = null;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void A06() {
        if (Build.VERSION.SDK_INT >= 23) {
            C09040fY.A03(this.A01);
        }
        WorkDatabase workDatabase = this.A04;
        C09140fi r0 = (C09140fi) workDatabase.A0J();
        AnonymousClass0R5 r3 = r0.A02;
        r3.A09();
        AnonymousClass0QE r2 = r0.A09;
        C17320vK A012 = r2.A01();
        r3.A0A();
        try {
            AnonymousClass0A6.A00(r3, A012);
            r3.A0C();
            r2.A04(A012);
            AnonymousClass0VJ.A01(this.A02, workDatabase, this.A07);
        } catch (Throwable th) {
            r3.A0C();
            r2.A04(A012);
            throw th;
        }
    }

    public void A09(C03440Kd r4) {
        this.A06.B2t(new C13250ms(r4, this, false));
    }

    public void A0A(String str) {
        this.A06.B2t(new AnonymousClass0BP(this, str));
    }

    public final AnonymousClass0XO A03(C02320Fs r7, C01460Ay r8, String str) {
        List singletonList = Collections.singletonList(r8);
        if (!singletonList.isEmpty()) {
            return new AnonymousClass0XO(r7, this, str, singletonList, (List) null);
        }
        throw AnonymousClass001.A0c("beginUniqueWork needs at least one OneTimeWorkRequest.");
    }

    public void A07(C02320Fs r7, C01460Ay r8, String str) {
        C02320Fs r1 = r7;
        new AnonymousClass0XO(r1, this, str, Collections.singletonList(r8), (List) null).A02();
    }

    public final void A08(AnonymousClass0NS r7) {
        List singletonList = Collections.singletonList(r7);
        if (!singletonList.isEmpty()) {
            new AnonymousClass0XO(C02320Fs.KEEP, this, (String) null, singletonList, (List) null).A02();
            return;
        }
        throw AnonymousClass001.A0c("enqueue needs at least one WorkRequest.");
    }

    public C06310Xb() {
    }
}
