package X;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import java.util.Iterator;

/* renamed from: X.1u6  reason: invalid class name and case insensitive filesystem */
public abstract class C34021u6 extends AnonymousClass5ZM {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final /* synthetic */ C54952pY A03;

    public C34021u6(C54952pY r1, boolean z, boolean z2, boolean z3) {
        this.A03 = r1;
        this.A00 = z;
        this.A02 = z2;
        this.A01 = z3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r9) {
        /*
            r8 = this;
            X.2xb r9 = (X.C59852xb) r9
            r6 = r8
            r4 = r9
            boolean r5 = r8 instanceof X.C32331qE
            if (r5 != 0) goto L_0x007e
            boolean r0 = r8 instanceof X.C32341qF
            if (r0 != 0) goto L_0x007e
            X.1qG r6 = (X.C32351qG) r6
            X.0xG r0 = X.C32381qJ.A0G
            if (r0 == 0) goto L_0x001e
            X.1qJ r0 = r6.A01
            android.app.Activity r1 = r0.A01
            r0 = 100
            X.C621433s.A00(r1, r0)
            r0 = 0
            X.C32381qJ.A0G = r0
        L_0x001e:
            int r1 = r9.A00
            if (r1 == 0) goto L_0x002e
            r0 = 3
            if (r1 == r0) goto L_0x002e
            r0 = 4
            if (r1 == r0) goto L_0x002e
            r0 = 5
            if (r1 == r0) goto L_0x002e
            r0 = 6
            if (r1 != r0) goto L_0x0072
        L_0x002e:
            java.util.concurrent.atomic.AtomicReference r1 = X.C32381qJ.A0H
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x0072
            java.lang.Object r4 = r1.get()
            X.2xb r4 = (X.C59852xb) r4
        L_0x003c:
            int r1 = r4.A00
            if (r1 == 0) goto L_0x004c
            r0 = 3
            if (r1 == r0) goto L_0x004c
            r0 = 4
            if (r1 == r0) goto L_0x004c
            r0 = 5
            if (r1 == r0) goto L_0x004c
            r0 = 6
            if (r1 != r0) goto L_0x007e
        L_0x004c:
            r3 = 1
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "restore>PrepareMessageStoreTask/"
            r2.append(r1)
            java.lang.String r0 = "setting onePrepareMsgstoreTaskAlreadyFinished to true"
            X.C18260x0.A1L(r2, r0)
            X.1qJ r0 = r6.A01
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0D
            boolean r0 = r0.getAndSet(r3)
            if (r0 == 0) goto L_0x007e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r1)
            java.lang.String r0 = "this attempt failed but another attempt in parallel proceeded further than this stage, therefore, aborting this attempt "
            X.C18260x0.A1R(r1, r0, r4)
        L_0x0071:
            return
        L_0x0072:
            java.util.concurrent.atomic.AtomicReference r1 = X.C32381qJ.A0H
            java.lang.Object r0 = r1.get()
            if (r0 != 0) goto L_0x003c
            r1.set(r9)
            goto L_0x003c
        L_0x007e:
            int r6 = r9.A00
            r1 = 2
            r0 = 1
            if (r6 == r1) goto L_0x0087
            if (r6 == r0) goto L_0x0087
            r0 = 0
        L_0x0087:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            if (r5 == 0) goto L_0x00fe
            java.lang.String r1 = "restore>PrepareMessageStoreTransferTask/"
        L_0x0090:
            if (r0 == 0) goto L_0x00f5
            r2.append(r1)
            java.lang.String r0 = "success"
            X.C18260x0.A1L(r2, r0)
            boolean r2 = r8.A00
            if (r2 != 0) goto L_0x00b1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r1)
            java.lang.String r0 = "notregname/send-active"
            X.C18260x0.A1L(r1, r0)
            X.2pY r0 = r8.A03
            X.3Lj r1 = r0.A03
            r0 = 1
            r1.A03(r0)
        L_0x00b1:
            X.2pY r1 = r8.A03
            X.2iS r0 = r1.A04
            r0.A01()
            if (r2 != 0) goto L_0x00bf
            X.3Lt r0 = r1.A02
            r0.A04()
        L_0x00bf:
            X.2pY r2 = r8.A03
            boolean r0 = r2 instanceof X.C32361qH
            if (r0 == 0) goto L_0x017f
            X.1qH r2 = (X.C32361qH) r2
            X.10z r7 = r2.A06
            boolean r0 = r9 instanceof X.AnonymousClass1RM
            if (r0 == 0) goto L_0x0177
            java.lang.String r0 = "DirectTransferBackgroundTaskViewModel/removeAllListener"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.Handler r1 = r7.A00
            java.lang.Runnable r0 = r7.A0D
            r1.removeCallbacks(r0)
            X.33p r0 = r7.A06
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "migrate_from_other_app_attempt_count"
            int r1 = X.C18280x3.A02(r1, r0)
            switch(r6) {
                case 0: goto L_0x0105;
                case 1: goto L_0x0107;
                case 2: goto L_0x00e9;
                case 3: goto L_0x010a;
                case 4: goto L_0x010d;
                case 5: goto L_0x0110;
                case 6: goto L_0x0112;
                case 7: goto L_0x0114;
                case 8: goto L_0x0117;
                case 9: goto L_0x0119;
                case 10: goto L_0x011b;
                case 11: goto L_0x011d;
                case 12: goto L_0x0120;
                case 13: goto L_0x0123;
                case 14: goto L_0x0126;
                case 15: goto L_0x0129;
                case 16: goto L_0x012c;
                case 17: goto L_0x012f;
                case 18: goto L_0x0132;
                case 19: goto L_0x00e9;
                case 20: goto L_0x0102;
                default: goto L_0x00e9;
            }
        L_0x00e9:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "state is not recognized or not used = "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r6)
            throw r0
        L_0x00f5:
            r2.append(r1)
            java.lang.String r0 = "failed with status: "
            X.C18260x0.A1R(r2, r0, r9)
            goto L_0x00bf
        L_0x00fe:
            java.lang.String r1 = "restore>PrepareMessageStoreTask/"
            goto L_0x0090
        L_0x0102:
            r0 = 19
            goto L_0x0134
        L_0x0105:
            r0 = 3
            goto L_0x0134
        L_0x0107:
            r0 = 20
            goto L_0x0134
        L_0x010a:
            r0 = 16
            goto L_0x0134
        L_0x010d:
            r0 = 17
            goto L_0x0134
        L_0x0110:
            r0 = 1
            goto L_0x0134
        L_0x0112:
            r0 = 2
            goto L_0x0134
        L_0x0114:
            r0 = 18
            goto L_0x0134
        L_0x0117:
            r0 = 5
            goto L_0x0134
        L_0x0119:
            r0 = 6
            goto L_0x0134
        L_0x011b:
            r0 = 7
            goto L_0x0134
        L_0x011d:
            r0 = 8
            goto L_0x0134
        L_0x0120:
            r0 = 9
            goto L_0x0134
        L_0x0123:
            r0 = 10
            goto L_0x0134
        L_0x0126:
            r0 = 11
            goto L_0x0134
        L_0x0129:
            r0 = 12
            goto L_0x0134
        L_0x012c:
            r0 = 13
            goto L_0x0134
        L_0x012f:
            r0 = 14
            goto L_0x0134
        L_0x0132:
            r0 = 15
        L_0x0134:
            r7.A0G(r1, r0)
            boolean r5 = X.AnonymousClass001.A1T(r6)
            r4 = 3
            r3 = 2
            if (r5 != 0) goto L_0x0141
            if (r1 != r4) goto L_0x0157
        L_0x0141:
            X.2mq r2 = r7.A0B
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "migration_state_on_provider_side"
            r1.putInt(r0, r3)
            java.lang.String r0 = "InterAppCommunicationManager/setDirectMigrationStateOnProviderSide"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "com.whatsapp.registration.directmigration.setMigrationStateOnProviderSide"
            r2.A02(r0, r1)
        L_0x0157:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DirectTransferBackgroundTaskViewModel/afterMessageStoreVerified/success = "
            X.C18260x0.A1E(r0, r1, r5)
            if (r5 == 0) goto L_0x0166
            r7.A0F(r3)
            return
        L_0x0166:
            r0 = 5
            if (r6 == r0) goto L_0x0173
            r0 = 6
            if (r6 == r0) goto L_0x0173
            r0 = 7
            if (r6 == r0) goto L_0x0071
            r7.A0F(r4)
            return
        L_0x0173:
            r7.A0F(r0)
            return
        L_0x0177:
            java.lang.String r0 = "should only use RestoreFromDirectMigrationStatus class here"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x017f:
            boolean r1 = r2 instanceof X.C32371qI
            if (r1 != 0) goto L_0x018d
            r0 = r2
            X.1qJ r0 = (X.C32381qJ) r0
            X.2ET r0 = r0.A03
            X.1FB r0 = r0.A00
            r0.A75()
        L_0x018d:
            if (r1 == 0) goto L_0x01a8
            X.1qI r2 = (X.C32371qI) r2
            r1 = 2
            r0 = 1
            if (r6 == r1) goto L_0x0198
            if (r6 == r0) goto L_0x0198
            r0 = 0
        L_0x0198:
            X.1hx r2 = r2.A05
            if (r0 == 0) goto L_0x01a0
            r2.A09()
            return
        L_0x01a0:
            r1 = 202(0xca, float:2.83E-43)
            java.lang.String r0 = "Message Store cannot be verified"
            r2.A0A(r1, r0)
            return
        L_0x01a8:
            X.1qJ r2 = (X.C32381qJ) r2
            X.2ET r0 = r2.A03
            X.1FB r0 = r0.A00
            r0.A77(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34021u6.A0C(java.lang.Object):void");
    }

    public void A0G() {
        if (this instanceof C32341qF) {
            C32371qI r4 = ((C32341qF) this).A00;
            Iterator A0j = AnonymousClass0x2.A0j(r4.A06);
            while (A0j.hasNext()) {
                C56772sX r6 = (C56772sX) A0j.next();
                String A08 = r6.A08();
                try {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("restore>PrepareMessageStoreTask/");
                    C18260x0.A0s(" restoring ", A08, A0o);
                    Context context = r4.A01.A00;
                    C162457s7.A0D(context);
                    r6.A0E(context, AnonymousClass002.A0A(r4.A04.A00.getFilesDir(), "migration/import/sandbox"));
                    C18260x0.A0s(" restored ", A08, AnonymousClass000.A0l("restore>PrepareMessageStoreTask/"));
                } catch (Exception e) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("restore>PrepareMessageStoreTask/");
                    C18260x0.A0v(" failed to restore ", A08, A0o2, e);
                }
            }
            return;
        }
        C32351qG r1 = (C32351qG) this;
        if (r1.A00 && r1.A02) {
            C32381qJ r42 = r1.A01;
            Iterator A0j2 = AnonymousClass0x2.A0j(r42.A0C);
            while (A0j2.hasNext()) {
                C56772sX r5 = (C56772sX) A0j2.next();
                String A082 = r5.A08();
                try {
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    A0o3.append("restore>PrepareMessageStoreTask/");
                    C18260x0.A0s("restoring ", A082, A0o3);
                    Activity activity = r42.A01;
                    C162457s7.A0J(activity, 0);
                    r5.A0E(activity, r5.A02.A02());
                    C18260x0.A0s("restored ", A082, AnonymousClass000.A0l("restore>PrepareMessageStoreTask/"));
                } catch (Exception e2) {
                    StringBuilder A0o4 = AnonymousClass001.A0o();
                    A0o4.append("restore>PrepareMessageStoreTask/");
                    C18260x0.A0v("failed to restore ", A082, A0o4, e2);
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C59852xb A012;
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = this instanceof C32331qE;
        if (z) {
            C32331qE r6 = (C32331qE) this;
            AnonymousClass0N6 r0 = r6.A00.A01;
            AnonymousClass3DX r3 = new AnonymousClass3DX(r6);
            C10170hV r02 = (C10170hV) r0.A00();
            A012 = r02.A09.A0G(new C10320hk(r3, r02), false);
        } else if (this instanceof C32341qF) {
            C32341qF r62 = (C32341qF) this;
            C32371qI r2 = r62.A00;
            r2.A02.A00();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("restore>PrepareMessageStoreTask/");
            C18260x0.A1L(A0o, "initialize msgstore from backup");
            AnonymousClass4KB r7 = new AnonymousClass4KB(r62, 1);
            AnonymousClass0N6 r5 = r2.A01;
            boolean z2 = r62.A01;
            File A013 = r2.A04.A01(AnonymousClass36H.A00);
            C625835r A0N = AnonymousClass0x7.A0N(r5);
            A012 = A0N.A0G(new C65283Gx(A0N, r7, A013), z2);
            C162457s7.A0D(A012);
        } else {
            C32351qG r63 = (C32351qG) this;
            C32381qJ r52 = r63.A01;
            r52.A0B.A00();
            boolean z3 = r63.A02;
            StringBuilder A0o2 = AnonymousClass001.A0o();
            if (z3) {
                A0o2.append("restore>PrepareMessageStoreTask/");
                C18260x0.A1L(A0o2, "initialize msgstore from backup");
                AnonymousClass4KB r32 = new AnonymousClass4KB(r63, 0);
                AnonymousClass0N6 r03 = r52.A01;
                boolean z4 = r63.A01;
                C625835r A0N2 = AnonymousClass0x7.A0N(r03);
                A012 = A0N2.A0G(new C65273Gw(A0N2, r32), z4);
                if (!r63.A00) {
                    C65203Gp r1 = r52.A05;
                    if (r1.A0Q()) {
                        r1.A0H(5);
                    }
                }
            } else {
                A0o2.append("restore>PrepareMessageStoreTask/");
                C18260x0.A1L(A0o2, "initializeMessageStore/newstore");
                A012 = r52.A0A.A01();
            }
        }
        Integer[] numArr = new Integer[1];
        AnonymousClass000.A1L(numArr, 100);
        A0F(numArr);
        long currentTimeMillis2 = 3000 - (System.currentTimeMillis() - currentTimeMillis);
        if ((z || this.A02) && currentTimeMillis2 > 0) {
            SystemClock.sleep(currentTimeMillis2);
        }
        int i = A012.A00;
        if (i == 2 || i == 1) {
            StringBuilder A0o3 = AnonymousClass001.A0o();
            if (z) {
                str = "restore>PrepareMessageStoreTransferTask/";
            } else {
                str = "restore>PrepareMessageStoreTask/";
            }
            A0o3.append(str);
            C18260x0.A1R(A0o3, "result: ", A012);
            if (!z && !(this instanceof C32341qF)) {
                C32351qG r33 = (C32351qG) this;
                if (r33.A02 && i == 2 && r33.A00) {
                    C69263Wi.A00(r33.A01.A02, r33, 14);
                }
            }
            this.A03.A04.A00();
            A0G();
        }
        return A012;
    }
}
