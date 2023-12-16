package X;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.concurrent.locks.Lock;

/* renamed from: X.6VU  reason: invalid class name */
public final class AnonymousClass6VU extends C124806Dy {
    public final /* synthetic */ C1694389h A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6VU(Looper looper, C1694389h r2) {
        super(looper);
        this.A00 = r2;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            AnonymousClass7RM r2 = (AnonymousClass7RM) message.obj;
            C1694389h r0 = this.A00;
            Lock lock = r0.A0D;
            lock.lock();
            try {
                if (r0.A0E == r2.A00) {
                    if (r2 instanceof AnonymousClass6RA) {
                        AnonymousClass6RA r22 = (AnonymousClass6RA) r2;
                        C1693989d r3 = r22.A00;
                        AnonymousClass6SF r1 = r22.A01;
                        if (r3.A07(0)) {
                            C127866Tp r5 = r1.A01;
                            if (r5.A01 == 0) {
                                AnonymousClass6T1 r12 = r1.A02;
                                C162177rO.A02(r12);
                                r5 = r12.A02;
                                if (r5.A01 == 0) {
                                    r3.A08 = true;
                                    IAccountAccessor A002 = r12.A00();
                                    C162177rO.A02(A002);
                                    r3.A04 = A002;
                                    r3.A09 = r12.A03;
                                    r3.A0A = r12.A04;
                                } else {
                                    String valueOf = String.valueOf(r5);
                                    Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                                    r3.A03(r5);
                                }
                            } else {
                                if (r3.A06 && !r5.A01()) {
                                    r3.A00();
                                }
                                r3.A03(r5);
                            }
                            r3.A02();
                        }
                    } else if (r2 instanceof AnonymousClass6R8) {
                        ((AnonymousClass6R8) r2).A00.Ba1(new C127866Tp(16, (PendingIntent) null));
                    } else if (r2 instanceof AnonymousClass6R9) {
                        AnonymousClass6R9 r23 = (AnonymousClass6R9) r2;
                        ((C1693989d) r23.A01.A00).A03(r23.A00);
                    } else {
                        ((AnonymousClass6R7) r2).A00.Bt5(1);
                    }
                }
            } finally {
                lock.unlock();
            }
        } else if (i != 2) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Unknown message id: ");
            A0o.append(i);
            AnonymousClass6C7.A1A(A0o, "GACStateManager");
        } else {
            throw ((Throwable) message.obj);
        }
    }
}
