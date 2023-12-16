package X;

import android.app.Activity;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.bloks.ui.BloksDialogFragment;
import java.util.HashMap;

/* renamed from: X.9aN  reason: invalid class name and case insensitive filesystem */
public class C196149aN implements C203529nt {
    public final C69263Wi A00;
    public final C56972sr A01;
    public final C193949Qw A02;
    public final AnonymousClass9VP A03;
    public final C620633i A04;
    public final C56612sH A05;
    public final C620733j A06;
    public final AnonymousClass4FV A07;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0061, code lost:
        r7 = (X.AnonymousClass9Bw) ((X.C203299nT) r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.app.Activity r7, X.AnonymousClass9VZ r8, X.C41182Jg r9, java.util.HashMap r10) {
        /*
            r6 = r7
            X.9lx r6 = (X.C202399lx) r6
            java.lang.String r0 = "clear_backstack"
            java.lang.Object r5 = r10.remove(r0)
            java.lang.String r0 = "get_params_from_stack"
            java.lang.Object r2 = r10.remove(r0)
            java.lang.String r0 = "camera_permission"
            java.lang.Object r4 = r10.remove(r0)
            java.util.Stack r3 = r8.A02
            java.lang.Object r1 = r3.peek()
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            if (r2 == 0) goto L_0x0028
            r0.putAll(r10)
            r10 = r0
        L_0x0028:
            if (r5 == 0) goto L_0x0045
            X.03q r6 = (X.C003203q) r6
            X.0df r2 = r6.getSupportFragmentManager()
            r1 = 0
        L_0x0031:
            int r0 = r2.A07()
            if (r1 >= r0) goto L_0x0045
            r2.A0M()
            java.util.HashMap r0 = r8.A01
            X.AnonymousClass9VZ.A00(r0)
            r3.pop()
            int r1 = r1 + 1
            goto L_0x0031
        L_0x0045:
            java.util.HashMap r0 = r8.A01
            X.AnonymousClass9VZ.A00(r0)
            java.util.HashMap r0 = X.AnonymousClass001.A0t()
            r3.add(r0)
            r8.A02(r10)
            X.48t r2 = r9.A01
            if (r2 == 0) goto L_0x005f
            X.6dJ r1 = r9.A00
            java.lang.String r0 = "backpress"
            r8.A01(r1, r2, r0)
        L_0x005f:
            if (r4 == 0) goto L_0x0074
            X.9nT r7 = (X.C203299nT) r7
            X.9Bw r7 = (X.AnonymousClass9Bw) r7
            X.1VX r2 = r7.A0D
            X.5ZR r0 = r7.A03
            r1 = 30
            android.content.Intent r0 = com.whatsapp.RequestPermissionActivity.A0L(r7, r0, r2, r1)
            if (r0 == 0) goto L_0x0074
            r7.startActivityForResult(r0, r1)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196149aN.A00(android.app.Activity, X.9VZ, X.2Jg, java.util.HashMap):void");
    }

    public void BJb(Activity activity, C41182Jg r6, C47382dA r7, String str, HashMap hashMap) {
        AnonymousClass9VZ r3 = ((AnonymousClass98s) ((C202399lx) activity)).A09;
        A00(activity, r3, r6, hashMap);
        C835248t r2 = r6.A01;
        if (r2 != null) {
            r3.A01(r6.A00, r2, "dialog");
        }
        C08270df r22 = (C08270df) r7.A07.get();
        DialogFragment dialogFragment = (DialogFragment) r22.A0D("bloks-dialog");
        if (dialogFragment != null) {
            dialogFragment.A1K();
        }
        BloksDialogFragment.A00(str, hashMap).A1O(r22, "bloks-dialog");
    }

    public C196149aN(C69263Wi r1, C56972sr r2, C193949Qw r3, AnonymousClass9VP r4, C620633i r5, C56612sH r6, C620733j r7, AnonymousClass4FV r8) {
        this.A05 = r6;
        this.A00 = r1;
        this.A01 = r2;
        this.A07 = r8;
        this.A06 = r7;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
    }
}
