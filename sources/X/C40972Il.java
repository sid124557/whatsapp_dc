package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.2Il  reason: invalid class name and case insensitive filesystem */
public class C40972Il {
    public final NativeHolder A00;

    public static AnonymousClass2NY A00(Object obj) {
        C40972Il r0 = new C40972Il((NativeHolder) obj);
        JniBridge.getInstance();
        NativeHolder nativeHolder = r0.A00;
        JniBridge.getInstance();
        JniBridge.getInstance();
        return new AnonymousClass2NY((byte[]) JniBridge.jvidispatchOIO(0, (long) 50, nativeHolder), (int) JniBridge.jvidispatchIIO(1, (long) 51, nativeHolder), (int) JniBridge.jvidispatchIIO(1, (long) 52, nativeHolder));
    }

    public C40972Il(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }
}
