package X;

import com.facebook.stash.core.FileStash;
import java.io.File;
import java.util.Collection;

/* renamed from: X.855  reason: invalid class name */
public class AnonymousClass855 implements C185588tv {
    public final FileStash A00;

    public Collection B4P() {
        return this.A00.B4Q();
    }

    public boolean BJF(String str) {
        File filePath = this.A00.getFilePath(str);
        if (!filePath.exists() || filePath.canExecute()) {
            return false;
        }
        return true;
    }

    public long BJN(String str) {
        return this.A00.BJW(str);
    }

    public long BJO(String str) {
        return this.A00.B8j(str);
    }

    public boolean Bj4(String str) {
        return this.A00.Bj4(str);
    }

    public AnonymousClass855(FileStash fileStash) {
        this.A00 = fileStash;
    }
}
