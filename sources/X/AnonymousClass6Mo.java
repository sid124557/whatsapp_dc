package X;

/* renamed from: X.6Mo  reason: invalid class name */
public class AnonymousClass6Mo extends C172568Lu {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C50372i4 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6Mo(C50372i4 r2, int i) {
        super("StreamingUploadDataTask_update");
        this.A01 = r2;
        this.A00 = i;
    }

    public void run() {
        C50372i4 r1 = this.A01;
        r1.A03.updateDataTaskUploadProgress(r1.A02.mTaskIdentifier, (long) this.A00, r1.A00, r1.A01);
    }
}
