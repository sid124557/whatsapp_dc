package X;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.lang.ref.SoftReference;

/* renamed from: X.4MH  reason: invalid class name */
public final class AnonymousClass4MH extends Handler {
    public void handleMessage(Message message) {
        Object obj = message.obj;
        if (obj != null) {
            Pair pair = (Pair) obj;
            Number number = (Number) pair.first;
            long longValue = number.longValue();
            Object obj2 = pair.second;
            if (obj2 instanceof Drawable) {
                AnonymousClass5ZF.A0a.put(number, new SoftReference(obj2));
                return;
            }
            AnonymousClass4NX r4 = (AnonymousClass4NX) obj2;
            Drawable drawable = (Drawable) r4.getTag();
            AnonymousClass5ZF.A0a.put(Long.valueOf(longValue), new SoftReference(drawable));
            if (r4.A01 == longValue) {
                r4.A03 = drawable;
                r4.invalidate();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MH(Looper looper) {
        super(looper);
        C626936e.A06(looper);
    }
}
