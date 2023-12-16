package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import com.whatsapp.settings.SettingsDataUsageActivity;
import com.whatsapp.settings.SettingsNotifications;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.4HS  reason: invalid class name */
public class AnonymousClass4HS extends AnonymousClass5ZM {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4HS(C15910sA r2, SettingsDataUsageActivity settingsDataUsageActivity) {
        super(r2, true);
        this.A01 = 1;
        this.A00 = settingsDataUsageActivity;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Cursor A09;
        C69833Yo Axl;
        switch (this.A01) {
            case 0:
                C34431v9 r0 = ((C56962sq) this.A00).A0C;
                HashSet A0K = AnonymousClass002.A0K();
                AnonymousClass4GK A03 = C18630y0.A03(r0);
                try {
                    A09 = AnonymousClass361.A09(A03, "SELECT jid FROM wa_block_list", "CONTACT_BLOCK_LIST");
                    int A012 = AnonymousClass0x9.A01(A09);
                    while (A09.moveToNext()) {
                        AnonymousClass32Y.A0C(UserJid.Companion, A09.getString(A012), A0K);
                    }
                    A09.close();
                    A03.close();
                    return A0K;
                } catch (Throwable th) {
                    th = th;
                    A03.close();
                    throw th;
                }
                break;
            case 1:
                Log.i("settings-data-usage-activity/load storage data/load cache in background");
                return ((SettingsDataUsageActivity) this.A00).A0Y.A00().A04;
            default:
                AnonymousClass1R1 r3 = ((SettingsNotifications) this.A00).A0c;
                ContentValues A07 = AnonymousClass0x9.A07(8);
                Boolean bool = Boolean.FALSE;
                A07.put("use_custom_notifications", bool);
                A07.put("message_tone", (String) null);
                A07.put("message_vibrate", (String) null);
                A07.put("message_popup", (String) null);
                A07.put("message_light", (String) null);
                A07.put("call_tone", (String) null);
                A07.put("call_vibrate", (String) null);
                A07.put("low_pri_notifications", bool);
                C85284Fq A06 = C18630y0.A06(r3);
                try {
                    Axl = A06.Axl();
                    C56862sg r7 = ((AnonymousClass3H0) A06).A03;
                    r7.A05(A07, "settings", (String) null, "resetNotificationSettings/UPDATE_CHAT_SETTINGS", (String[]) null);
                    String[] A1Y = AnonymousClass0x9.A1Y();
                    C18260x0.A1Y(A1Y, System.currentTimeMillis());
                    int A072 = r7.A07("settings", "(mute_end < ? or mute_end is NULL) and (status_muted is NULL or status_muted = 0) and (media_visibility = 0)", "resetNotificationSettings/DELETE_CHAT_SETTINGS", A1Y);
                    Axl.A00();
                    C18260x0.A0y("chat-settings-store/deleted-count", AnonymousClass001.A0o(), A072);
                    Axl.close();
                    A06.close();
                    AnonymousClass4GK A02 = C18630y0.A02(r3);
                    try {
                        r3.A0Y.clear();
                        if (AnonymousClass2BF.A00) {
                            r3.A01.A09();
                            r3.A01.A0F(A02);
                        }
                        A02.close();
                        return null;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    A06.close();
                    throw th;
                }
        }
        th.addSuppressed(th2);
        throw th;
        throw th;
        throw th;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        boolean z;
        switch (this.A01) {
            case 0:
                Collection collection = (Collection) obj;
                C162457s7.A0J(collection, 0);
                C56962sq r2 = (C56962sq) this.A00;
                synchronized (r2) {
                    z = false;
                    r2.A00 = false;
                    if (!r2.A01) {
                        r2.A0d.addAll(collection);
                        z = true;
                        r2.A01 = true;
                    }
                }
                if (z) {
                    Set A05 = r2.A05();
                    if (!A05.isEmpty()) {
                        r2.A0E.A0C(A05);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                Number number = (Number) obj;
                if (number != null) {
                    SettingsDataUsageActivity settingsDataUsageActivity = (SettingsDataUsageActivity) this.A00;
                    if (settingsDataUsageActivity.A06 == -1) {
                        Log.i("settings-data-usage-activity/load storage data/cache data fetched");
                        long longValue = number.longValue();
                        settingsDataUsageActivity.A06 = longValue;
                        settingsDataUsageActivity.A0G.setText(AnonymousClass35V.A05(settingsDataUsageActivity.A00, longValue));
                        return;
                    }
                    return;
                }
                return;
            default:
                ((SettingsNotifications) this.A00).A75();
                return;
        }
    }

    public AnonymousClass4HS(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
