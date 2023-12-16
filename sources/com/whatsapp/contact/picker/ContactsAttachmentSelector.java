package com.whatsapp.contact.picker;

import X.AnonymousClass4L0;
import X.AnonymousClass4Ts;
import X.AnonymousClass5XO;
import X.AnonymousClass6C6;
import X.C06560Yg;
import X.C103315Mk;
import X.C106175Xx;
import X.C1230967c;
import X.C154437dA;
import X.C54292oU;
import X.C91914lZ;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;

public class ContactsAttachmentSelector extends C91914lZ {
    public BottomSheetBehavior A00;
    public C106175Xx A01;
    public AnonymousClass4Ts A02;
    public C54292oU A03;
    public C103315Mk A04;
    public AnonymousClass5XO A05;
    public boolean A06;

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 8) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            setResult(-1, intent);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A06 = C154437dA.A00(this.A0D);
        AnonymousClass4Ts r0 = (AnonymousClass4Ts) AnonymousClass4L0.A0F(new C1230967c(this, 0), this).A01(AnonymousClass4Ts.class);
        this.A02 = r0;
        AnonymousClass6C6.A01(this, r0.A03, 164);
        AnonymousClass6C6.A01(this, this.A02.A00, 165);
        if (this.A06) {
            View A022 = C06560Yg.A02(this.A00, R.id.contact_picker_activity);
            BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
            this.A00 = bottomSheetBehavior;
            this.A05.A02(A022, bottomSheetBehavior, this, this.A0B);
            AnonymousClass5XO.A00(this, getSupportActionBar());
        }
    }

    public void onStart() {
        super.onStart();
        if (this.A06) {
            this.A05.A03(this.A00, this);
        }
    }
}
