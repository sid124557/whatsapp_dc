package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import java.util.List;

/* renamed from: X.2w6  reason: invalid class name and case insensitive filesystem */
public class C58962w6 {
    public final int A00;
    public final long A01;
    public final GroupJid A02;
    public final UserJid A03;
    public final CallState A04;
    public final String A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public static C58962w6 A00(CallInfo callInfo, int i, boolean z) {
        CallInfo callInfo2 = callInfo;
        C150207Ps r3 = callInfo2.callWaitingInfo;
        if (r3.A01 == 1) {
            UserJid userJid = r3.A03.initialPeerJid;
            C626936e.A06(userJid);
            String str = r3.A04;
            CallState callState = CallState.RECEIVED_CALL;
            boolean z2 = true;
            if (r3.A00 <= 1) {
                z2 = false;
            }
            boolean z3 = r3.A08;
            List list = r3.A06;
            return new C58962w6(r3.A02, userJid, callState, str, list, -1, 0, false, z2, z3, false, false, true, r3.A07, false, r3.A09);
        }
        List peerJids = callInfo2.getPeerJids();
        String str2 = callInfo2.callId;
        CallState callState2 = callInfo2.callState;
        boolean z4 = callInfo2.isCaller;
        boolean z5 = callInfo2.isGroupCall;
        boolean z6 = callInfo2.videoEnabled;
        boolean isCallOnHold = callInfo2.isCallOnHold();
        long j = callInfo2.callDuration;
        UserJid peerJid = callInfo2.getPeerJid();
        C626936e.A06(peerJid);
        return new C58962w6(callInfo2.groupJid, peerJid, callState2, str2, peerJids, i, j, z4, z5, z6, z, isCallOnHold, false, callInfo2.isJoinableGroupCall, callInfo2.isInLonelyState(), callInfo2.isAudioChat());
    }

    public C58962w6(GroupJid groupJid, UserJid userJid, CallState callState, String str, List list, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.A05 = str;
        this.A04 = callState;
        this.A08 = z;
        this.A09 = z2;
        this.A0F = z3;
        this.A0D = z4;
        this.A0C = z5;
        this.A01 = j;
        this.A03 = userJid;
        this.A06 = list;
        this.A0E = z6;
        this.A02 = groupJid;
        this.A0B = z7;
        this.A0A = z8;
        this.A00 = i;
        this.A07 = z9;
    }
}
