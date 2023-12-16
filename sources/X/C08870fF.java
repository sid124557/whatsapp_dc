package X;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.IBinder;
import androidx.window.layout.DistinctElementSidecarCallback;
import androidx.window.layout.SidecarCompat$TranslatingCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.0fF  reason: invalid class name and case insensitive filesystem */
public final class C08870fF implements C16720tr {
    public C16110sU A00;
    public final C06420Xp A01;
    public final SidecarInterface A02;
    public final Map A03 = new LinkedHashMap();
    public final Map A04 = new LinkedHashMap();

    public final void A02(Activity activity, IBinder iBinder) {
        Map map = this.A04;
        map.put(iBinder, activity);
        SidecarInterface sidecarInterface = this.A02;
        if (sidecarInterface != null) {
            sidecarInterface.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (map.size() == 1 && sidecarInterface != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        C16110sU r1 = this.A00;
        if (r1 != null) {
            r1.Bfq(activity, A00(activity));
        }
        Map map2 = this.A03;
        if (map2.get(activity) == null) {
            C06710Yw r0 = new C06710Yw(activity, this);
            map2.put(activity, r0);
            activity.registerComponentCallbacks(r0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051 A[Catch:{ NoSuchFieldError -> 0x009d, all -> 0x0128 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f7 A[Catch:{ NoSuchFieldError -> 0x009d, all -> 0x0128 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03() {
        /*
            r8 = this;
            r2 = 0
            androidx.window.sidecar.SidecarInterface r7 = r8.A02     // Catch:{ all -> 0x0128 }
            r5 = 0
            r6 = 1
            if (r7 == 0) goto L_0x0026
            java.lang.Class r4 = r7.getClass()     // Catch:{ all -> 0x0128 }
            if (r4 == 0) goto L_0x0026
            java.lang.String r3 = "setSidecarCallback"
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ all -> 0x0128 }
            java.lang.Class<androidx.window.sidecar.SidecarInterface$SidecarCallback> r0 = androidx.window.sidecar.SidecarInterface.SidecarCallback.class
            java.lang.reflect.Method r0 = X.AnonymousClass001.A0r(r4, r0, r3, r1, r2)     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x0026
            java.lang.Class r3 = r0.getReturnType()     // Catch:{ all -> 0x0128 }
        L_0x001d:
            java.lang.Class r0 = java.lang.Void.TYPE     // Catch:{ all -> 0x0128 }
            boolean r0 = X.C162457s7.A0P(r3, r0)     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x0107
            goto L_0x0028
        L_0x0026:
            r3 = r5
            goto L_0x001d
        L_0x0028:
            if (r7 == 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r3 = r5
            goto L_0x0049
        L_0x002d:
            r7.getDeviceState()     // Catch:{ all -> 0x0128 }
            r7.onDeviceStateListenersChanged(r6)     // Catch:{ all -> 0x0128 }
            java.lang.Class r4 = r7.getClass()     // Catch:{ all -> 0x0128 }
            if (r4 == 0) goto L_0x002b
            java.lang.String r3 = "getWindowLayoutInfo"
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ all -> 0x0128 }
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            java.lang.reflect.Method r0 = X.AnonymousClass001.A0r(r4, r0, r3, r1, r2)     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x002b
            java.lang.Class r3 = r0.getReturnType()     // Catch:{ all -> 0x0128 }
        L_0x0049:
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r0 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            boolean r0 = X.C162457s7.A0P(r3, r0)     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x00f7
            if (r7 == 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r3 = r5
            goto L_0x006c
        L_0x0056:
            java.lang.Class r4 = r7.getClass()     // Catch:{ all -> 0x0128 }
            if (r4 == 0) goto L_0x0054
            java.lang.String r3 = "onWindowLayoutChangeListenerAdded"
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ all -> 0x0128 }
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            java.lang.reflect.Method r0 = X.AnonymousClass001.A0r(r4, r0, r3, r1, r2)     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x0054
            java.lang.Class r3 = r0.getReturnType()     // Catch:{ all -> 0x0128 }
        L_0x006c:
            java.lang.Class r0 = java.lang.Void.TYPE     // Catch:{ all -> 0x0128 }
            boolean r0 = X.C162457s7.A0P(r3, r0)     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x00e7
            if (r7 == 0) goto L_0x008c
            java.lang.Class r4 = r7.getClass()     // Catch:{ all -> 0x0128 }
            if (r4 == 0) goto L_0x008c
            java.lang.String r3 = "onWindowLayoutChangeListenerRemoved"
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ all -> 0x0128 }
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            java.lang.reflect.Method r0 = X.AnonymousClass001.A0r(r4, r0, r3, r1, r2)     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x008c
            java.lang.Class r5 = r0.getReturnType()     // Catch:{ all -> 0x0128 }
        L_0x008c:
            java.lang.Class r0 = java.lang.Void.TYPE     // Catch:{ all -> 0x0128 }
            boolean r0 = X.C162457s7.A0P(r5, r0)     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x0117
            androidx.window.sidecar.SidecarDeviceState r7 = new androidx.window.sidecar.SidecarDeviceState     // Catch:{ all -> 0x0128 }
            r7.<init>()     // Catch:{ all -> 0x0128 }
            r5 = 3
            r7.posture = r5     // Catch:{ NoSuchFieldError -> 0x009d }
            goto L_0x00cc
        L_0x009d:
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r4 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r3 = "setPosture"
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ all -> 0x0128 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0128 }
            java.lang.reflect.Method r1 = X.AnonymousClass001.A0r(r4, r0, r3, r1, r2)     // Catch:{ all -> 0x0128 }
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x0128 }
            X.AnonymousClass000.A1P(r0, r5, r2)     // Catch:{ all -> 0x0128 }
            r1.invoke(r7, r0)     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = "getPosture"
            java.lang.Object r1 = X.AnonymousClass000.A0K(r4, r7, r0)     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            X.C162457s7.A0K(r1, r0)     // Catch:{ all -> 0x0128 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0128 }
            int r0 = r1.intValue()     // Catch:{ all -> 0x0128 }
            if (r0 == r5) goto L_0x00cc
            java.lang.String r0 = "Invalid device posture getter/setter"
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x0128 }
            r1.<init>(r0)     // Catch:{ all -> 0x0128 }
            goto L_0x0126
        L_0x00cc:
            androidx.window.sidecar.SidecarDisplayFeature r1 = new androidx.window.sidecar.SidecarDisplayFeature     // Catch:{ all -> 0x0128 }
            r1.<init>()     // Catch:{ all -> 0x0128 }
            android.graphics.Rect r0 = r1.getRect()     // Catch:{ all -> 0x0128 }
            X.C162457s7.A0D(r0)     // Catch:{ all -> 0x0128 }
            r1.setRect(r0)     // Catch:{ all -> 0x0128 }
            r1.getType()     // Catch:{ all -> 0x0128 }
            r1.setType(r6)     // Catch:{ all -> 0x0128 }
            androidx.window.sidecar.SidecarWindowLayoutInfo r0 = new androidx.window.sidecar.SidecarWindowLayoutInfo     // Catch:{ all -> 0x0128 }
            r0.<init>()     // Catch:{ all -> 0x0128 }
            goto L_0x0127
        L_0x00e7:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = "Illegal return type for 'onWindowLayoutChangeListenerAdded': "
            java.lang.String r0 = X.AnonymousClass000.A0P(r3, r0, r1)     // Catch:{ all -> 0x0128 }
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x0128 }
            r1.<init>(r0)     // Catch:{ all -> 0x0128 }
            goto L_0x0126
        L_0x00f7:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = "Illegal return type for 'getWindowLayoutInfo': "
            java.lang.String r0 = X.AnonymousClass000.A0P(r3, r0, r1)     // Catch:{ all -> 0x0128 }
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x0128 }
            r1.<init>(r0)     // Catch:{ all -> 0x0128 }
            goto L_0x0126
        L_0x0107:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = "Illegal return type for 'setSidecarCallback': "
            java.lang.String r0 = X.AnonymousClass000.A0P(r3, r0, r1)     // Catch:{ all -> 0x0128 }
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x0128 }
            r1.<init>(r0)     // Catch:{ all -> 0x0128 }
            goto L_0x0126
        L_0x0117:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = "Illegal return type for 'onWindowLayoutChangeListenerRemoved': "
            java.lang.String r0 = X.AnonymousClass000.A0P(r5, r0, r1)     // Catch:{ all -> 0x0128 }
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x0128 }
            r1.<init>(r0)     // Catch:{ all -> 0x0128 }
        L_0x0126:
            throw r1     // Catch:{ all -> 0x0128 }
        L_0x0127:
            r2 = 1
        L_0x0128:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08870fF.A03():boolean");
    }

    public final SidecarInterface A01() {
        return this.A02;
    }

    public void BmF(C16110sU r5) {
        this.A00 = new C08860fE(r5);
        SidecarInterface sidecarInterface = this.A02;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.A01, new SidecarCompat$TranslatingCallback(this)));
        }
    }

    public C08870fF(Context context) {
        SidecarInterface sidecarImpl = SidecarProvider.getSidecarImpl(context.getApplicationContext());
        C06420Xp r0 = new C06420Xp(C02180Fe.QUIET);
        this.A02 = sidecarImpl;
        this.A01 = r0;
    }

    public final AnonymousClass0P8 A00(Activity activity) {
        SidecarWindowLayoutInfo sidecarWindowLayoutInfo;
        SidecarDeviceState sidecarDeviceState;
        IBinder A002 = C03060Ir.A00(activity);
        if (A002 == null) {
            return new AnonymousClass0P8(AnonymousClass8UF.A0n());
        }
        SidecarInterface sidecarInterface = this.A02;
        if (sidecarInterface != null) {
            sidecarWindowLayoutInfo = sidecarInterface.getWindowLayoutInfo(A002);
        } else {
            sidecarWindowLayoutInfo = null;
        }
        C06420Xp r1 = this.A01;
        if (sidecarInterface == null || (sidecarDeviceState = sidecarInterface.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return r1.A04(sidecarDeviceState, sidecarWindowLayoutInfo);
    }

    public void Bfp(Activity activity) {
        IBinder A002 = C03060Ir.A00(activity);
        if (A002 != null) {
            SidecarInterface sidecarInterface = this.A02;
            if (sidecarInterface != null) {
                sidecarInterface.onWindowLayoutChangeListenerRemoved(A002);
            }
            Map map = this.A03;
            activity.unregisterComponentCallbacks((ComponentCallbacks) map.get(activity));
            map.remove(activity);
            Map map2 = this.A04;
            boolean A1U = AnonymousClass000.A1U(map2.size(), 1);
            map2.remove(A002);
            if (A1U && sidecarInterface != null) {
                sidecarInterface.onDeviceStateListenersChanged(true);
            }
        }
    }
}
