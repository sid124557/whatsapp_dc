package com.whatsapp.calling.lightweightcalling.viewmodel;

import X.AnonymousClass08M;
import X.AnonymousClass0IV;
import X.AnonymousClass1VX;
import X.AnonymousClass20D;
import X.AnonymousClass3XG;
import X.AnonymousClass4VK;
import X.AnonymousClass5ZU;
import X.AnonymousClass6g5;
import X.AnonymousClass6g8;
import X.AnonymousClass7DH;
import X.AnonymousClass7T0;
import X.AnonymousClass92P;
import X.C107285b3;
import X.C112515jr;
import X.C1224364j;
import X.C162457s7;
import X.C182068no;
import X.C18260x0;
import X.C18290x4;
import X.C56892sj;
import X.C56972sr;
import X.C616131n;
import X.C620633i;
import X.C64773Ex;
import X.C84814Du;
import X.C85474Gj;
import X.C85494Gl;
import X.C97174xk;
import android.os.PowerManager;
import com.whatsapp.jid.UserJid;
import java.util.Set;
import java.util.concurrent.CancellationException;

public final class AudioChatCallingViewModel extends AnonymousClass4VK implements C1224364j {
    public PowerManager.WakeLock A00;
    public AnonymousClass7DH A01 = AnonymousClass6g8.A00;
    public C107285b3 A02;
    public AnonymousClass7T0 A03;
    public UserJid A04;
    public String A05;
    public Set A06;
    public C85474Gj A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final AnonymousClass08M A0D = AnonymousClass08M.A01();
    public final AnonymousClass08M A0E = AnonymousClass08M.A01();
    public final AnonymousClass08M A0F = AnonymousClass08M.A01();
    public final C56972sr A0G;
    public final C97174xk A0H;
    public final AnonymousClass3XG A0I;
    public final C112515jr A0J;
    public final C182068no A0K = new AnonymousClass92P(this, 0);
    public final C64773Ex A0L;
    public final AnonymousClass5ZU A0M;
    public final C620633i A0N;
    public final C56892sj A0O;
    public final AnonymousClass1VX A0P;

    public void A0C() {
        this.A0H.A07(this);
        A0G();
    }

    public final void A0G() {
        if (this.A02 != null) {
            C18290x4.A1C(this.A0J.A00, this, 5);
            this.A02 = null;
        }
        AnonymousClass7T0 r0 = this.A03;
        if (r0 != null) {
            r0.A00((C182068no) null);
        }
        A0J(false);
    }

