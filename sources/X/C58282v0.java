package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.2v0  reason: invalid class name and case insensitive filesystem */
public class C58282v0 {
    public final NativeHolder A00;

    public C58282v0(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }

    public C58282v0(String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, long j) {
        JniBridge.getInstance();
        this.A00 = new C58282v0((NativeHolder) JniBridge.jvidispatchOIIIOOOOOOO((long) i, j, 0, str, str2, (Object) null, (Object) null, bArr, bArr2, bArr3)).A00;
    }
}
