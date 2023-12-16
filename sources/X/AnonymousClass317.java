package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.SystemClock;
import com.whatsapp.Me;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.317  reason: invalid class name */
public class AnonymousClass317 {
    public WeakReference A00 = null;
    public final Handler A01 = AnonymousClass000.A0A();
    public final C116985rC A02;
    public final C116985rC A03;
    public final C116985rC A04;
    public final C116985rC A05;
    public final C116985rC A06;
    public final C116985rC A07;
    public final C116985rC A08;
    public final C116985rC A09;
    public final C116985rC A0A;
    public final C116985rC A0B;
    public final C116985rC A0C;
    public final C116985rC A0D;
    public final C116985rC A0E;
    public final C29171iO A0F;
    public final C53962nx A0G;
    public final C69263Wi A0H;
    public final C56972sr A0I;
    public final C29021i9 A0J;
    public final C54042o5 A0K;
    public final C66663Mh A0L;
    public final C49712gy A0M;
    public final AnonymousClass3DP A0N;
    public final C47812dr A0O;
    public final C614930z A0P;
    public final AnonymousClass0N6 A0Q;
    public final C56962sq A0R;
    public final C65203Gp A0S;
    public final C56422rx A0T;
    public final C55052pi A0U;
    public final C64223Cq A0V;
    public final C44382Vv A0W;
    public final C50862it A0X;
    public final C620633i A0Y;
    public final C56612sH A0Z;
    public final C54292oU A0a;
    public final AnonymousClass33T A0b;
    public final AnonymousClass33p A0c;
    public final C54412og A0d;
    public final C620733j A0e;
    public final C56542sA A0f;
    public final C55272q5 A0g;
    public final C72303dV A0h;
    public final C47322d4 A0i;
    public final C29041iB A0j;
    public final AnonymousClass308 A0k;
    public final AnonymousClass1VW A0l;
    public final AnonymousClass1VX A0m;
    public final C56142rU A0n;
    public final C66493Lq A0o;
    public final AnonymousClass31C A0p;
    public final AnonymousClass33S A0q;
    public final C619933b A0r;
    public final C197769dq A0s;
    public final C60152y5 A0t;
    public final AnonymousClass33X A0u;
    public final C28861ht A0v;
    public final C51072jE A0w;
    public final C55092pm A0x;
    public final C59772xS A0y;
    public final AnonymousClass4FS A0z;
    public final C183538qC A10;
    public final C183538qC A11;
    public final List A12 = new CopyOnWriteArrayList();
    public final Set A13;

    public final C05610Ue A02(String str, String str2, String str3) {
        Context context = this.A0a.A00;
        C05610Ue A012 = C66553Lw.A01(context);
        A012.A0K = "critical_app_alerts@1";
        A012.A03 = 1;
        A012.A0C(str3);
        A012.A05(this.A0Z.A0H());
        C18270x1.A0s(A012, str, str2);
        C18270x1.A0r(A012, str2);
        AnonymousClass33T.A01(C624735e.A00(context, 1, C627736r.A03(context), 0), A012);
        return A012;
    }

    public Me A03() {
        AnonymousClass33p r0 = this.A0c;
        return new Me(r0.A0Z(), r0.A0b(), r0.A0a());
    }

    public void A04() {
        PendingIntent A012 = C624735e.A01(this.A0a.A00, 0, C18280x3.A0B("com.whatsapp.alarm.REGISTRATION_RETRY"), 536870912);
        if (A012 != null) {
            AlarmManager A072 = this.A0Y.A07();
            if (A072 != null) {
                A072.cancel(A012);
            } else {
                Log.w("RegistrationManager/cancelRegistrationRetryAlarm AlarmManager is null");
            }
            A012.cancel();
        }
    }

