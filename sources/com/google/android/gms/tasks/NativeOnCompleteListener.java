package com.google.android.gms.tasks;

import X.AnonymousClass6YV;

public class NativeOnCompleteListener implements OnCompleteListener {
    public final long zza;

    public native void nativeOnComplete(long j, Object obj, boolean z, boolean z2, String str);

    public NativeOnCompleteListener(long j) {
        this.zza = j;
    }

    public void onComplete(Task task) {
        Object obj;
        String str;
        Exception exception;
        if (task.isSuccessful()) {
            obj = task.getResult();
            str = null;
        } else if (((AnonymousClass6YV) task).A05 || (exception = task.getException()) == null) {
            obj = null;
            str = null;
        } else {
            str = exception.getMessage();
            obj = null;
        }
        nativeOnComplete(this.zza, obj, task.isSuccessful(), ((AnonymousClass6YV) task).A05, str);
    }
}
