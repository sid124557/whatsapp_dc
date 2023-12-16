package X;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Date;
import java.util.Iterator;

/* renamed from: X.30H  reason: invalid class name */
public class AnonymousClass30H {
    public final C116985rC A00;
    public final C116985rC A01;
    public final C116985rC A02;
    public final AnonymousClass31B A03;
    public final C55682qk A04;
    public final C69263Wi A05;
    public final C65193Go A06;
    public final C56972sr A07;
    public final AnonymousClass36E A08;
    public final C29021i9 A09;
    public final C55492qR A0A;
    public final AnonymousClass3FK A0B;
    public final C29411im A0C;
    public final AnonymousClass0XM A0D;
    public final C620433g A0E;
    public final AnonymousClass3H2 A0F;
    public final C47872dy A0G;
    public final C56422rx A0H;
    public final AnonymousClass314 A0I;
    public final C44382Vv A0J;
    public final C55262q4 A0K;
    public final C56612sH A0L;
    public final C54292oU A0M;
    public final AnonymousClass33p A0N;
    public final C54412og A0O;
    public final C621133n A0P;
    public final C66543Lv A0Q;
    public final C72303dV A0R;
    public final AnonymousClass36F A0S;
    public final C55332qB A0T;
    public final C620333f A0U;
    public final AnonymousClass1VX A0V;
    public final AnonymousClass4FV A0W;
    public final AnonymousClass27P A0X;
    public final C56232re A0Y;
    public final AnonymousClass2UH A0Z;
    public final C52552lf A0a;
    public final AnonymousClass31C A0b;
    public final C66523Lt A0c;
    public final AnonymousClass2U7 A0d;
    public final AnonymousClass33S A0e;
    public final C45342Zq A0f;
    public final C619933b A0g;
    public final C55602qc A0h;
    public final C48202eW A0i;
    public final AnonymousClass3S3 A0j;
    public final C50032hW A0k;
    public final C194639Tx A0l;
    public final C50532iK A0m;
    public final C42642Oy A0n;
    public final C28861ht A0o;
    public final AnonymousClass317 A0p;
    public final C29011i8 A0q;
    public final C54622p1 A0r;
    public final C55832qz A0s;
    public final C69183Wa A0t;
    public final C49262gF A0u;
    public final C45602aH A0v;
    public final AnonymousClass33M A0w = new AnonymousClass33M(true);
    public final AnonymousClass4FS A0x;
    public final C55142pr A0y;
    public final C183538qC A0z;
    public final C183538qC A10;

    public void A00() {
        C29411im r3 = this.A0C;
        Log.d("XmppStateManager/onHandlerDisconnected");
        boolean A1U = AnonymousClass000.A1U(r3.A04, 2);
        r3.A04 = 3;
        r3.A05 = false;
        r3.A02.close();
        C626936e.A01();
        Iterator A032 = C61102zi.A03(r3);
        while (A032.hasNext()) {
            ((AnonymousClass4F2) A032.next()).BUD();
        }
        C50032hW r10 = this.A0k;
        r10.A00 = false;
        C42642Oy r0 = this.A0n;
        r0.A01 = false;
        r0.A00 = 0;
        Log.i("server disconnected");
        AnonymousClass33p r5 = this.A0N;
        boolean A1W = C18280x3.A1W(AnonymousClass0x2.A0F(r5), "spam_banned");
        C18260x0.A1D("wa-shared-prefs/getspambanned ", AnonymousClass001.A0o(), A1W);
        if (A1W) {
            Context context = this.A0M.A00;
            long A0A2 = AnonymousClass0x2.A0A(AnonymousClass0x2.A0F(r5), "spam_banned_expiry_timestamp");
            C18260x0.A10("wa-shared-prefs/getspambanned ", AnonymousClass001.A0o(), A0A2);
            long j = -1;
            if (A0A2 != -1) {
                A0A2 = C18280x3.A08(A0A2, System.currentTimeMillis());
            }
            if (A0A2 > 0) {
                j = A0A2;
            }
            Intent A072 = C18320x8.A07();
            A072.setClassName(context.getPackageName(), "com.whatsapp.spamwarning.SpamWarningActivity");
            A072.putExtra("expiry_in_seconds", (int) j);
            if (!TextUtils.isEmpty((CharSequence) null)) {
                A072.putExtra("spam_warning_message_key", (String) null);
            }
            if (!TextUtils.isEmpty((CharSequence) null)) {
                A072.putExtra("faq_url_key", (String) null);
            }
            C18280x3.A0n(context, A072);
        }
        C29011i8 r4 = this.A0q;
        r4.A02 = false;
        Log.i("routeselector/cancelrouterequesttimer");
        r4.A04.removeMessages(0);
        this.A0j.A04();
        if (A1U) {
            C45602aH r32 = this.A0v;
            r32.A00.A00();
            r32.A01.A00();
            r32.A02.A00();
        }
        int i = this.A0i.A00;
        if (i == 2) {
            this.A0h.A01();
        } else if (i == 1 && A1U) {
            long j2 = this.A0c.A03;
            if (j2 <= 0 || SystemClock.elapsedRealtime() >= j2) {
                r10.A00();
            }
        }
    }

    public void A01() {
        Log.i("message-handler-callback/ready");
        boolean A1W = C18280x3.A1W(AnonymousClass0x2.A0F(this.A0N), "refresh_broadcast_lists");
        C18260x0.A1D("app/getshouldrefreshbroadcastlists ", AnonymousClass001.A0o(), A1W);
        if (A1W) {
            this.A0f.A00();
        }
    }

