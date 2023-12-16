package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.2eS  reason: invalid class name and case insensitive filesystem */
public class C48162eS {
    public final NativeHolder A00;

    public C48162eS(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }

    public int A00() {
        JniBridge.getInstance();
        return (int) JniBridge.jvidispatchIIO(1, (long) 84, this.A00);
    }

    public byte[] A01() {
        JniBridge.getInstance();
        return C18290x4.A1a(this.A00, 85);
    }
}