    public final void A0I(AnonymousClass7DH r5) {
        if ((r5 instanceof AnonymousClass6g5) && !C162457s7.A0P(r5, this.A01)) {
            C85474Gj r0 = this.A07;
            if (r0 != null) {
                r0.AyX((CancellationException) null);
            }
            this.A07 = C616131n.A02((C85494Gl) null, new AudioChatCallingViewModel$restartSubtitleTimer$1(this, (C84814Du) null), AnonymousClass0IV.A00(this), (AnonymousClass20D) null, 3);
        }
        this.A01 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0 != null) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0J(boolean r5) {
        /*
            r4 = this;
            boolean r0 = r4.A0B
            if (r0 == r5) goto L_0x0027
            r4.A0B = r5
            r3 = 1
            android.os.PowerManager$WakeLock r0 = r4.A00
            if (r5 == 0) goto L_0x0032
            if (r0 != 0) goto L_0x0021
            X.33i r0 = r4.A0N
            android.os.PowerManager r2 = r0.A0J()
            if (r2 == 0) goto L_0x0030
            r1 = 32
            java.lang.String r0 = "AudioChatCallingViewModel"
            android.os.PowerManager$WakeLock r0 = X.AnonymousClass75K.A00(r2, r0, r1)
        L_0x001d:
            r4.A00 = r0
            if (r0 == 0) goto L_0x0028
        L_0x0021:
            boolean r0 = r0.isHeld()
            if (r0 != r3) goto L_0x0028
        L_0x0027:
            return
        L_0x0028:
            android.os.PowerManager$WakeLock r0 = r4.A00
            if (r0 == 0) goto L_0x0027
            r0.acquire()
            return
        L_0x0030:
            r0 = 0
            goto L_0x001d
        L_0x0032:
            if (r0 == 0) goto L_0x0027
            boolean r0 = r0.isHeld()
            if (r0 != r3) goto L_0x0027
            android.os.PowerManager$WakeLock r0 = r4.A00
            if (r0 == 0) goto L_0x0027
            r0.release(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel.A0J(boolean):void");
    }

    public void BbL(C107285b3 r2) {
        C162457s7.A0K(r2, "null cannot be cast to non-null type com.whatsapp.calling.service.VoiceService");
        this.A02 = r2;
    }

    public AudioChatCallingViewModel(C56972sr r3, C97174xk r4, AnonymousClass3XG r5, C112515jr r6, C64773Ex r7, AnonymousClass5ZU r8, C620633i r9, C56892sj r10, AnonymousClass1VX r11) {
        C18260x0.A0f(r11, r6, r4, r3, r8);
        C18260x0.A0W(r7, r10, r9);
        C162457s7.A0J(r5, 9);
        this.A0P = r11;
        this.A0J = r6;
        this.A0H = r4;
        this.A0G = r3;
        this.A0M = r8;
        this.A0L = r7;
        this.A0O = r10;
        this.A0N = r9;
        this.A0I = r5;
        r4.A06(this);
        AnonymousClass4VK.A02(r4, this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.4uZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.4uZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: X.4uZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.4uZ} */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c1, code lost:
        if ((r5.A0P.A0N(5091) & 64) > 0) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x013f, code lost:
        if (r8 == com.whatsapp.voipcalling.CallState.CONNECTED_LONELY) goto L_0x0141;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0H(X.AnonymousClass5XK r18) {
        /*
            r17 = this;
            java.util.LinkedHashSet r7 = X.AnonymousClass0x9.A17()
            r9 = r18
            X.8OQ r2 = r9.A02
            java.util.Collection r0 = r2.values()
            X.8Sy r0 = (X.C174098Sy) r0
            X.8Nf r4 = r0.iterator()
            r11 = 0
            r10 = r11
        L_0x0014:
            boolean r0 = r4.hasNext()
            r6 = 0
            if (r0 == 0) goto L_0x003b
            java.lang.Object r3 = r4.next()
            X.C162457s7.A0D(r3)
            X.5Lb r3 = (X.C102995Lb) r3
            int r1 = r3.A02
            r0 = 1
            if (r1 != r0) goto L_0x0014
            if (r10 == 0) goto L_0x002d
            int r6 = r10.A00
        L_0x002d:
            int r0 = r3.A00
            if (r6 >= r0) goto L_0x0032
            r10 = r3
        L_0x0032:
            com.whatsapp.jid.UserJid r0 = r3.A08
            X.C162457s7.A0D(r0)
            r7.add(r0)
            goto L_0x0014
        L_0x003b:
            r5 = r17
            com.whatsapp.jid.UserJid r4 = r5.A04
            com.whatsapp.voipcalling.CallState r8 = r9.A07
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r8 == r0) goto L_0x0049
            if (r10 == 0) goto L_0x0049
            com.whatsapp.jid.UserJid r11 = r10.A08
        L_0x0049:
            r5.A04 = r11
            X.08M r1 = r5.A0E
            boolean r0 = r5.A0A
            r14 = 1
            if (r0 == 0) goto L_0x01d6
            boolean r0 = r5.A0C
            if (r0 != 0) goto L_0x01d6
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x01d6
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r8 != r0) goto L_0x0066
            X.1VX r0 = r5.A0P
            boolean r0 = X.C627436k.A0J(r0)
            if (r0 != 0) goto L_0x01d6
        L_0x0066:
            r0 = 1
        L_0x0067:
            X.C18320x8.A18(r1, r0)
            boolean r0 = r9.A0G
            if (r0 != 0) goto L_0x0124
            X.6g8 r10 = X.AnonymousClass6g8.A00
        L_0x0070:
            r5.A0I(r10)
            X.08M r1 = r5.A0F
            X.C162457s7.A0C(r8)
            com.whatsapp.jid.UserJid r2 = r5.A04
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r8 != r0) goto L_0x00e3
            r2 = 2131895368(0x7f122448, float:1.9425567E38)
        L_0x0081:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            X.6pW r11 = X.AnonymousClass4L0.A0N(r0, r2)
        L_0x0087:
            X.1fJ r3 = r9.A04
            com.whatsapp.jid.UserJid r2 = r5.A04
            r13 = 0
            if (r2 == 0) goto L_0x009e
            if (r3 == 0) goto L_0x00e1
            X.2sj r0 = r5.A0O
            X.2zG r0 = X.C86624Kv.A0J(r0, r3, r2)
            if (r0 == 0) goto L_0x00e1
            int r0 = r0.A00
        L_0x009a:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
        L_0x009e:
            com.whatsapp.jid.UserJid r0 = r5.A04
            if (r0 != 0) goto L_0x00a3
            r14 = 0
        L_0x00a3:
            X.7DH r0 = r5.A01
            X.7Qw r12 = r0.A00
            X.5Lb r0 = r9.A03
            if (r0 == 0) goto L_0x00df
            boolean r15 = r0.A0F
        L_0x00ad:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r8 == r0) goto L_0x00b5
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r8 != r0) goto L_0x00c3
        L_0x00b5:
            X.1VX r2 = r5.A0P
            r0 = 5091(0x13e3, float:7.134E-42)
            int r0 = r2.A0N(r0)
            r0 = r0 & 64
            r16 = 1
            if (r0 > 0) goto L_0x00c5
        L_0x00c3:
            r16 = 0
        L_0x00c5:
            X.5Ss r10 = new X.5Ss
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r1.A0H(r10)
            com.whatsapp.jid.UserJid r0 = r5.A04
            if (r0 == 0) goto L_0x00d7
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00dc
        L_0x00d7:
            X.08M r0 = r5.A0D
            X.C06270Wx.A03(r0, r6)
        L_0x00dc:
            r5.A06 = r7
            return
        L_0x00df:
            r15 = 0
            goto L_0x00ad
        L_0x00e1:
            r0 = -1
            goto L_0x009a
        L_0x00e3:
            if (r2 == 0) goto L_0x011f
            X.2sr r0 = r5.A0G
            boolean r0 = r0.A0a(r2)
            if (r0 == 0) goto L_0x00fa
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r0 = 2131895597(0x7f12252d, float:1.9426032E38)
            X.6pW r11 = X.AnonymousClass4L0.A0N(r2, r0)
        L_0x00f6:
            X.C162457s7.A0H(r11)
            goto L_0x0087
        L_0x00fa:
            X.3Ex r0 = r5.A0L
            X.3ZH r3 = r0.A0A(r2)
            boolean r0 = r3.A0Q()
            if (r0 != 0) goto L_0x0118
            X.5ZU r2 = r5.A0M
            boolean r0 = X.AnonymousClass5ZU.A05(r3)
            if (r0 == 0) goto L_0x0118
            java.lang.String r0 = X.AnonymousClass5ZU.A03(r2, r3)
        L_0x0112:
            X.6pU r11 = new X.6pU
            r11.<init>(r0)
            goto L_0x00f6
        L_0x0118:
            X.5ZU r0 = r5.A0M
            java.lang.String r0 = r0.A0H(r3)
            goto L_0x0112
        L_0x011f:
            r2 = 2131895202(0x7f1223a2, float:1.942523E38)
            goto L_0x0081
        L_0x0124:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r8 == r0) goto L_0x0130
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r8 == r0) goto L_0x0130
            X.6g7 r10 = X.C132866g7.A00
            goto L_0x0070
        L_0x0130:
            X.C162457s7.A0C(r8)
            java.util.Set r10 = r5.A06
            r3 = 0
            if (r10 == 0) goto L_0x0197
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r8 == r0) goto L_0x0141
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            r1 = 1
            if (r8 != r0) goto L_0x0142
        L_0x0141:
            r1 = 0
        L_0x0142:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0197
            if (r1 != 0) goto L_0x0197
            X.7DH r1 = r5.A01
            boolean r0 = r1 instanceof X.AnonymousClass6g5
            if (r0 == 0) goto L_0x0195
            X.6g5 r1 = (X.AnonymousClass6g5) r1
            if (r1 == 0) goto L_0x0195
            X.3ZH r1 = r1.A01
        L_0x0156:
            java.util.Iterator r13 = r7.iterator()
        L_0x015a:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0180
            java.lang.Object r12 = r13.next()
            r11 = r12
            X.4uZ r11 = (X.C95814uZ) r11
            if (r1 == 0) goto L_0x0193
            X.4uZ r0 = r1.A0H
        L_0x016b:
            boolean r0 = X.C162457s7.A0P(r0, r11)
            if (r0 != 0) goto L_0x015a
            boolean r0 = r10.contains(r11)
            if (r0 != 0) goto L_0x015a
            X.2sr r0 = r5.A0G
            boolean r0 = r0.A0a(r11)
            if (r0 != 0) goto L_0x015a
            r3 = r12
        L_0x0180:
            X.4uZ r3 = (X.C95814uZ) r3
            if (r3 == 0) goto L_0x0197
            X.3Ex r0 = r5.A0L
            X.3ZH r1 = r0.A0A(r3)
            X.5ZU r0 = r5.A0M
            X.6g5 r10 = new X.6g5
            r10.<init>(r0, r1)
            goto L_0x0070
        L_0x0193:
            r0 = r3
            goto L_0x016b
        L_0x0195:
            r1 = r3
            goto L_0x0156
        L_0x0197:
            X.7DH r10 = r5.A01
            boolean r0 = r10 instanceof X.AnonymousClass6g5
            if (r0 != 0) goto L_0x0070
            boolean r0 = r5.A09
            if (r0 != 0) goto L_0x01a5
            X.6g9 r10 = X.C132876g9.A00
            goto L_0x0070
        L_0x01a5:
            X.1fJ r1 = r9.A04
            if (r1 == 0) goto L_0x01bc
            X.3Ex r0 = r5.A0L
            X.3ZH r2 = r0.A0A(r1)
            int r1 = r7.size()
            X.5ZU r0 = r5.A0M
            X.6g6 r10 = new X.6g6
            r10.<init>(r0, r2, r1)
            goto L_0x0070
        L_0x01bc:
            java.util.Set r0 = r2.keySet()
            X.C162457s7.A0D(r0)
            java.util.List r3 = X.C73723fy.A0F(r0)
            int r2 = r7.size()
            X.5ZU r1 = r5.A0M
            X.3Ex r0 = r5.A0L
            X.6g6 r10 = new X.6g6
            r10.<init>(r0, r1, r3, r2)
            goto L_0x0070
        L_0x01d6:
            r0 = 0
            goto L_0x0067
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel.A0H(X.5XK):void");
    }
}
