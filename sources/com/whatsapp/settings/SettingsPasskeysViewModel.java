package com.whatsapp.settings;

import X.AnonymousClass08M;
import X.AnonymousClass0IV;
import X.AnonymousClass0x2;
import X.AnonymousClass20D;
import X.AnonymousClass33p;
import X.AnonymousClass4BG;
import X.AnonymousClass4BH;
import X.C05550Ty;
import X.C18260x0;
import X.C18280x3;
import X.C18330xA;
import X.C616131n;
import X.C84814Du;
import X.C85494Gl;
import com.whatsapp.registration.passkeys.PasskeyServerApiImpl;

public final class SettingsPasskeysViewModel extends C05550Ty {
    public AnonymousClass08M A00;
    public final AnonymousClass33p A01;
    public final AnonymousClass4BG A02;
    public final AnonymousClass4BH A03;
    public final PasskeyServerApiImpl A04;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0D(X.C009707r r9, X.C84814Du r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C118635tr
            if (r0 == 0) goto L_0x0069
            r4 = r10
            X.5tr r4 = (X.C118635tr) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0069
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r6 = r4.result
            X.218 r7 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r4.label
            r3 = 1
            r5 = 0
            if (r0 == 0) goto L_0x003e
            if (r0 != r3) goto L_0x0080
            java.lang.Object r4 = r4.L$0
            com.whatsapp.settings.SettingsPasskeysViewModel r4 = (com.whatsapp.settings.SettingsPasskeysViewModel) r4
            X.C57682u2.A01(r6)
        L_0x0025:
            X.58d r6 = (X.C997758d) r6
            int r0 = r6.ordinal()
            if (r0 == r5) goto L_0x006f
            r3 = 3
            if (r0 != r3) goto L_0x003d
            X.4C6 r2 = X.AnonymousClass0IV.A00(r4)
            r1 = 0
            com.whatsapp.settings.SettingsPasskeysViewModel$syncPasskeyExistenceFromServer$1 r0 = new com.whatsapp.settings.SettingsPasskeysViewModel$syncPasskeyExistenceFromServer$1
            r0.<init>(r4, r1)
            X.C616131n.A02(r1, r0, r2, r1, r3)
        L_0x003d:
            return r6
        L_0x003e:
            X.C57682u2.A01(r6)
            X.4BG r2 = r8.A02
            X.4BH r1 = r8.A03
            r0 = 2
            X.5OE r0 = r1.B06(r0)
            com.whatsapp.registration.passkeys.PasskeyFacade r2 = r2.B05(r0)
            r1 = 6
            X.3bs r0 = new X.3bs
            r0.<init>((java.lang.Object) r9, (int) r1)
            r9.runOnUiThread(r0)
            X.5y8 r0 = new X.5y8
            r0.<init>(r9)
            r4.L$0 = r8
            r4.label = r3
            java.lang.Object r6 = r2.A01(r9, r4, r0)
            if (r6 != r7) goto L_0x0067
            return r7
        L_0x0067:
            r4 = r8
            goto L_0x0025
        L_0x0069:
            X.5tr r4 = new X.5tr
            r4.<init>(r8, r10)
            goto L_0x0012
        L_0x006f:
            X.33p r0 = r4.A01
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "reg_passkey_exists"
            X.C18270x1.A0l(r1, r0, r3)
            X.08M r0 = r4.A00
            X.C18320x8.A18(r0, r3)
            return r6
        L_0x0080:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsPasskeysViewModel.A0D(X.07r, X.4Du):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0E(X.C84814Du r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C118645ts
            if (r0 == 0) goto L_0x005f
            r3 = r7
            X.5ts r3 = (X.C118645ts) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005f
            int r2 = r2 - r1
            r3.label = r2
        L_0x0012:
            java.lang.Object r5 = r3.result
            X.218 r2 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L_0x004d
            if (r0 != r1) goto L_0x0065
            java.lang.Object r4 = r3.L$0
            com.whatsapp.settings.SettingsPasskeysViewModel r4 = (com.whatsapp.settings.SettingsPasskeysViewModel) r4
            X.C57682u2.A01(r5)
        L_0x0024:
            boolean r0 = r5 instanceof X.C97714z7
            if (r0 == 0) goto L_0x003a
            X.33p r0 = r4.A01
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "reg_passkey_exists"
            X.C18270x1.A0l(r1, r0, r2)
            X.08M r0 = r4.A00
            X.C18320x8.A18(r0, r2)
        L_0x0039:
            return r5
        L_0x003a:
            boolean r0 = r5 instanceof X.C97704z6
            if (r0 == 0) goto L_0x0039
            X.4C6 r3 = X.AnonymousClass0IV.A00(r4)
            r2 = 0
            com.whatsapp.settings.SettingsPasskeysViewModel$syncPasskeyExistenceFromServer$1 r1 = new com.whatsapp.settings.SettingsPasskeysViewModel$syncPasskeyExistenceFromServer$1
            r1.<init>(r4, r2)
            r0 = 3
            X.C616131n.A02(r2, r1, r3, r2, r0)
            return r5
        L_0x004d:
            X.C57682u2.A01(r5)
            com.whatsapp.registration.passkeys.PasskeyServerApiImpl r0 = r6.A04
            r3.L$0 = r6
            r3.label = r1
            java.lang.Object r5 = r0.A03(r3)
            if (r5 != r2) goto L_0x005d
            return r2
        L_0x005d:
            r4 = r6
            goto L_0x0024
        L_0x005f:
            X.5ts r3 = new X.5ts
            r3.<init>(r6, r7)
            goto L_0x0012
        L_0x0065:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsPasskeysViewModel.A0E(X.4Du):java.lang.Object");
    }

    public SettingsPasskeysViewModel(AnonymousClass33p r5, AnonymousClass4BG r6, AnonymousClass4BH r7, PasskeyServerApiImpl passkeyServerApiImpl) {
        C18260x0.A0c(passkeyServerApiImpl, r5, r6, r7);
        this.A04 = passkeyServerApiImpl;
        this.A01 = r5;
        this.A02 = r6;
        this.A03 = r7;
        this.A00 = C18330xA.A01(Boolean.valueOf(C18280x3.A1W(AnonymousClass0x2.A0F(r5), "reg_passkey_exists")));
        C616131n.A02((C85494Gl) null, new SettingsPasskeysViewModel$syncPasskeyExistenceFromServer$1(this, (C84814Du) null), AnonymousClass0IV.A00(this), (AnonymousClass20D) null, 3);
    }
}
