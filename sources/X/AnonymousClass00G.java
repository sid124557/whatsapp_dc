package X;

import android.animation.ValueAnimator;
import android.view.animation.AnimationUtils;

/* renamed from: X.00G  reason: invalid class name */
public class AnonymousClass00G extends ValueAnimator {
    public long A00;
    public long A01;
    public long A02 = -1;
    public long A03 = -1;
    public long A04;
    public long A05;
    public long A06 = -1;
    public final C17440va A07;

    public static final /* synthetic */ void A01(AnonymousClass00G r4) {
        r4.A06 = -1;
        r4.A03 = -1;
        r4.A04 = 0;
        r4.A02 = -1;
        r4.A00 = 0;
        super.setStartDelay(r4.A05);
        r4.A01 = 0;
    }

    public long getCurrentPlayTime() {
        long j;
        if (this.A06 == -1) {
            long j2 = this.A04;
            if (j2 != -1) {
                return j2;
            }
            return 0;
        } else if (isPaused() && this.A03 > this.A02) {
            return this.A04;
        } else {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j3 = this.A01;
            if (j3 == 0) {
                long j4 = (this.A04 + currentAnimationTimeMillis) - this.A06;
                boolean isPaused = isPaused();
                long j5 = this.A00;
                if (isPaused) {
                    j5 = (j5 + AnimationUtils.currentAnimationTimeMillis()) - this.A02;
                }
                j = j4 - j5;
            } else {
                j = this.A05 + j3;
            }
            long duration = this.A05 + getDuration();
            if (j > duration) {
                return duration;
            }
            return j;
        }
    }

    public long getStartDelay() {
        return this.A05;
    }

    public long getTotalDuration() {
        return this.A05 + getDuration();
    }

    public void setCurrentPlayTime(long j) {
        long A012 = C175708Zk.A01(j, 0, this.A05 + getDuration());
        this.A03 = AnimationUtils.currentAnimationTimeMillis();
        this.A04 = A012;
        long j2 = this.A05;
        if (A012 < j2) {
            super.setStartDelay(j2 - A012);
            if (isPaused()) {
                super.setCurrentPlayTime(0);
            } else if (this.A01 > 0) {
                start();
            }
        } else {
            super.setStartDelay(0);
            super.setCurrentPlayTime(A012 - j2);
        }
    }

    public AnonymousClass00G() {
        C17440va r2 = new C17440va(this, 7);
        this.A07 = r2;
        super.addListener(r2);
        super.addUpdateListener(new C02910Ib(this, 4));
    }

    public void pause() {
        boolean isPaused = isPaused();
        super.pause();
        if (!isPaused && isPaused()) {
            this.A02 = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public void resume() {
        boolean isPaused = isPaused();
        super.resume();
        if (isPaused && !isPaused()) {
            this.A00 += AnimationUtils.currentAnimationTimeMillis() - this.A02;
            this.A02 = -1;
        }
    }

    public void setStartDelay(long j) {
        super.setStartDelay(j);
        this.A05 = j;
    }

    public void start() {
        super.start();
        this.A06 = AnimationUtils.currentAnimationTimeMillis();
        this.A02 = -1;
        this.A00 = 0;
        this.A01 = 0;
    }
}
