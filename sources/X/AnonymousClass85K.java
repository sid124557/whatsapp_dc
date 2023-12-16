package X;

import android.os.Handler;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.85K  reason: invalid class name */
public class AnonymousClass85K implements C186528vV {
    public final WeakReference A00;

    public void BOU(C166537yr r14, String str, String str2, String str3, String str4, long j, boolean z) {
        C166537yr r5 = r14;
        BYO(r14);
        C162997t6 A002 = A00(this);
        if (A002 != null) {
            A002.A0J("onCancelled", AnonymousClass4L0.A0U());
            A002.A0E.BfE(AnonymousClass6CA.A0L(A002), r5, str, str2, str3, str4, j, z);
            A002.A02.A00("onCancelled");
        }
    }

    public void BcI(C166537yr r16, String str, String str2, String str3, String str4, String str5, long j, boolean z, boolean z2) {
        C162997t6 A002 = A00(this);
        if (A002 != null) {
            A002.A0A = false;
            C166537yr r5 = r16;
            C162997t6.A00(A002, r5, false);
            A002.A0J("onStartedPlaying", new Object[0]);
            A002.A0E.BfT(AnonymousClass6CA.A0L(A002), r5, str, (String) null, str3, str4, str5, j, false, false);
            A002.A02.A00("onStartedPlaying");
        }
    }

    public static C162997t6 A00(AnonymousClass85K r0) {
        return (C162997t6) r0.A00.get();
    }

    public AnonymousClass85K(C162997t6 r2) {
        this.A00 = AnonymousClass0x9.A14(r2);
    }

    public void BNn(C166537yr r13, C166427yf r14, boolean z) {
        long j;
        C162997t6 A002 = A00(this);
        if (A002 != null) {
            C166537yr r6 = r13;
            C162997t6.A00(A002, r13, false);
            A002.A0J("onBufferingStarted", new Object[0]);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean A1V = AnonymousClass001.A1V(((elapsedRealtime - A002.A0R) > ((long) A002.A05.stallFromSeekThresholdMs) ? 1 : ((elapsedRealtime - A002.A0R) == ((long) A002.A05.stallFromSeekThresholdMs) ? 0 : -1)));
            long j2 = A002.A01;
            if (j2 != -1) {
                j = elapsedRealtime - j2;
            } else {
                j = -1;
            }
            A002.A0E.BcA(r14, r6, A002.A06, j, z, A1V);
        }
    }

    public void BNo(C166537yr r2, boolean z) {
        C162997t6 A002 = A00(this);
        if (A002 != null) {
            C162997t6.A00(A002, r2, z);
        }
    }

    public void BPY(C166537yr r12, String str, boolean z) {
        C142486xH r5;
        C162997t6 A002 = A00(this);
        if (A002 != null) {
            C166537yr r7 = r12;
            C162997t6.A00(A002, r12, false);
            A002.A0J("onCompletion", new Object[0]);
            C147697Fh A05 = A002.A05();
            String str2 = r12.A0N;
            if (str2 != null) {
                r5 = C142486xH.valueOf(str2);
            } else {
                r5 = C142486xH.UNKNOWN;
            }
            A002.A0G(r12);
            A002.A0E.BfG(A05, r5, AnonymousClass6CA.A0L(A002), r7, str, z, A002.A0T);
        }
    }

    public void BQi(long j, String str, boolean z) {
        C162997t6 A002 = A00(this);
        if (A002 != null) {
            Object[] A1Z = AnonymousClass6C9.A1Z(str, 3);
            AnonymousClass6C7.A1V(A1Z, 1, z);
            AnonymousClass000.A1Q(A1Z, 2, j);
            A002.A0J("onDecoderInitialized name: %s, isVideo %s, duration: %d", A1Z);
            A002.A0E.BQi(j, str, z);
        }
    }

    public void BRg() {
        C162997t6 A002 = A00(this);
        if (A002 != null) {
            A002.A0J("onDrawnToSurface", AnonymousClass4L0.A0U());
            A002.A0E.BRg();
        }
    }

    public void BRs(String str, String str2) {
        C162997t6 A002 = A00(this);
        if (A002 != null) {
            A002.A0E.BfL(str, str2);
        }
    }