    public void A02() {
        C29411im r1 = this.A0C;
        Log.d("XmppStateManager/onHandlerStopped");
        r1.A04 = 4;
        C626936e.A01();
        Iterator A032 = C61102zi.A03(r1);
        while (A032.hasNext()) {
            ((AnonymousClass4F2) A032.next()).BUF();
        }
    }

    public final void A03() {
        AnonymousClass4FU r2 = this.A05.A00;
        if (r2 == null || !C621533t.A03(r2, this.A0c, this.A0g)) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("message-handler-callback/handlerconnected/displaysoftwareexpired/notification ");
            A0o2.append(new Date());
            C18290x4.A1Q(A0o2, " ");
            AnonymousClass0x2.A19(A0o2);
            Context context = this.A0M.A00;
            this.A0u.A01(AnonymousClass002.A0F(context, context.getString(R.string.f11nameremoved), new Object[1], 0, R.string.f11nameremoved), AnonymousClass002.A0F(context, context.getString(R.string.f11nameremoved), new Object[1], 0, R.string.f11nameremoved), 2, true);
            this.A0g.A03 = true;
        }
    }

    public final void A04(AnonymousClass24H r5) {
        AnonymousClass33p r3 = this.A0N;
        C18270x1.A0j(C18270x1.A03(r3), "logout_message_header", r5.logoutMessageHeader);
        C18270x1.A0j(C18270x1.A03(r3), "logout_message_subtext", r5.logoutMessageSubtext);
        C18270x1.A0j(C18270x1.A03(r3), "logout_message_locale", r5.logoutMessageLocale);
        C18270x1.A0j(C18270x1.A03(r3), "main_button_text", r5.logoutMainButtonText);
        C18270x1.A0j(C18270x1.A03(r3), "main_button_url", r5.logoutMainButtonUrl);
        C18270x1.A0j(C18270x1.A03(r3), "secondary_button_text", r5.logoutSecondaryButtonText);
        C18270x1.A0j(C18270x1.A03(r3), "secondary_button_url", r5.logoutSecondaryButtonUrl);
    }

    public AnonymousClass30H(C116985rC r21, C116985rC r22, C116985rC r23, AnonymousClass31B r24, C55682qk r25, C69263Wi r26, AnonymousClass32O r27, C65193Go r28, C56972sr r29, AnonymousClass36E r30, C29021i9 r31, C55492qR r32, AnonymousClass3FK r33, C29411im r34, C28911hy r35, AnonymousClass0XM r36, C620433g r37, C29301ib r38, AnonymousClass3H2 r39, C47872dy r40, C56422rx r41, C64223Cq r42, AnonymousClass314 r43, C44382Vv r44, C55262q4 r45, C56612sH r46, C54292oU r47, AnonymousClass33p r48, C54412og r49, C621133n r50, C66473Lo r51, C66543Lv r52, C72303dV r53, AnonymousClass36F r54, C55332qB r55, C56662sM r56, C620333f r57, AnonymousClass1VX r58, AnonymousClass4FV r59, AnonymousClass27P r60, C56232re r61, AnonymousClass2UH r62, C52552lf r63, AnonymousClass31C r64, C66523Lt r65, AnonymousClass33S r66, C45342Zq r67, C55892r5 r68, C619933b r69, C55602qc r70, C48202eW r71, AnonymousClass3S3 r72, C50032hW r73, C194639Tx r74, C50532iK r75, C42642Oy r76, C28861ht r77, AnonymousClass317 r78, C29011i8 r79, C54622p1 r80, C55832qz r81, C69183Wa r82, AnonymousClass4BY r83, C49262gF r84, C45602aH r85, AnonymousClass4FS r86, C55142pr r87, C183538qC r88, C183538qC r89) {
        this.A0M = r47;
        this.A0L = r46;
        this.A0V = r58;
        C69263Wi r6 = r26;
        this.A05 = r6;
        C55682qk r5 = r25;
        this.A04 = r5;
        this.A07 = r29;
        AnonymousClass4FS r1 = r86;
        this.A0x = r1;
        this.A0z = r88;
        this.A0W = r59;
        AnonymousClass33S r15 = r66;
        this.A0e = r15;
        this.A0y = r87;
        this.A03 = r24;
        this.A0o = r77;
        this.A0u = r84;
        this.A0b = r64;
        this.A0q = r79;
        this.A08 = r30;
        this.A0B = r33;
        this.A0n = r76;
        this.A0i = r71;
        AnonymousClass3S3 r3 = r72;
        this.A0j = r3;
        this.A10 = r89;
        this.A0Q = r52;
        this.A0s = r81;
        this.A0v = r85;
        this.A0r = r80;
        this.A0a = r63;
        this.A09 = r31;
        this.A0C = r34;
        this.A0D = r36;
        this.A0h = r70;
        this.A0P = r50;
        this.A0m = r75;
        this.A0X = r60;
        this.A06 = r28;
        this.A0U = r57;
        this.A0g = r69;
        C72303dV r12 = r53;
        this.A0R = r12;
        this.A0l = r74;
        this.A0k = r73;
        this.A0p = r78;
        this.A02 = r21;
        this.A0t = r82;
        this.A0H = r41;
        this.A0N = r48;
        this.A0f = r67;
        this.A0I = r43;
        C66523Lt r14 = r65;
        this.A0c = r14;
        this.A0T = r55;
        this.A0A = r32;
        this.A0E = r37;
        this.A01 = r22;
        this.A0S = r54;
        this.A0Y = r61;
        this.A0Z = r62;
        this.A0O = r49;
        this.A0G = r40;
        this.A0K = r45;
        this.A0F = r39;
        this.A0J = r44;
        this.A00 = r23;
        this.A0d = new AnonymousClass2U7(r5, r6, r27, r35, r38, r42, r51, r12, r56, r14, r15, r68, r3, r83, r1);
    }
}
