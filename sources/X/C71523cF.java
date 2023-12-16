package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.notification.AndroidWear;
import com.whatsapp.notification.DirectReplyService;

/* renamed from: X.3cF  reason: invalid class name and case insensitive filesystem */
public class C71523cF implements Runnable {
    public boolean A00;
    public final int A01;
    public final Context A02;
    public final C29171iO A03;
    public final C69263Wi A04;
    public final C56972sr A05;
    public final AnonymousClass3DP A06;
    public final C50422i9 A07;
    public final C153167am A08;
    public final C56962sq A09;
    public final C111665iU A0A;
    public final AnonymousClass5TW A0B;
    public final C56942so A0C;
    public final C64773Ex A0D;
    public final C56422rx A0E;
    public final AnonymousClass5ZU A0F;
    public final AnonymousClass314 A0G;
    public final C113905mB A0H;
    public final C113895mA A0I;
    public final C44382Vv A0J;
    public final C620633i A0K;
    public final C56612sH A0L;
    public final AnonymousClass33T A0M;
    public final AnonymousClass5ZR A0N;
    public final AnonymousClass33p A0O;
    public final C620733j A0P;
    public final C56982ss A0Q;
    public final C56892sj A0R;
    public final AnonymousClass2WH A0S;
    public final AnonymousClass1VX A0T;
    public final AnonymousClass3LP A0U;
    public final AnonymousClass2Q5 A0V;
    public final AnonymousClass30N A0W;
    public final C95814uZ A0X;
    public final C619933b A0Y;
    public final AnonymousClass2RW A0Z;
    public final C66553Lw A0a;
    public final C50332i0 A0b;
    public final AnonymousClass2HT A0c;
    public final C46082b3 A0d;
    public final C614030o A0e;
    public final C624134x A0f;
    public final C44632Ww A0g;
    public final C50222hp A0h;
    public final C51072jE A0i;
    public final C29321id A0j;
    public final AnonymousClass1R1 A0k;
    public final C55832qz A0l;
    public final C56572sD A0m;
    public final C69183Wa A0n;
    public final C60312yL A0o;
    public final C56072rN A0p;
    public final C187958y5 A0q;
    public final boolean A0r;
    public final boolean A0s;
    public final boolean A0t;
    public final boolean A0u;
    public final boolean A0v;
    public final boolean A0w;

