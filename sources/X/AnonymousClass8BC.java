package X;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

/* renamed from: X.8BC  reason: invalid class name */
public final class AnonymousClass8BC implements C181138mD {
    public final /* bridge */ /* synthetic */ Object Bqf(Task task) {
        if (AnonymousClass001.A1Z(task.getResult())) {
            return null;
        }
        throw new ApiException(new Status(13, "listener already unregistered"));
    }
}
