package com.whatsapp.calling.lightweightcalling.viewmodel;

import X.AnonymousClass08M;
import X.AnonymousClass1VX;
import X.AnonymousClass4FS;
import X.AnonymousClass4VK;
import X.AnonymousClass57w;
import X.AnonymousClass5ZU;
import X.AnonymousClass681;
import X.C107285b3;
import X.C112515jr;
import X.C117695sL;
import X.C1224364j;
import X.C1230066r;
import X.C150477Qw;
import X.C162457s7;
import X.C18260x0;
import X.C18290x4;
import X.C29421in;
import X.C56122rS;
import X.C56322rn;
import X.C56892sj;
import X.C56972sr;
import X.C64773Ex;
import X.C73853gB;
import X.C97174xk;
import com.whatsapp.jid.GroupJid;

public final class AudioChatBottomSheetViewModel extends AnonymousClass4VK implements C1224364j {
    public AnonymousClass57w A00 = AnonymousClass57w.NotInLobby;
    public C107285b3 A01;
    public GroupJid A02;
    public C150477Qw A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final AnonymousClass08M A08 = AnonymousClass08M.A01();
    public final AnonymousClass08M A09 = AnonymousClass08M.A01();
    public final AnonymousClass08M A0A = AnonymousClass08M.A01();
    public final C56972sr A0B;
    public final C97174xk A0C;
    public final C1230066r A0D;
    public final C112515jr A0E;
    public final C64773Ex A0F;
    public final C29421in A0G;
    public final AnonymousClass681 A0H;
    public final AnonymousClass5ZU A0I;
    public final C56122rS A0J;
    public final C56892sj A0K;
    public final C56322rn A0L;
    public final AnonymousClass1VX A0M;
    public final AnonymousClass4FS A0N;
    public final C73853gB A0O;
    public final C73853gB A0P;
    public volatile boolean A0Q;

    public void A0C() {
        this.A0Q = true;
        this.A0C.A07(this);
        this.A0G.A07(this.A0H);
        A0H();
    }

    public final void A0H() {
        if (this.A01 != null) {
            C18290x4.A1C(this.A0E.A00, this, 5);
            this.A01 = null;
            this.A04 = null;
            AnonymousClass4VK.A02(this.A0C, this);
            this.A02 = null;
            this.A0N.BkP(C117695sL.A00(this, 22));
            this.A07 = false;
        }
    }

    public void BbL(C107285b3 r2) {
        C162457s7.A0K(r2, "null cannot be cast to non-null type com.whatsapp.calling.service.VoiceService");
        this.A01 = r2;
        AnonymousClass4VK.A02(this.A0C, this);
    }

    public AudioChatBottomSheetViewModel(C56972sr r3, C97174xk r4, C1230066r r5, C112515jr r6, C64773Ex r7, C29421in r8, AnonymousClass5ZU r9, C56122rS r10, C56892sj r11, C56322rn r12, AnonymousClass1VX r13, AnonymousClass4FS r14, C73853gB r15, C73853gB r16) {
        C18260x0.A0f(r13, r3, r14, r5, r10);
        C18260x0.A0g(r9, r4, r7, r8, r6);
        C18260x0.A0Y(r12, r11, r15);
        this.A0M = r13;
        this.A0B = r3;
        this.A0N = r14;
        this.A0D = r5;
        this.A0J = r10;
        this.A0I = r9;
        this.A0C = r4;
        this.A0F = r7;
        this.A0G = r8;
        this.A0E = r6;
        this.A0L = r12;
        this.A0K = r11;
        this.A0P = r15;
        this.A0O = r16;
        AnonymousClass681 A002 = AnonymousClass681.A00(this, 9);
        this.A0H = A002;
        r4.A06(this);
        r8.A06(A002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if (r9.A0M.A0N(5429) >= 3) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A0G(com.whatsapp.voipcalling.CallState r10, int r11, boolean r12, boolean r13) {
        /*
            r9 = this;
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r10 != r0) goto L_0x0078
            X.57w r0 = X.AnonymousClass57w.Creator
        L_0x000a:
            r9.A00 = r0
            X.57w r7 = X.AnonymousClass57w.Creator
            r8 = 3
            r5 = 0
            r3 = 1
            if (r0 != r7) goto L_0x001e
            X.1VX r1 = r9.A0M
            r0 = 5429(0x1535, float:7.608E-42)
            int r0 = r1.A0N(r0)
            r1 = 0
            if (r0 < r8) goto L_0x001f
        L_0x001e:
            r1 = 1
        L_0x001f:
            X.57w r6 = r9.A00
            int r0 = r6.ordinal()
            if (r0 != r3) goto L_0x0029
            boolean r12 = r9.A06
        L_0x0029:
            X.4jV r0 = new X.4jV
            r0.<init>(r12, r1)
            r2.add(r0)
            if (r11 == r3) goto L_0x0034
            r3 = 0
        L_0x0034:
            X.57w r4 = X.AnonymousClass57w.NotInLobby
            boolean r1 = X.AnonymousClass000.A1Y(r6, r4)
            X.4jR r0 = new X.4jR
            r0.<init>(r3, r1)
            r2.add(r0)
            boolean r3 = X.AnonymousClass000.A1Y(r6, r4)
            boolean r1 = X.AnonymousClass000.A1U(r11, r8)
            X.4jU r0 = new X.4jU
            r0.<init>(r3, r13, r1)
            r2.add(r0)
            boolean r1 = X.AnonymousClass000.A1Y(r6, r7)
            X.4jT r0 = new X.4jT
            r0.<init>(r1)
            r2.add(r0)
            X.57w r0 = X.AnonymousClass57w.Joiner
            boolean r1 = X.AnonymousClass000.A1Y(r6, r0)
            X.4jW r0 = new X.4jW
            r0.<init>(r12, r1)
            r2.add(r0)
            if (r6 != r4) goto L_0x006f
            r5 = 1
        L_0x006f:
            X.4jS r0 = new X.4jS
            r0.<init>(r5)
            r2.add(r0)
            return r2
        L_0x0078:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r10 == r0) goto L_0x0080
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r10 != r0) goto L_0x008b
        L_0x0080:
            X.1VX r0 = r9.A0M
            boolean r0 = X.C627436k.A0J(r0)
            if (r0 == 0) goto L_0x008b
            X.57w r0 = X.AnonymousClass57w.Joiner
            goto L_0x000a
        L_0x008b:
            X.57w r0 = X.AnonymousClass57w.NotInLobby
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel.A0G(com.whatsapp.voipcalling.CallState, int, boolean, boolean):java.util.List");
    }
}
