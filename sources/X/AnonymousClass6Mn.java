package X;

/* renamed from: X.6Mn  reason: invalid class name */
public class AnonymousClass6Mn extends C172568Lu {
    public final /* synthetic */ C50372i4 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6Mn(C50372i4 r2) {
        super("StreamingUploadDataTask_ask_for_data");
        this.A00 = r2;
    }

    public void run() {
        C50372i4 r0 = this.A00;
        r0.A03.canHandleStreamingUploadUpdate(r0.A02.mTaskIdentifier);
    }
}
