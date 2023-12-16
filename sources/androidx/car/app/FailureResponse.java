package androidx.car.app;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0GR;
import android.os.RemoteException;
import android.util.Log;
import java.security.InvalidParameterException;
import java.util.Objects;

public final class FailureResponse {
    public final int mErrorType;
    public final String mStackTrace;

    public boolean equals(Object obj) {
        if (!(obj instanceof FailureResponse)) {
            return false;
        }
        FailureResponse failureResponse = (FailureResponse) obj;
        if (this.mErrorType != failureResponse.mErrorType || !Objects.equals(this.mStackTrace, failureResponse.mStackTrace)) {
            return false;
        }
        return true;
    }

    public FailureResponse(Throwable th) {
        int i;
        Objects.requireNonNull(th);
        this.mStackTrace = Log.getStackTraceString(th);
        if (th instanceof AnonymousClass0GR) {
            i = 1;
        } else if (th instanceof IllegalStateException) {
            i = 2;
        } else if (th instanceof InvalidParameterException) {
            i = 3;
        } else if (th instanceof SecurityException) {
            i = 4;
        } else if (th instanceof RuntimeException) {
            i = 5;
        } else {
            i = 0;
            if (th instanceof RemoteException) {
                i = 6;
            }
        }
        this.mErrorType = i;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A1L(A0M, this.mErrorType);
        return AnonymousClass001.A0L(this.mStackTrace, A0M, 1);
    }

    public FailureResponse() {
        this.mStackTrace = null;
        this.mErrorType = 0;
    }
}
