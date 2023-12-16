package X;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.89B  reason: invalid class name */
public abstract class AnonymousClass89B implements C178358hP {
    public final int A00;
    public final Context A01;
    public final Looper A02;
    public final C186678vl A03;
    public final C148727Jm A04;
    public final C159087l6 A05;
    public final C151727Wb A06;
    public final C163007t7 A07;
    public final C178388hS A08;
    public final String A09;

    public AnonymousClass7MJ A01() {
        AnonymousClass7MJ r3 = new AnonymousClass7MJ();
        Set emptySet = Collections.emptySet();
        C13570nO r1 = r3.A00;
        if (r1 == null) {
            r1 = new C13570nO(0);
            r3.A00 = r1;
        }
        r1.addAll(emptySet);
        Context context = this.A01;
        r3.A03 = AnonymousClass000.A0O(context);
        r3.A02 = context.getPackageName();
        return r3;
    }

    public final Task A02(C150887Sp r7, int i) {
        C152017Xf r5 = new C152017Xf();
        C163007t7 r4 = this.A07;
        C178388hS r1 = this.A08;
        r4.A06(this, r5, r7.A00);
        AnonymousClass6C7.A10(r4.A06, new C148757Jp(this, new AnonymousClass6RG(r1, r7, r5, i), r4.A0D.get()), 4);
        return r5.A00;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.6CO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: X.6CO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: X.6CO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: X.6CO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: com.google.android.gms.common.api.internal.zzd} */
    /* JADX WARNING: type inference failed for: r5v8, types: [X.0eF, com.google.android.gms.common.api.internal.zzd] */
    /* JADX WARNING: type inference failed for: r5v10, types: [X.0eF, com.google.android.gms.common.api.internal.zzd] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007e, code lost:
        if (r5 == null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a8, code lost:
        if (r5 == null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        if (r0 != false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e3, code lost:
        if (r0 != false) goto L_0x00e5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass89B(android.app.Activity r8, android.content.Context r9, X.C186678vl r10, X.C148727Jm r11, X.C156227gG r12) {
        /*
            r7 = this;
            r7.<init>()
            java.lang.String r0 = "Null context is not permitted."
            X.C162177rO.A03(r9, r0)
            java.lang.String r0 = "Api must not be null."
            X.C162177rO.A03(r11, r0)
            java.lang.String r0 = "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."
            X.C162177rO.A03(r12, r0)
            android.content.Context r0 = r9.getApplicationContext()
            r7.A01 = r0
            boolean r0 = X.C154017cR.A01()
            r3 = 0
            if (r0 == 0) goto L_0x002a
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            java.lang.String r0 = "getAttributionTag"
            java.lang.Object r0 = X.AnonymousClass000.A0K(r1, r9, r0)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x002a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x002a }
            r3 = r0
        L_0x002a:
            r7.A09 = r3
            r7.A04 = r11
            r7.A03 = r10
            android.os.Looper r0 = r12.A00
            r7.A02 = r0
            X.7Wb r2 = new X.7Wb
            r2.<init>(r10, r11, r3)
            r7.A06 = r2
            X.6Qn r0 = new X.6Qn
            r0.<init>(r7)
            r7.A05 = r0
            android.content.Context r0 = r7.A01
            X.7t7 r3 = X.C163007t7.A01(r0)
            r7.A07 = r3
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A0C
            int r0 = r0.getAndIncrement()
            r7.A00 = r0
            X.8hS r0 = r12.A01
            r7.A08 = r0
            if (r8 == 0) goto L_0x011b
            boolean r0 = r8 instanceof com.google.android.gms.common.api.GoogleApiActivity
            if (r0 != 0) goto L_0x011b
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r1 != r0) goto L_0x011b
            boolean r0 = r8 instanceof X.C003203q
            if (r0 == 0) goto L_0x0096
            X.03q r8 = (X.C003203q) r8
            java.lang.String r6 = "SupportLifecycleFragmentImpl"
            java.util.WeakHashMap r4 = com.google.android.gms.common.api.internal.zzd.A03
            java.lang.Object r0 = r4.get(r8)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x0080
            java.lang.Object r5 = r0.get()
            com.google.android.gms.common.api.internal.zzd r5 = (com.google.android.gms.common.api.internal.zzd) r5
            if (r5 != 0) goto L_0x0100
        L_0x0080:
            X.0df r0 = r8.getSupportFragmentManager()     // Catch:{ ClassCastException -> 0x008d }
            X.0eF r5 = r0.A0D(r6)     // Catch:{ ClassCastException -> 0x008d }
            com.google.android.gms.common.api.internal.zzd r5 = (com.google.android.gms.common.api.internal.zzd) r5     // Catch:{ ClassCastException -> 0x008d }
            if (r5 == 0) goto L_0x00e5
            goto L_0x00e1
        L_0x008d:
            r2 = move-exception
            java.lang.String r1 = "Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x0096:
            java.lang.String r4 = "LifecycleFragmentImpl"
            java.util.WeakHashMap r1 = X.AnonymousClass6CO.A03
            java.lang.Object r0 = r1.get(r8)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x00aa
            java.lang.Object r5 = r0.get()
            X.6CO r5 = (X.AnonymousClass6CO) r5
            if (r5 != 0) goto L_0x0100
        L_0x00aa:
            android.app.FragmentManager r0 = r8.getFragmentManager()     // Catch:{ ClassCastException -> 0x00d8 }
            android.app.Fragment r5 = r0.findFragmentByTag(r4)     // Catch:{ ClassCastException -> 0x00d8 }
            X.6CO r5 = (X.AnonymousClass6CO) r5     // Catch:{ ClassCastException -> 0x00d8 }
            if (r5 == 0) goto L_0x00bc
            boolean r0 = r5.isRemoving()
            if (r0 == 0) goto L_0x00d0
        L_0x00bc:
            X.6CO r5 = new X.6CO
            r5.<init>()
            android.app.FragmentManager r0 = r8.getFragmentManager()
            android.app.FragmentTransaction r0 = r0.beginTransaction()
            android.app.FragmentTransaction r0 = r0.add(r5, r4)
            r0.commitAllowingStateLoss()
        L_0x00d0:
            java.lang.ref.WeakReference r0 = X.AnonymousClass0x9.A14(r5)
            r1.put(r8, r0)
            goto L_0x0100
        L_0x00d8:
            r2 = move-exception
            java.lang.String r1 = "Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x00e1:
            boolean r0 = r5.A0i
            if (r0 == 0) goto L_0x00f9
        L_0x00e5:
            com.google.android.gms.common.api.internal.zzd r5 = new com.google.android.gms.common.api.internal.zzd
            r5.<init>()
            X.0df r1 = r8.getSupportFragmentManager()
            X.0dc r0 = new X.0dc
            r0.<init>(r1)
            r0.A0C(r5, r6)
            r0.A02()
        L_0x00f9:
            java.lang.ref.WeakReference r0 = X.AnonymousClass0x9.A14(r5)
            r4.put(r8, r0)
        L_0x0100:
            java.lang.String r1 = "ConnectionlessLifecycleHelper"
            java.lang.Class<X.6R3> r0 = X.AnonymousClass6R3.class
            com.google.android.gms.common.api.internal.LifecycleCallback r1 = r5.B5A(r0, r1)
            X.6R3 r1 = (X.AnonymousClass6R3) r1
            if (r1 != 0) goto L_0x0113
            X.6Q8 r0 = X.AnonymousClass6Q8.A00
            X.6R3 r1 = new X.6R3
            r1.<init>(r0, r3, r5)
        L_0x0113:
            X.0nO r0 = r1.A01
            r0.add(r2)
            r3.A07(r1)
        L_0x011b:
            android.os.Handler r1 = r3.A06
            r0 = 7
            X.AnonymousClass6C7.A10(r1, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass89B.<init>(android.app.Activity, android.content.Context, X.8vl, X.7Jm, X.7gG):void");
    }

    public final void A03(C127186Qz r5, int i) {
        r5.A04();
        C163007t7 r0 = this.A07;
        AnonymousClass6C7.A10(r0.A06, new C148757Jp(this, new AnonymousClass6RI(r5, i), r0.A0D.get()), 4);
    }

    public AnonymousClass89B(Context context, C186678vl r8, C148727Jm r9, C156227gG r10) {
        this((Activity) null, context, r8, r9, r10);
    }
}
