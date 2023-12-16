package X;

import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.NetworkSession;

/* renamed from: X.6Mp  reason: invalid class name */
public class AnonymousClass6Mp extends C172568Lu {
    public final /* synthetic */ DataTask A00;
    public final /* synthetic */ NetworkSession A01;
    public final /* synthetic */ C50372i4 A02;
    public final /* synthetic */ C63773Ap A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6Mp(DataTask dataTask, NetworkSession networkSession, C50372i4 r4, C63773Ap r5) {
        super("StreamingUploadDataTask_initial_ask_for_data");
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = networkSession;
        this.A00 = dataTask;
    }

    public void run() {
        this.A01.canHandleStreamingUploadUpdate(this.A00.mTaskIdentifier);
    }
}
