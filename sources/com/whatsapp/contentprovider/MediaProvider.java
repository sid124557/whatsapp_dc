package com.whatsapp.contentprovider;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass29L;
import X.AnonymousClass306;
import X.AnonymousClass314;
import X.AnonymousClass319;
import X.AnonymousClass39W;
import X.AnonymousClass3H0;
import X.AnonymousClass4DV;
import X.AnonymousClass4GK;
import X.AnonymousClass5ZU;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18320x8;
import X.C18330xA;
import X.C18530xp;
import X.C30471mV;
import X.C30791n7;
import X.C48042eF;
import X.C54292oU;
import X.C55122pp;
import X.C55682qk;
import X.C55832qz;
import X.C56612sH;
import X.C56862sg;
import X.C614630w;
import X.C624134x;
import X.C626936e;
import X.C64393Dh;
import X.C64773Ex;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MediaProvider extends C18530xp {
    public static UriMatcher A0A;
    public static final String A0B;
    public static final String A0C;
    public static final String A0D = AnonymousClass000.A0X(".provider.media.items", AnonymousClass000.A0m("vnd.android.cursor.dir/vnd.", "com.whatsapp"));
    public static final String[] A0E = {"_display_name", "_size"};
    public Context A00;
    public C64393Dh A01;
    public C64773Ex A02;
    public AnonymousClass5ZU A03;
    public AnonymousClass314 A04;
    public C56612sH A05;
    public AnonymousClass319 A06;
    public C48042eF A07;
    public C55832qz A08;
    public AnonymousClass306 A09;

    public static synchronized UriMatcher A04() {
        UriMatcher uriMatcher;
        synchronized (MediaProvider.class) {
            if (A0A == null) {
                UriMatcher uriMatcher2 = new UriMatcher(-1);
                A0A = uriMatcher2;
                String str = A0B;
                uriMatcher2.addURI(str, "buckets", 1);
                A0A.addURI(str, "items", 2);
                A0A.addURI(str, "item/*", 3);
                A0A.addURI(str, "gdpr_report", 4);
                A0A.addURI(str, "channels_gdpr_report", 13);
                A0A.addURI(str, "personal_dyi_report", 6);
                A0A.addURI(str, "business_dyi_report", 11);
                A0A.addURI(str, "business_activity_report", 7);
                A0A.addURI(str, "export_chat/*/*", 5);
                A0A.addURI(str, "thumbnail/*", 8);
                A0A.addURI(str, "export/*", 9);
                A0A.addURI(str, "devdebuginfo/*", 12);
                A0A.addURI(str, "support", 10);
            }
            uriMatcher = A0A;
        }
        return uriMatcher;
    }

    public static final String A07(Uri uri) {
        String queryParameter = uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (queryParameter != null) {
            return queryParameter;
        }
        throw AnonymousClass000.A0E(uri, "Unknown URI ", AnonymousClass001.A0o());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0079 A[Catch:{ all -> 0x010f, all -> 0x01b2 }, LOOP:0: B:13:0x0077->B:14:0x0079, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor query(android.net.Uri r18, java.lang.String[] r19, java.lang.String r20, java.lang.String[] r21, java.lang.String r22) {
        /*
            r17 = this;
            r5 = r19
            r4 = r17
            r4.A08()
            android.content.UriMatcher r0 = A04()
            r6 = r18
            int r0 = r0.match(r6)
            switch(r0) {
                case 1: goto L_0x001f;
                case 2: goto L_0x002b;
                case 3: goto L_0x0114;
                case 4: goto L_0x01f3;
                case 5: goto L_0x0219;
                case 6: goto L_0x02e2;
                case 7: goto L_0x01cc;
                case 8: goto L_0x0014;
                case 9: goto L_0x0014;
                case 10: goto L_0x02f9;
                case 11: goto L_0x031d;
                case 12: goto L_0x0333;
                case 13: goto L_0x033e;
                default: goto L_0x0014;
            }
        L_0x0014:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown URI "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0E(r6, r0, r1)
            throw r0
        L_0x001f:
            X.3Ex r3 = r4.A02
            X.5ZU r2 = r4.A03
            X.314 r1 = r4.A04
            X.0xw r0 = new X.0xw
            r0.<init>(r3, r2, r1)
            return r0
        L_0x002b:
            java.lang.String r0 = "bucketId"
            java.lang.String r0 = r6.getQueryParameter(r0)
            X.4uZ r5 = X.C18310x6.A0S(r0)
            X.C626936e.A06(r5)
            java.lang.String r0 = "include"
            java.lang.String r8 = r6.getQueryParameter(r0)
            r6 = 13
            java.lang.Byte r10 = java.lang.Byte.valueOf(r6)
            r9 = 2
            r7 = 0
            r11 = 3
            java.lang.Byte r3 = java.lang.Byte.valueOf(r11)
            r1 = 1
            java.lang.Byte r2 = java.lang.Byte.valueOf(r1)
            if (r8 == 0) goto L_0x0059
            int r0 = r8.hashCode()
            switch(r0) {
                case -1185250696: goto L_0x00cf;
                case 102340: goto L_0x00e0;
                case 112202875: goto L_0x00f7;
                default: goto L_0x0059;
            }
        L_0x0059:
            X.2qz r6 = r4.A08
            X.319 r8 = r4.A06
            java.lang.Byte[] r12 = new java.lang.Byte[r11]
            r12[r7] = r2
            r12[r1] = r3
            r12[r9] = r10
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediamsgstore/getMediaMessagesByTypesCursor:"
            X.C18260x0.A1P(r2, r0, r5)
            X.4GK r4 = X.AnonymousClass319.A00(r8)
            java.util.ArrayList r9 = X.AnonymousClass002.A0I(r11)     // Catch:{ all -> 0x010f }
            r10 = 0
        L_0x0077:
            if (r10 >= r11) goto L_0x008d
            r3 = r12[r10]     // Catch:{ all -> 0x010f }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x010f }
            java.lang.String r0 = "'"
            r2.append(r0)     // Catch:{ all -> 0x010f }
            r2.append(r3)     // Catch:{ all -> 0x010f }
            X.C18270x1.A1D(r0, r2, r9)     // Catch:{ all -> 0x010f }
            int r10 = r10 + 1
            goto L_0x0077
        L_0x008d:
            java.lang.String r0 = "SELECT "
            java.lang.StringBuilder r2 = X.C18330xA.A0A(r0)     // Catch:{ all -> 0x010f }
            java.lang.String r0 = X.AnonymousClass2C5.A01     // Catch:{ all -> 0x010f }
            X.AnonymousClass0x2.A1O(r2, r0)     // Catch:{ all -> 0x010f }
            java.lang.String r0 = "available_message_view"
            r2.append(r0)     // Catch:{ all -> 0x010f }
            java.lang.String r0 = " WHERE message_type IN ("
            r2.append(r0)     // Catch:{ all -> 0x010f }
            java.lang.String r0 = ","
            X.C18310x6.A1G(r0, r9, r2)     // Catch:{ all -> 0x010f }
            java.lang.String r0 = ")"
            r2.append(r0)     // Catch:{ all -> 0x010f }
            java.lang.String r0 = " AND "
            r2.append(r0)     // Catch:{ all -> 0x010f }
            java.lang.String r0 = "chat_row_id  = ?"
            r2.append(r0)     // Catch:{ all -> 0x010f }
            java.lang.String r0 = " ORDER BY _id DESC"
            java.lang.String r3 = X.AnonymousClass000.A0X(r0, r2)     // Catch:{ all -> 0x010f }
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x010f }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x010f }
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x010f }
            X.2sm r0 = r8.A04     // Catch:{ all -> 0x010f }
            X.C56922sm.A02(r0, r5, r1, r7)     // Catch:{ all -> 0x010f }
            java.lang.String r0 = "GET_MEDIA_MESSAGES_BY_TYPES"
            android.database.Cursor r1 = X.C56862sg.A00(r4, r2, r3, r0, r1)     // Catch:{ all -> 0x010f }
            goto L_0x0108
        L_0x00cf:
            java.lang.String r0 = "images"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0059
            X.2qz r6 = r4.A08
            X.319 r0 = r4.A06
            android.database.Cursor r1 = r0.A03(r5, r1)
            goto L_0x0108
        L_0x00e0:
            java.lang.String r0 = "gif"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0059
            X.2qz r2 = r4.A08
            X.319 r0 = r4.A06
            android.database.Cursor r1 = r0.A03(r5, r6)
            r0 = 0
            X.4Lb r3 = new X.4Lb
            r3.<init>(r1, r0, r5, r2)
            return r3
        L_0x00f7:
            java.lang.String r0 = "video"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0059
            X.2qz r6 = r4.A08
            X.319 r0 = r4.A06
            android.database.Cursor r1 = r0.A03(r5, r11)
        L_0x0108:
            r0 = 0
            X.4Lb r3 = new X.4Lb
            r3.<init>(r1, r0, r5, r6)
            return r3
        L_0x010f:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x01b2 }
            throw r1
        L_0x0114:
            if (r19 != 0) goto L_0x0118
            java.lang.String[] r5 = A0E
        L_0x0118:
            X.2eF r1 = r4.A07
            java.lang.String r0 = r6.getLastPathSegment()
            java.lang.String r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x019f
            java.io.File r15 = X.AnonymousClass002.A0B(r0)
        L_0x0128:
            int r9 = r5.length
            java.lang.String[] r8 = new java.lang.String[r9]
            java.lang.Object[] r7 = new java.lang.Object[r9]
            r2 = 0
            r3 = 0
        L_0x012f:
            if (r2 >= r9) goto L_0x01b7
            r10 = r5[r2]
            java.lang.String r1 = "_display_name"
            boolean r0 = r1.equals(r10)
            if (r0 == 0) goto L_0x017c
            r8[r3] = r1
            int r14 = r3 + 1
            X.2eF r0 = r4.A07
            java.lang.String r1 = r6.getLastPathSegment()
            X.1RC r0 = r0.A00
            X.4GK r13 = r0.get()
            r0 = r13
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x01ad }
            X.2sg r12 = r0.A03     // Catch:{ all -> 0x01ad }
            java.lang.String r11 = "SELECT display_name FROM shared_media_ids WHERE item_uuid =?AND expiration_timestamp >?"
            r0 = 2
            java.lang.String[] r10 = X.C18300x5.A1a(r1, r0)     // Catch:{ all -> 0x01ad }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01ad }
            X.C18270x1.A1R(r10, r0)     // Catch:{ all -> 0x01ad }
            java.lang.String r0 = "SharedMediaIdsStore/getDisplayNameByUUID"
            android.database.Cursor r10 = r12.A0E(r11, r0, r10)     // Catch:{ all -> 0x01ad }
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x01a1 }
            if (r0 != 0) goto L_0x0172
            r10.close()     // Catch:{ all -> 0x01ad }
            r13.close()
            r0 = 0
            goto L_0x0199
        L_0x0172:
            java.lang.String r0 = "display_name"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r10, r0)     // Catch:{ all -> 0x01a1 }
            r10.close()     // Catch:{ all -> 0x01ad }
            goto L_0x0196
        L_0x017c:
            java.lang.String r1 = "_size"
            boolean r0 = r1.equals(r10)
            if (r0 == 0) goto L_0x019c
            r8[r3] = r1
            int r14 = r3 + 1
            if (r15 != 0) goto L_0x0191
            r0 = 0
        L_0x018c:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0199
        L_0x0191:
            long r0 = r15.length()
            goto L_0x018c
        L_0x0196:
            r13.close()
        L_0x0199:
            r7[r3] = r0
            r3 = r14
        L_0x019c:
            int r2 = r2 + 1
            goto L_0x012f
        L_0x019f:
            r15 = 0
            goto L_0x0128
        L_0x01a1:
            r1 = move-exception
            if (r10 == 0) goto L_0x01ac
            r10.close()     // Catch:{ all -> 0x01a8 }
            goto L_0x01ac
        L_0x01a8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01ad }
        L_0x01ac:
            throw r1     // Catch:{ all -> 0x01ad }
        L_0x01ad:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x01b2 }
            throw r1
        L_0x01b2:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x01b7:
            java.lang.String[] r2 = new java.lang.String[r3]
            r0 = 0
            java.lang.System.arraycopy(r8, r0, r2, r0, r3)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.System.arraycopy(r7, r0, r1, r0, r3)
            r0 = 1
            android.database.MatrixCursor r3 = new android.database.MatrixCursor
            r3.<init>(r2, r0)
            r3.addRow(r1)
            return r3
        L_0x01cc:
            X.3Dh r0 = r4.A01
            java.lang.String r3 = A07(r6)
            X.2oU r0 = r0.A01
            java.io.File r1 = X.C54292oU.A02(r0)
            java.lang.String r0 = "export_business_activity"
            java.io.File r2 = X.C64393Dh.A02(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)
            java.lang.String r0 = ".zip"
            java.io.File r3 = X.C64393Dh.A05(r2, r0, r1)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            android.content.Context r1 = r4.A00
            r0 = 2131891570(0x7f121572, float:1.9417864E38)
            goto L_0x035b
        L_0x01f3:
            X.3Dh r1 = r4.A01
            java.lang.String r0 = A07(r6)
            java.io.File r1 = r1.A0C()
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r0)
            java.lang.String r7 = ".zip"
            java.io.File r3 = X.C64393Dh.A05(r1, r7, r0)
            r2 = 2131889539(0x7f120d83, float:1.9413744E38)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            android.content.Context r0 = r4.A00
            X.AnonymousClass0x2.A0s(r0, r1, r2)
            java.lang.String r0 = X.AnonymousClass000.A0X(r7, r1)
            goto L_0x0364
        L_0x0219:
            java.util.List r2 = r6.getPathSegments()
            int r1 = r2.size()
            r0 = 2
            if (r1 < r0) goto L_0x02d7
            int r0 = X.AnonymousClass002.A04(r2, r0)
            java.lang.Object r1 = r2.get(r0)
            java.lang.Object r0 = X.C18300x5.A0c(r2)
            android.util.Pair r9 = android.util.Pair.create(r1, r0)
            if (r9 == 0) goto L_0x02d7
            if (r19 != 0) goto L_0x023a
            java.lang.String[] r5 = A0E
        L_0x023a:
            int r10 = r5.length
            java.lang.String[] r8 = new java.lang.String[r10]
            java.lang.Object[] r7 = new java.lang.Object[r10]
            r6 = 0
            r3 = 0
        L_0x0241:
            r15 = 1
            if (r6 >= r10) goto L_0x02c3
            r2 = r5[r6]
            java.lang.String r1 = "_display_name"
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L_0x0283
            r8[r3] = r1
            java.lang.Object r0 = r9.first
            java.lang.String r0 = (java.lang.String) r0
            X.4uZ r0 = X.C18310x6.A0S(r0)
            java.lang.String r12 = ".txt"
            if (r0 == 0) goto L_0x02ac
            int r16 = r3 + 1
            java.lang.StringBuilder r14 = X.AnonymousClass001.A0o()
            android.content.Context r13 = r4.A00
            r11 = 2131888816(0x7f120ab0, float:1.9412278E38)
            java.lang.Object[] r2 = new java.lang.Object[r15]
            X.5ZU r1 = r4.A03
            X.3Ex r15 = r4.A02
            X.3ZH r0 = r15.A0A(r0)
            X.C18290x4.A1K(r1, r0, r2)
            java.lang.String r0 = r13.getString(r11, r2)
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r12, r14)
            r7[r3] = r0
            r3 = r16
        L_0x0280:
            int r6 = r6 + 1
            goto L_0x0241
        L_0x0283:
            java.lang.String r1 = "_size"
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L_0x0280
            r8[r3] = r1
            int r11 = r3 + 1
            X.3Dh r1 = r4.A01
            java.lang.Object r0 = r9.second
            java.lang.String r0 = (java.lang.String) r0
            java.io.File r2 = r1.A0B()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)
            java.lang.String r0 = ".txt"
            java.io.File r0 = X.C64393Dh.A05(r2, r0, r1)
            long r0 = r0.length()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x02bf
        L_0x02ac:
            int r11 = r3 + 1
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            android.content.Context r1 = r4.A00
            r0 = 2131888817(0x7f120ab1, float:1.941228E38)
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r12, r2)
        L_0x02bf:
            r7[r3] = r0
            r3 = r11
            goto L_0x0280
        L_0x02c3:
            java.lang.String[] r2 = new java.lang.String[r3]
            r1 = 0
            java.lang.System.arraycopy(r8, r1, r2, r1, r3)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.System.arraycopy(r7, r1, r0, r1, r3)
            android.database.MatrixCursor r3 = new android.database.MatrixCursor
            r3.<init>(r2, r15)
            r3.addRow(r0)
            return r3
        L_0x02d7:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown URI "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0E(r6, r0, r1)
            throw r0
        L_0x02e2:
            java.lang.String r2 = "personal"
            X.3Dh r1 = r4.A01
            java.lang.String r0 = A07(r6)
            java.io.File r3 = r1.A0U(r0, r2)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            android.content.Context r1 = r4.A00
            r0 = 2131888768(0x7f120a80, float:1.941218E38)
            goto L_0x035b
        L_0x02f9:
            X.3Dh r0 = r4.A01
            java.lang.String r3 = A07(r6)
            X.2oU r0 = r0.A01
            java.io.File r1 = X.C54292oU.A02(r0)
            java.lang.String r0 = "support"
            java.io.File r2 = X.C64393Dh.A02(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)
            java.lang.String r0 = ".zip"
            java.io.File r1 = X.C64393Dh.A05(r2, r0, r1)
            java.lang.String r0 = "logs.zip"
            android.database.Cursor r3 = r4.A09(r6, r1, r0, r5)
            return r3
        L_0x031d:
            java.lang.String r2 = "business"
            X.3Dh r1 = r4.A01
            java.lang.String r0 = A07(r6)
            java.io.File r3 = r1.A0U(r0, r2)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            android.content.Context r1 = r4.A00
            r0 = 2131888759(0x7f120a77, float:1.9412162E38)
            goto L_0x035b
        L_0x0333:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Developer debug info asked in non debug build: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0E(r6, r0, r1)
            throw r0
        L_0x033e:
            X.3Dh r1 = r4.A01
            java.lang.String r0 = A07(r6)
            java.io.File r2 = r1.A0C()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)
            java.lang.String r0 = ".zip"
            java.io.File r3 = X.C64393Dh.A05(r2, r0, r1)
            r0 = 2131891062(0x7f121376, float:1.9416833E38)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            android.content.Context r1 = r4.A00
        L_0x035b:
            X.AnonymousClass0x2.A0s(r1, r2, r0)
            java.lang.String r0 = ".zip"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r2)
        L_0x0364:
            android.database.Cursor r3 = r4.A09(r6, r3, r0, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contentprovider.MediaProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("com.whatsapp");
        A0B = AnonymousClass000.A0X(".provider.media", A0o);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("vnd.android.cursor.dir/vnd.");
        A0o2.append("com.whatsapp");
        A0C = AnonymousClass000.A0X(".provider.media.buckets", A0o2);
    }

    public static int A03(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Invalid mode: ");
        throw AnonymousClass000.A0F(str, A0o);
    }

    public static Uri A05(C55682qk r4, C48042eF r5, C30471mV r6) {
        File A012 = C30471mV.A01(r6);
        C626936e.A06(A012);
        String A0Y = C18280x3.A0Y();
        r5.A01(A0Y, A012.getAbsolutePath(), AnonymousClass29L.A00(r4, r6), A012.getName());
        return C18530xp.A00().appendPath("item").appendEncodedPath(A0Y).build();
    }

    public static Uri A06(String str, String str2) {
        return C18290x4.A0H(C18530xp.A00().appendPath(str), PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
    }

    public final Cursor A09(Uri uri, File file, String str, String[] strArr) {
        int i;
        try {
            A0A(uri, file);
            if (strArr == null) {
                strArr = A0E;
            }
            String[] strArr2 = new String[r7];
            Object[] objArr = new Object[r7];
            int i2 = 0;
            for (String str2 : strArr) {
                if ("_display_name".equals(str2)) {
                    strArr2[i2] = "_display_name";
                    i = i2 + 1;
                    objArr[i2] = str;
                } else if ("_size".equals(str2)) {
                    strArr2[i2] = "_size";
                    i = i2 + 1;
                    AnonymousClass000.A1Q(objArr, i2, file.length());
                }
                i2 = i;
            }
            String[] strArr3 = new String[i2];
            System.arraycopy(strArr2, 0, strArr3, 0, i2);
            Object[] objArr2 = new Object[i2];
            System.arraycopy(objArr, 0, objArr2, 0, i2);
            MatrixCursor matrixCursor = new MatrixCursor(strArr3, 1);
            matrixCursor.addRow(objArr2);
            return matrixCursor;
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final void A0A(Uri uri, File file) {
        if (!file.exists()) {
            throw C18330xA.A05(AnonymousClass000.A0P(uri, "File not found for uri: ", AnonymousClass001.A0o()));
        } else if (file.lastModified() < this.A05.A0H() - 3600000) {
            file.delete();
            throw C18330xA.A05(AnonymousClass000.A0P(uri, "File expired for uri: ", AnonymousClass001.A0o()));
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        A08();
        throw C18320x8.A0m();
    }

    public String getType(Uri uri) {
        Cursor A0E2;
        String str;
        A08();
        switch (A04().match(uri)) {
            case 1:
                return A0C;
            case 2:
                return A0D;
            case 3:
                C48042eF r0 = this.A07;
                String lastPathSegment = uri.getLastPathSegment();
                AnonymousClass4GK A0B2 = r0.A00.get();
                try {
                    C56862sg r4 = ((AnonymousClass3H0) A0B2).A03;
                    String[] A1a = C18300x5.A1a(lastPathSegment, 2);
                    C18270x1.A1R(A1a, System.currentTimeMillis());
                    A0E2 = r4.A0E("SELECT mime_type FROM shared_media_ids WHERE item_uuid =?AND expiration_timestamp >?", "SharedMediaIdsStore/getMimeTypeByUUID", A1a);
                    if (!A0E2.moveToNext()) {
                        A0E2.close();
                        A0B2.close();
                        str = null;
                    } else {
                        str = AnonymousClass0x2.A0Z(A0E2, "mime_type");
                        A0E2.close();
                        A0B2.close();
                    }
                    if (str == null) {
                        return "application/octet-stream";
                    }
                    return str;
                } catch (Throwable th) {
                    try {
                        A0B2.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
            case 13:
                return "application/zip";
            case 5:
            case 12:
                return "text/plain";
            case 8:
                return "image/jpeg";
            default:
                throw AnonymousClass000.A0E(uri, "Unknown URI ", AnonymousClass001.A0o());
        }
        throw th;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        A08();
        throw C18320x8.A0m();
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        File file;
        String str2;
        byte[] A092;
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        int i;
        File file2;
        A08();
        switch (A04().match(uri)) {
            case 3:
                A08();
                int A032 = A03(str);
                String A002 = this.A07.A00(uri.getLastPathSegment());
                if (A002 != null) {
                    file2 = AnonymousClass002.A0B(A002);
                } else {
                    file2 = null;
                }
                if (file2 != null) {
                    try {
                        this.A09.A04(file2);
                        ParcelFileDescriptor open = ParcelFileDescriptor.open(file2, A032);
                        try {
                            this.A09.A02(open);
                            return open;
                        } catch (IOException e) {
                            C18260x0.A0k(uri, "mediaprovider/ parcel file descriptor is not external for uri: ", AnonymousClass001.A0o(), e);
                            throw new FileNotFoundException();
                        }
                    } catch (IOException e2) {
                        C18260x0.A0k(uri, "mediaprovider/ file is not external for uri: ", AnonymousClass001.A0o(), e2);
                        throw new FileNotFoundException();
                    }
                } else {
                    C18260x0.A1Q(AnonymousClass001.A0o(), "mediaprovider/openMessageFile no file found for uri: ", uri);
                    throw new FileNotFoundException();
                }
            case 4:
            case 13:
                String queryParameter = uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                if (queryParameter != null) {
                    file = C64393Dh.A05(this.A01.A0C(), ".zip", AnonymousClass000.A0l(queryParameter));
                    break;
                } else {
                    throw C18330xA.A05(AnonymousClass000.A0P(uri, "File not found for uri: ", AnonymousClass001.A0o()));
                }
            case 5:
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    file = C64393Dh.A05(this.A01.A0B(), ".txt", AnonymousClass000.A0l(lastPathSegment));
                    break;
                } else {
                    throw C18330xA.A05(AnonymousClass000.A0P(uri, "File not found for uri: ", AnonymousClass001.A0o()));
                }
            case 6:
                str2 = "personal";
                break;
            case 7:
                String queryParameter2 = uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                if (queryParameter2 != null) {
                    file = C64393Dh.A05(C64393Dh.A02(C54292oU.A02(this.A01.A01), "export_business_activity"), ".zip", AnonymousClass000.A0l(queryParameter2));
                    break;
                } else {
                    throw C18330xA.A05(AnonymousClass000.A0P(uri, "File not found for uri: ", AnonymousClass001.A0o()));
                }
            case 8:
                A08();
                if (str.equals("r")) {
                    String lastPathSegment2 = uri.getLastPathSegment();
                    if (lastPathSegment2 != null) {
                        String A003 = this.A07.A00(lastPathSegment2);
                        if (!TextUtils.isEmpty(A003)) {
                            try {
                                C624134x A004 = C55122pp.A00(this.A08, Long.parseLong(A003));
                                if (A004 == null) {
                                    C18260x0.A1Q(AnonymousClass001.A0o(), "Failed to get message for uri - ", uri);
                                    throw new FileNotFoundException();
                                } else if (A004 instanceof C30791n7) {
                                    C614630w A0y = A004.A0y();
                                    if (A0y != null) {
                                        if (A0y.A08() != null) {
                                            A092 = A0y.A08();
                                        } else {
                                            if (A0y.A06()) {
                                                A092 = A0y.A09();
                                            }
                                            Log.e("Message thumbnail has empty bytes");
                                            throw new FileNotFoundException();
                                        }
                                        if (A092 != null) {
                                            try {
                                                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                                                try {
                                                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                                                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(A092, 0, A092.length);
                                                    if (decodeByteArray != null) {
                                                        if (A004 instanceof AnonymousClass4DV) {
                                                            C626936e.A06(A004);
                                                            AnonymousClass39W A0Y = AnonymousClass0x9.A0Y(A004);
                                                            if (A0Y != null && ((i = A0Y.A00) == 2 || i == 6)) {
                                                                FilterUtils.blurNative(decodeByteArray, 5, 2);
                                                            }
                                                        }
                                                        decodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, autoCloseOutputStream);
                                                        decodeByteArray.recycle();
                                                        autoCloseOutputStream.flush();
                                                        autoCloseOutputStream.close();
                                                        return createPipe[0];
                                                    }
                                                    Log.e("Can't decode thumbnail bytes");
                                                    throw new FileNotFoundException();
                                                } catch (Exception unused) {
                                                    ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                                                    if (parcelFileDescriptor != null) {
                                                        try {
                                                            parcelFileDescriptor.close();
                                                        } catch (IOException unused2) {
                                                        }
                                                    }
                                                    throw new FileNotFoundException();
                                                } catch (Throwable th) {
                                                    th.addSuppressed(th);
                                                    break;
                                                }
                                            } catch (IOException e3) {
                                                Log.e("Failed to create parcel file descriptor pipe", e3);
                                                throw new FileNotFoundException();
                                            }
                                        }
                                        Log.e("Message thumbnail has empty bytes");
                                        throw new FileNotFoundException();
                                    }
                                    Log.e("Message has null thumbnail");
                                    throw new FileNotFoundException();
                                } else {
                                    Log.e("Message is not allowed type for getting thumbnail");
                                    throw new FileNotFoundException();
                                }
                            } catch (NumberFormatException unused3) {
                                C18260x0.A0r("Invalid message id format - ", A003, AnonymousClass001.A0o());
                                throw new FileNotFoundException();
                            }
                        } else {
                            C18260x0.A0r("Invalid record for uuid ", lastPathSegment2, AnonymousClass001.A0o());
                            throw new FileNotFoundException();
                        }
                    } else {
                        C18260x0.A1Q(AnonymousClass001.A0o(), "Failed to get uuid for uri - ", uri);
                        throw new FileNotFoundException();
                    }
                } else {
                    Log.e("Invalid access mode for openMessageThumbnail - only read allowed");
                    throw new FileNotFoundException();
                }
            case 9:
                throw new FileNotFoundException();
            case 10:
                String queryParameter3 = uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                if (queryParameter3 != null) {
                    file = C64393Dh.A05(C64393Dh.A02(C54292oU.A02(this.A01.A01), "support"), ".zip", AnonymousClass000.A0l(queryParameter3));
                    break;
                } else {
                    throw C18330xA.A05(AnonymousClass000.A0P(uri, "File not found for uri: ", AnonymousClass001.A0o()));
                }
            case 11:
                str2 = "business";
                break;
            case 12:
                throw new FileNotFoundException();
            default:
                throw new FileNotFoundException();
        }
        String queryParameter4 = uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (queryParameter4 != null) {
            file = this.A01.A0U(queryParameter4, str2);
            A0A(uri, file);
            return ParcelFileDescriptor.open(file, A03(str));
        }
        throw C18330xA.A05(AnonymousClass000.A0P(uri, "File not found for uri: ", AnonymousClass001.A0o()));
        throw th;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        A08();
        throw C18320x8.A0m();
    }
}
