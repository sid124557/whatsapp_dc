package X;

import com.facebook.msys.mci.DefaultCrypto;
import com.facebook.msys.mci.DefaultUUID;
import com.facebook.msys.util.Provider;

/* renamed from: X.4KJ  reason: invalid class name */
public class AnonymousClass4KJ implements Provider {
    public Object A00;
    public final int A01;

    public AnonymousClass4KJ(C55142pr r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object get() {
        if (this.A01 != 0) {
            return DefaultUUID.mUUID;
        }
        return DefaultCrypto.mCrypto;
    }
}
