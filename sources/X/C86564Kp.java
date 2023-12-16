package X;

import android.app.Activity;
import android.os.Build;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.util.Log;

/* renamed from: X.4Kp  reason: invalid class name and case insensitive filesystem */
public class C86564Kp implements C85014Ep {
    public Object A00;
    public final int A01;

    public C86564Kp(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void A00() {
        Activity activity = (Activity) this.A00;
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.f11nameremoved;
        if (i >= 30) {
            i2 = R.string.f11nameremoved;
            if (i < 33) {
                i2 = R.string.f11nameremoved;
            }
        }
        RequestPermissionActivity.A0b(activity, R.string.f11nameremoved, i2);
    }

    public void BZP(String str) {
        switch (this.A01) {
            case 0:
                throw AnonymousClass001.A0e("must not be called");
            case 1:
                throw AnonymousClass001.A0e("inAppBugReporting/external-storage-readonly");
            case 2:
                throw AnonymousClass001.A0e("ContactUsDebugInfoRepository/must not be called/external-storage-readonly/must not be called");
            case 3:
                Log.i("settings-chat/readonly-external-storage-readonly");
                C89654ea r3 = (C89654ea) this.A00;
                boolean A012 = C61072zf.A01();
                int i = R.string.f11nameremoved;
                if (A012) {
                    i = R.string.f11nameremoved;
                }
                r3.Box(new Object[0], R.string.f11nameremoved, i);
                return;
            default:
                throw AnonymousClass001.A0e("must not be called");
        }
    }

    public void BZQ() {
        switch (this.A01) {
            case 0:
                throw AnonymousClass001.A0e("must not be called");
            case 1:
                throw AnonymousClass001.A0e("inAppBugReporting/external-storage-readonly/permission denied");
            case 2:
                throw AnonymousClass001.A0e("ContactUsDebugInfoRepository/must not be called/external-storage-readonly/permission denied/");
            case 3:
                Log.i("settings-chat/readonly-external-storage-readonly-permission");
                A00();
                return;
            default:
                throw AnonymousClass001.A0e("must not be called");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        X.C18260x0.A1L(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0059, code lost:
        X.C621433s.A01(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Beo(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x0044;
                case 1: goto L_0x001c;
                case 2: goto L_0x0030;
                case 3: goto L_0x004d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r3.A00
            X.1tu r2 = (X.C33921tu) r2
            r0 = -2
            r2.A00 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "contactsupporttask/externalstorage/avail external storage not calculated, state="
            r1.append(r0)
            java.lang.String r0 = r2.A01
        L_0x0018:
            X.C18260x0.A1L(r1, r0)
            return
        L_0x001c:
            java.lang.Object r2 = r3.A00
            X.2Ti r2 = (X.C43752Ti) r2
            r0 = -2
            r2.A00 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "inAppBugReporting/error-external-storage-unavailable/state="
            r1.append(r0)
            java.lang.String r0 = r2.A01
            goto L_0x0018
        L_0x0030:
            java.lang.Object r2 = r3.A00
            X.2TL r2 = (X.AnonymousClass2TL) r2
            r0 = -2
            r2.A00 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ContactUsDebugInfoRepository/error-external-storage-unavailable/state="
            r1.append(r0)
            java.lang.String r0 = r2.A01
            goto L_0x0018
        L_0x0044:
            java.lang.Object r0 = r3.A00
            X.1qJ r0 = (X.C32381qJ) r0
            android.app.Activity r1 = r0.A01
            r0 = 107(0x6b, float:1.5E-43)
            goto L_0x0059
        L_0x004d:
            java.lang.String r0 = "settings-chat/external-storage-unavailable"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r3.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 602(0x25a, float:8.44E-43)
        L_0x0059:
            X.C621433s.A01(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86564Kp.Beo(java.lang.String):void");
    }

    public void Bep() {
        int i;
        String str;
        switch (this.A01) {
            case 0:
                Activity activity = ((C32381qJ) this.A00).A01;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 30) {
                    i = R.string.f11nameremoved;
                } else {
                    i = R.string.f11nameremoved;
                    if (i2 < 33) {
                        i = R.string.f11nameremoved;
                    }
                }
                RequestPermissionActivity.A0c(activity, R.string.f11nameremoved, i, 200);
                return;
            case 1:
                ((C43752Ti) this.A00).A00 = -2;
                str = "inAppBugReporting/error-external-storage-unavailable/permission denied";
                break;
            case 2:
                ((AnonymousClass2TL) this.A00).A00 = -2;
                str = "ContactUsDebugInfoRepository/error-external-storage-unavailable/permission denied";
                break;
            case 3:
                Log.i("settings-chat/external-storage-unavailable-permission");
                A00();
                return;
            default:
                ((C33921tu) this.A00).A00 = -2;
                str = "contactsupporttask/externalstorage/avail external storage not calculated, permission denied";
                break;
        }
        Log.i(str);
    }
}
