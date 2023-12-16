package X;

import java.io.File;
import java.util.Map;

/* renamed from: X.3DU  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3DU implements C16380sv {
    public final /* synthetic */ Map A00;

    public final Object apply(Object obj) {
        File file = (File) this.A00.get(obj);
        if (file == null) {
            return null;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return file;
        }
        C18280x3.A10(parentFile);
        return file;
    }

    public /* synthetic */ AnonymousClass3DU(Map map) {
        this.A00 = map;
    }
}
