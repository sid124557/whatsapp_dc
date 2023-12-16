package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.2v4  reason: invalid class name and case insensitive filesystem */
public class C58322v4 {
    public final NativeHolder A00;

    public C58322v4(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }

    public C58322v4(byte[] bArr, byte[] bArr2) {
        JniBridge.getInstance();
        this.A00 = new C58322v4((NativeHolder) JniBridge.jvidispatchOOO(0, bArr, bArr2)).A00;
    }
}
