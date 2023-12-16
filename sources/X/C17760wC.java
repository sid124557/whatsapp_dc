package X;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.Preference;
import com.whatsapp.backup.encryptedbackup.EncBackupViewModel;
import com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.backup.google.RestoreTransferSelectorActivity;
import com.whatsapp.backup.google.SettingsGoogleDrive;

/* renamed from: X.0wC  reason: invalid class name and case insensitive filesystem */
public class C17760wC implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C17760wC(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C17760wC(obj, i));
    }

    public static void A01(C17760wC r4) {
        C09950h1 r1 = (C09950h1) r4.A00;
        AnonymousClass84O r42 = r1.A01;
        C835248t r3 = r1.A02;
        C152057Xj r2 = new C152057Xj();
        r2.A05(r42, 0);
        C153427bI r12 = r1.A00;
        r2.A05(r12, 1);
        C159377lj.A01(r12, r42, r2.A03(), r3);
    }

    public void onClick(View view) {
        AnonymousClass0Ki r0;
        Message message;
        Message obtain;
        C07910d1 r02;
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        switch (this.A01) {
            case 0:
                C06200Wq r3 = (C06200Wq) this.A00;
                if (((view == r3.A0G && (message = r3.A0B) != null) || ((view == r3.A0E && (message = r3.A09) != null) || (view == r3.A0F && (message = r3.A0A) != null))) && (obtain = Message.obtain(message)) != null) {
                    obtain.sendToTarget();
                }
                r3.A08.obtainMessage(1, r3.A0W).sendToTarget();
                return;
            case 1:
                SearchView searchView = (SearchView) this.A00;
                if (view == searchView.A0h) {
                    searchView.A09();
                    return;
                } else if (view == searchView.A0e) {
                    searchView.A08();
                    return;
                } else if (view == searchView.A0g) {
                    searchView.A0A();
                    return;
                } else if (view == searchView.A0i) {
                    SearchableInfo searchableInfo = searchView.A02;
                    if (searchableInfo != null) {
                        try {
                            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                                Intent intent = new Intent(searchView.A0V);
                                ComponentName searchActivity = searchableInfo.getSearchActivity();
                                if (searchActivity == null) {
                                    str4 = null;
                                } else {
                                    str4 = searchActivity.flattenToShortString();
                                }
                                intent.putExtra("calling_package", str4);
                                searchView.getContext().startActivity(intent);
                                return;
                            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                                Intent intent2 = searchView.A0U;
                                ComponentName searchActivity2 = searchableInfo.getSearchActivity();
                                Intent intent3 = new Intent("android.intent.action.SEARCH");
                                intent3.setComponent(searchActivity2);
                                PendingIntent activity = PendingIntent.getActivity(searchView.getContext(), 0, intent3, 1073741824);
                                Bundle A08 = AnonymousClass002.A08();
                                Bundle bundle = searchView.A05;
                                if (bundle != null) {
                                    A08.putParcelable("app_data", bundle);
                                }
                                Intent intent4 = new Intent(intent2);
                                Resources resources = searchView.getResources();
                                if (searchableInfo.getVoiceLanguageModeId() != 0) {
                                    str = resources.getString(searchableInfo.getVoiceLanguageModeId());
                                } else {
                                    str = "free_form";
                                }
                                String str5 = null;
                                if (searchableInfo.getVoicePromptTextId() != 0) {
                                    str2 = resources.getString(searchableInfo.getVoicePromptTextId());
                                } else {
                                    str2 = null;
                                }
                                if (searchableInfo.getVoiceLanguageId() != 0) {
                                    str3 = resources.getString(searchableInfo.getVoiceLanguageId());
                                } else {
                                    str3 = null;
                                }
                                if (searchableInfo.getVoiceMaxResults() != 0) {
                                    i = searchableInfo.getVoiceMaxResults();
                                } else {
                                    i = 1;
                                }
                                intent4.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
                                intent4.putExtra("android.speech.extra.PROMPT", str2);
                                intent4.putExtra("android.speech.extra.LANGUAGE", str3);
                                intent4.putExtra("android.speech.extra.MAX_RESULTS", i);
                                if (searchActivity2 != null) {
                                    str5 = searchActivity2.flattenToShortString();
                                }
                                intent4.putExtra("calling_package", str5);
                                intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
                                intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", A08);
                                searchView.getContext().startActivity(intent4);
                                return;
                            } else {
                                return;
                            }
                        } catch (ActivityNotFoundException unused) {
                            Log.w("SearchView", "Could not find voice search activity");
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (view == searchView.A0k) {
                    searchView.A07();
                    return;
                } else {
                    return;
                }
            case 2:
                AnonymousClass0b8 r03 = ((Toolbar) this.A00).A0Q;
                if (r03 != null && (r02 = r03.A01) != null) {
                    r02.collapseActionView();
                    return;
                }
                return;
            case 3:
                ((Preference) this.A00).A0H(view);
                return;
            case 4:
                r0 = ((AnonymousClass0Og) this.A00).A03;
                break;
            case 5:
                r0 = ((AnonymousClass0Oh) this.A00).A03;
                break;
            case 6:
                A01(this);
                return;
            case 7:
                ((EncBackupViewModel) this.A00).A0I();
                return;
            case 8:
                C06270Wx.A03(((EncBackupViewModel) this.A00).A07, 0);
                return;
            case 9:
                ((View) this.A00).setVisibility(8);
                return;
            case 10:
                ((AnonymousClass0E2) this.A00).A0l(view);
                return;
            case 11:
                ((GoogleDriveNewUserSetupActivity) this.A00).A0X();
                return;
            case 12:
                ((RestoreFromBackupActivity) this.A00).A0k();
                return;
            case 13:
                ((RestoreFromBackupActivity) this.A00).A0l();
                return;
            case 14:
                ((RestoreFromBackupActivity) this.A00).A0s();
                return;
            case 15:
                ((RestoreFromBackupActivity) this.A00).A0r();
                return;
            case 16:
                ((RestoreFromBackupActivity) this.A00).A7T();
                return;
            case 17:
                RestoreFromBackupActivity.A14((RestoreFromBackupActivity) this.A00);
                return;
            case 18:
                ((RestoreFromBackupActivity) this.A00).A0j();
                return;
            case 19:
                ((RestoreTransferSelectorActivity) this.A00).A76();
                return;
            case 20:
                ((RestoreTransferSelectorActivity) this.A00).A77();
                return;
            case 21:
                ((SettingsGoogleDrive) this.A00).A0c();
                return;
            case 22:
                ((SettingsGoogleDrive) this.A00).A0d();
                return;
            case 23:
                ((SettingsGoogleDrive) this.A00).A7B();
                return;
            case 24:
                ((SettingsGoogleDrive) this.A00).A0e();
                return;
            case 25:
                ((SettingsGoogleDrive) this.A00).A0f();
                return;
            case 26:
                ((SettingsGoogleDrive) this.A00).A0g();
                return;
            case 27:
                ((SettingsGoogleDrive) this.A00).A0l(view);
                return;
            case 28:
                SettingsGoogleDrive.A13((SettingsGoogleDrive) this.A00);
                return;
            case 29:
                ((SettingsGoogleDrive) this.A00).A7E();
                return;
            case 30:
                ((SettingsGoogleDrive) this.A00).A7H();
                return;
            case 31:
                ((SettingsGoogleDrive) this.A00).A7F();
                return;
            default:
                ((SettingsGoogleDrive) this.A00).A7O(0, (String) null, (String) null);
                return;
        }
        C09630gV r1 = r0.A00;
        AnonymousClass00P r04 = r1.A05;
        if (r04 != null) {
            r04.dismiss();
        }
        r1.A00 = 6;
    }
}
