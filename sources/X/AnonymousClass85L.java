package X;

import java.util.List;

/* renamed from: X.85L  reason: invalid class name */
public class AnonymousClass85L implements C186528vV {
    public final C162987t5 A00;
    public volatile C186528vV A01;

    public void BSJ(String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            this.A01.BSJ(str, str2, str3, str4, str5, str6);
        } catch (IllegalStateException e) {
            C159597m9.A01(this.A00, "Failed to send onError(errorCode = %s) callback", e, AnonymousClass000.A1b(str2));
        }
    }

    public void BXk(C166537yr r12, String str, String str2, String str3, long j, boolean z) {
        try {
            this.A01.BXk(r12, str, str2, str3, j, z);
        } catch (IllegalStateException e) {
            C162987t5 r2 = this.A00;
            Object[] A0L = AnonymousClass002.A0L();
            AnonymousClass001.A1R(A0L, r12.A0R);
            C159597m9.A01(r2, "Failed to send onPaused(isPlaying = %s) callback", e, A0L);
        }
    }

    public void BcI(C166537yr r15, String str, String str2, String str3, String str4, String str5, long j, boolean z, boolean z2) {
        try {
            this.A01.BcI(r15, str, (String) null, str3, str4, str5, j, false, false);
        } catch (IllegalStateException e) {
            C162987t5 r2 = this.A00;
            Object[] A0L = AnonymousClass002.A0L();
            AnonymousClass6C7.A1V(A0L, 0, r15.A0R);
            C159597m9.A01(r2, "Failed to send onStartedPlaying(isPlaying = %s) callback", e, A0L);
        }
    }

    public void BNn(C166537yr r5, C166427yf r6, boolean z) {
        try {
            this.A01.BNn(r5, r6, z);
        } catch (IllegalStateException e) {
            C162987t5 r2 = this.A00;
            Object[] A0L = AnonymousClass002.A0L();
            AnonymousClass001.A1R(A0L, r5.A0R);
            C159597m9.A01(r2, "Failed to send onBufferingStarted(isPlaying = %s) callback", e, A0L);
        }
    }

    public void BNo(C166537yr r5, boolean z) {
        try {
            this.A01.BNo(r5, z);
        } catch (IllegalStateException e) {
            C162987t5 r2 = this.A00;
            Object[] A0L = AnonymousClass002.A0L();
            AnonymousClass001.A1R(A0L, r5.A0R);
            C159597m9.A01(r2, "Failed to send onBufferingStopped(isPlaying = %s) callback", e, A0L);
        }
    }

    public void BOU(C166537yr r10, String str, String str2, String str3, String str4, long j, boolean z) {
        try {
            this.A01.BOU(r10, str, str2, str3, str4, j, z);
        } catch (IllegalStateException e) {
            C159597m9.A01(this.A00, "Failed send onCancelled() callback", e, AnonymousClass4L0.A0U());
        }
    }

    public void BPY(C166537yr r5, String str, boolean z) {
        try {
            this.A01.BPY(r5, str, z);
        } catch (IllegalStateException e) {
            C162987t5 r2 = this.A00;
            Object[] A0L = AnonymousClass002.A0L();
            AnonymousClass001.A1R(A0L, r5.A0R);
            C159597m9.A01(r2, "Failed to send onCompletion(isPlaying = %s) callback", e, A0L);
        }
    }

    public void BQi(long j, String str, boolean z) {
        try {
            this.A01.BQi(j, str, z);
        } catch (IllegalStateException e) {
            C159597m9.A01(this.A00, "Failed to send decoder initialized callback", e, AnonymousClass4L0.A0U());
        }
    }

    public void BRg() {
        try {
            this.A01.BRg();
        } catch (IllegalStateException e) {
            C159597m9.A01(this.A00, "Failed to send onDrawnToSurface callback", e, AnonymousClass4L0.A0U());
        }
    }

    public void BRs(String str, String str2) {
        try {
            this.A01.BRs(str, str2);
        } catch (IllegalStateException e) {
            C159597m9.A01(this.A00, "Failed send onEncodedFrameDataReceived() callback", e, AnonymousClass4L0.A0U());
        }
    }

    public void BST(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        try {
            this.A01.BST(str, str2, str3, str4, str5, str6, str7);
        } catch (IllegalStateException e) {
            C159597m9.A01(this.A00, "Failed send onErrorRecoveryAttempt() callback", e, AnonymousClass4L0.A0U());
        }
    }

    public void BVD(boolean z) {
        try {
            this.A01.BVD(z);
        } catch (IllegalStateException e) {
            C159597m9.A01(this.A00, "Failed to send onLiveInterrupt callback", e, AnonymousClass4L0.A0U());
        }
    }

    public void BVE(C166427yf r5) {
        try {
            this.A01.BVE(r5);
        } catch (IllegalStateException e) {
            C159597m9.A01(this.A00, "Failed to send live state update", e, AnonymousClass4L0.A0U());
        }
    }

    public void BWz(byte[] bArr) {
        try {
            this.A01.BWz(bArr);
        } catch (IllegalStateException e) {
            C159597m9.A01(this.A00, "Failed to send onNewPCMBuffer callback", e, AnonymousClass4L0.A0U());
        }
    }

    public void BYB() {
        try {
            this.A01.BYB();
        } catch (IllegalStateException e) {
            C159597m9.A01(this.A00, "Failed to send onPlaybackAboutToFinish callback", e, AnonymousClass4L0.A0U());
        }
    }

    public void BYF(float f) {
        try {
            this.A01.BYF(f);
        } catch (IllegalStateException e) {
            C159597m9.A01(this.A00, "Failed to send onLiveTraceFrameEvent callback", e, AnonymousClass4L0.A0U());
        }
    }

    public void BYO(C166537yr r5) {
        try {
            this.A01.BYO(r5);
        } catch (IllegalStateException e) {
            C162987t5 r2 = this.A00;
            Object[] A0L = AnonymousClass002.A0L();
            AnonymousClass001.A1R(A0L, r5.A0R);
            C159597m9.A01(r2, "Failed to send onPlayerStateUpdate(isPlaying = %s) callback", e, A0L);
        }
    }

    public void BYm(C166537yr r5, String str) {
        try {
            this.A01.BYm(r5, str);
        } catch (IllegalStateException e) {
            C159597m9.A01(this.A00, "Failed to send onPrepared callback", e, AnonymousClass4L0.A0U());
        }
    }

    public void BZl(boolean z) {
        try {
            this.A01.BZl(z);
        } catch (IllegalStateException e) {
            C162987t5 r2 = this.A00;
            Object[] A0L = AnonymousClass002.A0L();
            AnonymousClass6C7.A1V(A0L, 0, z);
            C159597m9.A01(r2, "Failed to send onRelease(isEvicted = %s) callback", e, A0L);
        }
    }

    public void Bb6(C166537yr r5, long j) {
        try {
            this.A01.Bb6(r5, j);
        } catch (IllegalStateException e) {
            C159597m9.A01(this.A00, "Failed to send onSeeking callback", e, AnonymousClass4L0.A0U());
        }
    }

    public void BbN(long j) {
        try {
            this.A01.BbN(j);
        } catch (IllegalStateException e) {
            C159597m9.A01(this.A00, "Failed send onServicePlayerListenerDetached() callback", e, AnonymousClass4L0.A0U());
        }
    }

    public void Bcs() {
        this.A01.Bcs();
    }

    public void BeA(List list) {
        try {
            this.A01.BeA(list);
        } catch (IllegalStateException e) {
            C159597m9.A01(this.A00, "Failed to send gaps changed callback", e, AnonymousClass4L0.A0U());
        }
    }

    public void BfR(float f, int i, int i2, int i3) {
        try {
            this.A01.BfR(f, i, i2, i3);
        } catch (IllegalStateException e) {
            C162987t5 r2 = this.A00;
            Object[] A0M = AnonymousClass002.A0M();
            C18270x1.A1Q(A0M, i);
            AnonymousClass000.A1P(A0M, i2, 1);
            C159597m9.A01(r2, "Failed to send onVideoSizeChanged(width = %d, height = %d) callback", e, A0M);
        }
    }

    public void Bfh(String str, String str2, String str3) {
        try {
            this.A01.Bfh(str, str2, str3);
        } catch (IllegalStateException e) {
            C159597m9.A01(this.A00, "Failed to send onWarn callback", e, AnonymousClass4L0.A0U());
        }
    }

    public AnonymousClass85L(C186528vV r2, C162987t5 r3) {
        if (r2 != null) {
            this.A00 = r3;
            this.A01 = r2;
            return;
        }
        throw AnonymousClass001.A0c("HeroServicePlayerListener cannot be null");
    }
}
