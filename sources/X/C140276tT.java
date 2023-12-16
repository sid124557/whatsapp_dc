package X;

import android.os.FileObserver;
import java.io.File;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.6tT  reason: invalid class name and case insensitive filesystem */
public class C140276tT extends File {
    public final CountDownLatch mFileCreatedCondition = C18290x4.A14();
    public volatile FileObserver mFileObserver;
    public volatile boolean mIsClosed = false;
    public volatile boolean mIsTailing = false;
    public volatile C177708gK mListener = null;
    public volatile FileObserver mParentFolderObserver;

    public void A00() {
        this.mIsClosed = true;
        synchronized (this) {
            if (this.mFileObserver != null) {
                this.mFileObserver.stopWatching();
                this.mFileObserver = null;
            }
        }
        synchronized (this) {
            if (this.mParentFolderObserver != null) {
                this.mParentFolderObserver.stopWatching();
                this.mParentFolderObserver = null;
            }
        }
    }

    public C140276tT(String str, boolean z) {
        super(str);
        this.mIsTailing = z;
    }
}
