package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.2v3  reason: invalid class name and case insensitive filesystem */
public class C58312v3 {
    public final NativeHolder A00;

    public C58312v3(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }

    public C58312v3(byte[] bArr, long j) {
        JniBridge.getInstance();
        this.A00 = new C58312v3((NativeHolder) JniBridge.jvidispatchOIO(21, j, bArr)).A00;
    }
}
