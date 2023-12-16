package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import java.util.ArrayList;

/* renamed from: X.004  reason: invalid class name */
public final class AnonymousClass004 extends Animator {
    public int A00;
    public long A01;
    public boolean A02;
    public final int A03;
    public final long A04;
    public final Animator A05;

    public AnonymousClass004(Animator animator, C153427bI r4, int i) {
        C162457s7.A0J(animator, 2);
        C162377rs.A07(animator, r4);
        this.A05 = animator;
        this.A04 = AnonymousClass0YD.A01(animator);
        this.A03 = i;
        if (i > 0 || i == -1) {
            animator.addListener(new AnonymousClass00B(this, i));
        }
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        C162457s7.A0J(timeInterpolator, 0);
        this.A05.setInterpolator(timeInterpolator);
    }

    public void start() {
        this.A00 = 0;
        this.A02 = false;
        long j = this.A01;
        if (j != 0) {
            AnonymousClass0YD.A03(this.A05, j);
        }
        this.A05.start();
    }

    public final void A01(long j) {
        long A012 = C175708Zk.A01(j, 0, getDuration());
        long j2 = this.A04;
        this.A00 = (int) (A012 / j2);
        AnonymousClass0YD.A04(this.A05, A012 % j2);
    }

    public void cancel() {
        this.A05.cancel();
    }

    public void end() {
        this.A05.end();
    }

    public long getDuration() {
        int i = this.A03;
        if (i == -1) {
            return -1;
        }
        long j = this.A04;
        if (j != -1) {
            return j * ((long) i);
        }
        return -1;
    }

    public long getStartDelay() {
        return this.A01;
    }

    public long getTotalDuration() {
        int i = this.A03;
        if (i == -1) {
            return -1;
        }
        long j = this.A04;
        if (j != -1) {
            return (j * ((long) i)) + this.A01;
        }
        return -1;
    }

    public boolean isPaused() {
        return this.A05.isPaused();
    }

    public boolean isRunning() {
        return this.A05.isRunning();
    }

    public void pause() {
        this.A05.pause();
    }

    public void resume() {
        this.A05.resume();
    }

    public final void A02(AnonymousClass4GQ r3) {
        ArrayList<Animator.AnimatorListener> listeners = getListeners();
        if (listeners != null) {
            for (Object next : C73723fy.A0F(listeners)) {
                C162457s7.A0B(next);
                r3.invoke(next);
            }
        }
    }

    public Animator setDuration(long j) {
        return this;
    }

    public void setStartDelay(long j) {
        this.A01 = j;
    }
}
