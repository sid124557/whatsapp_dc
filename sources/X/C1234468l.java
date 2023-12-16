package X;

import android.os.SystemClock;
import com.whatsapp.qrcode.QrScannerViewV2;
import com.whatsapp.util.Log;

/* renamed from: X.68l  reason: invalid class name and case insensitive filesystem */
public class C1234468l implements C185898uQ {
    public Object A00;
    public final int A01;

    public C1234468l(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BN3(float f, float f2) {
        C69263Wi r2;
        int i;
        switch (this.A01) {
            case 0:
                r2 = ((AnonymousClass5ZS) this.A00).A0b;
                i = 0;
                break;
            case 1:
                r2 = ((C106735a4) this.A00).A0V;
                i = 2;
                break;
            default:
                return;
        }
        r2.A0S(new C117195rX(this, f, f2, i));
    }

    public void BN4(boolean z) {
        C69263Wi r2;
        Runnable runnable;
        switch (this.A01) {
            case 0:
                r2 = ((AnonymousClass5ZS) this.A00).A0b;
                runnable = new C71703cX(16, (Object) this, z);
                break;
            case 1:
                r2 = ((C106735a4) this.A00).A0V;
                runnable = new C71363bz(6, this, z);
                break;
            default:
                return;
        }
        r2.A0S(runnable);
    }

    public void BOH(Exception exc, int i) {
        String str;
        switch (this.A01) {
            case 0:
                AnonymousClass5ZS r6 = (AnonymousClass5ZS) this.A00;
                r6.A0b.A0S(new C117705sM((Object) this, i, 18));
                AnonymousClass5UM r5 = r6.A0k;
                boolean A04 = r6.A0e.A04();
                if (r5.A0B) {
                    C186568vZ r1 = r5.A09;
                    if (A04) {
                        str = "in_call";
                    } else if (i == 2) {
                        str = "evicted";
                    } else if (i == 3) {
                        str = "photo";
                    } else if (i != 4) {
                        str = "unknown";
                    } else {
                        str = "video";
                    }
                    r1.markerAnnotate(554251647, "error_message", str);
                }
                r5.A05(4);
                C105995Xf r4 = r6.A0j;
                if (r4.A04()) {
                    Log.d("CameraCaptureFlowLogger/logCaptureError");
                    C95164sj r3 = new C95164sj();
                    r3.A09 = C18280x3.A0S();
                    r3.A0G = r4.A02.A00;
                    r3.A0E = AnonymousClass0x9.A0m(i);
                    StringBuilder A0v = C18290x4.A0v(exc);
                    A0v.append(" at ");
                    AnonymousClass000.A1B(exc.getStackTrace()[0], A0v);
                    r3.A0H = A0v.toString();
                    r4.A01.BhA(r3);
                    return;
                }
                return;
            case 1:
                ((C106735a4) this.A00).A0V.BkS(new C71563cJ((Object) this, i, 5));
                return;
            default:
                QrScannerViewV2 qrScannerViewV2 = (QrScannerViewV2) this.A00;
                if (qrScannerViewV2.A05 != null) {
                    qrScannerViewV2.A08.post(new C71563cJ((Object) this, i, 7));
                    return;
                }
                return;
        }
    }

    public void BYs() {
        long j;
        switch (this.A01) {
            case 0:
                AnonymousClass5ZS r4 = (AnonymousClass5ZS) this.A00;
                AnonymousClass5UM r3 = r4.A0k;
                AnonymousClass678 r2 = r4.A0C;
                int cameraType = r2.getCameraType();
                boolean z = !r2.BHe();
                Integer valueOf = Integer.valueOf(r2.getCameraApi());
                String flashMode = r2.getFlashMode();
                boolean z2 = r3.A0B;
                if (z2) {
                    r3.A02(554251647, "onPreviewReady");
                    r3.A03(valueOf, 554251647, cameraType);
                    r3.A00(554251647, z ? 1 : 0);
                    r3.A09.markerAnnotate(554251647, "flash_mode", flashMode);
                }
                if (r4.A0U) {
                    AnonymousClass678 r1 = r4.A0C;
                    Integer valueOf2 = Integer.valueOf(r1.getCameraApi());
                    int cameraType2 = r1.getCameraType();
                    AnonymousClass4rJ r12 = new AnonymousClass4rJ();
                    r12.A02 = Long.valueOf(SystemClock.elapsedRealtime() - r3.A03);
                    r12.A01 = Integer.valueOf(cameraType2);
                    r12.A00 = valueOf2;
                    if (r3.A0A) {
                        r3.A08.BhD(r12);
                    }
                    if (z2) {
                        r3.A03(valueOf2, 554250848, cameraType2);
                        r3.A09.markerEnd(554250848, 2);
                    }
                    r4.A0U = false;
                } else {
                    boolean z3 = r4.A0T;
                    AnonymousClass678 r13 = r4.A0C;
                    Integer valueOf3 = Integer.valueOf(r13.getCameraApi());
                    int cameraType3 = r13.getCameraType();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (z3) {
                        j = r3.A01;
                    } else {
                        j = r3.A02;
                    }
                    r3.A01 = 0;
                    r3.A02 = 0;
                    if (j != 0) {
                        C94524rU r14 = new C94524rU();
                        r14.A02 = Integer.valueOf(z3 ^ true ? 1 : 0);
                        r14.A03 = Long.valueOf(elapsedRealtime - j);
                        r14.A01 = Integer.valueOf(cameraType3);
                        r14.A00 = valueOf3;
                        if (r3.A0A) {
                            r3.A08.BhD(r14);
                        }
                    }
                }
                r4.A0T = false;
                r4.A0b.A0S(C117695sL.A00(this, 48));
                r3.A01(554251647, "onPreviewReady");
                r3.A05(2);
                return;
            case 1:
                C106735a4 r15 = (C106735a4) this.A00;
                r15.A0E = false;
                r15.A0V.A0S(new C71273bq((Object) this, 33));
                return;
            default:
                QrScannerViewV2 qrScannerViewV2 = (QrScannerViewV2) this.A00;
                if (qrScannerViewV2.A05 != null) {
                    qrScannerViewV2.A08.post(new C70033Zp(this, 4));
                    return;
                }
                return;
        }
    }

    public void BZB(C151757We r5) {
        switch (this.A01) {
            case 0:
                ((AnonymousClass5ZS) this.A00).A0b.A0S(new C71323bv(20, r5.A02, this));
                return;
            case 1:
                return;
            default:
                QrScannerViewV2 qrScannerViewV2 = (QrScannerViewV2) this.A00;
                if (qrScannerViewV2.A05 != null) {
                    qrScannerViewV2.A08.post(new C70133a0(this, 42, r5));
                    return;
                }
                return;
        }
    }

    public void BfF() {
        if (this.A01 == 0) {
            AnonymousClass5UM r4 = ((AnonymousClass5ZS) this.A00).A0k;
            r4.A04 = SystemClock.elapsedRealtime() - r4.A05;
            if (r4.A0B) {
                r4.A01(554249147, "start_video_capture");
                r4.A02(554249147, "video_record");
            }
        }
    }
}
