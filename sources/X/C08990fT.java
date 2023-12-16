package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0fT  reason: invalid class name and case insensitive filesystem */
public class C08990fT implements C16140sX {
    public static final String A04 = C06240Wu.A01("CommandHandler");
    public final Context A00;
    public final AnonymousClass0QD A01;
    public final Object A02 = AnonymousClass002.A0D();
    public final Map A03 = AnonymousClass001.A0t();

    public static void A00(Intent intent, AnonymousClass0PL r3) {
        intent.putExtra("KEY_WORKSPEC_ID", r3.A01);
        intent.putExtra("KEY_WORKSPEC_GENERATION", r3.A00);
    }

    public void BSX(AnonymousClass0PL r8, boolean z) {
        synchronized (this.A02) {
            C09070fb r5 = (C09070fb) this.A03.remove(r8);
            this.A01.A00(r8);
            if (r5 != null) {
                C06240Wu A002 = C06240Wu.A00();
                String str = C09070fb.A0C;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("onExecuted ");
                AnonymousClass0PL r2 = r5.A08;
                A0o.append(r2);
                A002.A04(str, AnonymousClass000.A0b(", ", A0o, z));
                r5.A00();
                if (z) {
                    Intent intent = new Intent(r5.A04, SystemAlarmService.class);
                    intent.setAction("ACTION_SCHEDULE_WORK");
                    A00(intent, r2);
                    C12710lz.A00(intent, r5.A06, r5.A0A, r5.A03);
                }
                if (r5.A02) {
                    Intent intent2 = new Intent(r5.A04, SystemAlarmService.class);
                    intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
                    C12710lz.A00(intent2, r5.A06, r5.A0A, r5.A03);
                }
            }
        }
    }

    public C08990fT(Context context, AnonymousClass0QD r3) {
        this.A00 = context;
        this.A01 = r3;
    }

