package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: X.55N  reason: invalid class name */
public final class AnonymousClass55N extends AnonymousClass5ZM {
    public final C989053r A00;
    public final WeakReference A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass55N(C15910sA r2, AnonymousClass64G r3, C989053r r4) {
        super(r2, true);
        C162457s7.A0J(r4, 3);
        this.A00 = r4;
        this.A01 = AnonymousClass0x9.A14(r3);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Uri[] uriArr = (Uri[]) objArr;
        C162457s7.A0J(uriArr, 0);
        if (uriArr.length != 1) {
            Log.e("LoadMediaFileAsyncTask/doInBackground expected exactly 1 uri");
            return new AnonymousClass3Z6((Object) null, (Object) null);
        }
        try {
            Uri uri = uriArr[0];
            if (uri == null) {
                return new AnonymousClass3Z6((Object) null, (Object) null);
            }
            C989053r r0 = this.A00;
            File A0E = r0.A0E(uri);
            C162457s7.A0D(A0E);
            String A0W = C107655bf.A0W(uri, r0.A03.A0R());
            C162457s7.A0D(A0W);
            return AnonymousClass3Z6.A02(A0E, A0W);
        } catch (IOException e) {
            Log.e("LoadMediaFileAsyncTask/doInBackground failed to get file from uri", e);
            return new AnonymousClass3Z6((Object) null, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass3Z6 r4 = (AnonymousClass3Z6) obj;
        C162457s7.A0J(r4, 0);
        AnonymousClass64G r2 = (AnonymousClass64G) this.A01.get();
        if (r2 != null) {
            r2.BW6((File) r4.first, (String) r4.second);
        }
    }
}
