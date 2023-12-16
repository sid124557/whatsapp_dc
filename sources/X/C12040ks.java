package X;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: X.0ks  reason: invalid class name and case insensitive filesystem */
public class C12040ks implements Runnable {
    public final /* synthetic */ C13340n1 A00;
    public final /* synthetic */ String A01;

    public C12040ks(C13340n1 r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public void run() {
        try {
            C13340n1 r5 = this.A00;
            C03070Is r4 = (C03070Is) r5.A0F.get();
            if (r4 == null) {
                C06240Wu.A00();
                String str = C13340n1.A0I;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(r5.A08.A0G);
                AnonymousClass000.A1D(" returned a null result. Treating it as a failure.", str, A0o);
            } else {
                C06240Wu A002 = C06240Wu.A00();
                String str2 = C13340n1.A0I;
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append(r5.A08.A0G);
                A0o2.append(" returned a ");
                A0o2.append(r4);
                C06240Wu.A03(A002, ".", str2, A0o2);
                r5.A02 = r4;
            }
        } catch (CancellationException e) {
            C06240Wu.A00();
            String str3 = C13340n1.A0I;
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A0o3.append(this.A01);
            Log.i(str3, AnonymousClass000.A0X(" was cancelled", A0o3), e);
        } catch (InterruptedException | ExecutionException e2) {
            C06240Wu.A00();
            String str4 = C13340n1.A0I;
            StringBuilder A0o4 = AnonymousClass001.A0o();
            A0o4.append(this.A01);
            Log.e(str4, AnonymousClass000.A0X(" failed because it threw an exception/error", A0o4), e2);
        } catch (Throwable th) {
            this.A00.A03();
            throw th;
        }
        this.A00.A03();
    }
}
