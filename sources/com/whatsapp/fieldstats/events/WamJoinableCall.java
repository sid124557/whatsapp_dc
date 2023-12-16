package com.whatsapp.fieldstats.events;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass3ZG;
import X.AnonymousClass4AD;
import X.C162457s7;
import X.C18270x1;
import X.C18320x8;
import X.C57292tP;
import X.C86634Kw;
import java.util.LinkedHashMap;
import java.util.Map;

public final class WamJoinableCall extends AnonymousClass3ZG {
    public Long acceptAckLatencyMs;
    public String callRandomId;
    public String callReplayerId;
    public Integer callSide;
    public Boolean groupAcceptNoCriticalGroupUpdate;
    public Long groupAcceptToCriticalGroupUpdateMs;
    public Boolean hasScheduleExactAlarmPermission;
    public Boolean hasSpamDialog;
    public Boolean isCallFull;
    public Boolean isFromCallLink;
    public Boolean isLidCall;
    public Boolean isLinkCreator;
    public Boolean isLinkJoin;
    public Boolean isLinkedGroupCall;
    public Boolean isPendingCall;
    public Boolean isPhashBased;
    public Boolean isPhashMismatch;
    public Boolean isRejoin;
    public Boolean isRering;
    public Boolean isScheduledCall;
    public Boolean isUpgradedGroupCallBeforeConnected;
    public Boolean isVoiceChat;
    public Long joinAckLatencyMs;
    public Boolean joinableAcceptBeforeLobbyAck;
    public Boolean joinableDuringCall;
    public Boolean joinableEndCallBeforeLobbyAck;
    public Integer legacyCallResult;
    public Long lobbyAckLatencyMs;
    public Integer lobbyEntryPoint;
    public Integer lobbyExit;
    public Long lobbyExitNackCode;
    public Boolean lobbyQueryWhileConnected;
    public Long lobbyVisibleT;
    public Boolean nseEnabled;
    public Long nseOfflineQueueMs;
    public Long numConnectedPeers;
    public Long numInvitedParticipants;
    public Long numOutgoingRingingPeers;
    public Long queryAckLatencyMs;
    public Long randomScheduledId;
    public Boolean receivedByNse;
    public Boolean rejoinMissingDbMapping;
    public Long timeSinceAcceptMs;
    public Long timeSinceLastClientPollMinutes;
    public Boolean videoEnabled;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(23, this.acceptAckLatencyMs);
        r3.Blb(1, this.callRandomId);
        r3.Blb(31, this.callReplayerId);
        r3.Blb(41, this.callSide);
        r3.Blb(37, this.groupAcceptNoCriticalGroupUpdate);
        r3.Blb(38, this.groupAcceptToCriticalGroupUpdateMs);
        r3.Blb(42, this.hasScheduleExactAlarmPermission);
        r3.Blb(26, this.hasSpamDialog);
        r3.Blb(30, this.isCallFull);
        r3.Blb(32, this.isFromCallLink);
        r3.Blb(45, this.isLidCall);
        r3.Blb(39, this.isLinkCreator);
        r3.Blb(33, this.isLinkJoin);
        r3.Blb(24, this.isLinkedGroupCall);
        r3.Blb(14, this.isPendingCall);
        r3.Blb(46, this.isPhashBased);
        r3.Blb(48, this.isPhashMismatch);
        r3.Blb(3, this.isRejoin);
        r3.Blb(8, this.isRering);
        r3.Blb(40, this.isScheduledCall);
        r3.Blb(47, this.isUpgradedGroupCallBeforeConnected);
        r3.Blb(43, this.isVoiceChat);
        r3.Blb(34, this.joinAckLatencyMs);
        r3.Blb(16, this.joinableAcceptBeforeLobbyAck);
        r3.Blb(9, this.joinableDuringCall);
        r3.Blb(17, this.joinableEndCallBeforeLobbyAck);
        r3.Blb(6, this.legacyCallResult);
        r3.Blb(19, this.lobbyAckLatencyMs);
        r3.Blb(2, this.lobbyEntryPoint);
        r3.Blb(4, this.lobbyExit);
        r3.Blb(5, this.lobbyExitNackCode);
        r3.Blb(18, this.lobbyQueryWhileConnected);
        r3.Blb(7, this.lobbyVisibleT);
        r3.Blb(27, this.nseEnabled);
        r3.Blb(28, this.nseOfflineQueueMs);
        r3.Blb(13, this.numConnectedPeers);
        r3.Blb(12, this.numInvitedParticipants);
        r3.Blb(20, this.numOutgoingRingingPeers);
        r3.Blb(35, this.queryAckLatencyMs);
        r3.Blb(44, this.randomScheduledId);
        r3.Blb(29, this.receivedByNse);
        r3.Blb(22, this.rejoinMissingDbMapping);
        r3.Blb(36, this.timeSinceAcceptMs);
        r3.Blb(21, this.timeSinceLastClientPollMinutes);
        r3.Blb(10, this.videoEnabled);
    }

    public WamJoinableCall() {
        super(2572, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public static /* synthetic */ void getCallSide$annotations() {
    }

    public static /* synthetic */ void getLegacyCallResult$annotations() {
    }

    public static /* synthetic */ void getLobbyEntryPoint$annotations() {
    }

    public static /* synthetic */ void getLobbyExit$annotations() {
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0D(23, this.acceptAckLatencyMs, A0r), this.callRandomId);
        A0r.put(31, this.callReplayerId);
        A0r.put(41, this.callSide);
        A0r.put(37, this.groupAcceptNoCriticalGroupUpdate);
        A0r.put(38, this.groupAcceptToCriticalGroupUpdateMs);
        A0r.put(AnonymousClass3ZG.A0F(AnonymousClass3ZG.A0B(42, this.hasScheduleExactAlarmPermission, A0r), this.hasSpamDialog, A0r), this.isCallFull);
        A0r.put(32, this.isFromCallLink);
        A0r.put(45, this.isLidCall);
        A0r.put(39, this.isLinkCreator);
        A0r.put(33, this.isLinkJoin);
        A0r.put(C18270x1.A0Q(24, this.isLinkedGroupCall, A0r), this.isPendingCall);
        A0r.put(46, this.isPhashBased);
        A0r.put(C18270x1.A0K(C18270x1.A0F(48, this.isPhashMismatch, A0r), this.isRejoin, A0r), this.isRering);
        A0r.put(40, this.isScheduledCall);
        A0r.put(47, this.isUpgradedGroupCallBeforeConnected);
        A0r.put(43, this.isVoiceChat);
        A0r.put(C18270x1.A0I(AnonymousClass0x2.A0P(C18270x1.A0L(AnonymousClass0x2.A0O(34, this.joinAckLatencyMs, A0r), this.joinableAcceptBeforeLobbyAck, A0r), this.joinableDuringCall, A0r), this.joinableEndCallBeforeLobbyAck, A0r), this.legacyCallResult);
        A0r.put(C86634Kw.A0t(C18270x1.A0O(C18270x1.A0P(AnonymousClass3ZG.A0D(AnonymousClass3ZG.A0C(C18270x1.A0J(AnonymousClass0x2.A0Q(C18270x1.A0H(C18270x1.A0G(C18270x1.A0E(19, this.lobbyAckLatencyMs, A0r), this.lobbyEntryPoint, A0r), this.lobbyExit, A0r), this.lobbyExitNackCode, A0r), this.lobbyQueryWhileConnected, A0r), this.lobbyVisibleT, A0r), this.nseEnabled, A0r), this.nseOfflineQueueMs, A0r), this.numConnectedPeers, A0r), this.numInvitedParticipants, A0r), this.numOutgoingRingingPeers);
        A0r.put(35, this.queryAckLatencyMs);
        A0r.put(44, this.randomScheduledId);
        A0r.put(AnonymousClass3ZG.A08(29, this.receivedByNse, A0r), this.rejoinMissingDbMapping);
        A0r.put(C18270x1.A0M(C86634Kw.A0u(36, this.timeSinceAcceptMs, A0r), this.timeSinceLastClientPollMinutes, A0r), this.videoEnabled);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamJoinableCall {");
        C57292tP.A00(A0o, "acceptAckLatencyMs", this.acceptAckLatencyMs);
        C57292tP.A00(A0o, "callRandomId", this.callRandomId);
        C57292tP.A00(A0o, "callReplayerId", this.callReplayerId);
        C57292tP.A00(A0o, "callSide", C18270x1.A0T(this.callSide));
        C57292tP.A00(A0o, "groupAcceptNoCriticalGroupUpdate", this.groupAcceptNoCriticalGroupUpdate);
        C57292tP.A00(A0o, "groupAcceptToCriticalGroupUpdateMs", this.groupAcceptToCriticalGroupUpdateMs);
        C57292tP.A00(A0o, "hasScheduleExactAlarmPermission", this.hasScheduleExactAlarmPermission);
        C57292tP.A00(A0o, "hasSpamDialog", this.hasSpamDialog);
        C57292tP.A00(A0o, "isCallFull", this.isCallFull);
        C57292tP.A00(A0o, "isFromCallLink", this.isFromCallLink);
        C57292tP.A00(A0o, "isLidCall", this.isLidCall);
        C57292tP.A00(A0o, "isLinkCreator", this.isLinkCreator);
        C57292tP.A00(A0o, "isLinkJoin", this.isLinkJoin);
        C57292tP.A00(A0o, "isLinkedGroupCall", this.isLinkedGroupCall);
        C57292tP.A00(A0o, "isPendingCall", this.isPendingCall);
        C57292tP.A00(A0o, "isPhashBased", this.isPhashBased);
        C57292tP.A00(A0o, "isPhashMismatch", this.isPhashMismatch);
        C57292tP.A00(A0o, "isRejoin", this.isRejoin);
        C57292tP.A00(A0o, "isRering", this.isRering);
        C57292tP.A00(A0o, "isScheduledCall", this.isScheduledCall);
        C57292tP.A00(A0o, "isUpgradedGroupCallBeforeConnected", this.isUpgradedGroupCallBeforeConnected);
        C57292tP.A00(A0o, "isVoiceChat", this.isVoiceChat);
        C57292tP.A00(A0o, "joinAckLatencyMs", this.joinAckLatencyMs);
        C57292tP.A00(A0o, "joinableAcceptBeforeLobbyAck", this.joinableAcceptBeforeLobbyAck);
        C57292tP.A00(A0o, "joinableDuringCall", this.joinableDuringCall);
        C57292tP.A00(A0o, "joinableEndCallBeforeLobbyAck", this.joinableEndCallBeforeLobbyAck);
        C57292tP.A00(A0o, "legacyCallResult", C18270x1.A0T(this.legacyCallResult));
        C57292tP.A00(A0o, "lobbyAckLatencyMs", this.lobbyAckLatencyMs);
        C57292tP.A00(A0o, "lobbyEntryPoint", C18270x1.A0T(this.lobbyEntryPoint));
        C57292tP.A00(A0o, "lobbyExit", C18270x1.A0T(this.lobbyExit));
        C57292tP.A00(A0o, "lobbyExitNackCode", this.lobbyExitNackCode);
        C57292tP.A00(A0o, "lobbyQueryWhileConnected", this.lobbyQueryWhileConnected);
        C57292tP.A00(A0o, "lobbyVisibleT", this.lobbyVisibleT);
        C57292tP.A00(A0o, "nseEnabled", this.nseEnabled);
        C57292tP.A00(A0o, "nseOfflineQueueMs", this.nseOfflineQueueMs);
        C57292tP.A00(A0o, "numConnectedPeers", this.numConnectedPeers);
        C57292tP.A00(A0o, "numInvitedParticipants", this.numInvitedParticipants);
        C57292tP.A00(A0o, "numOutgoingRingingPeers", this.numOutgoingRingingPeers);
        C57292tP.A00(A0o, "queryAckLatencyMs", this.queryAckLatencyMs);
        C57292tP.A00(A0o, "randomScheduledId", this.randomScheduledId);
        C57292tP.A00(A0o, "receivedByNse", this.receivedByNse);
        C57292tP.A00(A0o, "rejoinMissingDbMapping", this.rejoinMissingDbMapping);
        C57292tP.A00(A0o, "timeSinceAcceptMs", this.timeSinceAcceptMs);
        C57292tP.A00(A0o, "timeSinceLastClientPollMinutes", this.timeSinceLastClientPollMinutes);
        return AnonymousClass3ZG.A0G(this.videoEnabled, "videoEnabled", A0o);
    }
}
