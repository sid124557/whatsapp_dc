package com.whatsapp.voipcalling;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x7;
import X.AnonymousClass32W;
import X.C18260x0;
import X.C18270x1;
import X.C626936e;
import X.C64393Dh;
import X.C86654Ky;
import android.graphics.Bitmap;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import com.whatsapp.calling.MultiNetworkCallback;
import com.whatsapp.calling.crypto.CryptoCallback;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.GZIPOutputStream;

public final class Voip {
    public static CryptoCallback A00;
    public static final SimpleDateFormat A01 = AnonymousClass0x7.A0u("yyyyMMddHHmmss");
    public static volatile SignalingXmppCallback A02;

    public class JidHelper {
        public static UserJid convertToUserJid(Jid jid) {
            if (jid instanceof UserJid) {
                return (UserJid) jid;
            }
            if (jid instanceof DeviceJid) {
                return ((DeviceJid) jid).userJid;
            }
            return null;
        }

        public static String getIdentifier(Jid jid) {
            return jid.user;
        }

        public static int getAgent(Jid jid) {
            return jid.getAgent();
        }

        public static int getDevice(Jid jid) {
            return jid.getDevice();
        }

        public static String getDomain(Jid jid) {
            return jid.getServer();
        }

        public static Jid getNullable(String str) {
            return AnonymousClass32W.A00(str);
        }

        public static int getType(Jid jid) {
            return jid.getType();
        }
    }

    public enum DebugTapType {
        RECEIVED_AND_DECODED,
        CAPTURED_AND_POST_PROCESSED,
        OUTGOING_ENCODED,
        RAW_CAPTURED,
        RAW_PLAYBACK
    }

    public static native void acceptCall();

    public static native void acceptCallWithVideoStopped();

    public static native int acceptVideoUpgrade();

    public static native void adjustAudioLevel(int i);

    public static native int cancelServerReminder(String str, GroupJid groupJid);

    public static native int cancelVideoUpgrade(int i);

    public static native void checkOngoingCalls(String[] strArr, DeviceJid[] deviceJidArr);

    public static native void clearVoipParam(String str);

    public static native int createCallLink(boolean z);

    public static native boolean dumpLastVideoFrame(UserJid userJid, Bitmap bitmap);

    public static native void endCall(boolean z);

    public static native void endCallAndAcceptPendingCall(String str);

    public static native void endCallAndAcceptPendingCallWithVideoStopped(String str);

    public static native CallInfo getCallInfo();

    public static native CallLinkInfo getCallLinkInfo();

    public static native String getCurrentCallId();

    public static native int getCurrentCallLinkState();

    public static native CallState getCurrentCallState();

    public static native UserJid getPeerJid();

    public static native String getVoipParam(String str);

    public static native String getVoipParamForCall(String str, String str2);

    public static native int groupCallBufferProcessMessages();

    public static native void handleIncomingTerminatePush(String str);

    public static native int invite(CallParticipantJid[] callParticipantJidArr, boolean z);

    public static native int inviteToGroupCall(CallParticipantJid callParticipantJid);

    public static native int joinCallLink();

    public static native int joinOngoingCall(String str, UserJid userJid, DeviceJid deviceJid, boolean z, CallParticipantJid[] callParticipantJidArr, boolean z2, GroupJid groupJid, int i, String str2, String str3, boolean z3, boolean z4, String str4);

    public static native void muteCall(boolean z);

    public static native int nativeHandleIncomingSignalingXmpp(Jid jid, VoipStanzaChildNode voipStanzaChildNode, String str, String str2, long j, long j2, boolean z);

    public static native int nativeHandleIncomingSignalingXmppAck(Jid jid, String str, int i, VoipStanzaChildNode[] voipStanzaChildNodeArr);

    public static native int nativeHandleIncomingSignalingXmppReceipt(Jid jid, VoipStanzaChildNode voipStanzaChildNode);

    public static native int nativeHandleIncomingXmppOffer(Jid jid, VoipStanzaChildNode voipStanzaChildNode, String str, String str2, long j, long j2, boolean z, boolean z2, int i, boolean z3, String str3);

    public static native int nativeParseXmppOffer(CallOfferInfo[] callOfferInfoArr, Jid jid, VoipStanzaChildNode voipStanzaChildNode, String str, String str2, long j, long j2, boolean z);

    public static native void nativeRegisterCryptoCallback(CryptoCallback cryptoCallback);

    public static native void nativeRegisterEventCallback(VoipEventCallback voipEventCallback);

    public static native int nativeRegisterJNIUtils(JNIUtils jNIUtils);

    public static native void nativeRegisterMultiNetworkCallback(MultiNetworkCallback multiNetworkCallback);

    public static native void nativeRegisterSignalingXmppCallback(SignalingXmppCallback signalingXmppCallback);

    public static native void nativeUnregisterEventCallback();

    public static native void nativeUnregisterJNIUtils();

    public static native void nativeUnregisterMultiNetworkCallback();

