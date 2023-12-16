package X;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.0eh  reason: invalid class name and case insensitive filesystem */
public class C08570eh implements AnonymousClass0u9 {
    public final /* synthetic */ AnonymousClass09T A00;

    public C08570eh(AnonymousClass09T r1) {
        this.A00 = r1;
    }

    public boolean BUh(MotionEvent motionEvent, RecyclerView recyclerView) {
        int findPointerIndex;
        AnonymousClass09T r3 = this.A00;
        r3.A0G.A00(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            r3.A09 = motionEvent.getPointerId(0);
            r3.A02 = motionEvent.getX();
            r3.A03 = motionEvent.getY();
            VelocityTracker velocityTracker = r3.A0E;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            r3.A0E = VelocityTracker.obtain();
            if (r3.A0J == null) {
                List list = r3.A0M;
                if (!list.isEmpty()) {
                    View A06 = r3.A06(motionEvent);
                    int size = list.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        C06580Yj r7 = (C06580Yj) list.get(size);
                        C05570Ua r6 = r7.A0C;
                        View view = r6.A0H;
                        if (view == A06) {
                            r3.A02 -= r7.A01;
                            r3.A03 -= r7.A02;
                            r3.A0B(r6, true);
                            if (r3.A0Q.remove(view)) {
                                AnonymousClass0WG.A00(r6);
                            }
                            r3.A0A(r6, r7.A0A);
                            r3.A08(motionEvent, r3.A0A, 0);
                        }
                    }
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            r3.A09 = -1;
            r3.A0A((C05570Ua) null, 0);
        } else {
            int i = r3.A09;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                r3.A07(motionEvent, actionMasked, findPointerIndex);
            }
        }
        VelocityTracker velocityTracker2 = r3.A0E;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (r3.A0J == null) {
            return false;
        }
        return true;
    }

    public void Ba3(boolean z) {
        if (z) {
            this.A00.A0A((C05570Ua) null, 0);
        }
    }

    public void BeG(MotionEvent motionEvent, RecyclerView recyclerView) {
        AnonymousClass09T r3 = this.A00;
        r3.A0G.A00(motionEvent);
        VelocityTracker velocityTracker = r3.A0E;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (r3.A09 != -1) {
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(r3.A09);
            if (findPointerIndex >= 0) {
                r3.A07(motionEvent, actionMasked, findPointerIndex);
            }
            C05570Ua r1 = r3.A0J;
            if (r1 != null) {
                int i = 0;
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            VelocityTracker velocityTracker2 = r3.A0E;
                            if (velocityTracker2 != null) {
                                velocityTracker2.clear();
                            }
                        } else if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == r3.A09) {
                                if (actionIndex == 0) {
                                    i = 1;
                                }
                                r3.A09 = motionEvent.getPointerId(i);
                                r3.A08(motionEvent, r3.A0A, actionIndex);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    } else if (findPointerIndex >= 0) {
                        r3.A08(motionEvent, r3.A0A, findPointerIndex);
                        r3.A09(r1);
                        RecyclerView recyclerView2 = r3.A0K;
                        Runnable runnable = r3.A0P;
                        recyclerView2.removeCallbacks(runnable);
                        runnable.run();
                        r3.A0K.invalidate();
                        return;
                    } else {
                        return;
                    }
                }
                r3.A0A((C05570Ua) null, 0);
                r3.A09 = -1;
            }
        }
    }
}
