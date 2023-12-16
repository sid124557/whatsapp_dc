package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass001;
import X.AnonymousClass00M;
import X.AnonymousClass03s;
import X.AnonymousClass0DB;
import X.AnonymousClass0RP;
import X.AnonymousClass0XL;
import X.AnonymousClass0w4;
import X.AnonymousClass34K;
import X.C005205m;
import X.C06270Wx;
import X.C08240dc;
import X.C08270df;
import X.C08310eF;
import X.C131666dx;
import X.C15060qi;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.base.WaFragment;
import com.whatsapp.util.Log;

public class EncBackupMainActivity extends AnonymousClass0DB {
    public C08270df A00;
    public WaImageButton A01;
    public EncBackupViewModel A02;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r1 != 6) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r3.A02.A0b() == false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A77(int r4) {
        /*
            r3 = this;
            r0 = 2
            if (r4 != r0) goto L_0x004c
            r2 = 2131888997(0x7f120b65, float:1.9412645E38)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r3.A02
            int r0 = r0.A0E()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C626936e.A06(r0)
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x0048
            r0 = 8
            if (r1 == r0) goto L_0x0044
            r0 = 10
            if (r1 == r0) goto L_0x0044
            r0 = 4
            if (r1 == r0) goto L_0x0030
            r0 = 5
            if (r1 == r0) goto L_0x003c
            r0 = 6
            if (r1 == r0) goto L_0x003c
        L_0x002b:
            r0 = 0
            r3.BpA(r0, r2)
            return
        L_0x0030:
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r3.A02
            boolean r0 = r0.A0b()
            if (r0 == 0) goto L_0x002b
            r2 = 2131888933(0x7f120b25, float:1.9412515E38)
            goto L_0x002b
        L_0x003c:
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r3.A02
            boolean r0 = r0.A0b()
            if (r0 == 0) goto L_0x002b
        L_0x0044:
            r2 = 2131888981(0x7f120b55, float:1.9412613E38)
            goto L_0x002b
        L_0x0048:
            r2 = 2131888950(0x7f120b36, float:1.941255E38)
            goto L_0x002b
        L_0x004c:
            r3.BjL()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.EncBackupMainActivity.A77(int):void");
    }

    public final void A74() {
        C08270df r3 = this.A00;
        if (r3 == null) {
            return;
        }
        if (r3.A07() <= 1) {
            setResult(0, new Intent());
            finish();
            return;
        }
        String str = ((C08240dc) ((C15060qi) r3.A0E.get(r3.A07() - 2))).A0A;
        if (str != null) {
            try {
                int parseInt = Integer.parseInt(str);
                if (this.A02.A0b()) {
                    C08270df r2 = this.A00;
                    if (r2.A07() > 2 || parseInt == 202 || parseInt == 203) {
                        String str2 = ((C08240dc) ((C15060qi) r2.A0E.get(r2.A07() - 3))).A0A;
                        if (str2 != null) {
                            parseInt = Integer.parseInt(str2);
                        }
                    }
                }
                C06270Wx.A03(this.A02.A03, parseInt);
            } catch (NumberFormatException unused) {
                Log.e("encb/EncBackupMainActivity/unable to set fragment request code to proper value after back navigation");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0075, code lost:
        r5.A02.A0R(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r5.A0D.A0X(4870) == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A76(int r6) {
        /*
            r5 = this;
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r5.A02
            r2 = 1
            X.08M r0 = r0.A04
            X.C06270Wx.A03(r0, r2)
            X.1VX r1 = r5.A0D
            r0 = 5113(0x13f9, float:7.165E-42)
            boolean r0 = r1.A0X(r0)
            r3 = 0
            if (r0 == 0) goto L_0x001e
            X.1VX r1 = r5.A0D
            r0 = 4870(0x1306, float:6.824E-42)
            boolean r0 = r1.A0X(r0)
            r4 = 1
            if (r0 != 0) goto L_0x001f
        L_0x001e:
            r4 = 0
        L_0x001f:
            X.0df r0 = r5.A00
            java.lang.String r1 = java.lang.String.valueOf(r6)
            X.0eF r0 = r0.A0D(r1)
            if (r0 != 0) goto L_0x00b3
            r0 = 200(0xc8, float:2.8E-43)
            if (r6 == r0) goto L_0x007b
            r0 = 500(0x1f4, float:7.0E-43)
            if (r6 == r0) goto L_0x0119
            r0 = 502(0x1f6, float:7.03E-43)
            if (r6 == r0) goto L_0x00fd
            r0 = 202(0xca, float:2.83E-43)
            if (r6 == r0) goto L_0x00ee
            r0 = 203(0xcb, float:2.84E-43)
            if (r6 == r0) goto L_0x00e8
            switch(r6) {
                case 102: goto L_0x00da;
                case 103: goto L_0x00d4;
                case 104: goto L_0x00cb;
                default: goto L_0x0042;
            }
        L_0x0042:
            r1 = 3
            switch(r6) {
                case 300: goto L_0x0065;
                case 301: goto L_0x005c;
                case 302: goto L_0x00c5;
                default: goto L_0x0046;
            }
        L_0x0046:
            switch(r6) {
                case 400: goto L_0x00f4;
                case 401: goto L_0x00bf;
                case 402: goto L_0x0109;
                default: goto L_0x0049;
            }
        L_0x0049:
            com.whatsapp.backup.encryptedbackup.EnableInfoFragment r0 = new com.whatsapp.backup.encryptedbackup.EnableInfoFragment
            r0.<init>()
            r5.A79(r0, r6, r2)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r5.A02
            r0.A0R(r2)
            if (r4 == 0) goto L_0x005b
        L_0x0058:
            r5.A75()
        L_0x005b:
            return
        L_0x005c:
            com.whatsapp.backup.encryptedbackup.EncryptionKeyInfoFragment r0 = new com.whatsapp.backup.encryptedbackup.EncryptionKeyInfoFragment
            r0.<init>()
            r5.A79(r0, r6, r2)
            goto L_0x0075
        L_0x0065:
            com.whatsapp.backup.encryptedbackup.CreatePasswordFragment r0 = new com.whatsapp.backup.encryptedbackup.CreatePasswordFragment
            r0.<init>()
            r5.A79(r0, r6, r2)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r5.A02
            int r0 = r0.A0E()
            if (r0 != r2) goto L_0x005b
        L_0x0075:
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r5.A02
            r0.A0R(r1)
            return
        L_0x007b:
            com.whatsapp.backup.encryptedbackup.EnableEducationFragment r0 = new com.whatsapp.backup.encryptedbackup.EnableEducationFragment
            r0.<init>()
            r5.A79(r0, r6, r2)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r5.A02
            r0 = 2
            r1.A0R(r0)
            if (r4 == 0) goto L_0x005b
            r0 = 2131430250(0x7f0b0b6a, float:1.8482196E38)
            android.view.View r2 = X.C005205m.A00(r5, r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131165412(0x7f0700e4, float:1.794504E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.setPadding(r0, r3, r0, r0)
            r0 = 2131434339(0x7f0b1b63, float:1.849049E38)
            X.AnonymousClass00M.A03(r5, r0, r3)
            r0 = 2131429804(0x7f0b09ac, float:1.8481291E38)
            android.view.View r1 = X.C005205m.A00(r5, r0)
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x00b3:
            X.0df r0 = r5.A00
            r0.A0m(r1, r3)
            if (r4 == 0) goto L_0x005b
            r0 = 100
            if (r6 != r0) goto L_0x005b
            goto L_0x0058
        L_0x00bf:
            com.whatsapp.backup.encryptedbackup.ConfirmEncryptionKeyFragment r0 = new com.whatsapp.backup.encryptedbackup.ConfirmEncryptionKeyFragment
            r0.<init>()
            goto L_0x00f9
        L_0x00c5:
            com.whatsapp.backup.encryptedbackup.ConfirmDisableFragment r0 = new com.whatsapp.backup.encryptedbackup.ConfirmDisableFragment
            r0.<init>()
            goto L_0x00f9
        L_0x00cb:
            com.whatsapp.backup.encryptedbackup.ForcedRegLandingFragment r0 = new com.whatsapp.backup.encryptedbackup.ForcedRegLandingFragment
            r0.<init>()
            r5.A79(r0, r6, r3)
            return
        L_0x00d4:
            com.whatsapp.backup.encryptedbackup.RestorePasswordInputFragment r0 = new com.whatsapp.backup.encryptedbackup.RestorePasswordInputFragment
            r0.<init>()
            goto L_0x00f9
        L_0x00da:
            com.whatsapp.backup.encryptedbackup.EnabledLandingFragment r0 = new com.whatsapp.backup.encryptedbackup.EnabledLandingFragment
            r0.<init>()
            r5.A79(r0, r6, r2)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r5.A02
            r0.A0S(r2)
            return
        L_0x00e8:
            com.whatsapp.backup.encryptedbackup.EncryptionKeyInputFragment r0 = new com.whatsapp.backup.encryptedbackup.EncryptionKeyInputFragment
            r0.<init>()
            goto L_0x00f9
        L_0x00ee:
            com.whatsapp.backup.encryptedbackup.VerifyPasswordFragment r0 = new com.whatsapp.backup.encryptedbackup.VerifyPasswordFragment
            r0.<init>()
            goto L_0x00f9
        L_0x00f4:
            com.whatsapp.backup.encryptedbackup.ConfirmPasswordFragment r0 = new com.whatsapp.backup.encryptedbackup.ConfirmPasswordFragment
            r0.<init>()
        L_0x00f9:
            r5.A79(r0, r6, r2)
            return
        L_0x00fd:
            com.whatsapp.backup.encryptedbackup.ChangePasswordDoneFragment r0 = new com.whatsapp.backup.encryptedbackup.ChangePasswordDoneFragment
            r0.<init>()
            r5.A78(r0, r6)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r5.A02
            r0 = 7
            goto L_0x0115
        L_0x0109:
            com.whatsapp.backup.encryptedbackup.DisableDoneFragment r0 = new com.whatsapp.backup.encryptedbackup.DisableDoneFragment
            r0.<init>()
            r5.A78(r0, r6)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r5.A02
            r0 = 8
        L_0x0115:
            r1.A0S(r0)
            return
        L_0x0119:
            com.whatsapp.backup.encryptedbackup.EnableDoneFragment r0 = new com.whatsapp.backup.encryptedbackup.EnableDoneFragment
            r0.<init>()
            r5.A79(r0, r6, r2)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r5.A02
            r0 = 4
            r1.A0R(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.EncBackupMainActivity.A76(int):void");
    }

    public final void A78(WaFragment waFragment, int i) {
        C08270df r0 = this.A00;
        if (r0 != null) {
            int A07 = r0.A07();
            for (int i2 = 0; i2 < A07; i2++) {
                this.A00.A0M();
            }
        }
        A79(waFragment, i, false);
    }

    public final void A7A(boolean z) {
        AnonymousClass0w4 r0;
        this.A01.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
        WaImageButton waImageButton = this.A01;
        if (z) {
            r0 = new AnonymousClass0w4(this, 2);
        } else {
            r0 = null;
        }
        waImageButton.setOnClickListener(r0);
        this.A05.A01(new AnonymousClass03s(this, z), this);
    }

    public final void A75() {
        C005205m.A00(this, R.id.toolbar_layout).setVisibility(8);
        Toolbar toolbar = (Toolbar) C005205m.A00(this, R.id.enc_toolbar);
        toolbar.setTitle((int) R.string.f11nameremoved);
        toolbar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(AnonymousClass34K.A00(this))));
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().A0N(true);
        }
        toolbar.setVisibility(0);
        C005205m.A00(this, R.id.fragment_container).setPadding(0, 0, 0, 0);
    }

    public final void A79(WaFragment waFragment, int i, boolean z) {
        A7A(z);
        String valueOf = String.valueOf(i);
        C08310eF A0D = this.A00.A0D(valueOf);
        if (this.A00 == null) {
            return;
        }
        if (A0D == null || A0D.A19()) {
            C08240dc r1 = new C08240dc(this.A00);
            r1.A0E(waFragment, valueOf, R.id.fragment_container);
            r1.A0I(valueOf);
            r1.A00(true);
        }
    }

    public void onContextMenuClosed(Menu menu) {
        super.onContextMenuClosed(menu);
        Object A07 = this.A02.A03.A07();
        if (A07 != null) {
            C08310eF A0D = this.A00.A0D(A07.toString());
            if (A0D instanceof EncryptionKeyDisplayFragment) {
                ((EncryptionKeyDisplayFragment) A0D).A1I();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        WaImageButton waImageButton = (WaImageButton) C005205m.A00(this, R.id.enc_backup_toolbar_button);
        this.A01 = waImageButton;
        waImageButton.setImageDrawable(new C131666dx(AnonymousClass0RP.A00(this, R.drawable.ic_back), this.A00));
        this.A00 = AnonymousClass00M.A01(this);
        EncBackupViewModel encBackupViewModel = (EncBackupViewModel) new AnonymousClass0XL(this).A01(EncBackupViewModel.class);
        this.A02 = encBackupViewModel;
        C06270Wx.A02(this, encBackupViewModel.A03, 10);
        C06270Wx.A02(this, this.A02.A04, 11);
        C06270Wx.A02(this, this.A02.A07, 12);
        this.A02.A0X(getIntent().getExtras());
    }
}
