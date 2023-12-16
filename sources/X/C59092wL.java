package X;

/* renamed from: X.2wL  reason: invalid class name and case insensitive filesystem */
public class C59092wL {
    public final AnonymousClass1RE A00;

    public C59092wL(AnonymousClass1RE r1) {
        this.A00 = r1;
    }

    public void A00(String str, int i, int i2) {
        C626936e.A00();
        C85284Fq A0C = this.A00.A0C();
        try {
            C56862sg r4 = ((AnonymousClass3H0) A0C).A03;
            String[] A1a = C18300x5.A1a(str, 3);
            C18280x3.A1Q(A1a, i, 1);
            C18280x3.A1Q(A1a, i2, 2);
            r4.A07("rmr_response_error", "file_key = ?  AND rmr_source =?  AND response_device_id =? ", "RequestMediaReUploadResponseErrorStore.deleteResponseErrorWithDeviceId", A1a);
            A0C.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }
}