    public void BSJ(String str, String str2, String str3, String str4, String str5, String str6) {
        C147697Fh r8;
        C162997t6 A002 = A00(this);
        if (A002 != null) {
            C142846xt A003 = C142846xt.A00(str);
            C142876xw A004 = C142876xw.A00(str2);
            A002.A0J("onError", new Object[0]);
            String str7 = str3;
            String str8 = str4;
            String str9 = str5;
            if (A004 == C142876xw.A0G) {
                Handler handler = A002.A0C;
                String[] strArr = new String[5];
                strArr[0] = A003.name();
                strArr[1] = "RESPONSE_CODE_410";
                AnonymousClass6C7.A19(str7, str8, str9, strArr);
                AnonymousClass6C7.A10(handler, strArr, 17);
                return;
            }
            if (A002.A05.logStallOnPauseOnError) {
                r8 = A002.A05();
            } else {
                r8 = null;
            }
            AnonymousClass85C r7 = A002.A0E;
            C166537yr A0W = AnonymousClass6C8.A0W(A002);
            r7.BYD(r8, new C160117n4(A004, A003, str7, str8), AnonymousClass6CA.A0L(A002), A0W, str9, str6);
            A002.A02.A00("onError");
        }
    }

    public void BST(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C162997t6 A002 = A00(this);
        if (A002 != null) {
            C142846xt A003 = C142846xt.A00(str);
            C142876xw A004 = C142876xw.A00(str2);
            long A02 = A002.A02();
            String str8 = str6;
            A002.A0J("onErrorRecoveryAttempt reason: %s", AnonymousClass000.A1b(str8));
            A002.A0E.BSU(new C160117n4(A004, A003, str3, str4), str5, str8, str7, A02);
        }
    }

    public void BVD(boolean z) {
        C162997t6 A002 = A00(this);
        if (A002 != null) {
            A002.A0J("onLiveBroadcastInterruptStatusChanged", AnonymousClass4L0.A0U());
            A002.A0E.BVD(z);
        }
    }

    public void BVE(C166427yf r10) {
        int i;
        AnonymousClass85C r1;
        boolean z;
        C162997t6 A002 = A00(this);
        if (A002 != null) {
            C162997t6 r7 = A002.A0D.A0B;
            AtomicReference atomicReference = r7.A0J;
            synchronized (atomicReference) {
                C166427yf r8 = (C166427yf) atomicReference.get();
                TreeMap treeMap = r7.A0I;
                if (treeMap.isEmpty() || (i = r10.A00) != r8.A00) {
                    Long valueOf = Long.valueOf(r10.A09);
                    i = r10.A00;
                    AnonymousClass0x2.A1I(valueOf, treeMap, i);
                }
                if (r8.A09 <= r10.A09) {
                    atomicReference.set(r10);
                }
                int i2 = r7.A05.staleManifestThreshold;
                int i3 = r8.A00;
                if (i3 < i2 && i >= i2) {
                    r1 = r7.A0E;
                    z = true;
                } else if (i3 >= i2 && i < i2) {
                    r1 = r7.A0E;
                    z = false;
                }
                r1.Bcu(z);
            }
        }
    }

    public void BWz(byte[] bArr) {
        C162997t6 A002 = A00(this);
        if (A002 != null) {
            A002.A0J("onNewPCMBuffer", AnonymousClass4L0.A0U());
            A002.A0E.BWz(bArr);
        }
    }

    public void BXk(C166537yr r18, String str, String str2, String str3, long j, boolean z) {
        long j2;
        C162997t6 A002 = A00(this);
        if (A002 != null) {
            AnonymousClass8LG r1 = A002.A05;
            C166537yr r8 = r18;
            if (r1.logPausedSeekPositionBeforeSettingState) {
                j2 = r8.A00();
            } else {
                j2 = 0;
            }
            C162997t6.A00(A002, r8, false);
            if (!r1.logPausedSeekPositionBeforeSettingState) {
                j2 = r8.A00();
            }
            A002.A0J("onPaused", new Object[0]);
            C147697Fh A05 = A002.A05();
            A002.A0E.BfO(A05, C142486xH.valueOf(r8.A0N), AnonymousClass6CA.A0L(A002), r8, str, str2, str3, j2, j, z);
            A002.A02.A00("onPaused");
            A002.A0A = false;
        }
    }

