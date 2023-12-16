package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.2v5  reason: invalid class name and case insensitive filesystem */
public class C58332v5 {
    public final NativeHolder A00;

    public C58332v5(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }

    public C58332v5(byte[] bArr, long j) {
        JniBridge.getInstance();
        this.A00 = new C58332v5((NativeHolder) JniBridge.jvidispatchOIO(20, j, bArr)).A00;
    }
}
