package com.whatsapp;

import X.AnonymousClass002;
import X.AnonymousClass00W;
import X.AnonymousClass0N6;
import X.AnonymousClass3YV;
import X.AnonymousClass4FS;
import X.AnonymousClass4GJ;
import X.C005105f;
import X.C18280x3;
import X.C22031Ec;
import X.C46452be;
import X.C56512s6;
import X.C64323Da;
import X.C64333Db;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ExternalMediaManager extends C005105f implements AnonymousClass4GJ {
    public AnonymousClass0N6 A00;
    public C56512s6 A01;
    public C46452be A02;
    public AnonymousClass4FS A03;
    public boolean A04;
    public final Object A05;
    public volatile AnonymousClass3YV A06;

    public class ExternalMediaStateReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            if (C18280x3.A1V(intent, "android.intent.action.MEDIA_BAD_REMOVAL") || C18280x3.A1V(intent, "android.intent.action.MEDIA_EJECT") || C18280x3.A1V(intent, "android.intent.action.MEDIA_MOUNTED") || C18280x3.A1V(intent, "android.intent.action.MEDIA_REMOVED") || C18280x3.A1V(intent, "android.intent.action.MEDIA_SHARED") || C18280x3.A1V(intent, "android.intent.action.MEDIA_UNMOUNTED")) {
                Class<ExternalMediaManager> cls = ExternalMediaManager.class;
                AnonymousClass00W.A00(context, intent.setClass(context, cls), cls, 5);
            }
        }
    }

    public final Object generatedComponent() {
        if (this.A06 == null) {
            synchronized (this.A05) {
                if (this.A06 == null) {
                    this.A06 = new AnonymousClass3YV(this);
                }
            }
        }
        return this.A06.generatedComponent();
    }

    public void onCreate() {
        if (!this.A04) {
            this.A04 = true;
            C64333Db r1 = ((C22031Ec) ((C64323Da) generatedComponent())).A06;
            this.A03 = C64333Db.A8y(r1);
            this.A00 = (AnonymousClass0N6) r1.A1u.get();
            this.A01 = (C56512s6) r1.AK3.get();
            this.A02 = (C46452be) r1.A00.A7J.get();
        }
        super.onCreate();
    }

    public ExternalMediaManager(int i) {
        this.A05 = AnonymousClass002.A0D();
        this.A04 = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(android.content.Intent r6) {
        /*
            r5 = this;
            java.lang.String r4 = android.os.Environment.getExternalStorageState()
            java.lang.String r0 = "mounted"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0047
            java.lang.String r0 = "mounted_ro"
            boolean r1 = r4.equals(r0)
            X.2s6 r0 = r5.A01
            X.8qC r0 = r0.A06
            if (r1 != 0) goto L_0x0061
            java.lang.Object r1 = r0.get()
            X.2NX r1 = (X.AnonymousClass2NX) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0039
            r0 = 1
            r1.A00 = r0
            r1.A01 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "media-state-manager/external/unavailable "
            r1.append(r0)
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            X.C18260x0.A1L(r1, r0)
        L_0x0039:
            X.0N6 r0 = r5.A00
            X.0vR r0 = r0.A00()
            X.0hV r0 = (X.C10170hV) r0
            X.0hc r0 = r0.A01
            r0.A0Y(r4)
            return
        L_0x0047:
            X.2s6 r0 = r5.A01
            X.8qC r0 = r0.A06
            java.lang.Object r2 = r0.get()
            X.2NX r2 = (X.AnonymousClass2NX) r2
            boolean r0 = r2.A00
            r1 = 0
            if (r0 != 0) goto L_0x005a
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x0039
        L_0x005a:
            r2.A00 = r1
            r2.A01 = r1
            java.lang.String r0 = "media-state-manager/external/available"
            goto L_0x0077
        L_0x0061:
            java.lang.Object r2 = r0.get()
            X.2NX r2 = (X.AnonymousClass2NX) r2
            boolean r0 = r2.A00
            r1 = 0
            if (r0 != 0) goto L_0x0070
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0039
        L_0x0070:
            r2.A00 = r1
            r0 = 1
            r2.A01 = r0
            java.lang.String r0 = "media-state-manager/read-only"
        L_0x0077:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2be r2 = r5.A02
            X.2s6 r3 = r2.A02
            X.8qC r1 = r3.A06
            java.lang.Object r0 = r1.get()
            X.2NX r0 = (X.AnonymousClass2NX) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0039
            java.lang.Object r0 = r1.get()
            X.2NX r0 = (X.AnonymousClass2NX) r0
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x009c
            X.3Dh r0 = r2.A00
            r0.A0Y()
            r2.A00()
        L_0x009c:
            X.8qC r0 = r2.A04
            java.lang.Object r0 = r0.get()
            X.0sw r0 = (X.C16390sw) r0
            r0.BkR()
            X.3Wi r2 = r2.A01
            java.util.Objects.requireNonNull(r3)
            r1 = 23
            X.3cG r0 = new X.3cG
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.BkS(r0)
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ExternalMediaManager.A08(android.content.Intent):void");
    }

    public ExternalMediaManager() {
        this(0);
    }
}