    public void A01(Intent intent, C09000fU r13, int i) {
        List<C03440Kd> list;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            C06240Wu.A02(C06240Wu.A00(), intent, "Handling constraints changed ", A04, AnonymousClass001.A0o());
            Context context = this.A00;
            C06310Xb r1 = r13.A05;
            C09080fc r5 = new C09080fc((C16740tt) null, r1.A09);
            List<C06250Wv> BCT = r1.A04.A0J().BCT();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            for (C06250Wv r0 : BCT) {
                AnonymousClass0XS r12 = r0.A0A;
                z |= r12.A04;
                z2 |= r12.A05;
                z3 |= r12.A07;
                boolean z5 = false;
                if (r12.A02 != C02380Fy.NOT_REQUIRED) {
                    z5 = true;
                }
                z4 |= z5;
                if (z && z2 && z3 && z4) {
                    break;
                }
            }
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(intent2);
            r5.BjY(BCT);
            ArrayList A0p = AnonymousClass000.A0p(BCT);
            long currentTimeMillis = System.currentTimeMillis();
            for (C06250Wv r4 : BCT) {
                String str = r4.A0J;
                if (currentTimeMillis >= r4.A02() && (!r4.A05() || r5.A00(str))) {
                    A0p.add(r4);
                }
            }
            Iterator it = A0p.iterator();
            while (it.hasNext()) {
                C06250Wv r02 = (C06250Wv) it.next();
                String str2 = r02.A0J;
                AnonymousClass0PL A002 = AnonymousClass0J0.A00(r02);
                Intent intent3 = new Intent(context, SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                A00(intent3, A002);
                C06240Wu A003 = C06240Wu.A00();
                String str3 = C03180Jd.A00;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Creating a delay_met command for workSpec with id (");
                A0o.append(str2);
                C06240Wu.A03(A003, ")", str3, A0o);
                C12710lz.A00(intent3, r13, ((C09160fk) r13.A08).A02, i);
            }
            r5.reset();
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            C06240Wu A004 = C06240Wu.A00();
            String str4 = A04;
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("Handling reschedule ");
            A0o2.append(intent);
            A004.A04(str4, AnonymousClass000.A0Y(", ", A0o2, i));
            r13.A05.A06();
        } else {
            Bundle extras = intent.getExtras();
            String[] strArr = {"KEY_WORKSPEC_ID"};
            if (extras != null && !extras.isEmpty()) {
                int length = strArr.length;
                int i2 = 0;
                while (i2 < length) {
                    if (extras.get(strArr[i2]) != null) {
                        i2++;
                    }
                }
                if ("ACTION_SCHEDULE_WORK".equals(action)) {
                    AnonymousClass0PL r6 = new AnonymousClass0PL(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
                    C06240Wu A005 = C06240Wu.A00();
                    String str5 = A04;
                    C06240Wu.A02(A005, r6, "Handling schedule work for ", str5, AnonymousClass001.A0o());
                    WorkDatabase workDatabase = r13.A05.A04;
                    workDatabase.A0A();
                    try {
                        C06250Wv BEX = workDatabase.A0J().BEX(r6.A01);
                        if (BEX == null) {
                            C06240Wu.A00();
                            AnonymousClass000.A1F(" because it's no longer in the DB", str5, AnonymousClass000.A0k(r6, "Skipping scheduling "));
                        } else if (BEX.A0E.A00()) {
                            C06240Wu.A00();
                            AnonymousClass000.A1F("because it is finished.", str5, AnonymousClass000.A0k(r6, "Skipping scheduling "));
                        } else {
                            long A022 = BEX.A02();
                            if (!BEX.A05()) {
                                C06240Wu A006 = C06240Wu.A00();
                                StringBuilder A0o3 = AnonymousClass001.A0o();
                                A0o3.append("Setting up Alarms for ");
                                A0o3.append(r6);
                                A006.A04(str5, AnonymousClass000.A0Z("at ", A0o3, A022));
                                C06090Wf.A00(this.A00, workDatabase, r6, A022);
                            } else {
                                C06240Wu A007 = C06240Wu.A00();
                                StringBuilder A0o4 = AnonymousClass001.A0o();
                                A0o4.append("Opportunistically setting an alarm for ");
                                A0o4.append(r6);
                                A007.A04(str5, AnonymousClass000.A0Z("at ", A0o4, A022));
                                Context context2 = this.A00;
                                C06090Wf.A00(context2, workDatabase, r6, A022);
                                Intent intent4 = new Intent(context2, SystemAlarmService.class);
                                intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                                C12710lz.A00(intent4, r13, ((C09160fk) r13.A08).A02, i);
                            }
                            workDatabase.A0B();
                        }
                        return;
                    } finally {
                        workDatabase.A0C();
                    }
                } else if ("ACTION_DELAY_MET".equals(action)) {
                    synchronized (this.A02) {
                        AnonymousClass0PL r42 = new AnonymousClass0PL(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
                        C06240Wu A008 = C06240Wu.A00();
                        String str6 = A04;
                        C06240Wu.A02(A008, r42, "Handing delay met for ", str6, AnonymousClass001.A0o());
                        Map map = this.A03;
                        if (!map.containsKey(r42)) {
                            C09070fb r52 = new C09070fb(this.A00, this.A01.A01(r42), r13, i);
                            map.put(r42, r52);
                            String str7 = r52.A08.A01;
                            Context context3 = r52.A04;
                            StringBuilder A0l = AnonymousClass000.A0l(str7);
                            A0l.append(" (");
                            A0l.append(r52.A03);
                            r52.A01 = AnonymousClass0SH.A00(context3, AnonymousClass000.A0e(A0l));
                            C06240Wu A009 = C06240Wu.A00();
                            String str8 = C09070fb.A0C;
                            StringBuilder A0o5 = AnonymousClass001.A0o();
                            A0o5.append("Acquiring wakelock ");
                            A0o5.append(r52.A01);
                            A0o5.append("for WorkSpec ");
                            C06240Wu.A03(A009, str7, str8, A0o5);
                            r52.A01.acquire();
                            C06250Wv BEX2 = r52.A06.A05.A04.A0J().BEX(str7);
                            if (BEX2 == null) {
                                r52.A0B.execute(new C11130j9(r52));
                            } else {
                                boolean A05 = BEX2.A05();
                                r52.A02 = A05;
                                if (!A05) {
                                    C06240Wu A0010 = C06240Wu.A00();
                                    StringBuilder A0o6 = AnonymousClass001.A0o();
                                    A0o6.append("No constraints for ");
                                    C06240Wu.A03(A0010, str7, str8, A0o6);
                                    r52.BML(Collections.singletonList(BEX2));
                                } else {
                                    r52.A07.BjY(Collections.singletonList(BEX2));
                                }
                            }
                        } else {
                            C06240Wu A0011 = C06240Wu.A00();
                            StringBuilder A0o7 = AnonymousClass001.A0o();
                            A0o7.append("WorkSpec ");
                            A0o7.append(r42);
                            C06240Wu.A03(A0011, " is is already being handled for ACTION_DELAY_MET", str6, A0o7);
                        }
                    }
                    return;
                } else if ("ACTION_STOP_WORK".equals(action)) {
                    Bundle extras2 = intent.getExtras();
                    String string = extras2.getString("KEY_WORKSPEC_ID");
                    if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
                        int i3 = extras2.getInt("KEY_WORKSPEC_GENERATION");
                        ArrayList A0I = AnonymousClass002.A0I(1);
                        C03440Kd A0012 = this.A01.A00(new AnonymousClass0PL(string, i3));
                        list = A0I;
                        if (A0012 != null) {
                            A0I.add(A0012);
                            list = A0I;
                        }
                    } else {
                        list = this.A01.A02(string);
                    }
                    for (C03440Kd r43 : list) {
                        C06240Wu A0013 = C06240Wu.A00();
                        String str9 = A04;
                        StringBuilder A0o8 = AnonymousClass001.A0o();
                        A0o8.append("Handing stopWork work for ");
                        C06240Wu.A03(A0013, string, str9, A0o8);
                        C06310Xb r03 = r13.A05;
                        r03.A09(r43);
                        Context context4 = this.A00;
                        WorkDatabase workDatabase2 = r03.A04;
                        AnonymousClass0PL r7 = r43.A00;
                        C16770tw A0G = workDatabase2.A0G();
                        AnonymousClass0PX BDR = A0G.BDR(r7);
                        if (BDR != null) {
                            C06090Wf.A01(context4, r7, BDR.A01);
                            C06240Wu A0014 = C06240Wu.A00();
                            String str10 = C06090Wf.A00;
                            StringBuilder A0o9 = AnonymousClass001.A0o();
                            A0o9.append("Removing SystemIdInfo for workSpecId (");
                            A0o9.append(r7);
                            C06240Wu.A03(A0014, ")", str10, A0o9);
                            String str11 = r7.A01;
                            int i4 = r7.A00;
                            C09110ff r44 = (C09110ff) A0G;
                            AnonymousClass0R5 r53 = r44.A01;
                            r53.A09();
                            AnonymousClass0QE r45 = r44.A02;
                            C17320vK A012 = r45.A01();
                            A012.Axu(1, str11);
                            A012.Axs(2, (long) i4);
                            r53.A0A();
                            try {
                                AnonymousClass0A6.A00(r53, A012);
                            } finally {
                                r53.A0C();
                                r45.A04(A012);
                            }
                        }
                        r13.BSX(r7, false);
                    }
                    return;
                } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                    AnonymousClass0PL r54 = new AnonymousClass0PL(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
                    boolean z6 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                    C06240Wu A0015 = C06240Wu.A00();
                    String str12 = A04;
                    StringBuilder A0o10 = AnonymousClass001.A0o();
                    A0o10.append("Handling onExecutionCompleted ");
                    A0o10.append(intent);
                    A0015.A04(str12, AnonymousClass000.A0Y(", ", A0o10, i));
                    BSX(r54, z6);
                    return;
                } else {
                    C06240Wu.A00();
                    Log.w(A04, AnonymousClass000.A0P(intent, "Ignoring intent ", AnonymousClass001.A0o()));
                    return;
                }
            }
            C06240Wu.A00();
            String str13 = A04;
            StringBuilder A0o11 = AnonymousClass001.A0o();
            A0o11.append("Invalid request for ");
            A0o11.append(action);
            A0o11.append(" , requires ");
            A0o11.append("KEY_WORKSPEC_ID");
            AnonymousClass000.A1D(" .", str13, A0o11);
        }
    }
}
