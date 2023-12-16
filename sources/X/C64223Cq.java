package X;

import android.content.SharedPreferences;
import android.os.PowerManager;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: X.3Cq  reason: invalid class name and case insensitive filesystem */
public class C64223Cq implements AnonymousClass4F2, AnonymousClass485 {
    public final C116985rC A00;
    public final C116985rC A01;
    public final C116985rC A02;
    public final C55682qk A03;
    public final C56972sr A04;
    public final C55912r7 A05;
    public final C49712gy A06;
    public final C29411im A07;
    public final C29441ip A08;
    public final C64773Ex A09;
    public final C64193Cn A0A;
    public final C56882si A0B;
    public final C620633i A0C;
    public final C56612sH A0D;
    public final AnonymousClass2W1 A0E;
    public final C620233e A0F;
    public final C46982cW A0G;
    public final AnonymousClass1VX A0H;
    public final C45342Zq A0I;
    public final C48202eW A0J;
    public final AnonymousClass4FS A0K;

    public AnonymousClass304 A00(C59812xW r8, AnonymousClass227 r9, Collection collection) {
        if (!this.A08.A0F()) {
            Log.i("contactsyncmethods/network_unavailable");
            return AnonymousClass304.A04;
        }
        C626936e.A0B(r8.A00());
        C626936e.A0B(AnonymousClass000.A1Y(r9.scope, C370520t.MULTI_PROTOCOLS_QUERY));
        StringBuilder A0o = AnonymousClass001.A0o();
        C18290x4.A1O("contactsyncmethods/requestSyncMultiProtocolsAndWaitForResult/start sync user size=", A0o, collection);
        C18260x0.A1P(A0o, "; protocol=", r8);
        C60982zU r6 = new C60982zU(r9);
        r6.A02 = true;
        r6.A00 = r8;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C95814uZ A0P = C18300x5.A0P(it);
            if (!this.A0H.A0Y(C58422vE.A02, 3311)) {
                this.A09.A0A(A0P);
            }
            if (A0P != null) {
                r6.A07.add(A0P);
            }
        }
        try {
            return (AnonymousClass304) A03(r6.A02(), false).get();
        } catch (InterruptedException | ExecutionException unused) {
            return AnonymousClass304.A03;
        }
    }

    public void A0B(List list) {
        C626936e.A0F(!this.A04.A0Y(), "ContactSyncMethods/deltaSyncNewOutContact/out contacts should not be synced in companion mode");
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1H("contactsyncmethods/deltaSyncNewOutContact size=", A0o, list);
        AnonymousClass0x2.A18(A0o);
        if (!list.isEmpty()) {
            HashSet A0K2 = AnonymousClass002.A0K();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Jid A062 = AnonymousClass3ZH.A06(it);
                if (A062 != null) {
                    A0K2.add(A062);
                }
            }
            A02(C59812xW.A0C, AnonymousClass227.A08, A0K2, false, true);
        }
    }

    public AnonymousClass304 A01(C61272zz r2) {
        if (!this.A08.A0F()) {
            Log.i("contactsyncmethods/network_unavailable");
            return AnonymousClass304.A04;
        }
        try {
            return (AnonymousClass304) A03(r2, false).get();
        } catch (InterruptedException | ExecutionException unused) {
            return AnonymousClass304.A03;
        }
    }

    public final C72183dJ A03(C61272zz r6, boolean z) {
        C33161sX r4 = new C33161sX(z);
        r6.A02(r4);
        C64193Cn r3 = this.A0A;
        r3.A0T.execute(new C70203a7(r3, 45, r6));
        return r4;
    }

    public void A05() {
        C56972sr r1 = this.A04;
        if (C56972sr.A00(r1) != null && !r1.A0Y()) {
            this.A0K.BkM(new C69973Zj(this, 30));
        }
    }

    public void A06() {
        C626936e.A0F(!this.A04.A0Y(), "ContactSyncMethods/requestBackgroundFullSyncWithRetry/should not be executed by companions");
        C60982zU r2 = new C60982zU(AnonymousClass227.A03);
        r2.A00 = C59812xW.A0C;
        r2.A04 = true;
        A03(r2.A02(), true);
    }

    public void A07() {
        AnonymousClass227 r0;
        Log.i("ContactSyncMethods/requestOnChangeDeltaSync");
        C626936e.A0F(!this.A04.A0Y(), "ContactSyncMethods/requestOnChangeDeltaSync/companions should not perform delta sync");
        if (this.A0J.A00 == 3) {
            r0 = AnonymousClass227.A02;
        } else {
            r0 = AnonymousClass227.A09;
        }
        C60982zU r2 = new C60982zU(r0);
        r2.A03 = true;
        r2.A04 = true;
        r2.A00 = C59812xW.A0C;
        A03(r2.A02(), true);
    }

    public void A08() {
        AnonymousClass227 r0;
        if (this.A04.A0Y()) {
            Log.d("ContactSyncMethods/requestUrgentOnChangeDeltaSync/companions should not perform delta sync");
            return;
        }
        if (this.A0J.A00 == 3) {
            r0 = AnonymousClass227.A02;
        } else {
            r0 = AnonymousClass227.A09;
        }
        C60982zU r2 = new C60982zU(r0);
        r2.A03 = true;
        r2.A04 = true;
        r2.A00 = C59812xW.A0C;
        r2.A02 = true;
        A03(r2.A02(), true);
    }

    public final void A09(C59812xW r7, AnonymousClass227 r8, Collection collection, boolean z) {
        PowerManager.WakeLock A002;
        long j;
        SharedPreferences.Editor A012;
        String str;
        if (!this.A07.A0A() || !this.A0H.A0Y(C58422vE.A02, 4097)) {
            PowerManager A0J2 = this.A0C.A0J();
            if (A0J2 == null) {
                Log.w("contactsyncmethods/forceFullSync pm=null");
                A002 = null;
            } else {
                A002 = AnonymousClass75K.A00(A0J2, "fullsync", 1);
            }
            if (A002 != null) {
                try {
                    A002.acquire(300000);
                    Log.i("contactsyncmethods/forceFullSync/wl/acquire");
                } catch (RuntimeException e) {
                    Log.e("contactsyncmethods/forceFullSync", e);
                    C55682qk.A05(this.A03, "contactsyncmethods/forceFullSync", e);
                } catch (Throwable th) {
                    if (A002 != null && A002.isHeld()) {
                        A002.release();
                        Log.i("contactsyncmethods/forceFullSync/wl/release");
                    }
                    throw th;
                }
            }
            C60982zU r1 = new C60982zU(r8);
            r1.A02 = true;
            r1.A01 = z;
            r1.A00 = r7;
            r1.A07.addAll(collection);
            C18260x0.A1P(AnonymousClass001.A0o(), "contactsyncmethods/forceFullSync finished ", A01(r1.A02()));
            if (A002 != null && A002.isHeld()) {
                A002.release();
                Log.i("contactsyncmethods/forceFullSync/wl/release");
                return;
            }
            return;
        }
        Log.i("contactsyncmethods/forceFullSync offline in progress, sync latter");
        if (this.A04.A0Y()) {
            j = 0;
            A012 = C56882si.A01(this.A0B);
            str = "status_full_sync_wait";
        } else if (r7.A02) {
            j = 0;
            A012 = C56882si.A01(this.A0B);
            str = "contact_full_sync_wait";
        } else if (r7.A08) {
            j = 0;
            A012 = C56882si.A01(this.A0B);
            str = "sidelist_full_sync_wait";
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("contactsyncmethods/forceFullSync unexpected full sync, syncType=");
            A0o.append(r8);
            C18260x0.A1Q(A0o, "; protocols=", r7);
            return;
        }
        C18270x1.A0i(A012, str, j);
    }

    public void A0A(AnonymousClass3ZH r11) {
        Class<UserJid> cls = UserJid.class;
        Jid A0I2 = r11.A0I(cls);
        if (A0I2 != null) {
            C56972sr r1 = this.A04;
            if (!A0I2.equals(C56972sr.A04(r1)) && !(A0I2 instanceof C135216kJ) && r11.A0F == null) {
                if (r1.A0Y()) {
                    A02(C59812xW.A0D, AnonymousClass227.A0C, Collections.singleton(r11.A0I(cls)), false, true);
                } else if (!r11.A0z) {
                    C60982zU r2 = new C60982zU(AnonymousClass227.A0A);
                    r2.A04 = true;
                    r2.A00 = C59812xW.A0C;
                    r2.A07.add(A0I2);
                    A03(r2.A02(), true);
                }
            }
        }
    }

    public void BUE() {
        this.A0K.BkM(new C69973Zj(this, 31));
    }

    public C64223Cq(C116985rC r2, C116985rC r3, C116985rC r4, C55682qk r5, C56972sr r6, C55912r7 r7, C49712gy r8, C29411im r9, C29441ip r10, C64773Ex r11, C64193Cn r12, C56882si r13, C620633i r14, C56612sH r15, AnonymousClass2W1 r16, C620233e r17, C46982cW r18, AnonymousClass1VX r19, C45342Zq r20, C48202eW r21, AnonymousClass4FS r22) {
        this.A0D = r15;
        this.A0H = r19;
        this.A03 = r5;
        this.A04 = r6;
        this.A0K = r22;
        this.A0F = r17;
        this.A06 = r8;
        this.A09 = r11;
        this.A0C = r14;
        this.A0J = r21;
        this.A07 = r9;
        this.A00 = r2;
        this.A0I = r20;
        this.A05 = r7;
        this.A02 = r3;
        this.A0G = r18;
        this.A0E = r16;
        this.A01 = r4;
        this.A08 = r10;
        this.A0A = r12;
        this.A0B = r13;
    }

    public C72183dJ A02(C59812xW r7, AnonymousClass227 r8, Collection collection, boolean z, boolean z2) {
        C626936e.A0B(r7.A00());
        C626936e.A0B(AnonymousClass000.A1Y(r8.scope, C370520t.MULTI_PROTOCOLS_QUERY));
        StringBuilder A0o = AnonymousClass001.A0o();
        C18290x4.A1O("contactsyncmethods/requestSyncMultiProtocolsWithRetry/start sync user size=", A0o, collection);
        C18260x0.A1P(A0o, "; protocol=", r7);
        C60982zU r5 = new C60982zU(r8);
        r5.A02 = z;
        r5.A00 = r7;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C95814uZ A0P = C18300x5.A0P(it);
            if (!this.A0H.A0Y(C58422vE.A02, 3311)) {
                this.A09.A0A(A0P);
            }
            if (A0P != null) {
                r5.A07.add(A0P);
            }
        }
        return A03(r5.A02(), z2);
    }

    public C72183dJ A04(AnonymousClass227 r7, Collection collection) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("contactsyncmethods/requestSyncDevicesWithRetry/start sync user device size=");
        C18260x0.A1F(A0o, collection.size());
        return A02(C59812xW.A0H, r7, collection, true, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0056, code lost:
        if (r14 <= 1800000) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(boolean r24) {
        /*
            r23 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "contactsyncmethods/fullSyncAndInitialize sendOtherIq="
            r7 = r24
            X.C18260x0.A1D(r0, r1, r7)
            r6 = r23
            X.2sr r0 = r6.A04
            boolean r22 = r0.A0Y()
            r5 = 1
            r20 = 0
            X.2si r8 = r6.A0B
            android.content.SharedPreferences r1 = r8.A02()
            if (r22 == 0) goto L_0x0162
            java.lang.String r0 = "last_status_full_sync"
        L_0x0020:
            long r1 = X.AnonymousClass0x2.A0A(r1, r0)
            int r0 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r0 < 0) goto L_0x0029
            r5 = 0
        L_0x0029:
            X.2sH r0 = r6.A0D
            long r18 = r0.A0H()
            r16 = 1800000(0x1b7740, double:8.89318E-318)
            r4 = 1
            if (r22 != 0) goto L_0x00f5
            android.content.SharedPreferences r2 = r8.A02()
            java.lang.String r13 = "contact_full_sync_wait"
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r14 = r2.getLong(r13, r0)
            long r14 = r14 - r18
            android.content.SharedPreferences r1 = r8.A02()
            java.lang.String r0 = "last_contact_full_sync"
            r2 = -1
            long r0 = r1.getLong(r0, r2)
            long r14 = r14 + r0
            if (r5 != 0) goto L_0x0058
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            r9 = 0
            if (r0 > 0) goto L_0x0059
        L_0x0058:
            r9 = 1
        L_0x0059:
            android.content.SharedPreferences r12 = r8.A02()
            java.lang.String r11 = "sidelist_full_sync_wait"
            android.content.SharedPreferences r10 = r8.A02()
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r10.getLong(r13, r0)
            long r10 = r12.getLong(r11, r0)
            long r10 = r10 - r18
            android.content.SharedPreferences r1 = r8.A02()
            java.lang.String r0 = "last_sidelist_full_sync"
            long r0 = r1.getLong(r0, r2)
            long r10 = r10 + r0
            int r0 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            boolean r2 = X.AnonymousClass0x7.A1P(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "contactsyncmethods/getProtocolsForFullSyncNew sync syncContact"
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = "; syncSidelist="
            X.C18260x0.A1D(r0, r1, r2)
            if (r9 == 0) goto L_0x00d9
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "contactsyncmethods/getProtocolsForFullSyncNew sync contact, due="
            r1.append(r0)
            int r0 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a3
            r4 = 0
        L_0x00a3:
            X.C18260x0.A1U(r1, r4)
            X.2xW r2 = X.C59812xW.A0J
        L_0x00a8:
            X.227 r1 = X.AnonymousClass227.A03
            java.util.Set r0 = java.util.Collections.emptySet()
            r6.A09(r2, r1, r0, r5)
        L_0x00b1:
            if (r24 == 0) goto L_0x018d
            if (r5 == 0) goto L_0x018d
            java.lang.String r0 = "contactsyncmethods/fullSyncAndInitialize/fullsync/neversynced"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r22 != 0) goto L_0x00c1
            X.2Zq r0 = r6.A0I
            r0.A00()
        L_0x00c1:
            X.2r7 r1 = r6.A05
            r0 = 0
            r1.A02(r0)
            X.5rC r1 = r6.A01
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0166
            r1.A04()
            java.lang.String r0 = "loadSettingToSharedPreferences"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x00d9:
            if (r2 == 0) goto L_0x00ef
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "contactsyncmethods/getProtocolsForFullSyncNew sync sidelist, due="
            r1.append(r0)
            int r0 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e9
            r4 = 0
        L_0x00e9:
            X.C18260x0.A1U(r1, r4)
            X.2xW r2 = X.C59812xW.A0K
            goto L_0x00a8
        L_0x00ef:
            java.lang.String r0 = "contactsyncmethods/getProtocolsForFullSyncNew no sync"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            goto L_0x00b1
        L_0x00f5:
            android.content.SharedPreferences r10 = r8.A02()
            java.lang.String r9 = "status_full_sync_wait"
            android.content.SharedPreferences r3 = r8.A02()
            java.lang.String r2 = "contact_full_sync_wait"
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r3.getLong(r2, r0)
            long r9 = r10.getLong(r9, r0)
            long r9 = r9 - r18
            android.content.SharedPreferences r1 = r8.A02()
            java.lang.String r0 = "last_status_full_sync"
            long r0 = X.AnonymousClass0x2.A0A(r1, r0)
            long r9 = r9 + r0
            int r0 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            boolean r2 = X.AnonymousClass0x7.A1P(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "contactsyncmethods/getProtocolsForFullSyncNew sync companion sync="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "; due="
            r1.append(r0)
            int r0 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x0136
            r4 = 0
        L_0x0136:
            X.C18260x0.A1U(r1, r4)
            if (r2 == 0) goto L_0x00b1
            X.2xW r3 = X.C59812xW.A0D
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            X.3Ex r0 = r6.A09
            java.util.ArrayList r0 = r0.A0F()
            java.util.Iterator r1 = r0.iterator()
        L_0x014b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x015b
            com.whatsapp.jid.Jid r0 = X.AnonymousClass3ZH.A06(r1)
            if (r0 == 0) goto L_0x014b
            r2.add(r0)
            goto L_0x014b
        L_0x015b:
            X.227 r0 = X.AnonymousClass227.A04
            r6.A09(r3, r0, r2, r5)
            goto L_0x00b1
        L_0x0162:
            java.lang.String r0 = "last_contact_full_sync"
            goto L_0x0020
        L_0x0166:
            X.2cW r0 = r6.A0G
            r0.A00()
            X.2W1 r0 = r6.A0E
            X.3dV r0 = r0.A00
            r0.A05()
            java.io.File r0 = r0.A05
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x018d
            X.33e r0 = r6.A0F
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x018d
            X.2gy r1 = r6.A06
            X.5rC r0 = r6.A02
            com.whatsapp.jobqueue.job.GetStatusPrivacyJob r0 = com.whatsapp.jobqueue.job.GetStatusPrivacyJob.A00(r0)
            r1.A02(r0)
        L_0x018d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64223Cq.A0C(boolean):void");
    }

    public /* synthetic */ void BUB() {
    }

    public /* synthetic */ void BUC() {
    }

    public /* synthetic */ void BUD() {
    }

    public /* synthetic */ void BUF() {
    }
}