    public void A05() {
        C56972sr r0 = this.A0I;
        Me A0E2 = r0.A0E();
        if (A0E2 != null) {
            r0.A0O();
            C53962nx r1 = this.A0G;
            Log.i("ChangeNumberManager/deleteChangeNumberContacts");
            C18310x6.A1F(C54292oU.A03(r1.A02), "change_number_contacts.json");
            C116985rC r12 = this.A04;
            if (r12.A07()) {
                C65213Gq r13 = (C65213Gq) ((C183538qC) r12.A04()).get();
                if (AnonymousClass2OK.A00(r13.A01)) {
                    Log.d("InstrumentationObserverImpl/onChangeNumberSuccess");
                    r13.A02.A01();
                }
            }
            ((C66453Lm) this.A10.get()).A08();
            C56962sq r14 = this.A0R;
            r14.A09();
            r14.A0K((C46112b6) null);
            this.A0o.A0C(3, false);
            this.A01.post(new C70143a1(this, 5, A0E2));
            return;
        }
        Log.w("RegistrationManager/notifyChangeNumberSuccess/response/ok already changed?");
    }

    public void A06() {
        this.A0N.A02();
        if (!this.A0w.A02()) {
            Log.i("RegistrationManager/notifyOrShowLoginFailureOverlayAlert/ignore as registration not verified");
        } else {
            this.A0H.BkS(new C70033Zp(this, 46));
        }
    }

    public void A07() {
        C56972sr r1 = this.A0I;
        if (C56972sr.A00(r1) != null) {
            Log.i("RegistrationManager/xmpp/service/reset-registered/updateparams");
            PhoneUserJid A042 = C56972sr.A04(r1);
            C66523Lt A0S2 = AnonymousClass0x9.A0S(this.A11);
            if (A0S2.A10) {
                A0S2.A05 = A042;
            }
        }
    }

    public void A08() {
        C60152y5 r2 = this.A0t;
        Context context = this.A0a.A00;
        C18270x1.A0m(r2.A03(A00(context, "com.whatsapp.registration.RegisterPhone")));
        C18270x1.A0m(r2.A03(A00(context, "com.whatsapp.registration.VerifyPhoneNumber")));
    }

    public void A09() {
        this.A0I.A0M();
        this.A0c.A0r();
        C56982ss r1 = this.A0f.A00;
        synchronized (r1) {
            r1.A0G().clear();
            r1.A00 = false;
        }
        A0B(1, true);
    }

    public void A0A() {
        this.A0z.BkM(new C70143a1(this, 6, this.A0a.A00));
    }

    public final void A0B(int i, boolean z) {
        if (this.A0d.A01.getInt("registration_state", -1) != i) {
            C55092pm r1 = this.A0x;
            r1.A00 = null;
            r1.A01();
            r1.A01 = false;
            r1.A03 = false;
            r1.A04 = false;
            r1.A07 = false;
            r1.A08 = false;
            r1.A05 = false;
            r1.A06 = true;
            this.A0c.A0j();
        }
        C51072jE r2 = this.A0w;
        if (z) {
            r2.A01(i);
        } else {
            C54412og.A00(r2.A00).putInt("registration_state", i).commit();
            C18260x0.A0w("registrationmanager/setRegistrationStateSynchronously ", AnonymousClass001.A0o(), i);
        }
        C116985rC r12 = this.A0C;
        if (r12.A07() && r2.A02()) {
            r12.A04();
            throw AnonymousClass001.A0g("postValidVNameEvent");
        }
    }

