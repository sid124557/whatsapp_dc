package X;

import com.whatsapp.util.Log;

/* renamed from: X.3F2  reason: invalid class name */
public class AnonymousClass3F2 implements AnonymousClass4E5 {
    public final /* synthetic */ C66413Li A00;

    public void BF8(C41402Kc r4, String str, int i) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ContactQuerySync/result sid=");
        A0o.append(str);
        C18260x0.A0y(" index=", A0o, 0);
        this.A00.A0F.put(str, r4);
    }

    public AnonymousClass3F2(C66413Li r1) {
        this.A00 = r1;
    }

    public void BF7(AnonymousClass227 r7, String str, int i, int i2, long j) {
        if (j > 0) {
            C66413Li r4 = this.A00;
            long A0H = r4.A08.A0H() + j;
            C56882si r5 = r4.A07;
            C18270x1.A0i(C56882si.A01(r5), "sidelist_sync_backoff", A0H);
            if (i2 == 503 && r4.A0B.A0Y(C58422vE.A02, 1297)) {
                Log.e("ContactQuerySync/handleSyncContactError need global backoff");
                C18270x1.A0i(C56882si.A01(r5), "global_backoff_time", A0H);
            }
        }
    }

    public void BF9(int i, int i2, String str, long j) {
        throw C18320x8.A0m();
    }
}