    public void BYB() {
        C162997t6 A002 = A00(this);
        if (A002 != null) {
            A002.A0J("onPlaybackAboutToFinish", AnonymousClass4L0.A0U());
            A002.A0E.BYB();
        }
    }

    public void BYF(float f) {
        C162997t6 A002 = A00(this);
        if (A002 != null) {
            A002.A0J("onPlaybackSpeedChanged", AnonymousClass4L0.A0U());
            A002.A0E.BYG(AnonymousClass6C8.A0W(A002), f, A002.A02());
        }
    }

    public void BYO(C166537yr r3) {
        C162997t6 A002 = A00(this);
        if (A002 != null) {
            C162997t6.A00(A002, r3, false);
        }
    }

    public void BYm(C166537yr r4, String str) {
        C162997t6 A002 = A00(this);
        if (A002 != null) {
            C162997t6.A00(A002, r4, false);
            A002.A0J("onPrepared", new Object[0]);
            A002.A0E.BYm(r4, str);
            A002.A02.A00("onPrepared");
        }
    }

    public void BZl(boolean z) {
        String str;
        C162997t6 A002 = A00(this);
        if (A002 != null && AnonymousClass000.A1S((A002.A0O > 0 ? 1 : (A002.A0O == 0 ? 0 : -1)))) {
            Object[] A0L = AnonymousClass002.A0L();
            if (z) {
                str = "evicted";
            } else {
                str = "released";
            }
            A0L[0] = str;
            A002.A0J("Service player was %s", A0L);
            AnonymousClass6C7.A10(A002.A0C, Boolean.valueOf(z), 12);
        }
    }

    public void Bb6(C166537yr r4, long j) {
        C162997t6 A002 = A00(this);
        if (A002 != null) {
            C162997t6.A00(A002, r4, false);
            A002.A0J("onSeeking", new Object[0]);
            A002.A0E.Bb5(j);
        }
    }

    public void BbN(long j) {
        C162997t6 A002 = A00(this);
        if (A002 == null) {
            return;
        }
        if (A002.A05.enableBackgroundServicePlayerReuse) {
            AnonymousClass6C8.A0z(A002, "setRebindServicePlayerListener");
            Handler handler = A002.A0C;
            handler.sendMessage(handler.obtainMessage(32));
            return;
        }
        AnonymousClass6C8.A0z(A002, "setRebindServicePlayerListener: message not sent to internal player");
    }

    public void Bcs() {
        C147697Fh r1;
        C162997t6 A002 = A00(this);
        if (A002 != null) {
            A002.A0J("onStopped", AnonymousClass4L0.A0U());
            C152777a6 r0 = A002.A0D.A05;
            if (r0 == null || !"WA_BOT".equals(r0.A07)) {
                r1 = null;
            } else {
                r1 = A002.A05();
            }
            A002.A0E.Bct(r1);
        }
    }

    public void BeA(List list) {
        C162997t6 A002 = A00(this);
        if (A002 != null) {
            A002.A0J("onWarn", AnonymousClass4L0.A0U());
            A002.A0E.BeA(list);
        }
    }

    public void BfR(float f, int i, int i2, int i3) {
        C162997t6 A002 = A00(this);
        if (A002 != null) {
            Object[] A0M = AnonymousClass002.A0M();
            C18270x1.A1Q(A0M, i);
            AnonymousClass000.A1P(A0M, i2, 1);
            A002.A0J("onVideoSizeChanged: w=%d, h=%d", A0M);
            A002.A0E.BfR(f, i, i2, i3);
        }
    }

    public void Bfh(String str, String str2, String str3) {
        C162997t6 A002 = A00(this);
        if (A002 != null) {
            C142846xt A003 = C142846xt.A00(str);
            C142876xw A004 = C142876xw.A00(str2);
            A002.A0J("onWarn", AnonymousClass4L0.A0U());
            A002.A0E.Bfg(new C160117n4(A004, A003, str3));
        }
    }
}
