package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.7tA  reason: invalid class name and case insensitive filesystem */
public final class C163037tA implements Handler.Callback, C180668lR {
    public final Handler A00;
    public final /* synthetic */ C126666Ov A01;

    public C163037tA(C183878qo r3, C126666Ov r4) {
        this.A01 = r4;
        Looper myLooper = Looper.myLooper();
        C161487pm.A01(myLooper);
        Handler handler = new Handler(myLooper, this);
        this.A00 = handler;
        r3.Bmi(handler, this);
    }

    public final void A00(long j) {
        C126666Ov r3 = this.A01;
        if (this != r3.A0M) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            r3.A0k = true;
            return;
        }
        try {
            r3.A0R(j);
            r3.A0d();
            r3.A0K.A06++;
            r3.A0a();
            r3.A0Q(j);
        } catch (C143886zd e) {
            r3.A0G = e;
        }
    }

    public void BTr(C183878qo r5, long j, long j2) {
        if (C162387ry.A01 < 30) {
            Handler handler = this.A00;
            handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
            return;
        }
        A00(j);
    }

    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        A00(AnonymousClass6C8.A0N(message.arg1, message.arg2));
        return true;
    }
}
