package X;

import com.whatsapp.R;
import com.whatsapp.settings.SettingsPrivacy;
import java.util.Map;

/* renamed from: X.1tA  reason: invalid class name and case insensitive filesystem */
public class C33461tA extends AnonymousClass5ZM {
    public final /* synthetic */ C55822qy A00;
    public final /* synthetic */ SettingsPrivacy A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Map A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33461tA(C15910sA r2, C55822qy r3, SettingsPrivacy settingsPrivacy, String str, Map map) {
        super(r2, true);
        this.A01 = settingsPrivacy;
        this.A00 = r3;
        this.A03 = map;
        this.A02 = str;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return Integer.valueOf(this.A00.A03().size());
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        String A0L;
        Number number = (Number) obj;
        int intValue = number.intValue();
        SettingsPrivacy settingsPrivacy = this.A01;
        if (intValue == 0) {
            A0L = settingsPrivacy.getString(R.string.f11nameremoved);
        } else {
            A0L = settingsPrivacy.A00.A0L(AnonymousClass000.A1b(number), R.plurals.f9nameremoved, (long) intValue);
        }
        Map map = this.A03;
        String str = this.A02;
        map.put(str, A0L);
        settingsPrivacy.A7E(str, A0L);
    }
}
