package X;

import com.facebook.cameracore.ardelivery.storage.interfaces.StorageCallback;
import java.io.File;
import java.util.Map;

/* renamed from: X.9Ye  reason: invalid class name and case insensitive filesystem */
public abstract class C195509Ye implements C203419nf {
    public final Map A00;

    public boolean BH7(AnonymousClass9WL r3, boolean z) {
        return A00(A01(r3)).BH7(r3, false);
    }

    public C203419nf A00(Object obj) {
        C203419nf r0 = (C203419nf) this.A00.get(obj);
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass000.A0E(obj, "No asset storage exists for type: ", AnonymousClass001.A0o());
    }

    public Object A01(AnonymousClass9WL r2) {
        if (!(this instanceof C1903395j)) {
            return r2.A02;
        }
        if (r2.A03() != null) {
            return r2.A03();
        }
        throw AnonymousClass001.A0c("The capability cannot be null in AR asset metadata");
    }

    public C195509Ye(Map map) {
        this.A00 = map;
    }

    public File B53(AnonymousClass9WL r2, StorageCallback storageCallback) {
        return A00(A01(r2)).B53(r2, storageCallback);
    }

    public void Bj3(AnonymousClass9WL r2) {
        A00(A01(r2)).Bj3(r2);
    }

    public File Bki(AnonymousClass9WL r2, StorageCallback storageCallback, File file) {
        return A00(A01(r2)).Bki(r2, storageCallback, file);
    }

    public void Bs2(AnonymousClass9WL r2) {
        A00(A01(r2)).Bs2(r2);
    }
}
