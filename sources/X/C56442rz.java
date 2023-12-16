package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.calling.service.VoiceFGService;
import com.whatsapp.voipcalling.CallState;

/* renamed from: X.2rz  reason: invalid class name and case insensitive filesystem */
public class C56442rz {
    public final C29171iO A00;
    public final C55682qk A01;
    public final C56972sr A02;
    public final C51292ja A03;
    public final AnonymousClass5UX A04;
    public final C64773Ex A05;
    public final AnonymousClass5ZU A06;
    public final C56332ro A07;
    public final C114015mM A08;
    public final C613330g A09;
    public final C620633i A0A;
    public final C54292oU A0B;
    public final AnonymousClass33T A0C;
    public final AnonymousClass1VX A0D;
    public final C66493Lq A0E;
    public final AnonymousClass1R1 A0F;
    public final C56572sD A0G;
    public final C187958y5 A0H;
    public final AnonymousClass4FS A0I;

    public final PendingIntent A01(Context context, C58962w6 r7, int i, boolean z) {
        Intent A022;
        String str;
        if (!r7.A09) {
            int i2 = 3;
            if (r7.A0E) {
                i2 = 10;
            }
            A022 = new C627736r().A1S(context, r7.A05, i2, !this.A00.A00);
            A022.putExtra("fgservice_start_failed", z);
        } else {
            A022 = A02(context, r7, i, z);
            A022.putExtra("lobbyEntryPoint", 2);
            if (r7.A0E) {
                str = "com.whatsapp.intent.action.SHOW_INCOMING_PENDING_CALL_ON_LOCK_SCREEN";
            } else {
                str = "join_call";
            }
            A022.setAction(str);
        }
        return C624735e.A04(context, A022, 2);
    }

    public Intent A02(Context context, C58962w6 r6, int i, boolean z) {
        Intent A1Q = new C627736r().A1Q(context, r6.A03, C18320x8.A0V(this.A00.A00));
        String str = r6.A05;
        A1Q.setData(Uri.parse(str));
        A1Q.putExtra("notification_type", i);
        A1Q.putExtra("call_id", str);
        if (r6.A0E) {
            A1Q.setAction("com.whatsapp.intent.action.SHOW_INCOMING_PENDING_CALL_ON_LOCK_SCREEN");
        }
        if (r6.A0B && r6.A04 == CallState.NONE) {
            A1Q.putExtra("joinable", true);
        }
        A1Q.putExtra("fgservice_start_failed", z);
        return A1Q;
    }

