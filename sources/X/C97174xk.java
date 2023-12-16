package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallLinkInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.4xk  reason: invalid class name and case insensitive filesystem */
public class C97174xk extends C29451iq {
    public long A00 = 0;
    public long A01;
    public Handler A02;
    public C107285b3 A03;
    public String A04;
    public boolean A05 = false;
    public boolean A06;
    public final C56972sr A07;
    public final AnonymousClass49P A08;
    public final C56612sH A09;
    public final AnonymousClass1VX A0A;
    public final C72173dI A0B;
    public final C187958y5 A0C;
    public final C179868jq A0D = new AnonymousClass8KG(this);
    public final VoipCameraManager A0E;
    public final Set A0F = AnonymousClass002.A0K();

    public static int A00(int i, int i2, int i3) {
        float f = (float) i3;
        int i4 = ((int) (1.402f * f)) + i;
        float f2 = (float) i2;
        int i5 = i - ((int) ((0.344f * f2) + (f * 0.714f)));
        return Math.min(255, Math.max(0, i + ((int) (f2 * 1.772f)))) | (Math.min(255, Math.max(0, i4)) << 16) | -16777216 | (Math.min(255, Math.max(0, i5)) << 8);
    }

    public AnonymousClass5XK A08() {
        CallInfo A092 = A09((CallInfo) null);
        if (A092 != null) {
            return new AnonymousClass5XK(A092);
        }
        Map emptyMap = Collections.emptyMap();
        return new AnonymousClass5XK(AnonymousClass8OQ.copyOf(emptyMap), (C102995Lb) null, (C27991fJ) null, (UserJid) null, (UserJid) null, CallState.NONE, "", (String) null, (String) null, 0, 0, false, false, false, false, false, false, false, false, false, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x010a A[SYNTHETIC, Splitter:B:34:0x010a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Bitmap A01(X.C149957Oo r19) {
        /*
            r7 = r19
            int r8 = r7.A00
            byte[] r11 = r7.A05
            int r5 = r7.A03
            int r4 = r7.A01
            r0 = 1
            java.lang.String r10 = " got "
            r2 = 0
            if (r8 == r0) goto L_0x00a4
            r0 = 17
            if (r8 == r0) goto L_0x004f
            r0 = 35
            if (r8 == r0) goto L_0x002f
            r0 = 842094169(0x32315659, float:1.0322389E-8)
            if (r8 == r0) goto L_0x0028
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ OutOfMemoryError -> 0x00e6 }
            java.lang.String r0 = "convertFrameDataToARGB8888 unsupported format "
            X.C18260x0.A0y(r0, r1, r8)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            goto L_0x0106
        L_0x0028:
            r0 = 0
            int[] r10 = A02(r11, r5, r4, r0)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            goto L_0x0107
        L_0x002f:
            int r0 = r5 * 3
            int r0 = r0 * r4
            int r6 = r0 / 2
            int r3 = r11.length     // Catch:{ OutOfMemoryError -> 0x00e6 }
            if (r3 == r6) goto L_0x0048
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ OutOfMemoryError -> 0x00e6 }
            java.lang.String r0 = "convertFrameDataToARGB8888 YUV_420_888 expected length "
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r1.append(r6)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            X.C18260x0.A0x(r10, r1, r3)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            goto L_0x0106
        L_0x0048:
            r0 = 1
            int[] r10 = A02(r11, r5, r4, r0)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            goto L_0x0107
        L_0x004f:
            int r9 = r4 * r5
            int[] r10 = new int[r9]     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r6 = 0
            r19 = 0
        L_0x0056:
            if (r6 >= r9) goto L_0x0107
            byte r0 = r11[r6]     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r15 = r0 & 255(0xff, float:3.57E-43)
            int r18 = r6 + 1
            byte r0 = r11[r18]     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r14 = r0 & 255(0xff, float:3.57E-43)
            int r17 = r5 + r6
            byte r0 = r11[r17]     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r13 = r0 & 255(0xff, float:3.57E-43)
            int r16 = r17 + 1
            byte r0 = r11[r16]     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r12 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r9 + r19
            byte r0 = r11[r3]     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r1 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r3 + 1
            byte r0 = r11[r0]     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r0 + -128
            int r1 = r1 + -128
            int r0 = A00(r15, r3, r1)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r10[r6] = r0     // Catch:{ OutOfMemoryError -> 0x00e6 }
            int r0 = A00(r14, r3, r1)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r10[r18] = r0     // Catch:{ OutOfMemoryError -> 0x00e6 }
            int r0 = A00(r13, r3, r1)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r10[r17] = r0     // Catch:{ OutOfMemoryError -> 0x00e6 }
            int r0 = A00(r12, r3, r1)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r10[r16] = r0     // Catch:{ OutOfMemoryError -> 0x00e6 }
            if (r6 == 0) goto L_0x009f
            int r0 = r6 + 2
            int r0 = r0 % r5
            if (r0 != 0) goto L_0x009f
            r6 = r17
        L_0x009f:
            int r6 = r6 + 2
            int r19 = r19 + 2
            goto L_0x0056
        L_0x00a4:
            int r9 = r4 * r5
            int r6 = r9 * 4
            int r3 = r11.length     // Catch:{ OutOfMemoryError -> 0x00e6 }
            if (r3 == r6) goto L_0x00bb
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ OutOfMemoryError -> 0x00e6 }
            java.lang.String r0 = "convertFrameDataToARGB8888 RGBA expected length "
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r1.append(r6)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            X.C18260x0.A0x(r10, r1, r3)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            goto L_0x0106
        L_0x00bb:
            int[] r10 = new int[r9]     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r6 = 0
        L_0x00be:
            if (r6 >= r9) goto L_0x0107
            int r1 = r6 * 4
            byte r0 = r11[r1]     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r13 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r1 + 1
            byte r0 = r11[r0]     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r12 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r1 + 2
            byte r0 = r11[r0]     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r3 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r1 + 3
            byte r0 = r11[r0]     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r0 << 24
            int r0 = r13 << 16
            r1 = r1 | r0
            int r0 = r12 << 8
            r1 = r1 | r0
            r1 = r1 | r3
            r10[r6] = r1     // Catch:{ OutOfMemoryError -> 0x00e6 }
            int r6 = r6 + 1
            goto L_0x00be
        L_0x00e6:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "convertFrameDataToARGB8888 OOM when convert data with format = "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " width = "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "height = "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r4)
            com.whatsapp.util.Log.i(r0, r3)
            r10 = r2
            goto L_0x0107
        L_0x0106:
            r10 = r2
        L_0x0107:
            r9 = 0
            if (r10 == 0) goto L_0x0196
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x018f }
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r10, r5, r4, r0)     // Catch:{ OutOfMemoryError -> 0x018f }
            boolean r0 = X.AnonymousClass77V.A00
            r1 = 320(0x140, float:4.48E-43)
            if (r0 == 0) goto L_0x0118
            r1 = 240(0xf0, float:3.36E-43)
        L_0x0118:
            int r0 = r10.getWidth()
            int r0 = r0 / 4
            int r8 = java.lang.Math.max(r1, r0)
            int r0 = r10.getWidth()
            if (r0 <= r8) goto L_0x0142
            int r0 = r10.getWidth()
            double r5 = (double) r0
            double r0 = (double) r8
            double r5 = r5 / r0
            int r0 = r10.getHeight()
            double r3 = (double) r0
            double r3 = r3 / r5
            int r1 = (int) r3
            r0 = 1
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createScaledBitmap(r10, r8, r1, r0)     // Catch:{ OutOfMemoryError -> 0x013c }
            goto L_0x0142
        L_0x013c:
            r1 = move-exception
            java.lang.String r0 = "voip/CallDatasource/convertFrameInfoToBitmap OOM when scaling down bitmap"
            com.whatsapp.util.Log.i(r0, r1)
        L_0x0142:
            android.graphics.Matrix r15 = X.AnonymousClass002.A05()
            boolean r3 = r7.A04
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L_0x0150
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0150:
            r15.preScale(r1, r0)
            int r0 = r7.A02
            float r0 = (float) r0
            r15.postRotate(r0)
            r11 = 0
            int r13 = r10.getWidth()     // Catch:{ OutOfMemoryError -> 0x0183 }
            int r14 = r10.getHeight()     // Catch:{ OutOfMemoryError -> 0x0183 }
            r16 = 1
            r12 = r11
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ OutOfMemoryError -> 0x0183 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ OutOfMemoryError -> 0x0183 }
            java.lang.String r0 = "voip/CallDatasource/convertFrameInfoToBitmap screenshot done. size: "
            X.C86614Ku.A17(r2, r0, r1)     // Catch:{ OutOfMemoryError -> 0x0183 }
            java.lang.String r0 = "x"
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x0183 }
            int r0 = r2.getHeight()     // Catch:{ OutOfMemoryError -> 0x0183 }
            X.C18260x0.A1G(r1, r0)     // Catch:{ OutOfMemoryError -> 0x0183 }
            if (r2 == r10) goto L_0x0181
            r9 = r10
        L_0x0181:
            r10 = r9
            goto L_0x0189
        L_0x0183:
            r1 = move-exception
            java.lang.String r0 = "voip/CallDatasource/convertFrameInfoToBitmap OOM when creating result bitmap"
            com.whatsapp.util.Log.i(r0, r1)
        L_0x0189:
            if (r10 == 0) goto L_0x0196
            r10.recycle()
            return r2
        L_0x018f:
            r1 = move-exception
            java.lang.String r0 = "voip/CallDatasource/convertFrameInfoToBitmap OOM when creating raw bitmap"
            com.whatsapp.util.Log.i(r0, r1)
            return r2
        L_0x0196:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97174xk.A01(X.7Oo):android.graphics.Bitmap");
    }

    public static int[] A02(byte[] bArr, int i, int i2, boolean z) {
        int i3 = i * i2;
        int[] iArr = new int[i3];
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            byte b = bArr[i4] & 255;
            int i6 = i4 + 1;
            byte b2 = bArr[i6] & 255;
            int i7 = i + i4;
            byte b3 = bArr[i7] & 255;
            int i8 = i7 + 1;
            byte b4 = bArr[i8] & 255;
            int i9 = i3 + i5;
            byte b5 = bArr[i9] & 255;
            byte b6 = bArr[i9 + (i3 / 4)] & 255;
            if (!z) {
                byte b7 = b5;
                b5 = b6;
                b6 = b7;
            }
            int i10 = b5 - 128;
            int i11 = b6 - 128;
            iArr[i4] = A00(b, i10, i11);
            iArr[i6] = A00(b2, i10, i11);
            iArr[i7] = A00(b3, i10, i11);
            iArr[i8] = A00(b4, i10, i11);
            if (i4 != 0 && (i4 + 2) % i == 0) {
                i4 = i7;
            }
            i4 += 2;
            i5++;
        }
        return iArr;
    }

    public final CallInfo A09(CallInfo callInfo) {
        String str;
        if (callInfo == null) {
            if (Voip.A07()) {
                CallLinkInfo callLinkInfo = Voip.getCallLinkInfo();
                C626936e.A06(callLinkInfo);
                return CallInfo.convertCallLinkInfoToCallInfo(callLinkInfo);
            }
            callInfo = Voip.getCallInfo();
            if (callInfo == null) {
                return null;
            }
        }
        if (callInfo.isCallLinkLobbyOrJoiningState() || (str = this.A04) == null) {
            return callInfo;
        }
        if (str.equals(callInfo.callWaitingInfo.A04)) {
            return CallInfo.convertCallWaitingInfoToCallInfo(callInfo);
        }
        String str2 = callInfo.callId;
        if (str.equals(str2) || this.A05) {
            return callInfo;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CallDatasource/getCallInfoForDisplay CallId ");
        A0o.append(str);
        C18260x0.A0r(" does not match current call's id ", str2, A0o);
        this.A05 = true;
        return callInfo;
    }

    public void A0A() {
        String str;
        C107285b3 r4 = this.A03;
        if (r4 != null) {
            CallInfo callInfo = Voip.getCallInfo();
            if (callInfo == null) {
                str = "voip/ringAll: Voip.getCallInfo failed";
            } else {
                ArrayList A0s = AnonymousClass001.A0s();
                Iterator A0v = AnonymousClass001.A0v(callInfo.participants);
                while (A0v.hasNext()) {
                    C102995Lb A13 = C86664Kz.A13(A0v);
                    if (A13.A02 == 11) {
                        A0s.add(A13.A08);
                    }
                }
                if (A0s.size() == 0) {
                    str = "voip/ringAll: Cannot ring any participant";
                } else {
                    C626936e.A0D(!A0s.isEmpty(), "voip/invite: Empty list of peers to invite");
                    r4.A13.execute(new C71643cR(r4, A0s, callInfo, 5, true));
                    return;
                }
            }
            Log.e(str);
        }
    }

    public void A0G(String str) {
        String str2 = this.A04;
        if (!str.equals(str2)) {
            this.A01 = 0;
            if (str2 != null) {
                Iterator A032 = C61102zi.A03(this);
                while (A032.hasNext()) {
                    AnonymousClass4VK A15 = C86664Kz.A15(A032);
                    if (A15 instanceof CallGridViewModel) {
                        CallGridViewModel callGridViewModel = (CallGridViewModel) A15;
                        callGridViewModel.A07 = null;
                        AnonymousClass08M r1 = callGridViewModel.A0H;
                        if (r1.A07() != null) {
                            r1.A0H((Object) null);
                        }
                    }
                }
            }
            this.A04 = str;
            this.A05 = false;
            this.A06 = false;
            CallInfo A092 = A09((CallInfo) null);
            if (A092 != null) {
                A0E(A092);
            }
        }
    }

    public C97174xk(C56972sr r4, AnonymousClass49P r5, C56612sH r6, AnonymousClass1VX r7, C187958y5 r8, AnonymousClass4FS r9, VoipCameraManager voipCameraManager, C183538qC r11) {
        super(r11);
        this.A09 = r6;
        this.A0A = r7;
        this.A07 = r4;
        this.A08 = r5;
        this.A0C = r8;
        this.A0E = voipCameraManager;
        this.A02 = new Handler(Looper.getMainLooper(), new AnonymousClass91L(this, 3));
        this.A0B = new C72173dI(r9, true);
        Objects.requireNonNull(r5);
        voipCameraManager.setCaptureDeviceRefreshListener(new AnonymousClass8KE(r5));
    }

    public void A0B(long j, long j2) {
        if (!C61102zi.A03(this).hasNext()) {
            return;
        }
        if (j2 > this.A01) {
            Iterator A032 = C61102zi.A03(this);
            while (A032.hasNext()) {
                AnonymousClass4VK A15 = C86664Kz.A15(A032);
                if (A15 instanceof CallGridViewModel) {
                    ((CallGridViewModel) A15).A0F.A0H(Long.valueOf(j));
                }
            }
            this.A01 = j2;
            return;
        }
        Log.d("CallDataSource/updateCallDuration ignoring due to older callInfoCaptureUptimeMillis");
    }

    /* renamed from: A0C */
    public void A06(AnonymousClass4VK r3) {
        boolean z = !C61102zi.A03(this).hasNext();
        super.A06(r3);
        if (z) {
            this.A0E.onCameraClosedListener = this.A0D;
        }
    }

    /* renamed from: A0D */
    public void A07(AnonymousClass4VK r3) {
        super.A07(r3);
        if (!C61102zi.A03(this).hasNext()) {
            this.A02.removeCallbacksAndMessages((Object) null);
            this.A0B.A02();
            this.A0E.onCameraClosedListener = null;
        }
    }

    public void A0E(CallInfo callInfo) {
        CallState callState;
        if (C61102zi.A03(this).hasNext()) {
            Handler handler = this.A02;
            handler.removeMessages(2);
            long currentTimeMillis = System.currentTimeMillis();
            if (callInfo == null || !((callState = callInfo.callState) == CallState.NONE || callState == CallState.ACTIVE_ELSEWHERE)) {
                long j = this.A00;
                if (j != 0) {
                    long j2 = j + 250;
                    if (currentTimeMillis < j2) {
                        handler.sendEmptyMessageDelayed(2, j2 - currentTimeMillis);
                        return;
                    }
                }
            }
            A0F(callInfo, false);
        }
    }

    public final void A0F(CallInfo callInfo, boolean z) {
        if (C61102zi.A03(this).hasNext()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            CallInfo A092 = A09(callInfo);
            if (A092 != null) {
                AnonymousClass5XK r4 = new AnonymousClass5XK(A092);
                if (z) {
                    Iterator A032 = C61102zi.A03(this);
                    while (A032.hasNext()) {
                        AnonymousClass4VK A15 = C86664Kz.A15(A032);
                        if (A15 instanceof AudioChatCallingViewModel) {
                            A15.A0D(r4);
                        } else if (A15 instanceof CallGridViewModel) {
                            CallGridViewModel callGridViewModel = (CallGridViewModel) A15;
                            if (CallGridViewModel.A09(r4).size() > 8) {
                                callGridViewModel.A0T(r4, true);
                            }
                        }
                    }
                } else {
                    Iterator A033 = C61102zi.A03(this);
                    while (A033.hasNext()) {
                        C86664Kz.A15(A033).A0D(r4);
                    }
                    A0B(A092.callDuration, uptimeMillis);
                }
                this.A00 = System.currentTimeMillis();
            }
        }
    }
}
