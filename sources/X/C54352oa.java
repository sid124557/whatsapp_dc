package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.2oa  reason: invalid class name and case insensitive filesystem */
public class C54352oa {
    public final NativeHolder A00;

    public C54352oa(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }

    public int A00() {
        JniBridge.getInstance();
        return (int) JniBridge.jvidispatchIIO(1, (long) 80, this.A00);
    }

    public byte[] A01() {
        JniBridge.getInstance();
        return C18290x4.A1a(this.A00, 82);
    }

    public byte[] A02() {
        JniBridge.getInstance();
        return C18290x4.A1a(this.A00, 83);
    }

    public byte[] A03() {
        JniBridge.getInstance();
        return C18290x4.A1a(this.A00, 81);
    }
}
