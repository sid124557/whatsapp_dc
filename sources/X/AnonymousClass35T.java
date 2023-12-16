package X;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: X.35T  reason: invalid class name */
public class AnonymousClass35T {
    public static final long A0K = TimeUnit.DAYS.toMillis(60);
    public static final C55222q0 A0L = new C55222q0();
    public NotificationManager A00;
    public Handler A01;
    public boolean A02 = false;
    public boolean A03 = false;
    public final C69263Wi A04;
    public final C56602sG A05;
    public final C29421in A06;
    public final AnonymousClass5ZU A07;
    public final C620633i A08;
    public final C56612sH A09;
    public final C54292oU A0A;
    public final AnonymousClass5ZR A0B;
    public final AnonymousClass33p A0C;
    public final C56982ss A0D;
    public final C66473Lo A0E;
    public final AnonymousClass4FI A0F;
    public final C28891hw A0G;
    public final C55702qm A0H;
    public final C29241iV A0I;
    public final AnonymousClass2X6 A0J;

    public static int A00(boolean z) {
        return z ? 3 : 4;
    }

    public synchronized NotificationManager A04() {
        NotificationManager notificationManager;
        notificationManager = this.A00;
        if (notificationManager == null) {
            notificationManager = this.A08.A0A();
            this.A00 = notificationManager;
        }
        return notificationManager;
    }

    public synchronized String A07(Uri uri, CharSequence charSequence, String str, String str2, String str3, String str4, int i) {
        C55222q0 r5 = A0L;
        if (r5.A04(str)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("chat-settings-store/addNotificationChannel channel already exists for settingsId:");
            C18260x0.A1K(A0o, C627336j.A08(str));
            return r5.A00(str);
        }
        AnonymousClass33p r6 = this.A0C;
        int A022 = C18280x3.A02(AnonymousClass0x2.A0F(r6), "num_notification_channels_created");
        C18260x0.A0w("wa-shared-prefs/getNumNotificationChannelsCreated ", AnonymousClass001.A0o(), A022);
        int i2 = A022 + 1;
        String A0Y = AnonymousClass000.A0Y("_", AnonymousClass000.A0l(str), i2);
        int i3 = i;
        NotificationChannel notificationChannel = new NotificationChannel(A0Y, charSequence, i3);
        String str5 = str4;
        if (!TextUtils.isEmpty(str5)) {
            notificationChannel.setGroup(str5);
        }
        Integer A042 = C66553Lw.A04(str2);
        if (A042 != null) {
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(A042.intValue());
        } else {
            notificationChannel.enableLights(false);
        }
        long[] A0B2 = C66553Lw.A0B(str3);
        if (A0B2 != null) {
            notificationChannel.setVibrationPattern(A0B2);
            notificationChannel.enableVibration(true);
        } else {
            notificationChannel.enableVibration(false);
        }
        notificationChannel.setSound(uri, Notification.AUDIO_ATTRIBUTES_DEFAULT);
        notificationChannel.setLockscreenVisibility(0);
        if (!"group_chat_defaults".equals(str) && !"individual_chat_defaults".equals(str)) {
            C95814uZ A0S = C18310x6.A0S(str);
            if (Build.VERSION.SDK_INT >= 30 && A0S != null) {
                A02(notificationChannel, A0S);
            }
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("chat-settings-store/addNotificationChannel adding channel with id:");
        A0o2.append(A01(A0Y));
        A0o2.append(" importance:");
        A0o2.append(i3);
        A0o2.append(" lights:");
        A0o2.append(notificationChannel.shouldShowLights());
        A0o2.append(" color:");
        String hexString = Integer.toHexString(notificationChannel.getLightColor() & 16777215);
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("000000".substring(hexString.length()));
        C18270x1.A1C(hexString, A0o3, A0o2);
        A0o2.append(" vibrate:");
        A0o2.append(notificationChannel.shouldVibrate());
        A0o2.append(" sounduri:");
        C18260x0.A0o(notificationChannel.getSound(), A0o2);
        AnonymousClass354.A02(notificationChannel, A04());
        C18260x0.A0w("wa-shared-prefs/setNumNotificationChannelsCreated ", AnonymousClass001.A0o(), i2);
        C18270x1.A0h(C18270x1.A03(r6), "num_notification_channels_created", i2);
        r5.A02(str, A0Y);
        return A0Y;
    }

    public synchronized void A0B() {
        synchronized (this) {
            if (Build.VERSION.SDK_INT >= 26 && this.A01 == null) {
                this.A01 = new Handler(this.A0J.A00(), new AnonymousClass4IL(this, 2));
            }
            Handler handler = this.A01;
            C626936e.A06(handler);
            if (!handler.hasMessages(1)) {
                handler.sendEmptyMessageDelayed(1, 3000);
            }
        }
    }

    public synchronized void A0C() {
        String str;
        if (this.A02) {
            for (NotificationChannel notificationChannel : AnonymousClass354.A01(A04())) {
                if (!AnonymousClass327.A01.contains(notificationChannel.getId()) && !"miscellaneous".equals(notificationChannel.getId()) && "channel_group_chats".equals(notificationChannel.getGroup())) {
                    Pair A002 = C386728r.A00(notificationChannel.getId());
                    if (A002 == null || (str = (String) A002.first) == null) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("chat-settings-store/updateChannelNames ignoring channel:");
                        C18260x0.A1L(A0o, notificationChannel.getId());
                    } else {
                        CharSequence name = notificationChannel.getName();
                        CharSequence A062 = A06(str);
                        if (!TextUtils.equals(name, A062)) {
                            notificationChannel.getId();
                            AnonymousClass354.A02(new NotificationChannel(notificationChannel.getId(), A062, notificationChannel.getImportance()), A04());
                        }
                    }
                }
            }
        }
    }

