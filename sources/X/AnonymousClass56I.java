package X;

import android.content.ContentValues;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.56I  reason: invalid class name */
public class AnonymousClass56I extends AnonymousClass361 {
    /* JADX WARNING: Removed duplicated region for block: B:224:0x03ec A[Catch:{ all -> 0x0558 }] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x042b A[Catch:{ all -> 0x0558 }] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0452 A[Catch:{ all -> 0x0558 }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x045a A[Catch:{ all -> 0x0558 }] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0489 A[Catch:{ all -> 0x0558 }] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x04c8 A[Catch:{ all -> 0x0558 }] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0523 A[SYNTHETIC, Splitter:B:280:0x0523] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0528 A[SYNTHETIC, Splitter:B:283:0x0528] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x052d A[SYNTHETIC, Splitter:B:286:0x052d] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0532 A[SYNTHETIC, Splitter:B:289:0x0532] */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0537 A[SYNTHETIC, Splitter:B:292:0x0537] */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x053c A[SYNTHETIC, Splitter:B:295:0x053c] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0541 A[SYNTHETIC, Splitter:B:298:0x0541] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0546 A[SYNTHETIC, Splitter:B:301:0x0546] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x054b A[SYNTHETIC, Splitter:B:304:0x054b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C105875Wt A01(com.whatsapp.jid.UserJid r32) {
        /*
            r31 = this;
            r8 = 0
            if (r32 != 0) goto L_0x0009
            java.lang.String r0 = "contact-mgr-db/cannot get business profile details by null jid"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r8
        L_0x0009:
            java.lang.String r4 = r32.getRawString()
            r0 = r31
            X.1RI r0 = r0.A00
            r24 = r0
            X.4GK r23 = r24.get()
            java.lang.String r3 = "SELECT _id, jid, email, business_description, address, tag, latitude, longitude, vertical, has_catalog, address_postal_code, address_city_id, address_city_name, commerce_experience, shop_url, cart_enabled, commerce_manager_url, direct_connection_enabled, is_shop_banned, default_postcode, location_name, galaxy_business_enabled, cover_photo_url, cover_photo_id, custom_url, member_since, capi_calling_enabled, is_responsive, postcode_type, price_tier_id, business_blocked_status, survey_sampling_rate, is_offerings_eligible, automated_type, welcome_message_protocol_mode FROM wa_biz_profiles WHERE jid = ?"
            java.lang.String[] r2 = X.C18270x1.A1b(r4)     // Catch:{ all -> 0x05ed }
            java.lang.String r1 = "CONTACT_BIZ_PROFILES"
            r0 = r23
            android.database.Cursor r3 = X.AnonymousClass361.A0A(r0, r3, r1, r2)     // Catch:{ all -> 0x05ed }
            int r0 = r3.getCount()     // Catch:{ all -> 0x05e1 }
            if (r0 == 0) goto L_0x05da
            X.5Wt r2 = new X.5Wt     // Catch:{ all -> 0x05e1 }
            r2.<init>()     // Catch:{ all -> 0x05e1 }
            r6 = 0
            r5 = 1
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x05e1 }
            r7 = 0
            if (r0 == 0) goto L_0x05da
            X.32Y r1 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x05e1 }
            java.lang.String r0 = r3.getString(r5)     // Catch:{ all -> 0x05e1 }
            com.whatsapp.jid.UserJid r1 = r1.A0E(r0)     // Catch:{ all -> 0x05e1 }
            if (r1 == 0) goto L_0x05da
            int r0 = r3.getInt(r6)     // Catch:{ all -> 0x05e1 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x05e1 }
            r2.A08 = r1     // Catch:{ all -> 0x05e1 }
            r0 = 2
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x05e1 }
            r2.A0H = r0     // Catch:{ all -> 0x05e1 }
            r0 = 3
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x05e1 }
            r2.A0G = r0     // Catch:{ all -> 0x05e1 }
            r0 = 5
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x05e1 }
            r2.A0L = r0     // Catch:{ all -> 0x05e1 }
            r1 = 4
            r0 = 10
            java.lang.String r10 = r3.getString(r1)     // Catch:{ all -> 0x05e1 }
            java.lang.String r9 = r3.getString(r0)     // Catch:{ all -> 0x05e1 }
            r1 = 6
            r13 = 7
            r6 = 11
            r0 = 12
            java.lang.String r11 = r3.getString(r6)     // Catch:{ all -> 0x05e1 }
            java.lang.String r14 = r3.getString(r0)     // Catch:{ all -> 0x05e1 }
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x05e1 }
            r12 = 0
            if (r0 == 0) goto L_0x0086
            r6 = r8
            goto L_0x008e
        L_0x0086:
            double r0 = r3.getDouble(r1)     // Catch:{ all -> 0x05e1 }
            java.lang.Double r6 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x05e1 }
        L_0x008e:
            boolean r0 = r3.isNull(r13)     // Catch:{ all -> 0x05e1 }
            if (r0 != 0) goto L_0x009c
            double r0 = r3.getDouble(r13)     // Catch:{ all -> 0x05e1 }
            java.lang.Double r12 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x05e1 }
        L_0x009c:
            java.lang.String r0 = ""
            if (r11 != 0) goto L_0x00a1
            r11 = r0
        L_0x00a1:
            if (r14 == 0) goto L_0x00a4
            r0 = r14
        L_0x00a4:
            X.5dH r1 = new X.5dH     // Catch:{ all -> 0x05e1 }
            r1.<init>(r6, r12, r11, r0)     // Catch:{ all -> 0x05e1 }
            X.5da r0 = new X.5da     // Catch:{ all -> 0x05e1 }
            r0.<init>(r1, r8, r10, r9)     // Catch:{ all -> 0x05e1 }
            r2.A07 = r0     // Catch:{ all -> 0x05e1 }
            r1 = 8
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x05e1 }
            if (r0 != 0) goto L_0x00bc
            java.lang.String r7 = r3.getString(r1)     // Catch:{ all -> 0x05e1 }
        L_0x00bc:
            r2.A0M = r7     // Catch:{ all -> 0x05e1 }
            r0 = 9
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x05e1 }
            boolean r0 = X.AnonymousClass000.A1U(r0, r5)
            r2.A0V = r0     // Catch:{ all -> 0x05e1 }
            r0 = 13
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x05e1 }
            r2.A0D = r0     // Catch:{ all -> 0x05e1 }
            r0 = 14
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x05e1 }
            r2.A0J = r0     // Catch:{ all -> 0x05e1 }
            r0 = 15
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x05e1 }
            boolean r0 = X.AnonymousClass000.A1U(r0, r5)
            r2.A0X = r0     // Catch:{ all -> 0x05e1 }
            r0 = 16
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x05e1 }
            r2.A0E = r0     // Catch:{ all -> 0x05e1 }
            r0 = 17
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x05e1 }
            boolean r0 = X.AnonymousClass000.A1U(r0, r5)
            r2.A0Y = r0     // Catch:{ all -> 0x05e1 }
            r0 = 18
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x05e1 }
            boolean r0 = X.AnonymousClass000.A1U(r0, r5)
            r2.A0c = r0     // Catch:{ all -> 0x05e1 }
            r0 = 21
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x05e1 }
            boolean r0 = X.AnonymousClass000.A1U(r0, r5)
            r2.A0Z = r0     // Catch:{ all -> 0x05e1 }
            r0 = 24
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x05e1 }
            r2.A0F = r0     // Catch:{ all -> 0x05e1 }
            r0 = 25
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x05e1 }
            r2.A0I = r0     // Catch:{ all -> 0x05e1 }
            r0 = 26
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x05e1 }
            boolean r0 = X.AnonymousClass000.A1U(r0, r5)
            r2.A0W = r0     // Catch:{ all -> 0x05e1 }
            r0 = 27
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x05e1 }
            boolean r0 = X.AnonymousClass000.A1U(r0, r5)
            r2.A0b = r0     // Catch:{ all -> 0x05e1 }
            r0 = 32
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x05e1 }
            boolean r0 = X.AnonymousClass000.A1U(r0, r5)
            r2.A0a = r0     // Catch:{ all -> 0x05e1 }
            r0 = 30
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x05e1 }
            if (r0 == 0) goto L_0x0150
            r2.A0B = r0     // Catch:{ all -> 0x05e1 }
        L_0x0150:
            r0 = 19
            java.lang.String r9 = r3.getString(r0)     // Catch:{ all -> 0x05e1 }
            r0 = 20
            java.lang.String r7 = r3.getString(r0)     // Catch:{ all -> 0x05e1 }
            r0 = 28
            java.lang.String r6 = r3.getString(r0)     // Catch:{ all -> 0x05e1 }
            r1 = 31
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x05e1 }
            if (r0 != 0) goto L_0x0183
            int r10 = r3.getInt(r1)     // Catch:{ all -> 0x05e1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x05e1 }
            if (r1 != 0) goto L_0x0176
            r1 = 0
            goto L_0x0181
        L_0x0176:
            if (r10 < 0) goto L_0x017d
            r0 = 100
            if (r10 > r0) goto L_0x017d
            goto L_0x0181
        L_0x017d:
            java.lang.Integer r1 = X.C18290x4.A0Z()     // Catch:{ all -> 0x05e1 }
        L_0x0181:
            r2.A09 = r1     // Catch:{ all -> 0x05e1 }
        L_0x0183:
            r1 = 33
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x05e1 }
            if (r0 != 0) goto L_0x0191
            int r0 = r3.getInt(r1)     // Catch:{ all -> 0x05e1 }
            r2.A00 = r0     // Catch:{ all -> 0x05e1 }
        L_0x0191:
            r1 = 34
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x05e1 }
            if (r0 != 0) goto L_0x01a3
            int r0 = r3.getInt(r1)     // Catch:{ all -> 0x05e1 }
            boolean r0 = X.AnonymousClass000.A1U(r0, r5)
            r2.A0d = r0     // Catch:{ all -> 0x05e1 }
        L_0x01a3:
            if (r9 == 0) goto L_0x01ae
            if (r7 == 0) goto L_0x01ae
            X.7y4 r0 = new X.7y4     // Catch:{ all -> 0x05e1 }
            r0.<init>(r9, r7, r6)     // Catch:{ all -> 0x05e1 }
            r2.A02 = r0     // Catch:{ all -> 0x05e1 }
        L_0x01ae:
            r0 = 23
            java.lang.String r6 = r3.getString(r0)     // Catch:{ all -> 0x05e1 }
            if (r6 == 0) goto L_0x01c9
            int r0 = r6.length()     // Catch:{ all -> 0x05e1 }
            if (r0 == 0) goto L_0x01c9
            r0 = 22
            java.lang.String r1 = r3.getString(r0)     // Catch:{ all -> 0x05e1 }
            X.7yC r0 = new X.7yC     // Catch:{ all -> 0x05e1 }
            r0.<init>(r6, r8, r8, r1)     // Catch:{ all -> 0x05e1 }
            r2.A04 = r0     // Catch:{ all -> 0x05e1 }
        L_0x01c9:
            if (r15 == 0) goto L_0x05da
            java.lang.String r0 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x05e1 }
            java.lang.String[] r12 = X.C18300x5.A1a(r0, r5)     // Catch:{ all -> 0x05e1 }
            X.4GK r22 = r24.get()     // Catch:{ all -> 0x05e1 }
            r0 = r22
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x05d0 }
            X.2sg r11 = r0.A03     // Catch:{ all -> 0x05d0 }
            java.lang.String r1 = "SELECT websites FROM wa_biz_profiles_websites WHERE wa_biz_profile_id = ? ORDER BY _id ASC"
            java.lang.String r0 = "CONTACT_BIZ_PROFILES_WEBSITES"
            android.database.Cursor r21 = r11.A0E(r1, r0, r12)     // Catch:{ all -> 0x05d0 }
            java.lang.String[] r5 = X.C18300x5.A1a(r4, r5)     // Catch:{ all -> 0x05c4 }
            java.lang.String r4 = "CONTACT_BIZ_PROFILES_HOURS"
            java.lang.String r1 = "SELECT time_zone, hours_note, day_of_week, mode, open_time, close_time, wa_biz_profiles_hours._id FROM wa_biz_profiles INNER JOIN wa_biz_profiles_hours ON (wa_biz_profiles._id = wa_biz_profiles_hours.wa_biz_profile_id) WHERE wa_biz_profiles.jid = ?"
            r0 = r22
            android.database.Cursor r1 = X.AnonymousClass361.A0A(r0, r1, r4, r5)     // Catch:{ all -> 0x05c4 }
            java.lang.String r4 = X.AnonymousClass2BS.A00     // Catch:{ all -> 0x05b8 }
            java.lang.String r0 = "CONTACT_BIZ_PROFILES_CATEGORIES"
            android.database.Cursor r9 = r11.A0E(r4, r0, r12)     // Catch:{ all -> 0x05b8 }
            java.lang.String r4 = X.AnonymousClass2BV.A00     // Catch:{ all -> 0x05ac }
            java.lang.String r0 = "CONTACT_BIZ_PROFILES_SERVICE_AREAS"
            android.database.Cursor r0 = r11.A0E(r4, r0, r12)     // Catch:{ all -> 0x05ac }
            java.lang.String r5 = "SELECT country_code FROM wa_biz_profiles_direct_connection_allowed_country_codes WHERE wa_biz_profile_id = ?"
            java.lang.String r4 = "CONTACT_BIZ_PROFILES_DIRECT_CONNECTION_ALLOWED_COUNTRY_CODES"
            android.database.Cursor r20 = r11.A0E(r5, r4, r12)     // Catch:{ all -> 0x05a0 }
            java.lang.String r5 = X.AnonymousClass2BT.A00     // Catch:{ all -> 0x0594 }
            java.lang.String r4 = "CONTACT_BIZ_PROFILES_TRUST_SIGNALS"
            android.database.Cursor r5 = r11.A0E(r5, r4, r12)     // Catch:{ all -> 0x0594 }
            java.lang.String r6 = "SELECT catalog_feature_type FROM wa_biz_profiles_dc_enabled_features WHERE wa_biz_profile_id = ?"
            java.lang.String r4 = "CONTACT_BIZ_PROFILES_DC_ENABLED_FEATURES"
            android.database.Cursor r19 = r11.A0E(r6, r4, r12)     // Catch:{ all -> 0x0588 }
            java.lang.String r6 = X.AnonymousClass2BU.A00     // Catch:{ all -> 0x057c }
            java.lang.String r4 = "CONTACT_BIZ_PROFILES_PRICE_TIER"
            android.database.Cursor r7 = r11.A0E(r6, r4, r12)     // Catch:{ all -> 0x057c }
            java.lang.String r6 = X.AnonymousClass2BW.A00     // Catch:{ all -> 0x0570 }
            java.lang.String r4 = "CONTACT_BIZ_PROFILES_SERVICE_OFFERINGS"
            android.database.Cursor r4 = r11.A0E(r6, r4, r12)     // Catch:{ all -> 0x0570 }
            java.lang.String r10 = "SELECT sub_description, commands, prompts, commands_description, bot_description FROM wa_biz_profiles_bot_attributes WHERE wa_biz_profile_id = ?"
            java.lang.String r6 = "CONTACT_BIZ_PROFILES_BOT_ATTRIBUTES"
            android.database.Cursor r6 = r11.A0E(r10, r6, r12)     // Catch:{ all -> 0x0564 }
            if (r21 == 0) goto L_0x0252
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0558 }
        L_0x0239:
            boolean r10 = r21.moveToNext()     // Catch:{ all -> 0x0558 }
            if (r10 == 0) goto L_0x024a
            r11 = 0
            r10 = r21
            java.lang.String r10 = r10.getString(r11)     // Catch:{ all -> 0x0558 }
            r12.add(r10)     // Catch:{ all -> 0x0558 }
            goto L_0x0239
        L_0x024a:
            java.util.List r10 = r2.A0U     // Catch:{ all -> 0x0558 }
            r10.clear()     // Catch:{ all -> 0x0558 }
            r10.addAll(r12)     // Catch:{ all -> 0x0558 }
        L_0x0252:
            if (r1 == 0) goto L_0x02fa
            int r10 = r1.getCount()     // Catch:{ all -> 0x0558 }
            if (r10 <= 0) goto L_0x02fa
            int r10 = r1.getCount()     // Catch:{ all -> 0x0558 }
            java.util.ArrayList r13 = X.AnonymousClass002.A0I(r10)     // Catch:{ all -> 0x0558 }
            r18 = r8
            r17 = r8
        L_0x0266:
            boolean r10 = r1.moveToNext()     // Catch:{ all -> 0x0558 }
            if (r10 == 0) goto L_0x02e9
            boolean r10 = r1.isFirst()     // Catch:{ all -> 0x0558 }
            if (r10 == 0) goto L_0x027c
            r10 = 0
            java.lang.String r18 = r1.getString(r10)     // Catch:{ all -> 0x0558 }
            r10 = 1
            java.lang.String r17 = r1.getString(r10)     // Catch:{ all -> 0x0558 }
        L_0x027c:
            r10 = 2
            int r15 = r1.getInt(r10)     // Catch:{ all -> 0x0558 }
            r10 = 3
            int r14 = r1.getInt(r10)     // Catch:{ all -> 0x0558 }
            r11 = 4
            boolean r10 = r1.isNull(r11)     // Catch:{ all -> 0x0558 }
            if (r10 == 0) goto L_0x028f
            r12 = r8
            goto L_0x0297
        L_0x028f:
            int r10 = r1.getInt(r11)     // Catch:{ all -> 0x0558 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0558 }
        L_0x0297:
            r11 = 5
            boolean r10 = r1.isNull(r11)     // Catch:{ all -> 0x0558 }
            if (r10 == 0) goto L_0x029f
            goto L_0x02a8
        L_0x029f:
            int r10 = r1.getInt(r11)     // Catch:{ all -> 0x0558 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0558 }
            goto L_0x02a9
        L_0x02a8:
            r11 = r8
        L_0x02a9:
            if (r14 != 0) goto L_0x02df
            if (r12 == 0) goto L_0x02b0
            if (r11 == 0) goto L_0x02b0
            goto L_0x02df
        L_0x02b0:
            r10 = 6
            int r16 = r1.getInt(r10)     // Catch:{ all -> 0x0558 }
            X.4Fq r14 = r24.A0C()     // Catch:{ Exception -> 0x02d8 }
            java.lang.String r15 = "wa_biz_profiles_hours"
            java.lang.String r12 = "wa_biz_profiles_hours._id = ?"
            r10 = 1
            java.lang.String[] r11 = new java.lang.String[r10]     // Catch:{ all -> 0x02ce }
            java.lang.String r16 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x02ce }
            r10 = 0
            r11[r10] = r16     // Catch:{ all -> 0x02ce }
            X.AnonymousClass361.A08(r14, r15, r12, r11)     // Catch:{ all -> 0x02ce }
            r14.close()     // Catch:{ Exception -> 0x02d8 }
            goto L_0x0266
        L_0x02ce:
            r11 = move-exception
            r14.close()     // Catch:{ all -> 0x02d3 }
            goto L_0x02d7
        L_0x02d3:
            r10 = move-exception
            r11.addSuppressed(r10)     // Catch:{ Exception -> 0x02d8 }
        L_0x02d7:
            throw r11     // Catch:{ Exception -> 0x02d8 }
        L_0x02d8:
            r11 = move-exception
            java.lang.String r10 = "BusinessProfileStore/Error deleting business day config"
            com.whatsapp.util.Log.w(r10, r11)     // Catch:{ all -> 0x0558 }
            goto L_0x0266
        L_0x02df:
            X.7yB r10 = new X.7yB     // Catch:{ all -> 0x0558 }
            r10.<init>(r12, r11, r15, r14)     // Catch:{ all -> 0x0558 }
            r13.add(r10)     // Catch:{ all -> 0x0558 }
            goto L_0x0266
        L_0x02e9:
            int r10 = r13.size()     // Catch:{ all -> 0x0558 }
            if (r10 <= 0) goto L_0x02fa
            X.5dQ r12 = new X.5dQ     // Catch:{ all -> 0x0558 }
            r11 = r18
            r10 = r17
            r12.<init>(r11, r10, r13)     // Catch:{ all -> 0x0558 }
            r2.A03 = r12     // Catch:{ all -> 0x0558 }
        L_0x02fa:
            r14 = 1
            if (r9 == 0) goto L_0x032b
            int r10 = r9.getCount()     // Catch:{ all -> 0x0558 }
            if (r10 <= 0) goto L_0x032b
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0558 }
        L_0x0307:
            boolean r10 = r9.moveToNext()     // Catch:{ all -> 0x0558 }
            if (r10 == 0) goto L_0x0323
            r10 = 0
            java.lang.String r12 = r9.getString(r10)     // Catch:{ all -> 0x0558 }
            java.lang.String r11 = r9.getString(r14)     // Catch:{ all -> 0x0558 }
            if (r12 == 0) goto L_0x0307
            if (r11 == 0) goto L_0x0307
            X.7yh r10 = new X.7yh     // Catch:{ all -> 0x0558 }
            r10.<init>(r12, r11)     // Catch:{ all -> 0x0558 }
            r13.add(r10)     // Catch:{ all -> 0x0558 }
            goto L_0x0307
        L_0x0323:
            java.util.List r10 = r2.A0O     // Catch:{ all -> 0x0558 }
            r10.clear()     // Catch:{ all -> 0x0558 }
            r10.addAll(r13)     // Catch:{ all -> 0x0558 }
        L_0x032b:
            r11 = 1
            if (r0 == 0) goto L_0x039c
            int r10 = r0.getCount()     // Catch:{ all -> 0x0558 }
            if (r10 <= 0) goto L_0x039c
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0558 }
        L_0x0338:
            boolean r12 = r0.moveToNext()     // Catch:{ all -> 0x0558 }
            if (r12 == 0) goto L_0x0394
            r12 = 0
            java.lang.String r25 = r0.getString(r12)     // Catch:{ all -> 0x0558 }
            boolean r12 = r0.isNull(r11)     // Catch:{ all -> 0x0558 }
            r16 = 0
            if (r12 == 0) goto L_0x034d
            r15 = r8
            goto L_0x0355
        L_0x034d:
            int r12 = r0.getInt(r11)     // Catch:{ all -> 0x0558 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0558 }
        L_0x0355:
            r13 = 2
            boolean r12 = r0.isNull(r13)     // Catch:{ all -> 0x0558 }
            if (r12 == 0) goto L_0x035e
            r14 = r8
            goto L_0x0366
        L_0x035e:
            double r12 = r0.getDouble(r13)     // Catch:{ all -> 0x0558 }
            java.lang.Double r14 = java.lang.Double.valueOf(r12)     // Catch:{ all -> 0x0558 }
        L_0x0366:
            r13 = 3
            boolean r12 = r0.isNull(r13)     // Catch:{ all -> 0x0558 }
            if (r12 != 0) goto L_0x0375
            double r12 = r0.getDouble(r13)     // Catch:{ all -> 0x0558 }
            java.lang.Double r16 = java.lang.Double.valueOf(r12)     // Catch:{ all -> 0x0558 }
        L_0x0375:
            if (r25 == 0) goto L_0x0338
            if (r15 == 0) goto L_0x0338
            if (r14 == 0) goto L_0x0338
            if (r16 == 0) goto L_0x0338
            int r30 = r15.intValue()     // Catch:{ all -> 0x0558 }
            double r26 = r14.doubleValue()     // Catch:{ all -> 0x0558 }
            double r28 = r16.doubleValue()     // Catch:{ all -> 0x0558 }
            X.5dW r12 = new X.5dW     // Catch:{ all -> 0x0558 }
            r24 = r12
            r24.<init>(r25, r26, r28, r30)     // Catch:{ all -> 0x0558 }
            r10.add(r12)     // Catch:{ all -> 0x0558 }
            goto L_0x0338
        L_0x0394:
            java.util.List r11 = r2.A0T     // Catch:{ all -> 0x0558 }
            r11.clear()     // Catch:{ all -> 0x0558 }
            r11.addAll(r10)     // Catch:{ all -> 0x0558 }
        L_0x039c:
            if (r20 == 0) goto L_0x03c6
            int r10 = r20.getCount()     // Catch:{ all -> 0x0558 }
            if (r10 <= 0) goto L_0x03c6
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0558 }
            r12 = 0
        L_0x03a9:
            boolean r10 = r20.moveToNext()     // Catch:{ all -> 0x0558 }
            if (r10 == 0) goto L_0x03d3
            r10 = r20
            java.lang.String r11 = r10.getString(r12)     // Catch:{ all -> 0x0558 }
            if (r11 == 0) goto L_0x03a9
            java.lang.String r10 = "NULL"
            boolean r10 = r11.equals(r10)     // Catch:{ all -> 0x0558 }
            if (r10 == 0) goto L_0x03c0
            goto L_0x03c4
        L_0x03c0:
            r13.add(r11)     // Catch:{ all -> 0x0558 }
            goto L_0x03a9
        L_0x03c4:
            r10 = 0
            goto L_0x03ca
        L_0x03c6:
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0558 }
        L_0x03ca:
            r2.A0R = r8     // Catch:{ all -> 0x0558 }
            if (r10 == 0) goto L_0x03db
            java.util.ArrayList r10 = X.AnonymousClass002.A0J(r10)     // Catch:{ all -> 0x0558 }
            goto L_0x03d9
        L_0x03d3:
            r2.A0R = r8     // Catch:{ all -> 0x0558 }
            java.util.ArrayList r10 = X.AnonymousClass002.A0J(r13)     // Catch:{ all -> 0x0558 }
        L_0x03d9:
            r2.A0R = r10     // Catch:{ all -> 0x0558 }
        L_0x03db:
            r12 = 1
            if (r5 == 0) goto L_0x0429
            int r10 = r5.getCount()     // Catch:{ all -> 0x0558 }
            if (r10 <= 0) goto L_0x0429
            r18 = 0
        L_0x03e6:
            boolean r10 = r5.moveToNext()     // Catch:{ all -> 0x0558 }
            if (r10 == 0) goto L_0x0429
            r15 = 0
            java.lang.String r14 = r5.getString(r15)     // Catch:{ all -> 0x0558 }
            int r17 = r5.getInt(r12)     // Catch:{ all -> 0x0558 }
            r10 = 2
            java.lang.String r13 = r5.getString(r10)     // Catch:{ all -> 0x0558 }
            r10 = 3
            int r11 = r5.getInt(r10)     // Catch:{ all -> 0x0558 }
            r10 = 4
            int r10 = r5.getInt(r10)     // Catch:{ all -> 0x0558 }
            if (r10 != r12) goto L_0x0407
            r15 = 1
        L_0x0407:
            if (r14 == 0) goto L_0x0418
            if (r13 == 0) goto L_0x0418
            X.5dX r16 = new X.5dX     // Catch:{ all -> 0x0558 }
            r10 = r16
            r10.<init>(r14, r13, r11, r15)     // Catch:{ all -> 0x0558 }
            r10 = r17
            if (r10 != r12) goto L_0x041d
            r8 = r16
        L_0x0418:
            if (r18 != 0) goto L_0x041f
            if (r8 == 0) goto L_0x03e6
            goto L_0x041f
        L_0x041d:
            r18 = r16
        L_0x041f:
            X.7xy r11 = new X.7xy     // Catch:{ all -> 0x0558 }
            r10 = r18
            r11.<init>(r10, r8)     // Catch:{ all -> 0x0558 }
            r2.A05 = r11     // Catch:{ all -> 0x0558 }
            goto L_0x03e6
        L_0x0429:
            if (r19 == 0) goto L_0x044f
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0558 }
        L_0x042f:
            boolean r8 = r19.moveToNext()     // Catch:{ all -> 0x0558 }
            if (r8 == 0) goto L_0x0447
            r10 = 0
            r8 = r19
            java.lang.String r10 = r8.getString(r10)     // Catch:{ all -> 0x0558 }
            if (r10 == 0) goto L_0x042f
            X.7xt r8 = new X.7xt     // Catch:{ all -> 0x0558 }
            r8.<init>(r10)     // Catch:{ all -> 0x0558 }
            r11.add(r8)     // Catch:{ all -> 0x0558 }
            goto L_0x042f
        L_0x0447:
            java.util.List r8 = r2.A0Q     // Catch:{ all -> 0x0558 }
            r8.clear()     // Catch:{ all -> 0x0558 }
            r8.addAll(r11)     // Catch:{ all -> 0x0558 }
        L_0x044f:
            if (r7 == 0) goto L_0x0452
            goto L_0x0454
        L_0x0452:
            r12 = 0
            goto L_0x0474
        L_0x0454:
            boolean r8 = r7.moveToNext()     // Catch:{ all -> 0x0558 }
            if (r8 == 0) goto L_0x0452
            java.lang.String r8 = "_id"
            java.lang.String r11 = X.AnonymousClass0x2.A0Z(r7, r8)     // Catch:{ all -> 0x0558 }
            X.C162457s7.A0D(r11)     // Catch:{ all -> 0x0558 }
            java.lang.String r8 = "name"
            java.lang.String r10 = X.AnonymousClass0x2.A0Z(r7, r8)     // Catch:{ all -> 0x0558 }
            java.lang.String r8 = "symbol"
            java.lang.String r8 = X.AnonymousClass0x2.A0Z(r7, r8)     // Catch:{ all -> 0x0558 }
            X.7y6 r12 = new X.7y6     // Catch:{ all -> 0x0558 }
            r12.<init>(r11, r10, r8)     // Catch:{ all -> 0x0558 }
        L_0x0474:
            r2.A06 = r12     // Catch:{ all -> 0x0558 }
            r10 = 1
            if (r4 == 0) goto L_0x04be
            int r8 = r4.getCount()     // Catch:{ all -> 0x0558 }
            if (r8 <= 0) goto L_0x04be
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0558 }
        L_0x0483:
            boolean r11 = r4.moveToNext()     // Catch:{ all -> 0x0558 }
            if (r11 == 0) goto L_0x04bc
            java.lang.String r11 = "wa_biz_category_service_offerings_id"
            java.lang.String r14 = X.AnonymousClass0x2.A0Z(r4, r11)     // Catch:{ all -> 0x0558 }
            java.lang.String r11 = "is_offered"
            int r11 = X.AnonymousClass0x2.A04(r4, r11)     // Catch:{ all -> 0x0558 }
            boolean r16 = X.AnonymousClass000.A1U(r11, r10)
            java.lang.String r11 = "category_id"
            java.lang.String r13 = X.AnonymousClass0x2.A0Z(r4, r11)     // Catch:{ all -> 0x0558 }
            java.lang.String r11 = "category_name"
            java.lang.String r12 = X.AnonymousClass0x2.A0Z(r4, r11)     // Catch:{ all -> 0x0558 }
            java.lang.String r11 = "offering_name"
            java.lang.String r15 = X.AnonymousClass0x2.A0Z(r4, r11)     // Catch:{ all -> 0x0558 }
            if (r13 == 0) goto L_0x0483
            if (r12 == 0) goto L_0x0483
            if (r14 == 0) goto L_0x0483
            if (r15 == 0) goto L_0x0483
            X.5dd r11 = new X.5dd     // Catch:{ all -> 0x0558 }
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0558 }
            r8.add(r11)     // Catch:{ all -> 0x0558 }
            goto L_0x0483
        L_0x04bc:
            r2.A0N = r8     // Catch:{ all -> 0x0558 }
        L_0x04be:
            r8 = 0
            X.C162457s7.A0J(r6, r8)     // Catch:{ all -> 0x0558 }
            boolean r8 = r6.moveToNext()     // Catch:{ all -> 0x0558 }
            if (r8 == 0) goto L_0x051e
            java.lang.String r8 = "bot_description"
            java.lang.String r8 = X.AnonymousClass0x2.A0Z(r6, r8)     // Catch:{ all -> 0x0558 }
            r2.A0A = r8     // Catch:{ all -> 0x0558 }
            java.lang.String r8 = "sub_description"
            java.lang.String r8 = X.AnonymousClass0x2.A0Z(r6, r8)     // Catch:{ all -> 0x0558 }
            r2.A0K = r8     // Catch:{ all -> 0x0558 }
            java.lang.String r8 = "commands"
            java.lang.String r8 = X.AnonymousClass0x2.A0Z(r6, r8)     // Catch:{ all -> 0x0558 }
            java.util.List r11 = X.C57032sx.A01(r8)     // Catch:{ all -> 0x0558 }
            boolean r8 = X.C18310x6.A1X(r11)     // Catch:{ all -> 0x0558 }
            if (r8 == 0) goto L_0x04f7
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0558 }
            r10.addAll(r11)     // Catch:{ all -> 0x0558 }
            java.util.List r8 = r2.A0P     // Catch:{ all -> 0x0558 }
            r8.clear()     // Catch:{ all -> 0x0558 }
            r8.addAll(r10)     // Catch:{ all -> 0x0558 }
        L_0x04f7:
            java.lang.String r8 = "prompts"
            java.lang.String r8 = X.AnonymousClass0x2.A0Z(r6, r8)     // Catch:{ all -> 0x0558 }
            java.util.List r11 = X.C57042sy.A01(r8)     // Catch:{ all -> 0x0558 }
            boolean r8 = X.C18310x6.A1X(r11)     // Catch:{ all -> 0x0558 }
            if (r8 == 0) goto L_0x0516
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0558 }
            r10.addAll(r11)     // Catch:{ all -> 0x0558 }
            java.util.List r8 = r2.A0S     // Catch:{ all -> 0x0558 }
            r8.clear()     // Catch:{ all -> 0x0558 }
            r8.addAll(r10)     // Catch:{ all -> 0x0558 }
        L_0x0516:
            java.lang.String r8 = "commands_description"
            java.lang.String r8 = X.AnonymousClass0x2.A0Z(r6, r8)     // Catch:{ all -> 0x0558 }
            r2.A0C = r8     // Catch:{ all -> 0x0558 }
        L_0x051e:
            r6.close()     // Catch:{ all -> 0x0564 }
            if (r4 == 0) goto L_0x0526
            r4.close()     // Catch:{ all -> 0x0570 }
        L_0x0526:
            if (r7 == 0) goto L_0x052b
            r7.close()     // Catch:{ all -> 0x057c }
        L_0x052b:
            if (r19 == 0) goto L_0x0530
            r19.close()     // Catch:{ all -> 0x0588 }
        L_0x0530:
            if (r5 == 0) goto L_0x0535
            r5.close()     // Catch:{ all -> 0x0594 }
        L_0x0535:
            if (r20 == 0) goto L_0x053a
            r20.close()     // Catch:{ all -> 0x05a0 }
        L_0x053a:
            if (r0 == 0) goto L_0x053f
            r0.close()     // Catch:{ all -> 0x05ac }
        L_0x053f:
            if (r9 == 0) goto L_0x0544
            r9.close()     // Catch:{ all -> 0x05b8 }
        L_0x0544:
            if (r1 == 0) goto L_0x0549
            r1.close()     // Catch:{ all -> 0x05c4 }
        L_0x0549:
            if (r21 == 0) goto L_0x054e
            r21.close()     // Catch:{ all -> 0x05d0 }
        L_0x054e:
            r22.close()     // Catch:{ all -> 0x05e1 }
            r3.close()     // Catch:{ all -> 0x05ed }
            r23.close()
            return r2
        L_0x0558:
            r8 = move-exception
            if (r6 == 0) goto L_0x0563
            r6.close()     // Catch:{ all -> 0x055f }
            goto L_0x0563
        L_0x055f:
            r2 = move-exception
            r8.addSuppressed(r2)     // Catch:{ all -> 0x0564 }
        L_0x0563:
            throw r8     // Catch:{ all -> 0x0564 }
        L_0x0564:
            r6 = move-exception
            if (r4 == 0) goto L_0x056f
            r4.close()     // Catch:{ all -> 0x056b }
            goto L_0x056f
        L_0x056b:
            r2 = move-exception
            r6.addSuppressed(r2)     // Catch:{ all -> 0x0570 }
        L_0x056f:
            throw r6     // Catch:{ all -> 0x0570 }
        L_0x0570:
            r4 = move-exception
            if (r7 == 0) goto L_0x057b
            r7.close()     // Catch:{ all -> 0x0577 }
            goto L_0x057b
        L_0x0577:
            r2 = move-exception
            r4.addSuppressed(r2)     // Catch:{ all -> 0x057c }
        L_0x057b:
            throw r4     // Catch:{ all -> 0x057c }
        L_0x057c:
            r4 = move-exception
            if (r19 == 0) goto L_0x0587
            r19.close()     // Catch:{ all -> 0x0583 }
            goto L_0x0587
        L_0x0583:
            r2 = move-exception
            r4.addSuppressed(r2)     // Catch:{ all -> 0x0588 }
        L_0x0587:
            throw r4     // Catch:{ all -> 0x0588 }
        L_0x0588:
            r4 = move-exception
            if (r5 == 0) goto L_0x0593
            r5.close()     // Catch:{ all -> 0x058f }
            goto L_0x0593
        L_0x058f:
            r2 = move-exception
            r4.addSuppressed(r2)     // Catch:{ all -> 0x0594 }
        L_0x0593:
            throw r4     // Catch:{ all -> 0x0594 }
        L_0x0594:
            r4 = move-exception
            if (r20 == 0) goto L_0x059f
            r20.close()     // Catch:{ all -> 0x059b }
            goto L_0x059f
        L_0x059b:
            r2 = move-exception
            r4.addSuppressed(r2)     // Catch:{ all -> 0x05a0 }
        L_0x059f:
            throw r4     // Catch:{ all -> 0x05a0 }
        L_0x05a0:
            r2 = move-exception
            if (r0 == 0) goto L_0x05ab
            r0.close()     // Catch:{ all -> 0x05a7 }
            goto L_0x05ab
        L_0x05a7:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ all -> 0x05ac }
        L_0x05ab:
            throw r2     // Catch:{ all -> 0x05ac }
        L_0x05ac:
            r2 = move-exception
            if (r9 == 0) goto L_0x05b7
            r9.close()     // Catch:{ all -> 0x05b3 }
            goto L_0x05b7
        L_0x05b3:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ all -> 0x05b8 }
        L_0x05b7:
            throw r2     // Catch:{ all -> 0x05b8 }
        L_0x05b8:
            r2 = move-exception
            if (r1 == 0) goto L_0x05c3
            r1.close()     // Catch:{ all -> 0x05bf }
            goto L_0x05c3
        L_0x05bf:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ all -> 0x05c4 }
        L_0x05c3:
            throw r2     // Catch:{ all -> 0x05c4 }
        L_0x05c4:
            r1 = move-exception
            if (r21 == 0) goto L_0x05cf
            r21.close()     // Catch:{ all -> 0x05cb }
            goto L_0x05cf
        L_0x05cb:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x05d0 }
        L_0x05cf:
            throw r1     // Catch:{ all -> 0x05d0 }
        L_0x05d0:
            r1 = move-exception
            r22.close()     // Catch:{ all -> 0x05d5 }
            goto L_0x05d9
        L_0x05d5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x05e1 }
        L_0x05d9:
            throw r1     // Catch:{ all -> 0x05e1 }
        L_0x05da:
            r3.close()     // Catch:{ all -> 0x05ed }
            r23.close()
            return r8
        L_0x05e1:
            r1 = move-exception
            if (r3 == 0) goto L_0x05ec
            r3.close()     // Catch:{ all -> 0x05e8 }
            goto L_0x05ec
        L_0x05e8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x05ed }
        L_0x05ec:
            throw r1     // Catch:{ all -> 0x05ed }
        L_0x05ed:
            r1 = move-exception
            r23.close()     // Catch:{ all -> 0x05f2 }
            throw r1
        L_0x05f2:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass56I.A01(com.whatsapp.jid.UserJid):X.5Wt");
    }

    public void A03(UserJid userJid) {
        if (userJid == null) {
            Log.w("contact-mgr-db/cannot delete business profile details by null jid");
            return;
        }
        C85284Fq A0C = this.A00.A0C();
        try {
            AnonymousClass361.A08(A0C, "wa_biz_profiles", "wa_biz_profiles.jid = ?", C18270x1.A1a(userJid));
            A0C.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public AnonymousClass56I(AnonymousClass1RI r1) {
        super(r1);
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:14:0x0034=Splitter:B:14:0x0034, B:18:0x003b=Splitter:B:18:0x003b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(com.whatsapp.jid.UserJid r8) {
        /*
            r7 = this;
            java.lang.String r6 = r8.getRawString()
            X.1RI r0 = r7.A00
            X.4GK r5 = r0.get()
            java.lang.String r2 = "SELECT automated_type FROM wa_biz_profiles WHERE jid = ?"
            r4 = 1
            java.lang.String[] r1 = new java.lang.String[r4]     // Catch:{ all -> 0x004e }
            r3 = 0
            r1[r3] = r6     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "CONTACT_BUSINESS_AUTOMATED_TYPE"
            android.database.Cursor r2 = X.AnonymousClass361.A0A(r5, r2, r0, r1)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "automated_type"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0042 }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x003b
            boolean r0 = r2.isNull(r1)     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x003b
            int r0 = r2.getInt(r1)     // Catch:{ all -> 0x0042 }
            if (r0 == r4) goto L_0x0034
            r4 = 2
            if (r0 == r4) goto L_0x0034
            goto L_0x003b
        L_0x0034:
            r2.close()     // Catch:{ all -> 0x004e }
            r5.close()
            return r4
        L_0x003b:
            r2.close()     // Catch:{ all -> 0x004e }
            r5.close()
            return r3
        L_0x0042:
            r1 = move-exception
            if (r2 == 0) goto L_0x004d
            r2.close()     // Catch:{ all -> 0x0049 }
            goto L_0x004d
        L_0x0049:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x004e }
        L_0x004d:
            throw r1     // Catch:{ all -> 0x004e }
        L_0x004e:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0053 }
            throw r1
        L_0x0053:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass56I.A00(com.whatsapp.jid.UserJid):int");
    }

    public final void A02(ContentValues contentValues, C108775dX r4, C85284Fq r5, int i, long j) {
        contentValues.clear();
        C18270x1.A0c(contentValues, "wa_biz_profile_id", j);
        contentValues.put("account_id", r4.A02);
        C18270x1.A0b(contentValues, "account_type", i);
        contentValues.put("account_display_name", r4.A01);
        contentValues.put("account_fan_count", Integer.valueOf(r4.A00));
        contentValues.put("account_has_media_post", Boolean.valueOf(r4.A03));
        AnonymousClass361.A06(contentValues, r5, "wa_biz_profiles_linked_accounts_table");
    }

    public void A04(Map map) {
        C69833Yo Axl;
        C108985dt r0;
        C108775dX r6;
        ContentValues A06 = AnonymousClass0x9.A06();
        C85284Fq A0C = this.A00.A0C();
        try {
            Axl = A0C.Axl();
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                UserJid userJid = (UserJid) A0w.getKey();
                C105875Wt A01 = A01(userJid);
                if (A01 != null) {
                    r0 = A01.A01();
                } else {
                    r0 = null;
                }
                C108985dt r10 = (C108985dt) A0w.getValue();
                if (r0 == null) {
                    if (r10 == null) {
                    }
                } else if (r10 != null && r0.equals(r10)) {
                }
                C626936e.A06(userJid);
                A03(userJid);
                if (r10 != null) {
                    A06.clear();
                    A06.put("jid", userJid.getRawString());
                    A06.put("tag", r10.A0L);
                    C108805da r5 = r10.A07;
                    A06.put("address", r5.A03);
                    A06.put("address_postal_code", r5.A02);
                    C108615dH r52 = r5.A00;
                    A06.put("address_city_id", r52.A00);
                    A06.put("address_city_name", r52.A01);
                    A06.put("business_description", r10.A0G);
                    A06.put("email", r10.A0H);
                    A06.put("latitude", r52.A02);
                    A06.put("longitude", r52.A03);
                    A06.put("vertical", r10.A0M);
                    AnonymousClass0x2.A0o(A06, "has_catalog", r10.A0Y);
                    C108705dQ r11 = r10.A03;
                    if (r11 != null) {
                        A06.put("time_zone", r11.A01);
                        A06.put("hours_note", r11.A00);
                    }
                    A06.put("commerce_experience", r10.A0D);
                    A06.put("shop_url", r10.A0J);
                    AnonymousClass0x2.A0o(A06, "cart_enabled", r10.A0W);
                    A06.put("commerce_manager_url", r10.A0E);
                    AnonymousClass0x2.A0o(A06, "direct_connection_enabled", r10.A0X);
                    AnonymousClass0x2.A0o(A06, "is_shop_banned", r10.A0c);
                    AnonymousClass0x2.A0o(A06, "is_responsive", r10.A0b);
                    A06.put("business_blocked_status", r10.A0B);
                    C166057y4 r53 = r10.A02;
                    if (r53 != null) {
                        A06.put("default_postcode", r53.A00);
                        A06.put("location_name", r53.A01);
                        A06.put("postcode_type", r53.A02);
                    }
                    AnonymousClass0x2.A0o(A06, "galaxy_business_enabled", r10.A0Z);
                    A06.put("custom_url", r10.A0F);
                    C166137yC r54 = r10.A04;
                    if (r54 != null) {
                        A06.put("cover_photo_url", r54.A03);
                        A06.put("cover_photo_id", r54.A00);
                    }
                    A06.put("member_since", r10.A0I);
                    AnonymousClass0x2.A0o(A06, "capi_calling_enabled", r10.A0V);
                    C166077y6 r7 = r10.A06;
                    if (r7 != null) {
                        A06.put("price_tier_id", r7.A00);
                    }
                    A06.put("survey_sampling_rate", r10.A09);
                    AnonymousClass0x2.A0o(A06, "is_offerings_eligible", r10.A0a);
                    C18270x1.A0b(A06, "automated_type", r10.A00);
                    C18270x1.A0b(A06, "welcome_message_protocol_mode", AnonymousClass000.A1S(r10.A0d ? 1 : 0) ? 1 : 0);
                    long A062 = AnonymousClass361.A06(A06, A0C, "wa_biz_profiles");
                    List list = r10.A0U;
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            String A0m = AnonymousClass001.A0m(it);
                            A06.clear();
                            A06.put("websites", A0m);
                            C18270x1.A0c(A06, "wa_biz_profile_id", A062);
                            AnonymousClass361.A06(A06, A0C, "wa_biz_profiles_websites");
                        }
                    }
                    List<C166447yh> list2 = r10.A0O;
                    if (!list2.isEmpty()) {
                        for (C166447yh r8 : list2) {
                            if (r8 != null) {
                                A06.clear();
                                A06.put("category_id", r8.A00);
                                A06.put("category_name", r8.A01);
                                C18270x1.A0c(A06, "wa_biz_profile_id", A062);
                                AnonymousClass361.A06(A06, A0C, "wa_biz_profiles_categories");
                            }
                        }
                    }
                    if (r11 != null) {
                        for (C166127yB r82 : r11.A02) {
                            A06.clear();
                            C18270x1.A0b(A06, "day_of_week", r82.A00);
                            C18270x1.A0b(A06, "mode", r82.A01);
                            A06.put("open_time", r82.A03);
                            A06.put("close_time", r82.A02);
                            C18270x1.A0c(A06, "wa_biz_profile_id", A062);
                            AnonymousClass361.A06(A06, A0C, "wa_biz_profiles_hours");
                        }
                    }
                    C165997xy r83 = r10.A05;
                    if (!(r83 == null || ((r6 = r83.A00) == null && r83.A01 == null))) {
                        C108775dX r55 = r83.A01;
                        if (r6 != null) {
                            A02(A06, r6, A0C, 0, A062);
                        }
                        if (r55 != null) {
                            A02(A06, r55, A0C, 1, A062);
                        }
                    }
                    List<C108765dW> list3 = r10.A0T;
                    if (!list3.isEmpty()) {
                        for (C108765dW r84 : list3) {
                            if (r84 != null) {
                                A06.clear();
                                A06.put("area_description", r84.A03);
                                A06.put("radius", Integer.valueOf(r84.A02));
                                A06.put("center_latitude", Double.valueOf(r84.A00));
                                A06.put("center_longitude", Double.valueOf(r84.A01));
                                C18270x1.A0c(A06, "wa_biz_profile_id", A062);
                                AnonymousClass361.A06(A06, A0C, "wa_biz_profiles_service_areas");
                            }
                        }
                    }
                    List list4 = r10.A0Q;
                    if (list4 == null) {
                        A06.clear();
                        A06.put("country_code", "NULL");
                        C18270x1.A0c(A06, "wa_biz_profile_id", A062);
                        AnonymousClass361.A06(A06, A0C, "wa_biz_profiles_direct_connection_allowed_country_codes");
                    } else {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            String A0m2 = AnonymousClass001.A0m(it2);
                            if (A0m2 != null) {
                                A06.clear();
                                A06.put("country_code", A0m2);
                                C18270x1.A0c(A06, "wa_biz_profile_id", A062);
                                AnonymousClass361.A06(A06, A0C, "wa_biz_profiles_direct_connection_allowed_country_codes");
                            }
                        }
                    }
                    for (C165947xt r56 : r10.A0R) {
                        if (r56 != null) {
                            A06.clear();
                            A06.put("catalog_feature_type", r56.A00);
                            C18270x1.A0c(A06, "wa_biz_profile_id", A062);
                            AnonymousClass361.A06(A06, A0C, "wa_biz_profiles_dc_enabled_features");
                        }
                    }
                    if (r7 != null) {
                        C626936e.A0C(((AnonymousClass3H0) A0C).A03.A00.inTransaction());
                        A06.clear();
                        String str = r7.A00;
                        A06.put("_id", str);
                        A06.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r7.A01);
                        A06.put("symbol", r7.A02);
                        if (AnonymousClass361.A07(A06, A0C, "wa_biz_profiles_price_tiers", "_id=?", C18270x1.A1b(str)) == 0) {
                            AnonymousClass361.A06(A06, A0C, "wa_biz_profiles_price_tiers");
                        }
                    }
                    List<C108835dd> list5 = r10.A0N;
                    if (!list5.isEmpty()) {
                        C626936e.A0C(((AnonymousClass3H0) A0C).A03.A00.inTransaction());
                        A06.clear();
                        for (C108835dd r14 : list5) {
                            if (r14 != null) {
                                A06.clear();
                                A06.put("category_id", r14.A00);
                                A06.put("category_name", r14.A01);
                                String str2 = r14.A03;
                                A06.put("_id", str2);
                                A06.put("offering_name", r14.A02);
                                if (AnonymousClass361.A07(A06, A0C, "wa_biz_category_service_offerings", "_id=?", C18270x1.A1b(str2)) == 0) {
                                    AnonymousClass361.A06(A06, A0C, "wa_biz_category_service_offerings");
                                }
                                A06.clear();
                                A06.put("is_offered", Boolean.valueOf(r14.A04));
                                C18270x1.A0c(A06, "wa_biz_profile_id", A062);
                                A06.put("wa_biz_category_service_offerings_id", str2);
                                String[] A1a = C18300x5.A1a(str2, 2);
                                AnonymousClass0x2.A1S(A1a, 1, A062);
                                if (AnonymousClass361.A07(A06, A0C, "wa_biz_profile_to_service_offerings", "wa_biz_category_service_offerings_id=? = ? AND wa_biz_profile_id = ?", A1a) == 0) {
                                    AnonymousClass361.A06(A06, A0C, "wa_biz_profile_to_service_offerings");
                                }
                            }
                        }
                    }
                    String str3 = r10.A0A;
                    if (!TextUtils.isEmpty(str3) || !TextUtils.isEmpty(r10.A0K) || !TextUtils.isEmpty(r10.A0C) || !r10.A0P.isEmpty() || !r10.A0S.isEmpty()) {
                        String str4 = r10.A0K;
                        String str5 = r10.A0C;
                        List list6 = r10.A0P;
                        List list7 = r10.A0S;
                        A06.clear();
                        C18270x1.A0c(A06, "wa_biz_profile_id", A062);
                        if (!TextUtils.isEmpty(str3)) {
                            A06.put("bot_description", str3);
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            A06.put("sub_description", str4);
                        }
                        if (!TextUtils.isEmpty(str5)) {
                            A06.put("commands_description", str5);
                        }
                        A06.put("commands", C57032sx.A00(list6));
                        A06.put("prompts", C57042sy.A00(list7));
                        AnonymousClass361.A06(A06, A0C, "wa_biz_profiles_bot_attributes");
                    }
                }
            }
            Axl.A00();
            Axl.close();
            A0C.close();
            return;
        } catch (Throwable th) {
            try {
                A0C.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }
}
