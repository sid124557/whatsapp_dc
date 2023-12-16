package com.whatsapp.voipcalling;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass1VX;
import X.AnonymousClass33p;
import X.AnonymousClass34G;
import X.AnonymousClass49P;
import X.AnonymousClass4C1;
import X.AnonymousClass4FS;
import X.AnonymousClass5ZR;
import X.C106155Xv;
import X.C113745lv;
import X.C117105rO;
import X.C159787mS;
import X.C172068Jm;
import X.C172578Lw;
import X.C18260x0;
import X.C18280x3;
import X.C187958y5;
import X.C52412lR;
import X.C54292oU;
import X.C56972sr;
import X.C57162tC;
import X.C60152y5;
import X.C620633i;
import X.C627336j;
import X.C627436k;
import X.C64393Dh;
import X.C66653Mg;
import X.C66663Mh;
import X.C86614Ku;
import X.C86664Kz;
import android.content.SharedPreferences;
import android.os.Build;
import com.whatsapp.calling.audio.VoipSystemAudioManager;
import com.whatsapp.calling.util.VoipFaceDetector;
import com.whatsapp.jid.Jid;
import com.whatsapp.pytorch.WhatsAppDynamicPytorchLoader;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.io.File;
import java.util.Arrays;
import java.util.Map;
import org.wawebrtc.MediaCodecVideoEncoder;

public class JNIUtils {
    public static final String[] H264_BLACKLISTED_DEVICE_BOARD = {"sc7735s", "PXA19x8", "SC7727S", "sc7730s", "SC7715A", "full_oppo6750_15331", "mt6577", "hawaii", "java", "arima89_we_s_jb2", "arima82_w_s_kk", "capri", "mt6572", "P7-L10", "P7-L12"};
    public static final String[] H264_BLACKLISTED_DEVICE_HARDWARE = {"my70ds", "sc8830", "sc8830a", "samsungexynos7580"};
    public final AnonymousClass1VX abProps;
    public final C113745lv bweMlModelManager;
    public final C52412lR deviceUtils;
    public final C64393Dh fMessageIO;
    public final AnonymousClass4C1 isPartialLandscapeModeSupported;
    public final AnonymousClass4C1 isVideoRotationSupportedProvider;
    public final C56972sr meManager;
    public final C66653Mg multiDeviceConfig;
    public int previousAudioSessionId = -1;
    public final C66663Mh serverProps;
    public final C60152y5 sharedPreferencesFactory;
    public final C187958y5 systemFeatures;
    public final C620633i systemServices;
    public final VoipCameraManager voipCameraManager;
    public final AnonymousClass49P voipNative;
    public final C106155Xv voipSharedPreferences;
    public final VoipSystemAudioManager voipSystemAudioManager;
    public final C54292oU waContext;
    public final C57162tC waDebugBuildSharedPreferences;
    public final AnonymousClass5ZR waPermissionsHelper;
    public final AnonymousClass33p waSharedPreferences;
    public final AnonymousClass4FS waWorkers;

    public static int getSamplingHash(int i, int[] iArr, int i2, int i3) {
        int length = iArr.length;
        int[] iArr2 = new int[(length + 4)];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        iArr2[length] = i2;
        iArr2[length + 1] = i;
        iArr2[length + 2] = Build.VERSION.SDK_INT;
        iArr2[length + 3] = i3;
        return Arrays.hashCode(iArr2);
    }

    private synchronized H26xSupportResult isH26XCodecSupported() {
        return new H26xSupportResult(isH264HwCodecSupported(), false, MediaCodecVideoEncoder.isH265HwSupported(), false);
    }

    public synchronized String getBweMLModelPath(String str) {
        String str2;
        C113745lv r3 = this.bweMlModelManager;
        Log.d("BweMLModelManager/getBweMlModelPath/get BWE ML model path start");
        Map map = C113745lv.A1i;
        if (!map.containsKey(str)) {
            C18260x0.A0r("BweMLModelManager/getBweMlModelPath/BWE ML model version not supported: ", str, AnonymousClass001.A0o());
            str2 = null;
        } else {
            Integer A01 = Voip.A01("vid_rc.cc_ml_pytorch_load_mode");
            if (!WhatsAppDynamicPytorchLoader.A01 && A01 != null) {
                int intValue = A01.intValue();
                if (intValue == 2) {
                    Log.d("BweMLModelManager/Load Pytorch library at get_model_path");
                    WhatsAppDynamicPytorchLoader.A00();
                } else if (intValue == 3) {
                    Log.d("BweMLModelManager/Load Pytorch library at get_model_path with a background thread");
                    r3.A02.BkM(new C172578Lw(13));
                }
            }
            str2 = r3.A01.A00(((Integer) map.get(str)).intValue());
            Log.d("BweMLModelManager/getBweMlModelPath/get BWE ML model path end");
        }
        return str2;
    }

