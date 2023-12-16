package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.2v2  reason: invalid class name and case insensitive filesystem */
public class C58302v2 {
    public final NativeHolder A00;

    public C58302v2(String str) {
        JniBridge.getInstance();
        this.A00 = new C58302v2((NativeHolder) JniBridge.jvidispatchOO(3, str)).A00;
    }

    public C58302v2(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }
}