    public final String A03(Context context, C58962w6 r7, C112515jr r8, String str, boolean z) {
        C150477Qw A042;
        if (str != null) {
            return str;
        }
        if (!r7.A09) {
            return C106815aD.A02(this.A06.A0H(this.A05.A0A(r7.A03)));
        } else if ((r7.A01 <= 0 || A07(r7, r8, z)) && (A042 = C107305b5.A04(this.A05, this.A06, r7.A06, 2, false)) != null) {
            return A042.A00(context).toString();
        } else {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007d, code lost:
        if (r0 != false) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A04(android.content.Context r9, X.C58962w6 r10, boolean r11) {
        /*
            r8 = this;
            long r0 = r10.A01
            boolean r3 = r10.A08
            boolean r2 = r10.A0C
            if (r2 == 0) goto L_0x0010
            r1 = 2131895394(0x7f122462, float:1.942562E38)
        L_0x000b:
            java.lang.String r0 = r9.getString(r1)
            return r0
        L_0x0010:
            r6 = 0
            r4 = 0
            r5 = 1
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0070
            boolean r0 = r10.A09
            if (r0 != 0) goto L_0x0027
            boolean r0 = r10.A0F
            r1 = 2131895230(0x7f1223be, float:1.9425287E38)
            if (r0 == 0) goto L_0x000b
            r1 = 2131891399(0x7f1214c7, float:1.9417517E38)
            goto L_0x000b
        L_0x0027:
            int r2 = r10.A00
            if (r2 < 0) goto L_0x0046
            boolean r0 = r10.A07
            if (r0 == 0) goto L_0x003b
            r1 = 2131755400(0x7f100188, float:1.9141678E38)
        L_0x0032:
            android.content.res.Resources r0 = r9.getResources()
            java.lang.String r0 = X.AnonymousClass0x2.A0Y(r0, r2, r4, r1)
            return r0
        L_0x003b:
            boolean r0 = r10.A0F
            r1 = 2131755401(0x7f100189, float:1.914168E38)
            if (r0 == 0) goto L_0x0032
            r1 = 2131755391(0x7f10017f, float:1.914166E38)
            goto L_0x0032
        L_0x0046:
            boolean r0 = r10.A0A
            if (r0 == 0) goto L_0x005d
            boolean r0 = r10.A07
            if (r0 == 0) goto L_0x0052
            r1 = 2131891342(0x7f12148e, float:1.9417401E38)
            goto L_0x000b
        L_0x0052:
            boolean r0 = r10.A0F
            r1 = 2131891341(0x7f12148d, float:1.94174E38)
            if (r0 == 0) goto L_0x000b
            r1 = 2131891340(0x7f12148c, float:1.9417397E38)
            goto L_0x000b
        L_0x005d:
            boolean r0 = r10.A0F
            if (r0 == 0) goto L_0x0065
            r1 = 2131891397(0x7f1214c5, float:1.9417513E38)
            goto L_0x000b
        L_0x0065:
            boolean r0 = r10.A07
            r1 = 2131891398(0x7f1214c6, float:1.9417515E38)
            if (r0 == 0) goto L_0x000b
            r1 = 2131891401(0x7f1214c9, float:1.941752E38)
            goto L_0x000b
        L_0x0070:
            if (r3 == 0) goto L_0x0083
            com.whatsapp.voipcalling.CallState r1 = r10.A04
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRE_ACCEPT_RECEIVED
            if (r1 != r0) goto L_0x007f
            boolean r0 = r10.A0D
            r1 = 2131893262(0x7f121c0e, float:1.9421296E38)
            if (r0 == 0) goto L_0x000b
        L_0x007f:
            r1 = 2131887398(0x7f120526, float:1.9409402E38)
            goto L_0x000b
        L_0x0083:
            boolean r0 = r10.A07
            if (r0 == 0) goto L_0x00a9
            X.1VX r1 = r8.A0D
            X.2sr r0 = r8.A02
            boolean r0 = X.C627436k.A09(r0, r1)
            if (r0 == 0) goto L_0x00a9
            X.3Ex r1 = r8.A05
            com.whatsapp.jid.UserJid r0 = r10.A03
            X.3ZH r3 = r1.A0A(r0)
            r2 = 2131890566(0x7f121186, float:1.9415827E38)
        L_0x009c:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            X.5ZU r0 = r8.A06
            java.lang.String r0 = X.C18300x5.A0h(r0, r3)
            java.lang.String r0 = X.AnonymousClass002.A0F(r9, r0, r1, r4, r2)
            return r0
        L_0x00a9:
            boolean r0 = r10.A09
            if (r0 == 0) goto L_0x00f0
            java.util.List r0 = r10.A06
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00f0
            if (r11 == 0) goto L_0x00ca
            X.3Ex r1 = r8.A05
            com.whatsapp.jid.UserJid r0 = r10.A03
            X.3ZH r3 = r1.A0A(r0)
            boolean r0 = r10.A0F
            r2 = 2131889334(0x7f120cb6, float:1.9413329E38)
            if (r0 == 0) goto L_0x009c
            r2 = 2131889332(0x7f120cb4, float:1.9413325E38)
            goto L_0x009c
        L_0x00ca:
            boolean r0 = r10.A0B
            if (r0 == 0) goto L_0x00d8
            com.whatsapp.voipcalling.CallState r1 = r10.A04
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x00e4
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE_ELSEWHERE
            if (r1 == r0) goto L_0x00e4
        L_0x00d8:
            boolean r0 = r10.A0F
            r1 = 2131890168(0x7f120ff8, float:1.941502E38)
            if (r0 == 0) goto L_0x000b
            r1 = 2131890166(0x7f120ff6, float:1.9415016E38)
            goto L_0x000b
        L_0x00e4:
            boolean r0 = r10.A0F
            r1 = 2131895367(0x7f122447, float:1.9425565E38)
            if (r0 == 0) goto L_0x000b
            r1 = 2131895364(0x7f122444, float:1.9425559E38)
            goto L_0x000b
        L_0x00f0:
            boolean r0 = r10.A0F
            r1 = 2131890170(0x7f120ffa, float:1.9415024E38)
            if (r0 == 0) goto L_0x000b
            r1 = 2131895027(0x7f1222f3, float:1.9424875E38)
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56442rz.A04(android.content.Context, X.2w6, boolean):java.lang.String");
    }

    public final void A05(Notification.Builder builder, Context context, C58962w6 r8, String str, int i) {
        Notification.CallStyle forOngoingCall;
        if (r8.A01 > 0 || r8.A08) {
            Person build = new Person.Builder().setName(str).build();
            Intent A082 = AnonymousClass0x9.A08(context, VoiceFGService.class);
            A082.setAction("hangup_call");
            A082.putExtra("end_call_reason", 1);
            forOngoingCall = Notification.CallStyle.forOngoingCall(build, C624735e.A05(context, A082, 134217728));
        } else {
            Person build2 = new Person.Builder().setName(str).build();
            Intent A083 = AnonymousClass0x9.A08(context, VoiceFGService.class);
            A083.setAction("reject_call");
            A083.putExtra("call_id", r8.A05);
            int i2 = 4;
            if (r8.A0E) {
                i2 = 11;
            }
            A083.putExtra("call_ui_action", i2);
            forOngoingCall = Notification.CallStyle.forIncomingCall(build2, C624735e.A05(context, A083, 134217728), A01(context, r8, i, false));
        }
        forOngoingCall.setIsVideo(r8.A0F);
        builder.setStyle(forOngoingCall);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.C05610Ue r7, X.C58962w6 r8, X.AnonymousClass3ZH r9, int r10) {
        /*
            r6 = this;
            r3 = 26
            r2 = 1
            if (r10 == r2) goto L_0x0013
            boolean r0 = r8.A0B
            if (r0 == 0) goto L_0x0095
            com.whatsapp.voipcalling.CallState r1 = r8.A04
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0013
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE_ELSEWHERE
            if (r1 != r0) goto L_0x0095
        L_0x0013:
            r7.A03 = r2
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r3) goto L_0x0033
            boolean r0 = r8.A07
            if (r0 == 0) goto L_0x008c
            com.whatsapp.voipcalling.CallState r1 = r8.A04
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 != r0) goto L_0x008c
            X.2ja r1 = r6.A03
            X.1R1 r0 = r6.A0F
            java.lang.String r1 = r1.A00(r9, r0)
        L_0x002b:
            boolean r0 = X.C159707mK.A00(r1)
        L_0x002f:
            if (r0 != 0) goto L_0x0033
            r7.A0K = r1
        L_0x0033:
            X.1VX r2 = r6.A0D
            r1 = 5892(0x1704, float:8.256E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0074
            X.2sr r0 = r6.A02
            boolean r0 = r0.A0Y()
            if (r0 != 0) goto L_0x0073
            X.2k5 r0 = r9.A0F
            if (r0 == 0) goto L_0x0073
            java.lang.String r5 = r0.A01
            if (r5 == 0) goto L_0x0073
            long r3 = r0.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0073
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "tel:"
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r5, r1)
            X.0Ma r0 = new X.0Ma
            r0.<init>()
            r0.A03 = r1
            X.0Of r1 = new X.0Of
            r1.<init>(r0)
            java.util.ArrayList r0 = r7.A0R
            r0.add(r1)
        L_0x0073:
            return
        L_0x0074:
            X.33i r0 = r6.A0A
            X.5UR r1 = r0.A0R()
            if (r1 == 0) goto L_0x00ba
            X.3Ex r0 = r6.A05
            android.net.Uri r0 = r0.A03(r9, r1)
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = r0.toString()
            r7.A0D(r0)
            return
        L_0x008c:
            X.2ja r1 = r6.A03
            X.1R1 r0 = r6.A0F
            java.lang.String r1 = r1.A02(r9, r0)
            goto L_0x002b
        L_0x0095:
            r0 = 2
            if (r10 != r0) goto L_0x00a9
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r3) goto L_0x0033
            X.2ja r1 = r6.A03
            X.1R1 r0 = r6.A0F
            java.lang.String r1 = r1.A01(r9, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            goto L_0x002f
        L_0x00a9:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "UNKNOWN NOTIFICATION TYPE "
            r1.append(r0)
            r1.append(r10)
            X.C18270x1.A0z(r1)
            goto L_0x0033
        L_0x00ba:
            java.lang.String r0 = "voip/CallNotificationBuilder/addContactToNotification cr == null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56442rz.A06(X.0Ue, X.2w6, X.3ZH, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r9.A0D.A0Y(X.C58422vE.A02, 4809) == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r12 != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r9.A0D.A0Y(X.C58422vE.A02, 4810) == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A07(X.C58962w6 r10, X.C112515jr r11, boolean r12) {
        /*
            r9 = this;
            boolean r4 = r10.A08
            r5 = 0
            r8 = 1
            r3 = 0
            if (r4 != 0) goto L_0x001f
            long r0 = r10.A01
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x001f
            boolean r0 = r10.A07
            if (r0 != 0) goto L_0x001f
            X.1VX r2 = r9.A0D
            r1 = 4810(0x12ca, float:6.74E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            r7 = 1
            if (r0 != 0) goto L_0x0020
        L_0x001f:
            r7 = 0
        L_0x0020:
            long r0 = r10.A01
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0028
            if (r4 == 0) goto L_0x0035
        L_0x0028:
            X.1VX r2 = r9.A0D
            r1 = 4809(0x12c9, float:6.739E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            r6 = 1
            if (r0 != 0) goto L_0x0036
        L_0x0035:
            r6 = 0
        L_0x0036:
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.A03
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0041
            r5 = 0
            if (r12 == 0) goto L_0x0042
        L_0x0041:
            r5 = 1
        L_0x0042:
            X.2ja r4 = r9.A03
            X.1VX r2 = r4.A01
            r1 = 6307(0x18a3, float:8.838E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0080
            X.33T r0 = r4.A00
            X.0Tx r0 = r0.A00
            boolean r1 = r0.A01()
        L_0x0058:
            if (r6 != 0) goto L_0x006f
            if (r7 != 0) goto L_0x006f
            if (r5 == 0) goto L_0x007e
        L_0x005e:
            boolean r0 = X.C107385bE.A09()
            if (r0 == 0) goto L_0x007e
            int r0 = r10.A00
            if (r0 >= 0) goto L_0x007e
            if (r7 != 0) goto L_0x006c
            if (r6 == 0) goto L_0x007e
        L_0x006c:
            if (r1 == 0) goto L_0x007e
            return r8
        L_0x006f:
            if (r5 != 0) goto L_0x005e
            java.lang.String r0 = "CallNotificationBuilder/shouldApplyCallStyle/ callStyle not applied"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2qk r2 = r9.A01
            java.lang.String r1 = "call-notification-callstyle-not-applied"
            r0 = 0
            r2.A0A(r1, r3, r0)
        L_0x007e:
            r8 = 0
            return r8
        L_0x0080:
            r1 = 1
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56442rz.A07(X.2w6, X.5jr, boolean):boolean");
    }

    public C56442rz(C29171iO r2, C55682qk r3, C56972sr r4, C51292ja r5, AnonymousClass5UX r6, C64773Ex r7, AnonymousClass5ZU r8, C56332ro r9, C114015mM r10, C613330g r11, C620633i r12, C54292oU r13, AnonymousClass33T r14, AnonymousClass1VX r15, C66493Lq r16, AnonymousClass1R1 r17, C56572sD r18, C187958y5 r19, AnonymousClass4FS r20) {
        this.A0D = r15;
        this.A01 = r3;
        this.A02 = r4;
        this.A0B = r13;
        this.A0I = r20;
        this.A0G = r18;
        this.A08 = r10;
        this.A04 = r6;
        this.A05 = r7;
        this.A0H = r19;
        this.A0A = r12;
        this.A06 = r8;
        this.A0E = r16;
        this.A0F = r17;
        this.A07 = r9;
        this.A0C = r14;
        this.A00 = r2;
        this.A09 = r11;
        this.A03 = r5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v82, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v83, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v90, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v91, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v93, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v96, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v135, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v136, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r13v6, types: [com.whatsapp.jid.UserJid] */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03ab, code lost:
        if (X.C107535bT.A0B() == false) goto L_0x04ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03bd, code lost:
        if (r2 == com.whatsapp.voipcalling.CallState.ACTIVE_ELSEWHERE) goto L_0x03bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0422, code lost:
        if (r8.A06.size() != 0) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0208, code lost:
        if (r8.A00 >= 0) goto L_0x020a;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Notification A00(android.content.Context r40, X.C58962w6 r41, X.C112515jr r42, int r43, boolean r44) {
        /*
            r39 = this;
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/CallNotificationBuilder type = "
            r2.append(r0)
            r0 = 1
            r7 = r43
            if (r7 == r0) goto L_0x016b
            r0 = 2
            if (r7 == r0) goto L_0x0167
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "UNKNOWN notification type "
            r1.append(r0)
            r1.append(r7)
            X.C18270x1.A0z(r1)
            java.lang.String r0 = "NOTIFICATION_INVALID"
        L_0x0023:
            X.C18260x0.A1L(r2, r0)
            r8 = r41
            long r0 = r8.A01
            r16 = r0
            boolean r0 = r8.A08
            r27 = r0
            boolean r3 = r8.A07
            com.whatsapp.jid.GroupJid r13 = r8.A02
            r15 = r13
            r6 = r39
            X.3Ex r14 = r6.A05
            X.5ZU r4 = r6.A06
            X.2sD r1 = r6.A0G
            X.3Lq r0 = r6.A0E
            X.3ZH r2 = X.AnonymousClass36T.A01(r14, r0, r13, r1, r3)
            if (r2 == 0) goto L_0x0163
            java.lang.String r37 = X.C18300x5.A0h(r4, r2)
        L_0x0049:
            X.2oU r2 = r6.A0B
            android.content.Context r4 = r2.A00
            r2 = 0
            r12 = 1
            boolean r5 = X.AnonymousClass000.A1W(r37)
            java.lang.String r26 = r6.A04(r4, r8, r5)
            java.lang.String r25 = r6.A04(r4, r8, r2)
            if (r3 == 0) goto L_0x013b
            r5 = 2131233869(0x7f080c4d, float:1.8083888E38)
        L_0x0060:
            r9 = r40
            r28 = r44
            if (r3 == 0) goto L_0x0133
            X.C626936e.A06(r13)
            X.36r r4 = new X.36r
            r4.<init>()
            X.3ZH r2 = r14.A0A(r13)
            android.content.Intent r10 = r4.A1L(r9, r2)
            java.lang.String r2 = "fromCallNotification"
            r10.putExtra(r2, r12)
            X.1VX r2 = r6.A0D
            boolean r2 = X.C627436k.A0J(r2)
            if (r2 == 0) goto L_0x008b
            java.lang.String r4 = "vcLobbyCallId"
            java.lang.String r2 = r8.A05
            r10.putExtra(r4, r2)
        L_0x008b:
            java.lang.String r2 = "CallNotificationBuilder.getAudioChatContentIntent"
            X.AnonymousClass5VI.A01(r10, r2)
        L_0x0090:
            java.lang.String r4 = "lobbyEntryPoint"
            r10.putExtra(r4, r12)
            if (r3 != 0) goto L_0x0124
            r2 = r28
            android.content.Intent r11 = r6.A02(r9, r8, r7, r2)
            r2 = 6
            r11.putExtra(r4, r2)
        L_0x00a1:
            if (r13 != 0) goto L_0x00a5
            com.whatsapp.jid.UserJid r13 = r8.A03
        L_0x00a5:
            if (r13 == 0) goto L_0x00ac
            java.lang.String r2 = "attributed_call_jid"
            X.AnonymousClass0x2.A0u(r10, r13, r2)
        L_0x00ac:
            android.app.PendingIntent r24 = X.C624735e.A04(r9, r10, r12)
            java.lang.String r2 = "voip/CallNotificationBuilder/loadNotificationLargeIcon"
            com.whatsapp.util.Log.d((java.lang.String) r2)
            android.content.res.Resources r13 = r9.getResources()
            r2 = 17104901(0x1050005, float:2.4428256E-38)
            int r4 = r13.getDimensionPixelSize(r2)
            r2 = 17104902(0x1050006, float:2.442826E-38)
            int r2 = r13.getDimensionPixelSize(r2)
            int r12 = java.lang.Math.min(r4, r2)
            r2 = 0
            r31 = r42
            if (r12 <= 0) goto L_0x01be
            boolean r4 = r8.A09
            if (r4 == 0) goto L_0x00ec
            if (r15 != 0) goto L_0x00ec
            java.util.List r4 = r8.A06
            r18 = r4
            int r10 = r18.size()
            r4 = 1
            if (r10 == r4) goto L_0x00ec
            boolean r4 = r8.A0A
            if (r4 == 0) goto L_0x0121
            int r4 = r18.size()
            if (r4 != 0) goto L_0x0121
        L_0x00ec:
            r20 = -1
        L_0x00ee:
            java.util.ArrayList r19 = X.AnonymousClass001.A0s()
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            X.3ZH r0 = X.AnonymousClass36T.A01(r14, r0, r15, r1, r3)
            if (r0 != 0) goto L_0x0185
            java.util.List r0 = r8.A06
            r21 = r0
            java.util.Iterator r18 = r21.iterator()
        L_0x0108:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x016f
            X.4uZ r15 = X.C18300x5.A0P(r18)
            int r1 = r4.size()
            r0 = 3
            if (r1 >= r0) goto L_0x016f
            X.3ZH r0 = r14.A0A(r15)
            r4.add(r0)
            goto L_0x0108
        L_0x0121:
            r20 = 0
            goto L_0x00ee
        L_0x0124:
            com.whatsapp.voipcalling.CallState r4 = r8.A04
            com.whatsapp.voipcalling.CallState r2 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r4 != r2) goto L_0x0130
            android.content.Intent r11 = X.C18320x8.A07()
            goto L_0x00a1
        L_0x0130:
            r11 = 0
            goto L_0x00a1
        L_0x0133:
            r2 = r28
            android.content.Intent r10 = r6.A02(r9, r8, r7, r2)
            goto L_0x0090
        L_0x013b:
            r9 = 0
            int r4 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1))
            boolean r2 = r8.A0F
            if (r4 <= 0) goto L_0x014d
            r5 = 2131233331(0x7f080a33, float:1.8082796E38)
            if (r2 == 0) goto L_0x0060
            r5 = 2131233333(0x7f080a35, float:1.80828E38)
            goto L_0x0060
        L_0x014d:
            if (r27 == 0) goto L_0x0159
            r5 = 2131233335(0x7f080a37, float:1.8082805E38)
            if (r2 == 0) goto L_0x0060
            r5 = 2131233337(0x7f080a39, float:1.8082809E38)
            goto L_0x0060
        L_0x0159:
            r5 = 2131233324(0x7f080a2c, float:1.8082782E38)
            if (r2 == 0) goto L_0x0060
            r5 = 2131233326(0x7f080a2e, float:1.8082786E38)
            goto L_0x0060
        L_0x0163:
            r37 = 0
            goto L_0x0049
        L_0x0167:
            java.lang.String r0 = "NOTIFICATION_MUTE"
            goto L_0x0023
        L_0x016b:
            java.lang.String r0 = "NOTIFICATION_HEADS_UP"
            goto L_0x0023
        L_0x016f:
            boolean r0 = r8.A0A
            if (r0 == 0) goto L_0x0188
            int r0 = r21.size()
            if (r0 != 0) goto L_0x0188
            X.2sr r0 = r6.A02
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r0)
            if (r0 == 0) goto L_0x0188
            X.3ZH r0 = r14.A0A(r0)
        L_0x0185:
            r4.add(r0)
        L_0x0188:
            java.util.Iterator r18 = r4.iterator()
        L_0x018c:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x01c5
            X.3ZH r4 = X.C18310x6.A0R(r18)
            X.2ro r0 = r6.A07
            r1 = r20
            float r1 = (float) r1
            java.lang.String r15 = r4.A0M(r1, r12)
            X.30B r0 = r0.A02
            X.1sU r0 = r0.A01()
            java.lang.Object r0 = r0.A06(r15)
            if (r0 != 0) goto L_0x01ba
            X.5UX r0 = r6.A04
            android.graphics.Bitmap r0 = r0.A04(r4, r1, r12)
            boolean r1 = r4.A0g
            if (r1 == 0) goto L_0x01ba
            r1 = r19
            r1.add(r4)
        L_0x01ba:
            r10.add(r0)
            goto L_0x018c
        L_0x01be:
            java.lang.String r0 = "voip/CallNotificationBuilder/thumb-size-is-0"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x01f8
        L_0x01c5:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x01d8
            int r1 = r10.size()
            r0 = 1
            if (r1 != r0) goto L_0x0392
            java.lang.Object r2 = X.AnonymousClass0x9.A0t(r10)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
        L_0x01d8:
            boolean r0 = r19.isEmpty()
            if (r0 != 0) goto L_0x01f8
            X.4FS r4 = r6.A0I
            X.30g r1 = r6.A09
            X.1tM r0 = new X.1tM
            r29 = r0
            r30 = r9
            r32 = r1
            r33 = r19
            r34 = r12
            r35 = r20
            r36 = r7
            r29.<init>(r30, r31, r32, r33, r34, r35, r36)
            X.C18270x1.A0w(r0, r4)
        L_0x01f8:
            com.whatsapp.jid.UserJid r0 = r8.A03
            X.3ZH r23 = r14.A0A(r0)
            r12 = 0
            int r0 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x020a
            int r0 = r8.A00
            r22 = 1
            if (r0 < 0) goto L_0x020c
        L_0x020a:
            r22 = 0
        L_0x020c:
            X.0Ue r10 = X.C66553Lw.A01(r9)
            java.lang.String r21 = "call"
            r0 = r21
            r10.A0J = r0
            r0 = 1
            r10.A03 = r0
            if (r22 == 0) goto L_0x0224
            r10.A0Y = r0
            long r0 = X.AnonymousClass0x9.A05(r16)
            r10.A05(r0)
        L_0x0224:
            r0 = r26
            r10.A0A(r0)
            X.C18270x1.A0r(r10, r0)
            r0 = r24
            r10.A09 = r0
            int r0 = r8.A00
            boolean r1 = X.AnonymousClass001.A1U(r0)
            r0 = 1
            if (r1 == 0) goto L_0x023c
            r10.A0E(r0)
        L_0x023c:
            r10.A06(r2)
            X.AnonymousClass33T.A02(r10, r5)
            if (r7 != r0) goto L_0x038f
            if (r1 != 0) goto L_0x038f
            if (r11 == 0) goto L_0x038f
            r0 = 4
            android.app.PendingIntent r0 = X.C624735e.A04(r9, r11, r0)
            r10.A0A = r0
            r2 = 128(0x80, float:1.794E-43)
            android.app.Notification r1 = r10.A07
            int r0 = r1.flags
            r2 = r2 | r0
            r1.flags = r2
            r11 = 1
        L_0x0259:
            r14 = 0
            r33 = r6
            r34 = r9
            r35 = r8
            r36 = r31
            r38 = r11
            java.lang.String r4 = r33.A03(r34, r35, r36, r37, r38)
            if (r4 == 0) goto L_0x026d
            r10.A0B(r4)
        L_0x026d:
            r18 = 0
            if (r27 != 0) goto L_0x036a
            int r0 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x036a
            boolean r0 = r8.A0B
            if (r0 == 0) goto L_0x0285
            if (r3 != 0) goto L_0x032d
            com.whatsapp.voipcalling.CallState r1 = r8.A04
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x032d
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE_ELSEWHERE
            if (r1 == r0) goto L_0x032d
        L_0x0285:
            java.lang.String r0 = "reject_call"
            java.lang.Class<com.whatsapp.calling.service.VoiceFGService> r1 = com.whatsapp.calling.service.VoiceFGService.class
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r9, r1)
            r1.setAction(r0)
            java.lang.String r2 = r8.A05
            java.lang.String r0 = "call_id"
            r1.putExtra(r0, r2)
            boolean r13 = r8.A0E
            r2 = 4
            if (r13 == 0) goto L_0x029f
            r2 = 11
        L_0x029f:
            java.lang.String r0 = "call_ui_action"
            r1.putExtra(r0, r2)
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r20 = X.C624735e.A05(r9, r1, r0)
            r15 = 2131231738(0x7f0803fa, float:1.8079565E38)
            boolean r12 = r8.A09
            r0 = 2131893002(0x7f121b0a, float:1.9420768E38)
            r3 = 2131099968(0x7f060140, float:1.7812304E38)
            if (r12 == 0) goto L_0x02bd
            r0 = 2131895328(0x7f122420, float:1.9425486E38)
            r3 = 2131099969(0x7f060141, float:1.7812306E38)
        L_0x02bd:
            java.lang.String r2 = r9.getString(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 25
            if (r1 < r0) goto L_0x0367
            r0 = 1
            if (r7 != r0) goto L_0x0367
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r2)
            int r1 = r9.getColor(r3)
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            r2.<init>(r1)
            int r1 = r0.length()
            r0.setSpan(r2, r14, r1, r14)
        L_0x02df:
            X.0Tm r1 = new X.0Tm
            r2 = r20
            r1.<init>(r15, r0, r2)
            java.util.ArrayList r3 = r10.A0O
            r3.add(r1)
            r0 = r28
            android.app.PendingIntent r15 = r6.A01(r9, r8, r7, r0)
            boolean r0 = r8.A0F
            r2 = 2131231718(0x7f0803e6, float:1.8079525E38)
            if (r0 == 0) goto L_0x02fb
            r2 = 2131231803(0x7f08043b, float:1.8079697E38)
        L_0x02fb:
            if (r12 == 0) goto L_0x035e
            r0 = 2131895347(0x7f122433, float:1.9425524E38)
        L_0x0300:
            r13 = 2131099967(0x7f06013f, float:1.7812302E38)
            java.lang.String r12 = r9.getString(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 25
            if (r1 < r0) goto L_0x035c
            r0 = 1
            if (r7 != r0) goto L_0x035c
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r12)
            int r1 = r9.getColor(r13)
            android.text.style.ForegroundColorSpan r12 = new android.text.style.ForegroundColorSpan
            r12.<init>(r1)
            int r1 = r0.length()
            r0.setSpan(r12, r14, r1, r14)
        L_0x0325:
            X.0Tm r1 = new X.0Tm
            r1.<init>(r2, r0, r15)
            r3.add(r1)
        L_0x032d:
            java.lang.String r0 = "call_notification_group"
            r10.A0L = r0
            r0 = 1
            r10.A0T = r0
        L_0x0334:
            X.0Ue r2 = X.C66553Lw.A01(r9)
            r0 = r21
            r2.A0J = r0
            r0 = 1
            r2.A03 = r0
            if (r22 == 0) goto L_0x034a
            r2.A0Y = r0
            long r0 = X.AnonymousClass0x9.A05(r16)
            r2.A05(r0)
        L_0x034a:
            r0 = r25
            r2.A0A(r0)
            java.lang.String r0 = X.C18320x8.A0a(r9)
            if (r0 == 0) goto L_0x0358
            r2.A0B(r0)
        L_0x0358:
            X.AnonymousClass33T.A02(r2, r5)
            goto L_0x039f
        L_0x035c:
            r0 = r12
            goto L_0x0325
        L_0x035e:
            r0 = 2131886433(0x7f120161, float:1.9407445E38)
            if (r13 == 0) goto L_0x0300
            r0 = 2131895259(0x7f1223db, float:1.9425346E38)
            goto L_0x0300
        L_0x0367:
            r0 = r2
            goto L_0x02df
        L_0x036a:
            r3 = 2131231738(0x7f0803fa, float:1.8079565E38)
            r0 = 2131890057(0x7f120f89, float:1.9414795E38)
            java.lang.String r2 = r9.getString(r0)
            java.lang.Class<com.whatsapp.calling.service.VoiceFGService> r0 = com.whatsapp.calling.service.VoiceFGService.class
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r9, r0)
            java.lang.String r0 = "hangup_call"
            r1.setAction(r0)
            java.lang.String r12 = "end_call_reason"
            r0 = 1
            r1.putExtra(r12, r0)
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r0 = X.C624735e.A05(r9, r1, r0)
            r10.A04(r3, r2, r0)
            goto L_0x0334
        L_0x038f:
            r11 = 0
            goto L_0x0259
        L_0x0392:
            r0 = 2131168241(0x7f070bf1, float:1.7950778E38)
            float r0 = r13.getDimension(r0)
            android.graphics.Bitmap r2 = X.C114015mM.A02(r10, r0)
            goto L_0x01d8
        L_0x039f:
            android.app.Notification r0 = r2.A01()     // Catch:{ SecurityException -> 0x03a6 }
            r10.A08 = r0     // Catch:{ SecurityException -> 0x03a6 }
            goto L_0x03ad
        L_0x03a6:
            r1 = move-exception
            boolean r0 = X.C107535bT.A0B()
            if (r0 == 0) goto L_0x04ba
        L_0x03ad:
            r0 = r23
            r6.A06(r10, r8, r0, r7)
            if (r44 != 0) goto L_0x03bf
            com.whatsapp.voipcalling.CallState r2 = r8.A04
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r2 == r0) goto L_0x03bf
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.ACTIVE_ELSEWHERE
            r0 = 1
            if (r2 != r1) goto L_0x03c0
        L_0x03bf:
            r0 = 0
        L_0x03c0:
            r10.A0F(r0)
            boolean r0 = X.C107385bE.A0B()
            if (r0 == 0) goto L_0x03f3
            r0 = r31
            boolean r0 = r6.A07(r8, r0, r11)
            if (r0 != 0) goto L_0x03f3
            X.1VX r2 = r6.A0D
            r1 = 4793(0x12b9, float:6.716E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x03f3
            java.lang.Class<com.whatsapp.calling.service.VoiceFGService> r0 = com.whatsapp.calling.service.VoiceFGService.class
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r9, r0)
            java.lang.String r0 = "recreate_notification"
            r1.setAction(r0)
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r1 = X.C624735e.A05(r9, r1, r0)
            android.app.Notification r0 = r10.A07
            r0.deleteIntent = r1
        L_0x03f3:
            r0 = r31
            boolean r0 = r6.A07(r8, r0, r11)     // Catch:{ SecurityException -> 0x0490 }
            java.lang.String r2 = "voip/CallNotificationBuilder "
            if (r0 == 0) goto L_0x045b
            if (r11 != 0) goto L_0x0402
            if (r44 != 0) goto L_0x045b
        L_0x0402:
            java.util.ArrayList r0 = r10.A0O     // Catch:{ SecurityException -> 0x0490 }
            r0.clear()     // Catch:{ SecurityException -> 0x0490 }
            java.lang.String r1 = "CallNotificationBuilder/build/ callstyle title cannot be empty"
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ SecurityException -> 0x0490 }
            if (r0 != 0) goto L_0x0451
            android.app.Notification r0 = r10.A01()     // Catch:{ SecurityException -> 0x0490 }
            android.app.Notification$Builder r13 = android.app.Notification.Builder.recoverBuilder(r9, r0)     // Catch:{ SecurityException -> 0x0490 }
            boolean r0 = r8.A0A     // Catch:{ SecurityException -> 0x0490 }
            if (r0 == 0) goto L_0x0424
            java.util.List r0 = r8.A06     // Catch:{ SecurityException -> 0x0490 }
            int r1 = r0.size()     // Catch:{ SecurityException -> 0x0490 }
            r0 = 1
            if (r1 == 0) goto L_0x0425
        L_0x0424:
            r0 = 0
        L_0x0425:
            if (r0 == 0) goto L_0x042e
            r0 = 2131891396(0x7f1214c4, float:1.941751E38)
            java.lang.String r4 = r9.getString(r0)     // Catch:{ SecurityException -> 0x0490 }
        L_0x042e:
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ SecurityException -> 0x0490 }
            if (r0 == 0) goto L_0x043b
            r0 = 2131891396(0x7f1214c4, float:1.941751E38)
            java.lang.String r4 = r9.getString(r0)     // Catch:{ SecurityException -> 0x0490 }
        L_0x043b:
            r12 = r6
            r14 = r9
            r15 = r8
            r16 = r4
            r17 = r7
            r12.A05(r13, r14, r15, r16, r17)     // Catch:{ SecurityException -> 0x0490 }
            android.app.Notification r1 = r13.build()     // Catch:{ SecurityException -> 0x0490 }
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ SecurityException -> 0x0490 }
            X.C18260x0.A1R(r0, r2, r1)     // Catch:{ SecurityException -> 0x0490 }
            return r1
        L_0x0451:
            java.lang.String r0 = "empty string"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ SecurityException -> 0x0490 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r1)     // Catch:{ SecurityException -> 0x0490 }
            throw r0     // Catch:{ SecurityException -> 0x0490 }
        L_0x045b:
            android.app.Notification r4 = r10.A01()     // Catch:{ SecurityException -> 0x0490 }
            int r0 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x0488
            android.widget.RemoteViews r0 = r4.bigContentView
            if (r0 == 0) goto L_0x0488
            java.lang.String r0 = "com.android.internal.R$id"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0481 }
            java.lang.String r0 = "time"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch:{ Exception -> 0x0481 }
            r0 = 0
            int r3 = r1.getInt(r0)     // Catch:{ Exception -> 0x0481 }
            android.widget.RemoteViews r1 = r4.bigContentView     // Catch:{ Exception -> 0x0481 }
            r0 = 8
            r1.setViewVisibility(r3, r0)     // Catch:{ Exception -> 0x0481 }
            goto L_0x0488
        L_0x0481:
            r1 = move-exception
            java.lang.String r0 = "voip/service/notification/time-ui-gone"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0488:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.C18260x0.A1R(r0, r2, r4)
            return r4
        L_0x0490:
            r1 = move-exception
            boolean r0 = X.C107535bT.A0B()
            if (r0 == 0) goto L_0x04ba
            X.0Ue r1 = X.C66553Lw.A01(r9)
            r0 = r26
            r1.A0A(r0)
            r0 = r24
            r1.A09 = r0
            X.AnonymousClass33T.A02(r1, r5)
            java.lang.String r0 = r33.A03(r34, r35, r36, r37, r38)
            if (r0 == 0) goto L_0x04b0
            r1.A0B(r0)
        L_0x04b0:
            r0 = r23
            r6.A06(r1, r8, r0, r7)
            android.app.Notification r1 = r1.A01()
            return r1
        L_0x04ba:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56442rz.A00(android.content.Context, X.2w6, X.5jr, int, boolean):android.app.Notification");
    }
}
