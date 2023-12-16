package X;

import android.app.Activity;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.3QL  reason: invalid class name */
public class AnonymousClass3QL implements AnonymousClass4EV {
    public AnonymousClass3ZH A00;
    public WeakReference A01;
    public final C69263Wi A02;
    public final AnonymousClass5ZU A03;
    public final C56512s6 A04;
    public final C61072zf A05;
    public final AnonymousClass4FV A06;

    public void BRW(boolean z) {
        this.A01 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e0, code lost:
        if (r0 == false) goto L_0x00e2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C625435m r8) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.C28141fl
            if (r0 == 0) goto L_0x0060
            r4 = 2131892749(0x7f121a0d, float:1.9420255E38)
            java.lang.ref.WeakReference r0 = r7.A01
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r6 = r0.get()
            android.app.Activity r6 = (android.app.Activity) r6
            if (r6 == 0) goto L_0x00e6
            boolean r0 = X.C621433s.A03(r6)
            if (r0 != 0) goto L_0x00e6
            X.3Wi r0 = r7.A02
            X.4FU r0 = r0.A00
            if (r0 != r6) goto L_0x00e6
            int r5 = r8.A01
            r0 = 9
            r3 = 0
            if (r5 != r0) goto L_0x003e
            X.2s6 r2 = r7.A04
            X.2zf r1 = r7.A05
            X.3FE r0 = new X.3FE
            r0.<init>(r6, r1)
            boolean r0 = r2.A08(r0)
            if (r0 == 0) goto L_0x003d
        L_0x0035:
            r1 = 2131894549(0x7f122115, float:1.9423906E38)
        L_0x0038:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r7.A01(r0, r5, r4, r1)
        L_0x003d:
            return
        L_0x003e:
            r0 = 4
            if (r5 != r0) goto L_0x004e
            boolean r0 = X.C61072zf.A01()
            r1 = 2131890241(0x7f121041, float:1.9415168E38)
            if (r0 == 0) goto L_0x0038
            r1 = 2131890240(0x7f121040, float:1.9415166E38)
            goto L_0x0038
        L_0x004e:
            r0 = 5
            if (r5 != r0) goto L_0x0055
            r1 = 2131892750(0x7f121a0e, float:1.9420257E38)
            goto L_0x0038
        L_0x0055:
            r0 = 8
            if (r5 == r0) goto L_0x005c
            r0 = -1
            if (r5 != r0) goto L_0x0035
        L_0x005c:
            r1 = 2131890263(0x7f121057, float:1.9415213E38)
            goto L_0x0038
        L_0x0060:
            java.lang.ref.WeakReference r0 = r7.A01
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r3 = r0.get()
            android.app.Activity r3 = (android.app.Activity) r3
            if (r3 == 0) goto L_0x00ea
            boolean r0 = X.C621433s.A03(r3)
            if (r0 != 0) goto L_0x00ea
            X.3Wi r0 = r7.A02
            X.4FU r0 = r0.A00
            if (r0 != r3) goto L_0x00ea
            int r6 = r8.A01
            r0 = 9
            r5 = 0
            if (r6 != r0) goto L_0x009a
            X.2s6 r2 = r7.A04
            X.2zf r1 = r7.A05
            X.3FE r0 = new X.3FE
            r0.<init>(r3, r1)
            boolean r0 = r2.A08(r0)
            if (r0 == 0) goto L_0x003d
        L_0x008e:
            r2 = 2131888744(0x7f120a68, float:1.9412132E38)
            r1 = 2131894548(0x7f122114, float:1.9423904E38)
        L_0x0094:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r7.A01(r0, r6, r2, r1)
            return
        L_0x009a:
            r0 = 4
            if (r6 != r0) goto L_0x00a4
            r2 = 2131888744(0x7f120a68, float:1.9412132E38)
            r1 = 2131890243(0x7f121043, float:1.9415172E38)
            goto L_0x0094
        L_0x00a4:
            r0 = 5
            if (r6 != r0) goto L_0x00cb
            X.3ZH r4 = r7.A00
            if (r4 == 0) goto L_0x00c7
            r3 = 2131888744(0x7f120a68, float:1.9412132E38)
            X.4uZ r0 = r4.A0H
            boolean r0 = r0 instanceof X.C95804uY
            r2 = 2131894351(0x7f12204f, float:1.9423504E38)
            if (r0 == 0) goto L_0x00ba
            r2 = 2131891174(0x7f1213e6, float:1.941706E38)
        L_0x00ba:
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()
            X.5ZU r0 = r7.A03
            X.C18300x5.A1E(r0, r4, r1, r5)
            r7.A01(r1, r6, r3, r2)
            return
        L_0x00c7:
            r2 = 2131888744(0x7f120a68, float:1.9412132E38)
            goto L_0x00e2
        L_0x00cb:
            r0 = 8
            if (r6 == r0) goto L_0x00d2
            r0 = -1
            if (r6 != r0) goto L_0x008e
        L_0x00d2:
            r2 = 2131888744(0x7f120a68, float:1.9412132E38)
            X.3ZH r0 = r7.A00
            if (r0 == 0) goto L_0x00e2
            X.4uZ r0 = r0.A0H
            boolean r0 = r0 instanceof X.C95804uY
            r1 = 2131891174(0x7f1213e6, float:1.941706E38)
            if (r0 != 0) goto L_0x0094
        L_0x00e2:
            r1 = 2131890262(0x7f121056, float:1.941521E38)
            goto L_0x0094
        L_0x00e6:
            java.lang.String r0 = "productdownloadlistener/notifyuser/skip"
            goto L_0x00ec
        L_0x00ea:
            java.lang.String r0 = "basemediadownloadlistener/notifyuser/skip"
        L_0x00ec:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3QL.A00(X.35m):void");
    }

    public void A01(Object[] objArr, int i, int i2, int i3) {
        Activity activity;
        WeakReference weakReference = this.A01;
        if (weakReference == null || (activity = (Activity) weakReference.get()) == null || C621433s.A03(activity) || this.A02.A00 != activity) {
            Log.i("basemediadownloadlistener/notifyuser/skip");
            return;
        }
        C626936e.A06(activity);
        AnonymousClass4FU r3 = (AnonymousClass4FU) activity;
        Object[] objArr2 = objArr;
        int i4 = i2;
        int i5 = i3;
        if (i == 4) {
            r3.Bow(new AnonymousClass3CW(activity, AnonymousClass297.A00(this.A06, 4), 4), objArr2, i4, i5, R.string.f11nameremoved);
        } else {
            r3.Box(objArr, i2, i3);
        }
    }

    public /* synthetic */ void BRU(long j) {
    }

    public void BRX(C625435m r7, C56902sk r8) {
        C66453Lm r1;
        if (this instanceof C28151fm) {
            C28151fm r3 = (C28151fm) this;
            int i = r7.A01;
            if (AnonymousClass000.A1T(i)) {
                r1 = r3.A00;
                synchronized (r1) {
                    Log.i("gdpr/on-report-downloaded");
                    r1.A09(C373221u.DOWNLOADED.value);
                }
            } else if (i == 5 || i == 8) {
                r3.A01(new Object[0], i, R.string.f11nameremoved, R.string.f11nameremoved);
                r3.A00.A07();
            } else if (i == 4) {
                r3.A01(new Object[0], i, R.string.f11nameremoved, R.string.f11nameremoved);
            } else {
                r3.A00(r7);
                r1 = r3.A00;
                synchronized (r1) {
                    Log.i("gdpr/on-report-download-failed");
                    r1.A09(C373221u.DOWNLOAD_FAILED.value);
                }
            }
            r3.A01 = null;
        } else if (this instanceof C28161fn) {
            C28161fn r32 = (C28161fn) this;
            int i2 = r7.A01;
            if (AnonymousClass000.A1T(i2)) {
                return;
            }
            if (i2 == 9) {
                if (!r32.A02) {
                    r32.A00(r7);
                    r32.A02 = true;
                }
            } else if (i2 == 4) {
                if (!r32.A00) {
                    r32.A00(r7);
                    r32.A00 = true;
                }
            } else if (i2 != 2 && i2 != 3 && i2 != 11) {
                r32.A00(r7);
            } else if (!r32.A01) {
                r32.A00(r7);
                r32.A01 = true;
            }
        } else if (!AnonymousClass000.A1T(r7.A01)) {
            A00(r7);
            this.A01 = null;
        }
    }

    public AnonymousClass3QL(Activity activity, C69263Wi r3, AnonymousClass5ZU r4, C56512s6 r5, C61072zf r6, AnonymousClass3ZH r7, AnonymousClass4FV r8) {
        this.A02 = r3;
        this.A06 = r8;
        this.A05 = r6;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = AnonymousClass0x9.A14(activity);
        this.A00 = r7;
    }
}
