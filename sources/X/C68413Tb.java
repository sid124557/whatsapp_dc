package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Tb  reason: invalid class name and case insensitive filesystem */
public class C68413Tb implements AnonymousClass4EZ, AnonymousClass4FJ {
    public Runnable A00;
    public final C56972sr A01;
    public final C66663Mh A02;
    public final C28941i1 A03;
    public final C64663Ek A04;
    public final C613730l A05;
    public final C56612sH A06;
    public final C29041iB A07;
    public final AnonymousClass1VX A08;
    public final AnonymousClass31C A09;
    public final AnonymousClass4FS A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r1 >= 4) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A00() {
        /*
            r5 = this;
            monitor-enter(r5)
            X.30l r0 = r5.A05     // Catch:{ all -> 0x0040 }
            android.content.SharedPreferences r2 = r0.A02()     // Catch:{ all -> 0x0040 }
            java.lang.String r1 = "syncd_dirty"
            r0 = -1
            int r1 = r2.getInt(r1, r0)     // Catch:{ all -> 0x0040 }
            if (r1 == r0) goto L_0x0015
            r0 = 4
            r2 = 1
            if (r1 < r0) goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = "SyncdDeleteAllDataHandler/schedule isSyncdDirtyAndShouldRetry = "
            X.C18260x0.A1E(r0, r1, r2)     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x0033
            X.4FS r4 = r5.A0A     // Catch:{ all -> 0x0040 }
            java.lang.String r3 = "SyncdDeleteAllHandler/schedule"
            r0 = 0
            X.3Zi r2 = X.C69963Zi.A00(r5, r0)     // Catch:{ all -> 0x0040 }
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Runnable r0 = r4.Bkn(r2, r3, r0)     // Catch:{ all -> 0x0040 }
            r5.A00 = r0     // Catch:{ all -> 0x0040 }
            goto L_0x003e
        L_0x0033:
            X.4FS r2 = r5.A0A     // Catch:{ all -> 0x0040 }
            X.1i1 r1 = r5.A03     // Catch:{ all -> 0x0040 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ all -> 0x0040 }
            r0 = 1
            X.C69963Zi.A01(r2, r1, r0)     // Catch:{ all -> 0x0040 }
        L_0x003e:
            monitor-exit(r5)
            return
        L_0x0040:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68413Tb.A00():void");
    }

    public void A02(boolean z) {
        String A0b;
        C56972sr r3 = this.A01;
        C626936e.A0F(!r3.A0Y(), "Companion device should not call SyncdDeleteAllDataHandler.handleDirtyState");
        synchronized (this) {
            Runnable runnable = this.A00;
            if (runnable != null) {
                this.A0A.BjN(runnable);
                this.A00 = null;
                Log.i("SyncdDeleteAllDataHandler/resetSchedule removed scheduled sync");
            }
        }
        AnonymousClass31C r5 = this.A09;
        if (!r5.A0I()) {
            A0b = "SyncdDeleteAllDataApiHandler/handleDirtyState disconnected";
        } else {
            C613730l r2 = this.A05;
            if (!r2.A08()) {
                A0b = "SyncdDeleteAllDataApiHandler/handleDirtyState clean in progress";
            } else if (z || C18310x6.A03(r2.A02(), "syncd_dirty") < 4) {
                r2.A05(C18310x6.A03(r2.A02(), "syncd_dirty") + 1);
                C29041iB r22 = this.A07;
                if (C29041iB.A00(r22)) {
                    Log.i("SyncdDeleteAllDataApiHandler/handleDirtyState: logoutAllCompanionDevices");
                    r22.A0K("syncd_failure", false);
                    return;
                }
                Log.i("SyncdDeleteAllDataApiHandler/handleDirtyState: sendDeleteAllDataIq");
                if (C56972sr.A03(r3) != null) {
                    String A032 = r5.A03();
                    C18260x0.A0s("SyncdDeleteAllDataApiHandler/sendIqWithCallback ", A032, AnonymousClass001.A0o());
                    String str = new C43112Qv(A032).A01;
                    C56052rL A042 = C56052rL.A04("iq");
                    C56052rL.A0D(A042, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
                    C626836d.A0G(A042, str);
                    AnonymousClass36K A0F = A042.A0F();
                    C56052rL A043 = C56052rL.A04("iq");
                    C56052rL.A06(C135206kI.A00, A043, "to");
                    C56052rL.A0D(A043, "xmlns", "w:sync:app:state");
                    C56052rL.A07(C56052rL.A04("delete_all_data"), A043);
                    A043.A0I(A0F);
                    r5.A0K(this, A043.A0F(), A032, 250, 32000);
                    return;
                }
                return;
            } else {
                A0b = AnonymousClass000.A0b("SyncdDeleteAllDataApiHandler/handleDirtyState shouldn't retry force=", AnonymousClass001.A0o(), z);
            }
        }
        Log.w(A0b);
    }

    public void A01(int i) {
        C626936e.A0F(!this.A01.A0Y(), "Companion device should not call SyncdDeleteAllDataHandler.markSyncdDirty");
        Log.i("SyncdDeleteAllDataApiHandler/markSyncdDirty");
        C613730l r1 = this.A05;
        r1.A04(i);
        if (i == 1) {
            C18270x1.A0i(C613730l.A00(r1), "syncd_last_fatal_error_time", this.A06.A0H());
        }
    }

    public final boolean A03() {
        long j = this.A05.A02().getLong("syncd_last_companion_dereg_time", 0);
        boolean z = false;
        if (j != 0) {
            if (j + TimeUnit.MINUTES.toMillis((long) this.A02.A03(C66663Mh.A1Q)) >= this.A06.A0H()) {
                z = true;
            }
            C18260x0.A1E("SyncdDeleteAllDataApiHandler/isInKeepAliveMode: isInKeepAliveMode = ", AnonymousClass001.A0o(), z);
        }
        return z;
    }

    public /* synthetic */ void BQS(C48932fi r1) {
    }

    public /* synthetic */ void BQx(C48932fi r1) {
    }

    public void BR0(C48932fi r3) {
        if (!this.A01.A0Y()) {
            C613730l r1 = this.A05;
            if (r1.A08()) {
                Log.e("SyncdDeleteAllDataApiHandler/onDeviceRegistered: This should be rare and suggested to check more logs.");
                return;
            }
            Log.i("SyncdDeleteAllDataApiHandler/onDeviceRegistered removeLastCompanionDeregTime");
            C18270x1.A0g(C613730l.A00(r1), "syncd_last_companion_dereg_time");
        }
    }

    public void BR1(C129526aS r2, int i) {
        if (!this.A01.A0Y() && this.A05.A08()) {
            Log.i("SyncdDeleteAllDataApiHandler/onDeviceLogoutError");
            A00();
        }
    }

    public /* synthetic */ void BR2(C48932fi r1) {
    }

    public void BR3(C129526aS r7) {
        if (!this.A01.A0Y()) {
            C613730l r4 = this.A05;
            if (r4.A08()) {
                Log.i("SyncdDeleteAllDataApiHandler/onDeviceRemoved");
                if (!C29041iB.A00(this.A07)) {
                    Iterator A032 = C61102zi.A03(this.A03);
                    while (A032.hasNext()) {
                        ((AnonymousClass4E2) A032.next()).BZp();
                    }
                    C64663Ek r5 = this.A04;
                    AnonymousClass1WP r1 = new AnonymousClass1WP();
                    r1.A00 = Long.valueOf((long) (C18310x6.A03(r4.A02(), "syncd_dirty") - 1));
                    C64663Ek.A05(r5, r1);
                }
                r4.A05(0);
                A02(false);
            } else if (this.A02.A03(C66663Mh.A1Q) > 0 && !C29041iB.A00(this.A07)) {
                Log.i("SyncdDeleteAllDataApiHandler/onDeviceRemoved setLastCompanionDeregTime");
                C18270x1.A0i(C613730l.A00(r4), "syncd_last_companion_dereg_time", this.A06.A0H());
            }
        }
    }

    public /* synthetic */ void BR4(AnonymousClass33G r1) {
    }

    public C68413Tb(C56972sr r1, C66663Mh r2, C28941i1 r3, C64663Ek r4, C613730l r5, C56612sH r6, C29041iB r7, AnonymousClass1VX r8, AnonymousClass31C r9, AnonymousClass4FS r10) {
        this.A06 = r6;
        this.A08 = r8;
        this.A01 = r1;
        this.A0A = r10;
        this.A02 = r2;
        this.A09 = r9;
        this.A04 = r4;
        this.A07 = r7;
        this.A05 = r5;
        this.A03 = r3;
    }

    public void BQs(String str) {
        C18260x0.A0r("SyncdDeleteAllDataApiHandler/onDeliveryFailure ", str, AnonymousClass001.A0o());
        A00();
    }

    public void BSN(AnonymousClass36K r4, String str) {
        C18260x0.A1Q(AnonymousClass001.A0o(), "SyncdDeleteAllDataApiHandler/onError ", C57492tj.A02(r4));
        A00();
    }

    public void BdM(AnonymousClass36K r3, String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SyncdDeleteAllDataApiHandler/onSuccess ");
        A0o.append(str);
        C18260x0.A1R(A0o, " response: ", r3);
        C69963Zi.A01(this.A0A, this, 2);
    }
}
