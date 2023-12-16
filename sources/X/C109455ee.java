package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment;
import com.whatsapp.R;
import com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import com.whatsapp.conversation.ChangeNumberNotificationDialogFragment;
import com.whatsapp.events.EventInfoFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.spamwarning.SpamWarningActivity;

/* renamed from: X.5ee  reason: invalid class name and case insensitive filesystem */
public class C109455ee implements View.OnClickListener {
    public Object A00;
    public String A01;
    public final int A02;

    public C109455ee(int i, String str, Object obj) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public final void onClick(View view) {
        String str;
        Uri parse;
        SpamWarningActivity spamWarningActivity;
        switch (this.A02) {
            case 0:
                DisplayExceptionDialogFactory$LoginFailedDialogFragment displayExceptionDialogFactory$LoginFailedDialogFragment = (DisplayExceptionDialogFactory$LoginFailedDialogFragment) this.A00;
                C18270x1.A0j(C18270x1.A03(displayExceptionDialogFactory$LoginFailedDialogFragment.A08), "account_switching_logged_out_phone_number", this.A01);
                C003203q A0R = displayExceptionDialogFactory$LoginFailedDialogFragment.A0R();
                displayExceptionDialogFactory$LoginFailedDialogFragment.A1V(A0R);
                C05680Um.A00(A0R);
                return;
            case 1:
                ((BlockReasonListFragment) this.A00).A1V(this.A01);
                return;
            case 2:
                String str2 = this.A01;
                C162457s7.A0J(str2, 1);
                ((C96394wI) this.A00).A01.invoke(str2);
                return;
            case 3:
                BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = (BusinessDirectoryContextualSearchViewModel) this.A00;
                String str3 = this.A01;
                int A0D = businessDirectoryContextualSearchViewModel.A0D(str3);
                businessDirectoryContextualSearchViewModel.A05 = null;
                businessDirectoryContextualSearchViewModel.A0N.A0A(C105085Tn.A00(businessDirectoryContextualSearchViewModel), false);
                businessDirectoryContextualSearchViewModel.A0X(str3, A0D);
                return;
            case 4:
                Activity activity = (Activity) this.A00;
                String str4 = this.A01;
                activity.finish();
                str = "android.intent.action.VIEW";
                parse = Uri.parse(str4);
                spamWarningActivity = activity;
                break;
            case 5:
                C08310eF r3 = (C08310eF) this.A00;
                r3.startActivityForResult(Intent.createChooser(C627736r.A0r(r3.A0J().getContext(), this.A01), C08310eF.A09(r3).getString(R.string.f11nameremoved)), 106);
                return;
            case 6:
                C92224mI r4 = (C92224mI) this.A00;
                String str5 = this.A01;
                boolean A0Y = r4.A05.A0Y();
                UserJid userJid = r4.A09;
                if (!A0Y) {
                    C626936e.A06(userJid);
                    UserJid userJid2 = r4.A02;
                    C626936e.A06(userJid2);
                    r4.A01.getActivity().Boo(ChangeNumberNotificationDialogFragment.A00(userJid, userJid2, str5));
                    return;
                } else if (!userJid.equals(r4.A02)) {
                    AnonymousClass3ZH A0A = r4.A06.A0A(r4.A02);
                    C627736r A1B = C86664Kz.A1B();
                    AnonymousClass67A r2 = r4.A01;
                    r2.getActivity().startActivity(A1B.A1L(r2.getActivity(), A0A));
                    return;
                } else {
                    return;
                }
            case 7:
                EventInfoFragment eventInfoFragment = (EventInfoFragment) this.A00;
                String str6 = this.A01;
                C85244Fm r32 = eventInfoFragment.A03;
                if (r32 != null) {
                    Context A0G = eventInfoFragment.A0G();
                    Uri parse2 = Uri.parse(str6);
                    C162457s7.A0D(parse2);
                    r32.BkW(A0G, parse2, (C624134x) null);
                    return;
                }
                throw C18270x1.A0S("linkLauncher");
            case 8:
                C89644eZ r42 = (C89644eZ) this.A00;
                r42.A00.A0A(r42, C627736r.A12(r42, this.A01, (String) null, 6));
                return;
            case 9:
                C89654ea r33 = (C89654ea) this.A00;
                String str7 = this.A01;
                Uri parse3 = Uri.parse(str7);
                if (parse3.getScheme() == null) {
                    parse3 = Uri.parse(AnonymousClass000.A0V("http://", str7, AnonymousClass001.A0o()));
                }
                try {
                    r33.startActivity(C18310x6.A0D(parse3));
                    return;
                } catch (ActivityNotFoundException unused) {
                    C86654Ky.A1J(r33.A05);
                    return;
                }
            case 10:
                String str8 = this.A01;
                C162457s7.A0J(str8, 0);
                Intent A08 = C18300x5.A08(str8);
                Activity activity2 = ((AnonymousClass4LB) this.A00).A01;
                activity2.startActivity(A08);
                activity2.finish();
                return;
            default:
                SpamWarningActivity spamWarningActivity2 = (SpamWarningActivity) this.A00;
                String str9 = this.A01;
                str = "android.intent.action.VIEW";
                if (str9 != null && !str9.isEmpty()) {
                    parse = Uri.parse(str9);
                    spamWarningActivity = spamWarningActivity2;
                    break;
                } else {
                    parse = spamWarningActivity2.A03.A02((Pair) null, "general", (String) null, (String) null);
                    spamWarningActivity = spamWarningActivity2;
                    break;
                }
        }
        spamWarningActivity.startActivity(new Intent(str, parse));
    }
}
