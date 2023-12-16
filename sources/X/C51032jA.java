package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.2jA  reason: invalid class name and case insensitive filesystem */
public class C51032jA {
    public final NativeHolder A00;

    public C51032jA(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }

    public int A00() {
        JniBridge.getInstance();
        return (int) JniBridge.jvidispatchIIO(1, (long) 91, this.A00);
    }

    public byte[] A01() {
        JniBridge.getInstance();
        return C18290x4.A1a(this.A00, 92);
    }

    public byte[] A02() {
        JniBridge.getInstance();
        return C18290x4.A1a(this.A00, 93);
    }
}
