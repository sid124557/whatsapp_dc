package X;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: X.7kO  reason: invalid class name and case insensitive filesystem */
public abstract class C158687kO {
    public final int A00;

    public void A01(Status status) {
        C152017Xf r1;
        ApiException apiException;
        if (this instanceof AnonymousClass6RI) {
            try {
                ((AnonymousClass6RI) this).A00.A09(status);
            } catch (IllegalStateException e) {
                Log.w("ApiCallRunner", "Exception reporting failure", e);
            }
        } else {
            if (this instanceof AnonymousClass6RG) {
                r1 = ((AnonymousClass6RG) this).A02;
                apiException = AnonymousClass72J.A00(status);
            } else {
                r1 = ((AnonymousClass6RF) this).A00;
                apiException = new ApiException(status);
            }
            r1.A01(apiException);
        }
    }

    public void A02(Exception exc) {
        C152017Xf r0;
        if (this instanceof AnonymousClass6RI) {
            AnonymousClass6RI r3 = (AnonymousClass6RI) this;
            String A0n = C18310x6.A0n(exc);
            String localizedMessage = exc.getLocalizedMessage();
            StringBuilder A0l = AnonymousClass000.A0l(A0n);
            A0l.append(": ");
            A0l.append(localizedMessage);
            try {
                r3.A00.A09(new Status(10, A0l.toString()));
            } catch (IllegalStateException e) {
                Log.w("ApiCallRunner", "Exception reporting failure", e);
            }
        } else {
            if (this instanceof AnonymousClass6RG) {
                r0 = ((AnonymousClass6RG) this).A02;
            } else {
                r0 = ((AnonymousClass6RF) this).A00;
            }
            r0.A01(exc);
        }
    }

    public C158687kO(int i) {
        this.A00 = i;
    }

    public static /* bridge */ /* synthetic */ Status A00(RemoteException remoteException) {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1A(remoteException, A0o);
        A0o.append(": ");
        A0o.append(remoteException.getLocalizedMessage());
        return new Status(19, A0o.toString());
    }
}
