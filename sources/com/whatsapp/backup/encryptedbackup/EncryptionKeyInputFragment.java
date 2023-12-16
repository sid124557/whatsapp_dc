package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0w4;
import X.AnonymousClass0w8;
import X.AnonymousClass1VX;
import X.AnonymousClass5V0;
import X.AnonymousClass5X8;
import X.C06560Yg;
import X.C08240dc;
import X.C08310eF;
import X.C09920gy;
import X.C106755a7;
import X.C111095hX;
import X.C19340zH;
import X.C55682qk;
import X.C620633i;
import X.C69263Wi;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.deviceauth.BiometricAuthPlugin;
import com.whatsapp.util.Log;

public class EncryptionKeyInputFragment extends Hilt_EncryptionKeyInputFragment {
    public Button A00;
    public RelativeLayout A01;
    public C111095hX A02;
    public C55682qk A03;
    public C69263Wi A04;
    public AnonymousClass5X8 A05;
    public EncBackupViewModel A06;
    public EncryptionKeyFragment A07;
    public C620633i A08;
    public BiometricAuthPlugin A09;
    public AnonymousClass1VX A0A;

    public static /* synthetic */ void A02(EncryptionKeyInputFragment encryptionKeyInputFragment, int i) {
        if (i == -1 || i == 4) {
            encryptionKeyInputFragment.A06.A0S(6);
            encryptionKeyInputFragment.A06.A0Z(true);
        }
    }

    public void A0w(Bundle bundle, View view) {
        Resources A092;
        int i;
        Object[] objArr;
        super.A0p(bundle);
        EncBackupViewModel encBackupViewModel = (EncBackupViewModel) C08310eF.A0B(this);
        this.A06 = encBackupViewModel;
        int A0E = encBackupViewModel.A0E();
        View view2 = view;
        TextView A0A2 = C08310eF.A0A(view2, R.id.enc_backup_encryption_key_input_instructional);
        View A022 = C06560Yg.A02(view2, R.id.enc_backup_encryption_key_input_forgot);
        int i2 = 64;
        if (A0E == 6 || A0E == 4) {
            AnonymousClass1VX r10 = this.A0A;
            C69263Wi r15 = this.A04;
            this.A09 = new BiometricAuthPlugin(A0R(), this.A03, r15, this.A08, new AnonymousClass0w8(this, 0), r10, R.string.f11nameremoved, R.string.f11nameremoved);
            A022.setOnClickListener(new AnonymousClass0w4(this, 6));
            this.A06.A04.A0B(A0V(), new C09920gy(this, 13));
            if (A0E == 6) {
                A092 = C08310eF.A09(this);
                i = R.plurals.f9nameremoved;
                objArr = new Object[]{64};
                i2 = 64;
                A0A2.setText(A092.getQuantityString(i, i2, objArr));
                C08240dc r2 = new C08240dc(A0T());
                EncryptionKeyFragment encryptionKeyFragment = new EncryptionKeyFragment();
                this.A07 = encryptionKeyFragment;
                r2.A0A(encryptionKeyFragment, R.id.encryption_key_input_encryption_key_container);
                r2.A00(false);
                this.A00 = (Button) C06560Yg.A02(view2, R.id.encryption_key_input_next_button);
                this.A01 = (RelativeLayout) C06560Yg.A02(view2, R.id.enc_key_background);
                A1L(false);
                this.A06.A02.A0B(A0V(), new C09920gy(this, 14));
            }
            i2 = 64;
            A092 = C08310eF.A09(this);
            i = R.plurals.f9nameremoved;
        } else {
            if (A0E == 2) {
                A022.setOnClickListener(new AnonymousClass0w4(this, 7));
                A092 = C08310eF.A09(this);
                i = R.plurals.f9nameremoved;
            }
            C08240dc r22 = new C08240dc(A0T());
            EncryptionKeyFragment encryptionKeyFragment2 = new EncryptionKeyFragment();
            this.A07 = encryptionKeyFragment2;
            r22.A0A(encryptionKeyFragment2, R.id.encryption_key_input_encryption_key_container);
            r22.A00(false);
            this.A00 = (Button) C06560Yg.A02(view2, R.id.encryption_key_input_next_button);
            this.A01 = (RelativeLayout) C06560Yg.A02(view2, R.id.enc_key_background);
            A1L(false);
            this.A06.A02.A0B(A0V(), new C09920gy(this, 14));
        }
        objArr = new Object[]{64};
        A0A2.setText(A092.getQuantityString(i, i2, objArr));
        C08240dc r222 = new C08240dc(A0T());
        EncryptionKeyFragment encryptionKeyFragment22 = new EncryptionKeyFragment();
        this.A07 = encryptionKeyFragment22;
        r222.A0A(encryptionKeyFragment22, R.id.encryption_key_input_encryption_key_container);
        r222.A00(false);
        this.A00 = (Button) C06560Yg.A02(view2, R.id.encryption_key_input_next_button);
        this.A01 = (RelativeLayout) C06560Yg.A02(view2, R.id.enc_key_background);
        A1L(false);
        this.A06.A02.A0B(A0V(), new C09920gy(this, 14));
    }

    public void A1L(boolean z) {
        AnonymousClass0w4 r0;
        this.A00.setEnabled(z);
        Button button = this.A00;
        if (z) {
            r0 = new AnonymousClass0w4(this, 8);
        } else {
            r0 = null;
        }
        button.setOnClickListener(r0);
        RelativeLayout relativeLayout = this.A01;
        int i = R.drawable.enc_backup_enc_key_bg_disabled;
        if (z) {
            i = R.drawable.enc_backup_enc_key_bg;
        }
        relativeLayout.setBackgroundResource(i);
        this.A07.A1M(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        if (r4.length() != 64) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A04(com.whatsapp.backup.encryptedbackup.EncryptionKeyInputFragment r3, java.lang.String r4) {
        /*
            android.content.Context r0 = r3.A1D()
            if (r0 == 0) goto L_0x0015
            if (r4 == 0) goto L_0x0011
            int r2 = r4.length()
            r1 = 64
            r0 = 1
            if (r2 == r1) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            r3.A1L(r0)
        L_0x0015:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.EncryptionKeyInputFragment.A04(com.whatsapp.backup.encryptedbackup.EncryptionKeyInputFragment, java.lang.String):void");
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public final void A1J(int i) {
        if (A1D() == null) {
            return;
        }
        if (i == 2) {
            A1L(false);
        } else if (i == 5) {
            A1K(C08310eF.A09(this).getString(R.string.f11nameremoved));
            A1L(false);
            C106755a7.A03(this.A08);
        }
    }

    public final void A1K(String str) {
        C19340zH A002 = AnonymousClass5V0.A00(A0R());
        A002.A0g(str);
        A002.A0Y((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
        A002.create().show();
        C106755a7.A03(this.A08);
        Log.i(AnonymousClass000.A0V("encb/EncBackupMainActivity/error modal shown with message: ", str, AnonymousClass001.A0o()));
    }
}