    public boolean A06(AnonymousClass3ZH r8) {
        if (!(r8.A0H instanceof C95804uY)) {
            C95814uZ A022 = AnonymousClass3ZH.A02(r8, C95814uZ.class);
            if ((!this.A0Q.A0N(A022) || !this.A0T.A0Y(C58422vE.A02, 5141)) && !this.A0p.A04(r8, A022)) {
                AnonymousClass1VX r4 = this.A0T;
                AnonymousClass3LP r3 = this.A0U;
                C69183Wa r0 = this.A0n;
                C56422rx r2 = this.A0E;
                UserJid A032 = AnonymousClass32Y.A03(A022);
                return !C615431g.A00(r2, r4, r3, A032, r0) && !C57172tD.A00(r2, r4, r3, A032);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C71523cF r5 = (C71523cF) obj;
            C624134x r2 = this.A0f;
            C624134x r0 = r5.A0f;
            return (r2 == r0 || !(r2 == null || r0 == null || !r0.A1J.equals(r2.A1J))) && this.A0t == r5.A0t && this.A0v == r5.A0v && this.A0w == r5.A0w && AnonymousClass75J.A00(this.A0X, r5.A0X) && this.A01 == r5.A01 && this.A0s == r5.A0s;
        }
    }

    public final int A00() {
        if (this.A0u) {
            return 59;
        }
        if (this.A00) {
            return 57;
        }
        return 1;
    }

    public final String A01(C32501qy r2, boolean z) {
        if (this.A0u) {
            return r2.A0B();
        }
        if (this.A0w || z) {
            return r2.A0D();
        }
        return r2.A0C();
    }

    public final void A02(Context context, C05610Ue r7, AnonymousClass3ZH r8) {
        C05480Tm r3;
        if (this.A0u) {
            C04350Nw r1 = new C04350Nw(R.drawable.ic_notif_mute, context.getString(R.string.f11nameremoved), C624735e.A05(context, new Intent(AndroidWear.A0D, AnonymousClass326.A00(r8), context, AndroidWear.class), 134217728));
            r1.A00 = 2;
            r1.A03 = false;
            r3 = r1.A00();
        } else {
            Context context2 = this.A0a.A0B.A00;
            Intent action = C18300x5.A07(context2).setAction("com.whatsapp.intent.action.CHATS");
            action.putExtra("show_mute", true);
            action.putExtra("mute_jid", C627336j.A07(r8.A0H));
            C57352tV.A00(context2, action);
            r3 = new C05480Tm(R.drawable.ic_notif_mute, context2.getString(R.string.f11nameremoved), C624735e.A04(context2, action, 4));
        }
        r7.A0O.add(r3);
    }

    public final boolean A05() {
        if (!this.A0r || this.A00) {
            return false;
        }
        return true;
    }

    public final boolean A07(AnonymousClass3ZH r4) {
        if (this.A0T.A0Y(C58422vE.A02, 2374)) {
            UserJid A072 = AnonymousClass3ZH.A07(r4);
            C55502qS r0 = r4.A0E;
            if ((r0 == null || !r0.A02()) && A072 != null && !this.A0m.A09(A072) && !this.A09.A0d.contains(A072)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        if ((r2 + 86400000) >= r7) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A08(X.C95814uZ r11, int r12, long r13) {
        /*
            r10 = this;
            r0 = 50
            r9 = 0
            if (r12 <= r0) goto L_0x003a
            X.33p r0 = r10.A0O
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "last_read_conversation_time"
            long r7 = X.AnonymousClass0x2.A0B(r1, r0)
            X.2ss r0 = r10.A0Q
            X.31A r0 = X.C56982ss.A01(r0, r11)
            if (r0 != 0) goto L_0x003b
            r2 = 0
        L_0x001b:
            long r13 = r13 - r2
            r4 = 300000(0x493e0, double:1.482197E-318)
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            boolean r6 = X.AnonymousClass001.A1V(r0)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0034
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 + r0
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            if (r6 != 0) goto L_0x0039
            if (r0 == 0) goto L_0x003a
        L_0x0039:
            r9 = 1
        L_0x003a:
            return r9
        L_0x003b:
            long r2 = r0.A0Y
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71523cF.A08(X.4uZ, int, long):boolean");
    }

    public int hashCode() {
        return (((((((((((AnonymousClass000.A07(this.A0f) * 31) + (this.A0w ? 1 : 0)) * 31) + (this.A0v ? 1 : 0)) * 31) + (this.A0t ? 1 : 0)) * 31) + C18310x6.A07(this.A0X)) * 31) + this.A01) * 31) + (this.A0s ? 1 : 0);
    }

    public final void A03(C05610Ue r7, AnonymousClass3ZH r8, int i, boolean z) {
        if (DirectReplyService.A03()) {
            r7.A0O.add(DirectReplyService.A00(this.A02, r8, "com.whatsapp.intent.action.DIRECT_REPLY_FROM_MESSAGE", i, z));
            return;
        }
        Context context = this.A02;
        C95814uZ r4 = r8.A0H;
        Intent A072 = C18320x8.A07();
        A072.setClassName(context.getPackageName(), "com.whatsapp.notification.PopupNotification");
        C627336j.A0D(A072, r4, "popup_notification_extra_quick_reply_jid");
        A072.putExtra("popup_notification_extra_dismiss_notification", true);
        r7.A04(R.drawable.ic_action_reply, context.getString(R.string.f11nameremoved), C624735e.A04(context, A072, 0));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:272|273|274|275|276|277|(34:279|283|(2:432|(3:434|(1:436)|437)(1:438))(1:287)|288|(2:290|(1:296)(1:427))(3:428|(1:430)|431)|297|(1:426)(1:300)|301|(9:304|(1:306)|308|(1:310)|312|313|(1:(1:424))(1:316)|317|(5:319|(2:321|(0))|414|(1:416)(1:(1:422))|(0)))|325|(7:328|(1:330)|332|(7:410|411|(1:413)|(1:346)(1:(2:395|396))|(5:349|(2:391|(1:393))(2:355|(1:357)(1:390))|(1:361)|362|(2:364|(1:367)))|368|(3:370|(1:372)(1:388)|373)(1:389))|338|(0)|346)|374|(1:380)|381|(1:383)|384|(2:387|385)|653|439|(4:443|(6:446|(1:448)|449|(2:451|655)(1:656)|452|444)|654|453)|454|(1:464)(2:458|(1:460))|461|(1:463)|465|466|(1:471)(1:470)|(1:473)|474|484|(1:486)(1:577)|487|(1:490)|(4:492|(1:494)(1:576)|(1:496)|(14:498|(3:500|(1:502)(1:575)|503)|504|(2:506|(2:508|(2:513|(1:515))))|516|(8:518|(1:520)(1:570)|521|522|(2:524|(1:526))(2:530|(1:532)(2:533|(1:535)(2:536|(1:538)(2:539|(1:541)(2:542|(1:544)(1:(1:546)(2:547|(1:549)(2:550|(1:552)(2:553|(1:569)(2:557|(1:559)(2:560|(1:562)(2:563|(2:565|(1:567))(3:568|528|529)))))))))))))|527|528|529)|572|(6:574|522|(0)(0)|527|528|529)|521|522|(0)(0)|527|528|529)(1:661))(1:660))) */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0291, code lost:
        if (r12 == 0) goto L_0x0293;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x06f8, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x06f9, code lost:
        com.whatsapp.util.Log.e("androidwear/pairedcheck/failed", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x07fe, code lost:
        if (r22 == false) goto L_0x0800;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0806, code lost:
        if (r14 == false) goto L_0x0808;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x085e, code lost:
        if (r8 == false) goto L_0x0860;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0860, code lost:
        A02(r9, r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0894, code lost:
        if (r22 != false) goto L_0x0896;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x08d5, code lost:
        if (r1 != false) goto L_0x0959;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0a4a, code lost:
        if (r6.equals("2") == false) goto L_0x08d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0a57, code lost:
        r6 = new long[]{0, 300, 200, 300, 200};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0a5c, code lost:
        if ((1 - r8) == 0) goto L_0x0a67;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0a5e, code lost:
        r6 = {0, 750, 250, 750, 250} // fill-array;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0a61, code lost:
        r0.A07.vibrate = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0a67, code lost:
        r6 = {0, 300, 200, 300, 200} // fill-array;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0a81, code lost:
        if (r14 == false) goto L_0x0860;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x0a9a, code lost:
        if (r1 != 1) goto L_0x0843;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x013c, code lost:
        if (r2.A0Q.A0P(r4.A1J.A00) == false) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0de9, code lost:
        if ((r3 instanceof com.whatsapp.jid.UserJid) == false) goto L_0x0deb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x0e0e, code lost:
        if (r1.contains("android.permission.UPDATE_APP_OPS_STATS") != false) goto L_0x0c54;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0072, code lost:
        if (X.AnonymousClass1R1.A00(X.AnonymousClass2z0.A00(r4), r2.A0k).A0K == false) goto L_0x0074;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:275:0x06cc */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0673 A[Catch:{ SecurityException -> 0x0647 }] */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x068d A[Catch:{ Exception -> 0x06f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0716  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x076b  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0783 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x07fc  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0804  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0816 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0a97  */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x0ac0  */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x0afe  */
    /* JADX WARNING: Removed duplicated region for block: B:524:0x0d71  */
    /* JADX WARNING: Removed duplicated region for block: B:530:0x0d8a  */
    /* JADX WARNING: Removed duplicated region for block: B:659:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r68 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "messagenotification/refreshstatusbar/run newmsg="
            r1.append(r0)
            r2 = r68
            X.34x r4 = r2.A0f
            java.lang.String r34 = "null"
            if (r4 != 0) goto L_0x0e12
            r0 = r34
        L_0x0015:
            r1.append(r0)
            java.lang.String r25 = " quiet="
            r0 = r25
            r1.append(r0)
            boolean r0 = r2.A0w
            r19 = r0
            r1.append(r0)
            java.lang.String r0 = " noPopup="
            r1.append(r0)
            boolean r0 = r2.A0v
            r31 = r0
            r1.append(r0)
            java.lang.String r0 = " isAndroidWearRefresh="
            r1.append(r0)
            boolean r0 = r2.A0t
            r18 = r0
            r1.append(r0)
            java.lang.String r0 = " replyJid="
            r1.append(r0)
            X.4uZ r5 = r2.A0X
            r1.append(r5)
            java.lang.String r0 = " forceNotificationUpdate="
            r1.append(r0)
            boolean r0 = r2.A0s
            r23 = r0
            X.C18260x0.A1U(r1, r0)
            X.2jE r0 = r2.A0i
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x0063
            java.lang.String r0 = "messagenotification/notification suppressed: not in verified registration state"
        L_0x005f:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0062:
            return
        L_0x0063:
            if (r4 == 0) goto L_0x0074
            X.1R1 r1 = r2.A0k
            X.4uZ r0 = X.AnonymousClass2z0.A00(r4)
            X.2sa r0 = X.AnonymousClass1R1.A00(r0, r1)
            boolean r0 = r0.A0K
            r12 = 0
            if (r0 != 0) goto L_0x0075
        L_0x0074:
            r12 = 1
        L_0x0075:
            X.1R1 r0 = r2.A0k
            r67 = r0
            X.2sa r11 = r67.A0I()
            X.2sa r3 = r67.A0H()
            java.lang.String r0 = r3.A06()
            int r10 = java.lang.Integer.parseInt(r0)
            java.lang.String r0 = r11.A06()
            int r9 = java.lang.Integer.parseInt(r0)
            java.lang.String r0 = r3.A07()
            java.lang.String r1 = r11.A07()
            java.lang.String r8 = r3.A05()
            java.lang.String r7 = r11.A05()
            java.lang.String r6 = r3.A08()
            java.lang.String r3 = r11.A08()
            if (r10 != 0) goto L_0x00db
            if (r9 != 0) goto L_0x00db
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00db
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x00db
            java.lang.String r1 = "000000"
            boolean r0 = android.text.TextUtils.equals(r1, r8)
            if (r0 == 0) goto L_0x00db
            boolean r0 = android.text.TextUtils.equals(r1, r7)
            if (r0 == 0) goto L_0x00db
            java.lang.String r1 = "0"
            boolean r0 = android.text.TextUtils.equals(r1, r6)
            if (r0 == 0) goto L_0x00db
            boolean r0 = android.text.TextUtils.equals(r1, r3)
            if (r0 == 0) goto L_0x00db
            if (r12 == 0) goto L_0x00db
            java.lang.String r0 = "messagenotification/notifications disabled"
            goto L_0x005f
        L_0x00db:
            if (r4 != 0) goto L_0x010e
            if (r23 != 0) goto L_0x010e
            X.33p r0 = r2.A0O
            X.8qC r7 = r0.A01
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r7)
            java.lang.String r1 = "notification_hash"
            r6 = 0
            java.lang.String r0 = r0.getString(r1, r6)
            if (r0 == 0) goto L_0x010e
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r7)
            java.lang.String r3 = r0.getString(r1, r6)
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r7)
            java.lang.String r0 = "last_notification_hash"
            java.lang.String r0 = r1.getString(r0, r6)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x010e
            java.lang.String r0 = "messagenotification/updateOnly skip"
            goto L_0x005f
        L_0x010e:
            android.content.Context r9 = r2.A02
            X.0Tx r0 = new X.0Tx
            r0.<init>(r9)
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x0129
            java.lang.String r0 = "messagenotification/notif disabled"
        L_0x011e:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0121:
            if (r4 == 0) goto L_0x0062
        L_0x0123:
            X.2i9 r0 = r2.A07
            r0.A01()
            return
        L_0x0129:
            if (r4 == 0) goto L_0x0152
            X.33b r0 = r2.A0Y
            X.2sO r6 = r0.A04(r4)
            X.2ss r1 = r2.A0Q
            X.2z0 r0 = r4.A1J
            X.4uZ r0 = r0.A00
            boolean r0 = r1.A0P(r0)
            r1 = 1
            if (r0 != 0) goto L_0x013f
        L_0x013e:
            r1 = 0
        L_0x013f:
            r2.A00 = r1
            if (r4 == 0) goto L_0x0154
            X.3Lw r0 = r2.A0a
            boolean r0 = r0.A0P(r6, r1)
            if (r0 != 0) goto L_0x0154
            java.lang.String r0 = "messagenotification/muted chat"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0123
        L_0x0152:
            r6 = 0
            goto L_0x013e
        L_0x0154:
            boolean r0 = r4 instanceof X.C30571mf
            r16 = r0
            if (r0 == 0) goto L_0x0171
            X.2z0 r0 = r4.A1J
            X.4uZ r1 = r0.A00
            r0 = r67
            X.2sa r0 = X.AnonymousClass1R1.A00(r1, r0)
            X.2sa r0 = r0.A02()
            boolean r0 = r0.A0G
            if (r0 == 0) goto L_0x0171
            java.lang.String r0 = "messagenotification/skip notification for muted reaction"
            goto L_0x005f
        L_0x0171:
            boolean r0 = r4 instanceof X.C30971nX
            if (r0 == 0) goto L_0x017a
            java.lang.String r0 = "messagenotification/skip notification for scheduled call edit"
            goto L_0x005f
        L_0x017a:
            if (r4 == 0) goto L_0x01b7
            boolean r0 = X.C624134x.A0g(r4)
            if (r0 == 0) goto L_0x01b7
            X.1VX r3 = r2.A0T
            r1 = 5141(0x1415, float:7.204E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r0, r1)
            if (r0 == 0) goto L_0x01b7
            X.2pu r1 = r4.A0t()
            if (r1 == 0) goto L_0x01b7
            boolean r0 = r1 instanceof X.C30211m5
            if (r0 == 0) goto L_0x01b7
            java.lang.Long r0 = r1.A03()
            if (r0 == 0) goto L_0x01b7
            X.2qz r3 = r2.A0l
            long r0 = r0.longValue()
            X.34x r0 = X.C55122pp.A00(r3, r0)
            if (r0 == 0) goto L_0x01b7
            X.2z0 r0 = r0.A1J
            boolean r0 = r0.A02
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01b7
            java.lang.String r0 = "messagenotification/skip notification for comment message"
            goto L_0x005f
        L_0x01b7:
            java.util.ArrayList r24 = X.AnonymousClass001.A0s()
            java.lang.StringBuilder r33 = X.AnonymousClass001.A0o()
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            if (r5 == 0) goto L_0x01f7
            X.33b r8 = r2.A0Y
            int r0 = r2.A01
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            X.2rV r11 = r8.A0L
            int r6 = r0 + 1
            r0 = 7
            int r13 = java.lang.Math.min(r6, r0)
            long r15 = android.os.SystemClock.uptimeMillis()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "last-message-store/getlastmessagesfornotificationafterreply/jid:"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " count:"
            X.C18260x0.A0y(r0, r1, r13)
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            X.3dV r0 = r11.A06
            X.4GK r14 = r0.get()
            goto L_0x0e18
        L_0x01f7:
            boolean r0 = r2.A0u
            r22 = r0
            if (r0 != 0) goto L_0x043f
            boolean r1 = r2.A00
            X.314 r0 = r2.A0G
            if (r1 == 0) goto L_0x0439
            java.util.List r1 = r0.A08()
        L_0x0207:
            java.util.Iterator r32 = r1.iterator()
            r30 = 0
            r5 = 0
            r17 = 0
            r10 = 0
            r44 = 0
        L_0x0213:
            boolean r0 = r32.hasNext()
            if (r0 == 0) goto L_0x0470
            X.4uZ r8 = X.C18300x5.A0P(r32)
            X.33b r11 = r2.A0Y
            boolean r12 = r2.A00
            java.util.Map r0 = r11.A0Z
            java.util.List r7 = X.C18320x8.A0s(r8, r0)
            if (r7 != 0) goto L_0x0248
            r1 = 0
            java.util.List r7 = r11.A05(r8, r1)
            r0.put(r8, r7)
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0248
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "messagenotification/get-messages/init "
            X.C18280x3.A1H(r1, r0, r8)
            java.lang.String r0 = X.C619933b.A00(r7)
            X.C18260x0.A1J(r1, r0)
        L_0x0248:
            java.util.ArrayList r29 = X.AnonymousClass001.A0s()
            java.util.Iterator r7 = r7.iterator()
        L_0x0250:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x026a
            java.lang.Object r1 = r7.next()
            X.2sO r1 = (X.C56682sO) r1
            X.3Lw r0 = r11.A0R
            boolean r0 = r0.A0P(r1, r12)
            if (r0 == 0) goto L_0x0250
            r0 = r29
            r0.add(r1)
            goto L_0x0250
        L_0x026a:
            X.2ss r7 = r2.A0Q
            int r28 = r7.A03(r8)
            X.31A r0 = X.C56982ss.A01(r7, r8)
            if (r0 != 0) goto L_0x03dc
            r1 = 0
        L_0x0277:
            X.31A r0 = X.C56982ss.A01(r7, r8)
            if (r0 != 0) goto L_0x03d6
            r20 = 0
        L_0x027f:
            r0 = 0
            X.31A r7 = r7.A0A(r8, r0)
            if (r7 == 0) goto L_0x0293
            long r26 = r7.A00()
            long r13 = r7.A01()
            int r12 = (r26 > r13 ? 1 : (r26 == r13 ? 0 : -1))
            r7 = 1
            if (r12 != 0) goto L_0x0294
        L_0x0293:
            r7 = 0
        L_0x0294:
            if (r28 > 0) goto L_0x029e
            if (r7 != 0) goto L_0x029e
            if (r1 > 0) goto L_0x029e
            boolean r1 = r4 instanceof X.C30551md
            if (r1 == 0) goto L_0x0213
        L_0x029e:
            int r1 = r29.size()
            if (r1 <= 0) goto L_0x0213
            r1 = r29
            java.lang.Object r7 = r1.get(r0)
            X.2sO r7 = (X.C56682sO) r7
            if (r7 == 0) goto L_0x0423
            X.2i0 r12 = r2.A0b
            X.34x r13 = r7.A00
            X.C162457s7.A0J(r13, r0)
            X.30o r1 = r12.A06
            boolean r0 = r1.A06(r13)
            if (r0 == 0) goto L_0x02d5
            X.2w3 r0 = X.C614030o.A00(r13)
            if (r0 == 0) goto L_0x0213
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x0213
            X.1VX r12 = r12.A04
            r1 = 4980(0x1374, float:6.978E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r12.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0213
        L_0x02d5:
            X.34x r0 = r7.A00
            long r0 = r0.A0I
            r13 = 0
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 == 0) goto L_0x0307
            r26 = 604800000(0x240c8400, double:2.988109026E-315)
            long r26 = r26 + r0
            X.2sH r12 = r11.A0E
            long r13 = r12.A0H()
            int r12 = (r26 > r13 ? 1 : (r26 == r13 ? 0 : -1))
            if (r12 >= 0) goto L_0x0307
            X.33p r11 = r11.A0H
            android.content.SharedPreferences r12 = X.AnonymousClass0x2.A0F(r11)
            java.lang.String r11 = "last_read_conversation_time"
            long r12 = X.AnonymousClass0x2.A0B(r12, r11)
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x0307
        L_0x02fe:
            X.33T r1 = r2.A0M
            java.lang.String r0 = "UpdateMessageNotificationRunnable4"
            r1.A09(r8, r0)
            goto L_0x0213
        L_0x0307:
            X.2RW r11 = r2.A0Z
            X.34x r0 = r7.A00
            r36 = r0
            java.util.concurrent.atomic.AtomicBoolean r1 = r11.A04
            r15 = 0
            r0 = 1
            boolean r0 = r1.compareAndSet(r15, r0)
            if (r0 == 0) goto L_0x03ba
            X.2KT r13 = r11.A01
            java.lang.String[] r21 = X.AnonymousClass0x9.A1Y()
            X.2sH r0 = r13.A00
            r35 = r0
            long r0 = r35.A0H()
            r26 = 604800000(0x240c8400, double:2.988109026E-315)
            long r0 = r0 - r26
            r12 = r21
            X.C18280x3.A1R(r12, r15, r0)
            X.1RI r0 = r13.A01
            r27 = r0
            X.4Fq r26 = r27.A0C()
            r0 = r26
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0e90 }
            X.2sg r0 = r0.A03     // Catch:{ all -> 0x0e90 }
            r13 = r0
            java.lang.String r12 = "dismissed_chat"
            java.lang.String r1 = "timestamp < ?"
            java.lang.String r0 = "CLEAR_OLD_CHATS"
            r14 = r13
            r13 = r12
            r12 = r1
            r1 = r0
            r0 = r21
            r14.A07(r13, r12, r1, r0)     // Catch:{ all -> 0x0e90 }
            java.util.ArrayList r21 = X.C18320x8.A0n(r26)
            java.lang.String[] r12 = X.AnonymousClass0x9.A1Y()
            long r0 = r35.A0H()
            r13 = 604800000(0x240c8400, double:2.988109026E-315)
            long r0 = r0 - r13
            X.C18280x3.A1R(r12, r15, r0)
            X.4GK r26 = r27.get()
            r0 = r26
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0e90 }
            X.2sg r13 = r0.A03     // Catch:{ all -> 0x0e90 }
            java.lang.String r1 = "SELECT chat_jid, timestamp FROM dismissed_chat WHERE timestamp > ?"
            java.lang.String r0 = "GET_DISMISSED_CHATS"
            android.database.Cursor r13 = r13.A0E(r1, r0, r12)     // Catch:{ all -> 0x0e90 }
            java.lang.String r0 = "chat_jid"
            int r15 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0e84 }
            java.lang.String r0 = "timestamp"
            int r12 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0e84 }
        L_0x0380:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x0e84 }
            if (r0 == 0) goto L_0x039a
            X.4uZ r14 = X.AnonymousClass0x2.A0K(r13, r15)     // Catch:{ all -> 0x0e84 }
            long r0 = r13.getLong(r12)     // Catch:{ all -> 0x0e84 }
            if (r14 == 0) goto L_0x0380
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0e84 }
            r0 = r21
            X.AnonymousClass0x2.A1G(r14, r1, r0)     // Catch:{ all -> 0x0e84 }
            goto L_0x0380
        L_0x039a:
            r13.close()     // Catch:{ all -> 0x0e90 }
            r26.close()
            java.util.Iterator r13 = r21.iterator()
        L_0x03a4:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x03ba
            java.lang.Object r0 = r13.next()
            X.0PJ r0 = (X.AnonymousClass0PJ) r0
            java.util.Map r12 = r11.A03
            java.lang.Object r1 = r0.A00
            java.lang.Object r0 = r0.A01
            r12.put(r1, r0)
            goto L_0x03a4
        L_0x03ba:
            r0 = r36
            X.2z0 r0 = r0.A1J
            X.4uZ r0 = r0.A00
            java.util.Map r1 = r11.A03
            boolean r11 = r1.containsKey(r0)
            if (r11 == 0) goto L_0x03e0
            long r12 = X.C18290x4.A0C(r0, r1)
            r0 = r36
            long r0 = r0.A0K
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 < 0) goto L_0x03e0
            goto L_0x02fe
        L_0x03d6:
            int r0 = r0.A07
            r20 = r0
            goto L_0x027f
        L_0x03dc:
            int r1 = r0.A05
            goto L_0x0277
        L_0x03e0:
            int r17 = r17 + r28
            int r44 = r44 + r20
            int r10 = r10 + 1
            java.util.Collections.reverse(r29)
            r1 = r24
            r0 = r29
            r1.add(r0)
            if (r30 == 0) goto L_0x0400
            r0 = r30
            X.34x r0 = r0.A00
            long r11 = r0.A0K
            X.34x r0 = r7.A00
            long r0 = r0.A0K
            int r13 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r13 >= 0) goto L_0x0408
        L_0x0400:
            X.3Ex r0 = r2.A0D
            X.3ZH r5 = r0.A0A(r8)
            r30 = r7
        L_0x0408:
            X.34x r0 = r7.A00
            X.2z0 r7 = r0.A1J
            r0 = r33
            X.AnonymousClass2z0.A0A(r7, r0)
            boolean r1 = r7.A02
            r0.append(r1)
            X.4uZ r0 = r7.A00
            java.lang.String r1 = X.C627336j.A07(r0)
            r0 = r33
            r0.append(r1)
            goto L_0x0213
        L_0x0423:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "messagenotification/curmsg/null "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r7 = " "
            r0 = r28
            X.C18260x0.A0z(r7, r1, r0)
            goto L_0x0213
        L_0x0439:
            java.util.List r1 = r0.A05()
            goto L_0x0207
        L_0x043f:
            X.314 r0 = r2.A0G
            X.2ss r0 = r0.A02
            r0.A0G()
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            java.util.Collection r0 = r0.A0E()
            java.util.Iterator r7 = r0.iterator()
        L_0x0452:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0207
            java.lang.Object r5 = r7.next()
            X.31A r5 = (X.AnonymousClass31A) r5
            boolean r0 = r5 instanceof X.AnonymousClass1RL
            if (r0 == 0) goto L_0x0452
            X.1RL r5 = (X.AnonymousClass1RL) r5
            boolean r0 = r5.A0L
            if (r0 != 0) goto L_0x0452
            X.4uZ r0 = r5.A05()
            r1.add(r0)
            goto L_0x0452
        L_0x0470:
            if (r4 == 0) goto L_0x04c6
            if (r16 != 0) goto L_0x04c6
            X.3Ex r1 = r2.A0D
            X.4uZ r0 = X.AnonymousClass2z0.A00(r4)
            X.3ZH r5 = r1.A0A(r0)
        L_0x047e:
            java.lang.String r0 = r33.toString()
            java.lang.String r21 = X.C627236i.A04(r0)
            X.C626936e.A06(r21)
            boolean r1 = r2.A00
            X.33p r0 = r2.A0O
            r66 = r0
            X.8qC r0 = r0.A01
            r65 = r0
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r65)
            if (r1 == 0) goto L_0x04c2
            java.lang.String r1 = "locked_chat_notification_hash"
        L_0x049b:
            java.lang.String r1 = X.C18280x3.A0Z(r0, r1)
            X.3Lw r0 = r2.A0a
            r64 = r0
            boolean r7 = r2.A00
            boolean r0 = r0.A0P(r6, r7)
            r7 = r0 ^ 1
            r0 = r21
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x04c9
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "messagenotification/same "
            r0 = r21
            java.lang.String r0 = X.AnonymousClass000.A0V(r1, r0, r2)
            goto L_0x005f
        L_0x04c2:
            java.lang.String r1 = "notification_hash"
            goto L_0x049b
        L_0x04c6:
            r6 = r30
            goto L_0x047e
        L_0x04c9:
            if (r10 == 0) goto L_0x04df
            if (r5 == 0) goto L_0x04df
            if (r7 == 0) goto L_0x04f2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "messagenotification/muted "
            X.AnonymousClass3ZH.A0C(r5, r0, r1)
            java.lang.String r0 = r1.toString()
            goto L_0x011e
        L_0x04df:
            X.33T r3 = r2.A0M
            int r1 = r2.A00()
            java.lang.String r0 = "UpdateMessageNotificationRunnable1"
            r3.A05(r1, r0)
            java.lang.String r0 = "messagenotification/cancel"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            goto L_0x0121
        L_0x04f2:
            java.lang.String r0 = " hash="
            r3.append(r0)
            r0 = r21
            r3.append(r0)
            java.lang.String r0 = " msg="
            r3.append(r0)
            r0 = r17
            r3.append(r0)
            java.lang.String r0 = " contacts="
            r3.append(r0)
            r3.append(r10)
            java.lang.String r0 = " isWearRefresh="
            r3.append(r0)
            r0 = r18
            r3.append(r0)
            r0 = r25
            r3.append(r0)
            r0 = r19
            r3.append(r0)
            java.lang.String r0 = " newMessage="
            r3.append(r0)
            if (r4 == 0) goto L_0x052c
            java.lang.String r34 = "nonNull"
        L_0x052c:
            r0 = r34
            r3.append(r0)
            java.lang.Class<X.4uZ> r29 = X.C95814uZ.class
            r0 = r29
            X.4uZ r12 = X.AnonymousClass3ZH.A02(r5, r0)
            r0 = r64
            boolean r30 = r0.A0M(r12)
            boolean r28 = X.C627336j.A0K(r12)
            X.34x r8 = r6.A00
            r20 = 1
            r15 = 0
            if (r30 != 0) goto L_0x05b4
            if (r28 == 0) goto L_0x05b4
            X.2ss r0 = r2.A0Q
            long r26 = r0.A08(r12)
            r13 = 0
            int r0 = (r26 > r13 ? 1 : (r26 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x05b4
            X.2Ww r0 = r2.A0g
            boolean r0 = r0.A00(r8)
            if (r0 != 0) goto L_0x05b4
            X.2sj r1 = r2.A0R
            r0 = r12
            X.1fL r0 = (X.C28011fL) r0
            X.33k r0 = X.C56892sj.A01(r1, r0)
            X.6aS r13 = r0.A04()
            int r1 = r13.size()
            r0 = 10
            if (r1 <= r0) goto L_0x05b4
            X.8Nf r11 = r13.iterator()
            r7 = 0
        L_0x057a:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x059d
            X.2zG r0 = X.C18320x8.A0G(r11)
            X.3Ex r1 = r2.A0D
            com.whatsapp.jid.UserJid r0 = r0.A03
            X.3ZH r0 = r1.A07(r0)
            if (r0 == 0) goto L_0x057a
            X.2k5 r0 = r0.A0F
            if (r0 == 0) goto L_0x057a
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x057a
            int r7 = r7 + 1
            goto L_0x057a
        L_0x059d:
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = (float) r7
            float r1 = r1 * r0
            int r0 = r13.size()
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 1103626240(0x41c80000, float:25.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x05b4
            java.lang.String r0 = " initial-mute-large-group"
            r3.append(r0)
            r30 = 1
        L_0x05b4:
            java.util.List r1 = r8.A18
            X.2sr r0 = r2.A05
            boolean r1 = X.C624435a.A05(r0, r1)
            X.34x r0 = r8.A0w()
            if (r0 == 0) goto L_0x067f
            X.4uZ r0 = r0.A0n()
            if (r0 != 0) goto L_0x067f
        L_0x05c8:
            if (r30 == 0) goto L_0x067a
            if (r28 == 0) goto L_0x067a
            if (r1 != 0) goto L_0x05d0
            if (r20 == 0) goto L_0x067a
        L_0x05d0:
            X.4uZ r1 = r8.A0n()
            if (r1 == 0) goto L_0x067a
            r0 = r67
            boolean r0 = r0.A0h(r1)
            if (r0 != 0) goto L_0x067a
            r0 = r67
            X.2sa r1 = X.AnonymousClass1R1.A00(r1, r0)
        L_0x05e4:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)
            X.0PJ r1 = X.AnonymousClass0x9.A0G(r1, r0)
            java.lang.Object r0 = r1.A00
            r30 = r0
            r0 = r30
            X.2sa r0 = (X.C56802sa) r0
            r30 = r0
            java.lang.Object r0 = r1.A01
            X.C626936e.A06(r0)
            boolean r45 = X.AnonymousClass001.A1Z(r0)
            X.2HT r0 = r2.A0c
            r63 = r0
            X.2HS r0 = r0.A00
            if (r0 == 0) goto L_0x0677
            com.whatsapp.notification.PopupNotification r1 = r0.A00
            boolean r0 = r1.A1S
            if (r0 == 0) goto L_0x0677
            X.4uZ r0 = r1.A0z
            r20 = r0
        L_0x0611:
            r0 = r20
            boolean r11 = r12.equals(r0)
            r0 = r29
            com.whatsapp.jid.Jid r1 = X.AnonymousClass3ZH.A05(r5, r0)
            r0 = r67
            X.2sa r38 = X.AnonymousClass1R1.A00(r1, r0)
            java.lang.String r0 = r38.A06()
            int r59 = java.lang.Integer.parseInt(r0)
            X.33i r0 = r2.A0K
            r62 = r0
            android.telephony.TelephonyManager r7 = r62.A0N()
            if (r4 == 0) goto L_0x0674
            if (r7 == 0) goto L_0x0674
            boolean r0 = X.C107385bE.A09()
            if (r0 == 0) goto L_0x066d
            X.5ZR r1 = r2.A0N
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            int r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x066d
        L_0x0647:
            X.5TW r0 = r2.A0B
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x0674
            if (r31 != 0) goto L_0x0674
            long r13 = r38.A00()
            r7 = 0
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 == 0) goto L_0x0661
            if (r45 != 0) goto L_0x0674
        L_0x0661:
            if (r59 != 0) goto L_0x0665
            if (r11 == 0) goto L_0x0674
        L_0x0665:
            r46 = 1
        L_0x0667:
            X.C626936e.A00()
            r28 = 1
            goto L_0x0683
        L_0x066d:
            int r0 = r7.getCallState()     // Catch:{ SecurityException -> 0x0647 }
            if (r0 != 0) goto L_0x0674
            goto L_0x0647
        L_0x0674:
            r46 = 0
            goto L_0x0667
        L_0x0677:
            r20 = 0
            goto L_0x0611
        L_0x067a:
            r1 = 0
            r15 = r30
            goto L_0x05e4
        L_0x067f:
            r20 = 0
            goto L_0x05c8
        L_0x0683:
            int r0 = X.C159787mS.A00(r9)     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
            boolean r0 = X.AnonymousClass000.A1T(r0)     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
            if (r0 == 0) goto L_0x06ff
            X.7l6 r0 = com.whatsapp.notification.AndroidWear.A0B     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
            if (r0 != 0) goto L_0x06a4
            X.7XI r1 = new X.7XI     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
            X.7Jm r0 = X.AnonymousClass79G.A02     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
            r1.A01(r0)     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
            X.7l6 r0 = r1.A00()     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
            com.whatsapp.notification.AndroidWear.A0B = r0     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
            r0.A05()     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
        L_0x06a4:
            X.7l6 r0 = com.whatsapp.notification.AndroidWear.A0B     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
            if (r0 == 0) goto L_0x06ff
            boolean r0 = r0.A04()     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
            if (r0 == 0) goto L_0x06ff
            X.7l6 r0 = com.whatsapp.notification.AndroidWear.A0B     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
            X.6Ye r7 = new X.6Ye     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
            r0.A03(r7)     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
            java.lang.String r0 = "await must not be called on the UI thread"
            X.C162177rO.A06(r0)     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
            boolean r0 = r7.A0C     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
            r1 = r0 ^ 1
            java.lang.String r0 = "Result has already been consumed"
            X.C162177rO.A04(r0, r1)     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
            java.util.concurrent.CountDownLatch r0 = r7.A09     // Catch:{ InterruptedException -> 0x06cc }
            r0.await()     // Catch:{ InterruptedException -> 0x06cc }
            goto L_0x06d1
        L_0x06cc:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.A08     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
            r7.A07(r0)     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
        L_0x06d1:
            java.util.concurrent.CountDownLatch r0 = r7.A09     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
            long r26 = r0.getCount()     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
            r13 = 0
            int r0 = (r26 > r13 ? 1 : (r26 == r13 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1T(r0)     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
            java.lang.String r0 = "Result is not ready."
            X.C162177rO.A04(r0, r1)     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
            X.8lh r0 = r7.A01()     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
            X.4Fj r0 = (X.C85214Fj) r0     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
            X.3B2 r0 = (X.AnonymousClass3B2) r0     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
            java.util.List r0 = r0.A01     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
            r0.size()     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x06f8, all -> 0x0e95 }
            if (r0 <= 0) goto L_0x06ff
            goto L_0x0701
        L_0x06f8:
            r1 = move-exception
            java.lang.String r0 = "androidwear/pairedcheck/failed"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0701
        L_0x06ff:
            r28 = 0
        L_0x0701:
            java.lang.String r0 = " isAndroidWearPaired="
            r3.append(r0)
            r0 = r28
            r3.append(r0)
            boolean r0 = r2.A05()
            r13 = 134217728(0x8000000, float:3.85186E-34)
            if (r0 == 0) goto L_0x0afe
            r0 = 1
            if (r10 != r0) goto L_0x0afe
            r11 = 0
            r1 = 2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            android.net.Uri r0 = X.AnonymousClass326.A00(r5)
            android.content.Intent r7 = X.C627736r.A0H(r9, r0, r1)
            java.lang.String r1 = "fromNotification"
            r0 = 1
            android.content.Intent r1 = r7.putExtra(r1, r0)
            java.lang.String r0 = "last_notification_keep_in_chat"
            android.content.Intent r1 = r1.putExtra(r0, r11)
            java.lang.String r0 = "ChatNotification"
            X.AnonymousClass5VI.A01(r1, r0)
            X.0PJ r1 = X.AnonymousClass0x9.A0G(r8, r1)
            java.lang.Object r0 = r1.A00
            X.C626936e.A06(r0)
            int r0 = X.AnonymousClass001.A0K(r0)
            java.lang.Object r7 = r1.A01
            android.content.Intent r7 = (android.content.Intent) r7
        L_0x0747:
            android.app.PendingIntent r33 = X.C624735e.A00(r9, r0, r7, r13)
            java.lang.Class<com.whatsapp.notification.MessageNotificationDismissedReceiver> r0 = com.whatsapp.notification.MessageNotificationDismissedReceiver.class
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r9, r0)
            java.lang.String r7 = "notification_hash"
            r0 = r21
            r1.putExtra(r7, r0)
            int r0 = r2.A00()
            android.app.PendingIntent r34 = X.C624735e.A01(r9, r0, r1, r13)
            boolean r1 = r2.A05()
            int r27 = r17 + r44
            r13 = 0
            r11 = 1
            if (r10 != r11) goto L_0x0ac0
            r0 = r17
            if (r0 == r11) goto L_0x0777
            if (r44 == 0) goto L_0x0aad
            X.34x r0 = r6.A00
            boolean r0 = r0 instanceof X.C30571mf
            if (r0 == 0) goto L_0x0aad
        L_0x0777:
            if (r1 == 0) goto L_0x0aad
            java.lang.CharSequence r40 = r6.A04(r5, r13)
        L_0x077d:
            boolean r0 = r2.A05()
            if (r0 == 0) goto L_0x0a9e
            if (r10 != r11) goto L_0x0a9e
            X.5ZU r0 = r2.A0F
            java.lang.String r0 = r0.A0H(r5)
            java.lang.String r41 = X.C106815aD.A02(r0)
        L_0x078f:
            X.5TW r0 = r2.A0B
            r61 = r0
            X.33j r1 = r2.A0P
            X.2WH r0 = r2.A0S
            r60 = r0
            X.5mA r15 = r2.A0I
            X.5iU r0 = r2.A0A
            boolean r55 = r2.A05()
            X.2iI r32 = new X.2iI
            r47 = r32
            r48 = r0
            r49 = r61
            r50 = r15
            r51 = r1
            r52 = r60
            r53 = r64
            r54 = r4
            r56 = r18
            r57 = r19
            r58 = r22
            r47.<init>(r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            r35 = r9
            r36 = r5
            r37 = r6
            r39 = r30
            r42 = r3
            r43 = r17
            X.0Ue r0 = r32.A00(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            boolean r22 = r2.A06(r5)
            r1 = r29
            com.whatsapp.jid.Jid r1 = r5.A0I(r1)
            X.4uZ r1 = (X.C95814uZ) r1
            X.2ss r7 = r2.A0Q
            int r13 = r7.A03(r12)
            X.C626936e.A06(r6)
            X.34x r7 = r6.A00
            long r7 = r7.A0I
            boolean r14 = r2.A08(r1, r13, r7)
            int r7 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r7 >= r1) goto L_0x0863
            if (r18 != 0) goto L_0x0863
            java.lang.String r1 = r38.A06()
            int r1 = java.lang.Integer.parseInt(r1)
            r8 = 0
            if (r10 != r11) goto L_0x0800
            r54 = 1
            if (r22 != 0) goto L_0x0802
        L_0x0800:
            r54 = 0
        L_0x0802:
            if (r1 != 0) goto L_0x0808
            r22 = 1
            if (r14 != 0) goto L_0x080a
        L_0x0808:
            r22 = 0
        L_0x080a:
            X.30o r7 = r2.A0e
            X.34x r1 = r6.A00
            boolean r14 = r7.A06(r1)
            r1 = r17
            if (r1 != r11) goto L_0x0a95
            if (r14 == 0) goto L_0x0a95
            X.2i0 r8 = r2.A0b
            X.34x r7 = r6.A00
            X.3ZH r1 = r6.A02()
            r8.A01(r9, r0, r1, r7)
            r54 = 0
        L_0x0825:
            X.3Lw r1 = r6.A0B
            r52 = r11
            r47 = r1
            r48 = r0
            r49 = r5
            r50 = r6
            r51 = r11
            r53 = r28
            r47.A0L(r48, r49, r50, r51, r52, r53, r54)
            boolean r1 = r2.A05()
            r6.A07(r0, r5, r3, r1)
            boolean r8 = r6.A08(r9, r0, r5)
        L_0x0843:
            if (r10 != r11) goto L_0x0863
            r1 = r64
            android.graphics.Bitmap r1 = r1.A0D(r5)
            r0.A06(r1)
            X.1VX r7 = r2.A0T
            r6 = 3156(0xc54, float:4.422E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r1 = r7.A0Y(r1, r6)
            r7 = 1
            if (r1 != 0) goto L_0x0a74
            r7 = 0
            if (r22 == 0) goto L_0x0a74
            if (r8 != 0) goto L_0x0a74
        L_0x0860:
            r2.A02(r9, r0, r5)
        L_0x0863:
            long r6 = java.lang.System.currentTimeMillis()
            X.33b r1 = r2.A0Y
            long r13 = r1.A00
            long r30 = r6 - r13
            r1.A00 = r6
            r6 = 200(0xc8, double:9.9E-322)
            int r1 = (r30 > r6 ? 1 : (r30 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x098f
            if (r19 != 0) goto L_0x098f
            android.telephony.TelephonyManager r14 = r62.A0N()
            r1 = r29
            com.whatsapp.jid.Jid r6 = X.AnonymousClass3ZH.A05(r5, r1)
            r1 = r67
            X.2sa r26 = X.AnonymousClass1R1.A00(r6, r1)
            boolean r13 = r61.A01()
            boolean r22 = r61.A04()
            r8 = 1
            r11 = 0
            if (r13 == 0) goto L_0x0896
            r7 = 1
            if (r22 == 0) goto L_0x0897
        L_0x0896:
            r7 = 0
        L_0x0897:
            if (r14 == 0) goto L_0x08a9
            boolean r1 = X.C107385bE.A09()
            if (r1 == 0) goto L_0x0a6b
            X.5ZR r6 = r2.A0N
            java.lang.String r1 = "android.permission.READ_PHONE_STATE"
            int r1 = r6.A02(r1)
            if (r1 == 0) goto L_0x0a6b
        L_0x08a9:
            r1 = 0
        L_0x08aa:
            if (r13 != 0) goto L_0x08b6
            if (r1 != 0) goto L_0x08b6
            X.5pj r6 = r15.A00
            if (r6 == 0) goto L_0x0a1f
            boolean r6 = r6.A0S
            if (r6 == 0) goto L_0x0a1f
        L_0x08b6:
            java.lang.String r6 = " vibrate=force off ("
            r3.append(r6)
            r3.append(r7)
            r6 = 32
            r3.append(r6)
            r3.append(r1)
            r6 = 41
            r3.append(r6)
            long[] r8 = new long[r8]
            r13 = 0
            r8[r11] = r13
            android.app.Notification r6 = r0.A07
            r6.vibrate = r8
            if (r1 != 0) goto L_0x0959
        L_0x08d7:
            if (r22 != 0) goto L_0x0959
            X.2Vv r1 = r2.A0J
            X.2fl r6 = r1.A00()
            X.1id r1 = r2.A0j
            boolean r1 = r1.A09()
            if (r1 != 0) goto L_0x0a0c
            X.1iO r1 = r2.A03
            boolean r1 = r1.A00
            if (r1 == 0) goto L_0x0a0c
            r1 = r29
            com.whatsapp.jid.Jid r1 = r5.A0I(r1)
            X.4uZ r1 = (X.C95814uZ) r1
            boolean r1 = r6.A01(r1)
            if (r1 == 0) goto L_0x0a0c
            android.content.SharedPreferences r8 = X.C18300x5.A0B(r65)
            java.lang.String r6 = "conversation_sound"
            r1 = 1
            boolean r1 = r8.getBoolean(r6, r1)
            if (r1 == 0) goto L_0x0a09
            java.lang.String r1 = " tone=conversation"
            java.lang.StringBuilder r6 = X.C18290x4.A0w(r1, r3)
            java.lang.String r1 = X.C58152un.A04
            r6.append(r1)
            r1 = 2132017165(0x7f14000d, float:1.96726E38)
            java.lang.String r6 = X.AnonymousClass000.A0h(r6, r1)
        L_0x091a:
            if (r7 == 0) goto L_0x0932
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L_0x0932
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r1 = X.C58152un.A04
            r6.append(r1)
            r1 = 2132017167(0x7f14000f, float:1.9672605E38)
            java.lang.String r6 = X.AnonymousClass000.A0h(r6, r1)
        L_0x0932:
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L_0x0959
            android.net.Uri r6 = android.net.Uri.parse(r6)
            java.lang.String r1 = " sound="
            r3.append(r1)
            r3.append(r6)
            if (r6 == 0) goto L_0x0959
            if (r45 != 0) goto L_0x0959
            X.2yL r1 = r2.A0o
            r33 = r9
            r34 = r6
            r35 = r0
            r36 = r62
            r37 = r60
            r38 = r1
            X.C66553Lw.A09(r33, r34, r35, r36, r37, r38)
        L_0x0959:
            X.1id r6 = r2.A0j
            boolean r1 = r6.A09()
            if (r1 == 0) goto L_0x09fc
            java.lang.String r1 = r26.A05()
            java.lang.Integer r1 = X.C66553Lw.A04(r1)
            if (r1 == 0) goto L_0x09f9
            int r8 = r1.intValue()
            r6 = 1000(0x3e8, float:1.401E-42)
            r1 = 4000(0xfa0, float:5.605E-42)
            android.app.Notification r7 = r0.A07
            r7.ledARGB = r8
            r7.ledOnMS = r6
            r7.ledOffMS = r1
            r6 = 1
            int r1 = r7.flags
            r1 = r1 & -2
            r6 = r6 | r1
            r7.flags = r6
            java.lang.String r1 = " color="
            r3.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r8)
        L_0x098c:
            r3.append(r1)
        L_0x098f:
            r6 = 28
            r1 = r24
            X.AnonymousClass4IU.A00(r1, r6)
            int r6 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r6 < r1) goto L_0x09b2
            r1 = 27
            if (r6 > r1) goto L_0x09b2
            int r6 = r24.size()
            r1 = 2
            if (r6 != r1) goto L_0x09b2
            X.33T r7 = r2.A0M
            int r6 = r2.A00()
            java.lang.String r1 = "UpdateMessageNotificationRunnable3"
            r7.A05(r6, r1)
        L_0x09b2:
            boolean r1 = r2.A05()
            if (r1 == 0) goto L_0x09cd
            r52 = 0
            r47 = r2
            r48 = r3
            r49 = r24
            r50 = r17
            r51 = r10
            r53 = r28
            r54 = r46
            r55 = r23
            r47.A04(r48, r49, r50, r51, r52, r53, r54, r55)
        L_0x09cd:
            androidx.core.app.NotificationCompat$InboxStyle r8 = new androidx.core.app.NotificationCompat$InboxStyle
            r8.<init>()
            java.lang.CharSequence r1 = X.C05610Ue.A00(r40)
            r8.A01 = r1
            r1 = 1
            r8.A02 = r1
            r1 = r32
            java.lang.String r1 = r1.A00
            r22 = r1
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.Iterator r6 = r24.iterator()
        L_0x09e9:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0b36
            java.lang.Object r1 = r6.next()
            java.util.Collection r1 = (java.util.Collection) r1
            r7.addAll(r1)
            goto L_0x09e9
        L_0x09f9:
            java.lang.String r1 = " color=null"
            goto L_0x098c
        L_0x09fc:
            java.lang.String r1 = " screen_lock="
            r3.append(r1)
            boolean r1 = r6.A09()
            r3.append(r1)
            goto L_0x098f
        L_0x0a09:
            r6 = 0
            goto L_0x091a
        L_0x0a0c:
            java.lang.String r1 = " tone=notification"
            r3.append(r1)
            java.lang.String r6 = r26.A07()
            if (r6 != 0) goto L_0x091a
            android.net.Uri r1 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI
            java.lang.String r6 = r1.toString()
            goto L_0x091a
        L_0x0a1f:
            if (r45 != 0) goto L_0x08d7
            java.lang.String r6 = r26.A08()
            java.lang.String r1 = " vibrate="
            r3.append(r1)
            r3.append(r6)
            int r11 = r6.hashCode()
            r1 = 2
            switch(r11) {
                case 49: goto L_0x0a37;
                case 50: goto L_0x0a44;
                case 51: goto L_0x0a4e;
                default: goto L_0x0a35;
            }
        L_0x0a35:
            goto L_0x08d7
        L_0x0a37:
            java.lang.String r8 = "1"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x08d7
            r0.A02(r1)
            goto L_0x08d7
        L_0x0a44:
            java.lang.String r1 = "2"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L_0x0a57
            goto L_0x08d7
        L_0x0a4e:
            java.lang.String r1 = "3"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x08d7
            r8 = 2
        L_0x0a57:
            r1 = 5
            long[] r6 = new long[r1]
            int r8 = 1 - r8
            if (r8 == 0) goto L_0x0a67
            r6 = {0, 750, 250, 750, 250} // fill-array
        L_0x0a61:
            android.app.Notification r1 = r0.A07
            r1.vibrate = r6
            goto L_0x08d7
        L_0x0a67:
            r6 = {0, 300, 200, 300, 200} // fill-array
            goto L_0x0a61
        L_0x0a6b:
            int r6 = r14.getCallState()     // Catch:{ SecurityException -> 0x08a9 }
            r1 = 1
            if (r6 != 0) goto L_0x08aa
            goto L_0x08a9
        L_0x0a74:
            boolean r1 = r2.A07(r5)
            if (r1 == 0) goto L_0x0a85
            r1 = 21
            X.C66553Lw.A0A(r9, r0, r5, r1)
        L_0x0a7f:
            if (r7 == 0) goto L_0x0863
            if (r14 != 0) goto L_0x0863
            goto L_0x0860
        L_0x0a85:
            if (r46 != 0) goto L_0x0a7f
            if (r8 != 0) goto L_0x0a7f
            if (r14 != 0) goto L_0x0a7f
            X.0Tm r6 = com.whatsapp.notification.AndroidWear.A00(r9, r5)
            java.util.ArrayList r1 = r0.A0O
            r1.add(r6)
            goto L_0x0a7f
        L_0x0a95:
            if (r54 == 0) goto L_0x0a9a
            r2.A03(r0, r5, r1, r11)
        L_0x0a9a:
            if (r1 != r11) goto L_0x0843
            goto L_0x0825
        L_0x0a9e:
            r0 = r64
            X.2oU r0 = r0.A0B
            android.content.Context r1 = r0.A00
            r0 = 2131895972(0x7f1226a4, float:1.9426792E38)
            java.lang.String r41 = r1.getString(r0)
            goto L_0x078f
        L_0x0aad:
            X.33j r15 = r6.A08
            r14 = 2131755233(0x7f1000e1, float:1.914134E38)
            r0 = r27
            long r7 = (long) r0
            java.lang.Object[] r1 = new java.lang.Object[r11]
            X.AnonymousClass000.A1P(r1, r0, r13)
            java.lang.String r40 = r15.A0L(r1, r14, r7)
            goto L_0x077d
        L_0x0ac0:
            X.4uZ r0 = r5.A0H
            boolean r1 = r0 instanceof X.C95804uY
            r7 = 2
            X.33j r0 = r6.A08
            r37 = r0
            r26 = 2131755235(0x7f1000e3, float:1.9141344E38)
            if (r1 == 0) goto L_0x0ad1
            r26 = 2131755236(0x7f1000e4, float:1.9141346E38)
        L_0x0ad1:
            long r0 = (long) r10
            r35 = r0
            java.lang.Object[] r14 = new java.lang.Object[r7]
            r0 = r27
            long r0 = (long) r0
            r31 = r0
            java.lang.Object[] r15 = new java.lang.Object[r11]
            r0 = r27
            X.AnonymousClass000.A1P(r15, r0, r13)
            r0 = 2131755234(0x7f1000e2, float:1.9141342E38)
            r8 = r0
            r0 = r31
            r7 = r37
            java.lang.String r0 = r7.A0L(r15, r8, r0)
            r14[r13] = r0
            X.AnonymousClass000.A1P(r14, r10, r11)
            r0 = r35
            r8 = r7
            r7 = r26
            java.lang.String r40 = r8.A0L(r14, r7, r0)
            goto L_0x077d
        L_0x0afe:
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x0b29
            X.C626936e.A0C(r0)
            android.content.Intent r7 = X.C18320x8.A07()
            java.lang.String r1 = r9.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversationslist.LockedConversationsActivity"
            r7.setClassName(r1, r0)
            java.lang.String r1 = "fromNotification"
            r0 = 1
            android.content.Intent r7 = r7.putExtra(r1, r0)
            if (r10 != r0) goto L_0x0b26
            X.4uZ r0 = r5.A0H
            java.lang.String r1 = X.C627336j.A07(r0)
            java.lang.String r0 = "jid"
            r7.putExtra(r0, r1)
        L_0x0b26:
            r0 = 0
            goto L_0x0747
        L_0x0b29:
            android.content.Intent r1 = X.C18300x5.A07(r9)
            java.lang.String r0 = "com.whatsapp.intent.action.CHATS"
            android.content.Intent r7 = r1.setAction(r0)
            r0 = 2
            goto L_0x0747
        L_0x0b36:
            r6 = 0
            X.3cn r1 = new X.3cn
            r1.<init>(r6)
            java.util.Collections.sort(r7, r1)
            int r1 = r7.size()
            int r1 = r1 + -7
            r11 = 0
            int r6 = java.lang.Math.max(r6, r1)
            int r1 = r7.size()
            java.util.List r15 = r7.subList(r6, r1)
            int r1 = r15.size()
            r13 = 1
            if (r1 <= r13) goto L_0x0bcc
            boolean r1 = r2.A05()
            if (r1 == 0) goto L_0x0bcc
            r7 = 0
        L_0x0b60:
            int r1 = r15.size()
            if (r7 >= r1) goto L_0x0bb7
            java.lang.Object r6 = r15.get(r7)
            X.2sO r6 = (X.C56682sO) r6
            X.3Ex r14 = r6.A04
            X.34x r1 = r6.A00
            X.4uZ r1 = X.AnonymousClass2z0.A00(r1)
            X.3ZH r14 = r14.A0A(r1)
            r1 = 1
            if (r10 > r13) goto L_0x0b7c
            r1 = 0
        L_0x0b7c:
            java.lang.CharSequence r17 = r6.A04(r14, r1)
            if (r17 == 0) goto L_0x0b8b
            java.util.ArrayList r14 = r8.A00
            java.lang.CharSequence r1 = X.C05610Ue.A00(r17)
            r14.add(r1)
        L_0x0b8b:
            java.lang.String r1 = " line:"
            X.C18310x6.A1O(r3, r1)
            int r1 = r17.length()
            r3.append(r1)
            r1 = 47
            r3.append(r1)
            X.34x r14 = r6.A00
            X.4uZ r14 = X.AnonymousClass2z0.A00(r14)
            X.AnonymousClass000.A1B(r14, r3)
            r3.append(r1)
            X.34x r1 = r6.A00
            X.2z0 r1 = r1.A1J
            X.AnonymousClass2z0.A0A(r1, r3)
            java.lang.String r1 = ")"
            r3.append(r1)
            int r7 = r7 + 1
            goto L_0x0b60
        L_0x0bb7:
            r0.A08(r8)
            java.lang.String r1 = " inbox:"
            r3.append(r1)
            r1 = 8
            int r6 = r15.size()
            int r1 = java.lang.Math.min(r1, r6)
            r3.append(r1)
        L_0x0bcc:
            int r1 = android.os.Build.VERSION.SDK_INT
            r6 = 26
            r7 = 0
            if (r1 < r6) goto L_0x0be9
            X.4uZ r6 = r5.A0H
            boolean r6 = r6 instanceof X.C95804uY
            if (r6 != 0) goto L_0x0be9
            java.lang.String r6 = X.AnonymousClass3ZH.A08(r5)
            if (r6 == 0) goto L_0x0be1
            r0.A0M = r6
        L_0x0be1:
            boolean r8 = r2.A00
            if (r8 == 0) goto L_0x0beb
            r0.A0E(r13)
            goto L_0x0beb
        L_0x0be9:
            r6 = r7
            goto L_0x0be1
        L_0x0beb:
            android.app.Notification r8 = r0.A01()     // Catch:{ SecurityException -> 0x0c1f }
            r0 = 24
            if (r1 < r0) goto L_0x0c03
            boolean r0 = r2.A05()     // Catch:{ SecurityException -> 0x0c1f }
            if (r0 == 0) goto L_0x0c03
            X.2b3 r0 = r2.A0d     // Catch:{ SecurityException -> 0x0c1f }
            X.2ic r0 = r0.A00(r9)     // Catch:{ SecurityException -> 0x0c1f }
            r0.A01(r11, r8)     // Catch:{ SecurityException -> 0x0c1f }
            goto L_0x0c0e
        L_0x0c03:
            X.2b3 r0 = r2.A0d     // Catch:{ SecurityException -> 0x0c1f }
            X.2ic r1 = r0.A00(r9)     // Catch:{ SecurityException -> 0x0c1f }
            r0 = r27
            r1.A01(r0, r8)     // Catch:{ SecurityException -> 0x0c1f }
        L_0x0c0e:
            if (r6 == 0) goto L_0x0c15
            X.3DP r0 = r2.A06     // Catch:{ SecurityException -> 0x0c1f }
            r0.A04(r9, r5, r7)     // Catch:{ SecurityException -> 0x0c1f }
        L_0x0c15:
            X.33T r1 = r2.A0M     // Catch:{ SecurityException -> 0x0c1f }
            int r0 = r2.A00()     // Catch:{ SecurityException -> 0x0c1f }
            r1.A04(r0, r8)     // Catch:{ SecurityException -> 0x0c1f }
            goto L_0x0c54
        L_0x0c1f:
            r6 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "messagenotification/postSummaryNotification uid="
            r1.append(r0)
            int r0 = android.os.Process.myUid()
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            com.whatsapp.util.Log.i(r0, r6)
            boolean r0 = X.C107535bT.A05()
            if (r0 == 0) goto L_0x0dfe
            if (r22 == 0) goto L_0x0e9b
            android.util.Pair r0 = X.C386728r.A00(r22)
            if (r0 == 0) goto L_0x0e9b
            java.lang.Object r0 = r0.first
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0e9b
            r1 = r67
            X.2sa r1 = r1.A0M(r0)
            r0 = r67
            r0.A0Z(r1)
        L_0x0c54:
            boolean r0 = r2.A00
            android.content.SharedPreferences$Editor r6 = X.C18270x1.A03(r66)
            if (r0 == 0) goto L_0x0dfa
            java.lang.String r1 = "locked_chat_last_notification_hash"
        L_0x0c5e:
            r0 = r21
            X.C18270x1.A0j(r6, r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "messagenotification/notify"
            X.C18260x0.A1R(r1, r0, r3)
            if (r4 == 0) goto L_0x0c87
            if (r19 != 0) goto L_0x0c87
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "messagenotification/ new="
            r1.append(r0)
            java.lang.String r0 = X.C627636p.A0E(r4)
            r1.append(r0)
            r0 = r25
            X.C18260x0.A1E(r0, r1, r11)
        L_0x0c87:
            if (r18 != 0) goto L_0x0062
            X.2Vv r0 = r2.A0J
            X.2fl r1 = r0.A00()
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0df6
            X.4FC r0 = r1.A00()
            r0.Bq8(r12)
        L_0x0c9a:
            if (r46 == 0) goto L_0x0cb8
            X.3Wi r6 = r2.A04
            X.1id r3 = r2.A0j
            X.1iO r1 = r2.A03
            r60 = 5
            X.3cA r0 = new X.3cA
            r53 = r0
            r54 = r9
            r55 = r3
            r56 = r63
            r57 = r1
            r58 = r20
            r53.<init>(r54, r55, r56, r57, r58, r59, r60)
            r6.A0S(r0)
        L_0x0cb8:
            if (r4 == 0) goto L_0x0062
            boolean r0 = r5.A0U()
            if (r0 == 0) goto L_0x0cea
            X.1fL r12 = (X.C28011fL) r12
            r0 = r64
            X.2sj r0 = r0.A0F
            int r3 = X.C56892sj.A00(r0, r12)
            int r1 = r3 + -1
            r0 = 35
            if (r3 >= r0) goto L_0x0df1
            r7 = 120000(0x1d4c0, double:5.9288E-319)
        L_0x0cd3:
            long r5 = java.lang.System.currentTimeMillis()
            r9 = 5000(0x1388, double:2.4703E-320)
            long r0 = (long) r1
            long r0 = r0 * r9
            r9 = 30000(0x7530, double:1.4822E-319)
            long r0 = r0 + r9
            long r0 = java.lang.Math.min(r0, r7)
            long r5 = r5 + r0
            r0 = r64
            java.util.HashMap r0 = r0.A0S
            X.AnonymousClass0x2.A1J(r12, r0, r5)
        L_0x0cea:
            X.2i9 r0 = r2.A07
            r0.A01()
            X.2z0 r6 = r4.A1J
            X.4uZ r3 = r6.A00
            if (r3 == 0) goto L_0x0d5a
            X.5mB r0 = r2.A0H
            r0.A06(r3, r11)
            X.7am r7 = r2.A08
            X.3Ex r0 = r7.A03
            X.3ZH r13 = r0.A07(r3)
            X.1VX r5 = r7.A0A
            r1 = 2456(0x998, float:3.442E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r5.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0d5a
            X.34q r8 = r7.A00
            boolean r0 = r8.A0C(r4)
            if (r0 == 0) goto L_0x0d5a
            if (r13 == 0) goto L_0x0d5a
            boolean r0 = r8.A0B()
            if (r0 == 0) goto L_0x0d5a
            X.2N9 r5 = r7.A01
            java.lang.Long r9 = X.AnonymousClass31J.A02(r13)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r4.A0I
            java.lang.Long r12 = X.C18320x8.A0Y(r7, r0)
            long r0 = r4.A0K
            java.lang.Long r10 = X.C18320x8.A0Y(r7, r0)
            java.lang.String r8 = r8.A09(r4)
            int r7 = X.C623434q.A00(r13)
            X.34q r5 = r5.A00
            boolean r0 = r5.A0D(r4)
            if (r0 == 0) goto L_0x0d5a
            X.1ZP r1 = new X.1ZP
            r1.<init>()
            r1.A02 = r9
            r1.A03 = r12
            r1.A01 = r10
            r1.A04 = r8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1.A00 = r0
            X.4FV r0 = r5.A08
            r0.BhD(r1)
        L_0x0d5a:
            X.2Q5 r5 = r2.A0V
            java.lang.String r7 = r6.toString()
            if (r3 == 0) goto L_0x0deb
            boolean r0 = X.C627336j.A0K(r3)
            if (r0 == 0) goto L_0x0de6
            r9 = 2
        L_0x0d69:
            java.lang.String r8 = r3.getRawString()
        L_0x0d6d:
            boolean r0 = r4 instanceof X.C30481mW
            if (r0 == 0) goto L_0x0d8a
            X.1mW r4 = (X.C30481mW) r4
            java.lang.String r0 = r4.A06
            r1 = 1
            if (r0 == 0) goto L_0x0d7a
            r1 = 18
        L_0x0d7a:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
        L_0x0d7e:
            X.3dI r0 = r5.A03
            X.3aq r4 = new X.3aq
            r10 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.execute(r4)
            return
        L_0x0d8a:
            boolean r0 = r4 instanceof X.C30721mu
            if (r0 == 0) goto L_0x0d90
            r1 = 2
            goto L_0x0d7a
        L_0x0d90:
            boolean r0 = r4 instanceof X.AnonymousClass1nF
            if (r0 == 0) goto L_0x0d96
            r1 = 3
            goto L_0x0d7a
        L_0x0d96:
            boolean r0 = r4 instanceof X.AnonymousClass1n2
            if (r0 == 0) goto L_0x0d9c
            r1 = 4
            goto L_0x0d7a
        L_0x0d9c:
            boolean r0 = r4 instanceof X.C31971pB
            if (r0 == 0) goto L_0x0da2
            r1 = 5
            goto L_0x0d7a
        L_0x0da2:
            boolean r0 = r4 instanceof X.AnonymousClass1nE
            if (r0 == 0) goto L_0x0da9
            r1 = 8
            goto L_0x0d7a
        L_0x0da9:
            if (r16 == 0) goto L_0x0dae
            r1 = 9
            goto L_0x0d7a
        L_0x0dae:
            boolean r0 = r4 instanceof X.C30391mN
            if (r0 == 0) goto L_0x0db5
            r1 = 10
            goto L_0x0d7a
        L_0x0db5:
            boolean r0 = r4 instanceof X.C30551md
            if (r0 == 0) goto L_0x0dbc
            r1 = 14
            goto L_0x0d7a
        L_0x0dbc:
            boolean r0 = r4 instanceof X.C31351o9
            if (r0 != 0) goto L_0x0de3
            boolean r0 = r4 instanceof X.C30431mR
            if (r0 != 0) goto L_0x0de3
            boolean r0 = r4 instanceof X.C30451mT
            if (r0 == 0) goto L_0x0dcb
            r1 = 16
            goto L_0x0d7a
        L_0x0dcb:
            boolean r0 = r4 instanceof X.C30361mK
            if (r0 == 0) goto L_0x0dd2
            r1 = 17
            goto L_0x0d7a
        L_0x0dd2:
            boolean r0 = r4 instanceof X.C30691mr
            if (r0 == 0) goto L_0x0de1
            X.1mr r4 = (X.C30691mr) r4
            boolean r0 = r4.A20()
            r1 = 6
            if (r0 == 0) goto L_0x0d7a
            r1 = 7
            goto L_0x0d7a
        L_0x0de1:
            r6 = 0
            goto L_0x0d7e
        L_0x0de3:
            r1 = 15
            goto L_0x0d7a
        L_0x0de6:
            boolean r0 = r3 instanceof com.whatsapp.jid.UserJid
            r9 = 1
            if (r0 != 0) goto L_0x0d69
        L_0x0deb:
            r9 = 3
            if (r3 != 0) goto L_0x0d69
            r8 = 0
            goto L_0x0d6d
        L_0x0df1:
            r7 = 300000(0x493e0, double:1.482197E-318)
            goto L_0x0cd3
        L_0x0df6:
            X.AnonymousClass2C1.A00 = r13
            goto L_0x0c9a
        L_0x0dfa:
            java.lang.String r1 = "last_notification_hash"
            goto L_0x0c5e
        L_0x0dfe:
            java.lang.String r1 = r6.toString()
            java.lang.String r0 = "permission issue with UPDATE_APP_OPS_STATS should only occur in Android 4.3 or earlier"
            X.C626936e.A0D(r11, r0)
            java.lang.String r0 = "android.permission.UPDATE_APP_OPS_STATS"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0e9b
            goto L_0x0c54
        L_0x0e12:
            java.lang.String r0 = X.C627636p.A0E(r4)
            goto L_0x0015
        L_0x0e18:
            r0 = r14
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0e7f }
            X.2sg r12 = r0.A03     // Catch:{ all -> 0x0e7f }
            java.lang.String r10 = X.C58162uo.A0G     // Catch:{ all -> 0x0e7f }
            java.lang.String[] r4 = X.AnonymousClass0x9.A1Z()     // Catch:{ all -> 0x0e7f }
            X.2sm r0 = r11.A01     // Catch:{ all -> 0x0e7f }
            boolean r1 = X.C56922sm.A03(r0, r5, r4)     // Catch:{ all -> 0x0e7f }
            X.C18270x1.A1P(r4, r13)     // Catch:{ all -> 0x0e7f }
            java.lang.String r0 = "GET_NOTIFICATION_MESSAGES_FOR_REPLY_SQL"
            android.database.Cursor r0 = r12.A0E(r10, r0, r4)     // Catch:{ all -> 0x0e7f }
            r11.A05(r0, r5, r9, r1)     // Catch:{ all -> 0x0e73 }
            if (r0 == 0) goto L_0x0e3a
            r0.close()     // Catch:{ all -> 0x0e7f }
        L_0x0e3a:
            r14.close()
            X.2ga r5 = r11.A03
            long r0 = X.C18310x6.A0A(r15)
            java.lang.String r4 = "LastMessageStore/getLastMessagesForNotificationAfterReply"
            r5.A02(r4, r0)
            java.util.Iterator r1 = r9.iterator()
        L_0x0e4c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0e5e
            X.34x r0 = X.C18300x5.A0T(r1)
            X.2sO r0 = r8.A04(r0)
            r7.add(r0)
            goto L_0x0e4c
        L_0x0e5e:
            java.util.Collections.reverse(r7)
            r0 = r24
            r0.add(r7)
            r4 = 0
            r7 = r4
            r8 = r4
            r1 = r2
            r2 = r3
            r3 = r0
            r5 = r4
            r9 = r23
            r1.A04(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0e73:
            r1 = move-exception
            if (r0 == 0) goto L_0x0e7e
            r0.close()     // Catch:{ all -> 0x0e7a }
            goto L_0x0e7e
        L_0x0e7a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0e7f }
        L_0x0e7e:
            throw r1     // Catch:{ all -> 0x0e7f }
        L_0x0e7f:
            r6 = move-exception
            r14.close()     // Catch:{ all -> 0x0e97 }
            throw r6
        L_0x0e84:
            r1 = move-exception
            if (r13 == 0) goto L_0x0e8f
            r13.close()     // Catch:{ all -> 0x0e8b }
            goto L_0x0e8f
        L_0x0e8b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0e90 }
        L_0x0e8f:
            throw r1     // Catch:{ all -> 0x0e90 }
        L_0x0e90:
            r6 = move-exception
            r26.close()     // Catch:{ all -> 0x0e97 }
            throw r6
        L_0x0e95:
            r0 = move-exception
            throw r0
        L_0x0e97:
            r0 = move-exception
            r6.addSuppressed(r0)
        L_0x0e9b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71523cF.run():void");
    }

    public C71523cF(Context context, C29171iO r5, C69263Wi r6, C56972sr r7, AnonymousClass3DP r8, C50422i9 r9, C105275Ug r10, C153167am r11, C56962sq r12, C111665iU r13, AnonymousClass5TW r14, C56942so r15, C64773Ex r16, C56422rx r17, AnonymousClass5ZU r18, AnonymousClass314 r19, C113905mB r20, C113895mA r21, C44382Vv r22, C620633i r23, C56612sH r24, AnonymousClass33T r25, AnonymousClass5ZR r26, AnonymousClass33p r27, C620733j r28, C56982ss r29, C56892sj r30, AnonymousClass2WH r31, AnonymousClass1VX r32, AnonymousClass3LP r33, AnonymousClass2Q5 r34, AnonymousClass30N r35, C95814uZ r36, C619933b r37, AnonymousClass2RW r38, C66553Lw r39, C50332i0 r40, AnonymousClass2HT r41, C46082b3 r42, C614030o r43, C624134x r44, C44632Ww r45, C50222hp r46, C51072jE r47, C29321id r48, AnonymousClass1R1 r49, C55832qz r50, C56572sD r51, C69183Wa r52, C60312yL r53, C56072rN r54, C187958y5 r55, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = z4;
        this.A02 = context;
        this.A0L = r24;
        this.A0T = r32;
        this.A04 = r6;
        this.A05 = r7;
        this.A0Q = r29;
        this.A0m = r51;
        this.A0U = r33;
        this.A0B = r14;
        this.A07 = r9;
        this.A0D = r16;
        this.A0K = r23;
        this.A0F = r18;
        this.A0P = r28;
        this.A0q = r55;
        this.A0p = r54;
        this.A0d = r42;
        this.A0o = r53;
        this.A09 = r12;
        this.A0H = r20;
        this.A0k = r49;
        this.A0a = r39;
        this.A0e = r43;
        this.A06 = r8;
        this.A0S = r31;
        this.A0W = r35;
        this.A0g = r45;
        this.A0Y = r37;
        this.A0n = r52;
        this.A0E = r17;
        this.A0N = r26;
        this.A0O = r27;
        this.A0C = r15;
        this.A0G = r19;
        this.A0l = r50;
        this.A0M = r25;
        this.A0b = r40;
        this.A0j = r48;
        this.A0R = r30;
        this.A0c = r41;
        this.A0i = r47;
        this.A03 = r5;
        this.A0I = r21;
        this.A0V = r34;
        this.A0A = r13;
        this.A0Z = r38;
        this.A0J = r22;
        this.A0w = z;
        this.A0v = z2;
        this.A0t = z3;
        this.A0X = r36;
        this.A01 = i;
        this.A0h = r46;
        this.A0r = r10.A08();
        this.A0u = z5;
        this.A08 = r11;
        C624134x r2 = r44;
        if (r44 == null || !C624134x.A0g(r2)) {
            this.A0f = r2;
        } else {
            z6 = true;
        }
        this.A0s = z6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0391, code lost:
        if (r16 == false) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x03a9, code lost:
        if (r9 >= 24) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03c3, code lost:
        if (X.C624134x.A0c(r9) != false) goto L_0x03c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0194, code lost:
        if (A08(X.AnonymousClass3ZH.A01(r8), r23, r1.A00.A0I) == false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x028e, code lost:
        if (r9 < 28) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02bd, code lost:
        if (r14 == false) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02bf, code lost:
        A02(r5, r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x031f, code lost:
        if (r34.A06(X.AnonymousClass32V.A01(r11)) == 2) goto L_0x0321;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0395 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0415  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0497 A[SYNTHETIC, Splitter:B:146:0x0497] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02dd A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x036a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(java.lang.StringBuilder r38, java.util.ArrayList r39, int r40, int r41, int r42, boolean r43, boolean r44, boolean r45) {
        /*
            r37 = this;
            r6 = r37
            android.content.Context r5 = r6.A02
            android.content.res.Resources r1 = r5.getResources()
            r0 = 17104901(0x1050005, float:2.4428256E-38)
            r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 17104902(0x1050006, float:2.442826E-38)
            r1.getDimensionPixelSize(r0)
            r9 = 0
            r4 = 0
        L_0x001a:
            r36 = r39
            int r0 = r36.size()
            int r0 = r0 + -7
            int r0 = java.lang.Math.max(r9, r0)
            if (r4 >= r0) goto L_0x0046
            r0 = r36
            java.lang.Object r0 = r0.get(r4)
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r9)
            X.2sO r0 = (X.C56682sO) r0
            X.34x r0 = r0.A00
            X.2z0 r0 = r0.A1J
            X.4uZ r2 = r0.A00
            X.33T r1 = r6.A0M
            java.lang.String r0 = "UpdateMessageNotificationRunnable2"
            r1.A09(r2, r0)
            int r4 = r4 + 1
            goto L_0x001a
        L_0x0046:
            java.util.HashMap r19 = X.AnonymousClass001.A0t()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x0085
            if (r45 != 0) goto L_0x0085
            X.3Lw r0 = r6.A0a
            android.service.notification.StatusBarNotification[] r8 = r0.A0Q()
            int r7 = r8.length
        L_0x0059:
            if (r9 >= r7) goto L_0x0085
            r2 = r8[r9]
            java.lang.String r0 = r2.getTag()
            if (r0 == 0) goto L_0x0082
            int r1 = r2.getId()
            int r0 = r6.A00()
            if (r1 != r0) goto L_0x0082
            android.app.Notification r0 = r2.getNotification()
            android.os.Bundle r1 = r0.extras
            java.lang.String r0 = "last_row_id"
            long r0 = r1.getLong(r0)
            java.lang.String r3 = r2.getTag()
            r2 = r19
            X.AnonymousClass0x2.A1J(r3, r2, r0)
        L_0x0082:
            int r9 = r9 + 1
            goto L_0x0059
        L_0x0085:
            int r0 = r36.size()
            if (r4 >= r0) goto L_0x052e
            r0 = r36
            java.lang.Object r21 = r0.get(r4)
            r0 = r21
            java.util.List r0 = (java.util.List) r0
            r21 = r0
            int r1 = r21.size()
            r0 = 1
            int r1 = r1 - r0
            r0 = r21
            java.lang.Object r1 = r0.get(r1)
            X.2sO r1 = (X.C56682sO) r1
            X.34x r0 = r1.A00
            X.4uZ r2 = X.AnonymousClass2z0.A00(r0)
            X.3Ex r0 = r6.A0D
            r35 = r0
            X.3ZH r8 = r0.A0A(r2)
            X.2ss r0 = r6.A0Q
            r34 = r0
            int r23 = r0.A03(r2)
            X.31A r0 = X.C56982ss.A01(r0, r2)
            if (r0 != 0) goto L_0x04da
            r7 = 0
        L_0x00c2:
            r0 = r34
            X.31A r0 = X.C56982ss.A01(r0, r2)
            if (r0 != 0) goto L_0x04d6
            r15 = 0
        L_0x00cb:
            int r7 = r7 + r23
            int r7 = r7 + r15
            X.1R1 r0 = r6.A0k
            r33 = r0
            X.2sa r22 = X.AnonymousClass1R1.A00(r2, r0)
            java.lang.String r0 = r22.A06()
            int r16 = java.lang.Integer.parseInt(r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r2 < r0) goto L_0x0105
            if (r45 != 0) goto L_0x0105
            X.4uZ r0 = X.AnonymousClass3ZH.A01(r8)
            java.lang.String r2 = X.AnonymousClass33T.A00(r0)
            r0 = r19
            java.lang.Number r0 = X.AnonymousClass0x9.A0p(r2, r0)
            if (r0 == 0) goto L_0x0105
            long r9 = r0.longValue()
            X.34x r0 = r1.A00
            long r2 = r0.A1L
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0105
        L_0x0102:
            int r4 = r4 + 1
            goto L_0x0085
        L_0x0105:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            X.0Ue r2 = X.C66553Lw.A01(r5)
            boolean r0 = r6.A0u
            r20 = r0
            if (r0 == 0) goto L_0x03d4
            java.lang.String r0 = "newsletter_key_messages"
        L_0x0116:
            r2.A0L = r0
            r9 = 8
            android.app.Notification r11 = r2.A07
            int r0 = r11.flags
            r9 = r9 | r0
            r11.flags = r9
            X.2RW r0 = r6.A0Z
            X.34x r10 = r1.A00
            android.content.Context r9 = r0.A00
            java.lang.Class<com.whatsapp.notification.MessageNotificationDismissedReceiver> r0 = com.whatsapp.notification.MessageNotificationDismissedReceiver.class
            android.content.Intent r0 = X.AnonymousClass0x9.A08(r9, r0)
            android.net.Uri r12 = X.AnonymousClass326.A00(r8)
            r0.setData(r12)
            long r12 = r10.A0K
            java.lang.String r14 = "last_message_time"
            r0.putExtra(r14, r12)
            X.2z0 r10 = r10.A1J
            X.4uZ r10 = r10.A00
            java.lang.String r12 = X.C627336j.A07(r10)
            java.lang.String r10 = "chat_jid"
            r0.putExtra(r10, r12)
            r10 = 1
            android.app.PendingIntent r0 = X.C624735e.A03(r9, r0, r10)
            r11.deleteIntent = r0
            r0 = 2131233341(0x7f080a3d, float:1.8082817E38)
            X.AnonymousClass33T.A02(r2, r0)
            android.os.Bundle r11 = X.AnonymousClass002.A08()
            X.34x r0 = r1.A00
            long r9 = r0.A1L
            java.lang.String r0 = "last_row_id"
            r11.putLong(r0, r9)
            android.os.Bundle r0 = r2.A0D
            if (r0 != 0) goto L_0x03cf
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>(r11)
            r2.A0D = r0
        L_0x016d:
            boolean r31 = r6.A06(r8)
            X.34x r0 = r1.A00
            boolean r0 = r0 instanceof X.C30791n7
            if (r0 == 0) goto L_0x0182
            X.2hp r9 = r6.A0h
            X.34x r0 = r1.A00
            X.1n7 r0 = (X.C30791n7) r0
            r9.A01(r0)
            r31 = 0
        L_0x0182:
            if (r16 != 0) goto L_0x0196
            X.4uZ r11 = X.AnonymousClass3ZH.A01(r8)
            X.34x r0 = r1.A00
            long r9 = r0.A0I
            r0 = r23
            boolean r0 = r6.A08(r11, r0, r9)
            r18 = 1
            if (r0 != 0) goto L_0x03cb
        L_0x0196:
            r18 = 0
            if (r16 == 0) goto L_0x03cb
            long r11 = r22.A00()
            r9 = 0
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 != 0) goto L_0x03cb
            if (r44 != 0) goto L_0x01b6
            X.2HT r0 = r6.A0c
            X.2HS r0 = r0.A00
            if (r0 == 0) goto L_0x03cb
            com.whatsapp.notification.PopupNotification r0 = r0.A00
            boolean r0 = r0.A1S
            if (r0 == 0) goto L_0x03cb
        L_0x01b6:
            r17 = 0
        L_0x01b8:
            X.30o r9 = r6.A0e
            X.34x r0 = r1.A00
            boolean r16 = r9.A06(r0)
            if (r16 == 0) goto L_0x03b0
            X.2i0 r9 = r6.A0b
            X.34x r0 = r1.A00
            r9.A01(r5, r2, r8, r0)
            r31 = 0
        L_0x01cb:
            X.3Lw r0 = r6.A0a
            r32 = r0
            android.graphics.Bitmap r0 = r0.A0D(r8)
            X.2LY r9 = r1.A03(r8)
            r2.A06(r0)
            r0 = r36
            int r0 = X.AnonymousClass0x9.A03(r0, r4)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r10 = r9.A01
            r2.A0B(r10)
            java.lang.CharSequence r9 = r9.A00
            r2.A0A(r9)
            X.34x r9 = r1.A00
            long r9 = r9.A0K
            r2.A05(r9)
            r2.A0N = r0
            java.lang.String r9 = "sortKey="
            r3.append(r9)
            r3.append(r0)
            r9 = 1
            r0 = r40
            boolean r28 = X.AnonymousClass000.A1U(r0, r9)
            r0 = r41
            boolean r29 = X.AnonymousClass000.A1U(r0, r9)
            r30 = r43
            r24 = r32
            r25 = r2
            r26 = r8
            r27 = r1
            r24.A0L(r25, r26, r27, r28, r29, r30, r31)
            X.4uZ r10 = r6.A0X
            if (r10 != 0) goto L_0x0253
            X.0Ue r9 = X.C66553Lw.A01(r5)
            java.lang.String r0 = "msg"
            r9.A0J = r0
            r0 = r32
            X.2oU r0 = r0.A0B
            android.content.Context r11 = r0.A00
            r0 = 2131895972(0x7f1226a4, float:1.9426792E38)
            X.C18300x5.A14(r11, r9, r0)
            X.33j r14 = r6.A0P
            r13 = 2131755233(0x7f1000e1, float:1.914134E38)
            long r11 = (long) r7
            java.lang.Object[] r0 = X.AnonymousClass002.A0L()
            X.AnonymousClass000.A1L(r0, r7)
            java.lang.String r0 = r14.A0L(r0, r13, r11)
            r9.A0A(r0)
            r0 = 2131233341(0x7f080a3d, float:1.8082817E38)
            X.AnonymousClass33T.A02(r9, r0)
            android.app.Notification r0 = r9.A01()
            r2.A08 = r0
        L_0x0253:
            int r9 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r9 < r0) goto L_0x03a7
            r12 = r22
            X.1qy r12 = (X.C32501qy) r12
            java.lang.String r11 = r12.A07()
            java.lang.String r0 = "Silent"
            boolean r0 = r0.equalsIgnoreCase(r11)
            java.lang.String r11 = r6.A01(r12, r0)
            r2.A0K = r11
            r0 = 1
            r2.A01 = r0
            r2.A02 = r7
            java.lang.String r0 = " channel="
            r3.append(r0)
            r3.append(r11)
            java.lang.String r0 = " number="
            r3.append(r0)
            r0 = r23
            r3.append(r0)
            java.lang.String r0 = " numberReactions="
            r3.append(r0)
            r3.append(r15)
            r0 = 28
            if (r9 >= r0) goto L_0x03ad
        L_0x0290:
            r11 = 1
            r0 = r40
            if (r0 != r11) goto L_0x03ad
            boolean r0 = r6.A05()
            X.3Lw r11 = r1.A0B
            r28 = 1
            r24 = r11
            r29 = r28
            r24.A0L(r25, r26, r27, r28, r29, r30, r31)
            r11 = r38
            r1.A07(r2, r8, r11, r0)
            boolean r14 = r1.A08(r5, r2, r8)
        L_0x02ad:
            X.1VX r13 = r6.A0T
            r11 = 3156(0xc54, float:4.422E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r11 = r13.A0Y(r0, r11)
            r12 = 1
            if (r11 != 0) goto L_0x0384
            r12 = 0
            if (r18 == 0) goto L_0x0384
            if (r14 != 0) goto L_0x0384
        L_0x02bf:
            r6.A02(r5, r2, r8)
        L_0x02c2:
            if (r20 != 0) goto L_0x02d3
            java.lang.String r10 = X.AnonymousClass3ZH.A08(r8)
            r2.A0M = r10
            java.lang.String r10 = r1.A05()
            if (r10 == 0) goto L_0x02d3
            r2.A0D(r10)
        L_0x02d3:
            java.lang.Object r10 = X.C18290x4.A0k(r21)
            X.2sO r10 = (X.C56682sO) r10
            r11 = 24
            if (r9 < r11) goto L_0x03d8
            if (r14 != 0) goto L_0x03d8
            X.0Of r9 = r32.A0E()
            androidx.core.app.NotificationCompat$MessagingStyle r12 = new androidx.core.app.NotificationCompat$MessagingStyle
            r12.<init>(r9)
            X.34x r9 = r1.A00
            X.2z0 r9 = r9.A1J
            X.4uZ r11 = r9.A00
            X.5ZU r14 = r6.A0F
            int r15 = r14.A07(r8, r11)
            boolean r16 = X.C627336j.A0K(r11)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r16)
            r12.A01 = r9
            r9 = 0
            java.lang.String r9 = r14.A0R(r8, r15, r9)
            r15 = 5665(0x1621, float:7.938E-42)
            boolean r0 = r13.A0Y(r0, r15)
            r13 = 1
            if (r0 == 0) goto L_0x0381
            r0 = r34
            boolean r0 = r0.A0R(r11)
            if (r0 != 0) goto L_0x0321
            com.whatsapp.jid.GroupJid r15 = X.AnonymousClass32V.A01(r11)
            r0 = r34
            int r15 = r0.A06(r15)
            r0 = 2
            if (r15 != r0) goto L_0x0381
        L_0x0321:
            X.1fJ r0 = X.AnonymousClass34R.A03(r11)
            if (r0 == 0) goto L_0x0381
            X.2so r0 = r6.A0C
            X.1fJ r11 = (X.C27991fJ) r11
            X.1fJ r11 = r0.A01(r11)
            if (r11 == 0) goto L_0x0381
            r0 = r35
            X.3ZH r15 = r0.A0A(r11)
            r11 = 2131894143(0x7f121f7f, float:1.9423082E38)
            r0 = 0
            java.lang.Object[] r0 = X.C18310x6.A1b(r9, r0)
            X.C18300x5.A1E(r14, r15, r0, r13)
            java.lang.String r17 = r5.getString(r11, r0)
        L_0x0346:
            if (r16 == 0) goto L_0x0360
            r0 = r23
            if (r0 <= r13) goto L_0x035e
            X.33j r11 = r6.A0P
            long r14 = (long) r7
            r0 = 0
            java.lang.Object[] r9 = X.C18310x6.A1b(r9, r0)
            X.AnonymousClass000.A1P(r9, r7, r13)
            r0 = 2131755057(0x7f100031, float:1.9140983E38)
            java.lang.String r9 = r11.A0L(r9, r0, r14)
        L_0x035e:
            r12.A02 = r9
        L_0x0360:
            java.util.Iterator r11 = r21.iterator()
        L_0x0364:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x03db
            java.lang.Object r9 = r11.next()
            X.2sO r9 = (X.C56682sO) r9
            long r15 = r9.A00()
            long r13 = r10.A00()
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x037d
            r10 = r9
        L_0x037d:
            r9.A06(r2, r12, r8)
            goto L_0x0364
        L_0x0381:
            r17 = r9
            goto L_0x0346
        L_0x0384:
            boolean r11 = r6.A07(r8)
            if (r11 == 0) goto L_0x0395
            r10 = 21
            X.C66553Lw.A0A(r5, r2, r8, r10)
        L_0x038f:
            if (r12 == 0) goto L_0x02c2
            if (r16 != 0) goto L_0x02c2
            goto L_0x02bf
        L_0x0395:
            if (r17 == 0) goto L_0x038f
            if (r14 != 0) goto L_0x038f
            if (r10 != 0) goto L_0x038f
            if (r16 != 0) goto L_0x038f
            X.0Tm r11 = com.whatsapp.notification.AndroidWear.A00(r5, r8)
            java.util.ArrayList r10 = r2.A0O
            r10.add(r11)
            goto L_0x038f
        L_0x03a7:
            r0 = 24
            if (r9 < r0) goto L_0x03ad
            goto L_0x0290
        L_0x03ad:
            r14 = 0
            goto L_0x02ad
        L_0x03b0:
            if (r31 == 0) goto L_0x01cb
            int r10 = r23 + r42
            X.34x r9 = r1.A00
            boolean r0 = r9 instanceof X.C30791n7
            if (r0 != 0) goto L_0x03c5
            boolean r0 = r9 instanceof X.C30771mz
            if (r0 != 0) goto L_0x03c5
            boolean r9 = X.C624134x.A0c(r9)
            r0 = 1
            if (r9 == 0) goto L_0x03c6
        L_0x03c5:
            r0 = 0
        L_0x03c6:
            r6.A03(r2, r8, r10, r0)
            goto L_0x01cb
        L_0x03cb:
            r17 = 1
            goto L_0x01b8
        L_0x03cf:
            r0.putAll(r11)
            goto L_0x016d
        L_0x03d4:
            java.lang.String r0 = "group_key_messages"
            goto L_0x0116
        L_0x03d8:
            r17 = 0
            goto L_0x03de
        L_0x03db:
            r2.A08(r12)
        L_0x03de:
            boolean r11 = r1 instanceof X.C28551hK
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "messagenotification/postChildNotification isLastNotificationKeepInChat="
            X.C18260x0.A1D(r0, r1, r11)
            r1 = 2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            android.net.Uri r0 = X.AnonymousClass326.A00(r8)
            android.content.Intent r12 = X.C627736r.A0H(r5, r0, r1)
            java.lang.String r1 = "fromNotification"
            r0 = 1
            android.content.Intent r1 = r12.putExtra(r1, r0)
            java.lang.String r0 = "last_notification_keep_in_chat"
            android.content.Intent r1 = r1.putExtra(r0, r11)
            java.lang.String r0 = "ChatNotification"
            X.AnonymousClass5VI.A01(r1, r0)
            X.0PJ r11 = X.AnonymousClass0x9.A0G(r9, r1)
            java.lang.Object r9 = r11.A01
            android.content.Intent r9 = (android.content.Intent) r9
            boolean r0 = r10 instanceof X.C84034At
            if (r0 == 0) goto L_0x0444
            r13 = r10
            X.4At r13 = (X.C84034At) r13
            long r0 = r10.A00()
            java.lang.String r12 = "row_id"
            r9.putExtra(r12, r0)
            java.lang.String r12 = "sort_id"
            boolean r0 = r10 instanceof X.C28551hK
            if (r0 == 0) goto L_0x047c
            r0 = r10
            X.1hK r0 = (X.C28551hK) r0
            X.2Ow r0 = r0.A00
            X.34x r0 = r0.A00
        L_0x0430:
            long r0 = r0.A1M
        L_0x0432:
            r9.putExtra(r12, r0)
            java.lang.String r1 = "open_comment_thread"
            boolean r0 = r10 instanceof X.AnonymousClass1hM
            r9.putExtra(r1, r0)
            X.2z0 r0 = r13.BAW()
            X.C107395bF.A00(r9, r0)
        L_0x0444:
            java.lang.Object r0 = r11.A00
            X.C626936e.A06(r0)
            int r0 = X.AnonymousClass001.A0K(r0)
            android.app.PendingIntent r0 = X.C624735e.A04(r5, r9, r0)
            r2.A09 = r0
            android.app.Notification r9 = r2.A01()
            X.2b3 r0 = r6.A0d
            X.2ic r0 = r0.A00(r5)
            r0.A01(r7, r9)
            java.lang.String r0 = " jid="
            X.AnonymousClass3ZH.A0C(r8, r0, r3)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "messagenotification/postChildNotification "
            java.lang.String r0 = X.C18300x5.A0k(r3, r0, r1)
            X.C18260x0.A1L(r1, r0)
            java.lang.Class<X.4uZ> r0 = X.C95814uZ.class
            X.4uZ r2 = X.AnonymousClass3ZH.A02(r8, r0)
            if (r20 != 0) goto L_0x049e
            goto L_0x0497
        L_0x047c:
            boolean r0 = r10 instanceof X.AnonymousClass1hM
            if (r0 == 0) goto L_0x0488
            r0 = r10
            X.1hM r0 = (X.AnonymousClass1hM) r0
            X.2n4 r0 = r0.A00
            long r0 = r0.A00
            goto L_0x0432
        L_0x0488:
            boolean r0 = r10 instanceof X.AnonymousClass1hL
            if (r0 == 0) goto L_0x0494
            r0 = r10
            X.1hL r0 = (X.AnonymousClass1hL) r0
            X.2QS r0 = r0.A00
            X.34x r0 = r0.A01
            goto L_0x0430
        L_0x0494:
            X.34x r0 = r10.A00
            goto L_0x0430
        L_0x0497:
            X.3DP r1 = r6.A06     // Catch:{ SecurityException -> 0x04a5, RuntimeException -> 0x04de }
            r0 = r17
            r1.A04(r5, r8, r0)     // Catch:{ SecurityException -> 0x04a5, RuntimeException -> 0x04de }
        L_0x049e:
            X.33T r0 = r6.A0M     // Catch:{ SecurityException -> 0x04a5, RuntimeException -> 0x04de }
            r0.A07(r9, r2)     // Catch:{ SecurityException -> 0x04a5, RuntimeException -> 0x04de }
            goto L_0x0102
        L_0x04a5:
            r1 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "messagenotification/postChildNotification uid="
            r3.append(r0)
            int r0 = android.os.Process.myUid()
            r3.append(r0)
            java.lang.String r0 = " quiet="
            r3.append(r0)
            boolean r2 = r6.A0w
            java.lang.String r0 = X.C18300x5.A0m(r3, r2)
            com.whatsapp.util.Log.i(r0, r1)
            if (r2 != 0) goto L_0x052d
            boolean r0 = X.C107535bT.A05()
            if (r0 == 0) goto L_0x052d
            r1 = r33
            r0 = r22
            r1.A0Z(r0)
            goto L_0x0102
        L_0x04d6:
            int r15 = r0.A07
            goto L_0x00cb
        L_0x04da:
            int r7 = r0.A05
            goto L_0x00c2
        L_0x04de:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof android.os.TransactionTooLargeException
            if (r0 == 0) goto L_0x052d
            java.lang.String r0 = "Error posting notification"
            com.whatsapp.util.Log.e(r0, r1)
            java.util.Iterator r5 = r21.iterator()
        L_0x04f0:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x052d
            java.lang.Object r4 = r5.next()
            X.2sO r4 = (X.C56682sO) r4
            X.2LY r3 = r4.A03(r8)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Potentially large message:"
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = " text:"
            r2.append(r0)
            java.lang.CharSequence r0 = r3.A00
            int r0 = r0.length()
            int r0 = r0 / 1000
            r2.append(r0)
            java.lang.String r0 = " title:"
            r2.append(r0)
            java.lang.String r0 = r3.A01
            int r0 = r0.length()
            int r0 = r0 / 1000
            X.C18260x0.A1F(r2, r0)
            goto L_0x04f0
        L_0x052d:
            throw r1
        L_0x052e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71523cF.A04(java.lang.StringBuilder, java.util.ArrayList, int, int, int, boolean, boolean, boolean):void");
    }
}
