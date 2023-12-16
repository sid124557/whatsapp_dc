package X;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet;
import com.whatsapp.languageselector.LanguageSelectorBottomSheet;
import com.whatsapp.location.PlaceInfo;
import com.whatsapp.registration.EULA;
import com.whatsapp.settings.Settings;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

/* renamed from: X.69q  reason: invalid class name and case insensitive filesystem */
public class C1237569q implements AdapterView.OnItemClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C1237569q(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        PlaceInfo placeInfo;
        int i2 = i;
        switch (this.A02) {
            case 0:
                AccountSwitchingBottomSheet accountSwitchingBottomSheet = (AccountSwitchingBottomSheet) this.A00;
                List list = (List) this.A01;
                Log.i("AccountSwitchingBottomSheet/setupAccountList/switch account tapped");
                if (i == 0) {
                    Log.i("AccountSwitchingBottomSheet/setupAccountList/position == 0");
                    accountSwitchingBottomSheet.A1L();
                    return;
                }
                AnonymousClass5XC r2 = accountSwitchingBottomSheet.A09;
                if (r2 != null) {
                    r2.A00(accountSwitchingBottomSheet.A00, 6);
                    accountSwitchingBottomSheet.A1Z().A0A(C18290x4.A0F(view), ((C53892nq) ((AnonymousClass3Z6) list.get(i2)).first).A07, (String) null, (AnonymousClass4GP) null, accountSwitchingBottomSheet.A00, false, false);
                    return;
                }
                throw C18270x1.A0S("accountSwitchingLogger");
            case 1:
                LanguageSelectorBottomSheet languageSelectorBottomSheet = (LanguageSelectorBottomSheet) this.A00;
                AnonymousClass4OR r1 = (AnonymousClass4OR) this.A01;
                String str = ((C148187Hi) languageSelectorBottomSheet.A00.getAdapter().getItem(i2)).A01;
                r1.A02(i2);
                r1.notifyDataSetChanged();
                AnonymousClass65K r3 = languageSelectorBottomSheet.A05;
                if (r3 != null) {
                    C107115ai r32 = (C107115ai) r3;
                    if (r32.A02 != 0) {
                        Settings settings = (Settings) r32.A00;
                        settings.A00.A0S(str);
                        Map map = settings.A0m.A01;
                        if (map == null) {
                            throw C18270x1.A0S("allSettingsMap");
                        }
                        for (C1230366u Bmq : map.values()) {
                            Bmq.Bmq("");
                        }
                    } else {
                        ((EULA) ((AnonymousClass54E) r32.A00).A00).A0D.A0S(str);
                    }
                    ((DialogFragment) r32.A01).A1L();
                    return;
                }
                return;
            case 2:
                C108145cU r12 = (C108145cU) this.A00;
                Context context = (Context) this.A01;
                int headerViewsCount = i - r12.A0T.getHeaderViewsCount();
                if (!r12.A0o || headerViewsCount != -1) {
                    C109005dv r0 = r12.A0g;
                    if (r0 != null && headerViewsCount < r0.A0F.size()) {
                        placeInfo = (PlaceInfo) r12.A0g.A0F.get(headerViewsCount);
                    } else {
                        return;
                    }
                } else if (r12.A0p || !r12.A1N.A05(context)) {
                    placeInfo = r12.A1O;
                } else {
                    r12.A08();
                    return;
                }
                r12.A0M(placeInfo);
                return;
            default:
                EULA eula = (EULA) this.A00;
                eula.A0D.A0S(((C148187Hi) ((ListView) this.A01).getAdapter().getItem(i2)).A01);
                C18270x1.A03(eula.A09).putBoolean("is_ls_shown_during_reg", true).commit();
                AnonymousClass5QI r33 = eula.A0I;
                int A022 = C18280x3.A02(AnonymousClass0x2.A0F(r33.A02), "language_selector_clicked_count");
                C18270x1.A03(r33.A02).putInt("language_selector_clicked_count", A022 + 1).commit();
                eula.A0I.A00();
                if (C107385bE.A09()) {
                    eula.recreate();
                    return;
                }
                eula.finish();
                eula.startActivity(eula.getIntent());
                eula.overridePendingTransition(0, 0);
                return;
        }
    }
}