    public synchronized void A0D(NotificationChannel notificationChannel, String str, int i) {
        AnonymousClass33p r5 = this.A0C;
        int A022 = C18280x3.A02(AnonymousClass0x2.A0F(r5), "num_notification_channels_created");
        C18260x0.A0w("wa-shared-prefs/getNumNotificationChannelsCreated ", AnonymousClass001.A0o(), A022);
        int i2 = A022 + 1;
        String A0Y = AnonymousClass000.A0Y("_", AnonymousClass000.A0l(str), i2);
        NotificationChannel notificationChannel2 = new NotificationChannel(A0Y, A06(str), i);
        notificationChannel2.setGroup("channel_group_chats");
        notificationChannel2.enableLights(notificationChannel.shouldShowLights());
        notificationChannel2.setLightColor(notificationChannel.getLightColor());
        notificationChannel2.enableVibration(notificationChannel.shouldVibrate());
        notificationChannel2.setVibrationPattern(notificationChannel.getVibrationPattern());
        notificationChannel2.setSound(notificationChannel.getSound(), notificationChannel.getAudioAttributes());
        notificationChannel2.setLockscreenVisibility(notificationChannel.getLockscreenVisibility());
        notificationChannel2.setShowBadge(notificationChannel.canShowBadge());
        notificationChannel2.setBypassDnd(notificationChannel.canBypassDnd());
        C55222q0 r2 = A0L;
        r2.A03(str, notificationChannel.getId());
        AnonymousClass354.A03(A04(), notificationChannel.getId());
        AnonymousClass354.A02(notificationChannel2, A04());
        C18260x0.A1R(AnonymousClass001.A0o(), "chat-settings-store/unMuteChannelBySettingsId creating new channel:", notificationChannel2);
        r2.A02(str, A0Y);
        C18260x0.A0w("wa-shared-prefs/setNumNotificationChannelsCreated ", AnonymousClass001.A0o(), i2);
        C18270x1.A0h(C18270x1.A03(r5), "num_notification_channels_created", i2);
    }

    public synchronized void A0F(AnonymousClass4GK r2) {
        A0H(((AnonymousClass3H0) r2).A03);
    }

    public NotificationChannel A03(String str) {
        C55222q0 r2 = A0L;
        if (r2.A04(str)) {
            return AnonymousClass354.A00(A04(), r2.A00(str));
        }
        return null;
    }

