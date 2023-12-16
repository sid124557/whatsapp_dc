package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.5Zc  reason: invalid class name and case insensitive filesystem */
public final class C106465Zc {
    public static final View A00(Activity activity, ViewGroup viewGroup, C57012sv r16, C111095hX r17, AnonymousClass4GP r18) {
        C57012sv r9 = r16;
        C111095hX r11 = r17;
        C18260x0.A0Z(viewGroup, r9, r11, 1);
        Activity activity2 = activity;
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        boolean z = C1001059l.A04;
        int i = R.drawable.ic_business_directory;
        if (z) {
            i = R.drawable.ic_business_directory_filled_wds;
        }
        int A02 = AnonymousClass5Yj.A02(viewGroup.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
        C109565ep r8 = new C109565ep(r9, activity2, r11, r18, 1);
        View A0R = AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
        AnonymousClass5V7.A01(A0R, i, A02, R.drawable.green_circle, R.string.f11nameremoved);
        A0R.setOnClickListener(r8);
        C107335b8.A0E(C86604Kt.A0J(A0R, R.id.contactpicker_row_photo), AnonymousClass5Yj.A03(viewGroup.getContext(), viewGroup.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        return A0R;
    }

    public static final View A02(Activity activity, ViewGroup viewGroup, C69263Wi r15, AnonymousClass1VX r16, C105055Tk r17, AnonymousClass4GP r18, int i, int i2) {
        C69263Wi r8 = r15;
        AnonymousClass1VX r9 = r16;
        C18260x0.A0b(viewGroup, r9, r15, 1);
        C105055Tk r10 = r17;
        C162457s7.A0J(r10, 6);
        Activity activity2 = activity;
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        boolean z = C1001059l.A04;
        int i3 = R.drawable.ic_action_add_person;
        if (z) {
            i3 = R.drawable.ic_action_add_person_filled_wds;
        }
        int A06 = AnonymousClass5Yj.A06(viewGroup);
        C109605et r6 = new C109605et(activity2, r8, r9, r10, r18, i, i2);
        View A0R = AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
        AnonymousClass5V7.A01(A0R, i3, A06, R.drawable.green_circle, R.string.f11nameremoved);
        A0R.setOnClickListener(r6);
        return A0R;
    }

    public static final void A03(Context context, View view, C116985rC r6, C620733j r7, AnonymousClass4GP r8) {
        C18260x0.A0S(r7, r6);
        C107555bV.A05(view.findViewById(R.id.buttons), r7, 0, context.getResources().getDimensionPixelOffset(R.dimen.f6nameremoved));
        ImageView A0F = AnonymousClass0x9.A0F(view, R.id.contactpicker_button_two);
        A0F.setVisibility(0);
        A0F.setImageResource(R.drawable.ic_scan_qr);
        C109725f5.A00(A0F, context, r6, r8, 30);
        C18300x5.A13(context, A0F, R.string.f11nameremoved);
        AnonymousClass0x2.A0p(context, A0F, R.color.f5nameremoved);
    }

    public static final View A01(Activity activity, ViewGroup viewGroup, C69263Wi r9, C29441ip r10) {
        C18260x0.A0V(viewGroup, r9, r10);
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        int A06 = AnonymousClass5Yj.A06(viewGroup);
        C109725f5 r4 = new C109725f5((Object) r10, (Object) activity, (Object) r9, 31);
        View A0R = AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
        AnonymousClass5V7.A01(A0R, R.drawable.vec_ic_call_link, A06, R.drawable.green_circle, R.string.f11nameremoved);
        A0R.setOnClickListener(r4);
        return A0R;
    }
}