    public synchronized H26xSupportResult isH26XCodecSupportedFromCache() {
        H26xSupportResult h26xSupportResult;
        SharedPreferences A03 = this.voipSharedPreferences.A03();
        if (!A03.contains("video_codec_h264_hw_supported") || !A03.contains("video_codec_h264_sw_supported") || !A03.contains("video_codec_h265_hw_supported") || !A03.contains("video_codec_h265_sw_supported")) {
            h26xSupportResult = null;
        } else {
            h26xSupportResult = new H26xSupportResult(A03.getBoolean("video_codec_h264_hw_supported", false), A03.getBoolean("video_codec_h264_sw_supported", false), A03.getBoolean("video_codec_h265_hw_supported", false), A03.getBoolean("video_codec_h265_sw_supported", false));
        }
        return h26xSupportResult;
    }

    public synchronized void updateH26XCodecSupported(boolean z) {
        if (z) {
            this.waWorkers.BkM(new C117105rO(this, 21));
        } else {
            this.voipSharedPreferences.A06(isH26XCodecSupported());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ba, code lost:
        if (r2 > 64000) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ed, code lost:
        if (r17 == null) goto L_0x020b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02ba A[LOOP:5: B:138:0x02b8->B:139:0x02ba, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02ae A[EDGE_INSN: B:154:0x02ae->B:137:0x02ae ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02c3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02a8 A[EDGE_INSN: B:159:0x02a8->B:135:0x02a8 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0119 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0119 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0119 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fd A[LOOP:2: B:47:0x00fb->B:48:0x00fd, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int[] findAvailableAudioSamplingRate(int[] r31, int r32, int r33) {
        /*
            r30 = this;
            java.lang.String r10 = ", audio source "
            java.lang.String r9 = ", buffer size "
            java.lang.String r23 = " works"
            java.lang.String r22 = " doesn't work"
            java.lang.String r8 = "voip/findAvailableAudioSamplingRate/sampling rate "
            r4 = r31
            int r3 = r4.length
            java.util.ArrayList r7 = X.AnonymousClass002.A0I(r3)
            r6 = r30
            X.5ZR r0 = r6.waPermissionsHelper
            boolean r13 = r0.A0D()
            r11 = 64000(0xfa00, float:8.9683E-41)
            r12 = 44100(0xac44, float:6.1797E-41)
            r1 = 8000(0x1f40, float:1.121E-41)
            r5 = 1
            r0 = 0
            r2 = r33
            if (r13 != 0) goto L_0x0035
            if (r2 < r1) goto L_0x0030
            if (r2 > r11) goto L_0x0030
            int[] r11 = new int[r5]
            r11[r0] = r33
            return r11
        L_0x0030:
            int[] r11 = new int[r5]
            r11[r0] = r12
            return r11
        L_0x0035:
            r0 = 2
            r15 = r32
            int r21 = getSamplingHash(r0, r4, r15, r2)
            X.5Xv r0 = r6.voipSharedPreferences
            android.content.SharedPreferences r12 = r0.A03()
            java.lang.String r20 = "audio_sampling_hash"
            r11 = -1
            r0 = r20
            int r11 = r12.getInt(r0, r11)
            r0 = r21
            if (r0 != r11) goto L_0x0094
            X.5Xv r0 = r6.voipSharedPreferences
            android.content.SharedPreferences r11 = r0.A03()
            java.lang.String r0 = "audio_sampling_rates"
            java.lang.String r13 = X.AnonymousClass0x9.A0v(r11, r0)
            r14 = 0
            int[] r11 = new int[r14]
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x0090
            int r12 = r13.length()
            r0 = 2
            if (r12 <= r0) goto L_0x0090
            int r12 = r12 - r5
            java.lang.String r0 = r13.substring(r5, r12)
            java.lang.String[] r13 = X.C18320x8.A1b(r0)
            int r12 = r13.length
            int[] r5 = new int[r12]
        L_0x0077:
            if (r14 >= r12) goto L_0x008f
            r0 = r13[r14]     // Catch:{ NumberFormatException -> 0x0088 }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x0088 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0088 }
            r5[r14] = r0     // Catch:{ NumberFormatException -> 0x0088 }
            int r14 = r14 + 1
            goto L_0x0077
        L_0x0088:
            r5 = move-exception
            java.lang.String r0 = "voip/VoipSharedPrefs/ "
            com.whatsapp.util.Log.e(r0, r5)
            goto L_0x0090
        L_0x008f:
            r11 = r5
        L_0x0090:
            int r0 = r11.length
            if (r0 != r15) goto L_0x0094
            return r11
        L_0x0094:
            java.util.ArrayList r5 = X.AnonymousClass002.A0I(r3)
            r0 = -1
            if (r2 != r0) goto L_0x00b4
            X.33i r0 = r6.systemServices     // Catch:{ all -> 0x00be }
            android.media.AudioManager r1 = r0.A0G()     // Catch:{ all -> 0x00be }
            if (r1 == 0) goto L_0x00bc
            java.lang.String r0 = "android.media.property.OUTPUT_SAMPLE_RATE"
            java.lang.String r0 = r1.getProperty(r0)     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x00bc
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00be }
            int r11 = r0.intValue()     // Catch:{ all -> 0x00be }
            goto L_0x00c5
        L_0x00b4:
            if (r2 < r1) goto L_0x00bc
            r0 = 64000(0xfa00, float:8.9683E-41)
            r11 = r2
            if (r2 <= r0) goto L_0x00c5
        L_0x00bc:
            r11 = 0
            goto L_0x00c5
        L_0x00be:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r11 = 44100(0xac44, float:6.1797E-41)
        L_0x00c5:
            if (r11 <= 0) goto L_0x00db
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sampling rate server setting("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ") : "
            X.C18260x0.A0y(r0, r1, r11)
            X.C18270x1.A1K(r5, r11)
        L_0x00db:
            r2 = 0
        L_0x00dc:
            if (r2 >= r3) goto L_0x00ec
            r1 = r31[r2]
            boolean r0 = X.C86624Kv.A1a(r5, r1)
            if (r0 != 0) goto L_0x00e9
            X.C18270x1.A1K(r5, r1)
        L_0x00e9:
            int r2 = r2 + 1
            goto L_0x00dc
        L_0x00ec:
            r4 = 4
            int[] r3 = new int[r4]
            r3 = {0, 1, 4, 5} // fill-array
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            r0 = 7
            X.C18270x1.A1K(r2, r0)
            r1 = 0
        L_0x00fb:
            if (r1 >= r4) goto L_0x0105
            r0 = r3[r1]
            X.C18270x1.A1K(r2, r0)
            int r1 = r1 + 1
            goto L_0x00fb
        L_0x0105:
            java.util.Iterator r19 = r2.iterator()
        L_0x0109:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x02ae
            java.lang.Object r4 = r19.next()
            java.lang.Number r4 = (java.lang.Number) r4
            java.util.Iterator r18 = r5.iterator()
        L_0x0119:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x02a8
            java.lang.Object r3 = r18.next()
            java.lang.Number r3 = (java.lang.Number) r3
            int r2 = r3.intValue()
            r1 = 16
            r0 = 2
            int r1 = android.media.AudioRecord.getMinBufferSize(r2, r1, r0)     // Catch:{ IllegalArgumentException -> 0x0239, all -> 0x0235 }
            r0 = -2
            if (r1 == r0) goto L_0x0226
            int r25 = r4.intValue()     // Catch:{ IllegalArgumentException -> 0x0233, all -> 0x0231 }
            r27 = 16
            r28 = 2
            int r29 = r1 * 2
            android.media.AudioRecord r24 = new android.media.AudioRecord     // Catch:{ IllegalArgumentException -> 0x0233, all -> 0x0231 }
            r26 = r2
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ IllegalArgumentException -> 0x0233, all -> 0x0231 }
            int r11 = r24.getState()     // Catch:{ IllegalArgumentException -> 0x0233, all -> 0x0231 }
            r0 = 1
            if (r11 != r0) goto L_0x0212
            int r12 = r24.getAudioSessionId()     // Catch:{ all -> 0x0207 }
            r6.previousAudioSessionId = r12     // Catch:{ all -> 0x0207 }
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0207 }
            java.lang.String r0 = "voip/findAvailableAudioSamplingRate/ recorder session id "
            X.C18260x0.A0y(r0, r11, r12)     // Catch:{ all -> 0x0207 }
            X.5Xv r0 = r6.voipSharedPreferences     // Catch:{ all -> 0x0207 }
            r25 = r0
            int r12 = r6.previousAudioSessionId     // Catch:{ all -> 0x0207 }
            android.content.SharedPreferences r0 = r25.A03()     // Catch:{ all -> 0x0207 }
            java.lang.String r14 = "aec_os_version"
            r11 = 0
            java.lang.String r0 = r0.getString(r14, r11)     // Catch:{ all -> 0x0207 }
            java.lang.String r13 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0207 }
            boolean r0 = r13.equals(r0)     // Catch:{ all -> 0x0207 }
            if (r0 != 0) goto L_0x020b
            boolean r0 = android.media.audiofx.AcousticEchoCanceler.isAvailable()     // Catch:{ all -> 0x0178 }
            goto L_0x017d
        L_0x0178:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0207 }
            r0 = 0
        L_0x017d:
            r17 = 0
            if (r0 == 0) goto L_0x01f3
            android.media.audiofx.AcousticEchoCanceler r17 = android.media.audiofx.AcousticEchoCanceler.create(r12)     // Catch:{ all -> 0x01e1 }
            if (r17 == 0) goto L_0x020b
            android.media.audiofx.AudioEffect$Descriptor r12 = r17.getDescriptor()     // Catch:{ all -> 0x01e1 }
            if (r12 == 0) goto L_0x01ef
            java.util.UUID r0 = r12.uuid     // Catch:{ all -> 0x01e1 }
            r16 = r0
            if (r0 == 0) goto L_0x01ef
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "voip/AcousticEchoCanceler implementor:"
            r11.append(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = r12.implementor     // Catch:{ all -> 0x01e1 }
            r11.append(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = " uuid:"
            r11.append(r0)     // Catch:{ all -> 0x01e1 }
            r0 = r16
            r11.append(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = " enabled:"
            r11.append(r0)     // Catch:{ all -> 0x01e1 }
            boolean r0 = r17.getEnabled()     // Catch:{ all -> 0x01e1 }
            r11.append(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = " hasControl:"
            r11.append(r0)     // Catch:{ all -> 0x01e1 }
            boolean r0 = r17.hasControl()     // Catch:{ all -> 0x01e1 }
            X.C18260x0.A1V(r11, r0)     // Catch:{ all -> 0x01e1 }
            java.util.UUID r0 = r12.uuid     // Catch:{ all -> 0x01e1 }
            java.lang.String r16 = r0.toString()     // Catch:{ all -> 0x01e1 }
            java.lang.String r11 = r12.implementor     // Catch:{ all -> 0x01e1 }
            android.content.SharedPreferences$Editor r0 = X.C106155Xv.A00(r25)     // Catch:{ all -> 0x01e1 }
            android.content.SharedPreferences$Editor r13 = r0.putString(r14, r13)     // Catch:{ all -> 0x01e1 }
            java.lang.String r12 = "aec_uuid"
            r0 = r16
            android.content.SharedPreferences$Editor r12 = r13.putString(r12, r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "aec_implementor"
            X.C18270x1.A0j(r12, r0, r11)     // Catch:{ all -> 0x01e1 }
            goto L_0x01ef
        L_0x01e1:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x01e6 }
            goto L_0x01ed
        L_0x01e6:
            r0 = move-exception
            if (r17 == 0) goto L_0x01ec
            r17.release()     // Catch:{ all -> 0x0207 }
        L_0x01ec:
            throw r0     // Catch:{ all -> 0x0207 }
        L_0x01ed:
            if (r17 == 0) goto L_0x020b
        L_0x01ef:
            r17.release()     // Catch:{ all -> 0x0207 }
            goto L_0x020b
        L_0x01f3:
            android.content.SharedPreferences$Editor r0 = X.C106155Xv.A00(r25)     // Catch:{ all -> 0x0207 }
            android.content.SharedPreferences$Editor r12 = r0.putString(r14, r13)     // Catch:{ all -> 0x0207 }
            java.lang.String r0 = "aec_uuid"
            android.content.SharedPreferences$Editor r12 = r12.putString(r0, r11)     // Catch:{ all -> 0x0207 }
            java.lang.String r0 = "aec_implementor"
            X.C18270x1.A0j(r12, r0, r11)     // Catch:{ all -> 0x0207 }
            goto L_0x020b
        L_0x0207:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ IllegalArgumentException -> 0x020f, all -> 0x025e }
        L_0x020b:
            r24.release()     // Catch:{ IllegalArgumentException -> 0x020f, all -> 0x025e }
            goto L_0x0284
        L_0x020f:
            r11 = move-exception
            r12 = 1
            goto L_0x023c
        L_0x0212:
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException -> 0x0233, all -> 0x0231 }
            java.lang.String r0 = "voip/findAvailableAudioSamplingRate/ Recorder state "
            r11.append(r0)     // Catch:{ IllegalArgumentException -> 0x0233, all -> 0x0231 }
            int r0 = r24.getState()     // Catch:{ IllegalArgumentException -> 0x0233, all -> 0x0231 }
            r11.append(r0)     // Catch:{ IllegalArgumentException -> 0x0233, all -> 0x0231 }
            X.AnonymousClass0x2.A19(r11)     // Catch:{ IllegalArgumentException -> 0x0233, all -> 0x0231 }
            goto L_0x022f
        L_0x0226:
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException -> 0x0233, all -> 0x0231 }
            java.lang.String r0 = "voip/findAvailableAudioSamplingRate/ can not find min buffer size for rate "
            X.C18260x0.A0z(r0, r11, r2)     // Catch:{ IllegalArgumentException -> 0x0233, all -> 0x0231 }
        L_0x022f:
            r11 = 0
            goto L_0x0285
        L_0x0231:
            r11 = move-exception
            goto L_0x0237
        L_0x0233:
            r11 = move-exception
            goto L_0x023b
        L_0x0235:
            r11 = move-exception
            r1 = 0
        L_0x0237:
            r12 = 0
            goto L_0x0260
        L_0x0239:
            r11 = move-exception
            r1 = 0
        L_0x023b:
            r12 = 0
        L_0x023c:
            java.lang.String r0 = "voip/findAvailableAudioSamplingRate/ "
            com.whatsapp.util.Log.e(r0, r11)     // Catch:{ all -> 0x025c }
            java.lang.StringBuilder r2 = X.C18270x1.A0W(r2, r8)
            r0 = r22
            if (r12 == 0) goto L_0x024b
            r0 = r23
        L_0x024b:
            r2.append(r0)
            r2.append(r9)
            int r0 = r1 * 2
            r2.append(r0)
            X.C18260x0.A1R(r2, r10, r4)
            if (r12 == 0) goto L_0x0119
            goto L_0x029f
        L_0x025c:
            r11 = move-exception
            goto L_0x0260
        L_0x025e:
            r11 = move-exception
            r12 = 1
        L_0x0260:
            java.lang.StringBuilder r2 = X.C18270x1.A0W(r2, r8)
            r0 = r22
            if (r12 == 0) goto L_0x026a
            r0 = r23
        L_0x026a:
            r2.append(r0)
            r2.append(r9)
            int r0 = r1 * 2
            r2.append(r0)
            X.C18260x0.A1R(r2, r10, r4)
            if (r12 == 0) goto L_0x02c3
            r7.add(r3)
            int r0 = r7.size()
            if (r0 < r15) goto L_0x02c3
            goto L_0x02a8
        L_0x0284:
            r11 = 1
        L_0x0285:
            java.lang.StringBuilder r2 = X.C18270x1.A0W(r2, r8)
            r0 = r22
            if (r11 == 0) goto L_0x028f
            r0 = r23
        L_0x028f:
            r2.append(r0)
            r2.append(r9)
            int r0 = r1 * 2
            r2.append(r0)
            X.C18260x0.A1R(r2, r10, r4)
            if (r11 == 0) goto L_0x0119
        L_0x029f:
            r7.add(r3)
            int r0 = r7.size()
            if (r0 < r15) goto L_0x0119
        L_0x02a8:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0109
        L_0x02ae:
            java.util.Collections.sort(r7)
            int r2 = r7.size()
            int[] r3 = new int[r2]
            r1 = 0
        L_0x02b8:
            if (r1 >= r2) goto L_0x02c4
            int r0 = X.C86614Ku.A07(r7, r1)
            r3[r1] = r0
            int r1 = r1 + 1
            goto L_0x02b8
        L_0x02c3:
            throw r11
        L_0x02c4:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x02cd
            r0 = -1
            r6.previousAudioSessionId = r0
        L_0x02cd:
            if (r2 <= 0) goto L_0x02eb
            X.5Xv r0 = r6.voipSharedPreferences
            android.content.SharedPreferences r2 = r0.A03()
            r1 = r21
            r0 = r20
            X.C86604Kt.A15(r2, r0, r1)
            X.5Xv r0 = r6.voipSharedPreferences
            android.content.SharedPreferences$Editor r2 = X.C106155Xv.A00(r0)
            java.lang.String r1 = "audio_sampling_rates"
            java.lang.String r0 = java.util.Arrays.toString(r3)
            X.C18270x1.A0j(r2, r1, r0)
        L_0x02eb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.JNIUtils.findAvailableAudioSamplingRate(int[], int, int):int[]");
    }

    private boolean isH265SwCodecSupported() {
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$updateH26XCodecSupported$0() {
        this.voipSharedPreferences.A06(isH26XCodecSupported());
    }

    public boolean allowAlternativeNetworkForAudioCall() {
        if (C18280x3.A1W(AnonymousClass0x2.A0F(this.waSharedPreferences), "voip_low_data_usage") || AnonymousClass0x2.A0F(this.waSharedPreferences).getInt("autodownload_cellular_mask", 1) == 0) {
            return false;
        }
        return true;
    }

    public boolean allowAlternativeNetworkForVideoCall() {
        if (C18280x3.A1W(AnonymousClass0x2.A0F(this.waSharedPreferences), "voip_low_data_usage") || (AnonymousClass0x2.A0F(this.waSharedPreferences).getInt("autodownload_cellular_mask", 1) & 4) == 0) {
            return false;
        }
        return true;
    }

    public VoipFaceDetector createVoipFaceDetector(int i, boolean z) {
        if (AnonymousClass000.A1T(C159787mS.A00(this.waContext.A00))) {
            return VoipFaceDetector.create(this.waContext.A00, i, z);
        }
        return null;
    }

    public boolean disallowAllP2P() {
        return C18280x3.A1W(this.voipSharedPreferences.A03(), "privacy_always_relay");
    }

    public boolean enableOrientationScaleTypeChanges() {
        return AnonymousClass001.A1W(C86664Kz.A0J(this.abProps));
    }

    public boolean getAlwaysEnabledOrientationScaleTypeChanges() {
        return this.abProps.A0X(3975);
    }

    public int getAudioLevelSpeakingThreshold() {
        return Math.min(this.abProps.A0N(1213), 127);
    }

    public boolean getBoolValueByCode(int i) {
        return this.abProps.A0X(i);
    }

    public int getCallAdminVersion() {
        return 1;
    }

    public int getCallAudioShareVersion() {
        return ((C172068Jm) this.systemFeatures).A01.A0N(6598);
    }

    public boolean getCallLinkIsRemovable() {
        return true;
    }

    public int getCallLinkMilestoneVersion() {
        return 1;
    }

    public int getCallOfferRedialStatsVersion() {
        return this.abProps.A0N(6709);
    }

    public int getCalleeOfferPeekTimeoutMs() {
        return this.abProps.A0N(5090);
    }

    public int getCallingLidVersion() {
        return this.abProps.A0N(3358);
    }

    public int getCapiCallingAlphaVersion() {
        return this.abProps.A0N(4067);
    }

    public String getDebugDirectory() {
        this.fMessageIO.A08();
        return this.waContext.A00.getFilesDir().getAbsolutePath();
    }

    public boolean getDebugVoipRecordDecoderVideo() {
        return false;
    }

    public boolean getDebugVoipRecordEncoderVideo() {
        return false;
    }

    public boolean getDebugVoipRecordPreprocessedCaptureVideo() {
        return false;
    }

    public boolean getDebugVoipRecordRawCaptureVideo() {
        return false;
    }

    public boolean getDebugVoipRecordRawRenderVideo() {
        return false;
    }

    public int getDisableReconnectingToneConnectedParticipantThreshold() {
        return this.abProps.A0N(4211);
    }

    public boolean getEnableCallSummaryAndDuration() {
        return this.abProps.A0X(5579);
    }

    public boolean getEnableJoinAndAcceptOngoingCall() {
        return this.abProps.A0X(5570);
    }

    public boolean getEnablePeekOfferCallIdCache() {
        return this.abProps.A0X(5323);
    }

    public float getFloatValueByCode(int i) {
        return this.abProps.A0L(i);
    }

    public int getGroupCallBufferParticipantThreshold() {
        return this.abProps.A0N(2251);
    }

    public int getGroupCallBufferProcessDelay() {
        return this.abProps.A0N(1092);
    }

    public int getHeartbeatIntervalS() {
        return this.abProps.A0N(1430);
    }

    public int getHeartbeatLonelyStateIntervalS() {
        return this.abProps.A0N(5486);
    }

    public int getIntValueByCode(int i) {
        return this.abProps.A0N(i);
    }

    public int getLandscapeModeVariant() {
        return this.abProps.A0N(3976);
    }

    public int getLightWeightCallingVersion() {
        if (this.meManager.A0Y()) {
            return 0;
        }
        return this.abProps.A0N(3362);
    }

    public int getLobbyTimeoutMin() {
        return this.abProps.A0N(1565);
    }

    public int getMaxGroupSizeForLongRingtone() {
        return this.abProps.A0N(4710);
    }

    public int getMaxNumParticipantsForScreenSharing() {
        return this.abProps.A0N(3694);
    }

    public int getOibweSlowPolling() {
        return this.abProps.A0N(4382);
    }

    public boolean getOverrideIpConfigPreferIpv6() {
        return false;
    }

    public int getScreenShareOptions() {
        return this.abProps.A0N(4218);
    }

    public int getScreenShareVersion() {
        return this.abProps.A0N(3171);
    }

    public int getSecurityFixesBitmap() {
        return this.abProps.A0N(3094);
    }

    public String getSelfJid() {
        Jid A04;
        boolean A0Y = this.meManager.A0Y();
        C56972sr r0 = this.meManager;
        if (A0Y) {
            r0.A0P();
            A04 = r0.A04;
        } else {
            A04 = C56972sr.A04(r0);
        }
        return C627336j.A07(A04);
    }

    public String getSelfLidJid() {
        return C627336j.A07(this.meManager.A0G());
    }

    public int getSignalingLatencySettings() {
        return this.abProps.A0N(5408);
    }

    public String getStringValueByCode(int i) {
        return this.abProps.A0Q(i);
    }

    public final String getTimeSeriesDirectory() {
        File A04 = C627436k.A04(this.waContext.A00);
        if (A04 != null) {
            return A04.getAbsolutePath();
        }
        Log.e("getTimeSeriesDirectory base time series directory is null");
        return "";
    }

    public boolean getUnifyEndCallEvents() {
        return this.abProps.A0X(2856);
    }

    public int getUpdateSpeakerStatusIntervalMs() {
        return this.abProps.A0N(1106);
    }

    public int getVidStreamPauseResumeJbResetThreshold() {
        return this.abProps.A0N(2642);
    }

    public int getVoiceChatRingAllMaxGroupSize() {
        return this.abProps.A0N(4716);
    }

    public final String getVoipCacheDirectory() {
        String str;
        File cacheDir = this.waContext.A00.getCacheDir();
        if (cacheDir != null) {
            File A0A = AnonymousClass002.A0A(cacheDir, "voip");
            if (A0A.exists() || A0A.mkdirs()) {
                return A0A.getAbsolutePath();
            }
            str = "getVoipCacheDirectory could not init directory";
        } else {
            str = "getVoipCacheDirectory Cache Directory is null";
        }
        Log.e(str);
        return "";
    }

    public VoipCameraManager getVoipCameraManager() {
        return this.voipCameraManager;
    }

    public VoipSystemAudioManager getVoipSystemAudioManager() {
        return this.voipSystemAudioManager;
    }

    public int getYearClass() {
        return AnonymousClass34G.A02(this.systemServices, this.sharedPreferencesFactory);
    }

    public MediaCodecVideoEncoder initMediaCodecVideoEncoder() {
        return new MediaCodecVideoEncoder(this.voipSharedPreferences);
    }

    public boolean isAddParticipantWhileCallingSenderEnabled() {
        return this.abProps.A0X(5088);
    }

    public boolean isAudioOnlyVideoCallsEnabled() {
        return false;
    }

    public boolean isCallStateMachineEnabled() {
        return this.abProps.A0X(4249);
    }

    public boolean isFixedVideoOrientationEnabled() {
        return C86614Ku.A1a(this.isVideoRotationSupportedProvider);
    }

    public boolean isGroupCallBufferEnabled() {
        return this.abProps.A0X(1039);
    }

    public boolean isInitBweForGroupCallEnabled() {
        return this.abProps.A0X(2601);
    }

    public boolean isLowDataUsageEnabled() {
        return C18280x3.A1W(AnonymousClass0x2.A0F(this.waSharedPreferences), "voip_low_data_usage");
    }

    public boolean isMuteParticipantEnabled() {
        return this.abProps.A0X(1111);
    }

    public boolean isReportCallRepalyerIdAllowed() {
        return this.abProps.A0X(1834);
    }

    public boolean isScheduledCallEnabled() {
        return C627436k.A0I(this.abProps);
    }

    public boolean isSilentOfferEnabled() {
        return this.abProps.A0X(3235);
    }

    public boolean isVidQualityManagerEnabled() {
        return C18280x3.A1W(this.voipSharedPreferences.A03(), "enable_vid_quality_manager");
    }

    public boolean isVideoConverterMemoryLeakFixEnabled() {
        return this.voipSharedPreferences.A01.A0X(MediaCodecVideoEncoder.MIN_ENCODER_WIDTH);
    }

    public boolean isVideoRotationEnabled() {
        if (C86614Ku.A1a(this.isVideoRotationSupportedProvider) || (C86614Ku.A1a(this.isPartialLandscapeModeSupported) && this.abProps.A0N(3976) == 1)) {
            return true;
        }
        return false;
    }

    public boolean isVoipStanzaSmaxationEnabled() {
        return this.abProps.A0X(1520);
    }

    public boolean isWamCallExtendedEnabled() {
        return this.abProps.A0X(1939);
    }

    public boolean shouldRemoveGroupInfoFromGroupCallExtensionOffer() {
        return this.abProps.A0X(4899);
    }

    public JNIUtils(AnonymousClass1VX r2, C56972sr r3, C54292oU r4, AnonymousClass4FS r5, C64393Dh r6, AnonymousClass49P r7, C66663Mh r8, C52412lR r9, C620633i r10, C187958y5 r11, C113745lv r12, C66653Mg r13, VoipCameraManager voipCameraManager2, VoipSystemAudioManager voipSystemAudioManager2, AnonymousClass5ZR r16, AnonymousClass33p r17, C106155Xv r18, C60152y5 r19, C57162tC r20, AnonymousClass4C1 r21, AnonymousClass4C1 r22) {
        this.abProps = r2;
        this.meManager = r3;
        this.waContext = r4;
        this.waWorkers = r5;
        this.fMessageIO = r6;
        this.voipNative = r7;
        this.serverProps = r8;
        this.deviceUtils = r9;
        this.systemServices = r10;
        this.systemFeatures = r11;
        this.bweMlModelManager = r12;
        this.multiDeviceConfig = r13;
        this.voipCameraManager = voipCameraManager2;
        this.voipSystemAudioManager = voipSystemAudioManager2;
        this.waPermissionsHelper = r16;
        this.waSharedPreferences = r17;
        this.voipSharedPreferences = r18;
        this.sharedPreferencesFactory = r19;
        this.waDebugBuildSharedPreferences = r20;
        this.isPartialLandscapeModeSupported = r21;
        this.isVideoRotationSupportedProvider = r22;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r1.equalsIgnoreCase("jfvelte") == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean isH264HwCodecSupported() {
        /*
            r6 = this;
            boolean r0 = X.C107535bT.A04()
            r5 = 0
            if (r0 != 0) goto L_0x0023
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            java.lang.String r0 = "5.0.1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0024
            java.lang.String r1 = android.os.Build.DEVICE
            java.lang.String r0 = "jflte"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0023
            java.lang.String r0 = "jfvelte"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0024
        L_0x0023:
            return r5
        L_0x0024:
            java.lang.String[] r4 = H264_BLACKLISTED_DEVICE_BOARD
            int r3 = r4.length
            r2 = 0
        L_0x0028:
            if (r2 >= r3) goto L_0x0037
            r1 = r4[r2]
            java.lang.String r0 = android.os.Build.BOARD
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0023
            int r2 = r2 + 1
            goto L_0x0028
        L_0x0037:
            java.lang.String[] r4 = H264_BLACKLISTED_DEVICE_HARDWARE
            int r3 = r4.length
            r2 = 0
        L_0x003b:
            if (r2 >= r3) goto L_0x004a
            r1 = r4[r2]
            java.lang.String r0 = android.os.Build.HARDWARE
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0023
            int r2 = r2 + 1
            goto L_0x003b
        L_0x004a:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.JNIUtils.isH264HwCodecSupported():boolean");
    }

    private boolean isH265HwCodecSupported() {
        return MediaCodecVideoEncoder.isH265HwSupported();
    }

    public void uploadCrashLog(String str) {
    }

    public synchronized int[] findAvailableAudioSamplingRate(int i) {
        return findAvailableAudioSamplingRate(new int[]{16000, 24000, 44100, 22050, 8000, 11025, 32000, 48000, 12000}, 2, i);
    }
}