    public CharSequence A06(String str) {
        Context context;
        int i;
        if ("individual_chat_defaults".equals(str)) {
            context = this.A0A.A00;
            i = R.string.f11nameremoved;
        } else if ("group_chat_defaults".equals(str)) {
            context = this.A0A.A00;
            i = R.string.f11nameremoved;
        } else if ("silent_notifications".equals(str)) {
            context = this.A0A.A00;
            i = R.string.f11nameremoved;
        } else if ("channel_notification".equals(str)) {
            context = this.A0A.A00;
            i = R.string.f11nameremoved;
        } else if ("voip_notification".equals(str)) {
            context = this.A0A.A00;
            i = R.string.f11nameremoved;
        } else {
            C95814uZ A0S = C18310x6.A0S(str);
            if (A0S == null) {
                return null;
            }
            return this.A07.A0H(this.A0E.A01(A0S));
        }
        return context.getString(i);
    }

    public String A08(String str) {
        String A012 = A0L.A01(str);
        if (!"silent_notifications".equals(A012)) {
            return str;
        }
        if (AnonymousClass354.A00(A04(), str).getImportance() <= 2) {
            return str;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("chat-settings-store/repairSilentNotificationChannel repairing channel:");
        C18260x0.A1L(A0o, C627336j.A08(A012));
        A0I(A012);
        return A07((Uri) null, A06(A012), A012, (String) null, (String) null, (String) null, 2);
    }

    public void A0A() {
        if (Build.VERSION.SDK_INT >= 26) {
            Log.i("chat-settings-store/deleteDatabaseFiles success");
            A09();
        }
    }

    public void A0G(C56862sg r3) {
        if (Build.VERSION.SDK_INT >= 26) {
            Log.i("chat-settings-store/onOpen targeting api 26");
            A0H(r3);
        }
    }

    public synchronized void A0H(C56862sg r26) {
        Cursor A012;
        Uri parse;
        C95814uZ A0S;
        Pair A002;
        String str;
        String str2;
        synchronized (this) {
            C55222q0 r1 = A0L;
            synchronized (r1) {
                r1.A01.clear();
                r1.A00.clear();
            }
            this.A02 = false;
            Context context = this.A0A.A00;
            C620633i r10 = this.A08;
            AnonymousClass327.A00(context, r10);
            List<NotificationChannel> A013 = AnonymousClass354.A01(A04());
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("chat-settings-store/fullSync channels schema current: ");
            AnonymousClass33p r2 = this.A0C;
            AnonymousClass33p r24 = r2;
            C183538qC r6 = r2.A01;
            A0o.append(C18300x5.A0B(r6).getInt("notification_channels_schema_version", 0));
            A0o.append("  desired:");
            C18260x0.A1F(A0o, 2);
            if (C18300x5.A0B(r6).getInt("notification_channels_schema_version", 0) >= 2) {
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                for (NotificationChannel notificationChannel : A013) {
                    if (!AnonymousClass327.A01.contains(notificationChannel.getId())) {
                        Pair A003 = C386728r.A00(notificationChannel.getId());
                        if (A003 != null) {
                            str2 = (String) A003.first;
                        } else {
                            str2 = null;
                        }
                        if ("individual_chat_defaults".equals(str2)) {
                            z = true;
                        } else if ("group_chat_defaults".equals(str2)) {
                            z2 = true;
                        } else if ("silent_notifications".equals(str2)) {
                            z3 = true;
                        }
                    }
                }
                if (z && z2 && z3) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    AnonymousClass000.A1H("chat-settings-store/Num notification channels in system:", A0o2, A013);
                    A0o2.append(" num dynamic channels created:");
                    int A022 = C18280x3.A02(AnonymousClass0x2.A0F(r24), "num_notification_channels_created");
                    C18260x0.A0w("wa-shared-prefs/getNumNotificationChannelsCreated ", AnonymousClass001.A0o(), A022);
                    C18260x0.A1F(A0o2, A022);
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    A0o3.append("chat-settings-store/fullSyncNotificationChannels/existing channel groups:");
                    C18260x0.A0m(A04().getNotificationChannelGroups(), A0o3);
                    for (NotificationChannel notificationChannel2 : A013) {
                        if (!AnonymousClass327.A01.contains(notificationChannel2.getId()) && !"miscellaneous".equals(notificationChannel2.getId()) && (A002 = C386728r.A00(notificationChannel2.getId())) != null && (str = (String) A002.first) != null) {
                            StringBuilder A0o4 = AnonymousClass001.A0o();
                            A0o4.append("chat-settings-store/Adding channel to map settingsId:");
                            A0o4.append(C627336j.A08(str));
                            C18260x0.A1P(A0o4, " channel:", notificationChannel2);
                            r1.A02(str, notificationChannel2.getId());
                        }
                    }
                    this.A02 = true;
                    this.A04.BkS(new C71293bs((Object) this, 21));
                }
            }
            A09();
            C18260x0.A1P(AnonymousClass001.A0o(), "chat-settings-store/fullSyncNotificationChannels/full-sync: existing channels: ", A013);
            StringBuilder A0o5 = AnonymousClass001.A0o();
            A0o5.append("chat-settings-store/fullSyncNotificationChannels/full-sync: existing channel groups:");
            C18260x0.A0m(A04().getNotificationChannelGroups(), A0o5);
            try {
                A012 = C56862sg.A01(r26, "SELECT jid, message_light, message_vibrate, message_tone, use_custom_notifications, low_pri_notifications FROM settings", "CHAT_SETTINGS/GET_ALL_NOTIFICATION_CHANNELS");
                int A014 = AnonymousClass0x9.A01(A012);
                int columnIndexOrThrow = A012.getColumnIndexOrThrow("message_light");
                int columnIndexOrThrow2 = A012.getColumnIndexOrThrow("message_vibrate");
                int columnIndexOrThrow3 = A012.getColumnIndexOrThrow("message_tone");
                int columnIndexOrThrow4 = A012.getColumnIndexOrThrow("use_custom_notifications");
                int columnIndexOrThrow5 = A012.getColumnIndexOrThrow("low_pri_notifications");
                while (A012.moveToNext()) {
                    String string = A012.getString(A014);
                    boolean z4 = false;
                    boolean A1U = AnonymousClass000.A1U(A012.getInt(columnIndexOrThrow4), 1);
                    if (!"individual_chat_defaults".equals(string) && !"group_chat_defaults".equals(string)) {
                        if (A1U && (A0S = C18310x6.A0S(string)) != null) {
                            C56982ss r5 = this.A0D;
                            if (r5.A0L(A0S)) {
                                if (r5.A09(A0S) <= System.currentTimeMillis() - A0K) {
                                }
                            }
                        }
                    }
                    if (A012.getInt(columnIndexOrThrow5) == 1) {
                        z4 = true;
                    }
                    CharSequence A062 = A06(string);
                    int i = 4;
                    if (z4) {
                        i = 3;
                    }
                    String string2 = A012.getString(columnIndexOrThrow);
                    String string3 = A012.getString(columnIndexOrThrow2);
                    String string4 = A012.getString(columnIndexOrThrow3);
                    if (string4 == null) {
                        parse = Uri.EMPTY;
                    } else {
                        parse = Uri.parse(string4);
                    }
                    if (!TextUtils.isEmpty(string4) && !C627536m.A0K(parse, r10, this.A0B, true)) {
                        parse = Settings.System.DEFAULT_NOTIFICATION_URI;
                    }
                    A07(parse, A062, string, string2, string3, "channel_group_chats", i);
                }
                A012.close();
            } catch (Exception e) {
                Log.e("chat-settings-store/syncNotificationChannels", e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            if (!r1.A04("individual_chat_defaults")) {
                A07(Settings.System.DEFAULT_NOTIFICATION_URI, A06("individual_chat_defaults"), "individual_chat_defaults", "FFFFFF", "1", "channel_group_chats", 4);
            }
            if (!r1.A04("group_chat_defaults")) {
                A07(Settings.System.DEFAULT_NOTIFICATION_URI, A06("group_chat_defaults"), "group_chat_defaults", "FFFFFF", "1", "channel_group_chats", 4);
            }
            if (!r1.A04("silent_notifications")) {
                A07((Uri) null, A06("silent_notifications"), "silent_notifications", (String) null, (String) null, (String) null, 2);
            }
            this.A02 = true;
            C18260x0.A0w("wa-shared-prefs/setNotificationChannelsSchemaVersion ", AnonymousClass001.A0o(), 2);
            C18260x0.A0L(r24, "notification_channels_schema_version", 2);
            this.A04.BkS(new C71293bs((Object) this, 21));
        }
        return;
        throw th;
    }

    public void A0I(String str) {
        C55222q0 r1 = A0L;
        String A002 = r1.A00(str);
        if (A002 != null && !AnonymousClass327.A01.contains(A002)) {
            AnonymousClass354.A03(A04(), A002);
            r1.A03(str, A002);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("chat-settings-store/deleteNotificationChannel/deleting channelId:");
            A0o.append(A01(A002));
            A0o.append(" for settingsId:");
            C18260x0.A1L(A0o, C627336j.A08(str));
        }
    }

    public boolean A0J(NotificationChannel notificationChannel, C85284Fq r21) {
        String str;
        Cursor A0E2;
        NotificationChannel notificationChannel2 = notificationChannel;
        C85284Fq r3 = r21;
        String id = notificationChannel2.getId();
        Pair A002 = C386728r.A00(id);
        if (A002 != null) {
            str = (String) A002.first;
        } else {
            str = null;
        }
        if (str == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("chat-settings-store/updateStoreFromNotificationChannel invalid channel id: ");
            C18260x0.A1K(A0o, A01(id));
            return false;
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("chat-settings-store/updateStoreFromNotificationChannel for id:");
        C18260x0.A1L(A0o2, A01(id));
        try {
            C56862sg r4 = ((AnonymousClass3H0) r3).A03;
            A0E2 = r4.A0E("SELECT message_light, message_vibrate, message_tone, low_pri_notifications FROM settings WHERE jid = ?", "updateStoreFromNotificationChannel/QUERY_CHAT_SETTINGS", new String[]{str});
            if (A0E2.moveToNext()) {
                C627336j.A08(str);
                ContentValues A052 = A05(notificationChannel2, AnonymousClass0x2.A0Z(A0E2, "message_light"), AnonymousClass0x2.A0Z(A0E2, "message_vibrate"), AnonymousClass0x2.A0Z(A0E2, "message_tone"), AnonymousClass000.A1U(AnonymousClass0x2.A04(A0E2, "low_pri_notifications"), 1));
                if (A052.size() > 0) {
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    A0o3.append("chat-settings-store/updateStoreFromNotificationChannel updating row for settingsId: ");
                    A0o3.append(C627336j.A08(str));
                    C18260x0.A1R(A0o3, " with values:", A052);
                    C56862sg r5 = r4;
                    r5.A05(A052, "settings", "jid = ?", "updateStoreFromNotificationChannel/UPDATE_CHAT_SETTINGS", new String[]{str});
                }
                A0E2.close();
                return false;
            }
            C627336j.A08(str);
            if ("individual_chat_defaults".equals(str) || "group_chat_defaults".equals(str)) {
                ContentValues A053 = A05(notificationChannel2, "FFFFFF", "1", Settings.System.DEFAULT_NOTIFICATION_URI.toString(), false);
                if (A053.size() > 0) {
                    A053.put("jid", str);
                    if (!A053.containsKey("message_light")) {
                        A053.put("message_light", "FFFFFF");
                    }
                    if (!A053.containsKey("message_vibrate")) {
                        A053.put("message_vibrate", "1");
                    }
                    if (!A053.containsKey("message_tone")) {
                        A053.put("message_tone", Settings.System.DEFAULT_NOTIFICATION_URI.toString());
                    }
                    A053.put("message_popup", Integer.toString(0));
                    A053.put("call_tone", Settings.System.DEFAULT_RINGTONE_URI.toString());
                    A053.put("call_vibrate", "1");
                    StringBuilder A0o4 = AnonymousClass001.A0o();
                    A0o4.append("chat-settings-store/updateStoreFromNotificationChannel adding row for settingsId: ");
                    C18260x0.A1L(A0o4, C627336j.A08(str));
                    r4.A08("settings", "ChatSettingsStore/updateStoreFromNotificationChannel/INSERT_CHAT_SETTINGS", A053);
                }
                A0E2.close();
                return false;
            }
            if (!"silent_notifications".equals(str) && !"voip_notification".equals(str)) {
                AnonymousClass354.A03(A04(), id);
                A0L.A03(str, id);
                StringBuilder A0o5 = AnonymousClass001.A0o();
                A0o5.append("chat-settings-store/updateStoreFromNotificationChannel deleting channel: ");
                C18260x0.A1L(A0o5, A01(id));
            }
            A0E2.close();
            return false;
            A0E2.close();
            return true;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.i("chat-settings-store/updateStoreFromNotificationChannel", e);
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public boolean A0K(String str) {
        if (!"voip_notification".equals(A0L.A01(str)) || AnonymousClass354.A00(A04(), str).getImportance() != 0) {
            return false;
        }
        return true;
    }

    public AnonymousClass35T(C69263Wi r5, C29421in r6, AnonymousClass5ZU r7, C620633i r8, C56612sH r9, C54292oU r10, AnonymousClass5ZR r11, AnonymousClass33p r12, C56982ss r13, C66473Lo r14, C28891hw r15, C29241iV r16, AnonymousClass2X6 r17) {
        AnonymousClass4H9 r0;
        AnonymousClass4HI r02;
        boolean z = AnonymousClass2BF.A00;
        AnonymousClass4IC r2 = null;
        if (z) {
            r0 = new AnonymousClass4H9(this, 5);
        } else {
            r0 = null;
        }
        this.A05 = r0;
        if (z) {
            r02 = new AnonymousClass4HI(this, 7);
        } else {
            r02 = null;
        }
        this.A0H = r02;
        this.A0F = z ? new AnonymousClass4IC(this, 14) : r2;
        this.A09 = r9;
        this.A04 = r5;
        this.A0A = r10;
        this.A0D = r13;
        this.A08 = r8;
        this.A07 = r7;
        this.A06 = r6;
        this.A0B = r11;
        this.A0C = r12;
        this.A0G = r15;
        this.A0J = r17;
        this.A0E = r14;
        this.A0I = r16;
    }

    public static String A01(String str) {
        Pair A002 = C386728r.A00(str);
        if (A002 == null) {
            return null;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(C627336j.A08((String) A002.first));
        A0o.append("_");
        return AnonymousClass000.A0R(A002.second, A0o);
    }

    public static final void A02(NotificationChannel notificationChannel, C95814uZ r4) {
        String str;
        String rawString = r4.getRawString();
        boolean A0K2 = C627336j.A0K(r4);
        C55222q0 r1 = A0L;
        if (A0K2) {
            str = "group_chat_defaults";
        } else {
            str = "individual_chat_defaults";
        }
        String A002 = r1.A00(str);
        if (A002 != null) {
            notificationChannel.setConversationId(A002, rawString);
            A01(A002);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.ContentValues A05(android.app.NotificationChannel r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11) {
        /*
            r6 = this;
            android.content.ContentValues r4 = X.AnonymousClass0x9.A06()
            java.lang.Integer r1 = X.C66553Lw.A04(r8)
            java.lang.String r5 = "message_light"
            boolean r0 = r7.shouldShowLights()
            if (r1 == 0) goto L_0x00ba
            if (r0 != 0) goto L_0x0086
            java.lang.String r0 = "000000"
        L_0x0015:
            r4.put(r5, r0)
        L_0x0018:
            long[] r2 = X.C66553Lw.A0B(r9)
            java.lang.String r1 = "message_vibrate"
            boolean r0 = r7.shouldVibrate()
            if (r2 == 0) goto L_0x0081
            if (r0 != 0) goto L_0x002c
            java.lang.String r0 = "0"
        L_0x0029:
            r4.put(r1, r0)
        L_0x002c:
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            java.lang.String r1 = "message_tone"
            android.net.Uri r0 = r7.getSound()
            if (r2 != 0) goto L_0x005b
            if (r0 != 0) goto L_0x006a
            java.lang.String r0 = ""
        L_0x003d:
            r4.put(r1, r0)
        L_0x0040:
            r0 = 4
            if (r11 == 0) goto L_0x0044
            r0 = 3
        L_0x0044:
            int r1 = r7.getImportance()
            if (r1 == r0) goto L_0x005a
            r0 = 3
            if (r1 < r0) goto L_0x005a
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "low_pri_notifications"
            r4.put(r0, r1)
        L_0x005a:
            return r4
        L_0x005b:
            if (r0 == 0) goto L_0x0040
            android.net.Uri r0 = r7.getSound()
            java.lang.String r0 = r0.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            goto L_0x0076
        L_0x006a:
            android.net.Uri r0 = r7.getSound()
            java.lang.String r0 = r0.toString()
            boolean r0 = r10.equals(r0)
        L_0x0076:
            if (r0 != 0) goto L_0x0040
            android.net.Uri r0 = r7.getSound()
            java.lang.String r0 = r0.toString()
            goto L_0x003d
        L_0x0081:
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = "1"
            goto L_0x0029
        L_0x0086:
            int r0 = r7.getLightColor()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0018
            int r1 = r7.getLightColor()
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r0
            java.lang.String r3 = java.lang.Integer.toHexString(r1)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            int r1 = r3.length()
            java.lang.String r0 = "000000"
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r3, r2)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r1.toUpperCase(r0)
            goto L_0x0015
        L_0x00ba:
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "FFFFFF"
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass35T.A05(android.app.NotificationChannel, java.lang.String, java.lang.String, java.lang.String, boolean):android.content.ContentValues");
    }

    public void A09() {
        NotificationManager A042 = A04();
        C626936e.A06(A042);
        for (NotificationChannel notificationChannel : AnonymousClass354.A01(A042)) {
            if (!AnonymousClass327.A01.contains(notificationChannel.getId()) && !"miscellaneous".equals(notificationChannel.getId())) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("chat-settings-store/deleteAllNotificationChannels/Deleting notification channel: ");
                C18260x0.A1L(A0o, notificationChannel.getId());
                AnonymousClass354.A03(A042, notificationChannel.getId());
            }
        }
        C55222q0 r1 = A0L;
        synchronized (r1) {
            r1.A01.clear();
            r1.A00.clear();
        }
    }

    public void A0E(Uri uri, CharSequence charSequence, String str, String str2, String str3, boolean z, boolean z2) {
        int i;
        boolean z3;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("chat-settings-store/addOrUpdateChannel settingsId:");
        String str4 = str;
        A0o.append(C627336j.A08(str4));
        A0o.append(" notifyLight:");
        String str5 = str2;
        A0o.append(str5);
        A0o.append(" notfifyVibrate:");
        String str6 = str3;
        A0o.append(str6);
        A0o.append(" sound:");
        Uri uri2 = uri;
        A0o.append(uri);
        C18260x0.A1D(" isLowPri:", A0o, z);
        String A002 = A0L.A00(str4);
        if (!AnonymousClass327.A01.contains(A002)) {
            if (A002 != null) {
                NotificationChannel A003 = AnonymousClass354.A00(A04(), A002);
                Integer A042 = C66553Lw.A04(str5);
                boolean shouldShowLights = A003.shouldShowLights();
                if (A042 == null ? !shouldShowLights : shouldShowLights && A042.equals(Integer.valueOf(A003.getLightColor()))) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                long[] A0B2 = C66553Lw.A0B(str6);
                boolean shouldVibrate = A003.shouldVibrate();
                if (A0B2 == null ? shouldVibrate : !shouldVibrate) {
                    z3 = true;
                }
                if (!Objects.equals(uri, A003.getSound())) {
                    z3 = true;
                }
                i = A003.getImportance();
                int i2 = 4;
                if (z) {
                    i2 = 3;
                }
                if (i == i2) {
                    i = i2;
                } else if (i >= 3) {
                    i = i2;
                    z3 = true;
                } else {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("chat-settings-store/addOrUpdateChannel not updating channel importance for settingsId:");
                    A0o2.append(C627336j.A08(str4));
                    C18260x0.A0w(" currentImportance:", A0o2, i);
                }
                if ((Build.VERSION.SDK_INT < 30 || !z2 || !TextUtils.isEmpty(A003.getConversationId())) && !z3) {
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    A0o3.append("chat-settings-store/addOrUpdateChannel update not needed for settingsId:");
                    C18260x0.A1J(A0o3, C627336j.A08(str4));
                    return;
                }
                A0I(str4);
            } else {
                i = 4;
                if (z) {
                    i = 3;
                }
            }
            A07(uri2, charSequence, str4, str5, str6, "channel_group_chats", i);
        }
    }
}
