package com.google.android.gms.tasks;

import X.AnonymousClass002;
import X.C181138mD;
import X.C181148mE;
import X.C181158mI;
import java.util.concurrent.Executor;

public abstract class Task {
    public abstract Task addOnFailureListener(OnFailureListener onFailureListener);

    public abstract Task addOnFailureListener(Executor executor, OnFailureListener onFailureListener);

    public abstract Task addOnSuccessListener(OnSuccessListener onSuccessListener);

    public abstract Task addOnSuccessListener(Executor executor, OnSuccessListener onSuccessListener);

    public abstract Exception getException();

    public abstract Object getResult();

    public abstract Object getResult(Class cls);

    public abstract boolean isComplete();

    public abstract boolean isSuccessful();

    public Task addOnCanceledListener(Executor executor, C181148mE r3) {
        throw AnonymousClass002.A0G("addOnCanceledListener is not implemented");
    }

    public Task addOnCompleteListener(Executor executor, OnCompleteListener onCompleteListener) {
        throw AnonymousClass002.A0G("addOnCompleteListener is not implemented");
    }

    public Task continueWith(Executor executor, C181138mD r3) {
        throw AnonymousClass002.A0G("continueWith is not implemented");
    }

    public Task continueWithTask(Executor executor, C181138mD r3) {
        throw AnonymousClass002.A0G("continueWithTask is not implemented");
    }

    public Task onSuccessTask(Executor executor, C181158mI r3) {
        throw AnonymousClass002.A0G("onSuccessTask is not implemented");
    }

    public Task addOnCompleteListener(OnCompleteListener onCompleteListener) {
        throw AnonymousClass002.A0G("addOnCompleteListener is not implemented");
    }
}
