package X;

import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import com.facebook.profilo.logger.MultiBufferLogger;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;

/* renamed from: X.2sF  reason: invalid class name and case insensitive filesystem */
public class C56592sF {
    public int A00 = -1;
    public int A01 = 1;
    public AnonymousClass5ZC A02;
    public AnonymousClass316 A03;
    public C49172g6 A04;
    public C48732fN A05;
    public Integer A06;
    public Long A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public final Handler A0B = AnonymousClass000.A0A();
    public final C55682qk A0C;
    public final C66663Mh A0D;
    public final C56612sH A0E;
    public final C54292oU A0F;
    public final C620733j A0G;
    public final C60972zT A0H;
    public final AnonymousClass1VX A0I;
    public final AnonymousClass4FV A0J;
    public final C58652vb A0K;
    public final C45432a0 A0L;
    public final AnonymousClass5ZC A0M;
    public final AnonymousClass5ZC A0N;
    public final AnonymousClass5ZC A0O = AnonymousClass0x9.A0T(10, 1000, 25000);
    public final AnonymousClass5ZC A0P = AnonymousClass0x9.A0T(100, SearchActionVerificationClientService.NOTIFICATION_ID, 250000);
    public final AnonymousClass5ZC A0Q = AnonymousClass0x9.A0T(100, SearchActionVerificationClientService.NOTIFICATION_ID, 250000);
    public final AnonymousClass5ZC A0R;
    public final C57892uN A0S;
    public final C84084Ay A0T;
    public final AnonymousClass8JP A0U;
    public final C186568vZ A0V;
    public final AnonymousClass4FS A0W;

    public final void A01() {
        AnonymousClass316 r2 = this.A03;
        if (r2 == null) {
            C56612sH r1 = this.A0E;
            C54292oU r22 = this.A0F;
            AnonymousClass4FS r7 = this.A0W;
            AnonymousClass316 r0 = new AnonymousClass316(r1, r22, this.A0J, this.A0T, this.A0U, this.A0V, r7, "StartupTracker", 703928054);
            this.A03 = r0;
            r0.A0A.A05 = true;
            return;
        }
        r2.A0D("is_object_already_create", true, true);
    }

    public final void A02(int i, String str) {
        long j;
        String str2;
        AnonymousClass5ZC r1;
        C126216Mx r12;
        this.A00 = i;
        this.A08 = str;
        C58652vb r3 = this.A0K;
        if (i != 24772609) {
            r3.A00 = SystemClock.elapsedRealtime();
            r3.A01 = SystemClock.uptimeMillis();
            r3.A02 = System.nanoTime();
            j = -1;
            if (24772610 != i) {
                str2 = "warm";
            } else {
                str2 = "lukewarm";
            }
        } else {
            j = r3.A02;
            str2 = "cold";
        }
        AnonymousClass316 r8 = this.A03;
        if (r8 != null) {
            if (j > 0) {
                r8.A0F("StartupTracker", j);
            } else {
                r8.A0D.markerEnd(r8.A0A.A07, 4);
                r8.A0F("StartupTracker", -1);
            }
            this.A03.A0C("startup_type", true, str2);
        }
        Integer AzK = this.A0J.AzK(new C25111Zz(), this.A02, false);
        this.A06 = AzK;
        if (AzK != null) {
            int A0O2 = this.A0I.A0O(C58422vE.A02, 4216);
            C60972zT r2 = this.A0H;
            if (A0O2 < 0) {
                r2.A04(false);
            } else {
                r2.A04(true);
            }
        }
        switch (i) {
            case 24772609:
                r1 = this.A0O;
                break;
            case 24772610:
                r1 = this.A0Q;
                break;
            default:
                r1 = this.A0P;
                break;
        }
        boolean A002 = r1.A00();
        this.A0A = A002;
        if (A002 && this.A0D.A08(C66663Mh.A0o)) {
            C159837mX.A01(this.A0F.A00, i);
            if (C159837mX.A00 == 2 && (r12 = C159837mX.A01) != null) {
                MultiBufferLogger A003 = r12.A00();
                this.A05 = new C48732fN(A003);
                this.A04 = this.A0T.B02(A003);
                this.A07 = this.A05.A00(i);
            }
        }
    }

