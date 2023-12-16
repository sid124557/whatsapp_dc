package X;

import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallGroupInfo;
import com.whatsapp.voipcalling.CallInfo;

/* renamed from: X.3bi  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C71193bi implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ C614830y A05;
    public final /* synthetic */ WamCall A06;
    public final /* synthetic */ GroupJid A07;
    public final /* synthetic */ UserJid A08;
    public final /* synthetic */ CallGroupInfo A09;
    public final /* synthetic */ CallInfo A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ boolean A0H;
    public final /* synthetic */ boolean A0I;

    public final void run() {
        boolean equals;
        String str;
        C614830y r13 = this.A05;
        UserJid userJid = this.A08;
        String str2 = this.A0D;
        int i = this.A00;
        CallInfo callInfo = this.A0A;
        GroupJid groupJid = this.A07;
        int i2 = this.A01;
        CallGroupInfo callGroupInfo = this.A09;
        long j = this.A04;
        int i3 = this.A02;
        String str3 = this.A0B;
        String str4 = this.A0C;
        boolean z = this.A0E;
        boolean z2 = this.A0F;
        boolean z3 = this.A0G;
        boolean z4 = this.A0H;
        boolean z5 = this.A0I;
        WamCall wamCall = this.A06;
        long j2 = this.A03;
        boolean z6 = false;
        AnonymousClass3ZF A032 = r13.A03(userJid, str2, i, false);
        if (A032 != null) {
            if (callInfo == null) {
                equals = false;
                str = null;
            } else {
                equals = str2.equals(callInfo.callWaitingInfo.A04);
                str = callInfo.scheduledId;
                if (callInfo.isAudioChat()) {
                    z6 = true;
                }
            }
            r13.A07(groupJid, A032, str, z6);
            int i4 = 26;
            if (i2 == 0) {
                i4 = 4;
            }
            r13.A01(callGroupInfo, A032);
            boolean z7 = z2;
            boolean z8 = z3;
            boolean z9 = z4;
            boolean z10 = z5;
            r13.A03.A0V(wamCall, callGroupInfo, A032, Integer.valueOf(i3), str2, str3, str4, i4, j, j2, z, equals, z7, z8, z9, z10, true);
        }
    }

    public /* synthetic */ C71193bi(C614830y r3, WamCall wamCall, GroupJid groupJid, UserJid userJid, CallGroupInfo callGroupInfo, CallInfo callInfo, String str, String str2, String str3, int i, int i2, int i3, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A05 = r3;
        this.A08 = userJid;
        this.A0D = str;
        this.A00 = i;
        this.A0A = callInfo;
        this.A07 = groupJid;
        this.A01 = i2;
        this.A09 = callGroupInfo;
        this.A04 = j;
        this.A02 = i3;
        this.A0B = str2;
        this.A0C = str3;
        this.A0E = z;
        this.A0F = z2;
        this.A0G = z3;
        this.A0H = z4;
        this.A0I = z5;
        this.A06 = wamCall;
        this.A03 = j2;
    }
}