    public static native void nativeUnregisterSignalingXmppCallback();

    public static native void notifyAudioRouteChange(int i);

    public static native void notifyDeviceIdentityChanged(DeviceJid deviceJid);

    public static native void notifyDeviceIdentityDeleted(DeviceJid deviceJid);

    public static native int notifyFailureToCreateAlternativeSocket(boolean z);

    public static native int notifyLostOfAlternativeNetwork();

    public static native void onCallInterrupted(boolean z, boolean z2);

    public static native int peekIncomingOffer(String str, DeviceJid deviceJid, DeviceJid deviceJid2, boolean z, long j, long j2, boolean z2);

    public static native int previewCallLink(String str, boolean z);

    public static native void processPipModeChange(boolean z);

    public static native int refreshCaptureDevice();

    public static native int refreshVideoDevice();

    public static native void rejectCall(String str, String str2);

    public static native void rejectCallWithoutCallContext(String str, boolean z, DeviceJid deviceJid, DeviceJid deviceJid2, String str2, int i, int i2);

    public static native void rejectPendingCall(String str);

    public static native int rejectVideoUpgrade(int i);

    public static native int requestVideoUpgrade();

    public static native void resendOfferOnDecryptionFailure(DeviceJid deviceJid, String str);

    public static native void sendDTMFTone(String str);

    public static native int sendMutePeerRequestInGroupCall(UserJid userJid);

    public static native void sendRekeyRequest(DeviceJid deviceJid, int i);

    public static native int sendRemoveUserRequest(UserJid userJid);

    public static native int setBatteryState(float f, float f2, boolean z);

    public static native void setCallLowDataUsage(boolean z);

    public static native void setEnableAudioEffectAvailabilityCache(boolean z);

    public static native boolean setEnableFixedVideoOrientation(boolean z);

    public static native int setScreenSize(int i, int i2);

    public static native int setServerReminder(String str, GroupJid groupJid, long j);

    public static native int setVideoDisplayPort(UserJid userJid, VideoPort videoPort);

    public static native int setVideoPreviewPort(VideoPort videoPort);

    public static native int setVideoPreviewSize(int i, int i2);

    public static native int setVoipStackLogLevel(int i);

    public static native int startCall(String str, CallParticipantJid[] callParticipantJidArr, boolean z, GroupJid groupJid, boolean z2, String str2, boolean z3, String str3, int i, boolean z4);

    public static native boolean startCallRecording(RecordingInfo[] recordingInfoArr);

    public static native int startTestNetworkConditionWithAlternativeSocket(int i, String str, int i2);

    public static native void startVideoCaptureStream();

    public static native void startVideoRenderStream(UserJid userJid);

    public static native boolean stopCallRecording();

    public static native void stopVideoCaptureStream();

    public static native void stopVideoRenderStream(UserJid userJid);

    public static native int switchCamera();

    public static native int switchNetworkWithAlternativeSocket(int i, String str, int i2);

    public static native void timeoutPendingCall(String str);

    public static native int turnCameraOff();

    public static native int turnCameraOn();

    public static native int turnScreenShareOff();

    public static native int turnScreenShareOn();

    public static native void updateNetworkMedium(int i, int i2);

    public static native void updateNetworkRestrictions(boolean z);

    public static native int updateParticipantsRxSubscription(UserJid[] userJidArr);

    public static native void videoDeviceAndDisplayOrientationChanged(int i, int i2, boolean z);

    public class RecordingInfo {
        public File outputFile;
        public OutputStream outputStream;

        public RecordingInfo(C64393Dh r7, DebugTapType debugTapType) {
            String str;
            int ordinal = debugTapType.ordinal();
            if (ordinal == 1) {
                str = "record.processed";
            } else if (ordinal == 2) {
                str = "record.encoded";
            } else if (ordinal == 0) {
                str = "received.decoded";
            } else if (ordinal == 3) {
                str = "record.raw";
            } else if (ordinal == 4) {
                str = "playback.raw";
            } else {
                throw AnonymousClass000.A0H(debugTapType, "unknown debug tap type: ", AnonymousClass001.A0o());
            }
            String format = Voip.A01.format(new Date(System.currentTimeMillis()));
            r7.A08();
            StringBuilder A0l = AnonymousClass000.A0l(format);
            A0l.append(".");
            A0l.append(str);
            File A0A = C18270x1.A0A((File) null, ".wav.gz", A0l);
            this.outputFile = A0A;
            try {
                this.outputStream = new GZIPOutputStream(new FileOutputStream(A0A, true));
            } catch (IOException e) {
                Log.e((Throwable) e);
                this.outputStream = null;
            }
        }

        public File getOutputFile() {
            return this.outputFile;
        }

        public OutputStream getOutputStream() {
            return this.outputStream;
        }
    }

