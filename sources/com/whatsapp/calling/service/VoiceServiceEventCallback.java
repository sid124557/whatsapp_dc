package com.whatsapp.calling.service;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass2NC;
import X.AnonymousClass2NF;
import X.AnonymousClass2OK;
import X.AnonymousClass2TG;
import X.AnonymousClass39J;
import X.AnonymousClass3ZF;
import X.AnonymousClass4CZ;
import X.AnonymousClass4FV;
import X.AnonymousClass742;
import X.AnonymousClass75J;
import X.AnonymousClass7HJ;
import X.AnonymousClass7IW;
import X.AnonymousClass7ZG;
import X.C102995Lb;
import X.C106155Xv;
import X.C106645Zu;
import X.C107285b3;
import X.C116985rC;
import X.C117695sL;
import X.C152637Zq;
import X.C162457s7;
import X.C179128ie;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C18330xA;
import X.C185888uP;
import X.C27981fH;
import X.C45142Yv;
import X.C46992cX;
import X.C47852dw;
import X.C50392i6;
import X.C55682qk;
import X.C56262rh;
import X.C56762sW;
import X.C56972sr;
import X.C58962w6;
import X.C61102zi;
import X.C614830y;
import X.C623234o;
import X.C626936e;
import X.C627336j;
import X.C627436k;
import X.C65213Gq;
import X.C69263Wi;
import X.C70183a5;
import X.C70283aF;
import X.C70303aH;
import X.C70463aX;
import X.C70473aY;
import X.C70623an;
import X.C70983bN;
import X.C73723fy;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import X.C97064xZ;
import android.content.Context;
import android.content.Intent;
import android.media.SoundPool;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.calling.CallSummary;
import com.whatsapp.calling.bcall.data.AudienceInfo;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.fieldstats.events.WamJoinableCall;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallFatalError;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallLinkInfo;
import com.whatsapp.voipcalling.CallOfferAckError;
import com.whatsapp.voipcalling.CallParticipant;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.SyncDevicesUserInfo;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipEventCallback;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class VoiceServiceEventCallback implements VoipEventCallback {
    public final AnonymousClass7IW bufferQueue = new AnonymousClass7IW();
    public final C46992cX httpsFormPostFactory;
    public final C107285b3 voiceService;

    private boolean isSelfNacked(CallOfferAckError[] callOfferAckErrorArr) {
        for (CallOfferAckError callOfferAckError : callOfferAckErrorArr) {
            if (this.voiceService.A1e.A0a(callOfferAckError.errorJid)) {
                return true;
            }
        }
        return false;
    }

    public void bCallCreated(String str, byte[] bArr, String str2) {
        changeAudioRoute(1);
    }

    public void bCallJoined(String str, String str2, String str3) {
        changeAudioRoute(1);
    }

    public void callCaptureBufferFilled(Voip.DebugTapType debugTapType, byte[] bArr, int i, Voip.RecordingInfo[] recordingInfoArr) {
        C626936e.A0B(false);
        byte[] bArr2 = bArr;
        if (bArr != null && bArr.length != 0) {
            int i2 = i;
            if (i > 0) {
                Voip.RecordingInfo[] recordingInfoArr2 = recordingInfoArr;
                if (recordingInfoArr != null) {
                    C107285b3.A3S.execute(new C70623an(this, recordingInfoArr2, debugTapType, bArr2, i2, 1));
                }
            }
        }
    }

    public void callCaptureEnded(Voip.DebugTapType debugTapType, Voip.RecordingInfo[] recordingInfoArr) {
        C626936e.A0B(false);
        C107285b3.A3S.execute(new C70183a5(recordingInfoArr, 37, debugTapType));
    }

    public void lidCallerDisplayInfo(UserJid[] userJidArr, UserJid[] userJidArr2) {
        boolean z;
        int length = userJidArr.length;
        C626936e.A0D(AnonymousClass000.A1U(length, userJidArr2.length), "Lid User array & Phone User Array length mismatch");
        HashMap A0t = AnonymousClass001.A0t();
        for (int i = 0; i < length; i++) {
            if (userJidArr[i] instanceof C27981fH) {
                z = true;
                if (userJidArr2[i] instanceof PhoneUserJid) {
                    C626936e.A0D(z, "Lid User Jid or Phone User Jid class mismatch");
                    A0t.put(userJidArr[i], userJidArr2[i]);
                }
            }
            z = false;
            C626936e.A0D(z, "Lid User Jid or Phone User Jid class mismatch");
            A0t.put(userJidArr[i], userJidArr2[i]);
        }
        C86644Kx.A1R(this.voiceService.A35, this, A0t, 36);
    }

    public void networkHealthChanged(int i, int i2, boolean z, boolean z2) {
        C152637Zq r2 = new C152637Zq(i, i2, z, z2, true, false, false);
        C18260x0.A1R(AnonymousClass001.A0o(), "VoiceService EVENT:networkHealthChanged eventData: ", r2);
        C18290x4.A1C(this.voiceService.A0H, r2, 53);
    }

    public void networkHealthChangedV2(int i, int i2, boolean z, boolean z2, boolean z3) {
        C152637Zq r2 = new C152637Zq(i, i2, z, true, z2, z3, true);
        C18260x0.A1R(AnonymousClass001.A0o(), "VoiceService EVENT:networkHealthChangedV2 eventData: ", r2);
        C18290x4.A1C(this.voiceService.A0H, r2, 53);
    }

    public void setScheduledCallJoinTimeDiffMs(GroupJid groupJid, String str) {
        GroupJid groupJid2 = groupJid;
        if (groupJid != null) {
            String str2 = str;
            if (!TextUtils.isEmpty(str)) {
                C107285b3 r1 = this.voiceService;
                if (r1.A3L) {
                    r1.A35.BkP(new C70463aX(this, groupJid2, str2, 1, System.currentTimeMillis()));
                }
            }
        }
    }

    public void showCallNotAllowedActivity(ArrayList arrayList, int i, String str) {
        this.voiceService.A1d.A0S(new C70473aY(this, arrayList, str, i, 1));
    }

    public void speakerStatusChanged(UserJid[] userJidArr, int[] iArr) {
        C626936e.A0D(AnonymousClass000.A1U(userJidArr.length, iArr.length), "Participant jid list and audio level list should be one-to-one mapped");
        Message obtainMessage = this.voiceService.A0H.obtainMessage(39);
        obtainMessage.getData().putParcelableArray("participant_jids", userJidArr);
        obtainMessage.getData().putIntArray("audio_levels", iArr);
        obtainMessage.sendToTarget();
    }

    public void startCallRecording() {
        C626936e.A0B(false);
    }

    private void changeAudioRoute(int i) {
        this.voiceService.A0H.removeMessages(27);
        Handler handler = this.voiceService.A0H;
        handler.sendMessage(handler.obtainMessage(27, i, 0));
    }

    private C179128ie getBCallManager() {
        return null;
    }

    private void handleFatalOfferNack(ArrayList arrayList, int i, CallInfo callInfo) {
        int i2 = 3;
        if (i != 401) {
            i2 = 10;
            int i3 = 2;
            if (i != 460) {
                if (i == 411) {
                    this.voiceService.A0p(arrayList, 11);
                } else if (i == 412) {
                    this.voiceService.A0p(arrayList, 10);
                } else if (i == 431) {
                    i2 = 15;
                } else if (i != 432) {
                    i2 = 0;
                    switch (i) {
                        case 403:
                            if (callInfo.videoEnabled) {
                                i2 = 7;
                                break;
                            }
                            break;
                        case 404:
                            i2 = 16;
                            break;
                        case 405:
                            i2 = 4;
                            break;
                        case 406:
                            if (callInfo.videoEnabled) {
                                i3 = 11;
                            }
                            i2 = i3;
                            break;
                        default:
                            switch (i) {
                                case 426:
                                    i2 = 1;
                                    if (callInfo.videoEnabled) {
                                        i2 = 9;
                                        break;
                                    }
                                    break;
                                case 427:
                                    i2 = 12;
                                    break;
                                case 428:
                                    i2 = 14;
                                    break;
                                default:
                                    if (callInfo.videoEnabled) {
                                        i2 = 8;
                                        break;
                                    }
                                    break;
                            }
                    }
                } else {
                    this.voiceService.A0p(arrayList, 2);
                }
                i2 = -1;
            } else if (!callInfo.videoEnabled) {
                i2 = 2;
            }
        }
        if (i2 != -1) {
            showCallNotAllowedActivity(arrayList, i2, (String) null);
        }
        this.voiceService.A0P(25, (String) null);
    }

    private boolean isFatalErrorCode(int i) {
        return AnonymousClass000.A1U(i, 432);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$lidCallerDisplayInfo$4(Map map) {
        this.voiceService.A2l.A05(map);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$linkCreateAcked$1(String str, boolean z) {
        Iterator A03 = C61102zi.A03(this.voiceService.A1r);
        while (A03.hasNext()) {
            for (AnonymousClass4CZ BV8 : ((AnonymousClass2NC) A03.next()).A02) {
                BV8.BV8(str, z);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setScheduledCallJoinTimeDiffMs$6(long j, C50392i6 r6) {
        this.voiceService.A0r = C18310x6.A0f(j, r6.A03);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setScheduledCallJoinTimeDiffMs$7(String str, GroupJid groupJid, long j) {
        C50392i6 A02 = this.voiceService.A2k.A02(groupJid, str);
        if (A02 != null) {
            this.voiceService.A1d.A0S(new C70283aF(this, A02, 2, j));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$showCallNotAllowedActivity$8(ArrayList arrayList, int i, String str) {
        C107285b3 r1 = this.voiceService;
        r1.A1P = true;
        Intent className = C18320x8.A07().setClassName(r1.A1W.getPackageName(), "com.whatsapp.calling.VoipNotAllowedActivity");
        className.putStringArrayListExtra("jids", C627336j.A0A(arrayList));
        className.putExtra("reason", i);
        if (str != null) {
            className.putExtra("message", str);
        }
        className.setFlags(268435456);
        this.voiceService.A1W.startActivity(className);
    }

    private /* synthetic */ void lambda$startCallRecording$5() {
        if (!Voip.startCallRecording(this.voiceService.A1V)) {
            Log.w("voip/callCapture/start fail");
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$updateJoinableCallLog$0(String str, UserJid userJid, boolean z, int i, int i2, CallParticipant[] callParticipantArr, CallSummary callSummary) {
        AnonymousClass3ZF A04 = this.voiceService.A21.A04(str);
        if (A04 == null) {
            if (userJid != null) {
                Log.d("No call log found by call-id, fetch call log by the key");
                A04 = this.voiceService.A21.A03(userJid, str, i, z);
                if (A04 == null) {
                    return;
                }
            } else {
                return;
            }
        }
        this.voiceService.A21.A05(callSummary, A04, callParticipantArr, i2);
        C107285b3 r1 = this.voiceService;
        if (str.equals(r1.A0y)) {
            r1.A0y = null;
            C623234o r6 = (C623234o) r1.A39.get();
            C162457s7.A0J(callParticipantArr, 0);
            ArrayList A0I = AnonymousClass002.A0I(r3);
            for (CallParticipant callParticipant : callParticipantArr) {
                A0I.add(callParticipant.jid);
            }
            r6.A08(A04, C73723fy.A0P(A0I), false);
        }
    }

    private void logCallExternalEvent(CallInfo callInfo) {
        C107285b3 r2;
        C45142Yv A00;
        C45142Yv r0;
        boolean z = callInfo.isCaller;
        CallState callState = callInfo.callState;
        if (!z ? callState == CallState.ACTIVE : callState == CallState.CALLING) {
            r2 = this.voiceService;
            A00 = r2.A33.A00(1);
        } else if (callState == CallState.NONE && (r0 = this.voiceService.A0d) != null) {
            r0.A00();
            r2 = this.voiceService;
            A00 = null;
        } else {
            return;
        }
        r2.A0d = A00;
    }

    public void NoSamplingRatesForAudioRecord() {
        Log.i("VoiceService EVENT:NoSamplingRatesForAudioRecord");
        C107285b3 r2 = this.voiceService;
        r2.A0P(23, r2.A1W.getString(R.string.f11nameremoved));
    }

    public void audioDriverRestart() {
        Log.i("VoiceService EVENT:audioDriverRestart");
    }

    public void audioInitError() {
        Log.i("VoiceService EVENT:audioInitError");
        C18270x1.A0g(C106155Xv.A01(this).remove("audio_sampling_hash"), "audio_sampling_rates");
        C107285b3 r2 = this.voiceService;
        r2.A0P(23, r2.A1W.getString(R.string.f11nameremoved));
    }

    public void audioStreamStarted() {
        Log.i("VoiceService EVENT:audioStreamStarted");
    }

    public void audioTestReplayFinished() {
        throw new AssertionError("audioTestReplayFinished is a debug only method");
    }

    public void autoVideoPauseStateChanged() {
        C86624Kv.A0p(this.voiceService.A0H, this, 55);
    }

    public void batteryLevelLow() {
        C86664Kz.A0d(this, "VoiceService EVENT:batteryLevelLow").sendEmptyMessage(18);
    }

    public void callAcceptFailed() {
        C86634Kw.A1P(this, "VoiceService EVENT:callAcceptFailed");
    }

    public void callAcceptReceived() {
        Log.i("VoiceService EVENT:callAcceptReceived");
    }

    public void callAutoConnected(String str, String str2) {
        Message.obtain(C86664Kz.A0d(this, "VoiceService EVENT:callAutoConnected"), 31, new AnonymousClass7HJ(str, str2)).sendToTarget();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ed, code lost:
        if (r2.delete() == false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0106, code lost:
        if (r2.delete() != false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0108, code lost:
        com.whatsapp.util.Log.i("app/VoiceService: time series log could not be deleted");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014a, code lost:
        r0 = r13.voiceService;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callEnding(com.whatsapp.voipcalling.CallLogInfo r14, int r15, java.lang.String r16) {
        /*
            r13 = this;
            java.lang.String r6 = "app/VoiceService: time series log could not be deleted"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VoiceService EVENT:callEnding result="
            r1.append(r0)
            if (r14 != 0) goto L_0x0055
            java.lang.String r0 = "null"
        L_0x000f:
            r1.append(r0)
            java.lang.String r0 = " rating interval="
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = " time series dir= "
            r2 = r16
            X.C18260x0.A0s(r0, r2, r1)
            X.5b3 r0 = r13.voiceService
            java.lang.Integer r0 = r0.A3N
            if (r0 != 0) goto L_0x002f
            X.5b3 r1 = r13.voiceService
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r1.A3N = r0
        L_0x002f:
            X.5b3 r0 = r13.voiceService
            r0.A3O = r2
            X.5b3 r0 = r13.voiceService
            X.364 r1 = r0.A2H
            java.lang.String r0 = "options.call_replayer_file_max_size"
            java.lang.Integer r0 = com.whatsapp.voipcalling.Voip.A01(r0)
            if (r0 == 0) goto L_0x0049
            int r0 = r0.intValue()
            int r0 = r0 * 1024
            int r0 = r0 * 1024
            r1.A00 = r0
        L_0x0049:
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r3 != 0) goto L_0x005c
            java.lang.String r0 = "we are not in a active call"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0055:
            int r0 = r14.callLogResultType
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x000f
        L_0x005c:
            int r1 = r3.callResult
            r0 = 1
            if (r1 != r0) goto L_0x007e
            java.lang.String r0 = "options.wa_log_dummy_time_series"
            java.lang.Boolean r0 = com.whatsapp.voipcalling.Voip.A00(r0)
            if (r0 == 0) goto L_0x007e
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x007e
            X.5b3 r0 = r13.voiceService
            X.364 r2 = r0.A2H
            X.4FS r1 = r2.A07
            r0 = 38
            X.5sL r0 = X.C117695sL.A00(r2, r0)
            r1.BkM(r0)
        L_0x007e:
            java.lang.String r0 = "options.wa_log_time_series"
            java.lang.Boolean r0 = com.whatsapp.voipcalling.Voip.A00(r0)
            r8 = 0
            if (r0 == 0) goto L_0x010b
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x010b
            X.5b3 r0 = r13.voiceService
            X.3Dh r0 = r0.A1c
            r0.A08()
            X.5b3 r0 = r13.voiceService
            android.content.Context r0 = r0.A1W
            java.io.File r1 = r0.getFilesDir()
            java.lang.String r0 = "wa_call_time_series.mtar.gz"
            java.io.File r2 = X.AnonymousClass002.A0A(r1, r0)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x010b
            X.5b3 r0 = r13.voiceService
            X.2qk r0 = r0.A1b
            java.lang.String r5 = r0.A06()
            X.2cX r7 = r13.httpsFormPostFactory     // Catch:{ IOException -> 0x00f0 }
            java.lang.String r9 = "https://crashlogs.whatsapp.net/wa_clb_data"
            r11 = 16
            r12 = 0
            r10 = r8
            X.30q r4 = r7.A00(r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x00f0 }
            java.lang.String r1 = "access_token"
            java.lang.String r0 = "1063127757113399|745146ffa34413f9dbb5469f5370b7af"
            r4.A08(r1, r0)     // Catch:{ IOException -> 0x00f0 }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00f0 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x00f0 }
            java.lang.String r0 = "attachment"
            X.C614230q.A01(r4, r2, r1, r0)     // Catch:{ IOException -> 0x00f0 }
            java.lang.String r0 = "from_jid"
            r4.A09(r0, r5)     // Catch:{ IOException -> 0x00f0 }
            java.lang.String r1 = "tags"
            java.lang.String r0 = "voip_time_series"
            r4.A09(r1, r0)     // Catch:{ IOException -> 0x00f0 }
            java.lang.String r1 = "android_hprof_extras"
            X.5b3 r0 = r13.voiceService     // Catch:{ IOException -> 0x00f0 }
            X.2qk r0 = r0.A1b     // Catch:{ IOException -> 0x00f0 }
            java.lang.String r0 = r0.A07(r8)     // Catch:{ IOException -> 0x00f0 }
            r4.A09(r1, r0)     // Catch:{ IOException -> 0x00f0 }
            r4.A03(r8)     // Catch:{ IOException -> 0x00f0 }
            boolean r0 = r2.delete()
            if (r0 != 0) goto L_0x010b
            goto L_0x0108
        L_0x00f0:
            r1 = move-exception
            java.lang.String r0 = "app/VoiceService: could not open time series log data"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x00f7 }
            goto L_0x0102
        L_0x00f7:
            r1 = move-exception
            boolean r0 = r2.delete()
            if (r0 != 0) goto L_0x0101
            com.whatsapp.util.Log.i((java.lang.String) r6)
        L_0x0101:
            throw r1
        L_0x0102:
            boolean r0 = r2.delete()
            if (r0 != 0) goto L_0x010b
        L_0x0108:
            com.whatsapp.util.Log.i((java.lang.String) r6)
        L_0x010b:
            X.5b3 r0 = r13.voiceService
            r0.A0G()
            int r4 = r3.callSetupErrorType
            r0 = 17
            r2 = 6
            if (r4 != r0) goto L_0x013e
            boolean r0 = r3.isCaller
            if (r0 != 0) goto L_0x0121
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r1 != r0) goto L_0x013e
        L_0x0121:
            com.whatsapp.jid.UserJid r0 = X.C86644Kx.A0X(r3)
            r13.showCallNotAllowedActivity((com.whatsapp.jid.UserJid) r0, (int) r2, (java.lang.String) r8)
        L_0x0128:
            X.5b3 r0 = r13.voiceService
            X.30y r2 = r0.A21
            X.1VX r1 = r2.A0B
            r0 = 6525(0x197d, float:9.143E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x015e
            X.3dI r1 = r2.A0C
            r0 = 15
            X.C86654Ky.A1O(r1, r2, r14, r3, r0)
            return
        L_0x013e:
            int r0 = r3.callResult
            if (r0 != r2) goto L_0x0128
            r0 = 18
            if (r4 == r0) goto L_0x014a
            r0 = 19
            if (r4 != r0) goto L_0x0128
        L_0x014a:
            X.5b3 r0 = r13.voiceService
            X.8uP r2 = r0.A0X
            if (r2 == 0) goto L_0x0128
            android.content.Context r1 = r0.A1W
            r0 = 2131895242(0x7f1223ca, float:1.9425311E38)
            java.lang.String r0 = r1.getString(r0)
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            r2.A1x = r0
            goto L_0x0128
        L_0x015e:
            r2.A09(r3, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.VoiceServiceEventCallback.callEnding(com.whatsapp.voipcalling.CallLogInfo, int, java.lang.String):void");
    }

    public void callGridRankingChanged() {
        this.voiceService.A0H.sendEmptyMessage(45);
    }

    public void callLinkStateChanged(int i, CallLinkInfo callLinkInfo) {
        if (callLinkInfo != null) {
            int i2 = callLinkInfo.linkState;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("VoiceService EVENT:callLinkStateChanged(");
            A0o.append(AnonymousClass742.A00(i));
            AnonymousClass001.A1M(A0o);
            Log.i(C18260x0.A07(AnonymousClass742.A00(i2), A0o));
            if (i == 3 && i2 == 4) {
                this.voiceService.A1G = true;
                updateSettingsFromVoipParamsAfterHandlingSignaling(callLinkInfo.videoEnabled);
                CallInfo callInfo = Voip.getCallInfo();
                C626936e.A06(callInfo);
                C614830y r2 = this.voiceService.A21;
                if (r2.A0B.A0X(6525)) {
                    C86654Ky.A1O(r2.A0C, r2, callInfo, callLinkInfo, 16);
                } else {
                    r2.A08(callInfo, callLinkInfo);
                }
            }
            Message obtain = Message.obtain(this.voiceService.A0H, 42, callLinkInfo);
            obtain.arg1 = i;
            obtain.sendToTarget();
        }
    }

    public void callOfferAcked() {
        Log.i("VoiceService EVENT:callOfferAcked");
        this.voiceService.A0G.removeMessages(2);
        C107285b3 r1 = this.voiceService;
        if (!r1.A16) {
            r1.A16 = true;
            r1.A0H.sendEmptyMessage(56);
        }
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null) {
            updateSettingsFromVoipParamsAfterHandlingSignaling(callInfo.videoEnabled);
            if (Voip.A00("options.caller_end_call_threshold") != null) {
                this.voiceService.A0j = Voip.A01("options.caller_end_call_threshold");
            }
            CallState callState = callInfo.callState;
            if (callState == CallState.CALLING || callState == CallState.PRE_ACCEPT_RECEIVED) {
                Integer A01 = Voip.A01("options.caller_timeout");
                if (A01 != null) {
                    long intValue = (long) (A01.intValue() * 1000);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    C107285b3 r9 = this.voiceService;
                    long j = intValue - (elapsedRealtime - r9.A08);
                    if (j > 0 && j < 120000) {
                        r9.A0G.removeCallbacksAndMessages((Object) null);
                        this.voiceService.A0G.sendEmptyMessageDelayed(0, j);
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("voip/receive_message/call-offer-ack change the caller timeout to ");
                        A0o.append(intValue);
                        C18260x0.A12(", remaining ", A0o, j);
                    }
                }
                this.voiceService.A0i(callInfo.callState, callInfo.callId);
            }
        }
    }

    public void callOfferReceiptReceived() {
        Log.i("VoiceService EVENT:callOfferReceiptReceived");
    }

    public void callOfferReceived() {
        Log.i("VoiceService EVENT:callOfferReceived");
    }

    public void callOfferSent() {
        Log.i("VoiceService EVENT:callOfferSent");
    }

    public void callPreAcceptReceived() {
        Log.i("VoiceService EVENT:callPreAcceptReceived");
    }

    /* JADX WARNING: Removed duplicated region for block: B:77:0x016b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callStateChanged(com.whatsapp.voipcalling.CallState r13, com.whatsapp.voipcalling.CallInfo r14) {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x01ef
            com.whatsapp.voipcalling.CallState r4 = r14.callState
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VoiceService EVENT:callStateChanged("
            r1.append(r0)
            r1.append(r13)
            X.AnonymousClass001.A1M(r1)
            java.lang.String r0 = X.C18260x0.A04(r4, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r4 == r13) goto L_0x01ef
            X.5b3 r0 = r12.voiceService
            X.2dw r0 = r0.A2E
            java.lang.String r2 = r14.callId
            r7 = 0
            X.C18270x1.A14(r2, r4)
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.NONE
            java.util.HashMap r0 = r0.A00
            if (r4 != r1) goto L_0x01e7
            r0.remove(r2)
        L_0x002f:
            com.whatsapp.voipcalling.CallState r8 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r4 != r8) goto L_0x0039
            X.5b3 r0 = r12.voiceService
            boolean r0 = r0.A3Q
            if (r0 == 0) goto L_0x0041
        L_0x0039:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r4 != r0) goto L_0x0046
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r13 != r0) goto L_0x0046
        L_0x0041:
            boolean r0 = r14.videoEnabled
            r12.updateSettingsFromVoipParamsAfterHandlingSignaling(r0)
        L_0x0046:
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.CALLING
            if (r4 == r1) goto L_0x0051
            X.5b3 r2 = r12.voiceService
            java.lang.String r0 = r14.callId
            r2.A0i(r4, r0)
        L_0x0051:
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.REJOINING
            r5 = 4
            r3 = 0
            r2 = 0
            if (r4 == r6) goto L_0x01de
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r4 == r0) goto L_0x01de
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r4 == r0) goto L_0x01de
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r4 == r0) goto L_0x01de
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r4 == r0) goto L_0x01de
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.BCALL_STARTING
            if (r4 == r0) goto L_0x01de
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_RECEIVED
            if (r4 == r0) goto L_0x01ad
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r4 == r0) goto L_0x01ad
            if (r4 != r8) goto L_0x0170
            X.5b3 r0 = r12.voiceService
            android.os.Handler r0 = r0.A0G
            r0.removeCallbacksAndMessages(r2)
            X.5b3 r8 = r12.voiceService
            boolean r7 = r14.isGroupCall
            r0 = 23000(0x59d8, double:1.13635E-319)
            if (r7 == 0) goto L_0x0152
            X.1VX r10 = r8.A2o
            r7 = 5170(0x1432, float:7.245E-42)
            int r9 = r10.A0N(r7)
            r7 = 1
            if (r9 <= r7) goto L_0x0155
            r0 = 45000(0xafc8, double:2.2233E-319)
        L_0x0093:
            X.5b3 r7 = r12.voiceService
            android.os.Handler r7 = r7.A0G
            r7.sendEmptyMessageDelayed(r5, r0)
            X.5b3 r7 = r12.voiceService
            android.os.Handler r7 = r7.A0G
            r7.sendEmptyMessageDelayed(r3, r0)
        L_0x00a1:
            int r7 = r4.ordinal()
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            switch(r7) {
                case 0: goto L_0x00f0;
                case 1: goto L_0x00aa;
                case 2: goto L_0x00f0;
                case 3: goto L_0x00f0;
                case 4: goto L_0x00aa;
                case 5: goto L_0x00aa;
                case 6: goto L_0x012e;
                case 7: goto L_0x00f0;
                case 8: goto L_0x00aa;
                case 9: goto L_0x00aa;
                case 10: goto L_0x012e;
                default: goto L_0x00aa;
            }
        L_0x00aa:
            X.5b3 r0 = r12.voiceService
            android.os.Handler r1 = r0.A0H
            int r0 = r13.ordinal()
            android.os.Message r0 = android.os.Message.obtain(r1, r5, r0, r7, r14)
            r0.sendToTarget()
            X.5b3 r0 = r12.voiceService
            X.5rC r1 = r0.A1Z
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x01ec
            java.lang.Object r1 = r1.A04()
            X.3Gq r1 = (X.C65213Gq) r1
            X.2OK r0 = r1.A01
            boolean r0 = X.AnonymousClass2OK.A00(r0)
            if (r0 == 0) goto L_0x01ec
            java.lang.String r0 = "InstrumentationObserverImpl/onCallStateChanged"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2mL r0 = r1.A02
            java.lang.Iterable r0 = r0.A00()
            java.util.Iterator r1 = r0.iterator()
        L_0x00e0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01ec
            java.lang.Object r0 = r1.next()
            X.2rh r0 = (X.C56262rh) r0
            r0.A04(r13, r14)
            goto L_0x00e0
        L_0x00f0:
            X.5b3 r6 = r12.voiceService
            android.os.Handler r6 = r6.A0H
            r6.removeCallbacksAndMessages(r2)
            com.whatsapp.voipcalling.CallState r2 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r13 == r2) goto L_0x00ff
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r13 != r6) goto L_0x010a
        L_0x00ff:
            X.5b3 r6 = r12.voiceService
            r6.A00 = r0
            android.os.Handler r1 = r6.A0H
            r0 = 17
            r1.sendEmptyMessage(r0)
        L_0x010a:
            X.5b3 r0 = r12.voiceService
            X.1VX r1 = r0.A2o
            r0 = 4778(0x12aa, float:6.695E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00aa
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r13 == r0) goto L_0x011c
            if (r13 != r2) goto L_0x00aa
        L_0x011c:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r4 != r0) goto L_0x00aa
            X.5b3 r0 = r12.voiceService
            X.5pi r0 = r0.A1m
            r0.A0D(r3)
            java.lang.String r0 = "Device microphone unmute at call end"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x00aa
        L_0x012e:
            X.5b3 r2 = r12.voiceService
            r2.A01 = r0
            android.os.Handler r1 = r2.A0H
            r0 = 3
            X.C86624Kv.A0p(r1, r12, r0)
            X.5b3 r0 = r12.voiceService
            X.5pi r0 = r0.A1m
            r0.A0D(r3)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r13 == r0) goto L_0x0149
            if (r13 == r6) goto L_0x0149
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r13 != r0) goto L_0x00aa
        L_0x0149:
            com.whatsapp.jid.GroupJid r1 = r14.groupJid
            java.lang.String r0 = r14.scheduledId
            r12.setScheduledCallJoinTimeDiffMs(r1, r0)
            goto L_0x00aa
        L_0x0152:
            boolean r7 = r14.isGroupCall
            goto L_0x0169
        L_0x0155:
            com.whatsapp.jid.GroupJid r7 = r14.groupJid
            if (r7 != 0) goto L_0x0152
            r7 = 5170(0x1432, float:7.245E-42)
            int r7 = r10.A0N(r7)
            if (r7 <= 0) goto L_0x0152
            java.lang.String r7 = r14.callId
            X.2TG r7 = r8.A07(r7)
            boolean r7 = r7.A06
        L_0x0169:
            if (r7 != 0) goto L_0x0093
            r0 = 45000(0xafc8, double:2.2233E-319)
            goto L_0x0093
        L_0x0170:
            if (r4 == r1) goto L_0x0185
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRE_ACCEPT_RECEIVED
            if (r4 == r0) goto L_0x0185
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "UNKNOWN call state "
            java.lang.String r0 = X.AnonymousClass000.A0P(r4, r0, r1)
            X.C626936e.A0D(r7, r0)
            goto L_0x00a1
        L_0x0185:
            X.5b3 r0 = r12.voiceService
            android.os.Handler r0 = r0.A0G
            r0.removeCallbacksAndMessages(r2)
            X.5b3 r0 = r12.voiceService
            android.os.Handler r8 = r0.A0G
            X.1VX r1 = r0.A2o
            r0 = 3256(0xcb8, float:4.563E-42)
            int r0 = r1.A0N(r0)
            if (r0 != 0) goto L_0x019d
            r0 = 90000(0x15f90, float:1.26117E-40)
        L_0x019d:
            long r0 = (long) r0
            r8.sendEmptyMessageDelayed(r7, r0)
            X.5b3 r0 = r12.voiceService
            android.os.Handler r8 = r0.A0G
            r7 = 2
            r0 = 15000(0x3a98, double:7.411E-320)
            r8.sendEmptyMessageDelayed(r7, r0)
            goto L_0x00a1
        L_0x01ad:
            X.5b3 r8 = r12.voiceService
            boolean r7 = r14.isAudioChat()
            r0 = 30000(0x7530, double:1.4822E-319)
            if (r7 == 0) goto L_0x01cd
            X.1VX r8 = r8.A2o
            r7 = 6007(0x1777, float:8.418E-42)
            long r10 = X.C56952sp.A06(r8, r7)
            r8 = 1000(0x3e8, double:4.94E-321)
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 < 0) goto L_0x01cd
            r8 = 90000(0x15f90, double:4.4466E-319)
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 > 0) goto L_0x01cd
            r0 = r10
        L_0x01cd:
            X.5b3 r7 = r12.voiceService
            android.os.Handler r7 = r7.A0G
            r7.removeCallbacksAndMessages(r2)
            X.5b3 r7 = r12.voiceService
            android.os.Handler r8 = r7.A0G
            r7 = 1
            r8.sendEmptyMessageDelayed(r7, r0)
            goto L_0x00a1
        L_0x01de:
            X.5b3 r0 = r12.voiceService
            android.os.Handler r0 = r0.A0G
            r0.removeCallbacksAndMessages(r2)
            goto L_0x00a1
        L_0x01e7:
            r0.put(r2, r4)
            goto L_0x002f
        L_0x01ec:
            r12.logCallExternalEvent(r14)
        L_0x01ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.VoiceServiceEventCallback.callStateChanged(com.whatsapp.voipcalling.CallState, com.whatsapp.voipcalling.CallInfo):void");
    }

    public void callTerminateReceived() {
        Log.i("VoiceService EVENT:callTerminateReceived");
    }

    public void endCallWhenRelayBindFailed(CallInfo callInfo) {
        int i;
        int A08 = this.voiceService.A2N.A08(true);
        if (A08 == 0) {
            C107285b3 r2 = this.voiceService;
            r2.A0P(3, r2.A1W.getString(R.string.f11nameremoved));
            return;
        }
        if (callInfo.isCaller || callInfo.callState == CallState.ACCEPT_SENT) {
            C107285b3 r1 = this.voiceService;
            boolean z = r1.A1D;
            Context context = r1.A1W;
            if (z) {
                i = R.string.f11nameremoved;
                if (A08 == 1) {
                    i = R.string.f11nameremoved;
                }
            } else {
                i = R.string.f11nameremoved;
            }
            showCallNotAllowedActivity(C86644Kx.A0X(callInfo), 5, context.getString(i));
        }
        this.voiceService.A0P(3, (String) null);
    }

    public void errorGatheringHostCandidates() {
        Log.i("VoiceService EVENT:errorGatheringHostCandidates");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x05f9  */
    public void fieldstatsReady(com.whatsapp.fieldstats.events.WamCall r27, java.lang.String r28, boolean r29, boolean r30) {
        /*
            r26 = this;
            r25 = r30
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VoiceService EVENT:fieldstatsReady lastReport: "
            r1.append(r0)
            r24 = r29
            r0 = r24
            r1.append(r0)
            java.lang.String r0 = ", realtime="
            r1.append(r0)
            r0 = r25
            r1.append(r0)
            java.lang.String r0 = ", callOfferElapsedTimeInMillisOnServer: "
            r1.append(r0)
            r7 = r26
            X.5b3 r0 = r7.voiceService
            java.lang.Long r0 = r0.A0p
            X.C18260x0.A0o(r0, r1)
            com.whatsapp.voipcalling.CallInfo r6 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r6 != 0) goto L_0x0036
            java.lang.String r0 = "we are not in a active call"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0036:
            X.5b3 r1 = r7.voiceService
            java.lang.String r0 = r6.callId
            X.2TG r11 = r1.A07(r0)
            X.5b3 r0 = r7.voiceService
            java.util.Set r0 = r0.A3K
            r0.clear()
            X.5b3 r0 = r7.voiceService
            X.33i r0 = r0.A2W
            android.media.AudioManager r9 = r0.A0G()
            r4 = 0
            if (r9 != 0) goto L_0x00ff
            r12 = r4
        L_0x0051:
            X.5b3 r1 = r7.voiceService
            java.lang.String r0 = r6.callId
            X.4Mi r1 = r1.A08(r0)
            if (r1 == 0) goto L_0x00fc
            boolean r0 = X.C107385bE.A02()
            if (r0 == 0) goto L_0x00fc
            boolean r0 = r1.getAudioModeIsVoip()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L_0x0069:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VoiceService:fieldstatsReady audio mode: "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = ", audioModeIsVoip: "
            X.C18260x0.A1R(r1, r0, r2)
            X.5b3 r0 = r7.voiceService
            X.5P3 r10 = r0.A23
            com.whatsapp.jid.UserJid r15 = X.AnonymousClass32Y.A08(r28)
            X.5b3 r0 = r7.voiceService
            java.lang.Long r5 = r0.A0p
            java.lang.Integer r3 = r0.A0i
            java.lang.Integer r2 = r11.A03
            java.lang.String r1 = r0.A11
            java.lang.String r0 = r0.A10
            r8 = r27
            r13 = r10
            r14 = r8
            r16 = r3
            r17 = r12
            r18 = r2
            r19 = r5
            r20 = r1
            r21 = r0
            r13.A00(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Integer r0 = r11.A04
            if (r0 == 0) goto L_0x00a7
            r8.incomingCallUiAction = r0
        L_0x00a7:
            boolean r0 = r11.A06
            if (r0 == 0) goto L_0x00af
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r8.isRering = r0
        L_0x00af:
            boolean r0 = r11.A05
            if (r0 == 0) goto L_0x00b7
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r8.doNotDisturbEnabled = r0
        L_0x00b7:
            X.5b3 r3 = r7.voiceService
            X.2lA r2 = r3.A0R
            boolean r1 = r2.A01
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x00c3
            r1 = r1 | 2
        L_0x00c3:
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x00c9
            r1 = r1 | 4
        L_0x00c9:
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r1)
            r8.callNotificationState = r0
            java.lang.Long r0 = r3.A0s
            if (r0 == 0) goto L_0x00d5
            r8.telecomFrameworkCallStartDelayT = r0
        L_0x00d5:
            java.lang.Long r0 = r3.A0t
            if (r0 == 0) goto L_0x00db
            r8.androidTelecomTimeSpentBeforeReject = r0
        L_0x00db:
            r8.callHistEchoLikelihood = r4
            r7.updateHistoricalEcho(r8)
            X.5b3 r2 = r7.voiceService
            java.lang.Integer r0 = r2.A0k
            r8.endCallAfterConfirmation = r0
            java.lang.Integer r0 = r2.A0n
            r8.presentEndCallConfirmation = r0
            java.lang.Integer r0 = r8.callAecMode
            r5 = 0
            r12 = 1
            if (r0 == 0) goto L_0x0118
            int r1 = r0.intValue()
            r0 = 3
            if (r1 == r0) goto L_0x012f
            java.lang.Object r0 = r2.A0v
            if (r0 == 0) goto L_0x0116
            goto L_0x0109
        L_0x00fc:
            r2 = r4
            goto L_0x0069
        L_0x00ff:
            int r0 = r9.getMode()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            goto L_0x0051
        L_0x0109:
            android.media.audiofx.AcousticEchoCanceler r0 = (android.media.audiofx.AcousticEchoCanceler) r0     // Catch:{ all -> 0x0112 }
            boolean r0 = r0.getEnabled()     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x0116
            goto L_0x012f
        L_0x0112:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0116:
            r0 = 0
            goto L_0x0130
        L_0x0118:
            java.lang.Object r0 = r2.A0v
            if (r0 == 0) goto L_0x0136
            android.media.audiofx.AcousticEchoCanceler r0 = (android.media.audiofx.AcousticEchoCanceler) r0     // Catch:{ all -> 0x0123 }
            boolean r0 = r0.getEnabled()     // Catch:{ all -> 0x0123 }
            goto L_0x0128
        L_0x0123:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 0
        L_0x0128:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.builtinAecEnabled = r0
            goto L_0x0136
        L_0x012f:
            r0 = 1
        L_0x0130:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.builtinAecEnabled = r0
        L_0x0136:
            if (r9 == 0) goto L_0x015d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0159 }
            java.lang.String r0 = "voip/AudioManager PROPERTY_OUTPUT_SAMPLE_RATE = "
            r1.append(r0)     // Catch:{ all -> 0x0159 }
            java.lang.String r0 = "android.media.property.OUTPUT_SAMPLE_RATE"
            java.lang.String r0 = r9.getProperty(r0)     // Catch:{ all -> 0x0159 }
            r1.append(r0)     // Catch:{ all -> 0x0159 }
            java.lang.String r0 = ", PROPERTY_OUTPUT_FRAMES_PER_BUFFER = "
            r1.append(r0)     // Catch:{ all -> 0x0159 }
            java.lang.String r0 = "android.media.property.OUTPUT_FRAMES_PER_BUFFER"
            java.lang.String r0 = r9.getProperty(r0)     // Catch:{ all -> 0x0159 }
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x0159 }
            goto L_0x015d
        L_0x0159:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x015d:
            java.lang.Integer r0 = r11.A03
            if (r0 == 0) goto L_0x0177
            int r1 = r0.intValue()
            r0 = 4
            if (r1 != r0) goto L_0x0177
            X.5b3 r0 = r7.voiceService
            boolean r0 = r0.A1Q
            if (r0 == 0) goto L_0x0177
            long r0 = r11.A02
            double r2 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r8.pushToCallOfferDelay = r0
        L_0x0177:
            boolean r0 = r6.isCaller
            r3 = 18
            if (r0 == 0) goto L_0x019b
            X.5b3 r0 = r7.voiceService
            int r2 = r0.A3M
            r0 = 13
            r1 = 14
            if (r2 != r0) goto L_0x0774
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r8.callResult = r0
            r25 = 1
        L_0x018f:
            X.5b3 r0 = r7.voiceService
            int r0 = r0.A02
            if (r0 <= 0) goto L_0x019b
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r8.callOfferDelayT = r0
        L_0x019b:
            boolean r0 = r6.videoEnabled
            r1 = 2
            if (r0 == 0) goto L_0x01f3
            java.lang.String r0 = android.os.Build.HARDWARE
            r8.deviceHardware = r0
            java.lang.String r0 = android.os.Build.BOARD
            r8.deviceBoard = r0
            X.5b3 r0 = r7.voiceService
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r0.A38
            int r2 = r0.getCameraStartMode()
            r0 = -1
            if (r2 == r0) goto L_0x0770
            if (r2 == 0) goto L_0x076a
            if (r2 == r12) goto L_0x0764
            if (r2 == r1) goto L_0x075e
            java.lang.Integer r0 = X.C18300x5.A0Z()
        L_0x01bd:
            r8.cameraStartMode = r0
        L_0x01bf:
            X.5b3 r0 = r7.voiceService
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r0.A38
            boolean r0 = r0.isCameraTextureApiFailed()
            int r0 = X.C18280x3.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.cameraPreviewMode = r0
            X.5b3 r0 = r7.voiceService
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r0.A38
            int r0 = r0.getCurrentApiVersion()
            if (r0 != r1) goto L_0x074e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x01df:
            r8.androidCameraApi = r0
        L_0x01e1:
            if (r29 == 0) goto L_0x01f3
            X.5b3 r0 = r7.voiceService
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r0.A38
            int r0 = r0.getCachedCam2HardwareLevel()
            if (r0 < 0) goto L_0x01f3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.androidCamera2MinHardwareSupportLevel = r0
        L_0x01f3:
            r4 = 0
            if (r29 == 0) goto L_0x034e
            X.5b3 r1 = r7.voiceService
            int r0 = r1.A03
            if (r0 <= 0) goto L_0x0203
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r8.groupCallVideoMaximizedCount = r0
        L_0x0203:
            r1.A0F()
            X.5b3 r10 = r7.voiceService
            long r0 = r10.A0C
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0214
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.androidSystemPictureInPictureT = r0
        L_0x0214:
            X.2NF r3 = r10.A0W
            if (r3 == 0) goto L_0x022a
            boolean r0 = r6.isCaller
            if (r0 == 0) goto L_0x022a
            long r0 = r3.A00
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            long r0 = X.C86654Ky.A08(r3, r2, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.offerAckLatencyMs = r0
        L_0x022a:
            X.2NF r3 = r10.A0S
            if (r3 == 0) goto L_0x023c
            long r0 = r3.A00
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            long r0 = X.C86654Ky.A08(r3, r2, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.acceptAckLatencyMs = r0
        L_0x023c:
            java.lang.Long r0 = r10.A0q
            if (r0 == 0) goto L_0x0242
            r8.pytorchEdgeLibAvgLoadingTime = r0
        L_0x0242:
            boolean r0 = r10.A1O
            if (r0 == 0) goto L_0x024e
            long r0 = com.whatsapp.pytorch.WhatsAppDynamicPytorchLoader.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.pytorchEdgeLibFirstLoadingTime = r0
        L_0x024e:
            boolean r0 = r6.isCaller
            if (r0 != 0) goto L_0x0264
            long r2 = r11.A00
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0264
            long r0 = r11.A01
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 >= 0) goto L_0x0264
            java.lang.Long r0 = X.C18310x6.A0f(r0, r2)
            r8.calleeOfferToRingT = r0
        L_0x0264:
            java.lang.Integer r0 = r8.callResult
            if (r0 == 0) goto L_0x034e
            int r1 = r0.intValue()
            if (r1 == r12) goto L_0x0272
            r0 = 10
            if (r1 != r0) goto L_0x034e
        L_0x0272:
            X.2sH r0 = r10.A2X
            long r2 = r0.A0H()
            X.5b3 r0 = r7.voiceService
            X.5Xv r0 = r0.A1l
            android.content.SharedPreferences r0 = r0.A03()
            java.lang.String r11 = "previous_call_peer_id"
            java.lang.String r0 = X.C18280x3.A0Z(r0, r11)
            com.whatsapp.jid.UserJid r15 = X.AnonymousClass32Y.A08(r0)
            X.5b3 r0 = r7.voiceService
            X.5Xv r0 = r0.A1l
            android.content.SharedPreferences r0 = r0.A03()
            java.lang.String r10 = "previous_call_end_time"
            long r0 = r0.getLong(r10, r4)
            if (r15 == 0) goto L_0x02ea
            int r13 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r13 <= 0) goto L_0x02ea
            int r13 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r13 <= 0) goto L_0x02ea
            X.5b3 r13 = r7.voiceService
            X.5Xv r13 = r13.A1l
            android.content.SharedPreferences r14 = r13.A03()
            java.lang.String r13 = "previous_call_video_enabled"
            boolean r13 = X.C18280x3.A1W(r14, r13)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r8.previousCallVideoEnabled = r13
            com.whatsapp.jid.UserJid r13 = X.C86644Kx.A0X(r6)
            boolean r13 = r15.equals(r13)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r8.previousCallWithSamePeer = r13
            java.lang.Long r13 = X.C18310x6.A0f(r2, r0)
            r8.previousCallInterval = r13
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VoiceService:fieldstatsReady previous call callInfo: interval "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = ", video enabled "
            r1.append(r0)
            java.lang.Boolean r0 = r8.previousCallVideoEnabled
            r1.append(r0)
            java.lang.String r0 = ", with same peer "
            r1.append(r0)
            java.lang.Boolean r0 = r8.previousCallWithSamePeer
            X.C18260x0.A0o(r0, r1)
        L_0x02ea:
            java.lang.Integer r0 = r8.callResult
            int r0 = r0.intValue()
            if (r0 != r12) goto L_0x034e
            X.5b3 r0 = r7.voiceService
            X.5Xv r0 = r0.A1l
            r19 = r0
            boolean r13 = r6.videoEnabled
            com.whatsapp.jid.UserJid r16 = X.C86644Kx.A0X(r6)
            java.lang.String r0 = r6.tsLogCallId
            r18 = r0
            java.lang.String r0 = r6.relayCallUuid
            r17 = r0
            java.lang.String r1 = r6.selfParticipantUuid
            java.lang.StringBuilder r15 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "setPreviousCallInfo callEndTime "
            r15.append(r0)
            r15.append(r2)
            java.lang.String r0 = ", video enabled "
            r15.append(r0)
            r15.append(r13)
            java.lang.String r14 = ", peerId "
            r0 = r16
            X.C18260x0.A1R(r15, r14, r0)
            android.content.SharedPreferences$Editor r0 = X.C106155Xv.A00(r19)
            android.content.SharedPreferences$Editor r2 = r0.putLong(r10, r2)
            java.lang.String r0 = "previous_call_video_enabled"
            android.content.SharedPreferences$Editor r2 = r2.putBoolean(r0, r13)
            java.lang.String r0 = r16.getRawString()
            android.content.SharedPreferences$Editor r3 = r2.putString(r11, r0)
            java.lang.String r2 = "previous_call_tslog_call_id"
            r0 = r18
            android.content.SharedPreferences$Editor r3 = r3.putString(r2, r0)
            java.lang.String r2 = "previous_relay_call_uuid"
            r0 = r17
            android.content.SharedPreferences$Editor r2 = r3.putString(r2, r0)
            java.lang.String r0 = "previous_self_participant_uuid"
            X.C18270x1.A0j(r2, r0, r1)
        L_0x034e:
            java.lang.Integer r0 = r8.callTermReason
            if (r0 == 0) goto L_0x035f
            int r1 = r0.intValue()
            r0 = 10
            if (r1 != r0) goto L_0x035f
            java.lang.String r0 = "VoiceService: call end because detect some peer's identity is changed!"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x035f:
            X.5b3 r2 = r7.voiceService
            java.lang.Long r0 = r2.A0u
            if (r0 == 0) goto L_0x0367
            r8.wifiRssiAtCallStart = r0
        L_0x0367:
            java.lang.String r1 = r6.callId
            java.lang.String r0 = r8.callRandomId
            java.lang.String r2 = r2.A0A(r1, r0)
            r8.callRandomId = r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VoiceService:fieldstatsReady callRandomId: "
            X.C18260x0.A0s(r0, r2, r1)
            if (r29 != 0) goto L_0x05bb
            X.5b3 r0 = r7.voiceService
            X.5Z0 r1 = r0.A2C
            r0 = r25
            r1.A02(r8, r0)
        L_0x0385:
            java.lang.Integer r0 = r8.fieldStatsRowType
            if (r0 == 0) goto L_0x0560
            int r1 = r0.intValue()
            if (r1 == r12) goto L_0x0392
            r0 = 2
            if (r1 != r0) goto L_0x0560
        L_0x0392:
            X.5b3 r0 = r7.voiceService
            X.8y5 r0 = r0.A34
            boolean r0 = r0.BIo()
            if (r0 == 0) goto L_0x04ce
            X.5b3 r1 = r7.voiceService
            X.5Z0 r0 = r1.A2C
            r20 = r0
            X.5TU r10 = r1.A1z
            X.5Ta r14 = r10.A0K
            boolean r0 = r14.A02
            r19 = r0
            X.5Ta r13 = r10.A0N
            boolean r0 = r13.A02
            r18 = r0
            X.5Ta r11 = r10.A0J
            boolean r15 = r11.A02
            r14.A00()
            r11.A00()
            X.4sk r9 = new X.4sk
            r9.<init>()
            long r0 = r14.A00
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x03cb
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.A0A = r0
        L_0x03cb:
            int r0 = r10.A05
            if (r0 <= 0) goto L_0x03d5
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r9.A08 = r0
        L_0x03d5:
            long r0 = r11.A00
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x03e1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.A09 = r0
        L_0x03e1:
            if (r29 == 0) goto L_0x04aa
            long r0 = r10.A0C
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x03ef
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.A0D = r0
        L_0x03ef:
            long r0 = r10.A0D
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x03fb
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.A0E = r0
        L_0x03fb:
            long r2 = r10.A0A
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0412
            long r0 = r10.A0E
            int r16 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r16 <= 0) goto L_0x0412
            r16 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r16
            long r2 = r2 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r9.A03 = r0
        L_0x0412:
            long r0 = r10.A0B
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x041e
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.A04 = r0
        L_0x041e:
            boolean r0 = r10.A0H
            if (r0 == 0) goto L_0x042b
            int r1 = r10.A08
            X.59E r0 = X.AnonymousClass59E.CALL_ENDED
            int r0 = r0.value
            r1 = r1 | r0
            r10.A08 = r1
        L_0x042b:
            int r0 = r10.A08
            if (r0 <= 0) goto L_0x0435
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r9.A0C = r0
        L_0x0435:
            long r0 = r10.A0F
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0441
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.A0F = r0
        L_0x0441:
            int r0 = r10.A02
            if (r0 <= 0) goto L_0x044b
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r9.A05 = r0
        L_0x044b:
            int r0 = r10.A04
            if (r0 <= 0) goto L_0x0455
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r9.A06 = r0
        L_0x0455:
            r13.A00()
            long r0 = r13.A00
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0464
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.A0B = r0
        L_0x0464:
            int r0 = r10.A06
            if (r0 <= 0) goto L_0x046e
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r9.A0H = r0
        L_0x046e:
            int r0 = r10.A07
            if (r0 <= 0) goto L_0x0478
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r9.A0I = r0
        L_0x0478:
            int r0 = r10.A09
            if (r0 <= 0) goto L_0x0482
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r9.A0G = r0
        L_0x0482:
            boolean r0 = r10.A0I
            if (r0 == 0) goto L_0x048c
            java.lang.Long r0 = X.AnonymousClass0x2.A0U()
            r9.A07 = r0
        L_0x048c:
            int r0 = r10.A00
            if (r0 <= 0) goto L_0x0496
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r9.A00 = r0
        L_0x0496:
            int r0 = r10.A01
            if (r0 <= 0) goto L_0x04a0
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r9.A01 = r0
        L_0x04a0:
            int r0 = r10.A03
            if (r0 <= 0) goto L_0x04aa
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r9.A02 = r0
        L_0x04aa:
            r0 = 0
            r10.A05 = r0
            r14.A01()
            r11.A01()
            if (r29 == 0) goto L_0x04b8
            r10.A00()
        L_0x04b8:
            if (r19 == 0) goto L_0x04bd
            r14.A02()
        L_0x04bd:
            if (r18 == 0) goto L_0x04c2
            r13.A02()
        L_0x04c2:
            if (r15 == 0) goto L_0x04c7
            r11.A02()
        L_0x04c7:
            r0 = r20
            X.4FV r0 = r0.A01
            r0.BhD(r9)
        L_0x04ce:
            X.5b3 r0 = r7.voiceService
            X.1VX r0 = r0.A2o
            int r1 = X.C86664Kz.A0J(r0)
            r0 = 4
            if (r1 < r0) goto L_0x0560
            boolean r0 = r6.videoEnabled
            if (r0 == 0) goto L_0x0560
            X.5Lb r0 = r6.self
            boolean r1 = r0.A0K
            if (r1 == 0) goto L_0x04e5
            r4 = 1
        L_0x04e5:
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r8.landscapeModeEnabled = r0
            if (r1 == 0) goto L_0x0560
            X.5b3 r0 = r7.voiceService
            X.7Ob r4 = r0.A1w
            X.5Ta r10 = r4.A03
            boolean r14 = r10.A02
            X.5Ta r9 = r4.A04
            boolean r13 = r9.A02
            X.5Ta r5 = r4.A05
            boolean r11 = r5.A02
            r10.A00()
            r9.A00()
            r5.A00()
            long r0 = r4.A02
            r2 = 0
            int r15 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r15 <= 0) goto L_0x0514
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.landscapeModeSwitchCount = r0
        L_0x0514:
            long r0 = r4.A01
            int r15 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r15 <= 0) goto L_0x0520
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.landscapeModeLockedSwitchCount = r0
        L_0x0520:
            long r0 = r10.A00
            int r15 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r15 <= 0) goto L_0x052c
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.landscapeModeDurationT = r0
        L_0x052c:
            long r0 = r9.A00
            int r15 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r15 <= 0) goto L_0x0538
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.landscapeModeLockedDurationT = r0
        L_0x0538:
            long r0 = r5.A00
            int r15 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r15 <= 0) goto L_0x0544
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.landscapeModePipMixedDurationT = r0
        L_0x0544:
            r4.A02 = r2
            r4.A01 = r2
            r10.A01()
            r9.A01()
            r5.A01()
            if (r14 == 0) goto L_0x0556
            r10.A02()
        L_0x0556:
            if (r13 == 0) goto L_0x055b
            r9.A02()
        L_0x055b:
            if (r11 == 0) goto L_0x0560
            r5.A02()
        L_0x0560:
            java.lang.Integer r0 = r8.fieldStatsRowType
            if (r0 == 0) goto L_0x0587
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto L_0x0587
            com.whatsapp.jid.GroupJid r1 = r6.groupJid
            if (r1 == 0) goto L_0x0587
            boolean r0 = r6.isPhashBasedCall()
            if (r0 == 0) goto L_0x0587
            X.5b3 r0 = r7.voiceService
            X.3Lq r0 = r0.A2q
            X.2sj r0 = r0.A0b
            int r0 = X.C86664Kz.A0H(r0, r1)
            if (r0 <= 0) goto L_0x05b5
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r8.numInvitedParticipants = r0
        L_0x0587:
            boolean r0 = r6.isCaller
            if (r0 != 0) goto L_0x05af
            X.5b3 r0 = r7.voiceService
            X.2sK r1 = r0.A2P
            com.whatsapp.jid.UserJid r0 = r6.getPeerJid()
            boolean r0 = r1.A0B(r0)
            java.lang.Boolean r0 = X.C18320x8.A0V(r0)
            r8.privacyUnknownCaller = r0
            com.whatsapp.jid.GroupJid r1 = r6.groupJid
            if (r1 == 0) goto L_0x05af
            X.5b3 r0 = r7.voiceService
            X.2sD r0 = r0.A32
            int r0 = r0.A00(r1)
            if (r0 != r12) goto L_0x05af
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r8.privacyUnknownCaller = r0
        L_0x05af:
            X.5b3 r0 = r7.voiceService
            r0.A0U(r8)
            return
        L_0x05b5:
            java.lang.String r0 = "VoiceService:fieldstatsReady groupMembersCount error"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0587
        L_0x05bb:
            X.5b3 r2 = r7.voiceService
            java.lang.Boolean r1 = r2.A0g
            if (r1 == 0) goto L_0x05c7
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L_0x0632
        L_0x05c7:
            if (r9 == 0) goto L_0x0632
            boolean r0 = r2.A0r(r9)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A0g = r0
        L_0x05d3:
            X.5b3 r1 = r7.voiceService
            boolean r0 = r1.A1H
            if (r0 == 0) goto L_0x0629
            r0 = 18
        L_0x05db:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.callTermReason = r0
        L_0x05e1:
            if (r9 == 0) goto L_0x05f3
            X.5Lb r0 = r6.self
            boolean r0 = r0.A0C
            if (r0 != 0) goto L_0x05f3
            boolean r0 = r9.isMicrophoneMute()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.isOsMicrophoneMute = r0
        L_0x05f3:
            X.5b3 r2 = r7.voiceService
            int r0 = r2.A06
            if (r0 != 0) goto L_0x05fe
            boolean r1 = r2.A1B
            r0 = 0
            if (r1 == 0) goto L_0x05ff
        L_0x05fe:
            r0 = 1
        L_0x05ff:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.pstnCallExists = r0
            X.7Me r0 = r2.A1n
            boolean r0 = r0.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.connectedToCar = r0
            X.5NO r0 = r2.A1o
            X.1VX r1 = r0.A02
            r0 = 1756(0x6dc, float:2.46E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0707
            r0 = 3359(0xd1f, float:4.707E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0707
            X.5b3 r0 = r7.voiceService
            X.5ZG r2 = r0.A1p
            monitor-enter(r2)
            goto L_0x0635
        L_0x0629:
            int r1 = r1.A3M
            r0 = 31
            if (r1 != r0) goto L_0x05e1
            r0 = 21
            goto L_0x05db
        L_0x0632:
            r8.androidAudioRouteMismatch = r1
            goto L_0x05d3
        L_0x0635:
            X.4sm r0 = r2.A01     // Catch:{ all -> 0x0782 }
            if (r0 == 0) goto L_0x063e
            r1 = 0
            r0 = 2
            r2.A05(r0, r1)     // Catch:{ all -> 0x0782 }
        L_0x063e:
            long r0 = r2.A00     // Catch:{ all -> 0x0782 }
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x064a
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0782 }
            r8.switchToAvatarDisplayedCount = r0     // Catch:{ all -> 0x0782 }
        L_0x064a:
            java.util.List r3 = r2.A04     // Catch:{ all -> 0x0782 }
            boolean r0 = X.C18310x6.A1X(r3)     // Catch:{ all -> 0x0782 }
            if (r0 == 0) goto L_0x0656
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0782 }
            r8.avatarAttempted = r0     // Catch:{ all -> 0x0782 }
        L_0x0656:
            r22 = 0
            r20 = 0
            r18 = 0
            r16 = 0
            r14 = 0
            java.util.Iterator r13 = r3.iterator()     // Catch:{ all -> 0x0782 }
        L_0x0664:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0782 }
            if (r0 == 0) goto L_0x069e
            java.lang.Object r11 = r13.next()     // Catch:{ all -> 0x0782 }
            X.4sm r11 = (X.C95194sm) r11     // Catch:{ all -> 0x0782 }
            java.lang.Integer r0 = r11.A03     // Catch:{ all -> 0x0782 }
            r9 = 1
            if (r0 == 0) goto L_0x0664
            int r1 = r0.intValue()     // Catch:{ all -> 0x0782 }
            if (r1 != r12) goto L_0x0692
            long r22 = r22 + r9
            java.lang.Long r0 = r11.A0G     // Catch:{ all -> 0x0782 }
            if (r0 == 0) goto L_0x0688
            long r0 = r0.longValue()     // Catch:{ all -> 0x0782 }
            long r16 = r16 + r0
        L_0x0688:
            java.lang.Long r0 = r11.A08     // Catch:{ all -> 0x0782 }
            if (r0 == 0) goto L_0x0664
            long r0 = r0.longValue()     // Catch:{ all -> 0x0782 }
            long r14 = r14 + r0
            goto L_0x0664
        L_0x0692:
            r0 = 3
            if (r1 != r0) goto L_0x0698
            long r20 = r20 + r9
            goto L_0x0664
        L_0x0698:
            r0 = 2
            if (r1 != r0) goto L_0x0664
            long r18 = r18 + r9
            goto L_0x0664
        L_0x069e:
            int r0 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x06ac
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0782 }
            r8.avatarEnabled = r0     // Catch:{ all -> 0x0782 }
            java.lang.Long r0 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x0782 }
            r8.avatarEnabledCount = r0     // Catch:{ all -> 0x0782 }
        L_0x06ac:
            int r0 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x06ba
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0782 }
            r8.avatarFailed = r0     // Catch:{ all -> 0x0782 }
            java.lang.Long r0 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x0782 }
            r8.avatarFailedCount = r0     // Catch:{ all -> 0x0782 }
        L_0x06ba:
            int r0 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x06c8
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0782 }
            r8.avatarCanceled = r0     // Catch:{ all -> 0x0782 }
            java.lang.Long r0 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x0782 }
            r8.avatarCanceledCount = r0     // Catch:{ all -> 0x0782 }
        L_0x06c8:
            int r0 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x06d2
            java.lang.Long r0 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0782 }
            r8.avatarLoadingT = r0     // Catch:{ all -> 0x0782 }
        L_0x06d2:
            int r0 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x06dc
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0782 }
            r8.avatarDurationT = r0     // Catch:{ all -> 0x0782 }
        L_0x06dc:
            java.util.List r1 = X.C73723fy.A0F(r3)     // Catch:{ all -> 0x0782 }
            r2.A00 = r4     // Catch:{ all -> 0x0782 }
            r0 = 0
            r2.A01 = r0     // Catch:{ all -> 0x0782 }
            r3.clear()     // Catch:{ all -> 0x0782 }
            monitor-exit(r2)
            X.5b3 r0 = r7.voiceService
            X.5Z0 r9 = r0.A2C
            java.lang.String r3 = r8.callRandomId
            java.util.Iterator r2 = r1.iterator()
        L_0x06f3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0707
            java.lang.Object r1 = r2.next()
            X.4sm r1 = (X.C95194sm) r1
            r1.A0H = r3
            X.4FV r0 = r9.A01
            r0.BhB(r1)
            goto L_0x06f3
        L_0x0707:
            X.5b3 r1 = r7.voiceService
            java.lang.Long r0 = r1.A0r
            r8.scheduledCallJoinTimeDiffMs = r0
            r1.A0b = r8
            r0 = r25
            r1.A1T = r0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VoiceService:fieldstatsReady call ending. callFieldStat will be posted when call/link state change to None. callOfferElapsedTimeInMillisOnServer: "
            r1.append(r0)
            java.lang.Long r0 = r8.callOfferElapsedT
            X.C18260x0.A0o(r0, r1)
            java.lang.Integer r0 = r8.callFromUi
            if (r0 == 0) goto L_0x0385
            int r1 = r0.intValue()
            r0 = 45
            if (r1 == r0) goto L_0x074c
            r0 = 46
            if (r1 != r0) goto L_0x0385
            r3 = 8
        L_0x0733:
            java.lang.String r2 = r8.callRandomId
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r8.videoEnabled
            boolean r0 = r1.equals(r0)
            X.4rh r1 = X.C107305b5.A03(r2, r3, r0, r12)
            X.5b3 r0 = r7.voiceService
            X.5Z0 r0 = r0.A2C
            X.4FV r0 = r0.A01
            r0.BhD(r1)
            goto L_0x0385
        L_0x074c:
            r3 = 7
            goto L_0x0733
        L_0x074e:
            X.5b3 r0 = r7.voiceService
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r0.A38
            int r0 = r0.getCurrentApiVersion()
            if (r0 != r12) goto L_0x01e1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            goto L_0x01df
        L_0x075e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x01bd
        L_0x0764:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            goto L_0x01bd
        L_0x076a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            goto L_0x01bd
        L_0x0770:
            r8.cameraStartMode = r4
            goto L_0x01bf
        L_0x0774:
            X.5b3 r0 = r7.voiceService
            int r0 = r0.A3M
            if (r0 != r1) goto L_0x018f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r8.callResult = r0
            goto L_0x018f
        L_0x0782:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.VoiceServiceEventCallback.fieldstatsReady(com.whatsapp.fieldstats.events.WamCall, java.lang.String, boolean, boolean):void");
    }

    public byte[] getByteBuffer(int i) {
        byte[] bArr;
        AnonymousClass7IW r3 = this.bufferQueue;
        synchronized (r3) {
            Iterator it = r3.A01.iterator();
            while (true) {
                if (!it.hasNext()) {
                    int i2 = r3.A00 + i;
                    r3.A00 = i2;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append(AnonymousClass000.A0O(r3));
                    A0o.append(" allocating buffer of length ");
                    A0o.append(i);
                    C18260x0.A0w(", total allocated ", A0o, i2);
                    bArr = new byte[i];
                    break;
                }
                bArr = (byte[]) it.next();
                if (bArr.length >= i) {
                    it.remove();
                    break;
                }
            }
        }
        return bArr;
    }

    public void groupCallBufferHandleMessages() {
        Log.i("VoiceService EVENT:groupCallBufferProcessMessages");
        C86624Kv.A1S(this.voiceService.A13, 11);
    }

    public void groupInfoChanged() {
        int i;
        Log.i("VoiceService EVENT:groupInfoChanged");
        CallInfo callInfo = Voip.getCallInfo();
        boolean z = true;
        if (callInfo == null) {
            z = false;
        } else if (callInfo.callState != CallState.NONE) {
            boolean A0X = this.voiceService.A2o.A0X(6525);
            C107285b3 r0 = this.voiceService;
            if (A0X) {
                C614830y r4 = r0.A21;
                r4.A0C.execute(new C70183a5(r4, 21, callInfo));
            } else {
                AnonymousClass3ZF A04 = r0.A21.A04(callInfo.callId);
                int i2 = 100;
                if (A04 != null) {
                    AnonymousClass39J r1 = A04.A0E;
                    UserJid userJid = r1.A01;
                    if (userJid.equals(C56972sr.A04(this.voiceService.A1e)) && callInfo.getPeerJid() != null && !userJid.equals(callInfo.getPeerJid())) {
                        C56762sW r8 = this.voiceService.A2h;
                        UserJid A0X2 = C86644Kx.A0X(callInfo);
                        if (A04.A0I != null || !r1.A03) {
                            z = false;
                        }
                        AnonymousClass3ZF A03 = r8.A03(new AnonymousClass39J(r1.A00, A0X2, r1.A02, z), A04);
                        C102995Lb r02 = (C102995Lb) callInfo.participants.get(callInfo.getPeerJid());
                        UserJid peerJid = callInfo.getPeerJid();
                        if (r02 != null && r02.A02 == 1 && (this.voiceService.A0t(A04) || C627436k.A0G(this.voiceService.A2o))) {
                            i2 = 5;
                        } else if (!A04.A0T(callInfo.getPeerJid())) {
                            i2 = 2;
                        }
                        A03.A0I(peerJid, i2);
                        this.voiceService.A2h.A07(A03);
                    } else if (this.voiceService.A0t(A04) || C627436k.A0G(this.voiceService.A2o)) {
                        Iterator A0v = AnonymousClass001.A0v(callInfo.participants);
                        while (A0v.hasNext()) {
                            C102995Lb A13 = C86664Kz.A13(A0v);
                            UserJid userJid2 = A13.A08;
                            if (A13.A02 == 1) {
                                i = 5;
                            } else {
                                i = 2;
                                if (A04.A0T(userJid2)) {
                                    i = 100;
                                }
                            }
                            A04.A0I(userJid2, i);
                        }
                        this.voiceService.A2h.A06(A04);
                    }
                }
            }
            C86624Kv.A0p(this.voiceService.A0H, this, 25);
            return;
        }
        C626936e.A0D(z, " CallInfo should not be null in groupInfoChanged callback");
    }

    public void handleAcceptFailed() {
        C86634Kw.A1P(this, "VoiceService EVENT:handleAcceptFailed");
    }

    public void handleCallLinkLobbyError(int i) {
        Message obtainMessage = this.voiceService.A0H.obtainMessage(44);
        obtainMessage.arg1 = i;
        obtainMessage.sendToTarget();
    }

    public void handleFDLeakDetected() {
        Log.i("VoiceService EVENT:handleFDLeakDetected");
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        Iterator A0q = AnonymousClass000.A0q(allStackTraces);
        while (A0q.hasNext()) {
            Thread thread = (Thread) AnonymousClass001.A0w(A0q).getKey();
            StringBuilder A0A = C18330xA.A0A("thread_dump name=");
            A0A.append(thread.getName());
            A0A.append(" state=");
            A0A.append(thread.getState());
            A0A.append(" tid=");
            A0A.append(thread.getId());
            A0A.append(" ");
            Log.log(3, AnonymousClass000.A0R(thread.getClass(), A0A));
        }
        StringBuilder A0A2 = C18330xA.A0A("\n");
        A0A2.append("thread_dump total threads count = ");
        A0A2.append(allStackTraces.size());
        Log.log(3, AnonymousClass000.A0X("\n", A0A2));
        this.voiceService.A1b.A0A("VoiceServiceEventCallback/handleFDLeakDetected", true, "voip/transport/handleFDLeakDetected");
    }

    public void handleOfferAckFailed() {
        C86634Kw.A1P(this, "VoiceService EVENT:handleOfferAckFailed");
    }

    public void handlePreAcceptFailed() {
        C86634Kw.A1P(this, "VoiceService EVENT:handlePreAcceptFailed");
    }

    public void highDataUsageDetected() {
        C86664Kz.A0d(this, "VoiceService EVENT:highDataUsageDetected").obtainMessage(54).sendToTarget();
    }

    public void interruptionStateChanged() {
        C86664Kz.A0d(this, "VoiceService EVENT:interruptionStateChanged").removeMessages(30);
        this.voiceService.A0H.obtainMessage(30).sendToTarget();
        C106645Zu.A00(this.voiceService.A29, "refresh_notification");
    }

    public void lobbyTimeout() {
        Log.i("VoiceService EVENT:lobbyTimeout");
        CallState currentCallState = Voip.getCurrentCallState();
        if (currentCallState == CallState.REJOINING || currentCallState == CallState.PRECALLING) {
            this.voiceService.A0P(28, (String) null);
        } else if (this.voiceService.A2L.A02()) {
            CallLinkInfo callLinkInfo = Voip.getCallLinkInfo();
            C626936e.A06(callLinkInfo);
            int i = callLinkInfo.linkState;
            if (i == 1 || i == 2) {
                handleCallLinkLobbyError(21);
            }
        }
    }

    public void mediaStreamError() {
        C86634Kw.A1P(this, "VoiceService EVENT:mediaStreamError");
    }

    public void mediaStreamStartError() {
        C86634Kw.A1P(this, "VoiceService EVENT:mediaStreamStartError");
    }

    public void missingRelayInfo() {
        Log.i("VoiceService EVENT:missingRelayInfo");
    }

    public void muteRequestFailed(UserJid userJid) {
        C86664Kz.A0d(this, "VoiceService EVENT:muteRequestFailed").removeMessages(43);
        Message message = new Message();
        message.what = 43;
        message.obj = userJid;
        this.voiceService.A0H.sendMessage(message);
    }

    public void muteStateChanged() {
        C86624Kv.A0p(C86664Kz.A0d(this, "VoiceService EVENT:muteStateChanged"), this, 32);
        C116985rC r1 = this.voiceService.A1Z;
        if (r1.A07()) {
            C65213Gq r12 = (C65213Gq) r1.A04();
            if (AnonymousClass2OK.A00(r12.A01)) {
                Log.d("InstrumentationObserverImpl/muteStateChanged");
                for (C56262rh A00 : r12.A02.A00()) {
                    A00.A00();
                }
            }
        }
    }

    public void mutedByOthers(UserJid userJid) {
        C86664Kz.A0d(this, "VoiceService EVENT:mutedByOthers").removeMessages(41);
        Message message = new Message();
        message.what = 41;
        message.obj = userJid;
        this.voiceService.A0H.sendMessage(message);
    }

    public void offerPeekTimeout() {
        Log.i("VoiceService EVENT:offerPeekTimeout");
        C107285b3 r0 = this.voiceService;
        r0.A0H.obtainMessage(49, 32, 0, r0.A1W.getString(R.string.f11nameremoved)).sendToTarget();
    }

    public void p2pNegotaitionFailed() {
        Log.i("VoiceService EVENT:p2pNegotaitionFailed");
    }

    public void p2pNegotiationSuccess() {
        Log.i("VoiceService EVENT:p2pNegotiationSuccess");
    }

    public void p2pTransportCreateFailed() {
        C86634Kw.A1P(this, "VoiceService EVENT:p2pTransportCreateFailed");
    }

    public void p2pTransportRestartSuccess() {
        Log.i("VoiceService EVENT:p2pTransportRestartSuccess");
    }

    public void p2pTransportStartFailed() {
        C86634Kw.A1P(this, "VoiceService EVENT:p2pTransportStartFailed");
    }

    public void relayCreateSuccess() {
        Log.i("VoiceService EVENT:relayCreateSuccess");
    }

    public void relayLatencySendFailed() {
        Log.i("VoiceService EVENT:relayLatencySendFailed");
    }

    public void removeUserFailed(UserJid userJid) {
        Log.i("VoiceService EVENT:removeUserAckedOrNacked");
        this.voiceService.A12.remove(userJid);
        Message.obtain(this.voiceService.A0H, 47, userJid).sendToTarget();
    }

    public void restartCamera() {
        Handler handler;
        Log.i("VoiceService EVENT:restartCamera");
        C185888uP r0 = this.voiceService.A0X;
        if (r0 != null && (handler = ((VoipActivityV2) r0).A1C.A01) != null) {
            handler.sendEmptyMessage(2);
        }
    }

    public void rtcpByeReceived() {
        Log.i("VoiceService EVENT:rtcpByeReceived");
        this.voiceService.A0P(18, (String) null);
    }

    public void rxTimeout() {
        Log.i("VoiceService EVENT:rxTimeout");
        this.voiceService.A0P(5, (String) null);
    }

    public void rxTrafficStarted() {
        Log.i("VoiceService EVENT:rxTrafficStarted");
    }

    public void rxTrafficStateForPeerChanged() {
        C86624Kv.A0p(C86664Kz.A0d(this, "VoiceService EVENT:rxTrafficStateForPeerChanged"), this, 33);
    }

    public void rxTrafficStopped() {
        boolean isPowerSaveMode;
        boolean z = this.voiceService.A1a.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VoiceService EVENT:rxTrafficStopped.  powerSavingMode: ");
        PowerManager A0J = this.voiceService.A2W.A0J();
        if (A0J == null) {
            Log.w("voip/service/start pm=null");
            isPowerSaveMode = false;
        } else {
            isPowerSaveMode = A0J.isPowerSaveMode();
        }
        A0o.append(isPowerSaveMode);
        A0o.append(", isAppInForeground: ");
        A0o.append(z);
        A0o.append(", screenLocked: ");
        C18260x0.A1V(A0o, this.voiceService.A1M);
    }

    public void sendAcceptFailed() {
        Log.i("VoiceService EVENT:sendAcceptFailed");
        this.voiceService.A27.A03();
    }

    public void sendOfferFailed() {
        Log.i("VoiceService EVENT:sendOfferFailed");
    }

    public void showLonelyStateNotification(CallInfo callInfo, int i) {
        C107285b3 r0 = this.voiceService;
        r0.A2Z.A0A(callInfo.callId, 51, r0.A1x.A00(r0.A1W, C58962w6.A00(callInfo, i, r0.A1L), this.voiceService.A29, 1, false));
    }

    public void soundPortCreateFailed() {
        C86634Kw.A1P(this, "VoiceService EVENT:soundPortCreateFailed");
    }

    public void syncDevices(SyncDevicesUserInfo[] syncDevicesUserInfoArr) {
        Log.i("VoiceService EVENT:syncDevices");
        ArrayList A0s = AnonymousClass001.A0s();
        for (SyncDevicesUserInfo syncDevicesUserInfo : syncDevicesUserInfoArr) {
            if (!this.voiceService.A2m.A0J(syncDevicesUserInfo.jid, syncDevicesUserInfo.phash)) {
                A0s.add(syncDevicesUserInfo.jid);
            }
        }
        if (!A0s.isEmpty()) {
            this.voiceService.A2R.A01((UserJid[]) A0s.toArray(new UserJid[0]), 4);
        }
    }

    public void transportCandSendFailed() {
        Log.i("VoiceService EVENT:transportCandSendFailed");
    }

    public void txTimeout() {
        Log.i("VoiceService EVENT:txTimeout");
        this.voiceService.A0P(6, (String) null);
    }

    public void updateHistoricalEcho(WamCall wamCall) {
        Long l;
        float f;
        if (wamCall != null && wamCall.callAecMode != null && wamCall.callEchoLikelihoodBeforeEc != null && (l = wamCall.callT) != null && l.intValue() >= 10000) {
            float f2 = this.voiceService.A1l.A03().getFloat("pref_hist_echo", -1.0f);
            float floatValue = wamCall.callEchoLikelihoodBeforeEc.floatValue();
            if (floatValue < 0.0f || floatValue > 100.0f) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("voip/updateHistoricalEcho wrong new Echo: ");
                A0o.append(floatValue);
                C18280x3.A13(A0o);
                return;
            }
            int intValue = wamCall.callAecMode.intValue();
            boolean z = true;
            if (intValue == 1 || intValue == 2) {
                if (f2 < 0.0f) {
                    f = floatValue;
                } else {
                    f = (f2 * 0.5f) + (0.5f * floatValue);
                }
                if (f < 0.0f || f > 100.0f) {
                    z = false;
                }
                C626936e.A0D(z, "echo should be in the range of 0 to 100");
                C106155Xv.A01(this).putFloat("pref_hist_echo", f).apply();
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("voip/updateHistoricalEcho histEcho: ");
                A0o2.append(f2);
                A0o2.append(", newEcho: ");
                A0o2.append(floatValue);
                A0o2.append(", updated: ");
                A0o2.append(f);
                C18280x3.A14(A0o2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateSettingsFromVoipParamsAfterHandlingSignaling(boolean r8) {
        /*
            r7 = this;
            java.lang.String r0 = "test.name"
            java.lang.String r3 = com.whatsapp.voipcalling.Voip.A06(r0)
            if (r3 == 0) goto L_0x0022
            X.5b3 r0 = r7.voiceService
            X.3Er r2 = r0.A2p
            X.33p r0 = r2.A07
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "voip_call_ab_test_bucket"
            X.C18270x1.A0j(r1, r0, r3)
            X.4AF r0 = r2.A0A
            X.C57302tQ.A01(r0, r3)
            long r0 = android.os.SystemClock.uptimeMillis()
            r2.A0F = r0
        L_0x0022:
            java.lang.String r0 = "options.spam_call_threshold_seconds"
            java.lang.Integer r0 = com.whatsapp.voipcalling.Voip.A01(r0)
            if (r0 == 0) goto L_0x0032
            X.5b3 r1 = r7.voiceService
            int r0 = r0.intValue()
            r1.A05 = r0
        L_0x0032:
            X.5b3 r1 = r7.voiceService
            java.lang.String r0 = "options.android_audio_mode_in_call"
            java.lang.Integer r0 = com.whatsapp.voipcalling.Voip.A01(r0)
            r1.A0h = r0
            java.lang.String r0 = "options.audio_level_adjust"
            java.lang.Integer r0 = com.whatsapp.voipcalling.Voip.A01(r0)
            if (r0 == 0) goto L_0x004c
            X.5b3 r1 = r7.voiceService
            int r0 = r0.intValue()
            r1.A07 = r0
        L_0x004c:
            X.5b3 r0 = r7.voiceService
            X.1VX r1 = r0.A2o
            r0 = 5527(0x1597, float:7.745E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0061
            X.5b3 r0 = r7.voiceService
            X.2ZQ r1 = r0.A1u
            X.6x6 r0 = X.C142376x6.OPUS_MLOW
            r1.A00(r0)
        L_0x0061:
            X.5b3 r0 = r7.voiceService
            X.1VX r1 = r0.A2o
            r0 = 5989(0x1765, float:8.392E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0076
            X.5b3 r0 = r7.voiceService
            X.2ZQ r1 = r0.A1u
            X.6x6 r0 = X.C142376x6.AOM
            r1.A00(r0)
        L_0x0076:
            java.lang.String r0 = "vid_rc.cc_enable_ml_plc_inference"
            java.lang.Integer r6 = com.whatsapp.voipcalling.Voip.A01(r0)
            java.lang.String r0 = "vid_rc.cc_enable_ml_undershoot_inference"
            java.lang.Integer r5 = com.whatsapp.voipcalling.Voip.A01(r0)
            java.lang.String r0 = "vid_rc.enable_ptedge_lib_loading"
            java.lang.Integer r4 = com.whatsapp.voipcalling.Voip.A01(r0)
            java.lang.String r0 = "vid_rc.cc_ml_pytorch_load_mode"
            java.lang.Integer r2 = com.whatsapp.voipcalling.Voip.A01(r0)
            r3 = 0
            r1 = 1
            if (r4 == 0) goto L_0x0098
            int r0 = r4.intValue()
            if (r0 == r1) goto L_0x00a8
        L_0x0098:
            if (r6 == 0) goto L_0x00a0
            int r0 = r6.intValue()
            if (r0 == r1) goto L_0x00a8
        L_0x00a0:
            if (r5 == 0) goto L_0x00dd
            int r0 = r5.intValue()
            if (r0 != r1) goto L_0x00dd
        L_0x00a8:
            boolean r0 = com.whatsapp.pytorch.WhatsAppDynamicPytorchLoader.A01
            if (r0 != 0) goto L_0x00cd
            X.5b3 r0 = r7.voiceService
            r0.A1O = r1
            if (r2 == 0) goto L_0x027e
            int r0 = r2.intValue()
            if (r0 == 0) goto L_0x027e
            if (r0 != r1) goto L_0x00cd
            java.lang.String r0 = "Load Pytorch library at Voip setting update with a background thread"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.5b3 r0 = r7.voiceService
            X.4FS r2 = r0.A35
            r1 = 12
            X.8Lw r0 = new X.8Lw
            r0.<init>(r1)
            r2.BkM(r0)
        L_0x00cd:
            X.5b3 r2 = r7.voiceService
            java.lang.Long r0 = r2.A0q
            if (r0 != 0) goto L_0x00dd
            if (r3 == 0) goto L_0x027a
            long r0 = com.whatsapp.pytorch.WhatsAppDynamicPytorchLoader.A00
        L_0x00d7:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0q = r0
        L_0x00dd:
            java.lang.String r0 = "vid_driver.camera_width"
            java.lang.Integer r2 = com.whatsapp.voipcalling.Voip.A01(r0)
            java.lang.String r0 = "vid_driver.camera_height"
            java.lang.Integer r1 = com.whatsapp.voipcalling.Voip.A01(r0)
            if (r2 == 0) goto L_0x024e
            if (r1 == 0) goto L_0x024e
            X.5b3 r0 = r7.voiceService
            X.5Xv r0 = r0.A1l
            int r3 = r2.intValue()
            int r2 = r1.intValue()
            android.content.SharedPreferences$Editor r1 = X.C106155Xv.A00(r0)
            java.lang.String r0 = "video_call_front_camera_width"
            android.content.SharedPreferences$Editor r1 = r1.putInt(r0, r3)
            java.lang.String r0 = "video_call_front_camera_height"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r2)
        L_0x0109:
            r0.apply()
        L_0x010c:
            java.lang.String r0 = "vid_driver.back_camera_width"
            java.lang.Integer r2 = com.whatsapp.voipcalling.Voip.A01(r0)
            java.lang.String r0 = "vid_driver.back_camera_height"
            java.lang.Integer r1 = com.whatsapp.voipcalling.Voip.A01(r0)
            if (r2 == 0) goto L_0x0222
            if (r1 == 0) goto L_0x0222
            X.5b3 r0 = r7.voiceService
            X.5Xv r0 = r0.A1l
            int r3 = r2.intValue()
            int r2 = r1.intValue()
            android.content.SharedPreferences$Editor r1 = X.C106155Xv.A00(r0)
            java.lang.String r0 = "video_call_back_camera_width"
            android.content.SharedPreferences$Editor r1 = r1.putInt(r0, r3)
            java.lang.String r0 = "video_call_back_camera_height"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r2)
        L_0x0138:
            r0.apply()
        L_0x013b:
            java.lang.String r0 = "options.portrait_mode_threshold"
            java.lang.Integer r1 = com.whatsapp.voipcalling.Voip.A01(r0)
            if (r1 == 0) goto L_0x0216
            X.5b3 r0 = r7.voiceService
            X.5Xv r0 = r0.A1l
            int r2 = r1.intValue()
            android.content.SharedPreferences$Editor r1 = X.C106155Xv.A00(r0)
            java.lang.String r0 = "portrait_mode_threshold"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r2)
        L_0x0155:
            r0.apply()
            java.lang.String r0 = "options.landscape_mode_threshold"
            java.lang.Integer r1 = com.whatsapp.voipcalling.Voip.A01(r0)
            if (r1 == 0) goto L_0x020a
            X.5b3 r0 = r7.voiceService
            X.5Xv r0 = r0.A1l
            int r2 = r1.intValue()
            android.content.SharedPreferences$Editor r1 = X.C106155Xv.A00(r0)
            java.lang.String r0 = "landscape_mode_threshold"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r2)
        L_0x0172:
            r0.apply()
            java.lang.String r0 = "options.enable_vqm"
            java.lang.Boolean r1 = com.whatsapp.voipcalling.Voip.A00(r0)
            if (r1 == 0) goto L_0x01ff
            X.5b3 r0 = r7.voiceService
            X.5Xv r0 = r0.A1l
            boolean r2 = r1.booleanValue()
            android.content.SharedPreferences$Editor r1 = X.C106155Xv.A00(r0)
            java.lang.String r0 = "enable_vid_quality_manager"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
        L_0x018f:
            r0.apply()
            if (r8 == 0) goto L_0x01e3
            java.lang.String r0 = "options.disable_device_specific_camera_size"
            java.lang.Boolean r1 = com.whatsapp.voipcalling.Voip.A00(r0)
            if (r1 == 0) goto L_0x01f4
            X.5b3 r0 = r7.voiceService
            X.5Xv r0 = r0.A1l
            boolean r2 = r1.booleanValue()
            android.content.SharedPreferences$Editor r1 = X.C106155Xv.A00(r0)
            java.lang.String r0 = "disable_device_specific_camera_size"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
        L_0x01ae:
            r0.apply()
            java.lang.String r0 = "options.android_camera2_support_level"
            java.lang.String r2 = com.whatsapp.voipcalling.Voip.A06(r0)
            android.content.SharedPreferences$Editor r1 = X.C106155Xv.A01(r7)
            java.lang.String r0 = "camera2_required_hardware_support_level"
            if (r2 == 0) goto L_0x01ef
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)
        L_0x01c3:
            r0.apply()
            java.lang.String r0 = "options.force_passive_capture_dev_stream_role"
            java.lang.Boolean r1 = com.whatsapp.voipcalling.Voip.A00(r0)
            if (r1 == 0) goto L_0x01e4
            X.5b3 r0 = r7.voiceService
            X.5Xv r0 = r0.A1l
            boolean r2 = r1.booleanValue()
            android.content.SharedPreferences$Editor r1 = X.C106155Xv.A00(r0)
            java.lang.String r0 = "force_passive_capture_dev_stream_role"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
        L_0x01e0:
            r0.apply()
        L_0x01e3:
            return
        L_0x01e4:
            android.content.SharedPreferences$Editor r1 = X.C106155Xv.A01(r7)
            java.lang.String r0 = "force_passive_capture_dev_stream_role"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x01e0
        L_0x01ef:
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x01c3
        L_0x01f4:
            android.content.SharedPreferences$Editor r1 = X.C106155Xv.A01(r7)
            java.lang.String r0 = "disable_device_specific_camera_size"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x01ae
        L_0x01ff:
            android.content.SharedPreferences$Editor r1 = X.C106155Xv.A01(r7)
            java.lang.String r0 = "enable_vid_quality_manager"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x018f
        L_0x020a:
            android.content.SharedPreferences$Editor r1 = X.C106155Xv.A01(r7)
            java.lang.String r0 = "landscape_mode_threshold"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x0172
        L_0x0216:
            android.content.SharedPreferences$Editor r1 = X.C106155Xv.A01(r7)
            java.lang.String r0 = "portrait_mode_threshold"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x0155
        L_0x0222:
            X.5b3 r0 = r7.voiceService
            X.5Xv r1 = r0.A1l
            android.content.SharedPreferences r0 = r1.A03()
            java.lang.String r2 = "video_call_back_camera_width"
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x023e
            android.content.SharedPreferences r1 = r1.A03()
            java.lang.String r0 = "video_call_back_camera_height"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x013b
        L_0x023e:
            android.content.SharedPreferences$Editor r0 = X.C106155Xv.A01(r7)
            android.content.SharedPreferences$Editor r1 = r0.remove(r2)
            java.lang.String r0 = "video_call_back_camera_height"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x0138
        L_0x024e:
            X.5b3 r0 = r7.voiceService
            X.5Xv r1 = r0.A1l
            android.content.SharedPreferences r0 = r1.A03()
            java.lang.String r2 = "video_call_front_camera_width"
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x026a
            android.content.SharedPreferences r1 = r1.A03()
            java.lang.String r0 = "video_call_front_camera_height"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x010c
        L_0x026a:
            android.content.SharedPreferences$Editor r0 = X.C106155Xv.A01(r7)
            android.content.SharedPreferences$Editor r1 = r0.remove(r2)
            java.lang.String r0 = "video_call_front_camera_height"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            goto L_0x0109
        L_0x027a:
            r0 = 0
            goto L_0x00d7
        L_0x027e:
            java.lang.String r0 = "Load Pytorch library at Voip setting update"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            com.whatsapp.pytorch.WhatsAppDynamicPytorchLoader.A00()
            r3 = 1
            goto L_0x00cd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.VoiceServiceEventCallback.updateSettingsFromVoipParamsAfterHandlingSignaling(boolean):void");
    }

    public void userRemoved(UserJid userJid, UserJid userJid2) {
        Log.i("VoiceService EVENT:userRemoved");
        if (AnonymousClass75J.A00(C56972sr.A04(this.voiceService.A1e), userJid2)) {
            C626936e.A06(userJid);
            C107285b3 r0 = this.voiceService;
            r0.A1I = true;
            String A0h = C18300x5.A0h(this.voiceService.A2Q, r0.A2O.A0A(userJid));
            C107285b3 r02 = this.voiceService;
            Message obtainMessage = r02.A0H.obtainMessage(49, C86614Ku.A0s(r02.A1W, A0h, new Object[1], R.string.f11nameremoved));
            obtainMessage.arg1 = 29;
            obtainMessage.sendToTarget();
            return;
        }
        Message obtain = Message.obtain(this.voiceService.A0H, 51, userJid2);
        if (this.voiceService.A12.contains(userJid2)) {
            obtain.arg1 = 1;
            this.voiceService.A12.remove(userJid2);
        }
        this.voiceService.A0H.sendMessage(obtain);
    }

    public void videoCaptureStarted() {
        Log.i("VoiceService EVENT:videoCaptureStarted");
    }

    public void videoCodecMismatch() {
        Log.i("VoiceService EVENT:videoCodecMismatch");
        this.voiceService.A1d.A0E(R.string.f11nameremoved);
    }

    public void videoCodecStateChanged() {
        C86624Kv.A0p(C86664Kz.A0d(this, "VoiceService EVENT:videoCodecStateChanged"), this, 15);
    }

    public void videoDecodeFatalError() {
        Log.i("VoiceService EVENT:videoDecodeFatalError");
    }

    public void videoDecodePaused() {
        C86624Kv.A0p(C86664Kz.A0d(this, "VoiceService EVENT:videoDecodePaused"), this, 15);
    }

    public void videoDecodeResumed() {
        C86624Kv.A0p(C86664Kz.A0d(this, "VoiceService EVENT:videoDecodeResumed"), this, 15);
    }

    public void videoDecodeStarted() {
        Log.i("VoiceService EVENT:videoDecodeStarted");
    }

    public void videoEncodeFatalError() {
        Log.i("VoiceService EVENT:videoEncodeFatalError");
    }

    public void videoPortCreateFailed() {
        Log.i("VoiceService EVENT:videoPortCreateFailed");
        this.voiceService.A0P(17, (String) null);
    }

    public void videoPreviewError() {
        Log.i("VoiceService EVENT:videoPreviewError");
    }

    public void videoPreviewReady() {
        Log.i("VoiceService EVENT:videoPreviewReady");
    }

    public void videoRenderFormatChanged(UserJid userJid) {
        C18290x4.A1C(this.voiceService.A0H, userJid, 10);
    }

    public void videoStreamCreateError() {
        Log.i("VoiceService EVENT:videoStreamCreateError");
        this.voiceService.A0P(16, (String) null);
    }

    public void weakWifiSwitchedToCellular() {
        C86664Kz.A0d(this, "VoiceService EVENT:weakWifiSwitchedToCellular").sendEmptyMessage(35);
    }

    public void willCreateSoundPort() {
        Log.i("VoiceService EVENT:willCreateSoundPort");
    }

    public VoiceServiceEventCallback(C107285b3 r2, C46992cX r3) {
        this.voiceService = r2;
        this.httpsFormPostFactory = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        if (r1 == false) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void handleNonFatalOfferNack(java.util.List r9, int r10) {
        /*
            r8 = this;
            java.util.ArrayList r6 = X.AnonymousClass000.A0p(r9)
            java.util.Iterator r2 = r9.iterator()
        L_0x0008:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0026
            X.4uZ r1 = X.C18300x5.A0P(r2)
            X.5b3 r0 = r8.voiceService
            X.3Ex r0 = r0.A2O
            X.3ZH r1 = r0.A0A(r1)
            X.5b3 r0 = r8.voiceService
            X.5ZU r0 = r0.A2Q
            java.lang.String r0 = X.C18300x5.A0h(r0, r1)
            r6.add(r0)
            goto L_0x0008
        L_0x0026:
            X.5b3 r0 = r8.voiceService
            X.5ZU r0 = r0.A2Q
            r5 = 1
            X.33j r0 = r0.A03
            java.lang.String r7 = X.AnonymousClass5VS.A00(r0, r6, r5)
            r0 = 427(0x1ab, float:5.98E-43)
            r3 = 1
            r4 = 0
            if (r10 == r0) goto L_0x0095
            r0 = 428(0x1ac, float:6.0E-43)
            if (r10 == r0) goto L_0x008d
            r0 = 431(0x1af, float:6.04E-43)
            if (r10 == r0) goto L_0x0081
            r0 = 435(0x1b3, float:6.1E-43)
            if (r10 == r0) goto L_0x0066
            r0 = 538(0x21a, float:7.54E-43)
            if (r10 == r0) goto L_0x00e8
            java.lang.String r0 = "Unknown error code"
            X.C626936e.A0D(r4, r0)
            X.5b3 r0 = r8.voiceService
            X.33j r6 = r0.A2c
            r3 = 2131755415(0x7f100197, float:1.9141709E38)
        L_0x0053:
            int r0 = r9.size()
            long r0 = (long) r0
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r4] = r7
            java.lang.String r1 = r6.A0L(r2, r3, r0)
        L_0x0060:
            X.5b3 r0 = r8.voiceService
            r0.A0k(r1)
            return
        L_0x0066:
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            X.5b3 r0 = r8.voiceService
            android.content.Context r2 = r0.A1W
            if (r1 == 0) goto L_0x0079
            boolean r1 = r1.isAudioChat()
            r0 = 2131894552(0x7f122118, float:1.9423912E38)
            if (r1 != 0) goto L_0x007c
        L_0x0079:
            r0 = 2131894545(0x7f122111, float:1.9423898E38)
        L_0x007c:
            java.lang.String r1 = r2.getString(r0)
            goto L_0x0060
        L_0x0081:
            X.5b3 r0 = r8.voiceService
            android.content.Context r1 = r0.A1W
            r0 = 2131894544(0x7f122110, float:1.9423896E38)
            java.lang.String r1 = X.AnonymousClass0x2.A0X(r1, r7, r5, r0)
            goto L_0x0060
        L_0x008d:
            X.5b3 r0 = r8.voiceService
            android.content.Context r3 = r0.A1W
            r2 = 2131895295(0x7f1223ff, float:1.9425419E38)
            goto L_0x00d4
        L_0x0095:
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r1 == 0) goto L_0x00df
            int r0 = r9.size()
            if (r0 != r5) goto L_0x00c5
            java.lang.Object r0 = r9.get(r4)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            X.5Lb r2 = r1.getInfoByJid(r0)
        L_0x00ab:
            boolean r0 = r1.isGroupCall
            if (r0 == 0) goto L_0x00c7
            java.util.Map r0 = r1.participants
            int r1 = r0.size()
            r0 = 4
            if (r1 <= r0) goto L_0x00c7
            X.5b3 r1 = r8.voiceService
            if (r2 == 0) goto L_0x00c1
            boolean r0 = r2.A0H
            if (r0 == 0) goto L_0x00c1
            r3 = 6
        L_0x00c1:
            r1.A0p(r9, r3)
            return
        L_0x00c5:
            r2 = 0
            goto L_0x00ab
        L_0x00c7:
            if (r2 == 0) goto L_0x00df
            int r0 = r2.A02
            if (r0 != r5) goto L_0x00df
            X.5b3 r0 = r8.voiceService
            android.content.Context r3 = r0.A1W
            r2 = 2131895396(0x7f122464, float:1.9425624E38)
        L_0x00d4:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Object r0 = r6.get(r4)
            java.lang.String r1 = X.AnonymousClass002.A0F(r3, r0, r1, r4, r2)
            goto L_0x0060
        L_0x00df:
            X.5b3 r0 = r8.voiceService
            X.33j r6 = r0.A2c
            r3 = 2131755409(0x7f100191, float:1.9141696E38)
            goto L_0x0053
        L_0x00e8:
            X.5b3 r2 = r8.voiceService
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            r0 = 35
            r2.A0p(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.VoiceServiceEventCallback.handleNonFatalOfferNack(java.util.List, int):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$callCaptureBufferFilled$2(Voip.RecordingInfo[] recordingInfoArr, Voip.DebugTapType debugTapType, byte[] bArr, int i) {
        int ordinal = debugTapType.ordinal();
        Voip.RecordingInfo recordingInfo = recordingInfoArr[ordinal];
        if (recordingInfo == null) {
            recordingInfoArr[ordinal] = new Voip.RecordingInfo(this.voiceService.A1c, debugTapType);
            recordingInfo = recordingInfoArr[ordinal];
        }
        OutputStream outputStream = recordingInfo.outputStream;
        if (outputStream == null) {
            Log.e("voip/callCaptureBufferFilled/OutputStream/null");
        } else {
            try {
                outputStream.write(bArr, 0, i);
            } catch (IOException e) {
                Log.e((Throwable) e);
            }
            AnonymousClass7IW r1 = this.bufferQueue;
            synchronized (r1) {
                if (bArr != null) {
                    r1.A01.addFirst(bArr);
                }
            }
            if (recordingInfo.outputFile.length() >= 52428800) {
                Log.i("callCaptureBufferFilled stop recording due to exceeds file size limit");
            } else {
                return;
            }
        }
        Voip.stopCallRecording();
    }

    public static /* synthetic */ void lambda$callCaptureEnded$3(Voip.RecordingInfo[] recordingInfoArr, Voip.DebugTapType debugTapType) {
        OutputStream outputStream;
        Voip.RecordingInfo recordingInfo = recordingInfoArr[debugTapType.ordinal()];
        if (recordingInfo != null && (outputStream = recordingInfo.outputStream) != null) {
            try {
                outputStream.close();
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("VoiceService EVENT:callCaptureEnded ");
                A0o.append(recordingInfo.outputFile);
                A0o.append(" size ");
                C18260x0.A1I(A0o, recordingInfo.outputFile.length());
            } catch (IOException e) {
                Log.e((Throwable) e);
            }
        }
    }

    public void bCallAudienceUpdated(AudienceInfo audienceInfo) {
    }

    public void bCallCreateFailed(int i) {
    }

    public void bCallEnded(String str) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00aa, code lost:
        if (r6.isAudioChat() != false) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callMissed(java.lang.String r48, com.whatsapp.jid.UserJid r49, java.lang.String r50, java.lang.String r51, int r52, long r53, boolean r55, com.whatsapp.voipcalling.CallGroupInfo r56, boolean r57, boolean r58, boolean r59, com.whatsapp.jid.GroupJid r60, int r61, com.whatsapp.fieldstats.events.WamCall r62, long r63, boolean r65) {
        /*
            r47 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VoiceService EVENT:callMissed "
            r9 = r49
            X.C18260x0.A1R(r1, r0, r9)
            r5 = 1
            r2 = 0
            r10 = r56
            if (r56 == 0) goto L_0x00b0
            com.whatsapp.voipcalling.CallParticipant[] r0 = r10.participants
            int r0 = r0.length
            if (r0 <= 0) goto L_0x00b0
            int r15 = r10.transactionId
        L_0x0018:
            r4 = r47
            X.5b3 r0 = r4.voiceService
            X.1VX r1 = r0.A2o
            r0 = 6525(0x197d, float:9.143E-42)
            boolean r1 = r1.A0X(r0)
            X.5b3 r0 = r4.voiceService
            r8 = r60
            r25 = r59
            r24 = r58
            r26 = r65
            r17 = r52
            r20 = r63
            r13 = r50
            r7 = r62
            r12 = r48
            r16 = r61
            r14 = r51
            r18 = r53
            r22 = r55
            r23 = r57
            if (r1 == 0) goto L_0x0055
            X.30y r6 = r0.A21
            com.whatsapp.voipcalling.CallInfo r11 = com.whatsapp.voipcalling.Voip.getCallInfo()
            X.3dI r0 = r6.A0C
            X.3bi r5 = new X.3bi
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r22, r23, r24, r25, r26)
            r0.execute(r5)
        L_0x0054:
            return
        L_0x0055:
            X.30y r0 = r0.A21
            X.3ZF r3 = r0.A03(r9, r12, r15, r2)
            com.whatsapp.voipcalling.CallInfo r6 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r6 == 0) goto L_0x00ad
            X.7Ps r0 = r6.callWaitingInfo
            java.lang.String r0 = r0.A04
            boolean r41 = r12.equals(r0)
        L_0x0069:
            if (r3 == 0) goto L_0x0054
            X.5b3 r0 = r4.voiceService
            X.30y r2 = r0.A21
            if (r6 != 0) goto L_0x00a4
            r1 = 0
        L_0x0072:
            r5 = 0
        L_0x0073:
            r2.A07(r8, r3, r1, r5)
            r35 = 26
            if (r61 != 0) goto L_0x007c
            r35 = 4
        L_0x007c:
            X.5b3 r0 = r4.voiceService
            java.lang.Integer r31 = java.lang.Integer.valueOf(r17)
            r46 = 1
            r27 = r0
            r28 = r7
            r29 = r10
            r30 = r3
            r32 = r12
            r33 = r13
            r34 = r14
            r36 = r18
            r38 = r20
            r40 = r22
            r42 = r23
            r43 = r24
            r44 = r25
            r45 = r26
            r27.A0V(r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r40, r41, r42, r43, r44, r45, r46)
            return
        L_0x00a4:
            java.lang.String r1 = r6.scheduledId
            boolean r0 = r6.isAudioChat()
            if (r0 == 0) goto L_0x0072
            goto L_0x0073
        L_0x00ad:
            r41 = 0
            goto L_0x0069
        L_0x00b0:
            r15 = -1
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.VoiceServiceEventCallback.callMissed(java.lang.String, com.whatsapp.jid.UserJid, java.lang.String, java.lang.String, int, long, boolean, com.whatsapp.voipcalling.CallGroupInfo, boolean, boolean, boolean, com.whatsapp.jid.GroupJid, int, com.whatsapp.fieldstats.events.WamCall, long, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r7.isAudioChat() != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callOfferNacked(com.whatsapp.voipcalling.CallOfferAckError[] r12) {
        /*
            r11 = this;
            com.whatsapp.voipcalling.CallInfo r7 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r7 != 0) goto L_0x000c
            java.lang.String r0 = "we are not in a active call"
        L_0x0008:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x000c:
            if (r12 == 0) goto L_0x0027
            int r9 = r12.length
            if (r9 == 0) goto L_0x0027
            r10 = 0
            r6 = 1
            if (r9 != r6) goto L_0x002a
            r0 = r12[r10]
            int r1 = r0.errorCode
            r0 = 304(0x130, float:4.26E-43)
            if (r1 == r0) goto L_0x0021
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L_0x002a
        L_0x0021:
            java.lang.String r0 = "Server received duplicate offers. Just return"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0027:
            java.lang.String r0 = "Received offer nack without any errors"
            goto L_0x0008
        L_0x002a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VoiceService EVENT:callOfferNacked error: "
            X.C18260x0.A0y(r0, r1, r9)
            java.util.ArrayList r5 = X.AnonymousClass002.A0I(r9)
            java.util.Map r0 = r7.participants
            int r2 = r0.size()
            int r2 = r2 - r6
            r0 = r12[r10]
            int r4 = r0.errorCode
            java.lang.String r0 = r7.callLinkToken
            boolean r0 = X.AnonymousClass000.A1W(r0)
            if (r0 != 0) goto L_0x0051
            boolean r0 = r7.isAudioChat()
            r1 = 0
            if (r0 == 0) goto L_0x0052
        L_0x0051:
            r1 = 1
        L_0x0052:
            boolean r0 = r11.isSelfNacked(r12)
            if (r0 != 0) goto L_0x005c
            if (r1 != 0) goto L_0x0091
            if (r2 != r9) goto L_0x0091
        L_0x005c:
            r8 = 1
        L_0x005d:
            r3 = 0
        L_0x005e:
            r2 = r12[r3]
            int r1 = r2.errorCode
            r0 = 432(0x1b0, float:6.05E-43)
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            if (r8 != 0) goto L_0x006e
            if (r0 == 0) goto L_0x008f
            int r4 = r2.errorCode
        L_0x006e:
            r8 = 1
        L_0x006f:
            com.whatsapp.jid.UserJid r0 = r2.errorJid
            r5.add(r0)
            int r3 = r3 + 1
            if (r3 < r9) goto L_0x005e
            com.whatsapp.voipcalling.CallState r1 = r7.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r1 == r0) goto L_0x0082
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 != r0) goto L_0x0085
        L_0x0082:
            if (r8 == 0) goto L_0x0085
            r10 = 1
        L_0x0085:
            X.5b3 r0 = r11.voiceService
            r0.A16 = r6
            if (r10 == 0) goto L_0x0093
            r11.handleFatalOfferNack(r5, r4, r7)
            return
        L_0x008f:
            r8 = 0
            goto L_0x006f
        L_0x0091:
            r8 = 0
            goto L_0x005d
        L_0x0093:
            r11.handleNonFatalOfferNack(r5, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.VoiceServiceEventCallback.callOfferNacked(com.whatsapp.voipcalling.CallOfferAckError[]):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callRejectReceived(com.whatsapp.jid.UserJid r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VoiceService EVENT:callRejectReceived("
            r1.append(r0)
            java.lang.String r0 = X.C18260x0.A07(r11, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r3 == 0) goto L_0x0048
            boolean r0 = r3.isGroupCall
            r7 = 3
            java.lang.String r8 = "uncallable"
            java.lang.String r4 = "tos"
            java.lang.String r2 = "busy"
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L_0x008e
            X.5b3 r0 = r9.voiceService
            X.5ZU r1 = r0.A2Q
            X.3Ex r0 = r0.A2O
            X.3ZH r0 = r0.A0A(r10)
            java.lang.String r7 = X.C18300x5.A0h(r1, r0)
            int r0 = r11.hashCode()
            switch(r0) {
                case 0: goto L_0x007e;
                case 115032: goto L_0x005c;
                case 3035641: goto L_0x004e;
                case 1353979473: goto L_0x0049;
                default: goto L_0x0038;
            }
        L_0x0038:
            X.5b3 r0 = r9.voiceService
            android.content.Context r1 = r0.A1W
            r0 = 2131894544(0x7f122110, float:1.9423896E38)
        L_0x003f:
            java.lang.String r1 = X.AnonymousClass0x2.A0X(r1, r7, r6, r0)
        L_0x0043:
            X.5b3 r0 = r9.voiceService
            r0.A0k(r1)
        L_0x0048:
            return
        L_0x0049:
            boolean r0 = r11.equals(r8)
            goto L_0x0060
        L_0x004e:
            boolean r0 = r11.equals(r2)
            if (r0 == 0) goto L_0x0038
            X.5b3 r0 = r9.voiceService
            android.content.Context r1 = r0.A1W
            r0 = 2131892300(0x7f12184c, float:1.9419344E38)
            goto L_0x003f
        L_0x005c:
            boolean r0 = r11.equals(r4)
        L_0x0060:
            if (r0 == 0) goto L_0x0038
            boolean r1 = r3.videoEnabled
            X.5b3 r0 = r9.voiceService
            if (r1 == 0) goto L_0x006e
            android.content.Context r1 = r0.A1W
            r0 = 2131895422(0x7f12247e, float:1.9425677E38)
            goto L_0x003f
        L_0x006e:
            X.33j r4 = r0.A2c
            r3 = 2131755415(0x7f100197, float:1.9141709E38)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r5] = r7
            r0 = 1
            java.lang.String r1 = r4.A0L(r2, r3, r0)
            goto L_0x0043
        L_0x007e:
            java.lang.String r0 = ""
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0038
            X.5b3 r0 = r9.voiceService
            android.content.Context r1 = r0.A1W
            r0 = 2131895293(0x7f1223fd, float:1.9425415E38)
            goto L_0x003f
        L_0x008e:
            boolean r0 = r2.equals(r11)
            r2 = 0
            if (r0 == 0) goto L_0x00a8
            X.5b3 r0 = r9.voiceService
            r0.A1L = r6
            android.os.Handler r0 = r0.A0G
            r0.removeCallbacksAndMessages(r2)
            X.5b3 r0 = r9.voiceService
            android.os.Handler r2 = r0.A0G
            r0 = 30000(0x7530, double:1.4822E-319)
            r2.sendEmptyMessageDelayed(r7, r0)
            return
        L_0x00a8:
            boolean r0 = r8.equals(r11)
            r1 = 12
            if (r0 != 0) goto L_0x00bc
            boolean r0 = r4.equals(r11)
            if (r0 != 0) goto L_0x00bc
            X.5b3 r0 = r9.voiceService
            r0.A0P(r1, r2)
            return
        L_0x00bc:
            X.5b3 r0 = r9.voiceService
            r0.A0P(r1, r2)
            boolean r0 = r3.videoEnabled
            if (r0 == 0) goto L_0x00c7
            r5 = 11
        L_0x00c7:
            r9.showCallNotAllowedActivity((com.whatsapp.jid.UserJid) r10, (int) r5, (java.lang.String) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.VoiceServiceEventCallback.callRejectReceived(com.whatsapp.jid.UserJid, java.lang.String):void");
    }

    public void callWaitingStateChanged(int i) {
        String str;
        CallState callState;
        C18260x0.A0y("VoiceService EVENT:callWaitingStateChanged ", AnonymousClass001.A0o(), i);
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null) {
            str = callInfo.callWaitingInfo.A04;
            if (str != null) {
                C47852dw r3 = this.voiceService.A2E;
                if (i == 1) {
                    callState = CallState.RECEIVED_CALL;
                } else {
                    callState = CallState.NONE;
                }
                C162457s7.A0J(callState, 1);
                CallState callState2 = CallState.NONE;
                HashMap hashMap = r3.A00;
                if (callState == callState2) {
                    hashMap.remove(str);
                } else {
                    hashMap.put(str, callState);
                }
            }
        } else {
            str = null;
        }
        this.voiceService.A0H.removeMessages(34);
        this.voiceService.A0H.obtainMessage(34, i, 0, str).sendToTarget();
    }

    public void eventNotHandled(int i, String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Event ");
        A0o.append(str);
        A0o.append(" (code  ");
        A0o.append(i);
        this.voiceService.A0k(AnonymousClass000.A0X(") not handled", A0o));
    }

    public void groupParticipantLeft(UserJid userJid, String str, int i) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VoiceService EVENT:groupParticipantLeft ");
        A0o.append(userJid);
        A0o.append(" (");
        A0o.append(i);
        C18260x0.A1L(A0o, ")");
        if (i == 4) {
            if (str == null) {
                str = "";
            }
            callRejectReceived(userJid, str);
        }
    }

    public void handleAcceptAckFailed(String str, int i) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VoiceService EVENT:handleAcceptAckFailed, error_code = ");
        A0o.append(i);
        C18260x0.A0s("error_raw_device_jid: ", str, A0o);
        C107285b3 r2 = this.voiceService;
        int i2 = 26;
        if (i != 434) {
            i2 = 25;
        }
        r2.A0P(i2, (String) null);
    }

    public void handleCallFatal(CallFatalError callFatalError) {
        C107285b3 r1;
        int i;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VoiceService EVENT:handleCallFatal Reason: ");
        C18260x0.A1G(A0o, callFatalError.reasonCode);
        C55682qk r3 = this.voiceService.A1b;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("voip/callFatal Reason:");
        r3.A0A("VoiceServiceEventCallback/handleCallFatal", true, AnonymousClass000.A0h(A0o2, callFatalError.reasonCode));
        int i2 = callFatalError.reasonCode;
        if (i2 == 3) {
            this.voiceService.A0P(6, (String) null);
        } else if (i2 != 4) {
            if (i2 == 5) {
                r1 = this.voiceService;
                i = 16;
            } else if (i2 != 6) {
                C107285b3 r2 = this.voiceService;
                if (i2 != 7) {
                    r2.A0C();
                    return;
                } else {
                    r2.A0P(23, r2.A1W.getString(R.string.f11nameremoved));
                    return;
                }
            } else {
                r1 = this.voiceService;
                i = 17;
            }
            r1.A0P(i, (String) null);
        } else {
            this.voiceService.A0P(5, (String) null);
        }
    }

    public void handleVoipAssert(String str, int i) {
        String str2;
        String A0Y = AnonymousClass000.A0Y(":", AnonymousClass000.A0l(str), i);
        if (this.voiceService.A3K.add(A0Y)) {
            this.voiceService.A1b.A0A(AnonymousClass000.A0V("voip-assert:", str, AnonymousClass001.A0o()), false, A0Y);
            str2 = " (first occurence)";
        } else {
            str2 = "";
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VoipAssert at ");
        C18260x0.A0r(A0Y, str2, A0o);
    }

    public void heartbeatNacked(int i, String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VoiceService EVENT:heartbeatNacked callId: ");
        A0o.append(str);
        C18260x0.A0y(" errorCode:", A0o, i);
        if (str.equals(Voip.getCurrentCallId())) {
            this.voiceService.A0P(25, (String) null);
        }
    }

    public void joinableFieldstatsReady(WamJoinableCall wamJoinableCall, boolean z) {
        CallInfo A02 = C627436k.A02();
        if (A02 == null) {
            Log.e("VoiceService:joinableFieldstatsReady not in an active call");
            return;
        }
        AnonymousClass2TG A07 = this.voiceService.A07(A02.callId);
        String A0A = this.voiceService.A0A(A02.callId, wamJoinableCall.callRandomId);
        wamJoinableCall.callRandomId = A0A;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VoiceService EVENT:joinableFieldstatsReady callId:");
        A0o.append(A02.callId);
        A0o.append(" callRandomId:");
        A0o.append(A0A);
        A0o.append(" callSide:");
        A0o.append(wamJoinableCall.callSide);
        C18260x0.A1E(" realtime:", A0o, z);
        C107285b3 r7 = this.voiceService;
        int i = r7.A0l;
        boolean z2 = false;
        if (i == null) {
            if (r7.A09 == 0) {
                i = C18290x4.A0c();
            } else {
                C626936e.A0D(false, "Bug with tracking call lobby");
                r7 = this.voiceService;
                i = 0;
            }
            r7.A0l = i;
        }
        wamJoinableCall.lobbyEntryPoint = i;
        if (AnonymousClass75J.A00(wamJoinableCall.lobbyExit, AnonymousClass0x7.A0h())) {
            this.voiceService.A0l = 20;
        }
        C107285b3 r4 = this.voiceService;
        long j = r4.A09;
        if (j > 0) {
            wamJoinableCall.lobbyVisibleT = Long.valueOf(AnonymousClass0x9.A05(j));
        }
        if (r4.A1A) {
            wamJoinableCall.hasSpamDialog = Boolean.TRUE;
        }
        if (A07.A06) {
            wamJoinableCall.isRering = Boolean.TRUE;
        }
        Boolean bool = wamJoinableCall.isRejoin;
        if (bool != null && bool.booleanValue()) {
            AnonymousClass2NF r72 = r4.A0V;
            if (r72 != null) {
                long j2 = r72.A00;
                wamJoinableCall.lobbyAckLatencyMs = Long.valueOf(C86654Ky.A08(r72, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
            }
            AnonymousClass2NF r73 = r4.A0S;
            if (r73 != null) {
                long j3 = r73.A00;
                wamJoinableCall.acceptAckLatencyMs = Long.valueOf(C86654Ky.A08(r73, (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1)), j3));
            }
            long j4 = r4.A1l.A03().getLong("zombie_cleanup", 0);
            if (!(wamJoinableCall.lobbyExitNackCode == null || j4 == 0)) {
                wamJoinableCall.timeSinceLastClientPollMinutes = Long.valueOf(C18280x3.A08(System.currentTimeMillis(), j4) / 60);
            }
        }
        if (Build.VERSION.SDK_INT < 31 || this.voiceService.A2U.A00()) {
            z2 = true;
        }
        wamJoinableCall.hasScheduleExactAlarmPermission = Boolean.valueOf(z2);
        Boolean bool2 = wamJoinableCall.isLinkJoin;
        if (bool2 != null && bool2.booleanValue()) {
            C107285b3 r6 = this.voiceService;
            AnonymousClass2NF r5 = r6.A0U;
            if (r5 != null) {
                long j5 = r5.A00;
                wamJoinableCall.queryAckLatencyMs = Long.valueOf(C86654Ky.A08(r5, (j5 > 0 ? 1 : (j5 == 0 ? 0 : -1)), j5));
            }
            AnonymousClass2NF r52 = r6.A0T;
            if (r52 != null) {
                long j6 = r52.A00;
                wamJoinableCall.joinAckLatencyMs = Long.valueOf(C86654Ky.A08(r52, (j6 > 0 ? 1 : (j6 == 0 ? 0 : -1)), j6));
            }
        }
        AnonymousClass4FV r0 = this.voiceService.A2C.A01;
        r0.BhB(wamJoinableCall);
        if (z) {
            r0.BKX();
        }
    }

    public void linkCreateAcked(String str, boolean z) {
        String str2;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VoiceService EVENT:linkCreateAcked token: ");
        A0o.append(str);
        A0o.append(" media: ");
        if (z) {
            str2 = "video";
        } else {
            str2 = "audio";
        }
        C18260x0.A1L(A0o, str2);
        this.voiceService.A1d.A0S(new C70303aH(this, str, 1, z));
    }

    public void linkCreateNacked(int i) {
        C18260x0.A0y("VoiceService EVENT:linkCreateNacked errorCode:", AnonymousClass001.A0o(), i);
        C107285b3 r0 = this.voiceService;
        C69263Wi r2 = r0.A1d;
        C97064xZ r1 = r0.A1r;
        Objects.requireNonNull(r1);
        r2.A0S(C117695sL.A00(r1, 36));
    }

    public void linkJoinNacked(int i) {
        C18260x0.A0y("VoiceService EVENT:linkJoinNacked errorCode:", AnonymousClass001.A0o(), i);
        int i2 = 26;
        if (i != 400) {
            i2 = 22;
            if (i != 404) {
                i2 = 24;
                if (i != 428) {
                    i2 = 23;
                }
            }
        }
        handleCallLinkLobbyError(i2);
    }

    public void linkQueryNacked(int i) {
        C18260x0.A0y("VoiceService EVENT:linkQueryNacked errorCode:", AnonymousClass001.A0o(), i);
        int i2 = 26;
        if (i != 400) {
            i2 = 22;
            if (i != 404) {
                i2 = 24;
                if (i != 428) {
                    i2 = 23;
                }
            }
        }
        handleCallLinkLobbyError(i2);
    }

    public void lobbyNacked(int i, String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VoiceService EVENT:lobbyNacked callId: ");
        A0o.append(str);
        C18260x0.A0y(" errorCode:", A0o, i);
        if (str.equals(Voip.getCurrentCallId())) {
            this.voiceService.A0P(25, (String) null);
        }
    }

    public void lonelyStateTimeout(int i) {
        C18260x0.A0y("VoiceService EVENT:lonelyStateTimeout remainingDurationMs: ", AnonymousClass001.A0o(), i);
        CallInfo A02 = C627436k.A02();
        C626936e.A06(A02);
        if (i == 0) {
            C107285b3 r0 = this.voiceService;
            Message obtainMessage = r0.A0H.obtainMessage(49, r0.A1W.getString(R.string.f11nameremoved));
            obtainMessage.arg1 = 27;
            obtainMessage.sendToTarget();
            return;
        }
        showLonelyStateNotification(A02, (int) (((long) i) / 60000));
    }

    public void peerBatteryLevelLow(UserJid userJid) {
        C18260x0.A1R(AnonymousClass001.A0o(), "VoiceService EVENT:peerBatteryLevelLow, Jid:", userJid);
        C107285b3 r1 = this.voiceService;
        Message message = new Message();
        message.what = 19;
        message.obj = userJid;
        r1.A0H.sendMessageDelayed(message, 3000);
    }

    public void peerVideoStateChanged(int i) {
        C18260x0.A0y("VoiceService EVENT:peerVideoStateChanged ", AnonymousClass001.A0o(), i);
        this.voiceService.A0H.removeMessages(12);
        this.voiceService.A0H.obtainMessage(12, i, 0).sendToTarget();
        C116985rC r1 = this.voiceService.A1Z;
        if (r1.A07()) {
            C65213Gq r12 = (C65213Gq) r1.A04();
            if (AnonymousClass2OK.A00(r12.A01)) {
                Log.d("InstrumentationObserverImpl/peerVideoStateChanged");
                for (C56262rh A02 : r12.A02.A00()) {
                    A02.A02();
                }
            }
        }
    }

    public void playCallTone(int i) {
        C18260x0.A0y("VoiceService EVENT:playCallTone type:", AnonymousClass001.A0o(), i);
        Integer num = (Integer) AnonymousClass001.A0i(this.voiceService.A3I, i);
        C107285b3 r3 = this.voiceService;
        if (r3.A0F == null) {
            r3.A0F = new SoundPool(1, 0, 0);
        }
        this.voiceService.A0j(num, "callTone", 1.0f, 1.0f);
    }

    public void rejectedDecryptionFailure(String str, String str2, byte[] bArr, int i) {
        DeviceJid nullable = DeviceJid.getNullable(str);
        StringBuilder A0u = C18290x4.A0u(nullable);
        A0u.append("VoiceService EVENT:rejectedDecryptionFailure, Jid:");
        A0u.append(nullable);
        A0u.append(", callId:");
        A0u.append(str2);
        C18260x0.A0y(", retryCount:", A0u, i);
        this.voiceService.A3G.put(nullable, str2);
        if (!this.voiceService.A2D.A05(nullable, C627436k.A08(str2), bArr, i)) {
            this.voiceService.A0C();
        }
    }

    public void relayBindsFailed(boolean z) {
        C18260x0.A1E("VoiceService EVENT:relayBindsFailed self bad asn=", AnonymousClass001.A0o(), z);
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo == null) {
            Log.e("we are not in a active call");
            return;
        }
        this.voiceService.A1D = z;
        endCallWhenRelayBindFailed(callInfo);
    }

    public void screenShare(UserJid userJid, int i, int i2, int i3) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VoiceService EVENT:screenShare ");
        A0o.append(i);
        C18260x0.A1R(A0o, " for ", userJid);
        C18290x4.A1C(this.voiceService.A0H, new AnonymousClass7ZG(userJid, i, i2, i3), 52);
    }

    public void selfVideoStateChanged(int i) {
        C18260x0.A0y("VoiceService EVENT:selfVideoStateChanged ", AnonymousClass001.A0o(), i);
        this.voiceService.A0H.removeMessages(11);
        this.voiceService.A0H.obtainMessage(11, i, 0).sendToTarget();
    }

    public void sendJoinableClientPollCriticalEvent(int i) {
        C18260x0.A0y("VoiceService EVENT:sendJoinableClientPollCriticalEvent errorCode:", AnonymousClass001.A0o(), i);
        this.voiceService.A1b.A0A("linked-group-call/client-poll-nack", false, String.valueOf(i));
    }

    public void sendLinkedGroupCallDowngradedCriticalEvent(boolean z) {
        String str;
        C18260x0.A1E("VoiceService EVENT:sendLinkedGroupCallDowngradedCriticalEvent isPendingCall:", AnonymousClass001.A0o(), z);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("linked-group-call/downgrade-");
        if (z) {
            str = "pending-call";
        } else {
            str = "ongoing-call";
        }
        this.voiceService.A1b.A0A(AnonymousClass000.A0X(str, A0o), false, (String) null);
    }

    public void soundPortCreated(int i) {
        Object A04;
        Object A03;
        Object A02;
        C18260x0.A0y("VoiceService EVENT:soundPortCreated with engine type ", AnonymousClass001.A0o(), i);
        Integer A01 = Voip.A01("aec.builtin");
        C107285b3 r1 = this.voiceService;
        if (r1.A0v == null && A01 != null) {
            int intValue = A01.intValue();
            if (intValue == 2) {
                A02 = Voip.A02(r1.A37.previousAudioSessionId, true);
            } else if (intValue == 3) {
                A02 = Voip.A02(r1.A37.previousAudioSessionId, false);
            }
            r1.A0v = A02;
        }
        Integer A012 = Voip.A01("agc.builtin");
        C107285b3 r12 = this.voiceService;
        if (r12.A0w == null && A012 != null) {
            int intValue2 = A012.intValue();
            if (intValue2 == 2) {
                A03 = Voip.A03(r12.A37.previousAudioSessionId, true);
            } else if (intValue2 == 3) {
                A03 = Voip.A03(r12.A37.previousAudioSessionId, false);
            }
            r12.A0w = A03;
        }
        Integer A013 = Voip.A01("ns.builtin");
        C107285b3 r13 = this.voiceService;
        if (r13.A0x == null && A013 != null) {
            int intValue3 = A013.intValue();
            if (intValue3 == 2) {
                A04 = Voip.A04(r13.A37.previousAudioSessionId, true);
            } else if (intValue3 == 3) {
                A04 = Voip.A04(r13.A37.previousAudioSessionId, false);
            } else {
                return;
            }
            r13.A0x = A04;
        }
    }

    public void updateJoinableCallLog(int i, String str, UserJid userJid, boolean z, int i2, CallParticipant[] callParticipantArr, CallSummary callSummary) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VoiceService EVENT:updateJoinableCallLog updateType: ");
        int i3 = i;
        A0o.append(i);
        String str2 = str;
        C18260x0.A0s(" callId:", str, A0o);
        boolean A0X = this.voiceService.A2o.A0X(6525);
        C107285b3 r0 = this.voiceService;
        UserJid userJid2 = userJid;
        boolean z2 = z;
        int i4 = i2;
        CallParticipant[] callParticipantArr2 = callParticipantArr;
        CallSummary callSummary2 = callSummary;
        if (A0X) {
            C614830y r2 = r0.A21;
            r2.A0C.execute(new C70983bN(r2, userJid2, callParticipantArr2, callSummary2, str2, i4, i3, 0, z2));
            return;
        }
        r0.A35.BkP(new C70983bN(this, userJid2, callParticipantArr2, callSummary2, str2, i4, i3, 1, z2));
    }

    public void updateVoipSettings(boolean z) {
        C18260x0.A1E("VoiceService EVENT:updateVoipSettings isVideoCall: ", AnonymousClass001.A0o(), z);
        updateSettingsFromVoipParamsAfterHandlingSignaling(z);
    }

    public void videoPortCreated(UserJid userJid) {
        C18260x0.A1R(AnonymousClass001.A0o(), "VoiceService EVENT:videoPortCreated ", userJid);
        this.voiceService.A0H.obtainMessage(7).sendToTarget();
    }

    public void videoRenderStarted(UserJid userJid) {
        C18260x0.A1R(AnonymousClass001.A0o(), "VoiceService EVENT:videoRenderStarted ", userJid);
        C18290x4.A1C(this.voiceService.A0H, userJid, 8);
    }

    public void showCallNotAllowedActivity(UserJid userJid, int i, String str) {
        ArrayList A0I = AnonymousClass002.A0I(1);
        A0I.add(userJid);
        showCallNotAllowedActivity(A0I, i, str);
    }
}
