package com.whatsapp.backup.google.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass08M;
import X.AnonymousClass0YV;
import X.AnonymousClass33p;
import X.C05550Ty;
import X.C06260Ww;
import X.C06270Wx;
import X.C56612sH;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Locale;

public class GoogleDriveNewUserSetupViewModel extends C05550Ty {
    public static final int[] A06;
    public static final int[] A07 = {0, 4, 1, 2, 3};
    public final AnonymousClass08M A00;
    public final AnonymousClass08M A01;
    public final AnonymousClass08M A02;
    public final C06260Ww A03;
    public final C56612sH A04;
    public final AnonymousClass33p A05;

    static {
        int[] iArr = new int[5];
        C05550Ty.A07(iArr);
        A06 = iArr;
    }

    public void A0D(int i) {
        long j;
        long j2;
        Log.i("gdrive-new-user-setup/next-setup-prompt-timestamp");
        AnonymousClass33p r6 = this.A05;
        if (i != 0) {
            r6.A0t();
        } else {
            r6.A0m();
        }
        long currentTimeMillis = System.currentTimeMillis();
        int A09 = r6.A09();
        if (A09 < 4) {
            j2 = ((long) (A09 * 30)) * 86400000;
        } else if (A09 == 4) {
            j2 = 15552000000L;
        } else {
            j = Long.MAX_VALUE;
            r6.A1F(j);
            Locale locale = Locale.ENGLISH;
            Object[] A0L = AnonymousClass002.A0L();
            A0L[0] = Long.valueOf(r6.A0M());
            Log.i(String.format(locale, "gdrive-new-user-setup/next-setup-prompt-timestamp/%d ms", A0L));
        }
        j = currentTimeMillis + j2;
        r6.A1F(j);
        Locale locale2 = Locale.ENGLISH;
        Object[] A0L2 = AnonymousClass002.A0L();
        A0L2[0] = Long.valueOf(r6.A0M());
        Log.i(String.format(locale2, "gdrive-new-user-setup/next-setup-prompt-timestamp/%d ms", A0L2));
    }

    public void A0E(boolean z) {
        this.A02.A0H(Boolean.valueOf(z));
        this.A05.A1r(z);
    }

    public boolean A0F(int i) {
        if (!this.A05.A2L(i)) {
            return false;
        }
        C06270Wx.A03(this.A01, i);
        return true;
    }

    public boolean A0G(String str) {
        AnonymousClass33p r1 = this.A05;
        if (!TextUtils.equals(r1.A0X(), str)) {
            r1.A1S(str);
            C06260Ww r2 = this.A03;
            synchronized (r2.A0P) {
                r2.A00 = null;
            }
            Log.i(AnonymousClass0YV.A0B("gdrive-new-user-view-model/update-account-name new accountName is ", str, AnonymousClass001.A0o()));
            this.A00.A0H(str);
            return true;
        }
        Log.i(AnonymousClass0YV.A0B("gdrive-new-user-view-model/update-account-name account unchanged, token received for ", str, AnonymousClass001.A0o()));
        return false;
    }

    public GoogleDriveNewUserSetupViewModel(C06260Ww r5, C56612sH r6, AnonymousClass33p r7) {
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A02 = A012;
        AnonymousClass08M A013 = AnonymousClass08M.A01();
        this.A00 = A013;
        AnonymousClass08M A014 = AnonymousClass08M.A01();
        this.A01 = A014;
        this.A04 = r6;
        this.A03 = r5;
        this.A05 = r7;
        A012.A0H(Boolean.valueOf(r7.A27()));
        A013.A0H(r7.A0X());
        C06270Wx.A03(A014, r7.A05());
    }
}
