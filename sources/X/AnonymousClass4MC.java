package X;

import android.os.AsyncTask;

/* renamed from: X.4MC  reason: invalid class name */
public final class AnonymousClass4MC extends AsyncTask {
    public final AnonymousClass5ZM A00;

    public final void A00() {
        AnonymousClass5ZM r2 = this.A00;
        C15910sA r0 = r2.A01;
        if (r0 != null) {
            C17280vG r1 = r2.A00;
            if (r1 != null) {
                r0.getLifecycle().A01(r1);
            }
            r2.A01 = null;
        }
    }

    public final Object doInBackground(Object... objArr) {
        return this.A00.A08(objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000c, code lost:
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCancelled(java.lang.Object r2) {
        /*
            r1 = this;
            X.5ZM r0 = r1.A00     // Catch:{ all -> 0x0009 }
            r0.A0B(r2)     // Catch:{ all -> 0x0009 }
            r1.A00()
            return
        L_0x0009:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x000b }
        L_0x000b:
            r0 = move-exception
            r1.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4MC.onCancelled(java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000c, code lost:
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPostExecute(java.lang.Object r2) {
        /*
            r1 = this;
            X.5ZM r0 = r1.A00     // Catch:{ all -> 0x0009 }
            r0.A0C(r2)     // Catch:{ all -> 0x0009 }
            r1.A00()
            return
        L_0x0009:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x000b }
        L_0x000b:
            r0 = move-exception
            r1.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4MC.onPostExecute(java.lang.Object):void");
    }

    public void onPreExecute() {
        this.A00.A0A();
    }

    public final void onProgressUpdate(Object... objArr) {
        this.A00.A0E(objArr);
    }

    public AnonymousClass4MC(AnonymousClass5ZM r1) {
        this.A00 = r1;
    }

    public void A01(Object... objArr) {
        publishProgress(objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000c, code lost:
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCancelled() {
        /*
            r1 = this;
            X.5ZM r0 = r1.A00     // Catch:{ all -> 0x0009 }
            r0.A09()     // Catch:{ all -> 0x0009 }
            r1.A00()
            return
        L_0x0009:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x000b }
        L_0x000b:
            r0 = move-exception
            r1.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4MC.onCancelled():void");
    }
}
