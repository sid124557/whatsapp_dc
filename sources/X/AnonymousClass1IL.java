package X;

import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;

/* renamed from: X.1IL  reason: invalid class name */
public class AnonymousClass1IL extends C10210hZ {
    public int A00;
    public int A01;
    public long A02 = -1;
    public boolean A03;
    public final /* synthetic */ ConversationsFragment A04;

    public static void A00(C08310eF r5, AnonymousClass1IL r6, String str, int i) {
        r6.A01(r5.A0X(R.string.f11nameremoved), str, 3, i, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.lang.String r14, java.lang.String r15, int r16, int r17, boolean r18) {
        /*
            r13 = this;
            r8 = r13
            com.whatsapp.conversationslist.ConversationsFragment r4 = r13.A04
            boolean r0 = r4.A16()
            if (r0 == 0) goto L_0x0014
            X.03q r6 = r4.A0Q()
            if (r6 != 0) goto L_0x0015
            java.lang.String r0 = "conversations-gdrive-observer/set-message/activity-is-null"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x0014:
            return
        L_0x0015:
            java.lang.String r3 = " -> "
            r5 = 1
            r10 = r14
            r9 = r15
            r1 = r16
            if (r1 == r5) goto L_0x00c3
            r0 = 2
            if (r1 == r0) goto L_0x00e6
            r5 = 3
            if (r1 == r5) goto L_0x0094
            r5 = 4
            X.C626936e.A06(r15)
            int r0 = r13.A00
            if (r0 == r5) goto L_0x0056
            java.lang.String r0 = "conversations-gdrive-observer/set-message/show-indeterminate"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r6.isFinishing()
            if (r0 != 0) goto L_0x0056
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "conversations-gdrive-observer/progress-bar-state-change "
            r1.append(r0)
            int r0 = r13.A00
            r1.append(r0)
            X.C18260x0.A0w(r3, r1, r5)
            X.3Wi r2 = r4.A0i
            r1 = 42
            X.5sE r0 = new X.5sE
            r0.<init>(r13, r1)
            r2.A0S(r0)
            r13.A00 = r5
        L_0x0056:
            boolean r0 = r6.isFinishing()
            if (r0 != 0) goto L_0x0068
            X.3Wi r2 = r4.A0i
            r1 = 8
        L_0x0060:
            X.3aI r0 = new X.3aI
            r0.<init>(r13, r14, r15, r1)
            r2.A0S(r0)
        L_0x0068:
            boolean r0 = r13.A03
            r5 = r18
            if (r5 == r0) goto L_0x0014
            boolean r0 = r6.isFinishing()
            if (r0 != 0) goto L_0x0014
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "conversations-gdrive-observer/set-message animation: "
            r1.append(r0)
            boolean r0 = r13.A03
            r1.append(r0)
            X.C18260x0.A1D(r3, r1, r5)
            X.3Wi r2 = r4.A0i
            r1 = 31
            X.3cX r0 = new X.3cX
            r0.<init>((int) r1, (java.lang.Object) r13, (boolean) r5)
            r2.A0S(r0)
            r13.A03 = r5
            return
        L_0x0094:
            X.C626936e.A06(r15)
            int r0 = r13.A00
            if (r0 == r5) goto L_0x00af
            boolean r0 = r6.isFinishing()
            if (r0 != 0) goto L_0x00af
            X.3Wi r2 = r4.A0i
            r1 = 41
            X.5sE r0 = new X.5sE
            r0.<init>(r13, r1)
            r2.A0S(r0)
            r13.A00 = r5
        L_0x00af:
            boolean r0 = r6.isFinishing()
            if (r0 != 0) goto L_0x0068
            X.3Wi r0 = r4.A0i
            r12 = 0
            X.3aZ r7 = new X.3aZ
            r11 = r17
            r7.<init>(r8, r9, r10, r11, r12)
            r0.A0S(r7)
            goto L_0x0068
        L_0x00c3:
            int r0 = r13.A00
            if (r0 == r5) goto L_0x00db
            boolean r0 = r6.isFinishing()
            if (r0 != 0) goto L_0x00db
            X.3Wi r2 = r4.A0i
            r1 = 40
            X.5sE r0 = new X.5sE
            r0.<init>(r13, r1)
            r2.A0S(r0)
            r13.A00 = r5
        L_0x00db:
            boolean r0 = r6.isFinishing()
            if (r0 != 0) goto L_0x0068
            X.3Wi r2 = r4.A0i
            r1 = 7
            goto L_0x0060
        L_0x00e6:
            java.lang.String r0 = "unexpected state"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1IL.A01(java.lang.String, java.lang.String, int, int, boolean):void");
    }

    public void BSR(int i, Bundle bundle) {
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A16()) {
            this.A01 = 2;
            if (i != 10) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("conversations-gdrive-observer/error-during-restore/");
                C18260x0.A1L(A0o, AnonymousClass0YV.A02(i));
                A01(C08310eF.A09(conversationsFragment).getString(R.string.f11nameremoved), C08310eF.A09(conversationsFragment).getString(R.string.f11nameremoved), 1, 0, false);
                conversationsFragment.A0r.A0F();
            }
        }
    }

    public void BWI(int i) {
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A16()) {
            int i2 = i;
            if (i > 0) {
                this.A01 = 10;
                A01(C08310eF.A09(conversationsFragment).getString(R.string.f11nameremoved), AnonymousClass0x7.A0m(conversationsFragment, AnonymousClass001.A0l(conversationsFragment.A1l.A0N(), i), AnonymousClass002.A0L(), R.string.f11nameremoved), 4, i2, true);
            }
        }
    }

    public AnonymousClass1IL(ConversationsFragment conversationsFragment) {
        this.A04 = conversationsFragment;
    }

    public void BWB() {
        C003203q A0Q;
        Log.i("conversations-gdrive-observer/restore-cancelled");
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A16() && (A0Q = conversationsFragment.A0Q()) != null && !A0Q.isFinishing()) {
            conversationsFragment.A0i.A0S(new C117155rT(this, 32, A0Q));
        }
    }

    public void BWD(long j, long j2) {
        Log.i("conversations-gdrive-observer/restore-paused/no-data-connection");
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A16()) {
            this.A01 = 4;
            A00(conversationsFragment, this, C08310eF.A09(conversationsFragment).getString(R.string.f11nameremoved), AnonymousClass000.A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
        }
    }

    public void BWE(long j, long j2) {
        Log.i("conversations-gdrive-observer/restore-paused/low-battery");
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A16()) {
            this.A01 = 5;
            A00(conversationsFragment, this, C08310eF.A09(conversationsFragment).getString(R.string.f11nameremoved), AnonymousClass000.A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
        }
    }

    public void BWF(long j, long j2) {
        Log.i("conversations-gdrive-observer/restore-paused/sdcard-missing");
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A16()) {
            this.A01 = 7;
            A01(C08310eF.A09(conversationsFragment).getString(R.string.f11nameremoved), C08310eF.A09(conversationsFragment).getString(R.string.f11nameremoved), 4, AnonymousClass000.A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2), false);
        }
    }

    public void BWG(long j, long j2) {
        Log.i("conversations-gdrive-observer/restore-paused/sdcard-unmounted");
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A16()) {
            this.A01 = 6;
            A00(conversationsFragment, this, C08310eF.A09(conversationsFragment).getString(R.string.f11nameremoved), AnonymousClass000.A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
        }
    }

    public void BWH(long j, long j2) {
        Log.i("conversations-gdrive-observer/restore-paused/no-wifi");
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A16()) {
            this.A01 = 3;
            A00(conversationsFragment, this, C08310eF.A09(conversationsFragment).getString(R.string.f11nameremoved), AnonymousClass000.A01(j, (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
        }
    }

    public void BWJ() {
        Log.i("conversations-gdrive-observer/restore-start");
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A16()) {
            this.A01 = 9;
            A01(C08310eF.A09(conversationsFragment).getString(R.string.f11nameremoved), C08310eF.A09(conversationsFragment).getString(R.string.f11nameremoved), 4, -1, true);
        }
    }

    public void BWK(long j, long j2) {
        long j3 = j;
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A16() && conversationsFragment.A0Q() != null) {
            String A042 = AnonymousClass35V.A04(conversationsFragment.A1l, j3);
            if (this.A01 != 1 || !A042.equals(AnonymousClass35V.A04(conversationsFragment.A1l, this.A02))) {
                this.A02 = j3;
                String string = C08310eF.A09(conversationsFragment).getString(R.string.f11nameremoved);
                Object[] objArr = new Object[3];
                objArr[0] = A042;
                long j4 = j2;
                objArr[1] = AnonymousClass35V.A04(conversationsFragment.A1l, j4);
                A01(string, AnonymousClass0x7.A0n(conversationsFragment, conversationsFragment.A1l.A0N().format(((double) j3) / ((double) j4)), objArr, 2, R.string.f11nameremoved), 3, (int) ((j * 100) / j2), true);
                this.A01 = 1;
            }
        }
    }

    public void BWC(long j, boolean z) {
        C003203q A0Q;
        C18260x0.A1E("conversations-gdrive-observer/restore-end ", AnonymousClass001.A0o(), z);
        ConversationsFragment conversationsFragment = this.A04;
        if (conversationsFragment.A16() && (A0Q = conversationsFragment.A0Q()) != null) {
            this.A01 = 8;
            this.A02 = -1;
            String A0F = AnonymousClass002.A0F(A0Q, AnonymousClass35V.A04(conversationsFragment.A1l, j), AnonymousClass002.A0L(), 0, R.string.f11nameremoved);
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i > 0) {
                A01(A0Q.getString(R.string.f11nameremoved), A0F, 3, 100, false);
            } else if (i == 0) {
                Log.i("conversations-gdrive-observer/restore-end/nothing-to-restore");
                if (!A0Q.isFinishing()) {
                    conversationsFragment.A0i.A0S(new C117155rT(this, 31, A0Q));
                }
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("conversations-gdrive-observer/restore-end restored: ");
                A0o.append(j);
                Log.e(AnonymousClass000.A0b(" result: ", A0o, z));
            }
        }
    }
}
