package com.whatsapp.voipcalling;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass5AJ;
import X.C102995Lb;
import X.C150207Ps;
import X.C18310x6;
import X.C18320x8;
import X.C626936e;
import X.C627336j;
import X.C86664Kz;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CallInfo {
    public long ECMode;
    public long audioDuration;
    public long bytesReceived;
    public long bytesSent;
    public long callActiveTime;
    public long callDuration;
    public boolean callEnding;
    public final String callId;
    public UserJid callLinkCreatorJid;
    public int callLinkState;
    public String callLinkToken;
    public int callResult;
    public int callSetupErrorType;
    public final CallState callState;
    public C150207Ps callWaitingInfo;
    public boolean canRingAll;
    public int connectedLimit;
    public final UserJid creatorJid;
    public final GroupJid groupJid;
    public int initialGroupTransactionId;
    public final UserJid initialPeerJid;
    public boolean isBCall;
    public boolean isBCallBroadcaster;
    public boolean isCaller;
    public boolean isEndedByMe;
    public boolean isGroupCall;
    public boolean isGroupCallCreatedOnServer;
    public boolean isGroupCallEnabled;
    public final boolean isJoinableGroupCall;
    public boolean isLightweight;
    public boolean isPhashBasedCall;
    public final Map participants = C18320x8.A0r();
    public final UserJid peerJid;
    public final String relayCallUuid;
    public String scheduledId;
    public C102995Lb self;
    public final String selfParticipantUuid;
    public final String tsLogCallId;
    public boolean videoCaptureStarted;
    public long videoDuration;
    public boolean videoEnabled;
    public boolean videoPreviewReady;

    private void addParticipantInfo(C102995Lb r3) {
        this.participants.put(r3.A08, r3);
        if (r3.A0J) {
            this.self = r3;
        }
    }

    public static CallInfo convertCallLinkInfoToCallInfo(CallLinkInfo callLinkInfo) {
        CallLinkInfo callLinkInfo2 = callLinkInfo;
        C102995Lb r3 = callLinkInfo2.self;
        CallState callState2 = CallState.LINK;
        boolean z = callLinkInfo2.videoEnabled;
        boolean z2 = z;
        CallInfo callInfo = new CallInfo(callState2, CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID, (String) null, (String) null, (String) null, (UserJid) null, (UserJid) null, (UserJid) null, (GroupJid) null, false, true, false, false, z2, false, 0, 0, false, r3.A0O, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, callLinkInfo2.token, (String) null, false, false, false, false, false);
        callInfo.addParticipantInfo(r3);
        callInfo.callLinkCreatorJid = callLinkInfo2.creatorJid;
        callInfo.callLinkState = callLinkInfo2.linkState;
        return callInfo;
    }

    public static CallInfo convertCallWaitingInfoToCallInfo(CallInfo callInfo) {
        CallState callState2;
        CallInfo callInfo2 = callInfo;
        C150207Ps r0 = callInfo2.callWaitingInfo;
        boolean z = true;
        if (r0.A01 == 1) {
            callState2 = CallState.RECEIVED_CALL;
        } else {
            callState2 = CallState.ACTIVE;
        }
        UserJid userJid = r0.A03.initialPeerJid;
        C626936e.A06(userJid);
        String str = r0.A04;
        List list = r0.A06;
        UserJid userJid2 = (UserJid) list.get(0);
        GroupJid groupJid2 = r0.A02;
        if (r0.A00 <= 1) {
            z = false;
        }
        boolean z2 = callInfo2.isGroupCallEnabled;
        boolean z3 = r0.A08;
        String str2 = str;
        UserJid userJid3 = userJid;
        UserJid userJid4 = userJid2;
        GroupJid groupJid3 = groupJid2;
        boolean z4 = z;
        boolean z5 = z2;
        CallInfo callInfo3 = new CallInfo(callState2, str2, (String) null, (String) null, (String) null, userJid, userJid3, userJid4, groupJid3, false, z4, z5, false, z3, false, 0, 0, false, false, false, 0, 0, 0, 0, 0, 0, 0, -1, 0, r0.A07, r0.A05, (String) null, false, false, false, false, false);
        C102995Lb r02 = callInfo2.self;
        callInfo3.addParticipantInfo(r02.A08, r02.A02, true, false, r02.A0C, r02.A0G, r02.A0D, 1, r02.A0O, r02.A0N, r02.A0M, r02.A0L, r02.A07, r02.A04, r02.A05 * 90, r02.A09, r02.A0A, r02.A0K, false, false, false, 0, r02.A03, false, 0, false);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            callInfo3.addParticipantInfo(C18310x6.A0T(it), 2, false, false, false, false, false, z3 ? 1 : 0, false, false, false, false, 0, 0, 0, false, false, false, false, false, false, 0, 1, false, 0, false);
        }
        callInfo3.setCallWaitingInfo(0, "", 0, new String[0], (GroupJid) null, false, false, 0, false, (CallLogInfo) null, false, (String) null, false);
        return callInfo3;
    }

    public boolean canRingAll() {
        return this.canRingAll;
    }

    public boolean enableAudioVideoSwitch() {
        return this.self.A09;
    }

    public long getAudioDuration() {
        return this.audioDuration;
    }

    public long getBytesReceived() {
        return this.bytesReceived;
    }

    public long getBytesSent() {
        return this.bytesSent;
    }

    public long getCallActiveTime() {
        return this.callActiveTime;
    }

    public long getCallDuration() {
        return this.callDuration;
    }

    public String getCallId() {
        return this.callId;
    }

    public UserJid getCallLinkCreatorJid() {
        return this.callLinkCreatorJid;
    }

    public int getCallLinkState() {
        return this.callLinkState;
    }

    public String getCallLinkToken() {
        return this.callLinkToken;
    }

    public int getCallResult() {
        return this.callResult;
    }

    public int getCallSetupErrorType() {
        return this.callSetupErrorType;
    }

    public CallState getCallState() {
        return this.callState;
    }

    public C150207Ps getCallWaitingInfo() {
        return this.callWaitingInfo;
    }

    public int getConnectedLimit() {
        return this.connectedLimit;
    }

    public int getConnectedParticipantsCount() {
        return AnonymousClass5AJ.A00(this.participants);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0011  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C102995Lb getDefaultPeerInfo() {
        /*
            r5 = this;
            boolean r0 = r5.isGroupCall
            r4 = 0
            if (r0 != 0) goto L_0x0024
            java.util.Map r0 = r5.participants
            java.util.Iterator r3 = X.AnonymousClass001.A0v(r0)
        L_0x000b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0024
            X.5Lb r2 = X.C86664Kz.A13(r3)
            boolean r0 = r2.A0J
            if (r0 == 0) goto L_0x0023
            com.whatsapp.jid.UserJid r1 = r2.A08
            com.whatsapp.jid.UserJid r0 = r5.peerJid
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
        L_0x0023:
            return r2
        L_0x0024:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.CallInfo.getDefaultPeerInfo():X.5Lb");
    }

    public long getECMode() {
        return this.ECMode;
    }

    public GroupJid getGroupJid() {
        return this.groupJid;
    }

    public C102995Lb getInfoByJid(UserJid userJid) {
        return (C102995Lb) this.participants.get(userJid);
    }

    public Set getParticipantJids() {
        return this.participants.keySet();
    }

    public Map getParticipants() {
        return this.participants;
    }

    public String getRelayCallUuid() {
        return this.relayCallUuid;
    }

    public String getScheduledId() {
        return this.scheduledId;
    }

    public C102995Lb getSelfInfo() {
        return this.self;
    }

    public String getSelfParticipantUuid() {
        return this.selfParticipantUuid;
    }

    public String getTSLogCallId() {
        return this.tsLogCallId;
    }

    public long getVideoDuration() {
        return this.videoDuration;
    }

    public boolean hasOutgoingParticipantInActiveOneToOneCall() {
        if (this.callState != CallState.ACTIVE || getDefaultPeerInfo() == null) {
            return false;
        }
        int i = getDefaultPeerInfo().A02;
        if (i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    public int initialGroupTransactionId() {
        return this.initialGroupTransactionId;
    }

    public boolean isAudioChat() {
        if (this.groupJid == null || !this.isLightweight) {
            return false;
        }
        return true;
    }

    public boolean isBCall() {
        return this.isBCall;
    }

    public boolean isBCallBroadcaster() {
        return this.isBCallBroadcaster;
    }

    public boolean isCallEnding() {
        return this.callEnding;
    }

    public boolean isCallFull() {
        if (this.connectedLimit <= 0 || AnonymousClass5AJ.A00(this.participants) < this.connectedLimit) {
            return false;
        }
        return true;
    }

    public boolean isCallLinkLobbyOrJoiningState() {
        int i = this.callLinkState;
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    public boolean isCaller() {
        return this.isCaller;
    }

    public boolean isEitherSideRequestingUpgrade() {
        C102995Lb r0;
        if (this.isGroupCall || this.callState == CallState.NONE || (r0 = this.self) == null) {
            return false;
        }
        if (r0.A06 == 3 || isPeerRequestingUpgrade()) {
            return true;
        }
        return false;
    }

    public boolean isEndedByMe() {
        return this.isEndedByMe;
    }

    public boolean isGroupCall() {
        return this.isGroupCall;
    }

    public boolean isGroupCallCreatedOnServer() {
        return this.isGroupCallCreatedOnServer;
    }

    public boolean isGroupCallEnabled() {
        return this.isGroupCallEnabled;
    }

    public boolean isInLonelyState() {
        CallState callState2 = this.callState;
        if (callState2 != CallState.CONNECTED_LONELY) {
            if (callState2 == CallState.ACTIVE) {
                Iterator A0v = AnonymousClass001.A0v(this.participants);
                while (A0v.hasNext()) {
                    C102995Lb A13 = C86664Kz.A13(A0v);
                    if (A13.A02 != 1 || A13.A0J) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean isJoinableGroupCall() {
        return this.isJoinableGroupCall;
    }

    public boolean isPhashBasedCall() {
        if (this.groupJid == null || !this.isPhashBasedCall) {
            return false;
        }
        return true;
    }

    public boolean isSelfCallOnHold() {
        return this.self.A0C;
    }

    public boolean isSelfRequestingUpgrade() {
        C102995Lb r2;
        if (this.isGroupCall || (r2 = this.self) == null || this.callState == CallState.NONE || r2.A06 != 3) {
            return false;
        }
        return true;
    }

    public boolean isStartedFromCallLink() {
        return AnonymousClass000.A1W(this.callLinkToken);
    }

    public boolean isVideoCaptureStarted() {
        return this.videoCaptureStarted;
    }

    public boolean isVideoEnabled() {
        return this.videoEnabled;
    }

    public boolean isVideoPreviewReady() {
        return this.videoPreviewReady;
    }

    public CallInfo(CallState callState2, String str, String str2, String str3, String str4, UserJid userJid, UserJid userJid2, UserJid userJid3, GroupJid groupJid2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2, boolean z7, boolean z8, boolean z9, long j, long j2, long j3, long j4, long j5, long j6, long j7, int i3, int i4, boolean z10, String str5, String str6, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.callState = callState2;
        this.callId = str;
        this.tsLogCallId = str2;
        this.relayCallUuid = str3;
        this.selfParticipantUuid = str4;
        this.peerJid = userJid;
        this.initialPeerJid = userJid2;
        this.creatorJid = userJid3;
        this.groupJid = groupJid2;
        this.isCaller = z;
        this.isGroupCall = z2;
        this.isGroupCallEnabled = z3;
        this.isGroupCallCreatedOnServer = z4;
        this.videoEnabled = z5;
        this.isEndedByMe = z6;
        this.callResult = i;
        this.callSetupErrorType = i2;
        this.callEnding = z7;
        this.videoPreviewReady = z8;
        this.videoCaptureStarted = z9;
        this.callActiveTime = j;
        this.callDuration = j2;
        this.audioDuration = j3;
        this.videoDuration = j4;
        this.bytesSent = j5;
        this.bytesReceived = j6;
        this.ECMode = j7;
        this.initialGroupTransactionId = i3;
        this.connectedLimit = i4;
        this.isJoinableGroupCall = z10;
        this.callLinkToken = str5;
        this.scheduledId = str6;
        this.isLightweight = z11;
        this.canRingAll = z12;
        this.isPhashBasedCall = z13;
        this.isBCall = z14;
        this.isBCallBroadcaster = z15;
    }

    private void setCallLinkCreatorJid(UserJid userJid) {
        this.callLinkCreatorJid = userJid;
    }

    private void setCallLinkState(int i) {
        this.callLinkState = i;
    }

    private void setCallWaitingInfo(int i, String str, int i2, String[] strArr, GroupJid groupJid2, boolean z, boolean z2, int i3, boolean z3, CallLogInfo callLogInfo, boolean z4, String str2, boolean z5) {
        String str3 = str;
        GroupJid groupJid3 = groupJid2;
        CallLogInfo callLogInfo2 = callLogInfo;
        String str4 = str2;
        this.callWaitingInfo = new C150207Ps(groupJid3, callLogInfo2, str3, str4, C627336j.A0B(UserJid.class, Arrays.asList(strArr)), i, i2, z, z4, z5);
    }

    public UserJid getCreatorJid() {
        boolean isCallLinkLobbyOrJoiningState = isCallLinkLobbyOrJoiningState();
        UserJid userJid = this.creatorJid;
        if (!isCallLinkLobbyOrJoiningState) {
            C626936e.A06(userJid);
        }
        return userJid;
    }

    public UserJid getInitialPeerJid() {
        if (isCallLinkLobbyOrJoiningState()) {
            return null;
        }
        UserJid userJid = this.initialPeerJid;
        C626936e.A06(userJid);
        return userJid;
    }

    public UserJid getPeerJid() {
        if (isCallLinkLobbyOrJoiningState()) {
            return null;
        }
        UserJid userJid = this.peerJid;
        C626936e.A06(userJid);
        return userJid;
    }

    public List getPeerJids() {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator A0v = AnonymousClass001.A0v(this.participants);
        while (A0v.hasNext()) {
            C102995Lb A13 = C86664Kz.A13(A0v);
            if (!A13.A0J) {
                A0s.add(A13.A08);
            }
        }
        return A0s;
    }

    public boolean isCallOnHold() {
        if (!isCallLinkLobbyOrJoiningState() && !isInLonelyState()) {
            if (!this.self.A0C) {
                Iterator A0v = AnonymousClass001.A0v(this.participants);
                while (A0v.hasNext()) {
                    C102995Lb A13 = C86664Kz.A13(A0v);
                    if (A13.A0J || A13.A0C) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean isPeerRequestingUpgrade() {
        C102995Lb defaultPeerInfo = getDefaultPeerInfo();
        if (defaultPeerInfo == null || defaultPeerInfo.A06 != 3) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CallId: ");
        A0o.append(this.callId);
        A0o.append(", peerJid: ");
        A0o.append(this.peerJid);
        A0o.append(", callState: ");
        return AnonymousClass000.A0R(this.callState, A0o);
    }

    private void addParticipantInfo(UserJid userJid, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, boolean z6, boolean z7, boolean z8, boolean z9, int i3, int i4, int i5, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i6, int i7, boolean z16, int i8, boolean z17) {
        boolean z18 = true;
        int i9 = i;
        if (i9 < 1 || (i9 > 7 && i9 != 11)) {
            z18 = false;
        }
        C626936e.A0D(z18, AnonymousClass000.A0Y("invalid participant state ", AnonymousClass001.A0o(), i9));
        boolean z19 = z7;
        boolean z20 = z6;
        int i10 = i2;
        boolean z21 = z5;
        boolean z22 = z4;
        boolean z23 = z3;
        boolean z24 = z2;
        boolean z25 = z;
        int i11 = i8;
        int i12 = i7;
        int i13 = i6;
        boolean z26 = z15;
        boolean z27 = z13;
        boolean z28 = z12;
        boolean z29 = z11;
        boolean z30 = z10;
        int i14 = i5;
        int i15 = i4;
        UserJid userJid2 = userJid;
        C102995Lb r2 = new C102995Lb(userJid2, i9, i10, i3, i15, i14, i13, i12, i11, z25, z24, z23, z22, z21, z20, z19, z8, z9, z30, z29, z28, z27, z26, z16, z17);
        this.participants.put(userJid2, r2);
        if (r2.A0J) {
            this.self = r2;
        }
    }
}
