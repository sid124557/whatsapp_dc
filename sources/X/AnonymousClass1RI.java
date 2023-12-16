package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1RI  reason: invalid class name */
public class AnonymousClass1RI extends C18630y0 {
    public final C54292oU A00;
    public final C54412og A01;
    public final C60972zT A02;
    public final C45932ao A03;
    public final AnonymousClass2G4 A04;
    public final C28701hd A05;

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        synchronized (this) {
            String databaseName = getDatabaseName();
            C56862sg A002 = C626135u.A00(sQLiteDatabase, this.A02, this.A03, databaseName);
            Log.i("creating contacts database version 95");
            C615631i.A02();
            try {
                SQLiteDatabase sQLiteDatabase2 = A002.A00;
                sQLiteDatabase2.beginTransaction();
                C41492Kl r5 = new C41492Kl(new C41482Kk());
                C56622sI r4 = new C56622sI();
                Set<AnonymousClass4ED> set = (Set) this.A04.A00.get();
                for (AnonymousClass4ED B3j : set) {
                    B3j.B3j(r5, r4);
                }
                Iterator A0i = C18280x3.A0i(r4.A03);
                while (A0i.hasNext()) {
                    C626235v.A03(A002, "WaDatabaseHelper", AnonymousClass001.A0m(A0i));
                }
                r4.A06(A002, r5);
                for (AnonymousClass4ED B3g : set) {
                    B3g.B3g(A002, r5, r4);
                }
                r4.A07(A002, "WaDatabaseHelper");
                for (AnonymousClass4ED B3l : set) {
                    B3l.B3l(A002, r5, r4);
                }
                r4.A08(A002, "WaDatabaseHelper");
                C66123Kd.A00(A002);
                sQLiteDatabase2.setTransactionSuccessful();
                C18270x1.A0g(C54412og.A00(this.A01), "force_wadb_check");
                sQLiteDatabase2.endTransaction();
                C615631i.A02();
                this.A00 = A002;
            } catch (Throwable th) {
                C615631i.A02();
                throw th;
            }
        }
    }

    public AnonymousClass1RI(C55682qk r3, C54292oU r4, C54412og r5, C60972zT r6, C45932ao r7, AnonymousClass2G4 r8, String str) {
        super(r4.A00, r3, str, 95);
        this.A05 = new C28701hd();
        this.A00 = r4;
        this.A03 = r7;
        this.A04 = r8;
        this.A02 = r6;
        this.A01 = r5;
    }

    public void A0D() {
        super.A0D();
        Iterator A032 = C61102zi.A03(this.A05);
        while (A032.hasNext()) {
            AnonymousClass361 r2 = ((AnonymousClass2IT) A032.next()).A00;
            if (r2 instanceof C34461vC) {
                C34461vC r22 = (C34461vC) r2;
                synchronized (r22.A0B) {
                    r22.A02 = 0;
                }
            }
        }
    }

    public C56862sg A0F() {
        try {
            return C626135u.A00(super.A0A(), this.A02, this.A03, getDatabaseName());
        } catch (SQLiteDatabaseCorruptException e) {
            Log.w("Contacts database is corrupt. Removing...", e);
            A0D();
            return C626135u.A00(super.A0A(), this.A02, this.A03, getDatabaseName());
        } catch (SQLiteException e2) {
            e = e2;
            String obj = e.toString();
            if (obj.contains("file is encrypted")) {
                Log.w("Contacts database is encrypted. Removing...", e);
                A0D();
                return C626135u.A00(super.A0A(), this.A02, this.A03, getDatabaseName());
            }
            if (obj.contains("upgrade read-only database")) {
                Log.w("Client actually opened database as read-only and can't upgrade. Switching to writable...", e);
                return C626135u.A00(super.A0A(), this.A02, this.A03, getDatabaseName());
            }
            throw e;
        } catch (StackOverflowError e3) {
            e = e3;
            Log.w("StackOverflowError during db init check");
            for (StackTraceElement methodName : e.getStackTrace()) {
                if (methodName.getMethodName().equals("onCorruption")) {
                    Log.w("Contacts database is corrupt. Found via StackOverflowError. Removing...");
                    A0D();
                    return C626135u.A00(super.A0A(), this.A02, this.A03, getDatabaseName());
                }
            }
            throw e;
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Downgrading contacts database from version ");
        A0o.append(i);
        C18260x0.A0z(" to ", A0o, i2);
        onCreate(sQLiteDatabase);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0071, code lost:
        r7.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_hours_trigger");
        X.C626235v.A01(r7, "wa_biz_profiles_hours");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007c, code lost:
        r7.execSQL("DROP TRIGGER IF EXISTS group_admin_settings_deletion_trigger");
        X.C626235v.A01(r7, "wa_group_admin_settings");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0087, code lost:
        X.C626235v.A01(r7, "wa_block_list");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008d, code lost:
        r7.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_categories_trigger");
        X.C626235v.A01(r7, "wa_biz_profiles_categories");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0098, code lost:
        X.C626235v.A01(r7, "wa_group_add_black_list");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009e, code lost:
        X.C626235v.A01(r7, "wa_props");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a4, code lost:
        X.C626235v.A01(r7, "wa_last_entry_point");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00aa, code lost:
        r7.execSQL("DROP TABLE IF EXISTS wa_contact_capabilities");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ad, code lost:
        X.C626235v.A01(r7, "wa_last_seen_block_list");
        X.C626235v.A01(r7, "wa_profile_photo_block_list");
        X.C626235v.A01(r7, "wa_about_block_list");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00bf, code lost:
        X.C626235v.A01(r7, "wa_trusted_contacts");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c5, code lost:
        X.C626235v.A01(r7, "wa_trusted_contacts_send");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00cb, code lost:
        X.C626235v.A01(r7, "subgroup_info");
        r7.execSQL("DROP TABLE IF EXISTS group_relationship");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d6, code lost:
        r7.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_linked_accounts_trigger");
        X.C626235v.A01(r7, "wa_biz_profiles_linked_accounts_table");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e1, code lost:
        X.C626235v.A01(r7, "group_membership_count");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e6, code lost:
        X.C626235v.A01(r7, "dismissed_chat");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00eb, code lost:
        r7.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_service_areas_trigger");
        X.C626235v.A01(r7, "wa_biz_profiles_service_areas");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f6, code lost:
        X.C626235v.A01(r7, "group_membership_approval_requests");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00fb, code lost:
        r7.execSQL("DROP TRIGGER IF EXISTS contact_bd_for_business_profiles");
        r7.execSQL("DROP TRIGGER IF EXISTS contact_bu_for_business_profiles");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0101, code lost:
        r7.execSQL("DROP TRIGGER IF EXISTS wa_biz_profiles_bd_direct_connection_allowed_country_codes_trigger");
        X.C626235v.A01(r7, "wa_biz_profiles_direct_connection_allowed_country_codes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x010c, code lost:
        r7.execSQL("DROP TRIGGER IF EXISTS before_delete_dc_enabled_features_trigger");
        X.C626235v.A01(r7, "wa_biz_profiles_dc_enabled_features");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0117, code lost:
        X.C626235v.A01(r7, "quick_promotion_payload");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x011d, code lost:
        X.C626235v.A01(r7, "non_admin_group_membership_approval_requests");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0123, code lost:
        X.C626235v.A01(r7, "wa_biz_profiles_price_tiers");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0129, code lost:
        r7.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_biz_profile_to_service_offerings_trigger");
        X.C626235v.A01(r7, "wa_biz_profile_to_service_offerings");
        X.C626235v.A01(r7, "wa_biz_category_service_offerings");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x013a, code lost:
        X.C626235v.A01(r7, "recently_accepted_deeplink_invites");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0142, code lost:
        if (r9 < 19) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0144, code lost:
        r2 = X.AnonymousClass0x9.A07(1);
        r2.put("tag", (java.lang.String) null);
        r7.update("wa_biz_profiles", r2, (java.lang.String) null, (java.lang.String[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0152, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0034, code lost:
        X.C626235v.A01(r7, "system_contacts_version_table");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003a, code lost:
        X.C626235v.A01(r7, "wa_vnames");
        X.C626235v.A01(r7, "wa_vnames_localized");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0046, code lost:
        X.C626235v.A01(r7, "wa_contact_storage_usage");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004c, code lost:
        r7.execSQL("DROP TRIGGER IF EXISTS contact_bu_for_business_profiles");
        r7.execSQL("DROP TRIGGER IF EXISTS contact_bd_for_business_profiles");
        X.C626235v.A01(r7, "wa_biz_profiles");
        r7.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_websites_trigger");
        X.C626235v.A01(r7, "wa_biz_profiles_websites");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0060, code lost:
        X.C626235v.A01(r7, "wa_group_descriptions");
        X.C626235v.A01(r7, "wa_contacts");
        r7.execSQL("CREATE TABLE wa_biz_profiles (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, email TEXT, address TEXT, business_description TEXT, tag TEXT)");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r7, int r8, int r9) {
        /*
            r6 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Upgrading contacts database from version "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " to "
            X.C18260x0.A0y(r0, r1, r9)
            r5 = 1
            java.lang.String r4 = "DROP TABLE IF EXISTS wa_contact_capabilities"
            java.lang.String r3 = "wa_biz_profiles"
            java.lang.String r2 = "DROP TRIGGER IF EXISTS contact_bd_for_business_profiles"
            java.lang.String r1 = "DROP TRIGGER IF EXISTS contact_bu_for_business_profiles"
            switch(r8) {
                case 3: goto L_0x002b;
                case 4: goto L_0x002b;
                case 5: goto L_0x002b;
                case 6: goto L_0x002f;
                case 7: goto L_0x0034;
                case 8: goto L_0x0034;
                case 9: goto L_0x003a;
                case 10: goto L_0x003a;
                case 11: goto L_0x0046;
                case 12: goto L_0x0046;
                case 13: goto L_0x0046;
                case 14: goto L_0x0046;
                case 15: goto L_0x0046;
                case 16: goto L_0x0046;
                case 17: goto L_0x0046;
                case 18: goto L_0x004c;
                case 19: goto L_0x0060;
                case 20: goto L_0x0071;
                case 21: goto L_0x0071;
                case 22: goto L_0x0071;
                case 23: goto L_0x0071;
                case 24: goto L_0x0071;
                case 25: goto L_0x007c;
                case 26: goto L_0x0087;
                case 27: goto L_0x0087;
                case 28: goto L_0x0087;
                case 29: goto L_0x008d;
                case 30: goto L_0x008d;
                case 31: goto L_0x008d;
                case 32: goto L_0x0098;
                case 33: goto L_0x0098;
                case 34: goto L_0x009e;
                case 35: goto L_0x009e;
                case 36: goto L_0x00a4;
                case 37: goto L_0x00a4;
                case 38: goto L_0x00a4;
                case 39: goto L_0x00aa;
                case 40: goto L_0x00ad;
                case 41: goto L_0x00ad;
                case 42: goto L_0x00ad;
                case 43: goto L_0x00ad;
                case 44: goto L_0x00ad;
                case 45: goto L_0x00ad;
                case 46: goto L_0x00ad;
                case 47: goto L_0x00ad;
                case 48: goto L_0x00ad;
                case 49: goto L_0x00bf;
                case 50: goto L_0x00bf;
                case 51: goto L_0x00c5;
                case 52: goto L_0x00cb;
                case 53: goto L_0x00cb;
                case 54: goto L_0x00d6;
                case 55: goto L_0x00d6;
                case 56: goto L_0x00e1;
                case 57: goto L_0x00e1;
                case 58: goto L_0x00e1;
                case 59: goto L_0x00e1;
                case 60: goto L_0x00e6;
                case 61: goto L_0x00e6;
                case 62: goto L_0x00e6;
                case 63: goto L_0x00e6;
                case 64: goto L_0x00eb;
                case 65: goto L_0x00eb;
                case 66: goto L_0x00eb;
                case 67: goto L_0x00eb;
                case 68: goto L_0x00f6;
                case 69: goto L_0x00fb;
                case 70: goto L_0x00fb;
                case 71: goto L_0x0101;
                case 72: goto L_0x0101;
                case 73: goto L_0x0101;
                case 74: goto L_0x0101;
                case 75: goto L_0x0101;
                case 76: goto L_0x010c;
                case 77: goto L_0x010c;
                case 78: goto L_0x0117;
                case 79: goto L_0x011d;
                case 80: goto L_0x0123;
                case 81: goto L_0x0123;
                case 82: goto L_0x0123;
                case 83: goto L_0x0123;
                case 84: goto L_0x0123;
                case 85: goto L_0x0123;
                case 86: goto L_0x0129;
                case 87: goto L_0x0129;
                case 88: goto L_0x0129;
                case 89: goto L_0x0129;
                case 90: goto L_0x013a;
                case 91: goto L_0x013a;
                case 92: goto L_0x013a;
                case 93: goto L_0x0140;
                case 94: goto L_0x0140;
                default: goto L_0x001e;
            }
        L_0x001e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unrecognized old database version; oldVersion="
            X.C18260x0.A0z(r0, r1, r8)
            r6.onCreate(r7)
        L_0x002a:
            return
        L_0x002b:
            r7.execSQL(r4)
            goto L_0x0034
        L_0x002f:
            java.lang.String r0 = "DROP INDEX wa_contact_capabilities_jid_index"
            r7.execSQL(r0)
        L_0x0034:
            java.lang.String r0 = "system_contacts_version_table"
            X.C626235v.A01(r7, r0)
        L_0x003a:
            java.lang.String r0 = "wa_vnames"
            X.C626235v.A01(r7, r0)
            java.lang.String r0 = "wa_vnames_localized"
            X.C626235v.A01(r7, r0)
        L_0x0046:
            java.lang.String r0 = "wa_contact_storage_usage"
            X.C626235v.A01(r7, r0)
        L_0x004c:
            r7.execSQL(r1)
            r7.execSQL(r2)
            X.C626235v.A01(r7, r3)
            java.lang.String r0 = "DROP TRIGGER IF EXISTS business_profiles_bd_for_websites_trigger"
            r7.execSQL(r0)
            java.lang.String r0 = "wa_biz_profiles_websites"
            X.C626235v.A01(r7, r0)
        L_0x0060:
            java.lang.String r0 = "wa_group_descriptions"
            X.C626235v.A01(r7, r0)
            java.lang.String r0 = "wa_contacts"
            X.C626235v.A01(r7, r0)
            java.lang.String r0 = "CREATE TABLE wa_biz_profiles (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, email TEXT, address TEXT, business_description TEXT, tag TEXT)"
            r7.execSQL(r0)
        L_0x0071:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS business_profiles_bd_for_hours_trigger"
            r7.execSQL(r0)
            java.lang.String r0 = "wa_biz_profiles_hours"
            X.C626235v.A01(r7, r0)
        L_0x007c:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS group_admin_settings_deletion_trigger"
            r7.execSQL(r0)
            java.lang.String r0 = "wa_group_admin_settings"
            X.C626235v.A01(r7, r0)
        L_0x0087:
            java.lang.String r0 = "wa_block_list"
            X.C626235v.A01(r7, r0)
        L_0x008d:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS business_profiles_bd_for_categories_trigger"
            r7.execSQL(r0)
            java.lang.String r0 = "wa_biz_profiles_categories"
            X.C626235v.A01(r7, r0)
        L_0x0098:
            java.lang.String r0 = "wa_group_add_black_list"
            X.C626235v.A01(r7, r0)
        L_0x009e:
            java.lang.String r0 = "wa_props"
            X.C626235v.A01(r7, r0)
        L_0x00a4:
            java.lang.String r0 = "wa_last_entry_point"
            X.C626235v.A01(r7, r0)
        L_0x00aa:
            r7.execSQL(r4)
        L_0x00ad:
            java.lang.String r0 = "wa_last_seen_block_list"
            X.C626235v.A01(r7, r0)
            java.lang.String r0 = "wa_profile_photo_block_list"
            X.C626235v.A01(r7, r0)
            java.lang.String r0 = "wa_about_block_list"
            X.C626235v.A01(r7, r0)
        L_0x00bf:
            java.lang.String r0 = "wa_trusted_contacts"
            X.C626235v.A01(r7, r0)
        L_0x00c5:
            java.lang.String r0 = "wa_trusted_contacts_send"
            X.C626235v.A01(r7, r0)
        L_0x00cb:
            java.lang.String r0 = "subgroup_info"
            X.C626235v.A01(r7, r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS group_relationship"
            r7.execSQL(r0)
        L_0x00d6:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS business_profiles_bd_for_linked_accounts_trigger"
            r7.execSQL(r0)
            java.lang.String r0 = "wa_biz_profiles_linked_accounts_table"
            X.C626235v.A01(r7, r0)
        L_0x00e1:
            java.lang.String r0 = "group_membership_count"
            X.C626235v.A01(r7, r0)
        L_0x00e6:
            java.lang.String r0 = "dismissed_chat"
            X.C626235v.A01(r7, r0)
        L_0x00eb:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS business_profiles_bd_for_service_areas_trigger"
            r7.execSQL(r0)
            java.lang.String r0 = "wa_biz_profiles_service_areas"
            X.C626235v.A01(r7, r0)
        L_0x00f6:
            java.lang.String r0 = "group_membership_approval_requests"
            X.C626235v.A01(r7, r0)
        L_0x00fb:
            r7.execSQL(r2)
            r7.execSQL(r1)
        L_0x0101:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS wa_biz_profiles_bd_direct_connection_allowed_country_codes_trigger"
            r7.execSQL(r0)
            java.lang.String r0 = "wa_biz_profiles_direct_connection_allowed_country_codes"
            X.C626235v.A01(r7, r0)
        L_0x010c:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS before_delete_dc_enabled_features_trigger"
            r7.execSQL(r0)
            java.lang.String r0 = "wa_biz_profiles_dc_enabled_features"
            X.C626235v.A01(r7, r0)
        L_0x0117:
            java.lang.String r0 = "quick_promotion_payload"
            X.C626235v.A01(r7, r0)
        L_0x011d:
            java.lang.String r0 = "non_admin_group_membership_approval_requests"
            X.C626235v.A01(r7, r0)
        L_0x0123:
            java.lang.String r0 = "wa_biz_profiles_price_tiers"
            X.C626235v.A01(r7, r0)
        L_0x0129:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS business_profiles_bd_for_biz_profile_to_service_offerings_trigger"
            r7.execSQL(r0)
            java.lang.String r0 = "wa_biz_profile_to_service_offerings"
            X.C626235v.A01(r7, r0)
            java.lang.String r0 = "wa_biz_category_service_offerings"
            X.C626235v.A01(r7, r0)
        L_0x013a:
            java.lang.String r0 = "recently_accepted_deeplink_invites"
            X.C626235v.A01(r7, r0)
        L_0x0140:
            r0 = 19
            if (r9 < r0) goto L_0x002a
            android.content.ContentValues r2 = X.AnonymousClass0x9.A07(r5)
            java.lang.String r1 = "tag"
            r0 = 0
            r2.put(r1, r0)
            r7.update(r3, r2, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1RI.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }

    public AnonymousClass1RI(C55682qk r9, C54292oU r10, C54412og r11, C60972zT r12, C45932ao r13, AnonymousClass2G4 r14) {
        this(r9, r10, r11, r12, r13, r14, "wa.db");
    }
}
