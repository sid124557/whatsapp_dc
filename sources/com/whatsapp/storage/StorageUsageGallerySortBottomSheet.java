package com.whatsapp.storage;

import X.AnonymousClass002;
import X.AnonymousClass4Qw;
import X.AnonymousClass64B;
import X.C107055ac;
import X.C109695f2;
import X.C147407Ee;
import X.C626936e;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.whatsapp.R;

public class StorageUsageGallerySortBottomSheet extends Hilt_StorageUsageGallerySortBottomSheet implements AnonymousClass64B {
    public C147407Ee A00;
    public AnonymousClass4Qw A01;
    public AnonymousClass4Qw A02;
    public AnonymousClass4Qw A03;
    public AnonymousClass4Qw A04;

    public static StorageUsageGallerySortBottomSheet A00(int i, boolean z) {
        StorageUsageGallerySortBottomSheet storageUsageGallerySortBottomSheet = new StorageUsageGallerySortBottomSheet();
        Bundle A08 = AnonymousClass002.A08();
        A08.putInt("storage_usage_gallery_sort_bottom_sheet_selected_sort_row", i);
        A08.putBoolean("storage_usage_gallery_sort_bottom_sheet_show_forwarding_score", z);
        storageUsageGallerySortBottomSheet.A0u(A08);
        return storageUsageGallerySortBottomSheet;
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass4Qw r0;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        AnonymousClass4Qw r1 = new AnonymousClass4Qw(A1D());
        this.A02 = r1;
        r1.setText(R.string.f11nameremoved);
        C109695f2.A00(this.A02, this, 0, 18);
        viewGroup2.addView(this.A02);
        AnonymousClass4Qw r12 = new AnonymousClass4Qw(A1D());
        this.A03 = r12;
        r12.setText(R.string.f11nameremoved);
        C109695f2.A00(this.A03, this, 1, 18);
        viewGroup2.addView(this.A03);
        AnonymousClass4Qw r13 = new AnonymousClass4Qw(A1D());
        this.A04 = r13;
        r13.setText(R.string.f11nameremoved);
        C109695f2.A00(this.A04, this, 2, 18);
        viewGroup2.addView(this.A04);
        Bundle A0H = A0H();
        if (A0H.getBoolean("storage_usage_gallery_sort_bottom_sheet_show_forwarding_score", false)) {
            AnonymousClass4Qw r14 = new AnonymousClass4Qw(A1D());
            this.A01 = r14;
            r14.setText(R.string.f11nameremoved);
            C109695f2.A00(this.A01, this, 3, 18);
            viewGroup2.addView(this.A01);
        }
        int i = A0H.getInt("storage_usage_gallery_sort_bottom_sheet_selected_sort_row", 0);
        this.A02.setChecked(false);
        this.A03.setChecked(false);
        this.A04.setChecked(false);
        if (i == 0) {
            r0 = this.A02;
        } else if (i == 1) {
            r0 = this.A03;
        } else if (i != 2) {
            if (i == 3) {
                r0 = this.A01;
                C626936e.A04(r0);
            }
            Dialog dialog = this.A03;
            C626936e.A06(dialog);
            Window window = dialog.getWindow();
            C626936e.A06(window);
            window.getDecorView().setSystemUiVisibility(1280);
            window.setStatusBarColor(0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 48;
            window.setAttributes(attributes);
            dialog.setOnShowListener(new C107055ac(this, 2));
            return viewGroup2;
        } else {
            r0 = this.A04;
        }
        r0.setChecked(true);
        Dialog dialog2 = this.A03;
        C626936e.A06(dialog2);
        Window window2 = dialog2.getWindow();
        C626936e.A06(window2);
        window2.getDecorView().setSystemUiVisibility(1280);
        window2.setStatusBarColor(0);
        WindowManager.LayoutParams attributes2 = window2.getAttributes();
        attributes2.width = -1;
        attributes2.gravity = 48;
        window2.setAttributes(attributes2);
        dialog2.setOnShowListener(new C107055ac(this, 2));
        return viewGroup2;
    }

    public void A0c() {
        super.A0c();
        this.A00 = null;
        this.A02 = null;
        this.A03 = null;
        this.A04 = null;
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        A1M(0, R.style.f12nameremoved);
    }
}
