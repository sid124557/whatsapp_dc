package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1gP  reason: invalid class name */
public class AnonymousClass1gP extends C67743Qm {
    public final Context A00;
    public final C55682qk A01;
    public final C56612sH A02;
    public final C54292oU A03;
    public final C52852m9 A04;
    public final C66543Lv A05;
    public final C50012hU A06;
    public final C29431io A07;
    public final AnonymousClass2W5 A08;
    public final AnonymousClass1VX A09;
    public final C66383Le A0A;
    public final C50342i1 A0B;
    public final C42632Ox A0C;
    public final C54212oM A0D;
    public final C55832qz A0E;
    public final AnonymousClass4FS A0F;
    public final C619132t A0G;
    public final C45682aP A0H;
    public final C46892cN A0I;
    public final C46222bH A0J;
    public final C183538qC A0K;

    public void A05(AnonymousClass36K r16, int i) {
        List A0s;
        C52852m9 r2;
        Runnable r1;
        long j;
        AnonymousClass39T A012;
        C52852m9 r22;
        Runnable runnable;
        int i2;
        C52852m9 r23;
        C70353aM r12;
        String str;
        String str2 = null;
        AnonymousClass36K r6 = r16;
        String A0r = r6.A0r("from", (String) null);
        if (A0r == null || !A0r.equals("0@s.whatsapp.net")) {
            AnonymousClass36K A0l = r6.A0l("campaign");
            List list = null;
            if (A0l != null) {
                str2 = A0l.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
            }
            C18260x0.A0s("PSANotificationHandler/handleStatusPSANotification/campaignID ", str2, AnonymousClass001.A0o());
            if (A0l != null) {
                list = A0l.A0s("revoke");
            }
            if (list == null || list.size() <= 0) {
                long j2 = 0;
                if (A0l != null) {
                    j2 = A0l.A0e("duration", 0);
                }
                if (A0l != null) {
                    A0s = A0l.A0s("message");
                } else {
                    A0s = r6.A0s("message");
                }
                long A062 = A06(r6);
                if (A0s != null) {
                    ArrayList A0p = AnonymousClass000.A0p(A0s);
                    Iterator it = A0s.iterator();
                    while (it.hasNext()) {
                        AnonymousClass36K A0Y = C18310x6.A0Y(it);
                        long j3 = 0;
                        try {
                            j3 = A0Y.A0e("order", 0);
                        } catch (AnonymousClass24Y e) {
                            C18260x0.A1Q(AnonymousClass001.A0o(), "connection/getMessagesPsaFromProtocolTree: ", e);
                        }
                        String A0L = AnonymousClass36K.A0L(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        AnonymousClass36K A0k = A0Y.A0k(0);
                        if (A0k != null) {
                            C30481mW r10 = new C30481mW(AnonymousClass2z0.A05(C135166kE.A00, A0L, false), j3 * 1000);
                            r10.A1j(A0k.A01);
                            long j4 = j2 * 1000;
                            if (j4 == 0) {
                                j = Long.MAX_VALUE;
                            } else {
                                j = j4 + A062;
                            }
                            A0p.add(new AnonymousClass33F(r10, str2, j));
                        }
                    }
                    if (!A0p.isEmpty()) {
                        AnonymousClass39T A013 = A01();
                        r2 = this.A04;
                        r1 = new C70353aM(this, A013, A0p, 48);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                A012 = A01();
                if (str2 != null) {
                    r2 = this.A04;
                    r1 = new C71403c3(this, A012, str2, 9);
                }
            }
            r2.A01(r1, 27);
            return;
        }
        if (!r6.A0s("banner").isEmpty()) {
            Log.i("PSANotificationHandler/InAppBanner Notification");
            A012 = A01();
            if (!this.A09.A0Y(C58422vE.A02, 2871)) {
                str = "PSANotificationHandler/InAppBanner received but not enabled";
            } else {
                Log.i("PSANotificationHandler/InAppBanner beginning handling");
                r22 = this.A04;
                runnable = new C70363aN(this, A012, r6, 0);
                r22.A01(runnable, 27);
                return;
            }
        } else {
            if (!r6.A0s("surfaces").isEmpty()) {
                Log.i("PSANotificationHandler/QpSurface Notification");
                A012 = A01();
                if (!this.A09.A0Y(C58422vE.A02, 3536)) {
                    str = "PSANotificationHandler/QpSurface received but not enabled";
                } else {
                    Log.i("PSANotificationHandler/QpSurface beginning handling");
                    r22 = this.A04;
                    i2 = 45;
                }
            } else if (!r6.A0s("psa_wakeup").isEmpty()) {
                Log.i("PSANotificationHandler/Push PSA Notification");
                A012 = A01();
                if (!this.A09.A0Y(C58422vE.A02, 4200)) {
                    str = "PSANotificationHandler/Push PSA not enabled";
                } else {
                    Log.i("PSANotificationHandler/Push begin handling");
                    r22 = this.A04;
                    i2 = 49;
                }
            } else {
                AnonymousClass39T A014 = A01();
                if (!this.A09.A0Y(C58422vE.A02, 1844) || AnonymousClass36K.A0D(r6) == null) {
                    A04(A014);
                    return;
                }
                List A0s2 = r6.A0s("revoke");
                if (A0s2 == null || A0s2.isEmpty()) {
                    r23 = this.A04;
                    r12 = new C70353aM(this, A014, r6, 47);
                } else {
                    r23 = this.A04;
                    r12 = new C70353aM(this, A014, A0s2, 46);
                }
                r23.A01(r12, 27);
                return;
            }
            runnable = new C70353aM(this, A012, r6, i2);
            r22.A01(runnable, 27);
            return;
        }
        Log.i(str);
        A04(A012);
    }

    public final long A06(AnonymousClass36K r8) {
        try {
            long A0e = r8.A0e("t", 0) * 1000;
            if (A0e > 0) {
                return A0e;
            }
            long A0H2 = this.A02.A0H();
            if (A0H2 <= 0) {
                return System.currentTimeMillis();
            }
            return A0H2;
        } catch (AnonymousClass24Y e) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "PSANotificationHandler/getServerTimeInMillis: ", e);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1gP(android.content.Context r9, X.C55682qk r10, X.C56612sH r11, X.C54292oU r12, X.C52852m9 r13, X.C66543Lv r14, X.C50012hU r15, X.C29431io r16, X.AnonymousClass2W5 r17, X.AnonymousClass1VX r18, X.C66383Le r19, X.AnonymousClass31C r20, X.C55892r5 r21, X.C50342i1 r22, X.C42632Ox r23, X.C54212oM r24, X.C55832qz r25, X.AnonymousClass4FS r26, X.C619132t r27, X.C45682aP r28, X.C46892cN r29, X.C46222bH r30, X.C183538qC r31) {
        /*
            r8 = this;
            int[] r6 = X.C18330xA.A0E()
            r1 = 0
            r0 = 104(0x68, float:1.46E-43)
            r6[r1] = r0
            r7 = 1
            r1 = r8
            r5 = r26
            r2 = r10
            r3 = r20
            r4 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.A02 = r11
            r0 = r18
            r8.A09 = r0
            r8.A00 = r9
            r8.A03 = r12
            r8.A0F = r5
            r8.A01 = r10
            r8.A06 = r15
            r8.A05 = r14
            r0 = r25
            r8.A0E = r0
            r0 = r16
            r8.A07 = r0
            r0 = r27
            r8.A0G = r0
            r8.A04 = r13
            r0 = r23
            r8.A0C = r0
            r0 = r31
            r8.A0K = r0
            r0 = r17
            r8.A08 = r0
            r0 = r28
            r8.A0H = r0
            r0 = r19
            r8.A0A = r0
            r0 = r30
            r8.A0J = r0
            r0 = r29
            r8.A0I = r0
            r0 = r22
            r8.A0B = r0
            r0 = r24
            r8.A0D = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1gP.<init>(android.content.Context, X.2qk, X.2sH, X.2oU, X.2m9, X.3Lv, X.2hU, X.1io, X.2W5, X.1VX, X.3Le, X.31C, X.2r5, X.2i1, X.2Ox, X.2oM, X.2qz, X.4FS, X.32t, X.2aP, X.2cN, X.2bH, X.8qC):void");
    }
}
