package X;

import com.whatsapp.backup.google.workers.BackupGpbSignalWorker;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.backup.google.workers.BackupGpbSignalWorker", f = "BackupGpbSignalWorker.kt", i = {0}, l = {157}, m = "doWork", n = {"this"}, s = {"L$0"})
/* renamed from: X.0o6  reason: invalid class name and case insensitive filesystem */
public final class C14010o6 extends C75013pU {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BackupGpbSignalWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14010o6(BackupGpbSignalWorker backupGpbSignalWorker, C84814Du r2) {
        super(r2);
        this.this$0 = backupGpbSignalWorker;
    }

    public final Object A09(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A0D(this);
    }
}
