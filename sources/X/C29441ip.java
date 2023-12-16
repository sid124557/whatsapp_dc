package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1ip  reason: invalid class name and case insensitive filesystem */
public class C29441ip extends C29451iq {
    public C59622xD A00;
    public final Handler A01;
    public final AnonymousClass2K6 A02 = new AnonymousClass2K6();
    public final C54292oU A03;
    public final C183538qC A04;
    public final C183538qC A05;
    public final C183538qC A06;
    public final Object A07 = AnonymousClass002.A0D();
    public final AtomicBoolean A08 = C18280x3.A0l();
    public volatile C18660y3 A09;

    public boolean A0I(ConnectivityManager connectivityManager, TelephonyManager telephonyManager) {
        if (connectivityManager != null) {
            try {
                C18660y3 A092 = A09();
                connectivityManager.registerDefaultNetworkCallback(A092);
                A092.A02 = connectivityManager;
                A092.A04 = telephonyManager;
                return true;
            } catch (RuntimeException e) {
                Log.e("ConnectivityStateProvider/registerForNetworkCallbacks", e);
            }
        }
        return false;
    }

    public final C18660y3 A09() {
        if (this.A09 == null) {
            synchronized (this) {
                if (this.A09 == null) {
                    this.A09 = new C18660y3(this, (AnonymousClass5ZR) this.A06.get());
                }
            }
        }
        return this.A09;
    }

    public C59622xD A0B() {
        C59622xD r0;
        synchronized (this.A07) {
            r0 = this.A00;
        }
        return r0;
    }

    public void A0C() {
        Log.d("ConnectivityStateProvider/notifyConnectivityChangedFromCallback");
        C50092hc A0A = A0A();
        this.A01.post(new C70323aJ(this, C59622xD.A00(A0A, ((C56612sH) this.A05.get()).A0H()), A0A, 40));
    }

    public void A0D(C50092hc r3) {
        Log.d("ConnectivityStateProvider/useCallbackBasedNetworkAccessChecks");
        this.A08.set(true);
        C18660y3 A092 = A09();
        if (r3 != null) {
            A092.A01.set(r3.A03);
        }
    }

    public boolean A0H() {
        if (Build.VERSION.SDK_INT < 29 || !this.A08.get()) {
            return false;
        }
        return true;
    }

    public C29441ip(C54292oU r2, C183538qC r3, C183538qC r4, C183538qC r5, C183538qC r6) {
        super(r6);
        this.A03 = r2;
        this.A05 = r3;
        this.A04 = r4;
        this.A06 = r5;
        this.A01 = AnonymousClass000.A0A();
    }