    public void A0D(String str, String str2, String str3) {
        AnonymousClass33p r0 = this.A0c;
        r0.A1V(str3);
        r0.A1j(str, str2);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [int, boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0E() {
        /*
            r13 = this;
            X.33S r5 = r13.A0q
            r5.A00()
            X.8qC r4 = r13.A11
            boolean r8 = X.C18300x5.A1U(r4)
            X.2rU r0 = r13.A0n
            r0.A02()
            X.33p r3 = r13.A0c
            r3.A0i()
            X.2sH r0 = r13.A0Z
            long r0 = r0.A0H()
            android.content.SharedPreferences$Editor r6 = X.C18270x1.A03(r3)
            java.lang.String r2 = "registration_success_time_ms"
            X.C18270x1.A0i(r6, r2, r0)
            java.lang.String r0 = "RegistrationManager/completeChangeNumber"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.Me r2 = r13.A03()
            java.lang.String r0 = r2.jabber_id
            boolean r0 = X.AnonymousClass000.A1W(r0)
            com.whatsapp.util.Log.a((boolean) r0)
            X.2sr r1 = r13.A0I
            r1.A0P()
            java.lang.String r0 = "me"
            boolean r0 = r1.A0Z(r2, r0)
            if (r0 == 0) goto L_0x00e9
            r1.A0R(r2)
            X.3dV r0 = r13.A0h
            boolean r2 = X.C72303dV.A00(r0)
            if (r2 != 0) goto L_0x0064
            X.2q5 r1 = r13.A0g
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = "RegistrationManager/completeChangeNumber/msgstoredb/healthy"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2sA r0 = r13.A0f
            r0.A08(r8)
            r1.A02()
        L_0x0064:
            r13.A07()
            X.3Lt r0 = X.AnonymousClass0x9.A0S(r4)
            r0.A04()
            if (r2 != 0) goto L_0x0075
            X.3Cq r0 = r13.A0V
            r0.A05()
        L_0x0075:
            r1 = 3
            r0 = 1
            r13.A0B(r1, r0)
            byte[] r0 = new byte[r8]
            r3.A23(r0)
            X.0N6 r0 = r13.A0Q
            X.0vR r0 = r0.A00()
            X.0hV r0 = (X.C10170hV) r0
            X.3DW r0 = r0.A08
            r9 = 1
            r0.A00 = r9
            X.2oU r0 = r13.A0a
            android.content.Context r0 = r0.A00
            X.C06550Ye.A0C(r0)
            java.lang.String r0 = "RegistrationManager/completeChangeNumber/changenumber/setregverified"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Cq r0 = r13.A0V
            r0.A06()
            X.9dq r0 = r13.A0s
            r0.A01(r9, r8)
            java.lang.String r0 = "RegistrationManager/completeChangeNumber/reinitalized-payments"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Mh r0 = r13.A0L
            java.lang.Class<X.3Mh> r7 = X.C66663Mh.class
            monitor-enter(r7)
            android.content.SharedPreferences r0 = r0.A00     // Catch:{ all -> 0x00e6 }
            android.content.SharedPreferences$Editor r6 = r0.edit()     // Catch:{ all -> 0x00e6 }
            java.lang.String r2 = "groups_server_props_last_refresh_time"
            r0 = 0
            X.C18270x1.A0i(r6, r2, r0)     // Catch:{ all -> 0x00e6 }
            monitor-exit(r7)     // Catch:{ all -> 0x00e6 }
            X.4FS r2 = r13.A0z
            r1 = 45
            X.3Zp r0 = new X.3Zp
            r0.<init>(r13, r1)
            r2.BkM(r0)
            X.2xS r1 = r13.A0y
            r1.A01(r9)
            r0 = 2
            r1.A01(r0)
            r5.A00()
            X.2sq r0 = r13.A0R
            r0.A09()
            r0 = 3
            r3.A16(r0)
            X.3Lt r7 = X.AnonymousClass0x9.A0S(r4)
            r11 = r8
            r12 = r8
            r10 = r8
            r7.A09(r8, r9, r10, r11, r12)
            return r9
        L_0x00e6:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00e6 }
            throw r0
        L_0x00e9:
            java.lang.String r0 = "RegistrationManager/completeChangeNumber/error-saving"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass317.A0E():boolean");
    }

    public boolean A0F() {
        Log.i("RegistrationManager/revertToOldNumber");
        C56972sr r3 = this.A0I;
        Me A0E2 = r3.A0E();
        r3.A0P();
        if (!r3.A0Z(A0E2, "me")) {
            return false;
        }
        r3.A0R(A0E2);
        AnonymousClass33p r0 = this.A0c;
        r0.A1t(false);
        r0.A1s(false);
        r3.A0O();
        C53962nx r1 = this.A0G;
        Log.i("ChangeNumberManager/deleteChangeNumberContacts");
        C18310x6.A1F(C54292oU.A03(r1.A02), "change_number_contacts.json");
        C55272q5 r2 = this.A0g;
        if (r2.A05()) {
            Log.i("RegistrationManager/revertToOldNumber/msgstoredb/healthy");
            this.A0f.A08(false);
            r2.A02();
            AnonymousClass0x9.A0S(this.A11).A04();
            this.A0V.A05();
            return true;
        }
        AnonymousClass0x9.A0S(this.A11).A05();
        return true;
    }

    public static String A00(Context context, String str) {
        String packageName = context.getPackageName();
        int length = packageName.length();
        if (!str.startsWith(packageName) || str.length() <= length || str.charAt(length) != '.') {
            return str;
        }
        return str.substring(length + 1);
    }

    public Intent A01() {
        A08();
        C54042o5 r2 = this.A0K;
        r2.A01 = false;
        r2.A00 = null;
        r2.A07.A1h((String) null, (String) null);
        C56962sq r8 = this.A0R;
        r8.A08();
        boolean A1U = C18300x5.A1U(this.A11);
        C56972sr r3 = this.A0I;
        AnonymousClass1RR A012 = C56972sr.A01(r3);
        if (A012 != null) {
            C55052pi r1 = this.A0U;
            r1.A06.A03(A012);
            r1.A00(A012, A1U ? 1 : 0, A1U);
        }
        Context context = this.A0a.A00;
        File A0A2 = AnonymousClass002.A0A(context.getFilesDir(), "me");
        if (A0A2.exists()) {
            C18260x0.A1D("RegistrationManager/reregister/rm-me ", AnonymousClass001.A0o(), A0A2.delete());
        }
        r3.A0M();
        A0D((String) null, (String) null, (String) null);
        this.A0i.A00();
        Intent A052 = C627736r.A05(context);
        A052.addFlags(32768);
        C116985rC r12 = this.A05;
        if (r12.A07()) {
            ((C183538qC) r12.A04()).get();
            throw AnonymousClass001.A0g("clearAllStoredData");
        }
        C116985rC r13 = this.A02;
        if (r13.A07()) {
            ((C183538qC) r13.A04()).get();
            throw AnonymousClass001.A0g("clearAllStoredData");
        }
        A0B(1, true);
        ((C66453Lm) this.A10.get()).A08();
        AnonymousClass33X r0 = this.A0u;
        r0.A03();
        r0.A06();
        this.A0h.A08 = A1U;
        ((C10170hV) this.A0Q.A00()).A08.A00 = true;
        C06550Ye.A0C(context);
        AnonymousClass33p r4 = this.A0c;
        r4.A0u();
        if (r4.A2E() && !r4.A2F()) {
            r4.A1w(true);
        }
        this.A0z.BkM(new C70033Zp(this, 47));
        r8.A09();
        r4.A1z(true);
        this.A0v.A08(A1U);
        SharedPreferences.Editor A032 = C18270x1.A03(r4);
        A032.remove("show_pre_reg_do_not_share_code_warning");
        A032.apply();
        r4.A20(A1U);
        C18270x1.A0j(C18270x1.A03(r4), "contact_qr_code", (String) null);
        C18270x1.A0l(C18270x1.A03(r4), "support_ban_appeal_screen_before_verification", A1U);
        C18270x1.A0j(C18270x1.A03(r4), "logout_message_header", (String) null);
        C18270x1.A0j(C18270x1.A03(r4), "logout_message_subtext", (String) null);
        C18270x1.A0j(C18270x1.A03(r4), "logout_message_locale", (String) null);
        C18270x1.A0j(C18270x1.A03(r4), "main_button_text", (String) null);
        C18270x1.A0j(C18270x1.A03(r4), "main_button_url", (String) null);
        C18270x1.A0j(C18270x1.A03(r4), "secondary_button_text", (String) null);
        C18270x1.A0j(C18270x1.A03(r4), "secondary_button_url", (String) null);
        C48962fl A002 = this.A0W.A00();
        if (A002.A02) {
            A002.A00().BEg();
        } else {
            AnonymousClass4FC r14 = A002.A00;
            if (r14 != null && !r14.isFinishing()) {
                r14.BEg();
                return A052;
            }
        }
        return A052;
    }

    public void A0C(long j) {
        if (j >= 60000) {
            if (!this.A0X.A02(C624735e.A03(this.A0a.A00, C18280x3.A0B("com.whatsapp.alarm.REGISTRATION_RETRY"), 0), 2, SystemClock.elapsedRealtime() + j)) {
                Log.w("RegistrationManager/startRegistrationRetryAlarm AlarmManager is null");
            }
        }
    }

    public boolean A0G() {
        Me A032 = A03();
        if (A032.jabber_id == null) {
            return false;
        }
        this.A0I.A0R(A032);
        C183538qC r2 = this.A11;
        AnonymousClass0x9.A0S(r2).A0z = true;
        Log.i("RegistrationManager/startPassiveConnectionBeforeRestore/finishRegistration/set-connection/passive");
        A07();
        AnonymousClass0x9.A0S(r2).A04();
        return true;
    }

    public AnonymousClass317(C116985rC r2, C116985rC r3, C116985rC r4, C116985rC r5, C116985rC r6, C116985rC r7, C116985rC r8, C116985rC r9, C116985rC r10, C116985rC r11, C116985rC r12, C116985rC r13, C116985rC r14, C29171iO r15, C53962nx r16, C69263Wi r17, C56972sr r18, C29021i9 r19, C54042o5 r20, C66663Mh r21, C49712gy r22, AnonymousClass3DP r23, C47812dr r24, C614930z r25, AnonymousClass0N6 r26, C56962sq r27, C65203Gp r28, C56422rx r29, C55052pi r30, C64223Cq r31, C44382Vv r32, C50862it r33, C620633i r34, C56612sH r35, C54292oU r36, AnonymousClass33T r37, AnonymousClass33p r38, C54412og r39, C620733j r40, C56542sA r41, C55272q5 r42, C72303dV r43, C47322d4 r44, C29041iB r45, AnonymousClass308 r46, AnonymousClass1VW r47, AnonymousClass1VX r48, C56142rU r49, C66493Lq r50, AnonymousClass31C r51, AnonymousClass33S r52, C619933b r53, C197769dq r54, C60152y5 r55, AnonymousClass33X r56, C28861ht r57, C51072jE r58, C55092pm r59, C59772xS r60, AnonymousClass4FS r61, C183538qC r62, C183538qC r63, Set set) {
        this.A0a = r36;
        this.A0Z = r35;
        this.A0m = r48;
        this.A0A = r2;
        this.A0H = r17;
        this.A0K = r20;
        this.A0X = r33;
        this.A0I = r18;
        this.A0z = r61;
        this.A10 = r62;
        this.A0B = r3;
        this.A0f = r41;
        this.A0q = r52;
        this.A0L = r21;
        this.A0S = r28;
        this.A0v = r57;
        this.A0M = r22;
        this.A0Q = r26;
        this.A0p = r51;
        this.A11 = r63;
        this.A09 = r4;
        this.A0n = r49;
        this.A0Y = r34;
        this.A0e = r40;
        this.A0l = r47;
        this.A0P = r25;
        this.A0R = r27;
        this.A0o = r50;
        this.A0J = r19;
        this.A0u = r56;
        this.A0N = r23;
        this.A0V = r31;
        this.A0k = r46;
        this.A0G = r16;
        this.A0U = r30;
        this.A0h = r43;
        this.A07 = r7;
        this.A0E = r8;
        this.A0T = r29;
        this.A0c = r38;
        this.A0r = r53;
        this.A02 = r10;
        this.A0x = r59;
        this.A0b = r37;
        this.A0j = r45;
        this.A0C = r5;
        this.A0D = r6;
        this.A04 = r9;
        this.A05 = r11;
        this.A0s = r54;
        this.A0w = r58;
        this.A0t = r55;
        this.A0F = r15;
        this.A0y = r60;
        this.A0i = r44;
        this.A0d = r39;
        this.A06 = r12;
        this.A0g = r42;
        this.A0O = r24;
        this.A0W = r32;
        this.A03 = r13;
        this.A13 = set;
        this.A08 = r14;
    }
}
