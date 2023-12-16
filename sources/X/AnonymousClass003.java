package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.003  reason: invalid class name */
public final class AnonymousClass003 extends Animator {
    public long A00;
    public long A01;
    public final C02220Fi A02;
    public final List A03;

    public final long A01() {
        Comparable comparable;
        List<Animator> list = this.A03;
        ArrayList A0I = AnonymousClass002.A0I(C73783g4.A0b(list, 10));
        for (Animator A002 : list) {
            A0I.add(Long.valueOf(AnonymousClass0YD.A00(A002)));
        }
        Iterator it = A0I.iterator();
        if (!it.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) < 0) {
                    comparable = comparable2;
                }
            }
        }
        Number number = (Number) comparable;
        if (number != null) {
            return number.longValue();
        }
        return 0;
    }

    public void cancel() {
        for (Animator cancel : this.A03) {
            cancel.cancel();
        }
        A02(new C14250pC(this));
    }

    public void end() {
        for (Animator end : this.A03) {
            end.end();
        }
    }

    public long getDuration() {
        return this.A00;
    }

    public long getStartDelay() {
        return this.A01;
    }

    public long getTotalDuration() {
        long j = this.A00;
        if (!AnonymousClass000.A1T((j > -1 ? 1 : (j == -1 ? 0 : -1)))) {
            return j + this.A01;
        }
        return j;
    }

    public boolean isRunning() {
        for (Animator isRunning : this.A03) {
            if (isRunning.isRunning()) {
                return true;
            }
        }
        return false;
    }

    public boolean isStarted() {
        for (Animator isStarted : this.A03) {
            if (isStarted.isStarted()) {
                return true;
            }
        }
        return false;
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        for (Animator interpolator : this.A03) {
            interpolator.setInterpolator(timeInterpolator);
        }
    }

    public void setStartDelay(long j) {
        this.A01 = j;
        for (Animator animator : this.A03) {
            if (animator instanceof AnonymousClass003) {
                animator.setStartDelay(j);
            } else {
                AnonymousClass0YD.A03(animator, j);
            }
        }
    }

    public void start() {
        List<Animator> list = this.A03;
        for (Animator start : list) {
            start.start();
        }
        A02(new C14260pD(this));
        if (list.isEmpty()) {
            A02(new C14270pE(this));
        }
    }

    public AnonymousClass003(C02220Fi r9, List list) {
        Object next;
        this.A02 = r9;
        this.A03 = list;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            long A012 = AnonymousClass0YD.A01((Animator) it.next());
            if (A012 == -1) {
                this.A00 = -1;
                break;
            }
            this.A00 = Math.max(this.A00, A012);
        }
        if (this.A00 != -1 && (!this.A03.isEmpty())) {
            int ordinal = this.A02.ordinal();
            if (ordinal == 0 || ordinal == 2) {
                Iterator it2 = this.A03.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        long A013 = AnonymousClass0YD.A01((Animator) next);
                        do {
                            Object next2 = it2.next();
                            long A014 = AnonymousClass0YD.A01((Animator) next2);
                            if (A013 < A014) {
                                next = next2;
                                A013 = A014;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    throw new NoSuchElementException();
                }
            } else if (ordinal == 1) {
                next = C73723fy.A05(this.A03);
            } else {
                throw new C73153f1();
            }
            ((Animator) next).addListener(new C17440va(this, 6));
        }
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

    public void pause() {
        super.pause();
        if (isPaused()) {
            for (Animator pause : this.A03) {
                pause.pause();
            }
        }
    }

    public void resume() {
        super.resume();
        if (!isPaused()) {
            for (Animator resume : this.A03) {
                resume.resume();
            }
        }
    }

    public Animator setDuration(long j) {
        return this;
    }
}
