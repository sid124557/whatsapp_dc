package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass001;
import X.AnonymousClass0w4;
import X.C06560Yg;
import X.C08240dc;
import X.C08310eF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.R;

public class EncryptionKeyInfoFragment extends Hilt_EncryptionKeyInfoFragment {
    public Button A00;
    public Button A01;
    public FrameLayout A02;
    public TextView A03;

    public static /* synthetic */ void A00(EncryptionKeyInfoFragment encryptionKeyInfoFragment) {
        encryptionKeyInfoFragment.A01.setVisibility(8);
        encryptionKeyInfoFragment.A00.setText(R.string.f11nameremoved);
        encryptionKeyInfoFragment.A00.setOnClickListener(new AnonymousClass0w4(encryptionKeyInfoFragment, 5));
        encryptionKeyInfoFragment.A02.setVisibility(0);
        encryptionKeyInfoFragment.A00.setBackgroundResource(R.drawable.enc_backup_enc_key_bg);
        encryptionKeyInfoFragment.A03.setText(R.string.f11nameremoved);
        encryptionKeyInfoFragment.A00.setOnCreateContextMenuListener(encryptionKeyInfoFragment);
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0w(Bundle bundle, View view) {
        super.A0w(bundle, view);
        C08240dc r2 = new C08240dc(A0T());
        r2.A0A(new EncryptionKeyFragment(), R.id.encryption_key_info_encryption_key_container);
        r2.A00(false);
        this.A00 = (RelativeLayout) C06560Yg.A02(view, R.id.enc_key_background);
        FrameLayout frameLayout = (FrameLayout) C06560Yg.A02(view, R.id.encryption_key_info_encryption_key_container);
        this.A02 = frameLayout;
        frameLayout.setVisibility(4);
        Button button = (Button) C06560Yg.A02(view, R.id.encryption_key_info_middle_button);
        this.A01 = button;
        button.setText(C08310eF.A09(this).getQuantityString(R.plurals.f9nameremoved, 64, new Object[]{64}));
        this.A01.setOnClickListener(new AnonymousClass0w4(this, 3));
        Button button2 = (Button) C06560Yg.A02(view, R.id.encryption_key_info_bottom_button);
        this.A00 = button2;
        button2.setText(C08310eF.A09(this).getQuantityString(R.plurals.f9nameremoved, 64, new Object[]{64}));
        this.A00.setOnClickListener(new AnonymousClass0w4(this, 4));
        this.A03 = C08310eF.A0A(view, R.id.encryption_key_info_info);
    }
}
