package com.whatsapp.permissions;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass33p;
import X.AnonymousClass54G;
import X.AnonymousClass5X8;
import X.AnonymousClass64B;
import X.C06560Yg;
import X.C08310eF;
import X.C107635bd;
import X.C111095hX;
import X.C162457s7;
import X.C18260x0;
import X.C18280x3;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C33201sc;
import X.C56502s5;
import X.C620633i;
import X.C69263Wi;
import X.C989653x;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.Arrays;

public class RequestPermissionsBottomSheet extends Hilt_RequestPermissionsBottomSheet implements AnonymousClass64B {
    public C111095hX A00;
    public C69263Wi A01;
    public AnonymousClass5X8 A02;
    public C620633i A03;
    public AnonymousClass33p A04;
    public AnonymousClass1VX A05;
    public C56502s5 A06;

    public void A0w(Bundle bundle, View view) {
        View.OnClickListener r1;
        View view2 = view;
        super.A0w(bundle, view2);
        Bundle A0H = A0H();
        int i = A0H.getInt("message_id");
        String[] stringArray = A0H.getStringArray("permissions");
        boolean z = this instanceof NotificationPermissionBottomSheet;
        if (z) {
            C162457s7.A0J(view2, 0);
            TextView A0I = AnonymousClass0x2.A0I(view2, R.id.permission_message);
            Context context = view2.getContext();
            Object[] A0L = AnonymousClass002.A0L();
            A0L[0] = C18320x8.A0a(view2.getContext());
            AnonymousClass001.A0y(context, A0I, A0L, i);
        } else {
            TextView A0G = C18300x5.A0G(view2, R.id.permission_message);
            if (i != 0) {
                A0G.setText(i);
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("there is no message id for ");
                C18260x0.A1K(A0o, Arrays.toString(stringArray));
                A1K();
            }
        }
        int i2 = A0H.getInt("title_id");
        if (z) {
            C162457s7.A0J(view2, 0);
            TextView A0G2 = C18300x5.A0G(view2, R.id.permission_title);
            Context context2 = view2.getContext();
            Object[] A0L2 = AnonymousClass002.A0L();
            A0L2[0] = C18320x8.A0a(view2.getContext());
            AnonymousClass001.A0y(context2, A0G2, A0L2, i2);
        } else if (i2 != 0) {
            C18300x5.A0G(view2, R.id.permission_title).setText(i2);
        }
        int i3 = A0H.getInt("nth_details_id");
        if (i3 != 0) {
            C18280x3.A1E(C08310eF.A09(this).getString(i3), C18300x5.A0G(view2, R.id.nth_time_request));
        }
        C18310x6.A13(A0H, AnonymousClass0x9.A0E(view2, R.id.permission_image), "icon_id");
        C18310x6.A13(A0H, AnonymousClass0x9.A0E(view2, R.id.line1_image), "line1_icon_id");
        C18310x6.A13(A0H, AnonymousClass0x9.A0E(view2, R.id.line2_image), "line2_icon_id");
        C18310x6.A13(A0H, AnonymousClass0x9.A0E(view2, R.id.line3_image), "line3_icon_id");
        int i4 = A0H.getInt("line1_message_id");
        TextEmojiLabel A0K = AnonymousClass0x7.A0K(view2, R.id.line1_message);
        if (i4 != 0) {
            Context A0G3 = A0G();
            AnonymousClass1VX r12 = this.A05;
            C69263Wi r9 = this.A01;
            C107635bd.A0E(A0G3, this.A02.A00("https://www.whatsapp.com/security"), this.A00, r9, A0K, this.A03, r12, C08310eF.A09(this).getString(i4), "learn-more");
        }
        int i5 = A0H.getInt("line2_message_id");
        TextView A0G4 = C18300x5.A0G(view2, R.id.line2_message);
        if (i5 != 0) {
            A0G4.setText(i5);
        }
        int i6 = A0H.getInt("line3_message_id");
        if (z) {
            C162457s7.A0J(view2, 0);
            TextView A0I2 = AnonymousClass0x2.A0I(view2, R.id.line3_message);
            if (i6 != 0) {
                Context context3 = view2.getContext();
                Object[] A0L3 = AnonymousClass002.A0L();
                A0L3[0] = C18320x8.A0a(view2.getContext());
                AnonymousClass001.A0y(context3, A0I2, A0L3, i6);
                A0I2.setVisibility(0);
            }
        } else {
            TextView A0G5 = C18300x5.A0G(view2, R.id.line3_message);
            if (i6 != 0) {
                A0G5.setText(i6);
                A0G5.setVisibility(0);
            }
        }
        String[] stringArray2 = A0H.getStringArray("permissions");
        String string = A0H.getString("permission_requestor_screen_type");
        boolean z2 = A0H.getBoolean("is_first_time_request");
        boolean z3 = A0H.getBoolean("should_disable_cancel_on_outside_click");
        boolean z4 = A0H.getBoolean("should_hide_cancel_button_on_1st_time");
        View A022 = C06560Yg.A02(view2, R.id.cancel);
        A022.setOnClickListener(new AnonymousClass54G(4, string, this));
        if (z3) {
            A1P(false);
        }
        if (z2 && z4) {
            A022.setVisibility(8);
        }
        View A023 = C06560Yg.A02(view2, R.id.nth_time_request);
        TextView A0G6 = C18300x5.A0G(view2, R.id.submit);
        if (!z2) {
            A023.setVisibility(0);
            A0G6.setText(R.string.f11nameremoved);
            r1 = new C989653x(this, 17);
        } else {
            A023.setVisibility(8);
            r1 = new C33201sc(this, stringArray2, string, 1);
        }
        A0G6.setOnClickListener(r1);
        if (A1Y()) {
            C06560Yg.A02(view2, R.id.permission_request_dialog).setBackground((Drawable) null);
        }
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public int A1H() {
        return R.style.f12nameremoved;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C18300x5.A1A(this);
    }
}
