package X;

import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.DataTaskListener;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NetworkUtils;
import com.whatsapp.util.Log;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.3Ao  reason: invalid class name and case insensitive filesystem */
public class C63763Ao implements DataTaskListener {
    public final /* synthetic */ C63773Ap A00;

    public C63763Ao(C63773Ap r1) {
        this.A00 = r1;
    }

    public void onCancelDataTask(String str, NetworkSession networkSession) {
        C50372i4 r3 = (C50372i4) this.A00.A09.get(str);
        if (r3 != null) {
            r3.A01(NetworkUtils.newErrorURLResponse(r3.A04), AnonymousClass002.A0C("Task cancelled."), (byte[]) null);
        }
    }

    public void onNewTask(DataTask dataTask, NetworkSession networkSession) {
        try {
            this.A00.A07.BkM(new C70363aN(this, dataTask, networkSession, 38));
        } catch (RejectedExecutionException e) {
            Log.e("wa-msys/NetworkSession: DataTask rejected for execution", e);
            throw e;
        }
    }

    public void onUpdateStreamingDataTask(byte[] bArr, String str, NetworkSession networkSession) {
        C71403c3.A00(this.A00.A07, this, bArr, str, 19);
    }
}
