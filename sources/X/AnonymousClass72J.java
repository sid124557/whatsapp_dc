package X;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: X.72J  reason: invalid class name */
public class AnonymousClass72J {
    public static ApiException A00(Status status) {
        if (status.A02 != null) {
            return new AnonymousClass6QW(status);
        }
        return new ApiException(status);
    }
}
