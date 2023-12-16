package X;

import android.os.Handler;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3Sw  reason: invalid class name and case insensitive filesystem */
public class C68363Sw implements AnonymousClass4EZ {
    public long A00 = 0;
    public final C56612sH A01;
    public final AnonymousClass31C A02;
    public final C29011i8 A03;

    public void BQs(String str) {
        synchronized (this) {
            this.A00 = 0;
        }
        Log.w("routeselector/on delivery failure");
        C18260x0.A0z("routeselector/onmediaroutingrequesterror/code ", AnonymousClass001.A0o(), 0);
    }

    public void BSN(AnonymousClass36K r10, String str) {
        synchronized (this) {
            this.A00 = 0;
        }
        Iterator A0M = AnonymousClass36K.A0M(r10, "error");
        while (A0M.hasNext()) {
            AnonymousClass36K A0Y = C18310x6.A0Y(A0M);
            if (A0Y != null) {
                try {
                    int A0b = A0Y.A0b("code", 0);
                    if (A0b != 0) {
                        Pair A0K = C18290x4.A0K(Integer.valueOf(A0b), A0Y.A0b("backoff", 0));
                        C29011i8 r4 = this.A03;
                        int A032 = C18280x3.A03(A0K);
                        int A033 = C18290x4.A03(A0K);
                        C18260x0.A0z("routeselector/onmediaroutingrequesterror/code ", AnonymousClass001.A0o(), A032);
                        if (503 == A032) {
                            AnonymousClass2LI r2 = r4.A0A;
                            synchronized (r2) {
                                r2.A00 = 0;
                                Log.i("ChatdMediaThrottleManager/resetThrottle");
                            }
                            Handler handler = r4.A04;
                            C102145Hq r42 = r4.A0E;
                            long A012 = r42.A00.A01();
                            long j = 0;
                            if (A012 != 0) {
                                long j2 = A012 * 1000;
                                j = ((3 * j2) / 4) + Math.abs(r42.A01.nextLong() % (j2 / 2));
                                StringBuilder A0o = AnonymousClass001.A0o();
                                A0o.append("fibonaccibackoffhandler/sleep/");
                                A0o.append(j);
                                C18260x0.A1L(A0o, " milliseconds");
                            }
                            handler.sendEmptyMessageDelayed(0, j);
                            return;
                        } else if (507 == A032 && A033 > 0) {
                            AnonymousClass2LI r6 = r4.A0A;
                            long j3 = (long) A033;
                            synchronized (r6) {
                                long A0H = r6.A01.A0H() + (Math.min(j3, 10800) * 1000);
                                r6.A00 = A0H;
                                C18260x0.A12("ChatdMediaThrottleManager/setThrottle until ", AnonymousClass001.A0o(), A0H);
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                } catch (AnonymousClass24Y e) {
                    Log.e("MediaConnFactory/getErrorCodeAndBackoffFromIqResponse CorruptStreamException ", e);
                }
            }
        }
    }

    public void BdM(AnonymousClass36K r43, String str) {
        long j;
        synchronized (this) {
            j = this.A00;
            this.A00 = 0;
        }
        C29011i8 r2 = this.A03;
        AnonymousClass36K A0m = r43.A0m("media_conn");
        String A0L = AnonymousClass36K.A0L(A0m, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        String A0q = A0m.A0q("auth");
        long A04 = AnonymousClass36K.A04(A0m, "ttl");
        long A042 = AnonymousClass36K.A04(A0m, "auth_ttl");
        long A05 = AnonymousClass36K.A05(A0m, "max_buckets");
        int A0b = A0m.A0b("is_new", 1);
        int A0b2 = A0m.A0b("max_auto_download_retry", 3);
        int A0b3 = A0m.A0b("max_manual_retry", 3);
        AnonymousClass36K[] r4 = A0m.A03;
        ArrayList A0s = AnonymousClass001.A0s();
        if (r4 != null) {
            for (AnonymousClass36K r0 : r4) {
                if ("host".equals(r0.A00)) {
                    String A0q2 = r0.A0q("hostname");
                    String A0r = r0.A0r("ip4", (String) null);
                    String A0r2 = r0.A0r("ip6", (String) null);
                    String A0r3 = r0.A0r("class", (String) null);
                    String A0r4 = r0.A0r("fallback_hostname", (String) null);
                    String A0r5 = r0.A0r("fallback_ip4", (String) null);
                    String A0r6 = r0.A0r("fallback_ip6", (String) null);
                    String A0r7 = r0.A0r("fallback_class", (String) null);
                    AnonymousClass36K A0l = r0.A0l("upload");
                    Set set = C617131y.A00;
                    A0s.add(new C47502dM(A0q2, A0r, A0r2, A0r3, A0r4, A0r5, A0r6, A0r7, AnonymousClass36K.A0K(r0), C617131y.A00(A0l, set), C617131y.A00(r0.A0l("download"), set), C617131y.A00(r0.A0l("download_buckets"), (Set) null), AnonymousClass36K.A0X(r0, "force_ip", (String) null)));
                }
            }
        }
        AnonymousClass5LI r27 = new AnonymousClass5LI(A0q, A0L, A0s, A0b2, A0b3, A04, A042, A05, j, AnonymousClass000.A1U(A0b, 1));
        AnonymousClass2LI r5 = r2.A0A;
        synchronized (r5) {
            r5.A00 = 0;
            Log.i("ChatdMediaThrottleManager/resetThrottle");
        }
        r2.A0I(r27);
        if (r2.A08.A0Y(C58422vE.A02, 149)) {
            C18270x1.A0j(C60152y5.A00(r2.A0C, "route_selector_prefs"), "media_conn", C57552tp.A00(r2.A07, r2.A0B()));
        }
    }

    public C68363Sw(C56612sH r3, AnonymousClass31C r4, C29011i8 r5) {
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }
}
