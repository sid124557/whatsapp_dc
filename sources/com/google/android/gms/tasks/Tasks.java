package com.google.android.gms.tasks;

import X.AnonymousClass001;
import X.AnonymousClass6YV;
import X.AnonymousClass70L;
import X.AnonymousClass8BH;
import X.AnonymousClass8BI;
import X.C162177rO;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class Tasks {
    public static Object await(Task task, long j, TimeUnit timeUnit) {
        C162177rO.A06("Must not be called on the main application thread");
        C162177rO.A03(task, "Task must not be null");
        C162177rO.A03(timeUnit, "TimeUnit must not be null");
        if (!task.isComplete()) {
            AnonymousClass8BI r1 = new AnonymousClass8BI((AnonymousClass70L) null);
            Executor executor = TaskExecutors.A00;
            task.addOnSuccessListener(executor, r1);
            task.addOnFailureListener(executor, r1);
            task.addOnCanceledListener(executor, r1);
            if (!r1.A00.await(j, timeUnit)) {
                throw new TimeoutException("Timed out waiting for Task");
            }
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (((AnonymousClass6YV) task).A05) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }

    public static Task whenAll(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            AnonymousClass6YV r0 = new AnonymousClass6YV();
            r0.A04((Object) null);
            return r0;
        }
        for (Object obj : collection) {
            if (obj == null) {
                throw AnonymousClass001.A0g("null tasks are not accepted");
            }
        }
        AnonymousClass6YV r4 = new AnonymousClass6YV();
        AnonymousClass8BH r3 = new AnonymousClass8BH(r4, collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Task task = (Task) it.next();
            Executor executor = TaskExecutors.A00;
            task.addOnSuccessListener(executor, r3);
            task.addOnFailureListener(executor, r3);
            task.addOnCanceledListener(executor, r3);
        }
        return r4;
    }

    public static Object await(Task task) {
        C162177rO.A06("Must not be called on the main application thread");
        C162177rO.A03(task, "Task must not be null");
        if (!task.isComplete()) {
            AnonymousClass8BI r1 = new AnonymousClass8BI((AnonymousClass70L) null);
            Executor executor = TaskExecutors.A00;
            task.addOnSuccessListener(executor, r1);
            task.addOnFailureListener(executor, r1);
            task.addOnCanceledListener(executor, r1);
            r1.A00.await();
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (((AnonymousClass6YV) task).A05) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }
}
