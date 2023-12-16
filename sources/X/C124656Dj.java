package X;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Dj  reason: invalid class name and case insensitive filesystem */
public class C124656Dj extends Handler {
    public final /* synthetic */ C1674080y A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C124656Dj(Looper looper, C1674080y r2) {
        super(looper);
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        List<C1674080y> list;
        int i = message.what;
        if (i == 0) {
            C1674080y r2 = this.A00;
            Object obj = message.obj;
            int i2 = r2.A01;
            if (i2 == 2 || i2 == 3 || i2 == 4) {
                if (obj instanceof Exception) {
                    Exception exc = (Exception) obj;
                    list = r2.A0A.A05;
                    for (C1674080y A01 : list) {
                        A01.A01(exc, 3);
                    }
                } else {
                    try {
                        r2.A0B.A09((byte[]) obj);
                        list = r2.A0A.A05;
                        for (C1674080y r1 : list) {
                            if (r1.A03(false)) {
                                r1.A02(true);
                            }
                        }
                    } catch (Exception e) {
                        list = r2.A0A.A05;
                        for (C1674080y A012 : list) {
                            A012.A01(e, 1);
                        }
                    }
                }
                list.clear();
            }
        } else if (i == 1) {
            C1674080y r22 = this.A00;
            Object obj2 = message.obj;
            int i3 = r22.A01;
            if (i3 == 3 || i3 == 4) {
                if (obj2 instanceof Exception) {
                    Exception exc2 = (Exception) obj2;
                    if (!(exc2 instanceof NotProvisionedException)) {
                        r22.A01(exc2, 1);
                        return;
                    }
                } else {
                    try {
                        byte[] bArr = (byte[]) obj2;
                        if (C155567f7.A00.equals(r22.A0E)) {
                            bArr = AnonymousClass70w.A00(bArr);
                        }
                        byte[] A0C = r22.A0B.A0C(r22.A07, bArr);
                        if (!(r22.A06 == null || A0C == null || A0C.length == 0)) {
                            r22.A06 = A0C;
                        }
                        r22.A01 = 4;
                        Iterator it = r22.A09.A00.iterator();
                        if (it.hasNext()) {
                            it.next();
                            throw AnonymousClass001.A0g("listener");
                        }
                        return;
                    } catch (Exception e2) {
                        if (!(e2 instanceof NotProvisionedException)) {
                            r22.A01(e2, 1);
                            return;
                        }
                    }
                }
                r22.A0A.A01(r22);
            }
        }
    }
}
