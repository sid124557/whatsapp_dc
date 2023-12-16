package X;

import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.storage.interfaces.StorageCallback;
import com.facebook.stash.core.FileStash;
import java.io.File;

/* renamed from: X.9Yg  reason: invalid class name and case insensitive filesystem */
public class C195529Yg implements C203419nf {
    public final C202279lh A00;

    public static String A00(AnonymousClass9WL r3) {
        ARAssetType aRAssetType = r3.A02;
        int ordinal = aRAssetType.ordinal();
        if (ordinal != 1) {
            if (!(ordinal == 0 || ordinal == 3 || ordinal == 2 || ordinal == 4)) {
                throw AnonymousClass000.A0E(aRAssetType, "Got unexpected metadata type: ", AnonymousClass001.A0o());
            }
        } else if (r3.A09 == null) {
            return r3.A0A;
        }
        return r3.A09;
    }

    public File B53(AnonymousClass9WL r3, StorageCallback storageCallback) {
        C195549Yi r0 = (C195549Yi) this.A00;
        String A002 = A00(r3);
        if (A002 == null) {
            return null;
        }
        return r0.A02.getFile(A002);
    }

    public boolean BH7(AnonymousClass9WL r3, boolean z) {
        C195549Yi r0 = (C195549Yi) this.A00;
        String A002 = A00(r3);
        if (A002 == null || !r0.A02.BFI(A002)) {
            return false;
        }
        return true;
    }

    public void Bj3(AnonymousClass9WL r3) {
        C195549Yi r1 = (C195549Yi) this.A00;
        if (A00(r3) != null) {
            r1.A02.Bj4(A00(r3));
        }
    }

    public File Bki(AnonymousClass9WL r7, StorageCallback storageCallback, File file) {
        C195549Yi r0 = (C195549Yi) this.A00;
        String A002 = A00(r7);
        if (A002 != null) {
            FileStash fileStash = r0.A02;
            File filePath = fileStash.getFilePath(A002);
            if (!AnonymousClass9U6.A01(filePath)) {
                filePath = fileStash.insertFile(A002);
                if (!file.renameTo(filePath)) {
                    Object[] A0M = AnonymousClass002.A0M();
                    AnonymousClass000.A16(file, filePath, A0M);
                    C162477s9.A0E("StashDiskCacheWrapper", "Failed renaming file from %s to %s", A0M);
                    fileStash.Bj4(A002);
                }
            }
            return filePath;
        }
        return null;
    }

    public void Bs2(AnonymousClass9WL r3) {
        C195549Yi r0 = (C195549Yi) this.A00;
        String A002 = A00(r3);
        if (A002 != null) {
            r0.A02.getFile(A002);
        }
    }

    public C195529Yg(C202279lh r2) {
        if (r2 != null) {
            this.A00 = r2;
            return;
        }
        throw AnonymousClass001.A0e("Must provide a disk cache wrapper");
    }
}
