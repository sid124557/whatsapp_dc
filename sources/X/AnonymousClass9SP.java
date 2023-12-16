package X;

import com.facebook.cameracore.ardelivery.listener.CancelableToken;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* renamed from: X.9SP  reason: invalid class name */
public class AnonymousClass9SP {
    public final AnonymousClass9V8 A00;
    public final /* synthetic */ AnonymousClass9TM A01;

    public AnonymousClass9SP(AnonymousClass9V8 r1, AnonymousClass9TM r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final AnonymousClass9V8 A00(AnonymousClass9V8 r6) {
        AnonymousClass9TM r4 = this.A01;
        Queue queue = r4.A0A;
        if (queue.isEmpty()) {
            if (r4.A00 != r6) {
                throw new IllegalStateException();
            }
        } else if (!((AnonymousClass9V8) queue.peek()).A01) {
            if (r4.A00 == r6) {
                Map map = r4.A08;
                if (((CancelableToken) map.get(r6)).cancel()) {
                    r6.A00(C192369Jj.PAUSED);
                    map.remove(r6);
                    r4.A00 = null;
                    queue.offer(r6);
                    return r6;
                }
            } else if (queue.remove(r6)) {
                queue.offer(r6);
                return null;
            } else {
                throw new IllegalStateException();
            }
        }
        return null;
    }

    public void A01(boolean z) {
        AnonymousClass9V8 r2;
        IllegalStateException illegalStateException;
        AnonymousClass9TM r4 = this.A01;
        synchronized (r4.A06) {
            AnonymousClass9V8 r22 = this.A00;
            C192369Jj r1 = r22.A00;
            if (r1 != C192369Jj.FINISHED && r1 != C192369Jj.CANCELLED && z != r22.A01) {
                r22.A01 = z;
                if (z) {
                    r2 = A00(r22);
                } else {
                    AnonymousClass9V8 r0 = r4.A00;
                    if (r0 != r22) {
                        if (r0 != null) {
                            Queue queue = r4.A0A;
                            if (queue.remove(r22)) {
                                queue.offer(r22);
                                AnonymousClass9V8 r12 = r4.A00;
                                if (r12.A01) {
                                    r2 = A00(r12);
                                }
                            } else {
                                illegalStateException = new IllegalStateException();
                            }
                        } else {
                            illegalStateException = new IllegalStateException();
                        }
                        throw illegalStateException;
                    }
                    r4.A01();
                    List A002 = r4.A00();
                    r4.A02(A002);
                }
                if (r2 != null) {
                    r4.A07.add(new C199789hF(r2, this));
                }
                r4.A01();
                List A0022 = r4.A00();
                r4.A02(A0022);
            }
        }
    }
}