    public static int A00(Context context) {
        if (A02(context)) {
            return R.string.f11nameremoved;
        }
        return R.string.f11nameremoved;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01() {
        /*
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "checking captive portal: "
            r2.append(r0)
            java.lang.String r1 = X.C58172up.A0I
            X.C18260x0.A1J(r2, r1)
            r0 = 3
            r4 = 0
            r3 = 0
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ IOException | SecurityException -> 0x004d }
            java.net.URLConnection r2 = X.C18300x5.A0q(r1)     // Catch:{ IOException | SecurityException -> 0x004d }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException | SecurityException -> 0x004d }
            r2.setInstanceFollowRedirects(r4)     // Catch:{ IOException | SecurityException -> 0x004a, all -> 0x0047 }
            r0 = 10000(0x2710, float:1.4013E-41)
            r2.setConnectTimeout(r0)     // Catch:{ IOException | SecurityException -> 0x004a, all -> 0x0047 }
            r2.setReadTimeout(r0)     // Catch:{ IOException | SecurityException -> 0x004a, all -> 0x0047 }
            r2.setUseCaches(r4)     // Catch:{ IOException | SecurityException -> 0x004a, all -> 0x0047 }
            r2.getInputStream()     // Catch:{ IOException | SecurityException -> 0x004a, all -> 0x0047 }
            int r1 = r2.getResponseCode()     // Catch:{ IOException | SecurityException -> 0x004a, all -> 0x0047 }
            r0 = 204(0xcc, float:2.86E-43)
            if (r1 != r0) goto L_0x003a
            java.lang.String r0 = "not captive portal"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ IOException | SecurityException -> 0x004a, all -> 0x0047 }
            goto L_0x0059
        L_0x003a:
            java.lang.String r0 = "captive portal"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException | SecurityException -> 0x004a, all -> 0x0047 }
            r2.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            r0 = 1
            return r0
        L_0x0047:
            r0 = move-exception
            r3 = r2
            goto L_0x0061
        L_0x004a:
            r1 = move-exception
            r3 = r2
            goto L_0x004e
        L_0x004d:
            r1 = move-exception
        L_0x004e:
            java.lang.String r0 = "exception during captive portal check "
            com.whatsapp.util.Log.d(r0, r1)     // Catch:{ all -> 0x0060 }
            if (r3 == 0) goto L_0x005c
            r3.disconnect()
            goto L_0x005c
        L_0x0059:
            r2.disconnect()
        L_0x005c:
            android.net.TrafficStats.clearThreadStatsTag()
            return r4
        L_0x0060:
            r0 = move-exception
        L_0x0061:
            if (r3 == 0) goto L_0x0066
            r3.disconnect()
        L_0x0066:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29441ip.A01():boolean");
    }

    public static boolean A02(Context context) {
        if (Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
            return true;
        }
        return false;
    }

    public int A08(boolean z) {
        if (A0H()) {
            return A09().A01();
        }
        return ((C54392oe) this.A04.get()).A00(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (r2 != 2) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C50092hc A0A() {
        /*
            r9 = this;
            boolean r0 = r9.A0H()
            r5 = 1
            if (r0 == 0) goto L_0x00b0
            X.0y3 r3 = r9.A09()
            int r2 = r3.A01()
            X.8qC r0 = r9.A06
            java.lang.Object r1 = r0.get()
            X.5ZR r1 = (X.AnonymousClass5ZR) r1
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            int r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x0099
            int r4 = r3.A02()
        L_0x0023:
            if (r2 == r5) goto L_0x002a
            r5 = 0
            r0 = 2
            r6 = 1
            if (r2 == r0) goto L_0x002b
        L_0x002a:
            r6 = 0
        L_0x002b:
            boolean r7 = r3.A04()
            r0 = 3
            if (r2 != r0) goto L_0x008a
            r8 = 1
            java.lang.String r2 = "ROAMING"
        L_0x0035:
            switch(r4) {
                case 1: goto L_0x0087;
                case 2: goto L_0x0084;
                case 3: goto L_0x0081;
                case 4: goto L_0x007e;
                case 5: goto L_0x007b;
                case 6: goto L_0x0078;
                case 7: goto L_0x0075;
                case 8: goto L_0x0072;
                case 9: goto L_0x006f;
                case 10: goto L_0x006c;
                case 11: goto L_0x0069;
                case 12: goto L_0x0066;
                case 13: goto L_0x0063;
                case 14: goto L_0x0060;
                case 15: goto L_0x005d;
                case 16: goto L_0x005a;
                case 17: goto L_0x0057;
                case 18: goto L_0x0054;
                case 19: goto L_0x0051;
                case 20: goto L_0x004e;
                default: goto L_0x0038;
            }
        L_0x0038:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "UNDEFINED("
            r1.append(r0)
            r1.append(r4)
            java.lang.String r3 = X.AnonymousClass000.A0e(r1)
        L_0x0048:
            X.2hc r1 = new X.2hc
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        L_0x004e:
            java.lang.String r3 = "NR"
            goto L_0x0048
        L_0x0051:
            java.lang.String r3 = "LTE_CA"
            goto L_0x0048
        L_0x0054:
            java.lang.String r3 = "IWLAN"
            goto L_0x0048
        L_0x0057:
            java.lang.String r3 = "TD_SCDMA"
            goto L_0x0048
        L_0x005a:
            java.lang.String r3 = "GSM"
            goto L_0x0048
        L_0x005d:
            java.lang.String r3 = "HSPAP"
            goto L_0x0048
        L_0x0060:
            java.lang.String r3 = "EHRPD"
            goto L_0x0048
        L_0x0063:
            java.lang.String r3 = "LTE"
            goto L_0x0048
        L_0x0066:
            java.lang.String r3 = "EVDO_B"
            goto L_0x0048
        L_0x0069:
            java.lang.String r3 = "IDEN"
            goto L_0x0048
        L_0x006c:
            java.lang.String r3 = "HSPA"
            goto L_0x0048
        L_0x006f:
            java.lang.String r3 = "HSUPA"
            goto L_0x0048
        L_0x0072:
            java.lang.String r3 = "HSDPA"
            goto L_0x0048
        L_0x0075:
            java.lang.String r3 = "1xRTT"
            goto L_0x0048
        L_0x0078:
            java.lang.String r3 = "EVDO_A"
            goto L_0x0048
        L_0x007b:
            java.lang.String r3 = "EVDO_0"
            goto L_0x0048
        L_0x007e:
            java.lang.String r3 = "CDMA"
            goto L_0x0048
        L_0x0081:
            java.lang.String r3 = "UMTS"
            goto L_0x0048
        L_0x0084:
            java.lang.String r3 = "EDGE"
            goto L_0x0048
        L_0x0087:
            java.lang.String r3 = "GPRS"
            goto L_0x0048
        L_0x008a:
            r8 = 0
            if (r2 == 0) goto L_0x0096
            r0 = 1
            if (r2 == r0) goto L_0x0093
            java.lang.String r2 = "CELLULAR"
            goto L_0x0035
        L_0x0093:
            java.lang.String r2 = "WIFI"
            goto L_0x0035
        L_0x0096:
            java.lang.String r2 = "NONE"
            goto L_0x0035
        L_0x0099:
            X.8qC r0 = r9.A04
            java.lang.Object r0 = r0.get()
            X.2oe r0 = (X.C54392oe) r0
            android.net.NetworkInfo r0 = r0.A01()
            if (r0 == 0) goto L_0x00ad
            int r4 = r0.getSubtype()
            goto L_0x0023
        L_0x00ad:
            r4 = 0
            goto L_0x0023
        L_0x00b0:
            X.8qC r0 = r9.A04
            java.lang.Object r0 = r0.get()
            X.2oe r0 = (X.C54392oe) r0
            android.net.NetworkInfo r1 = r0.A01()
            if (r1 == 0) goto L_0x00e4
            int r0 = r1.getType()
            boolean r5 = X.AnonymousClass000.A1U(r0, r5)
            int r0 = r1.getType()
            boolean r6 = X.AnonymousClass000.A1T(r0)
            int r4 = r1.getSubtype()
            boolean r7 = r1.isConnected()
            boolean r8 = r1.isRoaming()
            java.lang.String r2 = r1.getTypeName()
            java.lang.String r3 = r1.getSubtypeName()
            goto L_0x0048
        L_0x00e4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29441ip.A0A():X.2hc");
    }

    public void A0E(C59622xD r3) {
        C18260x0.A1P(AnonymousClass001.A0o(), "ConnectivityStateProvider/notifyConnectivityChanged ", r3);
        synchronized (this.A07) {
            this.A00 = r3;
        }
        Iterator A032 = C61102zi.A03(this);
        while (A032.hasNext()) {
            ((AnonymousClass49Y) A032.next()).BPq(r3);
        }
    }

    public boolean A0F() {
        if (A0H()) {
            return A09().A04();
        }
        return ((C54392oe) this.A04.get()).A02();
    }

    public boolean A0G() {
        if (A0H()) {
            return A09().A03();
        }
        return ((C54392oe) this.A04.get()).A03();
    }
}
