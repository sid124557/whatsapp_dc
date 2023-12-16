package X;

import android.content.SharedPreferences;
import android.os.Build;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Locale;

/* renamed from: X.2y3  reason: invalid class name and case insensitive filesystem */
public class C60132y3 {
    public final C29441ip A00;
    public final C56612sH A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass2YP A03;

    public static int A00(C50092hc r4) {
        if (r4 != null) {
            int i = r4.A00;
            if (r4.A04) {
                if (Build.VERSION.SDK_INT >= 29 && i == 20) {
                    return 3;
                }
                switch (i) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return 0;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                        return 1;
                    case 13:
                    case 15:
                        return 2;
                    default:
                        return 5;
                }
            } else if (r4.A06) {
                return 4;
            }
        }
        return 5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c1, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Float A01(int r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            X.1ip r0 = r9.A00     // Catch:{ all -> 0x00c2 }
            X.2hc r0 = r0.A0A()     // Catch:{ all -> 0x00c2 }
            int r7 = A00(r0)     // Catch:{ all -> 0x00c2 }
            X.2sH r0 = r9.A01     // Catch:{ all -> 0x00c2 }
            long r2 = X.C56612sH.A00(r0)     // Catch:{ all -> 0x00c2 }
            r0 = 60
            long r2 = r2 / r0
            long r2 = r2 / r0
            r0 = 24
            long r2 = r2 % r0
            int r8 = (int) r2     // Catch:{ all -> 0x00c2 }
            X.2YP r6 = r9.A03     // Catch:{ all -> 0x00c2 }
            java.util.List r0 = r6.A00(r10, r8, r7)     // Catch:{ all -> 0x00c2 }
            r1 = 10
            X.2xd r5 = new X.2xd     // Catch:{ all -> 0x00c2 }
            r5.<init>(r0)     // Catch:{ all -> 0x00c2 }
            java.util.List r4 = r5.A00     // Catch:{ all -> 0x00c2 }
            int r0 = r4.size()     // Catch:{ all -> 0x00c2 }
            r3 = 10
            boolean r0 = X.C18280x3.A1U(r0, r1)
            if (r0 != 0) goto L_0x00ad
            X.1VX r2 = r9.A02     // Catch:{ all -> 0x00c2 }
            r1 = 154(0x9a, float:2.16E-43)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x00c2 }
            boolean r0 = r2.A0Y(r0, r1)     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x00ad
            int r0 = r8 + 23
            int r0 = r0 % 24
            java.util.List r1 = r6.A00(r10, r0, r7)     // Catch:{ all -> 0x00c2 }
            int r0 = r8 + 1
            int r0 = r0 % 24
            java.util.List r0 = r6.A00(r10, r0, r7)     // Catch:{ all -> 0x00c2 }
            java.util.Iterator r6 = r1.iterator()     // Catch:{ all -> 0x00c2 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x00c2 }
            r1 = 0
        L_0x0059:
            int r0 = r4.size()     // Catch:{ all -> 0x00c2 }
            boolean r0 = X.C18280x3.A1U(r0, r3)
            if (r0 != 0) goto L_0x009a
            if (r1 != 0) goto L_0x0075
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x0075
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x00c2 }
            int r0 = X.AnonymousClass0x7.A05(r0)     // Catch:{ all -> 0x00c2 }
            r1 = 1
            goto L_0x0084
        L_0x0075:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x0088
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x00c2 }
            int r0 = X.AnonymousClass0x7.A05(r0)     // Catch:{ all -> 0x00c2 }
            r1 = 0
        L_0x0084:
            r5.A02(r0)     // Catch:{ all -> 0x00c2 }
            goto L_0x0059
        L_0x0088:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x0097
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x00c2 }
            int r0 = X.AnonymousClass0x7.A05(r0)     // Catch:{ all -> 0x00c2 }
            goto L_0x0084
        L_0x0097:
            monitor-exit(r9)
            r0 = 0
            return r0
        L_0x009a:
            int r0 = r4.size()     // Catch:{ all -> 0x00c2 }
            if (r0 < r3) goto L_0x00aa
            double r1 = X.C59872xd.A00(r4)     // Catch:{ all -> 0x00c2 }
            float r0 = (float) r1     // Catch:{ all -> 0x00c2 }
        L_0x00a5:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x00c2 }
            goto L_0x00c0
        L_0x00aa:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x00a5
        L_0x00ad:
            int r0 = r4.size()     // Catch:{ all -> 0x00c2 }
            if (r0 < r3) goto L_0x00bd
            double r1 = X.C59872xd.A00(r4)     // Catch:{ all -> 0x00c2 }
            float r0 = (float) r1     // Catch:{ all -> 0x00c2 }
        L_0x00b8:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x00c2 }
            goto L_0x00c0
        L_0x00bd:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x00b8
        L_0x00c0:
            monitor-exit(r9)
            return r0
        L_0x00c2:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60132y3.A01(int):java.lang.Float");
    }

    public synchronized void A02(C633138t r9, int i, long j, long j2) {
        SharedPreferences sharedPreferences;
        int A002 = A00(this.A00.A0A());
        int A003 = (int) (((C56612sH.A00(this.A01) / 60) / 60) % 24);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BandwidthManager/addMeasurement/transferredBytes = ");
        A0o.append(j);
        A0o.append(", networkTime = ");
        A0o.append(j2);
        A0o.append(", mmsType=");
        A0o.append(r9);
        A0o.append(", hourOfDay=");
        A0o.append(A003);
        A0o.append(", networkTypeGrouping=");
        A0o.append(A002);
        C18260x0.A0w(", requestType = ", A0o, i);
        if (A002 == 0 || A002 == 5 || (!(r9 == C633138t.A0C || r9 == C633138t.A0H || r9 == C633138t.A0j || r9 == C633138t.A0R) || j < 51200 || j2 < 100)) {
            Log.d("BandwidthManager/addMeasurement/ignore data");
        } else {
            AnonymousClass2YP r2 = this.A03;
            C59872xd r1 = new C59872xd(r2.A00(i, A003, A002));
            r1.A02((int) (((float) j) / ((float) j2)));
            List<Object> list = r1.A00;
            StringBuilder A0o2 = AnonymousClass001.A0o();
            for (Object A05 : list) {
                A0o2.append(AnonymousClass0x7.A05(A05));
                C18320x8.A1K(A0o2);
            }
            synchronized (r2) {
                sharedPreferences = r2.A00;
                if (sharedPreferences == null) {
                    sharedPreferences = r2.A01.A03("media_bandwidth_shared_preferences_v2");
                    r2.A00 = sharedPreferences;
                }
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            Locale locale = Locale.US;
            Object[] objArr = new Object[5];
            AnonymousClass000.A1P(objArr, i, 0);
            AnonymousClass000.A1P(objArr, A002, 1);
            AnonymousClass000.A1P(objArr, A003, 2);
            AnonymousClass000.A1P(objArr, 0, 3);
            objArr[4] = "bandwidths";
            edit.putString(String.format(locale, "%d_%d_%d_%d_%s", objArr), A0o2.toString());
            edit.apply();
        }
    }

    public C60132y3(C29441ip r1, C56612sH r2, AnonymousClass1VX r3, AnonymousClass2YP r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
    }
}
