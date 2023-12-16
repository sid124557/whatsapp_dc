package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.2v1  reason: invalid class name and case insensitive filesystem */
public class C58292v1 {
    public final NativeHolder A00;

    public C58292v1(String str, String str2, int i) {
        JniBridge.getInstance();
        this.A00 = new C58292v1((NativeHolder) JniBridge.jvidispatchOIOO(0, (long) i, str, str2)).A00;
    }

    public C58292v1(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }
}