    public static String A05(int i) {
        if (i == 0) {
            return "kAudOutputDefault";
        }
        if (i == 1) {
            return "kAudOutputSpeaker";
        }
        if (i == 2) {
            return "kAudOutputEarpiece";
        }
        if (i == 3) {
            return "kAudOutputBluetooth";
        }
        if (i == 4) {
            return "kAudOutputHeadset";
        }
        C626936e.A0D(false, "UNKNOWN AudioRoute");
        return "UNKNOWN AudioRoute";
    }

    public static boolean A08(CallState callState) {
        if (callState == null) {
            return false;
        }
        if (callState == CallState.RECEIVED_CALL || callState == CallState.REJOINING) {
            return true;
        }
        return false;
    }

    public static boolean A09(CallState callState) {
        if (callState == null) {
            return false;
        }
        if (A08(callState) || callState == CallState.PRECALLING) {
            return true;
        }
        return false;
    }

    public static Boolean A00(String str) {
        Integer A012 = A01(str);
        if (A012 != null) {
            return Boolean.valueOf(AnonymousClass000.A1S(A012.intValue()));
        }
        return null;
    }

    public static Integer A01(String str) {
        String A06 = A06(str);
        if (A06 == null || A06.isEmpty()) {
            C18260x0.A0s("No value found for param ", str, AnonymousClass001.A0o());
            return null;
        }
        try {
            return Integer.valueOf(A06);
        } catch (NumberFormatException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Wrong format for param ");
            A0o.append(str);
            C18260x0.A0u(", value ", A06, A0o, e);
            return null;
        }
    }

    public static Object A02(int i, boolean z) {
        boolean z2;
        try {
            z2 = AcousticEchoCanceler.isAvailable();
        } catch (Throwable th) {
            Log.e(th);
            z2 = false;
        }
        if (!z2) {
            return null;
        }
        int i2 = 0;
        if (i < 0) {
            return null;
        }
        while (i2 <= 50) {
            int i3 = i + i2;
            if (i2 == 0) {
                i3 = i + 3;
            }
            try {
                AcousticEchoCanceler create = AcousticEchoCanceler.create(i3);
                if (create != null) {
                    create.setEnabled(z);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    C86654Ky.A11(create, "voip/hackBuiltInAec/enabled ", A0o, i3);
                    C18260x0.A0y(" with previous session id ", A0o, i);
                    return create;
                }
                i2++;
            } catch (Throwable th2) {
                Log.e(th2);
            }
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("voip/hackBuiltInAec/failed previousAudioSessionId = ");
        A0o2.append(i);
        C18260x0.A0y(", range = ", A0o2, 50);
        return null;
    }

    public static Object A03(int i, boolean z) {
        boolean z2;
        try {
            z2 = AutomaticGainControl.isAvailable();
        } catch (Throwable th) {
            Log.e(th);
            z2 = false;
        }
        if (!z2) {
            return null;
        }
        int i2 = 0;
        if (i < 0) {
            return null;
        }
        while (i2 <= 50) {
            int i3 = i + i2;
            if (i2 == 0) {
                i3 = i + 3;
            }
            try {
                AutomaticGainControl create = AutomaticGainControl.create(i3);
                if (create != null) {
                    create.setEnabled(z);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    C86654Ky.A11(create, "voip/hackBuiltInAgc/enabled ", A0o, i3);
                    C18260x0.A0y(" with previous session id ", A0o, i);
                    return create;
                }
                i2++;
            } catch (Throwable th2) {
                Log.e(th2);
            }
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("voip/hackBuiltInAgc/failed previousAudioSessionId = ");
        A0o2.append(i);
        C18260x0.A0y(", range = ", A0o2, 50);
        return null;
    }

    public static Object A04(int i, boolean z) {
        boolean z2;
        try {
            z2 = NoiseSuppressor.isAvailable();
        } catch (Throwable th) {
            Log.e(th);
            z2 = false;
        }
        if (!z2) {
            return null;
        }
        int i2 = 0;
        if (i < 0) {
            return null;
        }
        while (i2 <= 50) {
            int i3 = i + i2;
            if (i2 == 0) {
                i3 = i + 3;
            }
            try {
                NoiseSuppressor create = NoiseSuppressor.create(i3);
                if (create != null) {
                    create.setEnabled(z);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    C86654Ky.A11(create, "voip/hackBuiltInNs/enabled ", A0o, i3);
                    C18260x0.A0y(" with previous session id ", A0o, i);
                    return create;
                }
                i2++;
            } catch (Throwable th2) {
                Log.e(th2);
            }
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("voip/hackBuiltInNs/failed previousAudioSessionId = ");
        A0o2.append(i);
        C18260x0.A0y(", range = ", A0o2, 50);
        return null;
    }

    public static String A06(String str) {
        String voipParam = getVoipParam(str);
        if (voipParam == null || voipParam.isEmpty()) {
            return null;
        }
        return voipParam;
    }

    public static boolean A07() {
        CallState currentCallState = getCurrentCallState();
        int currentCallLinkState = getCurrentCallLinkState();
        if (currentCallState != CallState.LINK || currentCallLinkState == 4) {
            return false;
        }
        return true;
    }
}