    public void A03(View view, Runnable runnable, String str, int i) {
        C70473aY r3 = new C70473aY(this, runnable, str, i, 10);
        view.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass3A5(this.A0B, view, r3));
    }

    public void A04(View view, Runnable runnable, String str, int i) {
        if (this.A00 != -1) {
            A09(str, "onRestart", "_start");
        } else if (!this.A09) {
            this.A09 = true;
            A01();
            A03(view, runnable, str, i);
            C18260x0.A0q("startuptracker/hot start/", str, AnonymousClass001.A0o());
            this.A01 = 2;
            this.A02 = this.A0N;
            A02(24772611, str);
        }
    }

    public void A05(String str) {
        if (this.A00 != -1) {
            Log.d("startuptracker/backgrounded abort");
            if (this.A0A) {
                int i = this.A00;
                if (C159837mX.A00 == 2) {
                    C158957kr r2 = C158957kr.A0A;
                    if (r2 == null) {
                        Log.d("profilo/control not enabled");
                    } else {
                        r2.A03(C156247gI.A02, 0, (long) i, 2);
                    }
                }
            }
            if (this.A03 != null && this.A0I.A0Y(C58422vE.A02, 1807)) {
                this.A03.A0C("abort_reason", true, str);
            }
            AnonymousClass316 r3 = this.A03;
            if (r3 != null) {
                r3.A0C("locale", true, this.A0G.A08());
                this.A03.A0E(105);
            }
            if (this.A06 != null) {
                this.A0H.A02();
            }
            this.A00 = -1;
            this.A08 = null;
            this.A0A = false;
            this.A07 = null;
        }
    }

    public void A06(String str) {
        AnonymousClass316 r0 = this.A03;
        if (r0 != null) {
            r0.A09(str);
        }
    }

    public void A07(String str) {
        AnonymousClass316 r0 = this.A03;
        if (r0 != null) {
            r0.A0A(str);
        }
    }

    public void A08(String str) {
        if (this.A00 != -1) {
            A09(str, "onCreate", "_start");
        } else if (!this.A09) {
            this.A09 = true;
            A01();
            C18260x0.A0q("startuptracker/warm start/", str, AnonymousClass001.A0o());
            this.A01 = 3;
            this.A02 = this.A0R;
            A02(24772610, str);
        }
    }

    public void A09(String str, String str2, String str3) {
        Long l;
        if (this.A00 != -1) {
            String A0T2 = AnonymousClass000.A0T(AnonymousClass000.A0V("_", str2, AnonymousClass000.A0l(str)), str3);
            C18260x0.A0q("startuptracker/stage:", A0T2, AnonymousClass001.A0o());
            if (this.A0A && (l = this.A07) != null) {
                C48732fN r0 = this.A05;
                long longValue = l.longValue();
                int i = this.A00;
                MultiBufferLogger multiBufferLogger = r0.A00;
                multiBufferLogger.writeBytesEntry(1, 83, multiBufferLogger.writeStandardEntry(7, 50, 0, 0, i, 0, longValue), A0T2);
            }
        }
    }

    public C56592sF(C55682qk r6, C66663Mh r7, C56612sH r8, C54292oU r9, C620733j r10, C60972zT r11, AnonymousClass1VX r12, AnonymousClass4FV r13, C58652vb r14, C45432a0 r15, C57892uN r16, C84084Ay r17, AnonymousClass8JP r18, C186568vZ r19, AnonymousClass4FS r20) {
        this.A0E = r8;
        this.A0I = r12;
        this.A0C = r6;
        this.A0F = r9;
        this.A0W = r20;
        this.A0J = r13;
        this.A0D = r7;
        this.A0K = r14;
        this.A0G = r10;
        this.A0L = r15;
        this.A0S = r16;
        this.A0T = r17;
        this.A0H = r11;
        this.A0V = r19;
        this.A0U = r18;
        this.A0M = new AnonymousClass5ZC(200, 1000);
        this.A0R = new AnonymousClass5ZC(2000, SearchActionVerificationClientService.NOTIFICATION_ID);
        this.A0N = new AnonymousClass5ZC(2000, SearchActionVerificationClientService.NOTIFICATION_ID);
    }

    public void A00() {
        AnonymousClass0RZ.A01("wa_startup_complete");
        AnonymousClass0RZ.A00();
        AnonymousClass316 r1 = this.A03;
        if (r1 != null) {
            r1.A09("render");
            AnonymousClass316 r3 = this.A03;
            if (r3 != null) {
                r3.A0C("locale", true, this.A0G.A08());
                this.A03.A0E(2);
            }
        }
    }
}
