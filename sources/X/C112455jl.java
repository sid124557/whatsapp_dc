package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipErrorDialogFragment;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.5jl  reason: invalid class name and case insensitive filesystem */
public class C112455jl implements C1230066r {
    public long A00;
    public AnonymousClass0PJ A01;
    public final Handler A02;
    public final C29171iO A03;
    public final C55682qk A04;
    public final C69263Wi A05;
    public final C56972sr A06;
    public final C66663Mh A07;
    public final C56962sq A08;
    public final C106155Xv A09;
    public final AnonymousClass3XG A0A;
    public final AnonymousClass5U0 A0B;
    public final C112515jr A0C;
    public final C111665iU A0D;
    public final C46622bw A0E;
    public final C45822ad A0F;
    public final C46362bV A0G;
    public final C29441ip A0H;
    public final C64773Ex A0I;
    public final AnonymousClass5ZU A0J;
    public final C620633i A0K;
    public final C56612sH A0L;
    public final C54292oU A0M;
    public final AnonymousClass5ZR A0N;
    public final C620733j A0O;
    public final C56892sj A0P;
    public final C56322rn A0Q;
    public final C56662sM A0R;
    public final AnonymousClass1VX A0S;
    public final C66493Lq A0T;
    public final C52472lX A0U;
    public final C56572sD A0V;
    public final C187958y5 A0W;
    public final AnonymousClass4FS A0X;
    public final C183538qC A0Y;
    public volatile C105825Wo A0Z;

