package com.whatsapp.ephemeral;

import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass1ZH;
import X.AnonymousClass30N;
import X.AnonymousClass33p;
import X.AnonymousClass4FV;
import X.AnonymousClass64B;
import X.C06560Yg;
import X.C08270df;
import X.C111095hX;
import X.C18290x4;
import X.C18300x5;
import X.C41532Kp;
import X.C627336j;
import X.C633839a;
import X.C66433Lk;
import X.C95814uZ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

public class ViewOnceSecondaryNuxBottomSheet extends Hilt_ViewOnceSecondaryNuxBottomSheet implements AnonymousClass64B {
    public int A00 = -1;
    public C111095hX A01;
    public AnonymousClass33p A02;
    public AnonymousClass4FV A03;
    public AnonymousClass30N A04;
    public C66433Lk A05;
    public String A06 = "-1";
    public boolean A07;

    public final void A1a(boolean z) {
        AnonymousClass1ZH r3 = new AnonymousClass1ZH();
        String str = this.A06;
        if (!str.equals("-1")) {
            r3.A00 = Boolean.valueOf(this.A07);
            r3.A03 = this.A04.A04(str);
            int i = 2;
            if (this.A00 == 42) {
                i = 1;
            }
            r3.A01 = Integer.valueOf(i);
            int i2 = 3;
            if (z) {
                i2 = 8;
            }
            r3.A02 = Integer.valueOf(i2);
            this.A03.BhD(r3);
        }
    }

    public static void A00(C08270df r4, C41532Kp r5) {
        Bundle A08 = AnonymousClass002.A08();
        C95814uZ r2 = r5.A01;
        A08.putString("CHAT_JID", r2.getRawString());
        A08.putInt("MESSAGE_TYPE", r5.A00);
        A08.putBoolean("IN_GROUP", C627336j.A0K(r2));
        ViewOnceSecondaryNuxBottomSheet viewOnceSecondaryNuxBottomSheet = new ViewOnceSecondaryNuxBottomSheet();
        viewOnceSecondaryNuxBottomSheet.A0u(A08);
        viewOnceSecondaryNuxBottomSheet.A1O(r4, "view_once_nux_secondary");
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Bundle A0H = A0H();
        this.A07 = A0H.getBoolean("IN_GROUP", false);
        this.A06 = A0H.getString("CHAT_JID", "-1");
        this.A00 = A0H.getInt("MESSAGE_TYPE", -1);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        super.A0w(bundle, view);
        View A022 = C06560Yg.A02(view, R.id.vo_sp_bottom_sheet_ok_button);
        View A023 = C06560Yg.A02(view, R.id.vo_sp_close_button);
        View A024 = C06560Yg.A02(view, R.id.vo_sp_bottom_sheet_learn_more_button);
        ImageView A0E = AnonymousClass0x9.A0E(view, R.id.vo_sp_image);
        TextView A0G = C18300x5.A0G(view, R.id.vo_sp_title);
        TextView A0G2 = C18300x5.A0G(view, R.id.vo_sp_summary);
        C18290x4.A1A(A0G(), A0E, R.drawable.vo_camera_nux);
        A0G2.setText(R.string.f11nameremoved);
        A0G.setText(R.string.f11nameremoved);
        C633839a.A00(A022, this, 23);
        C633839a.A00(A023, this, 24);
        C633839a.A00(A024, this, 25);
        A1a(false);
    }
}