    public static AnonymousClass0PJ A00(int i) {
        int i2;
        int i3 = 1;
        int i4 = null;
        if (!(i == 1 || i == 2)) {
            if (i != 4) {
                if (i != 7) {
                    if (i != 16) {
                        if (i != 25) {
                            if (!(i == 35 || i == 9)) {
                                if (i != 10) {
                                    switch (i) {
                                        case 45:
                                        case 46:
                                        case 47:
                                            i2 = 4;
                                            i4 = 7;
                                            break;
                                    }
                                }
                            }
                        } else {
                            return AnonymousClass0x9.A0G(4, 1);
                        }
                    }
                }
                i3 = 5;
            } else {
                i3 = 39;
            }
            i2 = Integer.valueOf(i3);
            return AnonymousClass0x9.A0G(i2, i4);
        }
        i3 = 15;
        i2 = Integer.valueOf(i3);
        return AnonymousClass0x9.A0G(i2, i4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        if (r0 != false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        if (android.text.TextUtils.equals(r15, r6.callId) == false) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(android.content.Context r12, X.C52222l8 r13, com.whatsapp.jid.GroupJid r14, java.lang.String r15, java.util.ArrayList r16, java.util.ArrayList r17, java.util.List r18, boolean r19, boolean r20) {
        /*
            r11 = this;
            r3 = 0
            r4 = 1
            boolean r10 = X.AnonymousClass000.A1W(r15)
            com.whatsapp.voipcalling.CallInfo r6 = com.whatsapp.voipcalling.Voip.getCallInfo()
            int r2 = r18.size()
            if (r15 == 0) goto L_0x001b
            if (r6 == 0) goto L_0x001b
            java.lang.String r0 = r6.callId
            boolean r0 = android.text.TextUtils.equals(r15, r0)
            r1 = 1
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            boolean r0 = X.AnonymousClass000.A1W(r13)
            if (r1 == 0) goto L_0x0050
            if (r0 == 0) goto L_0x006c
            java.lang.String r1 = r13.A02
            java.lang.String r0 = r6.callLinkToken
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0052
            if (r2 != 0) goto L_0x006c
            X.36r r2 = X.C86664Kz.A1B()
            com.whatsapp.jid.UserJid r1 = X.C86644Kx.A0X(r6)
            X.1iO r0 = r11.A03
            boolean r0 = r0.A00
            java.lang.Boolean r0 = X.C18320x8.A0V(r0)
            android.content.Intent r2 = r2.A1Q(r12, r1, r0)
            java.lang.String r1 = "lobbyEntryPoint"
            r0 = 3
            r2.putExtra(r1, r0)
            r12.startActivity(r2)
        L_0x004d:
            r1 = 8
            return r1
        L_0x0050:
            if (r0 == 0) goto L_0x006c
        L_0x0052:
            if (r2 != 0) goto L_0x006c
            r1 = 0
            java.util.List r0 = java.util.Collections.singletonList(r15)
            android.os.Message r3 = android.os.Message.obtain(r1, r3, r0)
            X.5jr r2 = r11.A0C
            java.lang.String r1 = "check_ongoing_calls"
            X.5Zu r0 = new X.5Zu
            r0.<init>((android.os.Message) r3, (java.lang.String) r1)
            r2.A00(r0)
            r1 = 12
            return r1
        L_0x006c:
            boolean r0 = r18.isEmpty()
            if (r0 == 0) goto L_0x0081
            java.lang.String r0 = "app/startOutgoingCall empty list of contacts"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            if (r10 != 0) goto L_0x0080
            if (r14 == 0) goto L_0x0080
            r0 = 16
            r11.A06(r0)
        L_0x0080:
            return r4
        L_0x0081:
            X.5Wo r0 = r11.A0Z
            if (r0 == 0) goto L_0x008c
            java.lang.String r0 = "app/startOutgoingCall user tapped the call button twice before the telecom framework responds"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r1 = 2
            return r1
        L_0x008c:
            r0 = 0
            r11.A00 = r0
            java.util.Iterator r2 = r18.iterator()
        L_0x0094:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00bb
            X.3ZH r1 = X.C18310x6.A0R(r2)
            X.2sr r0 = r11.A06
            boolean r0 = X.C56972sr.A08(r0, r1)
            if (r0 == 0) goto L_0x00af
            X.3Wi r1 = r11.A05
            r0 = 2131895290(0x7f1223fa, float:1.9425409E38)
            r1.A0F(r0, r4)
            return r4
        L_0x00af:
            boolean r0 = r1.A0U()
            r1 = r0 ^ 1
            java.lang.String r0 = "can't start a call with a group contact"
            X.C626936e.A0E(r1, r0)
            goto L_0x0094
        L_0x00bb:
            r2 = r20
            if (r10 == 0) goto L_0x00c1
            if (r20 == 0) goto L_0x00c9
        L_0x00c1:
            boolean r0 = r11.A08(r12, r2)
            if (r0 != 0) goto L_0x00c9
            r1 = 4
            return r1
        L_0x00c9:
            r9 = 2131895241(0x7f1223c9, float:1.942531E38)
            java.lang.Object[] r8 = new java.lang.Object[r4]
            X.33j r5 = r11.A0O
            X.5ZU r1 = r11.A0J
            r0 = -1
            r7 = r17
            java.lang.String r0 = r1.A0W(r7, r0)
            X.C620733j.A03(r5, r0, r8, r3)
            java.lang.String r5 = r12.getString(r9, r8)
            int r0 = r18.size()
            if (r0 <= 0) goto L_0x011f
            int r1 = r7.size()
            int r0 = r18.size()
            if (r1 != r0) goto L_0x011f
            X.3Wi r0 = r11.A05
            X.4FU r4 = r0.A00
            if (r4 == 0) goto L_0x011b
            boolean r0 = r4.BHW()
            if (r0 != 0) goto L_0x0119
            boolean r0 = r4 instanceof X.C89654ea
            if (r0 == 0) goto L_0x0119
            com.whatsapp.DisplayExceptionDialogFactory$ContactBlockedDialogFragment r2 = new com.whatsapp.DisplayExceptionDialogFactory$ContactBlockedDialogFragment
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "message"
            r1.putString(r0, r5)
            java.lang.String r0 = "jids"
            r1.putParcelableArrayList(r0, r7)
            r2.A0u(r1)
            r4.Boo(r2)
        L_0x0119:
            r1 = 5
            return r1
        L_0x011b:
            r0.A0P(r5, r3)
            goto L_0x0119
        L_0x011f:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x012a
            X.3Wi r0 = r11.A05
            r0.A0P(r5, r3)
        L_0x012a:
            boolean r1 = X.AnonymousClass0x7.A1S(r16)
            java.lang.String r0 = "callable jids must not be empty"
            X.C626936e.A0D(r1, r0)
            X.5ZR r7 = r11.A0N
            boolean r0 = r7.A0D()
            if (r0 == 0) goto L_0x01b9
            r0 = r19
            boolean r0 = X.C107305b5.A08(r7, r0)
            if (r0 != 0) goto L_0x01b9
            boolean r0 = r7.A0G()
            if (r0 == 0) goto L_0x0151
            r1 = 11
            java.lang.String r0 = "app/startOutgoingCall/failed_no_read_phone_state_permission"
        L_0x014d:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r1
        L_0x0151:
            r5 = 7
            boolean r0 = X.C627436k.A0O(r6)
            if (r0 == 0) goto L_0x019b
            com.whatsapp.voipcalling.CallState r1 = r6.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r1 == r0) goto L_0x019b
            if (r10 == 0) goto L_0x01db
            java.lang.String r0 = r6.callId
            boolean r0 = android.text.TextUtils.equals(r15, r0)
            if (r0 == 0) goto L_0x01db
            boolean r0 = r6.isAudioChat()
            if (r0 == 0) goto L_0x01bd
            com.whatsapp.jid.GroupJid r0 = r6.groupJid
            if (r0 == 0) goto L_0x01bd
            java.lang.String r5 = r6.callId
            X.3Wi r0 = r11.A05
            X.4FU r4 = r0.A00
            if (r4 == 0) goto L_0x004d
            r11.A05()
            X.C162457s7.A0J(r5, r3)
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r2 = new com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "audio_chat_call_id"
            r1.putString(r0, r5)
            r2.A0u(r1)
            r11.A05()
            java.lang.String r0 = "AudioChatBottomSheetDialog"
            r4.Bon(r2, r0)
            goto L_0x004d
        L_0x019b:
            X.33i r0 = r11.A0K
            android.telephony.TelephonyManager r0 = r0.A0N()
            int r0 = X.AnonymousClass36T.A00(r0, r7)
            if (r0 == 0) goto L_0x01f6
            r1 = 2131887423(0x7f12053f, float:1.9409453E38)
            if (r10 == 0) goto L_0x01af
            r1 = 2131895316(0x7f122414, float:1.9425462E38)
        L_0x01af:
            X.3Wi r0 = r11.A05
            r0.A0F(r1, r4)
            r1 = 9
            java.lang.String r0 = "app/startOutgoingCall/failed_cellular_call_in_progress"
            goto L_0x014d
        L_0x01b9:
            r1 = 7
            java.lang.String r0 = "app/startOutgoingCall/failed_no_record_audio_permission"
            goto L_0x014d
        L_0x01bd:
            X.36r r2 = X.C86664Kz.A1B()
            com.whatsapp.jid.UserJid r1 = X.C86644Kx.A0X(r6)
            X.1iO r0 = r11.A03
            boolean r0 = r0.A00
            java.lang.Boolean r0 = X.C18320x8.A0V(r0)
            android.content.Intent r1 = r2.A1Q(r12, r1, r0)
            java.lang.String r0 = "lobbyEntryPoint"
            r1.putExtra(r0, r5)
            r12.startActivity(r1)
            goto L_0x004d
        L_0x01db:
            java.lang.String r0 = "app/startOutgoingCall/ try to start outgoing call from active voip call "
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 2131889071(0x7f120baf, float:1.9412795E38)
            if (r10 == 0) goto L_0x01e8
            r0 = 2131889087(0x7f120bbf, float:1.9412828E38)
        L_0x01e8:
            android.widget.Toast r1 = android.widget.Toast.makeText(r12, r0, r4)
            r0 = 17
            r1.setGravity(r0, r3, r3)
            r1.show()
            goto L_0x004d
        L_0x01f6:
            if (r10 != 0) goto L_0x0270
            if (r14 == 0) goto L_0x0270
            X.2sj r5 = r11.A0P
            boolean r0 = r5.A0C(r14)
            r4 = 0
            if (r0 != 0) goto L_0x0211
            r0 = 13
            r11.A06(r0)
            X.2qk r1 = r11.A04
            java.lang.String r0 = "linked-group-call/left-chat-group"
        L_0x020c:
            r1.A0A(r0, r3, r4)
        L_0x020f:
            r1 = 1
            return r1
        L_0x0211:
            X.3Ex r0 = r11.A0I
            X.3ZH r1 = r0.A09(r14)
            X.C626936e.A06(r1)
            X.2lX r0 = r11.A0U
            boolean r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x0228
            r0 = 17
        L_0x0224:
            r11.A06(r0)
            goto L_0x020f
        L_0x0228:
            boolean r0 = r1.A0e
            if (r0 == 0) goto L_0x0235
            boolean r0 = r5.A0D(r14)
            if (r0 != 0) goto L_0x0235
            r0 = 14
            goto L_0x0224
        L_0x0235:
            X.33k r0 = X.C56892sj.A01(r5, r14)
            java.util.Map r0 = r0.A09
            java.util.Set r0 = r0.keySet()
            X.6aS r0 = X.C129526aS.copyOf((java.util.Collection) r0)
            if (r20 != 0) goto L_0x0263
            int r2 = r0.size()
            X.3Mh r1 = r11.A07
            X.1Ek r0 = X.C66663Mh.A1d
            int r1 = r1.A03(r0)
            r0 = 64
            int r0 = java.lang.Math.min(r0, r1)
            if (r2 <= r0) goto L_0x0263
            r0 = 15
            r11.A06(r0)
            X.2qk r1 = r11.A04
            java.lang.String r0 = "linked-group-call/log-exceed-size"
            goto L_0x020c
        L_0x0263:
            X.2rn r0 = r11.A0Q
            X.2mt r0 = r0.A02(r14)
            if (r0 == 0) goto L_0x026e
            r0 = 11
            goto L_0x0224
        L_0x026e:
            r1 = 0
            return r1
        L_0x0270:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112455jl.A02(android.content.Context, X.2l8, com.whatsapp.jid.GroupJid, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.List, boolean, boolean):int");
    }

    public final int A04(C105825Wo r15, String str, List list, boolean z, boolean z2) {
        String A0y;
        String A022;
        List list2 = list;
        UserJid userJid = (UserJid) list2.get(0);
        boolean z3 = r15.A0C;
        Context context = this.A0M.A00;
        C64773Ex r4 = this.A0I;
        AnonymousClass5ZU r3 = this.A0J;
        AnonymousClass3ZH A012 = AnonymousClass36T.A01(r4, this.A0T, r15.A06, this.A0V, z3);
        if (A012 == null || (A022 = C18300x5.A0h(r3, A012)) == null) {
            C150477Qw A042 = C107305b5.A04(r4, r3, list2, 2, AnonymousClass000.A1U(list2.size(), 1));
            if (A042 == null) {
                A0y = null;
            } else {
                A0y = C86634Kw.A0y(context, A042);
            }
            A022 = C106815aD.A02(A0y);
        }
        if (A022 == null) {
            Log.w("app/startOutgoingCall/startTelecomFrameworkInternal displayName is null");
        } else if (Build.VERSION.SDK_INT >= 28) {
            C111665iU r8 = this.A0D;
            if (r8.A0D()) {
                this.A00 = SystemClock.elapsedRealtime();
                if (r8.A0E()) {
                    this.A0Z = r15;
                    boolean z4 = z2;
                    if (r8.A0G(userJid, str, A022, z, z4)) {
                        Handler handler = this.A02;
                        handler.removeMessages(1);
                        Message message = new Message();
                        message.what = 1;
                        message.obj = Boolean.valueOf(z4);
                        handler.sendMessageDelayed(message, 2000);
                        return 0;
                    }
                    this.A0Z = null;
                    return 10;
                }
            }
        }
        return 10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (X.C627436k.A0L(r10.A0S, X.C86664Kz.A0H(r10.A0P, r12)) != false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BKz(android.content.Context r11, com.whatsapp.jid.GroupJid r12, java.util.List r13, int r14) {
        /*
            r10 = this;
            r2 = r10
            r4 = r12
            if (r12 == 0) goto L_0x0013
            X.1VX r1 = r10.A0S
            X.2sj r0 = r10.A0P
            int r0 = X.C86664Kz.A0H(r0, r12)
            boolean r0 = X.C627436k.A0L(r1, r0)
            r8 = 1
            if (r0 == 0) goto L_0x0014
        L_0x0013:
            r8 = 0
        L_0x0014:
            r7 = 0
            r3 = r11
            r5 = r13
            r6 = r14
            r9 = r7
            boolean r0 = r2.BL0(r3, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112455jl.BKz(android.content.Context, com.whatsapp.jid.GroupJid, java.util.List, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (X.C627436k.A0B(r5, r1, r12) != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BL0(android.content.Context r21, com.whatsapp.jid.GroupJid r22, java.util.List r23, int r24, boolean r25, boolean r26, boolean r27) {
        /*
            r20 = this;
            r4 = 0
            r8 = r20
            r9 = r22
            if (r22 != 0) goto L_0x0127
            r12 = 0
        L_0x0008:
            X.1VX r1 = r8.A0S
            X.2sr r5 = r8.A06
            boolean r0 = X.C627436k.A0C(r5, r1, r12)
            if (r0 == 0) goto L_0x0019
            boolean r2 = X.C627436k.A0B(r5, r1, r12)
            r0 = 1
            if (r2 == 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r2 = 0
            r3 = 1
            r7 = r21
            if (r0 == 0) goto L_0x0047
            if (r25 != 0) goto L_0x0046
            X.3Wi r0 = r8.A05
            X.4FU r0 = r0.A00
            if (r0 == 0) goto L_0x0046
            X.0zH r6 = X.AnonymousClass5V0.A00(r7)
            r5 = 2131895199(0x7f12239f, float:1.9425224E38)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0 = 4676(0x1244, float:6.552E-42)
            int r0 = r1.A0N(r0)
            X.AnonymousClass000.A1P(r3, r0, r4)
            X.C86624Kv.A0i(r7, r6, r3, r5)
            r0 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r6.A0Y(r2, r0)
            r6.A0S()
        L_0x0046:
            return r4
        L_0x0047:
            if (r22 == 0) goto L_0x0046
            X.2sj r0 = r8.A0P
            boolean r0 = r0.A0C(r9)
            if (r0 == 0) goto L_0x0046
            boolean r0 = X.C627436k.A0B(r5, r1, r12)
            if (r0 == 0) goto L_0x0046
            X.5Xv r6 = r8.A09
            android.content.SharedPreferences r0 = r6.A03()
            java.lang.String r5 = "voice_chat_education_seen_count"
            int r0 = r0.getInt(r5, r4)
            r10 = r23
            r11 = r24
            if (r0 >= r3) goto L_0x00ab
            r0 = 5091(0x13e3, float:7.134E-42)
            int r0 = r1.A0N(r0)
            r0 = r0 & 1
            if (r0 == r3) goto L_0x0083
            r0 = 6067(0x17b3, float:8.502E-42)
            int r0 = r1.A0N(r0)
            if (r12 < r0) goto L_0x00ab
            r0 = 6068(0x17b4, float:8.503E-42)
            int r0 = r1.A0N(r0)
            if (r12 > r0) goto L_0x00ab
        L_0x0083:
            android.content.SharedPreferences r0 = r6.A03()
            int r1 = X.C86664Kz.A08(r0, r5, r4)
            android.content.SharedPreferences r0 = r6.A03()
            X.C86604Kt.A15(r0, r5, r1)
            X.3Wi r0 = r8.A05
            X.4FU r1 = r0.A00
            if (r1 == 0) goto L_0x00aa
            r8.A05()
            X.7zI r6 = new X.7zI
            r6.<init>(r7, r8, r9, r10, r11, r12)
            com.whatsapp.calling.lightweightcalling.view.VoiceChatIntroCardDialog r0 = new com.whatsapp.calling.lightweightcalling.view.VoiceChatIntroCardDialog
            r0.<init>()
            r0.A00 = r6
            r1.Bon(r0, r2)
        L_0x00aa:
            return r3
        L_0x00ab:
            if (r26 != 0) goto L_0x00fb
            boolean r0 = X.C627436k.A0L(r1, r12)
            if (r0 == 0) goto L_0x00fb
            X.0PJ r1 = A00(r11)
            X.3XG r6 = r8.A0A
            java.lang.Object r0 = r1.A00
            int r5 = X.AnonymousClass001.A0K(r0)
            java.lang.Object r1 = r1.A01
            java.lang.Integer r1 = (java.lang.Integer) r1
            r0 = 25
        L_0x00c5:
            r6.A01(r1, r0, r5)
            X.3Wi r0 = r8.A05
            X.4FU r6 = r0.A00
            if (r6 == 0) goto L_0x00aa
            r8.A05()
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r5 = new com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog
            r5.<init>()
            r0 = 2
            X.3Z6[] r2 = new X.AnonymousClass3Z6[r0]
            java.lang.String r1 = "voice_chat_group_jid"
            java.lang.String r0 = r9.getRawString()
            X.AnonymousClass3Z6.A09(r1, r0, r2, r4)
            java.lang.String r1 = "voice_chat_call_from_ui"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            X.AnonymousClass3Z6.A09(r1, r0, r2, r3)
            android.os.Bundle r0 = X.C02820Hs.A00(r2)
            r5.A0u(r0)
            r8.A05()
            java.lang.String r0 = "AudioChatBottomSheetDialog"
            r6.Bon(r5, r0)
            return r3
        L_0x00fb:
            r0 = 5429(0x1535, float:7.608E-42)
            int r2 = r1.A0N(r0)
            X.0PJ r1 = A00(r11)
            X.3XG r6 = r8.A0A
            java.lang.Object r0 = r1.A00
            int r5 = X.AnonymousClass001.A0K(r0)
            java.lang.Object r1 = r1.A01
            java.lang.Integer r1 = (java.lang.Integer) r1
            r0 = 4
            r6.A01(r1, r0, r5)
            r19 = r27
            r13 = r8
            r14 = r7
            r15 = r9
            r16 = r10
            r17 = r11
            r18 = r12
            r13.A07(r14, r15, r16, r17, r18, r19)
            if (r2 != r3) goto L_0x00aa
            r0 = 7
            goto L_0x00c5
        L_0x0127:
            X.2sj r0 = r8.A0P
            int r12 = X.C86664Kz.A0H(r0, r9)
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112455jl.BL0(android.content.Context, com.whatsapp.jid.GroupJid, java.util.List, int, boolean, boolean, boolean):boolean");
    }

    public int Bpl(Context context, List list, int i, boolean z) {
        return A03(context, (GroupJid) null, (Integer) null, C627236i.A06(AnonymousClass35J.A03(this.A06, this.A0L, true)), (String) null, list, i, 0, z, false, false, false);
    }

    public int Bpm(Context context, GroupJid groupJid, List list, int i, boolean z) {
        return A03(context, groupJid, (Integer) null, C627236i.A06(AnonymousClass35J.A03(this.A06, this.A0L, true)), (String) null, list, i, 0, z, false, false, false);
    }

    public void Bpq(Context context, C50392i6 r13, int i) {
        C64773Ex r3 = this.A0I;
        AnonymousClass3ZH A0A2 = r3.A0A(r13.A04);
        Context context2 = context;
        Bps(context2, (GroupJid) AnonymousClass3ZH.A05(A0A2, C27991fJ.class), r13.A07, AnonymousClass36T.A03(this.A06, r3, this.A0P, A0A2), i, AnonymousClass000.A1U(r13.A00, 2));
    }

    public final void A05() {
        ((C48062eH) this.A0Y.get()).A02(AnonymousClass3LA.class);
    }

    public final void A06(int i) {
        AnonymousClass4FU r2 = this.A05.A00;
        if (r2 != null) {
            ((C48062eH) this.A0Y.get()).A02(AnonymousClass3LB.class);
            r2.Bon(VoipErrorDialogFragment.A01(new C47702dg(), i), (String) null);
        }
    }

    public final void A07(Context context, GroupJid groupJid, List list, int i, int i2, boolean z) {
        int i3;
        String A062 = C627236i.A06(AnonymousClass35J.A03(this.A06, this.A0L, true));
        AnonymousClass1VX r1 = this.A0S;
        if (r1.A0N(5429) != 1 || r1.A0N(6083) <= 0 || i2 < r1.A0N(6119)) {
            i3 = 0;
        } else {
            i3 = r1.A0N(6083);
        }
        A03(context, groupJid, (Integer) null, A062, (String) null, list, i, i3, false, false, true, z);
    }

    public boolean A08(Context context, boolean z) {
        C69263Wi r1;
        int i;
        if (this.A0H.A08(true) != 0) {
            return true;
        }
        if (C29441ip.A02(context)) {
            Log.w("CallsManager/isNetworkAvailable: airplane mode is on");
            if (!z) {
                r1 = this.A05;
                i = R.string.f11nameremoved;
            }
            A06(3);
            return false;
        }
        Log.w("CallsManager/isNetworkAvailable: no network is available");
        if (!z) {
            r1 = this.A05;
            i = R.string.f11nameremoved;
        }
        A06(3);
        return false;
        r1.A0F(i, 1);
        return false;
    }

    public int Bpk(Context context, AnonymousClass3ZH r18, int i, boolean z) {
        if (r18 == null) {
            return 1;
        }
        return A03(context, (GroupJid) null, (Integer) null, C627236i.A06(AnonymousClass35J.A03(this.A06, this.A0L, true)), (String) null, Collections.singletonList(r18), i, 0, z, false, false, false);
    }

    public void Bps(Context context, GroupJid groupJid, String str, List list, int i, boolean z) {
        List list2 = list;
        if (list2.size() <= 1) {
            Log.e("app/startPrecall scheduled call is only supported for group with more than 2 people");
            return;
        }
        Context context2 = context;
        GroupJid groupJid2 = groupJid;
        A03(context2, groupJid2, Integer.valueOf(i), C627236i.A06(AnonymousClass35J.A03(this.A06, this.A0L, true)), str, list2, 4, 0, z, true, false, false);
    }

    public static /* synthetic */ void A01(C112455jl r15, C105825Wo r16) {
        C112455jl r2;
        LinkedHashMap A0r = C18320x8.A0r();
        C105825Wo r1 = r16;
        Iterator A11 = C18290x4.A11(r1.A0B);
        while (true) {
            r2 = r15;
            if (!A11.hasNext()) {
                break;
            }
            UserJid A0T2 = C18310x6.A0T(A11);
            A0r.put(A0T2, r15.A0F.A00(A0T2, "CallsManager/startVoiceService"));
        }
        r1.A02 = null;
        GroupJid groupJid = r1.A06;
        if (groupJid != null && r1.A0C) {
            C620533h r4 = r15.A0P.A09;
            if (C627436k.A0K(r15.A0S, r4.A04(groupJid))) {
                r1.A02 = r4.A07(groupJid).A0C();
            }
        }
        String str = r1.A09;
        boolean z = r1.A0D;
        int i = r1.A05;
        boolean z2 = r1.A0E;
        C105825Wo r42 = new C105825Wo(groupJid, r1.A08, str, r1.A0A, r1.A02, A0r, i, r1.A00, z, z2, r1.A0C, r1.A03);
        r42.A01 = r1.A01;
        r2.A0C.A00(new C106645Zu("start_call", (Object) r42));
    }

    /* JADX WARNING: Removed duplicated region for block: B:93:0x022d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BJS(android.content.Context r25, X.AnonymousClass3ZF r26, int r27, boolean r28) {
        /*
            r24 = this;
            X.C626936e.A01()
            r14 = r24
            X.2bV r0 = r14.A0G
            boolean r0 = r0.A00()
            r2 = 0
            r13 = 0
            r15 = r25
            if (r0 == 0) goto L_0x0025
            X.0zH r1 = X.AnonymousClass5V0.A00(r15)
            r0 = 2131895392(0x7f122460, float:1.9425616E38)
            r1.A0T(r0)
            r0 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r1.A0Y(r2, r0)
            r1.A0S()
            return r13
        L_0x0025:
            r7 = r26
            int r0 = r7.A0H
            r8 = 2
            r4 = 1
            r6 = r27
            r5 = r28
            if (r0 != r8) goto L_0x0123
            com.whatsapp.jid.GroupJid r0 = r7.A05
            if (r0 == 0) goto L_0x0123
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            X.2sj r1 = r14.A0P
            com.whatsapp.jid.GroupJid r0 = r7.A05
            X.C626936e.A06(r0)
            int r10 = X.C86664Kz.A0H(r1, r0)
            X.1VX r9 = r14.A0S
            X.2sr r0 = r14.A06
            boolean r11 = X.C627436k.A09(r0, r9)
            r0 = 4907(0x132b, float:6.876E-42)
            int r0 = r9.A0N(r0)
            r12 = 1
            boolean r1 = X.C18280x3.A1U(r0, r8)
            if (r11 == 0) goto L_0x00df
            r0 = 64
            if (r10 <= r0) goto L_0x005f
            if (r1 == 0) goto L_0x00df
        L_0x005f:
            r11 = 4
            r10 = 1
            if (r6 == r4) goto L_0x00cb
            r1 = 3
            r0 = 15
            if (r6 == r1) goto L_0x00c6
            r0 = 22
            if (r6 == r0) goto L_0x00d1
            switch(r27) {
                case 8: goto L_0x00d1;
                case 9: goto L_0x00c0;
                case 10: goto L_0x00c5;
                case 11: goto L_0x00c5;
                default: goto L_0x006f;
            }
        L_0x006f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
        L_0x0073:
            X.0PJ r11 = X.AnonymousClass0x9.A0G(r0, r2)
        L_0x0077:
            if (r3 == 0) goto L_0x007f
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 != r0) goto L_0x00b5
        L_0x007f:
            if (r28 != 0) goto L_0x00b5
            boolean r0 = X.C627436k.A0J(r9)
            if (r0 == 0) goto L_0x00b5
            r10 = 25
        L_0x0089:
            X.3XG r9 = r14.A0A
            java.lang.Object r0 = r11.A00
            int r1 = X.AnonymousClass001.A0K(r0)
            java.lang.Object r0 = r11.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.A01(r0, r10, r1)
            if (r12 != 0) goto L_0x00e2
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.calling.VoipAppUpdateActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "feature_type"
            r2.putExtra(r0, r8)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.setFlags(r0)
            r15.startActivity(r2)
            return r13
        L_0x00b5:
            com.whatsapp.jid.GroupJid r0 = r7.A05
            boolean r0 = X.C627436k.A0N(r0, r3)
            r10 = 6
            if (r0 == 0) goto L_0x0089
            r10 = 7
            goto L_0x0089
        L_0x00c0:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            goto L_0x00d6
        L_0x00c5:
            r0 = 5
        L_0x00c6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0073
        L_0x00cb:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r10 = 2
            goto L_0x00d6
        L_0x00d1:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r10 = 7
        L_0x00d6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            X.0PJ r11 = X.AnonymousClass0x9.A0G(r1, r0)
            goto L_0x0077
        L_0x00df:
            r12 = 0
            goto L_0x005f
        L_0x00e2:
            X.2mt r0 = r7.A07
            if (r0 == 0) goto L_0x00fc
            java.lang.String r0 = r0.A03
            java.lang.String r2 = X.C627436k.A07(r0)
            if (r2 == 0) goto L_0x00fc
            X.2bw r9 = r14.A0E
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VoiceChatAcceptPingManager/onAcceptCall: callId = "
            X.C18260x0.A0q(r0, r2, r1)
            r9.A00(r2, r4)
        L_0x00fc:
            if (r3 == 0) goto L_0x0123
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x0123
            com.whatsapp.jid.GroupJid r1 = r3.groupJid
            com.whatsapp.jid.GroupJid r0 = r7.A05
            boolean r0 = java.util.Objects.equals(r1, r0)
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = r3.callId
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0123
            if (r28 == 0) goto L_0x0123
            boolean r0 = r14.A08(r15, r4)
            if (r0 == 0) goto L_0x01fb
            com.whatsapp.voipcalling.Voip.acceptCall()
            r0 = 1
            return r0
        L_0x0123:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "app/startFromCallLog/from "
            r1.append(r0)
            X.39J r0 = r7.A06()
            X.C18260x0.A0o(r0, r1)
            X.5Wo r0 = r14.A0Z
            if (r0 == 0) goto L_0x013d
            java.lang.String r0 = "app/startFromCallLog user tapped the call button twice before the telecom framework responds"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r13
        L_0x013d:
            r0 = 0
            r14.A00 = r0
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()
            java.util.ArrayList r20 = X.AnonymousClass001.A0s()
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = X.AnonymousClass3ZF.A01(r7)
        L_0x0151:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0170
            java.lang.Object r1 = r2.next()
            X.3ZE r1 = (X.AnonymousClass3ZE) r1
            X.2sr r0 = r14.A06
            com.whatsapp.jid.UserJid r1 = r1.A02
            boolean r0 = r0.A0a(r1)
            if (r0 != 0) goto L_0x0151
            r13.add(r1)
            X.3Ex r0 = r14.A0I
            X.C86614Ku.A1P(r0, r1, r9)
            goto L_0x0151
        L_0x0170:
            X.39J r3 = r7.A0E
            java.lang.String r2 = r3.A02
            java.lang.String r1 = X.C627436k.A07(r2)
            X.5U0 r0 = r14.A0B
            boolean r12 = r7.A0L
            int r11 = r9.size()
            r10 = 726210773(0x2b4918d5, float:7.1444006E-13)
            boolean r10 = r0.A04(r1, r10)
            if (r10 == 0) goto L_0x018c
            r0.A01(r1, r11, r12, r4)
        L_0x018c:
            boolean r12 = r7.A0L
            java.lang.String r18 = X.C627436k.A07(r2)
            r17 = 0
            X.2l8 r11 = r7.A0I
            int r10 = r7.A0H
            boolean r23 = X.AnonymousClass000.A1U(r10, r8)
            r8 = 7
            r21 = r9
            r22 = r12
            r16 = r11
            r19 = r13
            int r10 = r14.A02(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            if (r10 == 0) goto L_0x01fd
            if (r10 == r8) goto L_0x01b1
            r4 = 11
            if (r10 != r4) goto L_0x01f6
        L_0x01b1:
            int r12 = r3.A00
            boolean r11 = r3.A03
            com.whatsapp.jid.UserJid r9 = r3.A01
            boolean r5 = r7.A0L
            r4 = 1
            if (r10 != r8) goto L_0x01bd
            r4 = 0
        L_0x01bd:
            r10 = 1
            android.content.Intent r3 = X.C18320x8.A07()
            java.lang.String r8 = r15.getPackageName()
            java.lang.String r7 = "com.whatsapp.calling.VoipPermissionsActivity"
            r3.setClassName(r8, r7)
            java.lang.String r7 = "join_call_log"
            r3.putExtra(r7, r10)
            java.lang.String r7 = "call_log_call_id"
            r3.putExtra(r7, r2)
            java.lang.String r2 = "call_log_transaction_id"
            r3.putExtra(r2, r12)
            java.lang.String r2 = "call_log_from_me"
            r3.putExtra(r2, r11)
            java.lang.String r2 = "call_log_user_jid"
            X.AnonymousClass0x2.A0u(r3, r9, r2)
            java.lang.String r2 = "video_call"
            r3.putExtra(r2, r5)
            java.lang.String r2 = "lobby_entry_point"
            r3.putExtra(r2, r6)
            java.lang.String r2 = "permission_type"
            r3.putExtra(r2, r4)
            r15.startActivity(r3)
        L_0x01f6:
            r2 = 7952(0x1f10, float:1.1143E-41)
            r0.A03(r1, r2)
        L_0x01fb:
            r0 = 0
            return r0
        L_0x01fd:
            int r0 = r7.A0H
            r8 = 2
            if (r0 != r8) goto L_0x0235
            if (r28 != 0) goto L_0x0235
            X.1VX r2 = r14.A0S
            boolean r0 = X.C627436k.A0J(r2)
            if (r0 == 0) goto L_0x0235
            r0 = 6688(0x1a20, float:9.372E-42)
            boolean r0 = r2.A0X(r0)
            if (r0 == 0) goto L_0x0235
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            X.0PJ r0 = X.AnonymousClass0x9.A0G(r1, r0)
            r14.A01 = r0
        L_0x021e:
            int r0 = r7.A0H
            boolean r0 = X.AnonymousClass000.A1U(r0, r8)
            X.5Wo r2 = new X.5Wo
            r2.<init>(r7, r6, r5, r0)
            X.3ZF r0 = r2.A07
            if (r0 == 0) goto L_0x0234
            X.4FS r1 = r14.A0X
            r0 = 23
            X.C86644Kx.A1R(r1, r14, r2, r0)
        L_0x0234:
            return r4
        L_0x0235:
            boolean r3 = r7.A0L
            int r0 = r7.A0H
            boolean r2 = X.AnonymousClass000.A1U(r0, r8)
            X.5Wo r0 = new X.5Wo
            r0.<init>(r7, r6, r5, r2)
            r15 = r0
            r16 = r1
            r17 = r13
            r18 = r3
            r19 = r4
            int r0 = r14.A04(r15, r16, r17, r18, r19)
            if (r0 != 0) goto L_0x021e
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112455jl.BJS(android.content.Context, X.3ZF, int, boolean):boolean");
    }

    public void BhT(Context context, String str, int i, boolean z) {
        int i2;
        C626936e.A01();
        AnonymousClass5ZR r2 = this.A0N;
        String str2 = str;
        int i3 = i;
        boolean z2 = z;
        if (!r2.A0D() || C107305b5.A08(r2, z)) {
            i2 = 0;
        } else if (r2.A0G()) {
            i2 = 1;
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("app/previewCallLink token:");
            A0o.append(str);
            C18260x0.A1E(" isVideoEnabled: ", A0o, z);
            if (str.length() != 22) {
                Log.e("app/previewCallLink token with wrong length!");
                return;
            }
            boolean A1W = AnonymousClass000.A1W(this.A0Q.A04(Voip.getCurrentCallId()));
            if (AnonymousClass36T.A00(this.A0K.A0N(), r2) != 0) {
                int i4 = R.string.f11nameremoved;
                if (A1W) {
                    i4 = R.string.f11nameremoved;
                }
                this.A05.A0F(i4, 1);
                return;
            }
            this.A0X.BkM(new C117295rh(this, str2, i3, 0, z2));
            return;
        }
        Intent A072 = C18320x8.A07();
        A072.setClassName(context.getPackageName(), "com.whatsapp.calling.VoipPermissionsActivity");
        A072.putExtra("video_call", z);
        A072.putExtra("permission_type", i2);
        A072.putExtra("call_link_lobby_token", str);
        A072.putExtra("lobby_entry_point", i);
        context.startActivity(A072);
    }

    public C112455jl(C29171iO r9, C55682qk r10, C69263Wi r11, C56972sr r12, C66663Mh r13, C56962sq r14, C106155Xv r15, AnonymousClass3XG r16, AnonymousClass5U0 r17, C112515jr r18, C111665iU r19, C46622bw r20, C45822ad r21, C46362bV r22, C29441ip r23, C64773Ex r24, AnonymousClass5ZU r25, C620633i r26, C56612sH r27, C54292oU r28, AnonymousClass5ZR r29, C620733j r30, C56892sj r31, C56322rn r32, C56662sM r33, AnonymousClass1VX r34, C66493Lq r35, C52472lX r36, C56572sD r37, C187958y5 r38, AnonymousClass4FS r39, C183538qC r40) {
        C56612sH r5 = r27;
        this.A0L = r5;
        AnonymousClass1VX r7 = r34;
        this.A0S = r7;
        this.A05 = r11;
        this.A04 = r10;
        this.A06 = r12;
        C54292oU r6 = r28;
        this.A0M = r6;
        this.A0X = r39;
        this.A0V = r37;
        AnonymousClass5U0 r2 = r17;
        this.A0B = r2;
        this.A07 = r13;
        this.A0I = r24;
        this.A0K = r26;
        this.A0W = r38;
        this.A0J = r25;
        this.A0O = r30;
        this.A08 = r14;
        this.A0T = r35;
        this.A0R = r33;
        this.A0U = r36;
        this.A0C = r18;
        this.A0N = r29;
        this.A0Q = r32;
        this.A0A = r16;
        this.A09 = r15;
        this.A0F = r21;
        this.A0P = r31;
        this.A0H = r23;
        this.A03 = r9;
        this.A0G = r22;
        C111665iU r4 = r19;
        this.A0D = r4;
        this.A0Y = r40;
        this.A0E = r20;
        if (Build.VERSION.SDK_INT >= 28) {
            r4.A08(new C91414jZ(r2, this, r4, r5, r6, r7));
        }
        this.A02 = new AnonymousClass4MY(Looper.getMainLooper(), this, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01b6, code lost:
        if (r7.A0D.A0D() == false) goto L_0x01b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A03(android.content.Context r41, com.whatsapp.jid.GroupJid r42, java.lang.Integer r43, java.lang.String r44, java.lang.String r45, java.util.List r46, int r47, int r48, boolean r49, boolean r50, boolean r51, boolean r52) {
        /*
            r40 = this;
            r1 = r46
            X.C626936e.A01()
            r7 = r40
            X.1VX r12 = r7.A0S
            r0 = 3358(0xd1e, float:4.706E-42)
            int r0 = r12.A0N(r0)
            r6 = 0
            if (r0 <= 0) goto L_0x0054
            X.3ZH r0 = X.AnonymousClass4L0.A0L(r1, r6)
            X.4uZ r0 = r0.A0H
            boolean r0 = r0 instanceof X.C27981fH
            if (r0 != 0) goto L_0x0091
            java.util.ArrayList r4 = X.AnonymousClass000.A0p(r1)     // Catch:{ all -> 0x023e }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x023e }
        L_0x0024:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x023e }
            if (r0 == 0) goto L_0x0044
            X.3ZH r2 = X.C18310x6.A0R(r3)     // Catch:{ all -> 0x023e }
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r0 = com.whatsapp.jid.PhoneUserJid.class
            com.whatsapp.jid.Jid r2 = r2.A0I(r0)     // Catch:{ all -> 0x023e }
            com.whatsapp.jid.PhoneUserJid r2 = (com.whatsapp.jid.PhoneUserJid) r2     // Catch:{ all -> 0x023e }
            X.2sM r0 = r7.A0R     // Catch:{ all -> 0x023e }
            X.1fH r2 = r0.A01(r2)     // Catch:{ all -> 0x023e }
            if (r2 == 0) goto L_0x0044
            X.3Ex r0 = r7.A0I     // Catch:{ all -> 0x023e }
            X.C86614Ku.A1P(r0, r2, r4)     // Catch:{ all -> 0x023e }
            goto L_0x0024
        L_0x0044:
            int r2 = r4.size()     // Catch:{ all -> 0x023e }
            int r0 = r1.size()     // Catch:{ all -> 0x023e }
            if (r2 == r0) goto L_0x0090
            java.lang.String r0 = "Lid contacts size not equal to contacts, 1 or more lid contact was found null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x023e }
            goto L_0x0091
        L_0x0054:
            int r0 = r1.size()     // Catch:{ all -> 0x023e }
            java.util.ArrayList r4 = X.AnonymousClass002.A0I(r0)     // Catch:{ all -> 0x023e }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x023e }
        L_0x0060:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x023e }
            if (r0 == 0) goto L_0x0090
            X.3ZH r1 = X.C18310x6.A0R(r3)     // Catch:{ all -> 0x023e }
            java.lang.Class<X.1fH> r0 = X.C27981fH.class
            com.whatsapp.jid.Jid r2 = r1.A0I(r0)     // Catch:{ all -> 0x023e }
            X.1fH r2 = (X.C27981fH) r2     // Catch:{ all -> 0x023e }
            if (r2 == 0) goto L_0x008c
            X.2sM r0 = r7.A0R     // Catch:{ all -> 0x023e }
            com.whatsapp.jid.PhoneUserJid r1 = r0.A02(r2)     // Catch:{ all -> 0x023e }
            if (r1 != 0) goto L_0x0086
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x023e }
            java.lang.String r0 = "No PN mapping for "
            X.C18260x0.A1S(r1, r0, r2)     // Catch:{ all -> 0x023e }
            goto L_0x0060
        L_0x0086:
            X.3Ex r0 = r7.A0I     // Catch:{ all -> 0x023e }
            X.3ZH r1 = r0.A0A(r1)     // Catch:{ all -> 0x023e }
        L_0x008c:
            r4.add(r1)     // Catch:{ all -> 0x023e }
            goto L_0x0060
        L_0x0090:
            r1 = r4
        L_0x0091:
            X.2bV r0 = r7.A0G
            boolean r2 = r0.A00()
            r5 = 0
            r0 = r41
            if (r2 == 0) goto L_0x00b2
            X.0zH r1 = X.AnonymousClass5V0.A00(r0)
            r0 = 2131895392(0x7f122460, float:1.9425616E38)
            r1.A0T(r0)
            r0 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r1.A0Y(r5, r0)
            r1.A0S()
            r0 = 12
            return r0
        L_0x00b2:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "app/startOutgoingCall/from "
            r3.append(r2)
            r10 = r47
            r3.append(r10)
            java.lang.String r2 = ", video call:"
            r3.append(r2)
            r9 = r49
            r3.append(r9)
            java.lang.String r2 = ", groupJid:"
            r15 = r42
            X.C18260x0.A1R(r3, r2, r15)
            X.5U0 r2 = r7.A0B
            int r4 = r1.size()
            r3 = 726210773(0x2b4918d5, float:7.1444006E-13)
            r11 = r44
            boolean r3 = r2.A04(r11, r3)
            if (r3 == 0) goto L_0x00e5
            r2.A01(r11, r4, r9, r6)
        L_0x00e5:
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()
            if (r42 == 0) goto L_0x0101
            java.util.Iterator r8 = r1.iterator()
        L_0x00f3:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0126
            com.whatsapp.jid.Jid r3 = X.AnonymousClass3ZH.A06(r8)
            r4.add(r3)
            goto L_0x00f3
        L_0x0101:
            java.util.Iterator r14 = r1.iterator()
        L_0x0105:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x0126
            com.whatsapp.jid.Jid r8 = X.AnonymousClass3ZH.A06(r14)
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8
            X.2sq r3 = r7.A08
            boolean r3 = r3.A0P(r8)
            if (r3 == 0) goto L_0x0122
            r13.add(r8)
            java.lang.String r3 = "app/startOutgoingCall/failed_contact_blocked"
            com.whatsapp.util.Log.w((java.lang.String) r3)
            goto L_0x0105
        L_0x0122:
            r4.add(r8)
            goto L_0x0105
        L_0x0126:
            r19 = r5
            r24 = r5
            r8 = r51
            r20 = r7
            r21 = r0
            r22 = r5
            r23 = r15
            r25 = r4
            r26 = r13
            r27 = r1
            r28 = r9
            r29 = r8
            int r1 = r20.A02(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r13 = r45
            if (r1 == 0) goto L_0x0193
            r3 = 7
            if (r1 == r3) goto L_0x014e
            r3 = 11
            if (r1 != r3) goto L_0x018d
            r6 = 1
        L_0x014e:
            android.content.Intent r5 = X.C18320x8.A07()
            java.lang.String r7 = r0.getPackageName()
            java.lang.String r3 = "com.whatsapp.calling.VoipPermissionsActivity"
            r5.setClassName(r7, r3)
            java.lang.String r7 = "jids"
            java.util.ArrayList r3 = X.C627336j.A0A(r4)
            r5.putStringArrayListExtra(r7, r3)
            java.lang.String r3 = "call_from"
            r5.putExtra(r3, r10)
            java.lang.String r3 = "video_call"
            r5.putExtra(r3, r9)
            java.lang.String r3 = "permission_type"
            r5.putExtra(r3, r6)
            java.lang.String r3 = "voice_chat"
            r5.putExtra(r3, r8)
            if (r42 == 0) goto L_0x017f
            java.lang.String r3 = "group_jid"
            X.AnonymousClass0x2.A0u(r5, r15, r3)
        L_0x017f:
            boolean r3 = android.text.TextUtils.isEmpty(r13)
            if (r3 != 0) goto L_0x018a
            java.lang.String r3 = "scheduled_id"
            r5.putExtra(r3, r13)
        L_0x018a:
            r0.startActivity(r5)
        L_0x018d:
            r0 = 7952(0x1f10, float:1.1143E-41)
            r2.A03(r11, r0)
            return r1
        L_0x0193:
            java.util.LinkedHashMap r3 = X.C18320x8.A0r()
            java.util.Iterator r1 = r4.iterator()
        L_0x019b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01a9
            java.lang.Object r0 = r1.next()
            r3.put(r0, r5)
            goto L_0x019b
        L_0x01a9:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x01b8
            X.5iU r0 = r7.A0D
            boolean r1 = r0.A0D()
            r0 = 1
            if (r1 != 0) goto L_0x01b9
        L_0x01b8:
            r0 = 0
        L_0x01b9:
            r16 = r43
            r22 = r48
            r37 = r50
            r26 = r52
            if (r50 != 0) goto L_0x0219
            if (r0 == 0) goto L_0x0219
            java.util.LinkedHashMap r2 = X.C18320x8.A0r()
            java.util.Iterator r1 = r4.iterator()
        L_0x01cd:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01db
            java.lang.Object r0 = r1.next()
            r2.put(r0, r5)
            goto L_0x01cd
        L_0x01db:
            if (r42 == 0) goto L_0x01f3
            X.2sj r0 = r7.A0P
            X.33h r1 = r0.A09
            int r0 = r1.A04(r15)
            boolean r0 = X.C627436k.A0K(r12, r0)
            if (r0 == 0) goto L_0x01f3
            X.33k r0 = r1.A07(r15)
            java.lang.String r19 = r0.A0C()
        L_0x01f3:
            X.5Wo r14 = new X.5Wo
            r25 = r8
            r20 = r2
            r21 = r10
            r23 = r9
            r24 = r6
            r17 = r11
            r18 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r27 = r7
            r28 = r14
            r29 = r11
            r30 = r4
            r31 = r9
            r32 = r6
            int r0 = r27.A04(r28, r29, r30, r31, r32)
            if (r0 != 0) goto L_0x0219
            return r0
        L_0x0219:
            X.5Wo r2 = new X.5Wo
            r27 = r2
            r28 = r15
            r29 = r16
            r30 = r11
            r31 = r13
            r32 = r5
            r33 = r3
            r34 = r10
            r35 = r22
            r36 = r9
            r38 = r8
            r39 = r26
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            X.4FS r1 = r7.A0X
            r0 = 24
            X.C86644Kx.A1R(r1, r7, r2, r0)
            return r6
        L_0x023e:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112455jl.A03(android.content.Context, com.whatsapp.jid.GroupJid, java.lang.Integer, java.lang.String, java.lang.String, java.util.List, int, int, boolean, boolean, boolean, boolean):int");
    }
}
